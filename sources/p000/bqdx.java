package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bqdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqdx extends bqfk implements Runnable {

    /* renamed from: a */
    bqgg f140527a;

    /* renamed from: b */
    Object f140528b;

    public bqdx(bqgg bqgg, Object obj) {
        bmxy.m108581a(bqgg);
        this.f140527a = bqgg;
        bmxy.m108581a(obj);
        this.f140528b = obj;
    }

    /* renamed from: a */
    public static bqgg m112673a(bqgg bqgg, bmxj bmxj, Executor executor) {
        bmxy.m108581a(bmxj);
        bqdw bqdw = new bqdw(bqgg, bmxj);
        bqgg.mo741a(bqdw, bqgs.m112814a(executor, bqdw));
        return bqdw;
    }

    /* renamed from: a */
    public abstract Object mo69150a(Object obj, Object obj2);

    /* renamed from: a */
    public abstract void mo69124a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        mo69135a((Future) this.f140527a);
        this.f140527a = null;
        this.f140528b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        String str;
        bqgg bqgg = this.f140527a;
        Object obj = this.f140528b;
        String bi = super.mo60815bi();
        if (bqgg != null) {
            String valueOf = String.valueOf(bqgg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (obj != null) {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (bi == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            return bi.length() == 0 ? new String(valueOf3) : valueOf3.concat(bi);
        }
    }

    public final void run() {
        bqgg bqgg = this.f140527a;
        Object obj = this.f140528b;
        boolean z = true;
        boolean isCancelled = isCancelled() | (bqgg == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f140527a = null;
            if (bqgg.isCancelled()) {
                mo69137b(bqgg);
                return;
            }
            try {
                try {
                    Object a = mo69150a(obj, bqga.m112780a((Future) bqgg));
                    this.f140528b = null;
                    mo69124a(a);
                } catch (Throwable th) {
                    this.f140528b = null;
                    throw th;
                }
            } catch (CancellationException e) {
                cancel(false);
            } catch (ExecutionException e2) {
                mo69136a(e2.getCause());
            } catch (RuntimeException e3) {
                mo69136a((Throwable) e3);
            } catch (Error e4) {
                mo69136a((Throwable) e4);
            }
        }
    }

    /* renamed from: a */
    public static bqgg m112674a(bqgg bqgg, bqeh bqeh, Executor executor) {
        bmxy.m108581a(executor);
        bqdv bqdv = new bqdv(bqgg, bqeh);
        bqgg.mo741a(bqdv, bqgs.m112814a(executor, bqdv));
        return bqdv;
    }
}
