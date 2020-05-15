package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abym {

    /* renamed from: a */
    public final qws f58737a;

    /* renamed from: b */
    private final Random f58738b;

    /* renamed from: c */
    private final Context f58739c;

    /* renamed from: d */
    private final int f58740d;

    /* renamed from: e */
    private final rjx f58741e;

    public abym(Context context) {
        Random random = new Random();
        qws qws = new qws(context, "ICING", null);
        rjx b = avtz.m79338b(context);
        this.f58739c = context;
        this.f58738b = random;
        this.f58737a = qws;
        this.f58741e = b;
        this.f58740d = m48547a(context);
    }

    /* renamed from: a */
    public static int m48546a(int i) {
        return ((i + 9) / 10) * 10;
    }

    /* renamed from: b */
    private final qwo m48548b(int i, bxvd bxvd, long j) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb = (bpxb) bxvd.f164949b;
        bpxb bpxb2 = bpxb.f139606R;
        bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpxb.f139643s = j;
        bxvd da = bpxa.f139602c.mo74144da();
        boolean a = abyk.m48545a(this.f58739c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxa bpxa = (bpxa) da.f164949b;
        bpxa.f139604a |= 1;
        bpxa.f139605b = a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb3 = (bpxb) bxvd.f164949b;
        bpxa bpxa2 = (bpxa) da.mo74062i();
        bpxa2.getClass();
        bpxb3.f139612E = bpxa2;
        bpxb3.f139626b |= 64;
        bxvd da2 = bpwn.f139533d.mo74144da();
        int i2 = this.f58740d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpwn bpwn = (bpwn) da2.f164949b;
        bpwn.f139535a |= 1;
        bpwn.f139536b = i2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb4 = (bpxb) bxvd.f164949b;
        bpwn bpwn2 = (bpwn) da2.mo74062i();
        bpwn2.getClass();
        bpxb4.f139619L = bpwn2;
        bpxb4.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        qwo a2 = this.f58737a.mo24333a(bxvd.mo74062i());
        a2.mo24328b(bpzd.m112421a(i));
        return a2;
    }

    /* renamed from: a */
    public static int m48547a(Context context) {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.icing")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return -1;
        } catch (Exception e) {
            absg.m48192b("Failed to set icing module version: %s", e);
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo32437a(int i, bpww bpww) {
        long c = cema.m137236c();
        if (mo32452a(c)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpww.getClass();
            bpxb.f139633i = bpww;
            bpxb.f139625a |= 64;
            mo32438a(i, da, c);
        }
    }

    /* renamed from: b */
    public final void mo32453b(int i) {
        long c = cema.m137236c();
        if (mo32452a(c)) {
            mo32438a(i, bpxb.f139606R.mo74144da(), c);
        }
    }

    /* renamed from: a */
    public final void mo32438a(int i, bxvd bxvd, long j) {
        m48548b(i, bxvd, j).mo24327b();
    }

    /* renamed from: b */
    public final boolean mo32454b() {
        return mo32452a(cema.m137238e());
    }

    /* renamed from: a */
    public final void mo32439a(bomn bomn) {
        long f = cema.f182934a.mo6606a().mo79304f();
        if (mo32452a(f)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bomn.getClass();
            bpxb.f139608A = bomn;
            bpxb.f139625a |= 536870912;
            mo32438a(5003, da, f);
        }
    }

    /* renamed from: a */
    public final void mo32440a(bpws bpws) {
        long e = cema.f182934a.mo6606a().mo79303e();
        if (mo32452a(e)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpws.getClass();
            bpxb.f139647w = bpws;
            bpxb.f139625a |= 33554432;
            qwo b = m48548b(14003, da, e);
            b.mo24322a(1);
            b.mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo32441a(bpxd bpxd) {
        bxvd da = bpxb.f139606R.mo74144da();
        long e = cema.m137238e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxb bpxb = (bpxb) da.f164949b;
        int i = bpxb.f139625a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        bpxb.f139625a = i;
        bpxb.f139643s = e;
        bpxd.getClass();
        bpxb.f139629e = bpxd;
        bpxb.f139625a = i | 4;
        mo32450a("qstats", da);
    }

    /* renamed from: a */
    public final void mo32442a(bpxk bpxk) {
        long i = cema.f182934a.mo6606a().mo79307i();
        if (mo32452a(i)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxk.getClass();
            bpxb.f139637m = bpxk;
            bpxb.f139625a |= 4096;
            mo32438a(5002, da, i);
        }
    }

    /* renamed from: a */
    public final void mo32443a(bpym bpym) {
        long m = cema.f182934a.mo6606a().mo79311m();
        if (mo32452a(m)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpym.getClass();
            bpxb.f139640p = bpym;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            mo32438a(2006, da, m);
        }
    }

    /* renamed from: a */
    public final void mo32444a(bpyu bpyu) {
        long d = cema.m137237d();
        if (mo32452a(d)) {
            bxvd bxvd = (bxvd) bpyu.mo74142c(5);
            bxvd.mo73625a((bxvk) bpyu);
            int a = m48546a(bpyu.f139937b);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpyu bpyu2 = (bpyu) bxvd.f164949b;
            bpyu bpyu3 = bpyu.f139934g;
            bpyu2.f139936a |= 1;
            bpyu2.f139937b = a;
            int a2 = m48546a(bpyu.f139938c);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpyu bpyu4 = (bpyu) bxvd.f164949b;
            bpyu4.f139936a |= 2;
            bpyu4.f139938c = a2;
            int a3 = m48546a(bpyu.f139939d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpyu bpyu5 = (bpyu) bxvd.f164949b;
            bpyu5.f139936a |= 4;
            bpyu5.f139939d = a3;
            int a4 = m48546a(bpyu.f139940e);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpyu bpyu6 = (bpyu) bxvd.f164949b;
            bpyu6.f139936a |= 8;
            bpyu6.f139940e = a4;
            bpyu bpyu7 = (bpyu) bxvd.mo74062i();
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpyu7.getClass();
            bpxb.f139635k = bpyu7;
            bpxb.f139625a |= 512;
            mo32438a(2002, da, d);
        }
    }

    /* renamed from: a */
    public final void mo32445a(bpzm bpzm, int i) {
        mo32446a(bpzm, i, cema.f182934a.mo6606a().mo79317s());
    }

    /* renamed from: a */
    public final void mo32446a(bpzm bpzm, int i, long j) {
        absg.m48203d("Timing: %s = %dms", bpzm, Integer.valueOf(i));
        if (mo32452a(j)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            bpxb.f139643s = j;
            bxvd da2 = bpxf.f139693d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxf bpxf = (bpxf) da2.f164949b;
            bpxf.f139696b = bpzm.mo3214a();
            bpxf.f139695a |= 1;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxf bpxf2 = (bpxf) da2.f164949b;
            bpxf2.f139695a |= 2;
            bpxf2.f139697c = i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb2 = (bpxb) da.f164949b;
            bpxf bpxf3 = (bpxf) da2.mo74062i();
            bpxf3.getClass();
            bpxb2.f139630f = bpxf3;
            bpxb2.f139625a |= 8;
            mo32450a("tstats", da);
        }
    }

    /* renamed from: a */
    public final void mo32447a(String str) {
        long c = cema.m137236c();
        if (mo32452a(c)) {
            bxvd da = bpxb.f139606R.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb = (bpxb) da.f164949b;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            bpxb.f139643s = c;
            bxvd da2 = bpxc.f139651c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxc bpxc = (bpxc) da2.f164949b;
            str.getClass();
            bpxc.f139653a |= 1;
            bpxc.f139654b = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxb bpxb2 = (bpxb) da.f164949b;
            bpxc bpxc2 = (bpxc) da2.mo74062i();
            bpxc2.getClass();
            bpxb2.f139627c = bpxc2;
            bpxb2.f139625a |= 1;
            mo32450a("error", da);
        }
    }

    /* renamed from: a */
    public final void mo32448a(String str, int i, bpzo bpzo, bpzq bpzq, int i2, Set set) {
        long a = cema.f182934a.mo6606a().mo79299a();
        if (mo32452a(a)) {
            bxvd da = bpxg.f139698i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxg bpxg = (bpxg) da.f164949b;
            str.getClass();
            int i3 = bpxg.f139700a | 1;
            bpxg.f139700a = i3;
            bpxg.f139701b = str;
            bpxg.f139700a = i3 | 32;
            bpxg.f139706g = i;
            bpxg.f139702c = bpzo.mo3214a();
            bpxg.f139700a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxg bpxg2 = (bpxg) da.f164949b;
            bpxg2.f139703d = bpzq.mo3214a();
            bpxg2.f139700a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxg bpxg3 = (bpxg) da.f164949b;
            bpxg3.f139700a |= 16;
            bpxg3.f139705f = i2;
            if (acaw.m48795l() && set != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxg bpxg4 = (bpxg) da.f164949b;
                if (!bpxg4.f139707h.mo73666a()) {
                    bpxg4.f139707h = bxvk.m124019a(bpxg4.f139707h);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    bpxg4.f139707h.mo74153d(((bqbf) it.next()).mo3214a());
                }
            }
            try {
                int i4 = this.f58739c.getPackageManager().getPackageInfo(str, 0).versionCode;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxg bpxg5 = (bpxg) da.f164949b;
                bpxg5.f139700a |= 8;
                bpxg5.f139704e = i4;
            } catch (PackageManager.NameNotFoundException e) {
                absg.m48192b("PackageInfo not found for package: %s", str);
            }
            bxvd da2 = bpxb.f139606R.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxb bpxb = (bpxb) da2.f164949b;
            bpxb.f139625a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            bpxb.f139643s = a;
            bxvd da3 = bpxh.f139708d.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpxh bpxh = (bpxh) da3.f164949b;
            bpxg bpxg6 = (bpxg) da.mo74062i();
            bpxg6.getClass();
            bpxh.f139711b = bpxg6;
            bpxh.f139710a |= 1;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxb bpxb2 = (bpxb) da2.f164949b;
            bpxh bpxh2 = (bpxh) da3.mo74062i();
            bpxh2.getClass();
            bpxb2.f139632h = bpxh2;
            bpxb2.f139625a |= 32;
            mo32450a("iapistats", da2);
        }
    }

    /* renamed from: a */
    public final void mo32449a(String str, bpzu bpzu, bpzs bpzs) {
        long c = cema.f182934a.mo6606a().mo79301c();
        if (mo32452a(c)) {
            bxvd da = bpxh.f139708d.mo74144da();
            bxvd da2 = bpxi.f139713e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxi bpxi = (bpxi) da2.f164949b;
            str.getClass();
            bpxi.f139715a |= 1;
            bpxi.f139716b = str;
            bpxi.f139717c = bpzu.mo3214a();
            bpxi.f139715a |= 2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpxi bpxi2 = (bpxi) da2.f164949b;
            bpxi2.f139718d = bpzs.mo3214a();
            bpxi2.f139715a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxh bpxh = (bpxh) da.f164949b;
            bpxi bpxi3 = (bpxi) da2.mo74062i();
            bpxi3.getClass();
            bpxh.f139712c = bpxi3;
            bpxh.f139710a |= 2;
            bpxh bpxh2 = (bpxh) da.mo74062i();
            bxvd da3 = bpxb.f139606R.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpxb bpxb = (bpxb) da3.f164949b;
            int i = bpxb.f139625a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
            bpxb.f139625a = i;
            bpxb.f139643s = c;
            bpxh2.getClass();
            bpxb.f139632h = bpxh2;
            bpxb.f139625a = i | 32;
            mo32450a("iapistats", da3);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo32450a(String str, bxvd bxvd) {
        bxvd da = bpxa.f139602c.mo74144da();
        boolean a = abyk.m48545a(this.f58739c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxa bpxa = (bpxa) da.f164949b;
        bpxa.f139604a |= 1;
        bpxa.f139605b = a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb = (bpxb) bxvd.f164949b;
        bpxa bpxa2 = (bpxa) da.mo74062i();
        bpxb bpxb2 = bpxb.f139606R;
        bpxa2.getClass();
        bpxb.f139612E = bpxa2;
        bpxb.f139626b |= 64;
        bxvd da2 = bpwn.f139533d.mo74144da();
        int i = this.f58740d;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpwn bpwn = (bpwn) da2.f164949b;
        bpwn.f139535a |= 1;
        bpwn.f139536b = i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxb bpxb3 = (bpxb) bxvd.f164949b;
        bpwn bpwn2 = (bpwn) da2.mo74062i();
        bpwn2.getClass();
        bpxb3.f139619L = bpwn2;
        bpxb3.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        qwo a2 = this.f58737a.mo24333a(bxvd.mo74062i());
        a2.mo24329b(str);
        a2.mo24327b();
    }

    /* renamed from: a */
    public final boolean mo32451a() {
        if (!mo32452a(cema.m137236c())) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            if (((rkj) aucu.m76783a(this.f58741e.mo24673E(), 500, TimeUnit.MILLISECONDS)).mo24824r()) {
                return true;
            }
            absg.m48196c("Skipping storage state: opt-out");
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo32452a(long j) {
        if (j <= 0) {
            if (j < 0) {
                absg.m48192b("Bad sample interval: %d", Long.valueOf(j));
            }
            return false;
        } else if (j <= 2147483647L) {
            return this.f58738b.nextInt((int) j) == 0;
        } else {
            absg.m48192b("Bad sample interval: %d", Long.valueOf(j));
            return false;
        }
    }
}
