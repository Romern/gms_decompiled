package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: lxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lxu implements lyg {

    /* renamed from: a */
    private static final bnic f33169a = bnic.m109492a(chuv.f189219f, chuv.f189229p, chuv.f189228o, chuv.f189217d);

    /* renamed from: b */
    private final lyo f33170b;

    /* renamed from: c */
    private final lyj f33171c;

    /* renamed from: d */
    private final lxj f33172d;

    public lxu(Context context) {
        lxj lxj = new lxj(context);
        if (lyh.f33185a == null) {
            lyh.f33185a = new lyo(new shl(context, ccls.m130531j(), 443, context.getApplicationInfo().uid, 1029));
        }
        lyo lyo = lyh.f33185a;
        lyi lyi = new lyi();
        lyi.f33187b = Long.valueOf(ccls.f179387a.mo6606a().mo76346h());
        lyi.f33188c = Long.valueOf(ccls.f179387a.mo6606a().mo76345g());
        lyi.f33189d = Long.valueOf(ccls.f179387a.mo6606a().mo76339a());
        lyi.f33190e = new lxk();
        bnic bnic = f33169a;
        if (bnic != null) {
            lyi.f33186a = bnic;
            String str = lyi.f33186a == null ? " retriableStatuses" : "";
            str = lyi.f33187b == null ? str.concat(" maxNumberOfAttempts") : str;
            str = lyi.f33188c == null ? String.valueOf(str).concat(" initialBackoffMillis") : str;
            str = lyi.f33189d == null ? String.valueOf(str).concat(" networkRetryMaxFuzzMillis") : str;
            str = lyi.f33190e == null ? String.valueOf(str).concat(" clockWithSleep") : str;
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
            }
            lxi lxi = new lxi(lyi.f33186a, lyi.f33187b.longValue(), lyi.f33188c.longValue(), lyi.f33189d.longValue(), lyi.f33190e);
            this.f33172d = lxj;
            this.f33170b = lyo;
            this.f33171c = lxi;
            return;
        }
        throw new NullPointerException("Null retriableStatuses");
    }

    /* renamed from: a */
    public final bzob mo19734a(bzog bzog) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        return (bzob) lyj.mo19748a(a, bzog, new lxo(lyo));
    }

    /* renamed from: a */
    public final bzob mo19735a(bzol bzol) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        return (bzob) lyj.mo19748a(a, bzol, new lxn(lyo));
    }

    /* renamed from: a */
    public final bzoo mo19736a(bzon bzon) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        return (bzoo) lyj.mo19748a(a, bzon, new lxp(lyo));
    }

    /* renamed from: a */
    public final bzoq mo19737a(bzop bzop) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        return (bzoq) lyj.mo19748a(a, bzop, new lxl(lyo));
    }

    /* renamed from: a */
    public final void mo19738a(bzoe bzoe) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        lyj.mo19748a(a, bzoe, new lxm(lyo));
    }

    /* renamed from: a */
    public final void mo19739a(bzoh bzoh) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        lyj.mo19748a(a, bzoh, new lxs(lyo));
    }

    /* renamed from: a */
    public final void mo19740a(bzoi bzoi) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        lyj.mo19748a(a, bzoi, new lxq(lyo));
    }

    /* renamed from: a */
    public final void mo19741a(bzoj bzoj) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        lyj.mo19748a(a, bzoj, new lxr(lyo));
    }

    /* renamed from: a */
    public final void mo19742a(bzot bzot) {
        lyj lyj = this.f33171c;
        ClientContext a = this.f33172d.mo19732a();
        lyo lyo = this.f33170b;
        lyo.getClass();
        bzoc bzoc = (bzoc) lyj.mo19748a(a, bzot, new lxt(lyo));
    }
}
