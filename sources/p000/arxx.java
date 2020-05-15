package p000;

import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: arxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arxx implements arxn {

    /* renamed from: a */
    private final Queue f88428a = new ArrayDeque();

    /* renamed from: b */
    private arxn f88429b;

    /* renamed from: a */
    public final void mo48921a(arxn arxn) {
        this.f88429b = arxn;
        while (!this.f88428a.isEmpty() && arxn != null) {
            arxy.f88430a.mo25409a("Consuming %d queued actions", Integer.valueOf(this.f88428a.size()));
            Runnable runnable = (Runnable) this.f88428a.poll();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: b */
    public final void mo48906b(String str) {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxs(this, str));
        } else {
            arxn.mo48906b(str);
        }
    }

    /* renamed from: c */
    public final void mo48907c() {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxo(this));
        } else {
            arxn.mo48907c();
        }
    }

    /* renamed from: d */
    public final void mo48909d() {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxp(this));
        } else {
            arxn.mo48909d();
        }
    }

    /* renamed from: f */
    public final void mo48910f() {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxt(this));
        } else {
            arxn.mo48910f();
        }
    }

    /* renamed from: n */
    public final void mo48911n() {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxw(this));
        } else {
            arxn.mo48911n();
        }
    }

    /* renamed from: c */
    public final void mo48908c(int i) {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxu(this, i));
        } else {
            arxn.mo48908c(i);
        }
    }

    /* renamed from: a */
    public final void mo48903a(BootstrapProgressResult bootstrapProgressResult) {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxv(this, bootstrapProgressResult));
        } else {
            arxn.mo48903a(bootstrapProgressResult);
        }
    }

    /* renamed from: a */
    public final void mo48904a(VerificationInfo verificationInfo) {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxr(this, verificationInfo));
        } else {
            arxn.mo48904a(verificationInfo);
        }
    }

    /* renamed from: a */
    public final void mo48905a(String str) {
        arxn arxn = this.f88429b;
        if (arxn == null) {
            this.f88428a.add(new arxq(this, str));
        } else {
            arxn.mo48905a(str);
        }
    }
}
