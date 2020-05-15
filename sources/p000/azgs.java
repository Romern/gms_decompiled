package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.Collections;

/* renamed from: azgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgs extends azgx {

    /* renamed from: a */
    private final Context f99303a;

    /* renamed from: g */
    private final azet f99304g;

    /* renamed from: h */
    private final azgw f99305h;

    public azgs(cbkj cbkj, Context context, azet azet) {
        super(cbkj);
        this.f99303a = context.getApplicationContext();
        this.f99304g = azet;
        this.f99305h = new azgv(cbkj, context, azet, azcl.m85289a(this.f99303a), azcd.m85252a(this.f99303a), azdj.m85399a(this.f99303a), azbx.m85232a(this.f99303a), azph.m85998a(this.f99303a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aznz mo54915a(cbkj cbkj, bxxc bxxc, LocalEntityId localEntityId) {
        cbij cbij = (cbij) bxxc;
        cbma cbma = cbkj.f177415i;
        if (cbma == null) {
            cbma cbma2 = cbkj.f177413g;
            if (cbma2 == null) {
                return null;
            }
            cbma cbma3 = cbkj.f177414h;
            if (cbma3 == null) {
                cbma3 = cbma.f177591f;
            }
            return aznz.m85890a(cbma2, cbma3);
        }
        cbma cbma4 = cbkj.f177414h;
        if (cbma4 == null) {
            cbma4 = cbma.f177591f;
        }
        return aznz.m85890a(cbma, cbma4);
    }

    /* renamed from: a */
    public final void mo54860a(azbz azbz) {
    }

    /* renamed from: b */
    public final azdd mo54862b() {
        String str;
        azdd b;
        LocalEntityId localEntityId;
        this.f99304g.mo54843a(Collections.singletonList(this.f99325b));
        cbig cbig = ((cbil) ((cbij) this.f99326c).f177253a.get(0)).f177265g;
        if (cbig == null) {
            cbig = cbig.f177238c;
        }
        cbhj cbhj = cbig.f177240a;
        if (cbhj == null) {
            cbhj = cbhj.f177133d;
        }
        String str2 = cbhj.f177136b;
        cbig cbig2 = ((cbil) ((cbij) this.f99326c).f177253a.get(0)).f177265g;
        if (cbig2 == null) {
            cbig2 = cbig.f177238c;
        }
        cbhj cbhj2 = cbig2.f177240a;
        if (cbhj2 == null) {
            cbhj2 = cbhj.f177133d;
        }
        Intent a = azoi.m85923a("", str2, cbhj2.f177137c);
        aznz aznz = this.f99328e;
        if (aznz != null) {
            str = aznz.f99775b;
        } else {
            LocalEntityId localEntityId2 = this.f99327d;
            str = localEntityId2 != null ? localEntityId2.f111076c : null;
        }
        if (a != null) {
            Context context = this.f99303a;
            cbig cbig3 = ((cbil) ((cbij) this.f99326c).f177253a.get(0)).f177265g;
            if (cbig3 == null) {
                cbig3 = cbig.f177238c;
            }
            cbhj cbhj3 = cbig3.f177240a;
            if (cbhj3 == null) {
                cbhj3 = cbhj.f177133d;
            }
            int a2 = cbhi.m127856a(cbhj3.f177135a);
            if (a2 == 0) {
                a2 = 1;
            }
            int a3 = azoi.m85917a(context, a, a2, cfdn.f183660a.mo6606a().mo80862a());
            if (a3 == 0) {
                cbig cbig4 = ((cbil) ((cbij) this.f99326c).f177253a.get(0)).f177265g;
                if (cbig4 == null) {
                    cbig4 = cbig.f177238c;
                }
                cbhj cbhj4 = cbig4.f177240a;
                if (cbhj4 == null) {
                    cbhj4 = cbhj.f177133d;
                }
                int a4 = cbhi.m127856a(cbhj4.f177135a);
                if (a4 == 0) {
                    a4 = 1;
                }
                int i = a4 - 2;
                if (i == 1) {
                    this.f99303a.startService(a);
                } else if (i == 2) {
                    a.addFlags(268435456);
                    this.f99303a.startActivity(a);
                }
                azph a5 = azph.m85998a(this.f99303a);
                aznz aznz2 = this.f99328e;
                if (aznz2 != null) {
                    localEntityId = aznz2.f99780g;
                } else {
                    localEntityId = null;
                }
                a5.mo55143a(1405, localEntityId, str);
            } else {
                int i2 = a3 != 1 ? a3 != 2 ? 38 : 37 : 36;
                new Object[1][0] = Integer.valueOf(a3);
                azph.m85998a(this.f99303a).mo55174d(i2, str);
                if (cfdn.f183660a.mo6606a().mo80863b() && this.f99305h.mo54861a() && (b = this.f99305h.mo54862b()) != null) {
                    azbz a6 = azcm.m85300a(this.f99303a).mo54641a(b, azph.m85998a(this.f99303a));
                    if (a6 == null || a6.f98936a == null) {
                        this.f99305h.mo54863c();
                    } else {
                        this.f99305h.mo54860a(a6);
                    }
                }
            }
            return null;
        }
        azph.m85998a(this.f99303a).mo55174d(43, str);
        return null;
    }

    /* renamed from: c */
    public final void mo54863c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo54916a(cbkj cbkj) {
        return (cbij) azol.m85935a((bxxk) cbij.f177251e.mo74142c(7), cbkj.f177411e.getKey());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LocalEntityId mo54917a(cbkj cbkj, bxxc bxxc) {
        cbip cbip = ((cbij) bxxc).f177255c;
        if (cbip == null) {
            return null;
        }
        cbhu cbhu = cbip.f177283a;
        if (cbhu == null) {
            cbhu = cbhu.f177185d;
        }
        return LocalEntityId.m94549a(cbhu);
    }

    /* renamed from: a */
    public final boolean mo54861a() {
        return cfdn.m138737b();
    }
}
