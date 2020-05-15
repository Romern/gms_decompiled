package p000;

import java.io.IOException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.HttpContext;

/* renamed from: bjds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjds implements HttpRequestRetryHandler {
    public final boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        return false;
    }
}
