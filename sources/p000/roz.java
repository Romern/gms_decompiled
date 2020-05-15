package p000;

import com.google.android.gms.common.Feature;

/* renamed from: roz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class roz {

    /* renamed from: a */
    public roo f43472a;

    /* renamed from: b */
    public Feature[] f43473b;

    /* renamed from: c */
    private boolean f43474c = true;

    /* renamed from: a */
    public final rpa mo24977a() {
        boolean z;
        if (this.f43472a != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "execute parameter required");
        return new roy(this, this.f43473b, this.f43474c);
    }

    /* renamed from: b */
    public final void mo24979b() {
        this.f43474c = false;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo24978a(sqe sqe) {
        this.f43472a = new rox(sqe);
    }
}
