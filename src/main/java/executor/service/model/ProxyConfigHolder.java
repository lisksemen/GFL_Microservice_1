package executor.service.model;

public class ProxyConfigHolder{
    private ProxyNetworkConfig proxyNetworkConfig;
    private ProxyCredentials proxyCredentials;
    
    public ProxyConfigHolder{
        
    }
    
    public ProxyConfigHolder(ProxyNetworkConfig proxyNetworkConfig, ProxyCredentials proxyCredentials){
        this.proxyNetworkConfig = proxyNetworkConfig;
        this.proxyCredentials = proxyCredentials;
    }
    
    public void setProxyNetworkConfig(ProxyNetworkConfig proxyNetworkConfig){
        this.proxyNetworkConfig = proxyNetworkConfig;
    }
    public void setProxyCredentials(ProxyCredentials proxyCredentials){
        this.proxyCredentials = proxyCredentials;
    }
    
    public ProxyNetworkConfig getProxyNetworkConfig(){
        return proxyNetworkConfig;
    }
    
    public ProxyCredentials getProxyCredentials(){
        return proxyCredentials;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ProxyConfigHolder proxyConfHold = (ProxyConfigHolder) o;
        return Objects.equals(proxyNetworkConfig, proxyConfHold.proxyNetworkConfig) &&
            Objects.equals(proxyCredentails, proxyConfHold.proxyCredentails);
    }

    @Override
    public int hashCode(){
        return Objects.hash(proxyNetworkConfig, proxyCredentials);
    }

    @Override
    public String toString() {
        return '{' +
                "\"proxyNetworkConfig\"" + ':' + proxyNetworkConfig +
                "\"proxyCredentials\"" + ':' + proxyCredentials +
                '}';
    }
}