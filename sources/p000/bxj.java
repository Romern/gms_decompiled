package p000;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: bxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bxj implements bxi {

    /* renamed from: d */
    public bpl f5980d;

    public bxj() {
        this.f5980d = null;
        this.f5980d = new bpl();
    }

    /* renamed from: a */
    public final void mo3584a(bpl bpl) {
        bpl bpl2 = this.f5980d;
        if (bpl != null) {
            Iterator it = bpl.iterator();
            LinkedList<bpc> linkedList = new LinkedList();
            while (it.hasNext()) {
                bpc bpc = (bpc) it.next();
                bpc b = bpl2.mo3369b(bpc.mo3349a());
                if (b != null) {
                    b.mo3354b(bpc);
                } else {
                    linkedList.add(bpc.mo3357d());
                }
            }
            for (bpc bpc2 : linkedList) {
                bpl2.mo3367a(bpc2);
            }
            return;
        }
        throw new IllegalArgumentException("The provided template is null");
    }

    /* renamed from: b */
    public final boolean mo3583b(byte[] bArr) {
        return bxk.m3774b(this.f5980d, bArr);
    }

    /* renamed from: f */
    public bzy mo3481f() {
        if (mo3583b(bzy.f6303a)) {
            return new bzy(mo3582a(bzy.f6303a));
        }
        return null;
    }

    /* renamed from: i */
    public final byte[] mo3587i() {
        return this.f5980d.mo3368a();
    }

    /* renamed from: j */
    public final caj mo3588j() {
        if (mo3583b(caj.f6358a)) {
            return new caj(mo3582a(caj.f6358a));
        }
        return null;
    }

    /* renamed from: k */
    public final cad mo3589k() {
        if (mo3583b(cad.f6325a)) {
            return new cad(mo3582a(cad.f6325a));
        }
        return null;
    }

    /* renamed from: l */
    public final caf mo3590l() {
        if (mo3583b(caf.f6337a)) {
            return new caf(mo3582a(caf.f6337a));
        }
        return null;
    }

    /* renamed from: m */
    public final cah mo3591m() {
        if (mo3583b(cah.f6348a)) {
            return new cah(mo3582a(cah.f6348a));
        }
        return null;
    }

    /* renamed from: n */
    public final cai mo3592n() {
        if (mo3583b(cai.f6353a)) {
            return new cai(mo3582a(cai.f6353a));
        }
        return null;
    }

    /* renamed from: o */
    public final cae mo3593o() {
        if (mo3583b(cae.f6331a)) {
            return new cae(mo3582a(cae.f6331a));
        }
        return null;
    }

    /* renamed from: p */
    public final bwl mo3594p() {
        return new bwl(mo3582a(bwl.f5899a));
    }

    /* renamed from: q */
    public final bwk mo3595q() {
        return new bwk(mo3582a(bwk.f5890a));
    }

    /* renamed from: r */
    public final bwm mo3596r() {
        return new bwm(mo3582a(bwm.f5905a));
    }

    public final String toString() {
        return String.valueOf(this.f5980d);
    }

    /* renamed from: w */
    public bzz mo3482w() {
        if (mo3583b(bzz.f6308a)) {
            return new bzz(mo3582a(bzz.f6308a));
        }
        return null;
    }

    /* renamed from: x */
    public cag mo3483x() {
        if (mo3583b(cag.f6343c)) {
            return new cag(mo3582a(cag.f6343c));
        }
        return null;
    }

    public bxj(byte[] bArr) {
        this.f5980d = null;
        this.f5980d = bpk.m3439b(bArr);
    }

    /* renamed from: a */
    public final void mo3585a(bwz bwz) {
        bpl bpl = this.f5980d;
        bpc a = bpl.mo3366a(bpk.m3440c(bwz.f5929k.f6274b));
        if (a == null) {
            bpl.mo3367a(bpk.m3438a(bwz.f5929k.f6274b, bwz.mo3563i()));
        } else {
            a.mo3353a(bwz.mo3563i());
        }
    }

    /* renamed from: a */
    public final byte[] mo3586a(bpo bpo) {
        return bxk.m3775b(this.f5980d, bpo);
    }

    /* renamed from: a */
    public final byte[] mo3582a(byte[] bArr) {
        return bxk.m3773a(this.f5980d, bArr);
    }
}
