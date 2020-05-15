package p000;

import android.os.Bundle;

/* renamed from: acyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyp {

    /* renamed from: a */
    public final Bundle f61084a;

    public acyp(Bundle bundle) {
        this.f61084a = new Bundle(bundle);
    }

    /* renamed from: a */
    public final acyq mo33244a() {
        return new acyq(this.f61084a);
    }

    /* renamed from: b */
    public final void mo33246b(bmxv bmxv) {
        this.f61084a.putString("title", (String) ((bmyg) bmxv).f131198a);
    }

    /* renamed from: a */
    public final void mo33245a(bmxv bmxv) {
        this.f61084a.putInt("theme", ((Integer) ((bmyg) bmxv).f131198a).intValue());
    }
}
