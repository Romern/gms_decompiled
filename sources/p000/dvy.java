package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: dvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dvy {

    /* renamed from: a */
    public boolean f14229a = false;

    /* renamed from: b */
    public dwl f14230b;

    /* renamed from: c */
    private final dvz f14231c;

    /* renamed from: d */
    private final bxco f14232d;

    /* renamed from: e */
    private final dwj f14233e;

    /* renamed from: f */
    private dwk f14234f;

    /* renamed from: g */
    private dvq f14235g;

    /* renamed from: h */
    private drb f14236h;

    /* renamed from: i */
    private tlr f14237i;

    public dvy(String str, bxco bxco, dwj dwj, ContextManagerClientInfo contextManagerClientInfo) {
        this.f14231c = dvz.m9584a(contextManagerClientInfo, str);
        this.f14232d = bxco;
        sdo.m34959a(dwj);
        this.f14233e = dwj;
    }

    /* renamed from: a */
    public final dwa mo9734a() {
        sdo.m34975b(this.f14229a, "At least one of production, retention, or dispatch policy must be set.");
        bxvd da = bxcx.f163000i.mo74144da();
        bxco bxco = this.f14232d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcx bxcx = (bxcx) da.f164949b;
        bxcx.f163004c = bxco.f162973bD;
        int i = bxcx.f163002a | 2;
        bxcx.f163002a = i;
        bxcw bxcw = this.f14231c.f14238a;
        bxcw.getClass();
        bxcx.f163009h = bxcw;
        int i2 = i | 64;
        bxcx.f163002a = i2;
        dwk dwk = this.f14234f;
        if (dwk != null) {
            bxdf bxdf = dwk.f14274a;
            bxdf.getClass();
            bxcx.f163006e = bxdf;
            i2 |= 8;
            bxcx.f163002a = i2;
        }
        dwl dwl = this.f14230b;
        if (dwl != null) {
            bxdi bxdi = dwl.f14275a;
            bxdi.getClass();
            bxcx.f163007f = bxdi;
            i2 |= 16;
            bxcx.f163002a = i2;
        }
        dvq dvq = this.f14235g;
        if (dvq != null) {
            bxcv bxcv = dvq.f14209a;
            bxcv.getClass();
            bxcx.f163008g = bxcv;
            i2 |= 32;
            bxcx.f163002a = i2;
        }
        bxda bxda = this.f14233e.f14273a;
        bxda.getClass();
        bxcx.f163005d = bxda;
        bxcx.f163002a = i2 | 4;
        dwa dwa = new dwa((bxcx) da.mo74062i(), this.f14231c);
        drb drb = this.f14236h;
        if (drb != null) {
            tlr tlr = this.f14237i;
            sdo.m34959a(drb);
            dwa.f14243c = drb;
            sdo.m34959a(tlr);
            dwa.f14244d = tlr;
        }
        dvq dvq2 = this.f14235g;
        if (dvq2 != null) {
            dwa.f14245e = dvq2;
        }
        return dwa;
    }

    /* renamed from: a */
    public final void mo9735a(drb drb, tlr tlr) {
        sdo.m34959a(drb);
        this.f14236h = drb;
        if (tlr == null) {
            tlr = tlr.f46243d;
        }
        this.f14237i = tlr;
    }

    /* renamed from: a */
    public final void mo9736a(dvq dvq) {
        sdo.m34959a(dvq);
        this.f14235g = dvq;
        this.f14229a = true;
    }

    /* renamed from: a */
    public final void mo9737a(dwk dwk) {
        sdo.m34959a(dwk);
        this.f14234f = dwk;
        this.f14229a = true;
    }
}
