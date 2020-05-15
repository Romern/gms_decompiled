package p000;

import android.os.Looper;

/* renamed from: ogg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ogg implements ofu {

    /* renamed from: a */
    final /* synthetic */ int f37551a;

    /* renamed from: b */
    final /* synthetic */ ogs f37552b;

    public ogg(ogs ogs, int i) {
        this.f37552b = ogs;
        this.f37551a = i;
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        synchronized (this.f37552b.f37580d) {
            this.f37552b.f37579c[this.f37551a] = null;
        }
    }

    /* renamed from: i */
    public final void mo22088i() {
        adzt adzt = new adzt(Looper.getMainLooper());
        ogr ogr = this.f37552b.f37591o;
        ogr.getClass();
        adzt.post(new ogf(ogr));
    }
}
