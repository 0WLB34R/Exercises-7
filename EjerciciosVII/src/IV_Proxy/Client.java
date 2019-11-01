package IV_Proxy;

public class Client {
	public static void main(String[] args) {
		ISubject proxyServer = new ProxyServer();
		proxyServer.descarga();
		proxyServer.descarga();
		proxyServer.carga(File.Zip);
		proxyServer.carga(File.Txt);
	}
}
