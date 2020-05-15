package p000;

import com.google.android.gms.cast.CastDevice;

/* renamed from: pwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwq {

    /* renamed from: a */
    public final phy f40514a;

    /* renamed from: b */
    public final CastDevice f40515b;

    /* renamed from: c */
    public final int f40516c;

    /* renamed from: d */
    public String f40517d = "cast_rcn_unknown_application_id";

    public pwq(phy phy, CastDevice castDevice, int i) {
        this.f40514a = phy;
        this.f40515b = castDevice;
        this.f40516c = i;
    }

    /* renamed from: a */
    public final void mo23776a(int i) {
        phy phy = this.f40514a;
        phy.mo23118a(this.f40515b, (long) this.f40516c, phy.mo23146j(), i, this.f40517d);
    }

    /* renamed from: b */
    public final void mo23778b(int i) {
        phy phy = this.f40514a;
        phy.mo23137b(this.f40515b, (long) this.f40516c, phy.mo23146j(), this.f40517d, i);
    }

    /* renamed from: a */
    public final void mo23777a(bpfi bpfi) {
        phy phy = this.f40514a;
        phy.mo23121a(this.f40515b, (long) this.f40516c, phy.mo23146j(), this.f40517d, bpfi);
    }
}
