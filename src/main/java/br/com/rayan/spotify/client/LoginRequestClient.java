package br.com.rayan.spotify.client;

import feign.form.FormProperty;

public class LoginRequestClient {

                    @FormProperty("grant_type")
                    private String grantType;

                    @FormProperty("client_id")
                    private String clientId;

                    @FormProperty("client_secret")
                    private String clientSecret;

                    public LoginRequestClient() {}

                    public LoginRequestClient(String grantType, String clientId, String clientSecret) {
                                        this.grantType = grantType;
                                        this.clientId = clientId;
                                        this.clientSecret = clientSecret;
                    }

                    public String getGrantType() {
                                        return grantType;
                    }

                    public void setGrantType(String grantType) {
                                        this.grantType = grantType;
                    }

                    public String getClientId() {
                                        return clientId;
                    }

                    public void setClientId(String clientId) {
                                        this.clientId = clientId;
                    }

                    public String getClientSecret() {
                                        return clientSecret;
                    }

                    public void setClientSecret(String clientSecret) {
                                        this.clientSecret = clientSecret;
                    }
}



