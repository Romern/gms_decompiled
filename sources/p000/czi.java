package p000;

import java.util.Map;

/* renamed from: czi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class czi implements cze {

    /* renamed from: a */
    protected final ctn f12439a;

    /* renamed from: b */
    protected final cty f12440b;

    /* renamed from: c */
    protected final Map f12441c;

    public czi(csn csn, cty cty) {
        this.f12439a = csn.f11918b;
        this.f12440b = cty;
        this.f12441c = csn.mo8219d();
    }

    /* renamed from: a */
    public czf mo8457a() {
        return czf.m7988a(new czg(), false);
    }

    /* renamed from: b */
    public final czf mo8459b() {
        return czf.m7987a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public csn mo8460c() {
        return new csn(this.f12439a, this.f12440b, this.f12441c);
    }

    /* renamed from: a */
    public final czf mo8458a(byte[] bArr) {
        return crz.m7431a(this.f12440b.f12049c.f12045c.mo8296a(), crn.m7413a(bArr), mo8460c());
    }
}
