package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ofl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ofl implements ogz {

    /* renamed from: a */
    public static final bnsn f37507a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    public ohb f37508b;

    /* renamed from: c */
    public volatile boolean f37509c = false;

    /* renamed from: d */
    public final Object f37510d = new Object();

    /* renamed from: e */
    public Handler f37511e;

    /* renamed from: f */
    public Runnable f37512f;

    /* renamed from: g */
    public boolean f37513g;

    /* renamed from: h */
    public final ohq f37514h;

    public ofl(ohq ohq) {
        this.f37514h = ohq;
    }

    /* renamed from: a */
    public final void mo22090a() {
        Runnable runnable;
        synchronized (this.f37510d) {
            Handler handler = this.f37511e;
            if (!(handler == null || (runnable = this.f37512f) == null)) {
                handler.removeCallbacks(runnable);
            }
        }
    }

    /* renamed from: a */
    public final void mo22092a(ohb ohb) {
        this.f37508b = ohb;
    }

    /* renamed from: b */
    public final void mo22093b() {
        this.f37508b = null;
    }

    /* renamed from: c */
    public final void mo22095c() {
        if (this.f37509c) {
            mo22090a();
            this.f37514h.mo21328b(bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER, bpdo.BYEBYE_BY_USER, "user request");
            return;
        }
        this.f37514h.mo21328b(bpdn.PROTOCOL_WRONG_MESSAGE, bpdo.UNEXPECTED_BYEBYE_RESPONSE, "got ByeByeResponse without request");
    }

    /* renamed from: b */
    public final void mo22094b(bipi bipi) {
        ohb ohb = this.f37508b;
        if (ohb != null) {
            ((ojh) ohb).mo22206a(16, bipk.f121175a);
        }
        if (bipi == bipi.DEVICE_SWITCH) {
            this.f37514h.mo21263Z();
            return;
        }
        ohq ohq = this.f37514h;
        bpdn bpdn = bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_CAR;
        bpdo bpdo = bpdo.BYEBYE_BY_CAR;
        String valueOf = String.valueOf(bipi);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("reason:");
        sb.append(valueOf);
        ohq.mo21328b(bpdn, bpdo, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r5.f37509c = true;
        r0 = r5.f37508b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        r0.mo22142a(r6);
     */
    /* renamed from: a */
    public final void mo22091a(bipi bipi) {
        synchronized (this.f37510d) {
            if (!this.f37513g) {
                this.f37511e = new adzt(Looper.getMainLooper());
                ofk ofk = new ofk(this);
                this.f37512f = ofk;
                this.f37511e.postDelayed(ofk, 200);
            } else {
                bnsi d = f37507a.mo68390d();
                d.mo68432a("ofl", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68405a("Ignoring byebye on released handler");
            }
        }
    }
}
