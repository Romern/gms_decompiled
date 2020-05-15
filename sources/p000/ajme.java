package p000;

import android.os.IBinder;

/* renamed from: ajme */
final /* synthetic */ class ajme implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final ajmt f70903a;

    /* renamed from: b */
    private final ajyz f70904b;

    public ajme(ajmt ajmt, ajyz ajyz) {
        this.f70903a = ajmt;
        this.f70904b = ajyz;
    }

    public final void binderDied() {
        ajmt ajmt = this.f70903a;
        ajyz ajyz = this.f70904b;
        akbo akbo = new akbo();
        akbo.mo39159a(ajyz);
        akbo.mo39160a(ajmt.f70934b);
        ajmt.mo38660a(akbo.f71558a);
    }
}
