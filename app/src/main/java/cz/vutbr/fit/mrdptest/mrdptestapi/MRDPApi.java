package cz.vutbr.fit.mrdptest.mrdptestapi;

/**
 * Test API interface for using of mRDP protocol
 * @author Jiri Koudelka
 * @since 25.02.2018
 */
public interface MRDPApi {

    String locateResource(String resourceName);

    String identifyResource(String resource);
}
