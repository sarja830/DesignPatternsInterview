public class WebAdapter {
    private WebService webService;

    public WebAdapter(WebService webService) {
        this.webService = webService;
    }

    public void request(String json) {
        webService.request(json);
    }


}
