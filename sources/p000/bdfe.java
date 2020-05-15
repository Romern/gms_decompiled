package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdfe implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    public final List f105429a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final AtomicInteger f105430b = new AtomicInteger();

    /* renamed from: c */
    private final AtomicInteger f105431c = new AtomicInteger();

    /* renamed from: d */
    private final AtomicInteger f105432d = new AtomicInteger();

    /* renamed from: e */
    private final AtomicInteger f105433e = new AtomicInteger();

    /* renamed from: f */
    private final AtomicInteger f105434f = new AtomicInteger();

    /* renamed from: g */
    private final AtomicInteger f105435g = new AtomicInteger();

    /* renamed from: h */
    private Boolean f105436h;

    /* renamed from: i */
    private volatile String f105437i;

    /* renamed from: j */
    private volatile Activity f105438j;

    /* renamed from: a */
    private final void m90665a(Activity activity) {
        m90666a(Boolean.valueOf(bdjb.m90891b(activity.getApplicationContext())), activity);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f105431c.incrementAndGet();
        this.f105438j = null;
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdes) {
                ((bdes) bdfc).mo57945a();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f105435g.incrementAndGet();
        this.f105438j = null;
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdet) {
                ((bdet) bdfc).mo57946a();
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f105433e.incrementAndGet();
        this.f105437i = null;
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdeu) {
                ((bdeu) bdfc).mo57947a(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f105430b.incrementAndGet();
        this.f105438j = null;
        this.f105437i = activity.getClass().getSimpleName();
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdev) {
                ((bdev) bdfc).mo57948b(activity);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdew) {
                ((bdew) bdfc).mo57949a();
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f105432d.incrementAndGet();
        this.f105438j = null;
        m90665a(activity);
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdex) {
                ((bdex) bdfc).mo57950a(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        this.f105434f.incrementAndGet();
        this.f105438j = activity;
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdey) {
                ((bdey) bdfc).mo57951a();
            }
        }
        m90665a(activity);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        for (bdfc bdfc : this.f105429a) {
            if (bdfc instanceof bdfb) {
                ((bdfb) bdfc).mo57954a();
            }
        }
        if (i >= 20 && this.f105438j != null) {
            m90666a(false, this.f105438j);
        }
        this.f105438j = null;
    }

    /* renamed from: a */
    private final void m90666a(Boolean bool, Activity activity) {
        if (bool.equals(this.f105436h)) {
            bnrq bnrq = (bnrq) bdff.f105439a.mo68390d();
            bnrq.mo68432a("bdfe", "a", 245, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68420a("App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.f105436h = bool;
        if (bool.booleanValue()) {
            bnrq bnrq2 = (bnrq) bdff.f105439a.mo68390d();
            bnrq2.mo68432a("bdfe", "a", 250, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68405a("App transition to foreground");
            for (bdfc bdfc : this.f105429a) {
                if (bdfc instanceof bdfa) {
                    ((bdfa) bdfc).mo57953a(activity);
                }
            }
            return;
        }
        bnrq bnrq3 = (bnrq) bdff.f105439a.mo68390d();
        bnrq3.mo68432a("bdfe", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnrq3.mo68405a("App transition to background");
        for (bdfc bdfc2 : this.f105429a) {
            if (bdfc2 instanceof bdez) {
                ((bdez) bdfc2).mo57952b(activity);
            }
        }
    }
}
