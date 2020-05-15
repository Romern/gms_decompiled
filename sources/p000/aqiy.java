package p000;

import android.os.Bundle;

/* renamed from: aqiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqiy implements aqiw {

    /* renamed from: a */
    private Bundle f86186a;

    /* renamed from: b */
    private final Bundle f86187b;

    public aqiy(Bundle bundle) {
        this.f86187b = bundle;
        Bundle bundle2 = bundle.getBundle("checkbox_state");
        this.f86186a = bundle2;
        if (bundle2 == null) {
            this.f86186a = new Bundle();
        }
    }

    /* renamed from: a */
    public final void mo47898a() {
        this.f86187b.putBundle("checkbox_state", this.f86186a);
    }

    /* renamed from: b */
    public final boolean mo47901b(String str, boolean z) {
        return this.f86186a.getBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo47899a(String str, boolean z) {
        this.f86186a.putBoolean(str, z);
    }

    /* renamed from: b */
    public final byte[] mo47902b() {
        return this.f86186a.getByteArray("sessionToken");
    }

    /* renamed from: a */
    public final void mo47900a(byte[] bArr) {
        this.f86186a.putByteArray("sessionToken", bArr);
    }
}
