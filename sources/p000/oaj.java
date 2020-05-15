package p000;

import android.os.Looper;
import android.os.Message;
import android.view.Surface;

/* renamed from: oaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oaj extends nvt {
    public oaj(oak oak, Looper looper) {
        super(oak, looper);
    }

    public final void handleMessage(Message message) {
        oak oak = (oak) mo21726f();
        if (oak != null) {
            int i = message.what;
            boolean z = false;
            int i2 = 1;
            if (i == 1) {
                Surface surface = (Surface) message.obj;
                if (oak.f37067n != 0) {
                    oak.f37067n = 0;
                    if (oak.f37068o) {
                        oak.f37057d.mo21226a(surface);
                    } else {
                        oak.f37069p = surface;
                    }
                }
            } else if (i == 2) {
                int i3 = message.arg1;
                if (i3 == 1) {
                    z = true;
                }
                if ((z && oak.f37067n == 1) || oak.f37067n == 2) {
                    oak.f37070q.release();
                    return;
                }
                if (i3 != 1) {
                    i2 = 2;
                }
                oak.f37067n = i2;
                if (oak.f37068o) {
                    oak.f37057d.mo21230a(z);
                    oak.f37070q.release();
                    return;
                }
                oak.f37070q.release();
            } else if (i != 3) {
                if (i == 4) {
                    oab oab = (oab) message.obj;
                    bmxy.m108581a(oab);
                    oak.f37058e.mo21766e(oab.f37025c);
                    oak.f37057d.mo21229a(oab);
                } else if (i != 5) {
                    bnsi d = oak.f37052a.mo68390d();
                    d.mo68432a("oaj", "handleMessage", 904, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68409a("unknown display event message%d", message.what);
                } else {
                    biwc biwc = (biwc) message.obj;
                    oak.f37057d.mo21234d();
                }
            } else if (!oak.f37068o) {
                oak.f37068o = true;
                if (oak.f37067n == 0) {
                    oak.f37057d.mo21226a(oak.f37069p);
                }
                if (oak.f37064k.mo21394e()) {
                    oak.mo21896e();
                }
            }
        }
    }
}
