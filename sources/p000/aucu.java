package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aucu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aucu {
    /* renamed from: a */
    public static aucb m76776a() {
        auck auck = new auck();
        auck.mo50400f();
        return auck;
    }

    /* renamed from: b */
    public static aucb m76785b(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return m76779a(collection).mo50363a(new aucp(collection));
        }
        return m76778a((Object) Collections.emptyList());
    }

    /* renamed from: c */
    public static aucb m76788c(Collection collection) {
        if (collection != null && !collection.isEmpty()) {
            return m76779a(collection).mo50382b(new aucq(collection));
        }
        return m76778a((Object) Collections.emptyList());
    }

    /* renamed from: a */
    public static aucb m76777a(Exception exc) {
        auck auck = new auck();
        auck.mo50397a(exc);
        return auck;
    }

    /* renamed from: a */
    public static aucb m76778a(Object obj) {
        auck auck = new auck();
        auck.mo50398a(obj);
        return auck;
    }

    /* renamed from: b */
    public static aucb m76786b(aucb... aucbArr) {
        return m76788c(Arrays.asList(aucbArr));
    }

    /* renamed from: a */
    public static aucb m76779a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return m76778a((Object) null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((aucb) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        auck auck = new auck();
        auct auct = new auct(collection.size(), auck);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            m76784a((aucb) it2.next(), auct);
        }
        return auck;
    }

    /* renamed from: b */
    private static Object m76787b(aucb aucb) {
        if (aucb.mo50384b()) {
            return aucb.mo50386d();
        }
        if (aucb.mo50385c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(aucb.mo50387e());
    }

    /* renamed from: a */
    public static aucb m76780a(Executor executor, Callable callable) {
        sdo.checkIfNull(executor, "Executor must not be null");
        sdo.checkIfNull(callable, "Callback must not be null");
        auck auck = new auck();
        executor.execute(new auco(auck, callable));
        return auck;
    }

    /* renamed from: a */
    public static aucb m76781a(aucb... aucbArr) {
        return m76779a((Collection) Arrays.asList(aucbArr));
    }

    /* renamed from: a */
    public static Object m76782a(aucb aucb) {
        sdo.m34960a();
        sdo.checkIfNull(aucb, "Task must not be null");
        if (aucb.mo50381a()) {
            return m76787b(aucb);
        }
        aucr aucr = new aucr();
        m76784a(aucb, aucr);
        aucr.f91406a.await();
        return m76787b(aucb);
    }

    /* renamed from: a */
    public static Object m76783a(aucb aucb, long j, TimeUnit timeUnit) {
        sdo.m34960a();
        sdo.checkIfNull(aucb, "Task must not be null");
        sdo.checkIfNull(timeUnit, "TimeUnit must not be null");
        if (aucb.mo50381a()) {
            return m76787b(aucb);
        }
        aucr aucr = new aucr();
        m76784a(aucb, aucr);
        if (aucr.f91406a.await(j, timeUnit)) {
            return m76787b(aucb);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubw):void
     arg types: [java.util.concurrent.Executor, aucs]
     candidates:
      aucb.a(java.util.concurrent.Executor, aubg):aucb
      aucb.a(java.util.concurrent.Executor, auca):aucb
      aucb.a(android.app.Activity, aubq):void
      aucb.a(android.app.Activity, aubt):void
      aucb.a(android.app.Activity, aubw):void
      aucb.a(com.google.android.chimera.Activity, aubq):void
      aucb.a(com.google.android.chimera.Activity, aubt):void
      aucb.a(com.google.android.chimera.Activity, aubw):void
      aucb.a(java.util.concurrent.Executor, aubn):void
      aucb.a(java.util.concurrent.Executor, aubq):void
      aucb.a(java.util.concurrent.Executor, aubt):void
      aucb.a(java.util.concurrent.Executor, aubw):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubt):void
     arg types: [java.util.concurrent.Executor, aucs]
     candidates:
      aucb.a(java.util.concurrent.Executor, aubg):aucb
      aucb.a(java.util.concurrent.Executor, auca):aucb
      aucb.a(android.app.Activity, aubq):void
      aucb.a(android.app.Activity, aubt):void
      aucb.a(android.app.Activity, aubw):void
      aucb.a(com.google.android.chimera.Activity, aubq):void
      aucb.a(com.google.android.chimera.Activity, aubt):void
      aucb.a(com.google.android.chimera.Activity, aubw):void
      aucb.a(java.util.concurrent.Executor, aubn):void
      aucb.a(java.util.concurrent.Executor, aubq):void
      aucb.a(java.util.concurrent.Executor, aubw):void
      aucb.a(java.util.concurrent.Executor, aubt):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aucb.a(java.util.concurrent.Executor, aubn):void
     arg types: [java.util.concurrent.Executor, aucs]
     candidates:
      aucb.a(java.util.concurrent.Executor, aubg):aucb
      aucb.a(java.util.concurrent.Executor, auca):aucb
      aucb.a(android.app.Activity, aubq):void
      aucb.a(android.app.Activity, aubt):void
      aucb.a(android.app.Activity, aubw):void
      aucb.a(com.google.android.chimera.Activity, aubq):void
      aucb.a(com.google.android.chimera.Activity, aubt):void
      aucb.a(com.google.android.chimera.Activity, aubw):void
      aucb.a(java.util.concurrent.Executor, aubq):void
      aucb.a(java.util.concurrent.Executor, aubt):void
      aucb.a(java.util.concurrent.Executor, aubw):void
      aucb.a(java.util.concurrent.Executor, aubn):void */
    /* renamed from: a */
    private static void m76784a(aucb aucb, aucs aucs) {
        aucb.mo50380a(auci.f91391b, (aubw) aucs);
        aucb.mo50379a(auci.f91391b, (aubt) aucs);
        aucb.mo50377a(auci.f91391b, (aubn) aucs);
    }
}
