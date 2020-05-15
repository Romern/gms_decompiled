package p000;

/* renamed from: vdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vdy extends vdw {

    /* renamed from: e */
    private static final sbw f49101e = new sbw("CustomPropertyModel", "");

    /* renamed from: b */
    public final uif f49102b;

    /* renamed from: c */
    public final String f49103c;

    /* renamed from: d */
    public final String f49104d;

    public vdy(uhl uhl, uif uif, String str, String str2) {
        super(uhl);
        sdo.m34959a(uif);
        this.f49102b = uif;
        sdo.m34959a((Object) str);
        this.f49103c = str;
        this.f49104d = str2;
    }

    /* renamed from: a */
    public final void mo27414a(unq unq) {
        if (unq instanceof uje) {
            uje uje = (uje) unq;
            if (uje.f47761e.mo27683a() || uje.f47760d != null) {
                super.mo27414a(unq);
            } else if (!unq.f48336ao) {
                f49101e.mo25374b("CustomPropertyModel", "CustomProperty created and discarded without setting value. sdkAppId: %s", uje.f47758b);
            } else {
                super.mo27425b(unq);
            }
        } else {
            f49101e.mo25377c("CustomPropertyModel", "Can't save a non-CustomPropertyRow with CustomPropertyModel class.");
        }
    }
}
