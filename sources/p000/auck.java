package p000;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: auck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auck extends aucb {

    /* renamed from: a */
    public final Object f91393a = new Object();

    /* renamed from: b */
    public final aucd f91394b = new aucd();

    /* renamed from: c */
    public boolean f91395c;

    /* renamed from: d */
    public volatile boolean f91396d;

    /* renamed from: e */
    public Exception f91397e;

    /* renamed from: f */
    private Object f91398f;

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
    /* renamed from: g */
    private final void m76733g() {
        sdo.m34971a(!this.f91395c, (Object) "Task is already complete");
    }

    /* renamed from: h */
    private final void m76734h() {
        synchronized (this.f91393a) {
            if (this.f91395c) {
                this.f91394b.mo50388a(this);
            }
        }
    }

    /* renamed from: a */
    public final aucb mo50363a(aubg aubg) {
        return mo50365a(auci.f91390a, aubg);
    }

    /* renamed from: b */
    public final aucb mo50382b(aubg aubg) {
        return mo50383b(auci.f91390a, aubg);
    }

    /* renamed from: c */
    public final boolean mo50385c() {
        return this.f91396d;
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
    public final Object mo50386d() {
        Object obj;
        synchronized (this.f91393a) {
            sdo.m34971a(this.f91395c, (Object) "Task is not yet complete");
            if (!this.f91396d) {
                Exception exc = this.f91397e;
                if (exc == null) {
                    obj = this.f91398f;
                } else {
                    throw new aubz(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    /* renamed from: e */
    public final Exception mo50387e() {
        Exception exc;
        synchronized (this.f91393a) {
            exc = this.f91397e;
        }
        return exc;
    }

    /* renamed from: f */
    public final void mo50400f() {
        synchronized (this.f91393a) {
            if (!this.f91395c) {
                this.f91395c = true;
                this.f91396d = true;
                this.f91394b.mo50388a(this);
            }
        }
    }

    /* renamed from: a */
    public final aucb mo50364a(auca auca) {
        return mo50366a(auci.f91390a, auca);
    }

    /* renamed from: b */
    public final aucb mo50383b(Executor executor, aubg aubg) {
        auck auck = new auck();
        this.f91394b.mo50389a(new aubk(aucn.m76766a(executor), aubg, auck));
        m76734h();
        return auck;
    }

    /* renamed from: a */
    public final aucb mo50365a(Executor executor, aubg aubg) {
        auck auck = new auck();
        this.f91394b.mo50389a(new aubi(aucn.m76766a(executor), aubg, auck));
        m76734h();
        return auck;
    }

    /* renamed from: b */
    public final boolean mo50384b() {
        boolean z;
        synchronized (this.f91393a) {
            z = false;
            if (this.f91395c && !this.f91396d && this.f91397e == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final aucb mo50366a(Executor executor, auca auca) {
        auck auck = new auck();
        this.f91394b.mo50389a(new auby(aucn.m76766a(executor), auca, auck));
        m76734h();
        return auck;
    }

    /* renamed from: b */
    public final boolean mo50399b(Object obj) {
        synchronized (this.f91393a) {
            if (this.f91395c) {
                return false;
            }
            this.f91395c = true;
            this.f91398f = obj;
            this.f91394b.mo50388a(this);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo50367a(Activity activity, aubq aubq) {
        aubp aubp = new aubp(aucn.m76766a(auci.f91390a), aubq);
        this.f91394b.mo50389a(aubp);
        aucj.m76729b(activity).mo50396a(aubp);
        m76734h();
    }

    /* renamed from: a */
    public final void mo50368a(Activity activity, aubt aubt) {
        aubs aubs = new aubs(aucn.m76766a(auci.f91390a), aubt);
        this.f91394b.mo50389a(aubs);
        aucj.m76729b(activity).mo50396a(aubs);
        m76734h();
    }

    /* renamed from: a */
    public final void mo50369a(Activity activity, aubw aubw) {
        aubv aubv = new aubv(aucn.m76766a(auci.f91390a), aubw);
        this.f91394b.mo50389a(aubv);
        aucj.m76729b(activity).mo50396a(aubv);
        m76734h();
    }

    /* renamed from: a */
    public final void mo50370a(aubn aubn) {
        mo50377a(auci.f91390a, aubn);
    }

    /* renamed from: a */
    public final void mo50371a(aubq aubq) {
        mo50378a(auci.f91390a, aubq);
    }

    /* renamed from: a */
    public final void mo50372a(aubt aubt) {
        mo50379a(auci.f91390a, aubt);
    }

    /* renamed from: a */
    public final void mo50373a(aubw aubw) {
        mo50380a(auci.f91390a, aubw);
    }

    /* renamed from: a */
    public final void mo50374a(com.google.android.chimera.Activity activity, aubq aubq) {
        aubp aubp = new aubp(aucn.m76766a(auci.f91390a), aubq);
        this.f91394b.mo50389a(aubp);
        aucj.m76730b(activity).mo50396a(aubp);
        m76734h();
    }

    /* renamed from: a */
    public final void mo50375a(com.google.android.chimera.Activity activity, aubt aubt) {
        aubs aubs = new aubs(aucn.m76766a(auci.f91390a), aubt);
        this.f91394b.mo50389a(aubs);
        aucj.m76730b(activity).mo50396a(aubs);
        m76734h();
    }

    /* renamed from: a */
    public final void mo50376a(com.google.android.chimera.Activity activity, aubw aubw) {
        aubv aubv = new aubv(aucn.m76766a(auci.f91390a), aubw);
        this.f91394b.mo50389a(aubv);
        aucj.m76730b(activity).mo50396a(aubv);
        m76734h();
    }

    /* renamed from: a */
    public final void mo50397a(Exception exc) {
        sdo.checkIfNull(exc, "Exception must not be null");
        synchronized (this.f91393a) {
            m76733g();
            this.f91395c = true;
            this.f91397e = exc;
        }
        this.f91394b.mo50388a(this);
    }

    /* renamed from: a */
    public final void mo50398a(Object obj) {
        synchronized (this.f91393a) {
            m76733g();
            this.f91395c = true;
            this.f91398f = obj;
        }
        this.f91394b.mo50388a(this);
    }

    /* renamed from: a */
    public final void mo50377a(Executor executor, aubn aubn) {
        this.f91394b.mo50389a(new aubm(aucn.m76766a(executor), aubn));
        m76734h();
    }

    /* renamed from: a */
    public final void mo50378a(Executor executor, aubq aubq) {
        this.f91394b.mo50389a(new aubp(aucn.m76766a(executor), aubq));
        m76734h();
    }

    /* renamed from: a */
    public final void mo50379a(Executor executor, aubt aubt) {
        this.f91394b.mo50389a(new aubs(aucn.m76766a(executor), aubt));
        m76734h();
    }

    /* renamed from: a */
    public final void mo50380a(Executor executor, aubw aubw) {
        this.f91394b.mo50389a(new aubv(aucn.m76766a(executor), aubw));
        m76734h();
    }

    /* renamed from: a */
    public final boolean mo50381a() {
        boolean z;
        synchronized (this.f91393a) {
            z = this.f91395c;
        }
        return z;
    }
}
