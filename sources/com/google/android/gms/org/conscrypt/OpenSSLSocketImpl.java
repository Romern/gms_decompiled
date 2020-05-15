package com.google.android.gms.org.conscrypt;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class OpenSSLSocketImpl extends AbstractConscryptSocket {
    public OpenSSLSocketImpl() {
    }

    public /* bridge */ /* synthetic */ void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        super.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public /* bridge */ /* synthetic */ void bind(SocketAddress socketAddress) {
        super.bind(socketAddress);
    }

    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Deprecated
    public final byte[] getAlpnSelectedProtocol() {
        return SSLUtils.toProtocolBytes(getApplicationProtocol());
    }

    public /* bridge */ /* synthetic */ SocketChannel getChannel() {
        return super.getChannel();
    }

    public abstract byte[] getChannelId();

    public FileDescriptor getFileDescriptor$() {
        return super.getFileDescriptor$();
    }

    public abstract SSLSession getHandshakeSession();

    public String getHostname() {
        return super.getHostname();
    }

    public String getHostnameOrIP() {
        return super.getHostnameOrIP();
    }

    public /* bridge */ /* synthetic */ InetAddress getInetAddress() {
        return super.getInetAddress();
    }

    public /* bridge */ /* synthetic */ InputStream getInputStream() {
        return super.getInputStream();
    }

    public /* bridge */ /* synthetic */ boolean getKeepAlive() {
        return super.getKeepAlive();
    }

    public /* bridge */ /* synthetic */ InetAddress getLocalAddress() {
        return super.getLocalAddress();
    }

    public /* bridge */ /* synthetic */ int getLocalPort() {
        return super.getLocalPort();
    }

    public /* bridge */ /* synthetic */ SocketAddress getLocalSocketAddress() {
        return super.getLocalSocketAddress();
    }

    @Deprecated
    public final byte[] getNpnSelectedProtocol() {
        return super.getNpnSelectedProtocol();
    }

    public /* bridge */ /* synthetic */ boolean getOOBInline() {
        return super.getOOBInline();
    }

    public /* bridge */ /* synthetic */ OutputStream getOutputStream() {
        return super.getOutputStream();
    }

    public /* bridge */ /* synthetic */ int getReceiveBufferSize() {
        return super.getReceiveBufferSize();
    }

    public /* bridge */ /* synthetic */ SocketAddress getRemoteSocketAddress() {
        return super.getRemoteSocketAddress();
    }

    public /* bridge */ /* synthetic */ boolean getReuseAddress() {
        return super.getReuseAddress();
    }

    public /* bridge */ /* synthetic */ int getSendBufferSize() {
        return super.getSendBufferSize();
    }

    public /* bridge */ /* synthetic */ int getSoLinger() {
        return super.getSoLinger();
    }

    public int getSoWriteTimeout() {
        return super.getSoWriteTimeout();
    }

    public /* bridge */ /* synthetic */ boolean getTcpNoDelay() {
        return super.getTcpNoDelay();
    }

    public /* bridge */ /* synthetic */ int getTrafficClass() {
        return super.getTrafficClass();
    }

    public /* bridge */ /* synthetic */ boolean isBound() {
        return super.isBound();
    }

    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    public /* bridge */ /* synthetic */ boolean isConnected() {
        return super.isConnected();
    }

    public /* bridge */ /* synthetic */ boolean isInputShutdown() {
        return super.isInputShutdown();
    }

    public /* bridge */ /* synthetic */ boolean isOutputShutdown() {
        return super.isOutputShutdown();
    }

    public /* bridge */ /* synthetic */ void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        super.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Deprecated
    public final void setAlpnProtocols(byte[] bArr) {
        if (bArr == null) {
            bArr = EmptyArray.BYTE;
        }
        setApplicationProtocols(SSLUtils.decodeProtocols(bArr));
    }

    public abstract void setChannelIdEnabled(boolean z);

    public abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    public void setHandshakeTimeout(int i) {
        super.setHandshakeTimeout(i);
    }

    public void setHostname(String str) {
        super.setHostname(str);
    }

    public /* bridge */ /* synthetic */ void setKeepAlive(boolean z) {
        super.setKeepAlive(z);
    }

    @Deprecated
    public final void setNpnProtocols(byte[] bArr) {
    }

    public /* bridge */ /* synthetic */ void setPerformancePreferences(int i, int i2, int i3) {
        super.setPerformancePreferences(i, i2, i3);
    }

    public /* bridge */ /* synthetic */ void setReceiveBufferSize(int i) {
        super.setReceiveBufferSize(i);
    }

    public /* bridge */ /* synthetic */ void setReuseAddress(boolean z) {
        super.setReuseAddress(z);
    }

    public /* bridge */ /* synthetic */ void setSendBufferSize(int i) {
        super.setSendBufferSize(i);
    }

    public /* bridge */ /* synthetic */ void setSoLinger(boolean z, int i) {
        super.setSoLinger(z, i);
    }

    public void setSoWriteTimeout(int i) {
        super.setSoWriteTimeout(i);
    }

    public /* bridge */ /* synthetic */ void setTcpNoDelay(boolean z) {
        super.setTcpNoDelay(z);
    }

    public /* bridge */ /* synthetic */ void setTrafficClass(int i) {
        super.setTrafficClass(i);
    }

    public abstract void setUseSessionTickets(boolean z);

    public /* bridge */ /* synthetic */ void shutdownInput() {
        super.shutdownInput();
    }

    public /* bridge */ /* synthetic */ void shutdownOutput() {
        super.shutdownOutput();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public OpenSSLSocketImpl(String str, int i) {
        super(str, i);
    }

    @Deprecated
    public final void setAlpnProtocols(String[] strArr) {
        if (strArr == null) {
            strArr = EmptyArray.STRING;
        }
        setApplicationProtocols(strArr);
    }

    public OpenSSLSocketImpl(String str, int i, InetAddress inetAddress, int i2) {
        super(str, i, inetAddress, i2);
    }

    public OpenSSLSocketImpl(InetAddress inetAddress, int i) {
        super(inetAddress, i);
    }

    public OpenSSLSocketImpl(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        super(inetAddress, i, inetAddress2, i2);
    }

    public OpenSSLSocketImpl(Socket socket, String str, int i, boolean z) {
        super(socket, str, i, z);
    }
}
