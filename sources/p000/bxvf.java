package p000;

import java.util.Map;

/* renamed from: bxvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxvf extends bxvd implements bxvh, aywv {
    public bxvf() {
        super(dco.f12865a);
    }

    /* renamed from: b */
    public final void mo74132b(bxvd bxvd) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bzcb bzcb = (bzcb) this.f164949b;
        byzo byzo = (byzo) bxvd.mo74062i();
        bzcb bzcb2 = bzcb.f169293b;
        byzo.getClass();
        if (!bzcb.f169295a.mo73666a()) {
            bzcb.f169295a = bxvk.m124021a(bzcb.f169295a);
        }
        bzcb.f169295a.add(byzo);
    }

    /* renamed from: c */
    public final void mo74035c() {
        super.mo74035c();
        bxvg bxvg = (bxvg) this.f164949b;
        bxvg.f164952m = bxvg.f164952m.clone();
    }

    /* renamed from: n */
    public final bxvg mo74057h() {
        if (this.f164950c) {
            return (bxvg) this.f164949b;
        }
        ((bxvg) this.f164949b).f164952m.mo73914b();
        return (bxvg) super.mo74057h();
    }

    /* renamed from: a */
    public final void mo74125a(bxuq bxuq, Object obj) {
        Map map = bxvk.f164959aj;
        bxvj bxvj = (bxvj) bxuq;
        if (bxvj.f164955a == this.f164948a) {
            if (this.f164950c) {
                mo74035c();
                this.f164950c = false;
            }
            bxux bxux = ((bxvg) this.f164949b).f164952m;
            if (bxux.f164883b) {
                bxux = bxux.clone();
                ((bxvg) this.f164949b).f164952m = bxux;
            }
            bxvi bxvi = bxvj.f164958d;
            if (bxvi.mo74137a() == bxzg.ENUM) {
                obj = Integer.valueOf(((bxvp) obj).mo3214a());
            }
            bxux.mo73908a(bxvi, obj);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public bxvf(bxvg bxvg) {
        super(bxvg);
    }

    /* renamed from: b */
    public final void mo74133b(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        bzcn bzcn = (bzcn) this.f164949b;
        bzcn bzcn2 = bzcn.f169375h;
        if (!bzcn.f169381e.mo73666a()) {
            bzcn.f169381e = bxvk.m124021a(bzcn.f169381e);
        }
        bxsy.m123078a(iterable, bzcn.f169381e);
    }

    /* renamed from: a */
    public final void mo74126a(bxvd bxvd) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byzf byzf = (byzf) this.f164949b;
        byzh byzh = (byzh) bxvd.mo74062i();
        byzf byzf2 = byzf.f169070b;
        byzh.getClass();
        byzf.mo74513e();
        byzf.f169072a.add(byzh);
    }

    /* renamed from: a */
    public final void mo74127a(byys byys) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byzr byzr = (byzr) this.f164949b;
        byzr byzr2 = byzr.f169150h;
        byys.getClass();
        if (!byzr.f169155d.mo73666a()) {
            byzr.f169155d = bxvk.m124021a(byzr.f169155d);
        }
        byzr.f169155d.add(byys);
    }

    /* renamed from: a */
    public final void mo74128a(cagj cagj) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        cagi cagi = (cagi) this.f164949b;
        cagi cagi2 = cagi.f173096t;
        cagj.getClass();
        if (!cagi.f173105h.mo73666a()) {
            cagi.f173105h = bxvk.m124021a(cagi.f173105h);
        }
        cagi.f173105h.add(cagj);
    }

    /* renamed from: a */
    public final void mo74129a(Iterable iterable) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byzr byzr = (byzr) this.f164949b;
        byzr byzr2 = byzr.f169150h;
        byzr.mo74514e();
        bxsy.m123078a(iterable, byzr.f169153b);
    }

    /* renamed from: a */
    public final void mo74130a(String str) {
        if (this.f164950c) {
            mo74035c();
            this.f164950c = false;
        }
        byzr byzr = (byzr) this.f164949b;
        byzr byzr2 = byzr.f169150h;
        str.getClass();
        byzr.mo74514e();
        byzr.f169153b.add(str);
    }

    /* renamed from: a */
    public final boolean mo74131a(bxuq bxuq) {
        bxvg bxvg = (bxvg) this.f164949b;
        Map map = bxvk.f164959aj;
        bxvj bxvj = (bxvj) bxuq;
        bxvg.mo74135a(bxvj);
        return bxvg.f164952m.mo73911a(bxvj.f164958d);
    }
}
