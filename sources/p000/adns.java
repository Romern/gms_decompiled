package p000;

import com.google.android.chimera.config.ModuleManager;
import java.util.Iterator;
import java.util.Random;

/* renamed from: adns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adns {

    /* renamed from: d */
    private static adns f62235d;

    /* renamed from: a */
    private final qws f62236a = new qws(rpr.m34216b(), "IPA_GCORE", null);

    /* renamed from: b */
    private final Random f62237b = new Random();

    /* renamed from: c */
    private int f62238c = -1;

    /* renamed from: a */
    public static synchronized adns m50862a() {
        synchronized (adns.class) {
            synchronized (adns.class) {
                if (f62235d == null) {
                    f62235d = new adns();
                }
            }
            return r1;
        }
        adns adns = f62235d;
        return adns;
    }

    /* renamed from: a */
    public final void mo33690a(int i) {
        bxvd da = boma.f133613b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boma) da.f164949b).f133615a = i;
        boma boma = (boma) da.mo74062i();
        bxvd da2 = bolz.f133605g.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boma.getClass();
        ((bolz) da2.f164949b).f133609c = boma;
        mo33694a(da2);
    }

    /* renamed from: a */
    public final void mo33691a(boly boly) {
        bxvd da = bolz.f133605g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boly.getClass();
        ((bolz) da.f164949b).f133612f = boly;
        mo33694a(da);
    }

    /* renamed from: a */
    public final void mo33692a(bomb bomb) {
        bxvd da = bolz.f133605g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomb.getClass();
        ((bolz) da.f164949b).f133610d = bomb;
        mo33694a(da);
    }

    /* renamed from: a */
    public final void mo33693a(bome bome) {
        bxvd da = bolz.f133605g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bome.getClass();
        ((bolz) da.f164949b).f133611e = bome;
        mo33694a(da);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33694a(bxvd bxvd) {
        long w = ceqm.f183265a.mo6606a().mo79638w();
        if (w > 0 && this.f62237b.nextInt((int) w) == 0) {
            if (this.f62238c < 0) {
                try {
                    Iterator it = ModuleManager.get(rpr.m34216b()).getAllModules().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                        if (moduleInfo.moduleId.equals("com.google.android.gms.ipa")) {
                            this.f62238c = moduleInfo.moduleVersion;
                            break;
                        }
                    }
                } catch (Exception e) {
                    this.f62238c = 0;
                    new Object[1][0] = e;
                }
            }
            int i = this.f62238c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bolz bolz = bolz.f133605g;
            ((bolz) bxvd.f164949b).f133607a = i;
            long g = stu.m36321g();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((bolz) bxvd.f164949b).f133608b = g;
            this.f62236a.mo24333a(bxvd.mo74062i()).mo24327b();
        }
    }
}
