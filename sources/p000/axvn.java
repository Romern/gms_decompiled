package p000;

import android.util.Log;

/* renamed from: axvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class axvn implements Runnable {

    /* renamed from: a */
    private final boolean f96485a;

    /* renamed from: g */
    public axvx f96486g;

    /* renamed from: h */
    public boolean f96487h;

    /* renamed from: i */
    final /* synthetic */ axvr f96488i;

    protected axvn(axvr axvr) {
        this(axvr, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo53610a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53612a(axvz axvz) {
        axvx axvx = (axvx) this.f96488i.f96497d.mo53632b(axvz);
        if (axvx != null) {
            axvx.mo53650g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo53613b() {
        for (axvx axvx : this.f96488i.f96497d.mo53630a()) {
            try {
                axvx.mo53650g();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(axvx.f96513a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Error while cleaning up channel ");
                sb.append(valueOf);
                Log.e("ChannelManager", sb.toString(), e);
            }
        }
        this.f96488i.f96497d.f96509a.clear();
        ((ayfk) this.f96488i.f96495b).f97481a.clear();
    }

    public final void run() {
        if (!this.f96485a || this.f96488i.f96499f.get()) {
            this.f96487h = true;
            try {
                mo53610a();
                if (!this.f96487h || !this.f96488i.f96499f.get() || !this.f96488i.f96495b.mo53618a()) {
                    return;
                }
            } catch (RuntimeException e) {
                Log.w("ChannelManager", "Uncaught exception.", e);
                axvx axvx = this.f96486g;
                if (axvx != null) {
                    axvx.mo53650g();
                    this.f96488i.f96497d.mo53632b(this.f96486g.f96513a);
                    this.f96486g = null;
                }
                if (!this.f96487h || !this.f96488i.f96499f.get() || !this.f96488i.f96495b.mo53618a()) {
                    return;
                }
            } catch (Throwable th) {
                if (this.f96487h && this.f96488i.f96499f.get() && this.f96488i.f96495b.mo53618a()) {
                    axvr axvr = this.f96488i;
                    axvr.f96494a.removeCallbacks(axvr.f96500g);
                    axvr axvr2 = this.f96488i;
                    axvr2.f96494a.post(axvr2.f96500g);
                }
                throw th;
            }
            axvr axvr3 = this.f96488i;
            axvr3.f96494a.removeCallbacks(axvr3.f96500g);
            axvr axvr4 = this.f96488i;
            axvr4.f96494a.post(axvr4.f96500g);
        }
    }

    protected axvn(axvr axvr, boolean z) {
        this.f96488i = axvr;
        this.f96485a = z;
    }
}
