package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: caqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqr {

    /* renamed from: a */
    static final byte[] f175595a = catg.m127160a("325041592E5359532E4444463031");

    /* renamed from: b */
    public final cara f175596b;

    /* renamed from: c */
    public final int f175597c;

    /* renamed from: d */
    public final casb f175598d;

    /* renamed from: e */
    public final carz f175599e;

    /* renamed from: f */
    private final caos f175600f;

    /* renamed from: g */
    private final byte[] f175601g = this.f175598d.mo74801e();

    /* renamed from: h */
    private final byte[] f175602h;

    public caqr(caos caos, casa casa, cara cara) {
        this.f175600f = caos;
        casb casb = casa.f175729b;
        this.f175598d = casb;
        this.f175599e = casb.mo74804h();
        this.f175596b = cara;
        carz carz = this.f175599e;
        byte[] bArr = null;
        if (carz != null) {
            byte[] bArr2 = carz.f175726d;
            this.f175602h = bArr2 != null ? bArr2 : bArr;
        } else {
            this.f175602h = null;
        }
        byte[] bArr3 = this.f175600f.f175503b;
        this.f175597c = !m126988a(bArr3, f175595a) ? !m126988a(bArr3, this.f175601g) ? m126988a(bArr3, this.f175602h) ? 2 : 4 : 1 : 3;
    }

    /* renamed from: a */
    private static final boolean m126988a(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || !Arrays.equals(bArr, bArr2)) ? false : true;
    }

    /* renamed from: a */
    public final byte[] mo74770a(List list, byte[] bArr) {
        caot caot;
        caom caom;
        byte[] bArr2 = caot.f175504b;
        int length = bArr.length;
        if (length >= 3) {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            catj a = catj.m127172a(bArr3);
            if (a == null) {
                caot = new caot(bArr);
            } else {
                if (!list.isEmpty()) {
                    catj a2 = catj.m127172a(a.mo74844b(caot.f175504b));
                    if (a2 == null) {
                        caot = new caot(bArr);
                    } else {
                        catj a3 = catj.m127172a(a2.mo74844b(caot.f175505c));
                        if (a3 == null) {
                            caot = new caot(bArr);
                        } else {
                            caom a4 = caom.m126877a(a3.mo74844b(caot.f175506d));
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                caol caol = (caol) list.get(i);
                                a4.mo74727a(caol.f175462a, caol.f175463b);
                            }
                            a3.mo74841a(caot.f175506d, a4.mo74728b());
                            a2.mo74841a(caot.f175505c, a3.mo74842a());
                            a.mo74841a(caot.f175504b, a2.mo74842a());
                        }
                    }
                }
                caot = new caot(a);
            }
        } else {
            caot = null;
        }
        if (caot == null || (caom = caot.f175508f) == null) {
            throw new capk("Unable to build a valid SELECT R-APDU");
        }
        cara cara = this.f175596b;
        cara.f175642d.f175559k = caom;
        cara.f175650l = new carf(cara);
        return caot.f175449a;
    }
}
