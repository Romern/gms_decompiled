package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ccd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccd implements ComponentCallbacks2, cou {

    /* renamed from: e */
    public static final cpu f6461e;

    /* renamed from: a */
    protected final cbo f6462a;

    /* renamed from: b */
    protected final Context f6463b;

    /* renamed from: c */
    final cot f6464c;

    /* renamed from: d */
    public final CopyOnWriteArrayList f6465d;

    /* renamed from: f */
    private final cpb f6466f;

    /* renamed from: g */
    private final cpa f6467g;

    /* renamed from: h */
    private final cpe f6468h = new cpe();

    /* renamed from: i */
    private final Runnable f6469i = new ccb(this);

    /* renamed from: j */
    private final Handler f6470j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private final coo f6471k;

    /* renamed from: l */
    private cpu f6472l;

    static {
        cpu b = cpu.m7268b(Bitmap.class);
        b.mo8109f();
        f6461e = b;
        cpu.m7268b(cnu.class).mo8109f();
        cpu.m7267b(cfn.f6710b).mo8095a(cbs.LOW).mo8106d();
    }

    public ccd(cbo cbo, cot cot, cpa cpa, Context context) {
        cpb cpb = new cpb();
        this.f6462a = cbo;
        this.f6464c = cot;
        this.f6467g = cpa;
        this.f6466f = cpb;
        this.f6463b = context;
        Context applicationContext = context.getApplicationContext();
        this.f6471k = C1133kh.m17835a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new coq(applicationContext, new ccc(this, cpb)) : new cov();
        if (crd.m7400c()) {
            this.f6470j.post(this.f6469i);
        } else {
            cot.mo4038a(this);
        }
        cot.mo4038a(this.f6471k);
        this.f6465d = new CopyOnWriteArrayList(cbo.f6404b.f6426d);
        mo3682a(cbo.f6404b.mo3660a());
        synchronized (cbo.f6408f) {
            if (!cbo.f6408f.contains(this)) {
                cbo.f6408f.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: a */
    public final cca mo3680a(Class cls) {
        return new cca(this.f6462a, this, cls);
    }

    /* renamed from: b */
    public final synchronized void mo3685b() {
        cpb cpb = this.f6466f;
        cpb.f11762c = false;
        List a = crd.m7391a(cpb.f11760a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cpv cpv = (cpv) a.get(i);
            if (!cpv.mo8115e() && !cpv.mo8114d()) {
                cpv.mo8111a();
            }
        }
        cpb.f11761b.clear();
    }

    /* renamed from: c */
    public final synchronized void mo3687c() {
        mo3685b();
        this.f6468h.mo3687c();
    }

    /* renamed from: d */
    public final synchronized void mo3688d() {
        mo3681a();
        this.f6468h.mo3688d();
    }

    /* renamed from: e */
    public final synchronized void mo3689e() {
        this.f6468h.mo3689e();
        List a = crd.m7391a(this.f6468h.f11769a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            mo3683a((cqf) a.get(i));
        }
        this.f6468h.f11769a.clear();
        cpb cpb = this.f6466f;
        List a2 = crd.m7391a(cpb.f11760a);
        int size2 = a2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cpb.mo8078a((cpv) a2.get(i2));
        }
        cpb.f11761b.clear();
        this.f6464c.mo4040b(this);
        this.f6464c.mo4040b(this.f6471k);
        this.f6470j.removeCallbacks(this.f6469i);
        cbo cbo = this.f6462a;
        synchronized (cbo.f6408f) {
            if (cbo.f6408f.contains(this)) {
                cbo.f6408f.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized cpu mo3690f() {
        return this.f6472l;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String obj = super.toString();
        String valueOf = String.valueOf(this.f6466f);
        String valueOf2 = String.valueOf(this.f6467g);
        int length = String.valueOf(obj).length();
        sb = new StringBuilder(length + 21 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj);
        sb.append("{tracker=");
        sb.append(valueOf);
        sb.append(", treeNode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo3681a() {
        cpb cpb = this.f6466f;
        cpb.f11762c = true;
        List a = crd.m7391a(cpb.f11760a);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cpv cpv = (cpv) a.get(i);
            if (cpv.mo8114d()) {
                cpv.mo8113c();
                cpb.f11761b.add(cpv);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo3682a(cpu cpu) {
        cpu b = cpu.clone();
        if (b.f11801n) {
            if (!b.f11802o) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
        }
        b.f11802o = true;
        b.mo8109f();
        this.f6472l = b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        return true;
     */
    /* renamed from: b */
    public final synchronized boolean mo3686b(cqf cqf) {
        cpv a = cqf.mo8123a();
        if (a != null) {
            if (!this.f6466f.mo8078a(a)) {
                return false;
            }
            this.f6468h.f11769a.remove(cqf);
            cqf.mo8124a((cpv) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r5.mo8124a((p000.cpv) null);
        r1.mo8112b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo3683a(cqf cqf) {
        if (cqf != null) {
            boolean b = mo3686b(cqf);
            cpv a = cqf.mo8123a();
            if (!b) {
                cbo cbo = this.f6462a;
                synchronized (cbo.f6408f) {
                    for (ccd ccd : cbo.f6408f) {
                        if (ccd.mo3686b(cqf)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo3684a(cqf cqf, cpv cpv) {
        this.f6468h.f11769a.add(cqf);
        cpb cpb = this.f6466f;
        cpb.f11760a.add(cpv);
        if (!cpb.f11762c) {
            cpv.mo8111a();
            return;
        }
        cpv.mo8112b();
        cpb.f11761b.add(cpv);
    }
}
