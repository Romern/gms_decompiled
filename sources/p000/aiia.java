package p000;

import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: aiia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiia implements Runnable {

    /* renamed from: a */
    final /* synthetic */ InputStream f68904a;

    /* renamed from: b */
    final /* synthetic */ OutputStream f68905b;

    /* renamed from: c */
    final /* synthetic */ long f68906c;

    /* renamed from: d */
    final /* synthetic */ OutputStream f68907d;

    /* renamed from: e */
    final /* synthetic */ aiib f68908e;

    public aiia(aiib aiib, InputStream inputStream, OutputStream outputStream, long j, OutputStream outputStream2) {
        this.f68908e = aiib;
        this.f68904a = inputStream;
        this.f68905b = outputStream;
        this.f68906c = j;
        this.f68907d = outputStream2;
    }

    public final void run() {
        this.f68908e.f68910b = this.f68904a;
        boolean z = true;
        try {
            srz.m36169a(this.f68904a, this.f68905b, false, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            srz.m36171a((Closeable) this.f68904a);
            aiib.m57246a(this.f68907d, false, this.f68906c);
        } catch (IOException e) {
            if (!this.f68908e.f68911c) {
                Log.w("NearbyConnections", String.format("Exception copying stream for Payload %d", Long.valueOf(this.f68906c)), e);
            } else {
                new Object[1][0] = Long.valueOf(this.f68906c);
            }
            srz.m36171a((Closeable) this.f68904a);
            aiib.m57246a(this.f68907d, true, this.f68906c);
        } catch (Throwable th) {
            th = th;
            srz.m36171a((Closeable) this.f68904a);
            aiib.m57246a(this.f68907d, z, this.f68906c);
            srz.m36171a(this.f68905b);
            this.f68908e.f68910b = null;
            throw th;
        }
        srz.m36171a(this.f68905b);
        this.f68908e.f68910b = null;
    }
}
