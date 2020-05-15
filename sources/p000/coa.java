package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: coa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class coa {

    /* renamed from: a */
    public final cco f7134a;

    /* renamed from: b */
    public final List f7135b = new ArrayList();

    /* renamed from: c */
    final ccd f7136c;

    /* renamed from: d */
    public boolean f7137d;

    /* renamed from: e */
    public boolean f7138e;

    /* renamed from: f */
    public Bitmap f7139f;

    /* renamed from: g */
    public int f7140g;

    /* renamed from: h */
    public int f7141h;

    /* renamed from: i */
    public int f7142i;

    /* renamed from: j */
    public cqb f7143j;

    /* renamed from: k */
    public cqb f7144k;

    /* renamed from: l */
    public cqb f7145l;

    /* renamed from: m */
    private final Handler f7146m;

    /* renamed from: n */
    private final cgt f7147n;

    /* renamed from: o */
    private boolean f7148o;

    /* renamed from: p */
    private cca f7149p;

    public coa(cbo cbo, cco cco, int i, int i2, cdo cdo, Bitmap bitmap) {
        cgt cgt = cbo.f6403a;
        ccd b = cbo.m3905b(cbo.mo3656a());
        cca a = cbo.m3905b(cbo.mo3656a()).mo3680a(Bitmap.class).mo3677b(ccd.f6461e).mo3677b(cpu.m7267b(cfn.f6709a).mo8107e().mo8106d().mo8103b(i, i2));
        this.f7136c = b;
        Handler handler = new Handler(Looper.getMainLooper(), new cnz(this));
        this.f7147n = cgt;
        this.f7146m = handler;
        this.f7149p = a;
        this.f7134a = cco;
        mo4027a(cdo, bitmap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4026a() {
        return ((ccs) this.f7134a).f6541f.f6521c;
    }

    /* renamed from: b */
    public final void mo4029b() {
        this.f7137d = false;
    }

    /* renamed from: c */
    public final void mo4030c() {
        int i;
        if (this.f7137d && !this.f7148o) {
            cqb cqb = this.f7145l;
            if (cqb == null) {
                this.f7148o = true;
                ccs ccs = (ccs) this.f7134a;
                ccq ccq = ccs.f6541f;
                int i2 = ccq.f6521c;
                int i3 = 0;
                if (i2 > 0 && (i = ccs.f6540e) >= 0) {
                    i3 = i < i2 ? ((ccp) ccq.f6523e.get(i)).f6516i : -1;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f7134a.mo3716a();
                this.f7144k = new cqb(this.f7146m, ((ccs) this.f7134a).f6540e, uptimeMillis + ((long) i3));
                cca a = this.f7149p.mo3677b(new cpu().mo8096a(new cqm(Double.valueOf(Math.random()))));
                a.mo3675a(this.f7134a);
                a.mo3674a(this.f7144k, a, cqv.f11864a);
                return;
            }
            this.f7145l = null;
            mo4028a(cqb);
        }
    }

    /* renamed from: d */
    public final void mo4031d() {
        Bitmap bitmap = this.f7139f;
        if (bitmap != null) {
            this.f7147n.mo3881a(bitmap);
            this.f7139f = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cpu.a(cdo, boolean):cpu
     arg types: [cdo, int]
     candidates:
      cpu.a(int, int):boolean
      cpu.a(cdj, java.lang.Object):cpu
      cpu.a(cmb, cdo):cpu
      cpu.a(cdo, boolean):cpu */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4027a(cdo cdo, Bitmap bitmap) {
        crb.m7382a(cdo);
        crb.m7382a(bitmap);
        this.f7139f = bitmap;
        this.f7149p = this.f7149p.mo3677b(new cpu().mo8098a(cdo, true));
        this.f7140g = crd.m7389a(bitmap);
        this.f7141h = bitmap.getWidth();
        this.f7142i = bitmap.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4028a(cqb cqb) {
        this.f7148o = false;
        if (this.f7138e) {
            this.f7146m.obtainMessage(2, cqb).sendToTarget();
        } else if (this.f7137d) {
            if (cqb.f11836b != null) {
                mo4031d();
                cqb cqb2 = this.f7143j;
                this.f7143j = cqb;
                for (int size = this.f7135b.size() - 1; size >= 0; size--) {
                    ((cny) this.f7135b.get(size)).mo4011d();
                }
                if (cqb2 != null) {
                    this.f7146m.obtainMessage(2, cqb2).sendToTarget();
                }
            }
            mo4030c();
        } else {
            this.f7145l = cqb;
        }
    }
}
