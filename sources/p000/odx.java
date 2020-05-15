package p000;

import android.os.IBinder;

/* renamed from: odx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odx implements IBinder.DeathRecipient {

    /* renamed from: a */
    int f37312a;

    /* renamed from: b */
    public int f37313b;

    /* renamed from: c */
    final /* synthetic */ ody f37314c;

    /* renamed from: d */
    public final nrx f37315d;

    public odx(ody ody, nrx nrx) {
        this.f37314c = ody;
        this.f37315d = nrx;
    }

    /* renamed from: a */
    public final void mo22035a() {
        this.f37315d.f12819a.unlinkToDeath(this, 0);
    }

    public final void binderDied() {
        int i = ody.f37316g;
        mo22035a();
        this.f37314c.mo22037a(this);
    }
}
