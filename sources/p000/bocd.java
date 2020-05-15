package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bocd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bocd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgy f132529a;

    /* renamed from: b */
    final /* synthetic */ bocg f132530b;

    public bocd(bocg bocg, bqgy bqgy) {
        this.f132530b = bocg;
        this.f132529a = bqgy;
    }

    public final void run() {
        try {
            if (!this.f132529a.isCancelled() && bqga.m112780a((Future) this.f132529a) == bocg.f132538b) {
                return;
            }
        } catch (ExecutionException e) {
        }
        this.f132530b.mo69137b((bqgg) this.f132529a);
    }
}
