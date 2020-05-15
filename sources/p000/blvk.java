package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: blvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blvk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f127869a;

    /* renamed from: b */
    final /* synthetic */ blvp f127870b;

    public blvk(blvp blvp, byte[] bArr) {
        this.f127870b = blvp;
        this.f127869a = bArr;
    }

    public final void run() {
        IOException iOException;
        int i = blvt.f127895c;
        new Object[1][0] = Arrays.toString(this.f127869a);
        this.f127870b.f127878b.setValue(this.f127869a);
        try {
            blvp blvp = this.f127870b;
            aysp aysp = blvp.f127877a;
            aysl aysl = blvp.f127879c;
            if (!aysp.f98423a.notifyCharacteristicChanged(aysl.f98419a, blvp.f127878b, true)) {
                iOException = new IOException("internal error notifying characteristic");
                blum blum = this.f127870b.f127880d;
                if (blum != null) {
                    blum.mo66701a(bluu.m107620a(iOException));
                }
            }
        } catch (RuntimeException e) {
            iOException = new IOException("exception thrown when notifying characteristic", e);
        }
    }
}
