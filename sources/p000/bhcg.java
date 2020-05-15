package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: bhcg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhcg {

    /* renamed from: c */
    public final Handler f118291c;

    /* renamed from: d */
    public final asfb f118292d;

    /* renamed from: e */
    public final Handler f118293e = new bhcf(this, this.f118291c.getLooper());

    public bhcg(Handler handler, asfb asfb) {
        this.f118291c = handler;
        this.f118292d = asfb;
    }

    /* renamed from: a */
    public final Looper mo63548a() {
        return this.f118291c.getLooper();
    }

    /* renamed from: a */
    public final boolean mo63549a(Runnable runnable) {
        asfb asfb = this.f118292d;
        if (asfb == null) {
            return this.f118291c.post(runnable);
        }
        asfb.mo49111a(60000);
        if (this.f118293e.post(runnable)) {
            return true;
        }
        if (!this.f118292d.mo49124e()) {
            return false;
        }
        this.f118292d.mo49120c();
        return false;
    }
}
