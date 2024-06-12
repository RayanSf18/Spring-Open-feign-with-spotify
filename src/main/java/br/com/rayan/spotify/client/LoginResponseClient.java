package br.com.rayan.spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginResponseClient {

                    private String accessToken;

                    public LoginResponseClient() {}

                    public LoginResponseClient(String accessToken) {
                                        this.accessToken = accessToken;
                    }

                    public String getAccessToken() {
                                        return accessToken;
                    }

                    public void setAccessToken(String accessToken) {
                                        this.accessToken = accessToken;
                    }
}
