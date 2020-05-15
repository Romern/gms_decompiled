package p000;

import java.util.Currency;

/* renamed from: cata */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cata implements casy {

    /* renamed from: a */
    public final int f175803a;

    /* renamed from: b */
    private final Currency f175804b;

    /* renamed from: c */
    private final double f175805c;

    /* renamed from: d */
    private final double f175806d;

    /* renamed from: e */
    private final boolean f175807e;

    /* renamed from: f */
    private final int f175808f;

    /* renamed from: g */
    private final int f175809g;

    /* renamed from: h */
    private final int f175810h;

    /* renamed from: i */
    private final int f175811i;

    /* renamed from: j */
    private final int f175812j;

    public cata(byte[] bArr, byte[] bArr2, caoo caoo, caon caon) {
        int i;
        byte b = caoo.f175472h[0];
        byte[] bArr3 = caoo.f175467c;
        byte[] bArr4 = caoo.f175468d;
        byte[] bArr5 = caoo.f175478n;
        casi a = casi.m127086a(caoo.f175477m, casj.m127094a(caon));
        byte[] bArr6 = caoo.f175470f;
        this.f175808f = casw.m127118a(bArr);
        this.f175810h = catd.m127150a(b, bArr5, bArr3);
        int i2 = 2;
        if (!a.mo74813a()) {
            i = 2;
        } else {
            i = 1;
        }
        this.f175809g = i;
        this.f175811i = (a.mo74813a() || a.mo74815c()) ? 1 : (!a.mo74818f() || (a.f175764a[0] & 63) != 2) ? (!a.mo74818f() || (a.f175764a[0] & 63) != 30) ? a.mo74814b() ? 3 : 5 : 3 : 2;
        Currency a2 = catf.m127155a(bArr6);
        this.f175804b = a2;
        this.f175805c = catf.m127153a(bArr3, a2);
        this.f175806d = catf.m127156b(bArr4, this.f175804b);
        this.f175807e = a.mo74816d();
        if (caoo.f175481q || caoo.f175480p) {
            i2 = 1;
        } else if (!caoo.f175479o) {
            i2 = 3;
        }
        this.f175812j = i2;
        this.f175803a = casu.m127116a(caoo.f175469e, bArr2);
    }

    /* renamed from: a */
    public final Currency mo74829a() {
        return this.f175804b;
    }

    /* renamed from: b */
    public final double mo74830b() {
        return this.f175805c;
    }

    /* renamed from: c */
    public final boolean mo74831c() {
        return this.f175807e;
    }

    /* renamed from: d */
    public final int mo74832d() {
        return this.f175809g;
    }

    /* renamed from: e */
    public final int mo74833e() {
        return this.f175810h;
    }

    /* renamed from: f */
    public final int mo74834f() {
        return this.f175811i;
    }

    /* renamed from: g */
    public final int mo74835g() {
        return this.f175812j;
    }

    public final String toString() {
        Currency currency = this.f175804b;
        String currencyCode = currency != null ? currency.getCurrencyCode() : "null";
        String cls = cata.class.toString();
        String a = casw.m127119a(this.f175808f);
        String a2 = casx.m127120a(this.f175812j);
        String a3 = catc.m127149a(this.f175809g);
        String a4 = catd.m127151a(this.f175810h);
        String a5 = casv.m127117a(this.f175811i);
        double d = this.f175805c;
        double d2 = this.f175806d;
        boolean z = this.f175807e;
        int length = String.valueOf(cls).length();
        int length2 = a.length();
        int length3 = a2.length();
        int length4 = a3.length();
        StringBuilder sb = new StringBuilder(length + 249 + length2 + length3 + length4 + a4.length() + a5.length() + String.valueOf(currencyCode).length());
        sb.append(cls);
        sb.append("\n  Product Type: ");
        sb.append(a);
        sb.append("\n  Terminal Request: ");
        sb.append(a2);
        sb.append("\n  Transaction Range: ");
        sb.append(a3);
        sb.append("\n  Transaction Type: ");
        sb.append(a4);
        sb.append("\n  ExpectedUserActionOnPoi: ");
        sb.append(a5);
        sb.append("\n  Currency: ");
        sb.append(currencyCode);
        sb.append("\n  Authorized Amount: ");
        sb.append(d);
        sb.append("\n  Other Amount: ");
        sb.append(d2);
        sb.append("\n  Has Terminal Delegated CD CVM: ");
        sb.append(z);
        sb.append("\n");
        return sb.toString();
    }
}
