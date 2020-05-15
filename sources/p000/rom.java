package p000;

import com.google.android.gms.common.Feature;

/* renamed from: rom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rom {

    /* renamed from: a */
    public roo f43443a;

    /* renamed from: b */
    public roo f43444b;

    /* renamed from: c */
    public rod f43445c;

    /* renamed from: d */
    public Feature[] f43446d;

    /* renamed from: e */
    private final Runnable f43447e = roj.f43440a;

    /* renamed from: a */
    public final ron mo24973a() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.f43443a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Must set register function");
        if (this.f43444b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34975b(z2, "Must set unregister function");
        if (this.f43445c == null) {
            z3 = false;
        }
        sdo.m34975b(z3, "Must set holder");
        rob rob = this.f43445c.f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        return new ron(new rok(this, this.f43445c, this.f43446d), new rol(this, rob), this.f43447e);
    }
}
