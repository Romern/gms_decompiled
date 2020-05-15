package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: bqdf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqdf extends bqfk implements Runnable {

    /* renamed from: a */
    bqgg f140497a;

    /* renamed from: b */
    Class f140498b;

    /* renamed from: c */
    Object f140499c;

    public bqdf(bqgg bqgg, Class cls, Object obj) {
        bmxy.m108581a(bqgg);
        this.f140497a = bqgg;
        bmxy.m108581a(cls);
        this.f140498b = cls;
        bmxy.m108581a(obj);
        this.f140499c = obj;
    }

    /* renamed from: a */
    public static bqgg m112619a(bqgg bqgg, Class cls, bmxj bmxj, Executor executor) {
        bqde bqde = new bqde(bqgg, cls, bmxj);
        bqgg.mo741a(bqde, bqgs.m112814a(executor, bqde));
        return bqde;
    }

    /* renamed from: a */
    public abstract Object mo69123a(Object obj, Throwable th);

    /* renamed from: a */
    public abstract void mo69124a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        mo69135a((Future) this.f140497a);
        this.f140497a = null;
        this.f140498b = null;
        this.f140499c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        String str;
        bqgg bqgg = this.f140497a;
        Class cls = this.f140498b;
        Object obj = this.f140499c;
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
        if (cls != null && obj != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (bi == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            return bi.length() == 0 ? new String(valueOf4) : valueOf4.concat(bi);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    public final void run() {
        Object obj;
        Throwable th;
        NullPointerException th2;
        bqgg bqgg = this.f140497a;
        Class cls = this.f140498b;
        Object obj2 = this.f140499c;
        boolean z = true;
        boolean z2 = (bqgg == null) | (cls == null);
        if (obj2 != null) {
            z = false;
        }
        if ((!z && !z2) && !isCancelled()) {
            this.f140497a = null;
            try {
                if (bqgg instanceof bqhj) {
                    th = ((bqhj) bqgg).mo69141f();
                } else {
                    th = null;
                }
                if (th == null) {
                    obj = bqga.m112780a((Future) bqgg);
                } else {
                    obj = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    String valueOf = String.valueOf(bqgg.getClass());
                    String valueOf2 = String.valueOf(e.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
                    sb.append("Future type ");
                    sb.append(valueOf);
                    sb.append(" threw ");
                    sb.append(valueOf2);
                    sb.append(" without a cause");
                    th2 = new NullPointerException(sb.toString());
                } else {
                    th2 = cause;
                }
                obj = null;
                if (th == null) {
                }
            } catch (Throwable th3) {
                th2 = th3;
                obj = null;
                if (th == null) {
                }
            }
            if (th == null) {
                mo69138b(obj);
            } else if (cls.isInstance(th)) {
                try {
                    Object a = mo69123a(obj2, th);
                    this.f140498b = null;
                    this.f140499c = null;
                    mo69124a(a);
                } catch (Throwable th4) {
                    this.f140498b = null;
                    this.f140499c = null;
                    throw th4;
                }
            } else {
                mo69137b(bqgg);
            }
        }
    }

    /* renamed from: a */
    public static bqgg m112620a(bqgg bqgg, Class cls, bqeh bqeh, Executor executor) {
        bqdd bqdd = new bqdd(bqgg, cls, bqeh);
        bqgg.mo741a(bqdd, bqgs.m112814a(executor, bqdd));
        return bqdd;
    }
}
