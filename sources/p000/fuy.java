package p000;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: fuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fuy {

    /* renamed from: a */
    private final fux f17318a;

    /* renamed from: b */
    private final ClientContext f17319b;

    /* renamed from: c */
    private final blcf f17320c;

    /* renamed from: d */
    private blce f17321d;

    public fuy(fux fux, ClientContext clientContext, bxuq bxuq, bxxc bxxc) {
        this.f17318a = fux;
        this.f17319b = clientContext;
        bxvd da = blcf.f125916d.mo74144da();
        bxvf bxvf = (bxvf) blcc.f125904a.mo74144da();
        bxvf.mo74125a(bxuq, bxxc);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blcf blcf = (blcf) da.f164949b;
        blcc blcc = (blcc) bxvf.mo74062i();
        blcc.getClass();
        blcf.f125920c = blcc;
        blcf.f125918a |= 2;
        int a = bxuq.mo73900a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blcf blcf2 = (blcf) da.f164949b;
        blcf2.f125918a |= 1;
        blcf2.f125919b = a;
        this.f17320c = (blcf) da.mo74062i();
    }

    /* renamed from: a */
    public final bxxc mo11376a(bxuq bxuq) {
        blce blce = this.f17321d;
        if (blce == null || (blce.f125912a & 1) == 0) {
            return null;
        }
        blcd blcd = blce.f125913b;
        if (blcd == null) {
            blcd = blcd.f125907a;
        }
        bxvj bxvj = (bxvj) bxuq;
        blcd.mo74135a(bxvj);
        Object b = blcd.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        return (bxxc) b;
    }

    /* renamed from: b */
    public final void mo11378b() {
        fux fux = this.f17318a;
        ClientContext clientContext = this.f17319b;
        blcf blcf = this.f17320c;
        String str = clientContext.f30216f;
        this.f17321d = (blce) fux.f17317a.mo25516a(fux.m12444a(), blcf.serializeToBytes(), blce.f125910d, str, spn.m35895h(fux.f17317a.f44453i, str));
    }

    /* renamed from: c */
    public final boolean mo11379c() {
        blce blce = this.f17321d;
        return (blce == null || (blce.f125912a & 2) == 0) ? false : true;
    }

    /* renamed from: d */
    public final String mo11380d() {
        blce blce = this.f17321d;
        if (blce == null || (blce.f125912a & 2) == 0) {
            return null;
        }
        bxbg bxbg = blce.f125914c;
        if (bxbg == null) {
            bxbg = bxbg.f161808c;
        }
        return bxbg.f161811b;
    }

    /* renamed from: e */
    public final int mo11381e() {
        blce blce = this.f17321d;
        if (blce == null || (blce.f125912a & 2) == 0) {
            return 0;
        }
        bxbg bxbg = blce.f125914c;
        if (bxbg == null) {
            bxbg = bxbg.f161808c;
        }
        return bxbg.f161810a;
    }

    /* renamed from: a */
    public final void mo11377a() {
        fux fux = this.f17318a;
        this.f17321d = (blce) fux.f17317a.mo25513a(this.f17319b, 1, fux.m12444a(), this.f17320c.serializeToBytes(), blce.f125910d);
    }
}
