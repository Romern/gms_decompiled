package p000;

import java.util.concurrent.Callable;

/* renamed from: soi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class soi extends snx {

    /* renamed from: d */
    final /* synthetic */ soj f44861d;

    /* renamed from: e */
    private boolean f44862e = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public soi(soj soj, Callable callable) {
        super(soj, callable);
        this.f44861d = soj;
        soj.f44863e.mo49117b();
    }

    /* renamed from: d */
    private final void m35753d() {
        if (this.f44862e) {
            this.f44861d.f44863e.mo49120c();
            this.f44862e = false;
        }
    }

    /* renamed from: b */
    public final Runnable mo25803b() {
        this.f44817a.lock();
        try {
            m35753d();
            return super.mo25803b();
        } finally {
            this.f44817a.unlock();
        }
    }

    public final boolean cancel(boolean z) {
        this.f44817a.lock();
        try {
            boolean cancel = super.cancel(z);
            m35753d();
            return cancel;
        } finally {
            this.f44817a.unlock();
        }
    }

    public final void run() {
        this.f44817a.lock();
        try {
            super.run();
            m35753d();
        } finally {
            this.f44817a.unlock();
        }
    }
}
