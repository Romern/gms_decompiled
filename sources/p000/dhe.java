package p000;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: dhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dhe implements Runnable {

    /* renamed from: a */
    public final Intent f13097a;

    /* renamed from: b */
    public final IntentOperation f13098b;

    /* renamed from: c */
    public final dhj f13099c;

    /* renamed from: d */
    public final boolean f13100d;

    /* renamed from: e */
    public final Object f13101e;

    /* renamed from: f */
    public final long f13102f;

    /* renamed from: g */
    final /* synthetic */ dhf f13103g;

    public dhe(dhf dhf, Intent intent, IntentOperation intentOperation, dhj dhj, boolean z, Object obj, long j) {
        this.f13103g = dhf;
        this.f13097a = intent;
        this.f13098b = intentOperation;
        this.f13099c = dhj;
        this.f13100d = z;
        this.f13101e = obj;
        this.f13102f = j;
    }

    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        dhf dhf = this.f13103g;
        dhi dhi = dhf.f13104a;
        Intent intent = new Intent(this.f13097a);
        try {
            dhj dhj = this.f13099c;
            IntentOperation intentOperation = this.f13098b;
            boolean z6 = true;
            int i = dhi.f13114a & 1;
            bmzs.m108698a(!dhj.f13131f.f13143f.isHeldByCurrentThread());
            synchronized (dhj.f13128c) {
                synchronized (dhj) {
                    if (dhj.f13130e <= 0 || dhj.f13129d != intentOperation) {
                        z = false;
                    } else {
                        z = true;
                    }
                    bmzs.m108698a(z);
                }
                intent.setExtrasClassLoader(intentOperation.getClassLoader());
                if (i == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                intentOperation.onHandleIntent(intent, z2);
            }
            Object obj = this.f13101e;
            if (obj != null) {
                this.f13103g.f13109f.f13113d.f13142e.mo9097a(obj);
            }
            dhj dhj2 = this.f13099c;
            IntentOperation intentOperation2 = this.f13098b;
            bmzs.m108698a(!dhj2.f13131f.f13143f.isHeldByCurrentThread());
            synchronized (dhj2.f13128c) {
                synchronized (dhj2) {
                    if (dhj2.f13130e <= 0 || dhj2.f13129d != intentOperation2) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    bmzs.m108698a(z3);
                    int i2 = dhj2.f13130e - 1;
                    dhj2.f13130e = i2;
                    if (i2 == 0) {
                        dhj2.f13129d = null;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    dhj2.f13131f.f13149l.mo9008a(intentOperation2);
                }
            }
            this.f13103g.f13109f.f13113d.f13143f.lock();
            try {
                if (this.f13103g.f13109f.f13111b.peek() == dhf) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bmzs.m108698a(z5);
                if (this.f13100d) {
                    dhi.mo9014b();
                }
                dhf.f13106c--;
                if (!dhf.f13105b.isEmpty()) {
                    dhf.f13109f.mo9004a();
                } else if (dhf.f13108e && dhf.f13106c == 0) {
                    dhf.f13109f.mo9005b();
                }
                if (this.f13103g.f13109f.f13113d.f13145h <= 0) {
                    z6 = false;
                }
                bmzs.m108698a(z6);
                dhm.m8502a(this.f13103g.f13109f.f13113d);
                this.f13103g.f13109f.f13113d.f13149l.mo9007a();
            } finally {
                this.f13103g.f13109f.f13113d.f13143f.unlock();
            }
        } catch (RuntimeException e) {
            try {
                if (this.f13103g.f13109f.f13113d.f13150m) {
                    dhj dhj3 = this.f13099c;
                    String a = dhm.m8501a(dhj3.f13126a, dhj3.f13127b.getName());
                    this.f13103g.f13109f.f13113d.f13143f.lock();
                    this.f13103g.f13109f.f13113d.f13149l.mo9011a(dhi, a);
                    this.f13103g.f13109f.f13113d.f13143f.unlock();
                }
                throw e;
            } catch (Throwable th) {
                this.f13103g.f13109f.f13113d.f13143f.unlock();
                throw th;
            }
        }
    }
}
