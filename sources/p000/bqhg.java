package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: bqhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqhg extends bqfk implements RunnableFuture {

    /* renamed from: a */
    private volatile bqgf f140662a;

    public bqhg(bqeg bqeg) {
        this.f140662a = new bqhe(this, bqeg);
    }

    /* renamed from: a */
    static bqhg m112834a(Runnable runnable, Object obj) {
        return new bqhg(Executors.callable(runnable, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        bqgf bqgf;
        if (mo69140e() && (bqgf = this.f140662a) != null) {
            bqgf.mo69226e();
        }
        this.f140662a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        bqgf bqgf = this.f140662a;
        if (bqgf == null) {
            return super.mo60815bi();
        }
        String valueOf = String.valueOf(bqgf);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        bqgf bqgf = this.f140662a;
        if (bqgf != null) {
            bqgf.run();
        }
        this.f140662a = null;
    }

    public bqhg(Callable callable) {
        this.f140662a = new bqhf(this, callable);
    }

    /* renamed from: a */
    static bqhg m112835a(Callable callable) {
        return new bqhg(callable);
    }
}
