public class WebClient {
    private IWebService webService;

    public WebClient(IWebService webService) {
        this.webService = webService;
    }

    public void doWork() {
        webService.request("{'key':'value'}");
    }
}
