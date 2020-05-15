package p000;

import android.os.Handler;

/* renamed from: nov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nov {

    /* renamed from: a */
    public final /* synthetic */ noy f36257a;

    public nov(noy noy) {
        this.f36257a = noy;
    }

    /* renamed from: a */
    public final void mo21364a() {
        bnsn bnsn = noy.f36261a;
        noy noy = this.f36257a;
        long j = noy.f36270j;
        noy.f36265e.post(new noq(this));
    }

    /* renamed from: b */
    public final void mo21367b() {
        noy noy = this.f36257a;
        bnsn bnsn = noy.f36261a;
        noy.f36265e.post(new nou(this));
    }

    /* renamed from: a */
    public final void mo21365a(int i, int i2) {
        if (ccpv.m131193b()) {
            bnsi c = noy.f36261a.mo68388c();
            c.mo68432a("nov", "a", 360, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68411a("Critical protocol error %d (%d)", i, i2);
            this.f36257a.f36265e.post(new not(this, i, i2));
        }
    }

    /* renamed from: a */
    public final void mo21366a(boolean z) {
        bnsn bnsn = noy.f36261a;
        if (z) {
            noy noy = this.f36257a;
            Handler handler = noy.f36265e;
            nox nox = noy.f36268h;
            nox.getClass();
            handler.post(new nor(nox));
            return;
        }
        this.f36257a.f36265e.post(new nos(this));
    }
}
