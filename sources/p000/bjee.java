package p000;

import com.android.volley.VolleyLog;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* renamed from: bjee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjee implements SocketFactory {

    /* renamed from: a */
    public static final bjee f122574a = new bjee();

    public final Socket connectSocket(Socket socket, String str, int i, InetAddress inetAddress, int i2, HttpParams httpParams) {
        if (str == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        } else if (httpParams != null) {
            if (socket == null) {
                socket = createSocket();
            }
            if (inetAddress != null || i2 > 0) {
                if (i2 < 0) {
                    i2 = 0;
                }
                socket.bind(new InetSocketAddress(inetAddress, i2));
            }
            int connectionTimeout = HttpConnectionParams.getConnectionTimeout(httpParams);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                socket.connect(inetSocketAddress, connectionTimeout);
                VolleyLog.m4767v("Established connection to [host=%s] in [%s ms]", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return socket;
            } catch (SocketTimeoutException e) {
                String valueOf = String.valueOf(inetSocketAddress);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Connect to ");
                sb.append(valueOf);
                sb.append(" timed out");
                throw new ConnectTimeoutException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
    }

    public final Socket createSocket() {
        return new Socket();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return bjee.class.hashCode();
    }

    public final boolean isSecure(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        } else if (socket.getClass() != Socket.class) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        } else if (!socket.isClosed()) {
            return false;
        } else {
            throw new IllegalArgumentException("Socket is closed.");
        }
    }
}
