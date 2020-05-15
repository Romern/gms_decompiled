package p000;

import java.io.IOException;

/* renamed from: caus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caus implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cauz f176078a;

    public caus(cauz cauz) {
        this.f176078a = cauz;
    }

    public final void run() {
        synchronized (this.f176078a) {
            cauz cauz = this.f176078a;
            if (!(!cauz.f176101g) && !cauz.f176102h) {
                try {
                    cauz.mo74948e();
                    if (this.f176078a.mo74945c()) {
                        this.f176078a.mo74943b();
                        this.f176078a.f176099e = 0;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
