package com.google.android.gms.ads.internal.scionintegration;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.measurement.C0739b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.ads.internal.scionintegration.j */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0590j {

    /* renamed from: a */
    public final Object f8882a = new Object();

    /* renamed from: b */
    public String f8883b = null;

    /* renamed from: c */
    final AtomicBoolean f8884c = new AtomicBoolean(false);

    /* renamed from: d */
    public final AtomicReference f8885d;

    /* renamed from: e */
    private final AtomicReference f8886e = new AtomicReference(null);

    /* renamed from: f */
    private final AtomicInteger f8887f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference f8888g = new AtomicReference(null);

    /* renamed from: h */
    private final ConcurrentMap f8889h;

    /* renamed from: i */
    private final BlockingQueue f8890i;

    public C0590j() {
        new AtomicReference(null);
        this.f8889h = new ConcurrentHashMap(9);
        this.f8885d = new AtomicReference(null);
        this.f8890i = new ArrayBlockingQueue(20);
    }

    /* renamed from: a */
    private final ThreadPoolExecutor m5586a() {
        if (this.f8886e.get() == null) {
            this.f8886e.compareAndSet(null, new ThreadPoolExecutor(((Integer) C0371o.f8270w.mo6604a()).intValue(), ((Integer) C0371o.f8270w.mo6604a()).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C0588h()));
        }
        return (ThreadPoolExecutor) this.f8886e.get();
    }

    /* renamed from: c */
    static final boolean m5589c(Context context) {
        if (!((Boolean) C0371o.f8271x.mo6604a()).booleanValue() || waq.m41673a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C0371o.f8272y.mo6604a()).intValue()) {
            return false;
        }
        if (((Boolean) C0371o.f8273z.mo6604a()).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException e) {
            }
        }
        return true;
    }

    /* renamed from: b */
    public final String mo6774b(Context context) {
        if (!mo6773a(context)) {
            return null;
        }
        long longValue = ((Long) C0371o.f8269v.mo6604a()).longValue();
        if (!m5589c(context)) {
            if (longValue < 0) {
                return (String) mo6769a("getAppInstanceId", context);
            }
            try {
                return (String) m5586a().submit(new C0586f(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                return "TIME_OUT";
            } catch (Exception e2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) mo6770a("getAppInstanceId", (Object) null, C0584d.f8876a);
        } else {
            try {
                return (String) m5586a().submit(new C0585e(this)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e3) {
                return "TIME_OUT";
            } catch (Exception e4) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, android.content.Context):java.lang.Object
      com.google.android.gms.ads.internal.scionintegration.j.a(android.content.Context, java.lang.String):void
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void */
    /* renamed from: a */
    private final void m5587a(Context context, String str, String str2) {
        if (mo6773a(context)) {
            Bundle bundle = new Bundle();
            try {
                bundle.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                C0633h.m5669b(str2.length() == 0 ? new String("Invalid event ID: ") : "Invalid event ID: ".concat(str2), e);
            }
            if ("_ac".equals(str)) {
                bundle.putInt("_r", 1);
            }
            Method method = null;
            if (m5589c(context)) {
                synchronized (this.f8885d) {
                    FutureTask futureTask = new FutureTask(new C0581a(this, "logEventInternal"), null);
                    if (this.f8885d.get() == null) {
                        this.f8890i.offer(futureTask);
                    } else {
                        futureTask.run();
                    }
                }
            } else if (m5588a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8888g)) {
                Method method2 = (Method) this.f8889h.get("logEventInternal");
                if (method2 == null) {
                    try {
                        Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f8889h.put("logEventInternal", declaredMethod);
                        method = declaredMethod;
                    } catch (Exception e2) {
                        mo6772a("logEventInternal", true);
                    }
                } else {
                    method = method2;
                }
                try {
                    method.invoke(this.f8888g.get(), "am", str, bundle);
                } catch (Exception e3) {
                    mo6772a("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo6775b(Context context, String str) {
        m5587a(context, "_ai", str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, android.content.Context):java.lang.Object
      com.google.android.gms.ads.internal.scionintegration.j.a(android.content.Context, java.lang.String):void
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void */
    /* renamed from: a */
    private final boolean m5588a(Context context, String str, AtomicReference atomicReference) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                mo6772a("getInstance", true);
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, android.content.Context):java.lang.Object
      com.google.android.gms.ads.internal.scionintegration.j.a(android.content.Context, java.lang.String):void
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final Object mo6769a(String str, Context context) {
        if (!m5588a(context, "com.google.android.gms.measurement.AppMeasurement", this.f8888g)) {
            return null;
        }
        Method method = (Method) this.f8889h.get(str);
        if (method == null) {
            try {
                method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
                this.f8889h.put(str, method);
            } catch (Exception e) {
                mo6772a(str, false);
                method = null;
            }
        }
        try {
            return method.invoke(this.f8888g.get(), new Object[0]);
        } catch (Exception e2) {
            mo6772a(str, true);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, android.content.Context):java.lang.Object
      com.google.android.gms.ads.internal.scionintegration.j.a(android.content.Context, java.lang.String):void
      com.google.android.gms.ads.internal.scionintegration.j.a(java.lang.String, boolean):void */
    /* renamed from: a */
    public final Object mo6770a(String str, Object obj, C0589i iVar) {
        synchronized (this.f8885d) {
            if (((C0739b) this.f8885d.get()) != null) {
                try {
                    Object a = iVar.mo6765a((C0739b) this.f8885d.get());
                    return a;
                } catch (Exception e) {
                    mo6772a(str, false);
                    return obj;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6771a(Context context, String str) {
        m5587a(context, "_ac", str);
    }

    /* renamed from: a */
    public final void mo6772a(String str, boolean z) {
        if (!this.f8884c.get()) {
            StringBuilder sb = new StringBuilder(str.length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C0633h.m5672d(sb.toString());
            if (z) {
                C0633h.m5672d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f8884c.set(true);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6773a(Context context) {
        if (!((Boolean) C0371o.f8264q.mo6604a()).booleanValue() || this.f8884c.get()) {
            return false;
        }
        if (((Boolean) C0371o.f8187A.mo6604a()).booleanValue()) {
            return true;
        }
        if (this.f8887f.get() == -1) {
            if (!C0341h.m5274a().mo6807b(context)) {
                C0341h.m5274a();
                int b = rfj.f42872d.mo24590b(context);
                if (b == 0 || b == 2) {
                    C0633h.m5672d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                    this.f8887f.set(0);
                }
            }
            this.f8887f.set(1);
        }
        if (this.f8887f.get() == 1) {
            return true;
        }
        return false;
    }
}
