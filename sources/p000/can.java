package p000;

import java.util.Iterator;

/* renamed from: can */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class can extends cao {

    /* renamed from: b */
    public static final byte[] f6364b = cbm.m3896a("325041592E5359532E4444463031");

    protected can(cat cat) {
    }

    /* renamed from: a */
    public static boolean m3841a(byte[] bArr) {
        return m3842a(bArr, f6364b);
    }

    /* renamed from: b */
    private static bpc m3843b(byte[] bArr) {
        new Object[1][0] = cbm.m3895a(bArr, false);
        int i = cbd.f6383a;
        bpc a = bpk.m3437a(bArr);
        while (!a.mo3349a().mo3378b()) {
            try {
                byte[] e = a.mo3358e();
                int length = bArr.length;
                int length2 = e.length;
                int i2 = length - length2;
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, length2, bArr2, 0, i2);
                a = bpk.m3437a(bArr2);
            } catch (Exception e2) {
                new Object[1][0] = e2.getMessage();
                throw new bon("FCI Template is not correct.", bop.f5261a);
            }
        }
        return a;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ bol mo3487a(bxm bxm, bok bok) {
        throw null;
    }

    /* renamed from: a */
    public bys mo3491a(bxd bxd) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final byte[] mo3635c(bxm bxm, bys bys) {
        byte[] bArr;
        bxb d = bxm.f5984f.mo3578d();
        if (d.mo3423a()) {
            return d.mo3424b().mo3617k();
        }
        int i = cbd.f6383a;
        bpc a = bpk.m3436a(bpk.m3440c(boo.f5258b));
        bpc a2 = bpk.m3438a(byg.f6130a, f6364b);
        bpc a3 = bpk.m3436a(bpk.m3440c(byj.f6155a));
        bpc a4 = bpk.m3436a(bpk.m3440c(byi.f6147a));
        bpc a5 = bpk.m3436a(bpk.m3440c(byh.f6139a));
        a5.mo3351a(bpk.m3438a(boo.f5260d, mo3490a(bxm).mo3563i()));
        Iterator a6 = m3843b(bys.mo3617k()).mo3350a(bpk.m3440c(bxx.f6060a));
        byte[] bArr2 = null;
        if (a6.hasNext()) {
            bArr = ((bpc) a6.next()).mo3355b();
            new Object[1][0] = new String(bArr);
        } else {
            bArr = null;
        }
        if (bArr != null) {
            a5.mo3351a(bpk.m3438a(bxx.f6060a, bArr));
        }
        Iterator a7 = m3843b(bys.mo3617k()).mo3350a(bpk.m3440c(byo.f6193a));
        if (a7.hasNext()) {
            bArr2 = ((bpc) a7.next()).mo3355b();
            new Object[1][0] = bArr2;
        }
        if (bArr2 != null) {
            a5.mo3351a(bpk.m3438a(byo.f6193a, bArr2));
        }
        a4.mo3351a(a5);
        a3.mo3351a(a4);
        a.mo3351a(a2);
        a.mo3351a(a3);
        byte[] e = a.mo3358e();
        new Object[1][0] = cbm.m3893a(e);
        return e;
    }

    static {
        can.class.getSimpleName();
    }

    /* renamed from: a */
    protected static boolean m3842a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bok mo3486a(bok bok) {
        return new bok(bok.mo3333h());
    }

    /* renamed from: b */
    public final boo mo3634b(bxm bxm, bys bys) {
        return new boo(mo3635c(bxm, bys), bop.f5269i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boo mo3632a(bxm bxm, bys bys) {
        new Object[1][0] = bys.mo3616j();
        int i = cbd.f6383a;
        bpc a = bpk.m3436a(bpk.m3440c(boo.f5258b));
        a.mo3351a(mo3490a(bxm).mo3564j());
        a.mo3351a(bpk.m3439b(bys.mo3617k()).mo3369b(bpk.m3440c(boo.f5259c)));
        byte[] e = a.mo3358e();
        new Object[1][0] = e;
        return new boo(e, bop.f5269i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byg mo3490a(bxm bxm) {
        bzb bzb = (bzb) bxm.f5984f.mo3578d().mo3576c(bzb.f6239a);
        if (bzb != null) {
            byg byg = new byg(bzb.f6229e);
            if (byg.mo3563i() != null) {
                new Object[1][0] = byg;
                int i = cbd.f6383a;
                return byg;
            }
            throw new bon("Missing aid", bop.f5261a);
        }
        throw new bon("Missing DGI dedicated file name", bop.f5261a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo3633a(bxm bxm, byte[] bArr) {
        return m3842a(mo3490a(bxm).mo3563i(), bArr);
    }
}
