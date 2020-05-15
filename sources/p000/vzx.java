package p000;

import com.google.android.gms.common.internal.ClientContext;

/* renamed from: vzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzx {

    /* renamed from: a */
    public final vzw f50303a;

    /* renamed from: b */
    public final ClientContext f50304b;

    /* renamed from: c */
    public final blcf f50305c;

    /* renamed from: d */
    public blce f50306d;

    public vzx(vzw vzw, ClientContext clientContext, bxuq bxuq, bxxc bxxc) {
        this.f50303a = vzw;
        this.f50304b = clientContext;
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
        this.f50305c = (blcf) da.mo74062i();
    }

    /* renamed from: a */
    public final bxxc mo29001a(bxuq bxuq) {
        blce blce = this.f50306d;
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
}
