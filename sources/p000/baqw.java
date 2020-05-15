package p000;

import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: baqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class baqw implements Runnable {

    /* renamed from: a */
    final long f101568a = this.f101570c.f101583f.getAndIncrement();

    /* renamed from: b */
    final /* synthetic */ bqgg f101569b;

    /* renamed from: c */
    final /* synthetic */ baqy f101570c;

    public baqw(baqy baqy, bqgg bqgg) {
        this.f101570c = baqy;
        this.f101569b = bqgg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0100 A[RETURN] */
    public final void run() {
        boolean z;
        ExecutionException e;
        boolean z2;
        int ordinal;
        baqy baqy = this.f101570c;
        int i = baqy.f101576h;
        synchronized (baqy.f101579b) {
            baqy baqy2 = this.f101570c;
            baqy2.f101582e--;
            try {
                Object a = bqga.m112780a((Future) this.f101569b);
                baqx baqx = baqx.NO_RESULT;
                int ordinal2 = this.f101570c.f101580c.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        ((bqgy) this.f101570c.f101581d).mo69138b(a);
                        z2 = this.f101570c.mo55894a(a, this.f101568a);
                        try {
                            this.f101570c.mo55892a(baqx.GOOD_RESULT);
                            z = z2;
                        } catch (ExecutionException e2) {
                            e = e2;
                            baqx baqx2 = baqx.NO_RESULT;
                            ordinal = this.f101570c.f101580c.ordinal();
                            if (ordinal != 0) {
                            }
                            String valueOf = String.valueOf(this.f101570c.f101580c);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
                            sb.append("When a Future is returning, state couldn't have been ");
                            sb.append(valueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                    } else if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            z = false;
                        } else {
                            z = this.f101570c.mo55894a(a, this.f101568a);
                        }
                    }
                    baqy baqy3 = this.f101570c;
                    baqy3.f101580c.mo55891a(baqy3);
                }
                String valueOf2 = String.valueOf(this.f101570c.f101580c);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
                sb2.append("When a Future is returning, state couldn't have been ");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            } catch (ExecutionException e3) {
                e = e3;
                z2 = false;
                baqx baqx22 = baqx.NO_RESULT;
                ordinal = this.f101570c.f101580c.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ((bqgy) this.f101570c.f101581d).mo69136a((Throwable) e);
                        baqy baqy4 = this.f101570c;
                        if (baqy4.f101582e <= 0) {
                            baqy4.f101581d = bqga.m112777a(e.getCause());
                            this.f101570c.mo55892a(baqx.BAD_RESULT);
                        } else {
                            baqy4.f101581d = bqgy.m112818c();
                        }
                    } else if (ordinal != 2) {
                    }
                    z = z2;
                    baqy baqy32 = this.f101570c;
                    baqy32.f101580c.mo55891a(baqy32);
                    if (!z) {
                    }
                }
                String valueOf3 = String.valueOf(this.f101570c.f101580c);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 53);
                sb3.append("When a Future is returning, state couldn't have been ");
                sb3.append(valueOf3);
                throw new IllegalStateException(sb3.toString());
            }
        }
        if (!z) {
            synchronized (this.f101570c.f101584g) {
                for (Pair pair : this.f101570c.f101584g) {
                    try {
                        ((Executor) pair.second).execute((Runnable) pair.first);
                    } catch (RuntimeException e4) {
                        ((achw) this.f101570c.f101578a.mo16713a()).mo25416d("[FutureCoalescer] RuntimeException while executing success listeners", new Object[0]);
                    }
                }
            }
        }
    }
}
