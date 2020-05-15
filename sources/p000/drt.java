package p000;

import android.content.Context;
import android.os.Message;
import android.os.WorkSource;
import java.util.concurrent.locks.Lock;

/* renamed from: drt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class drt extends snr implements efy {

    /* renamed from: b */
    public static final /* synthetic */ int f13896b = 0;

    /* renamed from: a */
    final /* synthetic */ drv f13897a;

    /* renamed from: f */
    private final asfb f13898f;

    /* renamed from: g */
    private long f13899g;

    /* renamed from: h */
    private boolean f13900h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public drt(drv drv, Context context, sns sns) {
        super(sns);
        this.f13897a = drv;
        asfb asfb = new asfb(context, 1, "CMWakeLock", null, "com.google.android.gms");
        this.f13898f = asfb;
        asfb.mo49115a(true);
        mo9509b();
    }

    /* renamed from: a */
    private final void m9173a(Message message) {
        dru dru = (dru) message.obj;
        dru.f13902b.mo9463b();
        try {
            dru.f13901a.run();
            if (dru.f13903c) {
                mo9506a(dru.f13902b);
            }
            dru.f13902b.mo9464c();
            egr D = dwq.m9647D();
            if (D != null) {
                D.mo10108b(dru.f13902b);
            }
        } catch (Throwable th) {
            if (dru.f13903c) {
                mo9506a(dru.f13902b);
            }
            dru.f13902b.mo9464c();
            egr D2 = dwq.m9647D();
            if (D2 != null) {
                D2.mo10108b(dru.f13902b);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo9509b() {
        this.f13899g = cdgm.f180779a.mo6606a().mo77507a();
        this.f13900h = cdgp.f180782a.mo6606a().mo77527S();
    }

    public final void handleMessage(Message message) {
        Lock lock;
        drv drv = this.f13897a;
        if (drv.f13908e) {
            drv.f13910g.lock();
            try {
                new Object[1][0] = Boolean.valueOf(this.f13897a.f13909f);
                if (this.f13897a.f13909f) {
                    lock = this.f13897a.f13910g;
                } else {
                    m9173a(message);
                    lock = this.f13897a.f13910g;
                }
                lock.unlock();
            } catch (Throwable th) {
                this.f13897a.f13910g.unlock();
                throw th;
            }
        } else {
            m9173a(message);
        }
    }

    /* renamed from: a */
    public final void mo9350a() {
        mo9509b();
    }

    /* renamed from: a */
    public final void mo9506a(dqx dqx) {
        if (dqx.f13844e) {
            synchronized (this.f13898f) {
                if (!this.f13898f.mo49124e()) {
                    new Object[1][0] = dqx.f13840a;
                } else {
                    this.f13898f.mo49122c(dqx.f13840a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9507a(egr egr, dqx dqx) {
        if (this.f13900h && !dqx.f13843d) {
            dqx.f13844e = false;
            return;
        }
        synchronized (this.f13898f) {
            WorkSource workSource = dqx.f13841b;
            if (workSource != null) {
                this.f13898f.mo49121c(workSource);
            }
            if (!this.f13898f.mo49124e()) {
                if (egr != null) {
                    String valueOf = String.valueOf(dqx.f13840a);
                    egr.mo10109c(dqy.m9123a(valueOf.length() == 0 ? new String("FirstAcquire-") : "FirstAcquire-".concat(valueOf)));
                }
            }
            this.f13898f.mo49114a(dqx.f13840a, this.f13899g);
            dqx.f13844e = true;
        }
    }

    /* renamed from: a */
    public final void mo9508a(Runnable runnable, dqx dqx) {
        sdo.m34959a(runnable);
        sdo.m34959a(dqx);
        egr D = dwq.m9647D();
        mo9507a(D, dqx);
        Message message = new Message();
        message.obj = new dru(runnable, dqx, dqx.f13844e);
        drv drv = this.f13897a;
        if (drv.f13908e) {
            drv.f13910g.lock();
            try {
                if (!this.f13897a.f13909f) {
                    sendMessage(message);
                }
            } finally {
                this.f13897a.f13910g.unlock();
            }
        } else if (!sendMessage(message)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("drt", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[EventHandler] Failed to send message %s", dqx.f13840a);
            if (D != null) {
                String valueOf = String.valueOf(dqx.f13840a);
                D.mo10109c(dqy.m9123a(valueOf.length() == 0 ? new String("Failed-") : "Failed-".concat(valueOf)));
            }
            mo9506a(dqx);
        } else {
            D.mo10106a(dqx);
        }
    }
}
