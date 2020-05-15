package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: aiib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiib {

    /* renamed from: a */
    public final ExecutorService f68909a = adzl.f62962b.mo25879b(2);

    /* renamed from: b */
    public volatile InputStream f68910b = null;

    /* renamed from: c */
    public volatile boolean f68911c = false;

    /* renamed from: a */
    public static final void m57246a(OutputStream outputStream, boolean z, long j) {
        try {
            outputStream.write(z ? 1 : 0);
        } catch (IOException e) {
            Log.w("NearbyConnections", String.format("Unable to deliver status for Payload %d", Long.valueOf(j)), e);
        } catch (Throwable th) {
            srz.m36171a(outputStream);
            throw th;
        }
        srz.m36171a(outputStream);
    }
}
