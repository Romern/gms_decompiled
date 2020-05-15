package p000;

/* renamed from: axzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axzk {

    /* renamed from: a */
    public final boolean f96821a;

    /* renamed from: b */
    public final axzf f96822b;

    /* renamed from: c */
    public final boolean f96823c;

    /* renamed from: d */
    public final String f96824d;

    private axzk(boolean z, axzf axzf, boolean z2, String str) {
        this.f96822b = axzf;
        this.f96821a = z;
        this.f96823c = z2;
        this.f96824d = str;
    }

    /* renamed from: a */
    static axzk m83598a(axzf axzf, boolean z) {
        sdo.m34959a(axzf);
        return new axzk(true, axzf, z, null);
    }

    /* renamed from: a */
    static axzk m83599a(String str) {
        sdo.m34959a((Object) str);
        return new axzk(false, null, false, str);
    }
}
