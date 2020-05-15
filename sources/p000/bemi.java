package p000;

import java.util.concurrent.Callable;

/* renamed from: bemi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bemi implements Callable {

    /* renamed from: a */
    volatile boolean f111822a;

    /* renamed from: b */
    final /* synthetic */ benr f111823b;

    /* renamed from: c */
    final /* synthetic */ bens f111824c;

    /* renamed from: d */
    final /* synthetic */ bemk f111825d;

    public bemi(bemk bemk, benr benr, bens bens) {
        this.f111825d = bemk;
        this.f111823b = benr;
        this.f111824c = bens;
    }

    public final Object call() {
        bmxy.m108601b(!this.f111825d.f111829a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.f111825d.f111829a.beginTransactionWithListener(new bemh(this));
        try {
            this.f111822a = true;
            Object a = this.f111823b.mo56134a(this.f111824c);
            bens.m95324a();
            this.f111825d.f111829a.setTransactionSuccessful();
            this.f111822a = false;
            return a;
        } finally {
            this.f111825d.f111829a.endTransaction();
        }
    }
}
