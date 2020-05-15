package p000;

import android.content.Context;
import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.SystemDividingException;
import com.felicanetworks.sdu.SystemDividingUtility;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: brgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brgj {

    /* renamed from: c */
    public static final String f142813c = brgk.class.getSimpleName();

    /* renamed from: a */
    private long f142814a;

    /* renamed from: b */
    private final AtomicInteger f142815b;

    /* renamed from: d */
    public final Queue f142816d = new LinkedBlockingQueue();

    /* renamed from: e */
    protected final Context f142817e;

    /* renamed from: f */
    public final brhc f142818f;

    /* renamed from: g */
    public final Executor f142819g;

    /* renamed from: h */
    protected brfg f142820h;

    /* renamed from: i */
    public brfg f142821i;

    /* renamed from: j */
    protected volatile boolean f142822j;

    /* renamed from: k */
    protected final atfo f142823k;

    /* renamed from: l */
    protected final atgo f142824l;

    public brgj(Context context, brhc brhc, Executor executor, atfo atfo, atgo atgo) {
        this.f142817e = context.getApplicationContext();
        this.f142818f = brhc;
        this.f142819g = executor;
        this.f142823k = atfo;
        this.f142815b = new AtomicInteger(0);
        this.f142824l = atgo;
    }

    /* renamed from: a */
    public final SystemDividingUtility mo69501a(List list) {
        try {
            return new SystemDividingUtility(this.f142817e, (String[]) list.toArray(new String[0]));
        } catch (SystemDividingException e) {
            this.f142818f.mo69532a(f142813c, "SystemDividingUtility initialization error", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo49968a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo69482a(brgh brgh) {
        return false;
    }

    /* renamed from: b */
    public void mo49969b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo69509c() {
        if (this.f142816d.isEmpty()) {
            return;
        }
        if (!this.f142822j && mo49968a()) {
            this.f142814a = System.currentTimeMillis();
            brgh brgh = (brgh) this.f142816d.poll();
            Object obj = brgh.f142810c;
            if (!mo69482a(brgh)) {
                if (obj instanceof brgm) {
                    int i = brgh.f142808a;
                    List list = brgh.f142809b;
                    mo69507b(1);
                    this.f142822j = true;
                    brfg a = this.f142823k.mo49927a(new brfq(this, (brgm) obj, list));
                    this.f142820h = a;
                    a.mo49924a(this.f142817e);
                } else if (obj instanceof brgi) {
                    int i2 = brgh.f142808a;
                    List list2 = brgh.f142809b;
                    brgi brgi = (brgi) obj;
                    String str = brgi.f142811a;
                    brgn brgn = brgi.f142812b;
                    mo69507b(4);
                    this.f142822j = true;
                    brfg a2 = this.f142823k.mo49927a(new brfz(this, brgn, list2, str));
                    this.f142820h = a2;
                    a2.mo49924a(this.f142817e);
                } else if (obj instanceof brfd) {
                    List list3 = brgh.f142809b;
                    mo69507b(16);
                    this.f142822j = true;
                    brfg a3 = this.f142823k.mo49927a(new brgc(this, (brfd) obj, list3));
                    this.f142820h = a3;
                    a3.mo49924a(this.f142817e);
                } else if (obj instanceof brgo) {
                    List list4 = brgh.f142809b;
                    mo69507b(15);
                    this.f142822j = true;
                    brfg a4 = this.f142823k.mo49927a(new brgg(this, (brgo) obj, list4));
                    this.f142820h = a4;
                    a4.mo49924a(this.f142817e);
                } else {
                    throw new IllegalStateException("Operation needs to either OfflineFelicaOperation or OnlineFelicaOperation.");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo69511d() {
        mo69510c(1);
    }

    /* renamed from: e */
    public final brhb mo69513e() {
        brhb brhb = new brhb();
        brhb.f142843a = (int) (System.currentTimeMillis() - this.f142814a);
        return brhb;
    }

    /* renamed from: b */
    public final void mo69507b(int i) {
        this.f142818f.mo69531a(i, mo69513e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo69512d(int i) {
        this.f142824l.mo49963a(4, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo69514e(int i) {
        this.f142824l.mo49963a(2, i);
    }

    /* renamed from: f */
    public final void mo69515f(int i) {
        int a = atgo.m75852a(i);
        atam atam = this.f142824l.f90306a;
        bxvd g = atam.mo49765g(147);
        bxvd da = boyx.f135353e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boyx boyx = (boyx) da.f164949b;
        boyx.f135356b = a - 1;
        int i2 = boyx.f135355a | 1;
        boyx.f135355a = i2;
        boyx.f135357c = 1;
        boyx.f135355a = i2 | 2;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        boyx boyx2 = (boyx) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boyx2.getClass();
        bpbx.f135652P = boyx2;
        bpbx.f135656b |= 8192;
        atam.mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final void mo69502a(int i, FelicaException felicaException) {
        brhb e = mo69513e();
        e.f142849g = felicaException;
        this.f142818f.mo69531a(i, e);
    }

    /* renamed from: b */
    public final void mo69508b(Felica felica, int i) {
        try {
            felica.close();
            felica.inactivateFelica();
            mo69507b(3);
        } catch (FelicaException e) {
            mo69502a(11, e);
        } catch (Throwable th) {
            mo69510c(i);
            throw th;
        }
        mo69510c(i);
    }

    /* renamed from: a */
    public final void mo69503a(int i, String str, AppInfo appInfo) {
        brhb e = mo69513e();
        e.f142846d = Integer.valueOf(i);
        e.f142847e = str;
        e.f142848f = appInfo;
        this.f142818f.mo69531a(6, e);
    }

    /* renamed from: a */
    public final void mo69504a(brfd brfd) {
        this.f142819g.execute(new brfh(brfd));
        mo69512d(7);
        mo69511d();
        mo69509c();
    }

    /* renamed from: a */
    public final void mo69505a(brgo brgo) {
        this.f142819g.execute(new brfi(brgo));
        mo69512d(7);
        mo69511d();
        mo69509c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69506a(Felica felica) {
        mo69508b(felica, 1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b A[Catch:{ all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[Catch:{ all -> 0x004f }] */
    /* renamed from: c */
    public final void mo69510c(int i) {
        brfg brfg;
        brfg brfg2;
        int i2;
        int i3 = i - 1;
        if (i3 == 0) {
            i2 = this.f142815b.get();
        } else if (i3 != 1) {
            try {
                if (this.f142815b.get() > 0) {
                    i2 = this.f142815b.decrementAndGet();
                }
                brfg = this.f142820h;
                if (brfg != null) {
                    ((atfk) brfg).f90239b.f90250c.finish();
                    this.f142820h = null;
                }
                brfg2 = this.f142821i;
                if (brfg2 != null) {
                    ((atfn) brfg2).f90247b.f90251d.finish();
                    this.f142821i = null;
                }
                this.f142822j = false;
                mo49969b();
            } catch (Throwable th) {
                this.f142822j = false;
                mo49969b();
                throw th;
            }
        } else {
            i2 = this.f142815b.incrementAndGet();
        }
        if (i2 > 0) {
            this.f142822j = false;
            mo49969b();
        }
        brfg = this.f142820h;
        if (brfg != null) {
        }
        brfg2 = this.f142821i;
        if (brfg2 != null) {
        }
        this.f142822j = false;
        mo49969b();
    }
}
