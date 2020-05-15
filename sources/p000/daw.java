package p000;

import com.google.android.gms.ads.internal.clearcut.C0331f;
import com.google.android.gms.ads.internal.config.C0371o;

/* renamed from: daw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class daw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dax f12714a;

    public daw(dax dax) {
        this.f12714a = dax;
    }

    public final void run() {
        boolean z;
        if (this.f12714a.f12719d == null) {
            synchronized (dax.f12715b) {
                if (this.f12714a.f12719d == null) {
                    boolean z2 = false;
                    try {
                        z = ((Boolean) C0371o.f8197K.mo6621a()).booleanValue();
                    } catch (IllegalStateException e) {
                        z = false;
                    }
                    if (z) {
                        try {
                            dax.f12716c = new C0331f(this.f12714a.f12718a.f12765a, "ADSHIELD");
                        } catch (Throwable th) {
                        }
                    }
                    z2 = z;
                    this.f12714a.f12719d = Boolean.valueOf(z2);
                    dax.f12715b.open();
                }
            }
        }
    }
}
