package p000;

import android.os.Bundle;

/* renamed from: gib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gib {

    /* renamed from: a */
    public final Bundle f18283a;

    public gib() {
        this(new Bundle());
    }

    /* renamed from: a */
    public final gic mo11900a() {
        return new gic(this.f18283a);
    }

    /* renamed from: a */
    public final void mo11901a(bsoa bsoa) {
        if (bsoa != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("keyTokenRequestOptionsWrapperBundle", bsoa.mo73642k());
            this.f18283a.putBundle("keyTokenRequestOptionsAuthExtrasBundle", bundle);
        }
    }

    public gib(Bundle bundle) {
        this.f18283a = bundle == null ? new Bundle() : bundle;
    }
}
