package p000;

import java.io.File;

/* renamed from: been */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class been {

    /* renamed from: a */
    public final beeo f111428a;

    /* renamed from: b */
    public final /* synthetic */ beeq f111429b;

    public been(beeq beeq, beeo beeo) {
        this.f111429b = beeq;
        this.f111428a = beeo;
    }

    /* renamed from: a */
    public final File mo60610a(int i) {
        File b;
        synchronized (this.f111429b) {
            beeo beeo = this.f111428a;
            if (beeo.f111433d == this) {
                b = beeo.mo60614b(i);
            } else {
                throw new IllegalStateException();
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo60611a() {
        this.f111429b.mo60618a(this, false);
    }
}
