package org.ziscloud.netty.http.client;

import com.google.common.base.Strings;
import com.mastfrog.url.HostAndPort;

/**
 * Created by tonywang on 6/15/16.
 */
public class Proxy {
    private final Protocol protocol;
    private final HostAndPort hostAndPort;
    private final String username;
    private final String password;
    private final boolean anonymous;

    public Proxy(Protocol protocol, HostAndPort hostAndPort, String username, String password) {
        this.protocol = protocol;
        this.hostAndPort = hostAndPort;
        this.username = username;
        this.password = password;
        this.anonymous = Strings.isNullOrEmpty(username);
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public String getHost() {
        return hostAndPort.host();
    }

    public int getPort() {
        return hostAndPort.port();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public enum Protocol {
        HTTP,
        HTTPS,
        SOCKET4,
        SOCKET5;

        Protocol() {
        }
    }
}
