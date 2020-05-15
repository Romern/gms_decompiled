package p000;

import android.os.Bundle;

/* renamed from: aeaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeaf {

    /* renamed from: a */
    public final boolean f62983a;

    /* renamed from: b */
    private final boolean f62984b;

    public aeaf(aeae aeae) {
        this.f62984b = aeae.f62981a;
        this.f62983a = aeae.f62982b;
    }

    /* renamed from: a */
    public static aeaf m51513a(Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return new aeae().mo33977a();
        }
        aeae aeae = new aeae();
        aeae.f62981a = true;
        aeae.f62982b = bundle.getBoolean("a");
        return aeae.mo33977a();
    }

    /* renamed from: a */
    public final Bundle mo33978a() {
        Bundle bundle = new Bundle();
        if (this.f62984b) {
            bundle.putBoolean("a", this.f62983a);
        }
        return bundle;
    }
}
