package p000;

import android.content.Context;
import android.os.Environment;
import com.google.android.libraries.messaging.lighter.Lighter;

/* renamed from: azbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azbj {

    /* renamed from: b */
    private static azbj f98900b;

    /* renamed from: a */
    public final Lighter f98901a;

    /* renamed from: c */
    private bcuy f98902c;

    private azbj(Context context) {
        Lighter lighter;
        bmxv bmxv;
        bmxv bmxv2;
        azbm a = azbm.m85205a(context);
        bngs bngs = new bngs();
        if (cfeo.m138890u()) {
            m85195k();
            bngs.mo67668c(this.f98902c);
        }
        if (cfgs.m139410p()) {
            bngs.mo67668c(bcwt.m90193b());
        }
        boolean I = azdl.m85412a(context).mo54735I();
        new Object[1][0] = !I ? "old" : "new";
        if (I) {
            azpy.m86121a().mo55205a(bopw.HAS_UPGRADED_TO_LIGHTER, System.currentTimeMillis());
        }
        if (!I) {
            lighter = Lighter.m94794a(context, a.mo54571a(), a.f98910e, a.mo54572b(), a.f98909d, a.f98907b, a.f98908c, cfeo.m138869Z() ? bmxv.m108566b(a.f98911f) : bmvz.f131120a, cfeo.m138868Y() ? bmxv.m108566b(a.f98912g) : bmvz.f131120a, new bboi((bboh[]) bngs.mo67664a().toArray(new bboh[0])));
        } else {
            azbk a2 = a.mo54571a();
            azbs azbs = a.f98910e;
            azbl b = a.mo54572b();
            azbq azbq = a.f98909d;
            if (cfeo.m138869Z()) {
                bmxv = bmxv.m108566b(a.f98911f);
            } else {
                bmxv = bmvz.f131120a;
            }
            if (cfeo.m138868Y()) {
                bmxv2 = bmxv.m108566b(a.f98912g);
            } else {
                bmxv2 = bmvz.f131120a;
            }
            lighter = Lighter.m94795a(context, a2, azbs, b, azbq, bmxv, bmxv2, new bboi((bboh[]) bngs.mo67664a().toArray(new bboh[0])));
        }
        this.f98901a = lighter;
        if (cfel.f183691a.mo6606a().mo80891g()) {
            bbqe.m88387a(((bbsw) this.f98901a.f111325i).f103315a).f103063b = bmxv.m108567c(new azbn());
        }
        azpy.m86121a().mo55205a(bopw.INITIATE_LIGHTER_INSTANCE, System.currentTimeMillis());
    }

    /* renamed from: a */
    public static synchronized azbj m85193a(Context context) {
        azbj azbj;
        synchronized (azbj.class) {
            if (f98900b == null) {
                f98900b = new azbj(context);
            }
            azbj = f98900b;
        }
        return azbj;
    }

    /* renamed from: k */
    private final void m85195k() {
        String valueOf = String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath());
        String valueOf2 = String.valueOf(cfeo.f183719a.mo6606a().mo80961aU());
        this.f98902c = bcuy.m90088a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: b */
    public final bbpf mo54562b() {
        return this.f98901a.f111323g;
    }

    /* renamed from: c */
    public final bbps mo54563c() {
        return this.f98901a.f111319c;
    }

    /* renamed from: d */
    public final bbpk mo54564d() {
        return this.f98901a.f111320d;
    }

    /* renamed from: e */
    public final bmxv mo54565e() {
        if (cfeo.m138890u()) {
            if (this.f98902c == null) {
                m85195k();
            }
            return bmxv.m108566b(this.f98902c.f104975a);
        }
        azoj.m85933c("LighterController", "Lighter photos not enabled", new Object[0]);
        return bmvz.f131120a;
    }

    /* renamed from: f */
    public final bbph mo54566f() {
        return this.f98901a.f111321e;
    }

    /* renamed from: g */
    public final bbpm mo54567g() {
        return this.f98901a.f111324h;
    }

    /* renamed from: h */
    public final bbpg mo54568h() {
        return this.f98901a.f111322f;
    }

    /* renamed from: i */
    public final bmxv mo54569i() {
        return cfgs.m139411q() ? bmxv.m108566b(this.f98901a.f111326j) : bmvz.f131120a;
    }

    /* renamed from: j */
    public final bdaw mo54570j() {
        return this.f98901a.f111328l;
    }

    /* renamed from: a */
    public static synchronized void m85194a() {
        synchronized (azbj.class) {
            f98900b = null;
            Lighter.m94796a();
        }
    }
}
