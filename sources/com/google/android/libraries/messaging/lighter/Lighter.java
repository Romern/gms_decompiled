package com.google.android.libraries.messaging.lighter;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Lighter {

    /* renamed from: n */
    private static Lighter f111316n = null;

    /* renamed from: a */
    public final bcfx f111317a;

    /* renamed from: b */
    public final Context f111318b;

    /* renamed from: c */
    public final bbps f111319c;

    /* renamed from: d */
    public final bbpk f111320d;

    /* renamed from: e */
    public final bbph f111321e;

    /* renamed from: f */
    public final bbpg f111322f;

    /* renamed from: g */
    public final bbpf f111323g;

    /* renamed from: h */
    public final bbpm f111324h;

    /* renamed from: i */
    public final bbpj f111325i;

    /* renamed from: j */
    public final bbpv f111326j;

    /* renamed from: k */
    public final bbyw f111327k;

    /* renamed from: l */
    public final bdaw f111328l;

    /* renamed from: m */
    public final bdae f111329m;

    /* renamed from: o */
    private final bbpw f111330o;
    private final bboi optionalLighterPackageInitializer;

    /* renamed from: p */
    private final bcjm f111331p;

    /* renamed from: q */
    private final Map f111332q;

    /* renamed from: r */
    private final bbue f111333r;

    private Lighter(Context context, azbk azbk, azbs azbs, azbl azbl, bbpi bbpi, bboi bboi, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bmxv bmxv5) {
        bbxv bbxv;
        bboi bboi2 = bboi;
        Context applicationContext = context.getApplicationContext();
        this.f111318b = applicationContext;
        this.f111330o = bbpw.m88374a(applicationContext);
        bdyx.m91614a(this.f111318b);
        this.f111329m = new bcax(new bbyy(this.f111318b, bmxv));
        this.f111328l = new bcav(this.f111318b, bmxv4.mo66813a() ? (bdae) bmxv4.mo66814b() : this.f111329m);
        this.f111317a = bcfx.m88929a(this.f111318b);
        this.f111327k = new bbyw(this.f111318b, this.f111317a, bmxv5, bmxv2);
        this.f111332q = new HashMap();
        Context context2 = this.f111318b;
        bcel.m88873a();
        this.f111331p = new bcjm(context2, new bceq());
        bcky bcky = new bcky(this.f111331p, bbpw.m88374a(this.f111318b));
        bcku bcku = new bcku(this.f111331p, this.f111318b, this.f111332q);
        bckj bckj = new bckj(this.f111331p, this.f111318b);
        bcki bcki = new bcki(this.f111331p);
        new bckz(this.f111331p);
        this.f111333r = new bbue(this.f111318b, this.f111327k, bcku);
        bbxm bbxm = new bbxm(this.f111318b, this.f111332q, bcky, this.f111328l, azbk, azbl, this.f111317a, bbpi);
        bbwq bbwq = new bbwq(this.f111318b, bcku, this.f111327k, new bbsi(this.f111327k), this.f111332q, bbpi, this.f111317a, this.f111333r);
        bbsh bbsh = new bbsh(this.f111318b, this.f111327k);
        bbsc bbsc = new bbsc(this.f111318b, this.f111327k, bckj, this.f111317a);
        bbxu bbxu = new bbxu(this.f111318b, bcku, this.f111327k);
        Context context3 = this.f111318b;
        bbrr bbrr = new bbrr(context3, this.f111327k, bcki, new bcaw(context3), bbxu);
        bbwv bbwv = new bbwv(this.f111318b, this.f111327k);
        bbsw bbsw = new bbsw(this.f111318b, this.f111327k);
        bcjm bcjm = this.f111331p;
        if (bmxv3.mo66813a()) {
            bbxv = new bbog(bmxv3, bbxm);
        } else {
            bbxv = bbxm;
        }
        bcjm.f104336e = bbxv;
        this.f111331p.f104338g = azbs;
        bbxm.f103680f = bbwq;
        bbwq.f103617o = bbsc;
        bbwq.f103618p = bbrr;
        bbwq.f103619q = bbxu;
        bbsh.f103292b = bbwq;
        this.f111319c = bbxm;
        this.f111320d = bbwq;
        this.f111321e = bbsh;
        this.f111322f = bbsc;
        this.f111323g = bbrr;
        this.f111324h = bbwv;
        this.f111325i = bbsw;
        new bbwr();
        this.f111326j = bbxu;
        this.optionalLighterPackageInitializer = bboi2;
        bnre i = bboi2.f103011a.listIterator();
        while (i.hasNext()) {
            bboh bboh = (bboh) i.next();
            for (bclf bclf : bboh.mo56275a(this.f111331p, this.f111327k, this.f111318b)) {
                this.f111332q.put(bclf.mo56976b(), bclf);
            }
            this.f111330o.mo56350a(bboh.mo56274a());
        }
        bqdx.m112673a(this.f111319c.mo56338a(), new bbof(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    private static synchronized Lighter m94793a(Context context, azbk azbk, azbs azbs, azbl azbl, bbpi bbpi, bboi bboi, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bmxv bmxv5) {
        Lighter lighter;
        synchronized (Lighter.class) {
            if (f111316n == null) {
                Lighter lighter2 = new Lighter(context, azbk, azbs, azbl, bbpi, bboi, bmxv, bmxv2, bmxv3, bmxv4, bmxv5);
                f111316n = lighter2;
                if (lighter2.optionalLighterPackageInitializer != null) {
                }
            }
            lighter = f111316n;
        }
        return lighter;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        bqdx.m112673a(this.f111319c.mo56338a(), new bboe(this), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public static synchronized Lighter m94794a(Context context, azbk azbk, azbs azbs, azbl azbl, bbpi bbpi, bdai bdai, bbpn bbpn, bmxv bmxv, bmxv bmxv2, bboi bboi) {
        bmvz bmvz;
        bmvz bmvz2;
        Lighter a;
        synchronized (Lighter.class) {
            bmxv b = bmxv.m108566b(bdai);
            bmvz bmvz3 = bmvz.f131120a;
            bmxv b2 = bmxv.m108566b(bbpn);
            if (!bmxv.mo66813a()) {
                bmvz = bmvz.f131120a;
            } else {
                bmvz = bmxv;
            }
            if (!bmxv2.mo66813a()) {
                bmvz2 = bmvz.f131120a;
            } else {
                bmvz2 = bmxv2;
            }
            a = m94793a(context, azbk, azbs, azbl, bbpi, bboi, b, bmvz3, b2, bmvz, bmvz2);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized Lighter m94795a(Context context, azbk azbk, azbs azbs, azbl azbl, bbpi bbpi, bmxv bmxv, bmxv bmxv2, bboi bboi) {
        Lighter a;
        synchronized (Lighter.class) {
            a = m94793a(context, azbk, azbs, azbl, bbpi, bboi, bmvz.f131120a, bmvz.f131120a, bmvz.f131120a, !bmxv.mo66813a() ? bmvz.f131120a : bmxv, !bmxv2.mo66813a() ? bmvz.f131120a : bmxv2);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized void m94796a() {
        synchronized (Lighter.class) {
            bbub.m88476c();
            f111316n = null;
        }
    }
}
