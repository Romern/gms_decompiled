package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: agiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agiz extends FutureTask implements Comparable {

    /* renamed from: a */
    final boolean f65656a;

    /* renamed from: b */
    final /* synthetic */ agjb f65657b;

    /* renamed from: c */
    private final long f65658c;

    /* renamed from: d */
    private final String f65659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agiz(agjb agjb, Runnable runnable, String str) {
        super(runnable, null);
        this.f65657b = agjb;
        sdo.m34959a((Object) str);
        long andIncrement = agjb.f65664f.getAndIncrement();
        this.f65658c = andIncrement;
        this.f65659d = str;
        this.f65656a = false;
        if (andIncrement == Long.MAX_VALUE) {
            agjb.mo35497E().f65564c.mo35435a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        agiz agiz = (agiz) obj;
        boolean z = this.f65656a;
        if (z != agiz.f65656a) {
            return !z ? 1 : -1;
        }
        long j = this.f65658c;
        long j2 = agiz.f65658c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f65657b.mo35497E().f65565d.mo35436a("Two tasks share the same index. index", Long.valueOf(this.f65658c));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f65657b.mo35497E().f65564c.mo35436a(this.f65659d, th);
        if (th instanceof agix) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agiz(agjb agjb, Callable callable, boolean z, String str) {
        super(callable);
        this.f65657b = agjb;
        sdo.m34959a((Object) str);
        long andIncrement = agjb.f65664f.getAndIncrement();
        this.f65658c = andIncrement;
        this.f65659d = str;
        this.f65656a = z;
        if (andIncrement == Long.MAX_VALUE) {
            agjb.mo35497E().f65564c.mo35435a("Tasks index overflow");
        }
    }
}
