package p000;

import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: nvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nvx {

    /* renamed from: h */
    public static final /* synthetic */ int f36698h = 0;

    /* renamed from: i */
    private static final bnsn f36699i = odk.m28481a("CAR.RETAIL");

    /* renamed from: a */
    public Handler f36700a;

    /* renamed from: b */
    public long f36701b;

    /* renamed from: c */
    public boolean f36702c;

    /* renamed from: d */
    public boolean f36703d;

    /* renamed from: e */
    public final long f36704e = 30000;

    /* renamed from: f */
    public final nmi f36705f;

    /* renamed from: g */
    final nvw f36706g;

    /* renamed from: j */
    private Runnable f36707j;

    /* renamed from: a */
    public final synchronized void mo21729a() {
        mo21731a(new adzt());
    }

    /* renamed from: b */
    public final synchronized void mo21732b() {
        if (this.f36703d) {
            this.f36703d = false;
            this.f36700a.removeCallbacksAndMessages(null);
            this.f36700a = null;
            this.f36707j = null;
            this.f36702c = false;
            mo21734d();
        }
    }

    /* renamed from: c */
    public final synchronized void mo21733c() {
        if (this.f36703d) {
            this.f36701b = SystemClock.elapsedRealtime();
            if (this.f36702c) {
                this.f36702c = false;
                mo21734d();
                mo21730a(this.f36704e);
            }
        }
    }

    /* renamed from: d */
    public final void mo21734d() {
        nmi nmi = this.f36705f;
        if (nmi == null) {
            bnsi c = f36699i.mo68388c();
            c.mo68432a("nvx", "d", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("notifyRetailModeStateChanged null service");
        } else if (this.f36702c) {
            synchronized (nmi.f36034a) {
                nmi.f36036c = true;
                for (nmh nmh : nmi.f36035b) {
                    try {
                        nsm nsm = nmh.f36032b;
                        nsm.mo8530c(1, nsm.mo8529bj());
                    } catch (RemoteException e) {
                    }
                }
            }
        } else {
            synchronized (nmi.f36034a) {
                nmi.f36036c = false;
                for (nmh nmh2 : nmi.f36035b) {
                    try {
                        nsm nsm2 = nmh2.f36032b;
                        nsm2.mo8530c(2, nsm2.mo8529bj());
                    } catch (RemoteException e2) {
                    }
                }
            }
        }
    }

    public nvx(nmi nmi, nmv nmv) {
        this.f36705f = nmi;
        nvw nvw = new nvw(this);
        this.f36706g = nvw;
        nmv.mo21178a(11, 0, nvw);
    }

    /* renamed from: a */
    public final void mo21730a(long j) {
        if (this.f36703d) {
            this.f36700a.postDelayed(this.f36707j, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo21731a(Handler handler) {
        if (!this.f36703d) {
            this.f36700a = handler;
            this.f36707j = new nvv(this);
            this.f36703d = true;
            this.f36702c = true;
            mo21734d();
        }
    }
}
