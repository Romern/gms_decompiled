package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BasePendingResult extends rke {

    /* renamed from: f */
    static final ThreadLocal f30118f = new rlo();

    /* renamed from: l */
    public static final /* synthetic */ int f30119l = 0;

    /* renamed from: a */
    private final CountDownLatch f30120a;

    /* renamed from: b */
    private final ArrayList f30121b;

    /* renamed from: c */
    private rkl f30122c;

    /* renamed from: d */
    private final AtomicReference f30123d;

    /* renamed from: e */
    private Status f30124e;

    /* renamed from: g */
    public final Object f30125g;

    /* renamed from: h */
    protected final rlp f30126h;

    /* renamed from: i */
    public final WeakReference f30127i;

    /* renamed from: j */
    public rkk f30128j;

    /* renamed from: k */
    public boolean f30129k;

    /* renamed from: m */
    private volatile boolean f30130m;
    private rlq mResultGuardian;

    /* renamed from: n */
    private boolean f30131n;

    /* renamed from: o */
    private boolean f30132o;

    /* renamed from: p */
    private sce f30133p;

    /* renamed from: q */
    private volatile rkp f30134q;

    @Deprecated
    BasePendingResult() {
        this.f30125g = new Object();
        this.f30120a = new CountDownLatch(1);
        this.f30121b = new ArrayList();
        this.f30123d = new AtomicReference();
        this.f30129k = false;
        this.f30126h = new rlp(Looper.getMainLooper());
        this.f30127i = new WeakReference(null);
    }

    /* renamed from: b */
    public static rkl m22491b(rkl rkl) {
        if (rkl != null) {
            return new rlk(adzn.f62964b.mo25770a(), rkl);
        }
        return null;
    }

    /* renamed from: c */
    private final void m22493c(rkk rkk) {
        this.f30128j = rkk;
        this.f30133p = null;
        this.f30120a.countDown();
        this.f30124e = this.f30128j.mo7183bo();
        if (this.f30131n) {
            this.f30122c = null;
        } else if (this.f30122c != null) {
            this.f30126h.removeMessages(2);
            this.f30126h.mo24865a(this.f30122c, mo23598d());
        } else if (this.f30128j instanceof rkh) {
            this.mResultGuardian = new rlq(this);
        }
        ArrayList arrayList = this.f30121b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rkd) arrayList.get(i)).mo24807a(this.f30124e);
        }
        this.f30121b.clear();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: d */
    private final rkk mo23598d() {
        rkk rkk;
        synchronized (this.f30125g) {
            sdo.m34971a(!this.f30130m, (Object) "Result has already been consumed.");
            sdo.m34971a(mo17720e(), (Object) "Result is not ready.");
            rkk = this.f30128j;
            this.f30128j = null;
            this.f30122c = null;
            this.f30130m = true;
        }
        rpd rpd = (rpd) this.f30123d.getAndSet(null);
        if (rpd != null) {
            rpd.f43477a.f43480c.remove(this);
        }
        return rkk;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final rkk mo9455a() {
        sdo.m34973b("await must not be called on the UI thread");
        sdo.m34971a(!this.f30130m, (Object) "Result has already been consumed");
        sdo.m34971a(true, (Object) "Cannot await if then() has been called.");
        try {
            this.f30120a.await();
        } catch (InterruptedException e) {
            mo17719d(Status.f30108b);
        }
        sdo.m34971a(mo17720e(), (Object) "Result is not ready.");
        return mo23598d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract rkk mo11187b(Status status);

    /* renamed from: e */
    public final boolean mo17720e() {
        return this.f30120a.getCount() == 0;
    }

    /* renamed from: f */
    public final void mo17721f() {
        boolean z = true;
        if (!this.f30129k && !((Boolean) f30118f.get()).booleanValue()) {
            z = false;
        }
        this.f30129k = z;
    }

    /* renamed from: b */
    public static void m22492b(rkk rkk) {
        if (rkk instanceof rkh) {
            try {
                ((rkh) rkk).mo12460c();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(rkk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final rkk mo9456a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            sdo.m34973b("await must not be called on the UI thread when time is greater than zero.");
        }
        sdo.m34971a(!this.f30130m, (Object) "Result has already been consumed.");
        sdo.m34971a(true, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.f30120a.await(j, timeUnit)) {
                mo17719d(Status.f30110d);
            }
        } catch (InterruptedException e) {
            mo17719d(Status.f30108b);
        }
        sdo.m34971a(mo17720e(), (Object) "Result is not ready.");
        return mo23598d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo9460b() {
        synchronized (this.f30125g) {
            if (!this.f30131n && !this.f30130m) {
                sce sce = this.f30133p;
                if (sce != null) {
                    try {
                        sce.mo25383a();
                    } catch (RemoteException e) {
                    }
                }
                m22492b(this.f30128j);
                this.f30131n = true;
                m22493c(mo11187b(Status.f30111e));
            }
        }
    }

    /* renamed from: d */
    public final void mo17719d(Status status) {
        synchronized (this.f30125g) {
            if (!mo17720e()) {
                mo17716a(mo11187b(status));
                this.f30132o = true;
            }
        }
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.f30125g = new Object();
        this.f30120a = new CountDownLatch(1);
        this.f30121b = new ArrayList();
        this.f30123d = new AtomicReference();
        this.f30129k = false;
        this.f30126h = new rlp(looper);
        this.f30127i = new WeakReference(null);
    }

    /* renamed from: c */
    public final boolean mo9461c() {
        boolean z;
        synchronized (this.f30125g) {
            z = this.f30131n;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo9457a(rkd rkd) {
        boolean z;
        if (rkd != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Callback cannot be null.");
        synchronized (this.f30125g) {
            if (mo17720e()) {
                rkd.mo24807a(this.f30124e);
            } else {
                this.f30121b.add(new rll(adzn.f62964b.mo25770a(), rkd));
            }
        }
    }

    protected BasePendingResult(rkb rkb) {
        this.f30125g = new Object();
        this.f30120a = new CountDownLatch(1);
        this.f30121b = new ArrayList();
        this.f30123d = new AtomicReference();
        this.f30129k = false;
        this.f30126h = new rlp(rkb == null ? Looper.getMainLooper() : rkb.mo24799c());
        this.f30127i = new WeakReference(rkb);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo17716a(rkk rkk) {
        synchronized (this.f30125g) {
            if (this.f30132o || this.f30131n) {
                m22492b(rkk);
                return;
            }
            mo17720e();
            sdo.m34971a(!mo17720e(), (Object) "Results have already been set");
            sdo.m34971a(!this.f30130m, (Object) "Result has already been consumed");
            m22493c(rkk);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo9458a(rkl rkl) {
        synchronized (this.f30125g) {
            if (rkl != null) {
                sdo.m34971a(!this.f30130m, (Object) "Result has already been consumed.");
                sdo.m34971a(true, (Object) "Cannot set callbacks if then() has been called.");
                if (mo9461c()) {
                    return;
                }
                if (mo17720e()) {
                    this.f30126h.mo24865a(rkl, mo23598d());
                } else {
                    this.f30122c = m22491b(rkl);
                }
            } else {
                this.f30122c = null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo9459a(rkl rkl, long j, TimeUnit timeUnit) {
        synchronized (this.f30125g) {
            if (rkl != null) {
                sdo.m34971a(!this.f30130m, (Object) "Result has already been consumed.");
                sdo.m34971a(true, (Object) "Cannot set callbacks if then() has been called.");
                if (mo9461c()) {
                    return;
                }
                if (!mo17720e()) {
                    this.f30122c = m22491b(rkl);
                    rlp rlp = this.f30126h;
                    rlp.sendMessageDelayed(rlp.obtainMessage(2, this), timeUnit.toMillis(j));
                } else {
                    this.f30126h.mo24865a(rkl, mo23598d());
                }
            } else {
                this.f30122c = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo17717a(rpd rpd) {
        this.f30123d.set(rpd);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17718a(sce sce) {
        synchronized (this.f30125g) {
            this.f30133p = sce;
        }
    }
}
