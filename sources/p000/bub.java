package p000;

/* renamed from: bub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bub {

    /* renamed from: a */
    public final btz f5594a;

    /* renamed from: b */
    public final bqk f5595b;

    /* renamed from: c */
    public final buq f5596c;

    /* renamed from: d */
    public buk f5597d;

    /* renamed from: e */
    public final bwi f5598e;

    /* renamed from: f */
    public final bwd f5599f;

    static {
        bub.class.getSimpleName();
    }

    public bub(btz btz, bqk bqk, buq buq, bwi bwi) {
        this.f5594a = btz;
        this.f5595b = bqk;
        this.f5596c = buq;
        this.f5598e = bwi;
        bwd bwd = new bwd();
        this.f5599f = bwd;
        bwd.f5864i = "9000";
    }

    /* renamed from: a */
    public static void m3634a(bxi bxi, byte b, byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (bxi.mo3583b(bArr2)) {
                Object[] objArr = {bArr2, bxi.mo3582a(bArr2)};
                i++;
                int i2 = cbd.f6383a;
            } else {
                btu btu = btu.DATA_ELEMENT_MISSING;
                String a = cbm.m3893a(bArr2);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33);
                sb.append("Missing tag ");
                sb.append(a);
                sb.append(" in data for CVN ");
                sb.append((int) b);
                throw new btv(btu, sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo3502a() {
        bwi bwi = this.f5598e;
        if (bwi.f5879a == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        } else if (bwi.f5880b == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        } else if (bwi.f5881c == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        } else if (bwi.f5882d == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        } else if (bwi.f5883e == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        } else if (bwi.f5884f == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        } else if (bwi.f5885g == null) {
            throw new btv(btu.TRANSACTION_NOT_SUPPORTED, btu.TRANSACTION_NOT_SUPPORTED.f5588h);
        }
    }
}
