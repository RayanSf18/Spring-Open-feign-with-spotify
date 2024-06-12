package br.com.rayan.spotify.controller;

import br.com.rayan.spotify.client.Album;
import br.com.rayan.spotify.client.AlbumSpotifyClient;
import br.com.rayan.spotify.client.AuthSpotifyClient;
import br.com.rayan.spotify.client.LoginRequestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/spotify/albums")
public class AlbumController {

                    // ATTRIBUTES

                    @Value("${spotify.auth.crendential}")
                    private  String credential;

                    @Value("${spotify.auth.clientId}")
                    private String clientId;

                    @Value("${spotify.auth.clientSecret}")
                    private String clientSecret;

                    private final AuthSpotifyClient authSpotifyClient;

                    private final AlbumSpotifyClient albumSpotifyClient;

                    // CONSTRUCTOR

                    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
                                        this.authSpotifyClient = authSpotifyClient;
                                        this.albumSpotifyClient = albumSpotifyClient;
                    }

                    // ENDPOINTS

                    @GetMapping(value = "/albums-releases")
                    public ResponseEntity<List<Album>> getAlbumsReleases() {
                                        var request = new LoginRequestClient(credential, clientId, clientSecret);

                                        var token = authSpotifyClient.login(request).getAccessToken();
                                        var response = albumSpotifyClient.getReleases("Bearer  "  + token);

                                        return ResponseEntity.ok().body(response.getAlbums().getItems());
                    }

}
