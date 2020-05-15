package p000;

import android.os.IBinder;

/* renamed from: ajkk */
final /* synthetic */ class ajkk implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final ajmt f70801a;

    /* renamed from: b */
    private final ajyz f70802b;

    public ajkk(ajmt ajmt, ajyz ajyz) {
        this.f70801a = ajmt;
        this.f70802b = ajyz;
    }

    public final void binderDied() {
        ajmt ajmt = this.f70801a;
        ajyz ajyz = this.f70802b;
        akbm akbm = new akbm();
        akbm.mo39155a(ajyz);
        akbm.mo39156a(ajmt.f70934b);
        ajmt.mo38659a(akbm.f71557a);
    }
}
