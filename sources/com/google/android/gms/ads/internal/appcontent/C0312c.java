package com.google.android.gms.ads.internal.appcontent;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.state.C0600g;
import com.google.android.gms.ads.internal.util.C0658o;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.appcontent.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0312c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Activity f8067a;

    /* renamed from: b */
    public final Object f8068b = new Object();

    /* renamed from: c */
    public boolean f8069c = true;

    /* renamed from: d */
    public boolean f8070d = false;

    /* renamed from: e */
    public final List f8071e = new ArrayList();

    /* renamed from: f */
    private final List f8072f = new ArrayList();

    /* renamed from: g */
    private Runnable f8073g;

    /* renamed from: a */
    private final void m5245a(Activity activity) {
        synchronized (this.f8068b) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f8067a = activity;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f8068b) {
            Activity activity2 = this.f8067a;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f8067a = null;
                }
                Iterator it = this.f8072f.iterator();
                while (it.hasNext()) {
                    try {
                        if (((C0315f) it.next()).mo6547a()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C0387d.m5366d().mo6783a(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        C0633h.m5666a(e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m5245a(activity);
        synchronized (this.f8068b) {
            for (C0315f fVar : this.f8072f) {
                try {
                    fVar.mo6548b();
                } catch (Exception e) {
                    C0387d.m5366d().mo6783a(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    C0633h.m5666a(e);
                }
            }
        }
        this.f8070d = true;
        if (this.f8073g != null) {
            C0658o.f9012a.removeCallbacks(this.f8073g);
        }
        adzt adzt = C0658o.f9012a;
        C0311b bVar = new C0311b(this);
        this.f8073g = bVar;
        adzt.postDelayed(bVar, 0);
    }

    public final void onActivityResumed(Activity activity) {
        m5245a(activity);
        this.f8070d = false;
        boolean z = !this.f8069c;
        this.f8069c = true;
        if (this.f8073g != null) {
            C0658o.f9012a.removeCallbacks(this.f8073g);
        }
        synchronized (this.f8068b) {
            for (C0315f fVar : this.f8072f) {
                try {
                    fVar.mo6549c();
                } catch (Exception e) {
                    C0387d.m5366d().mo6783a(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    C0633h.m5666a(e);
                }
            }
            if (z) {
                for (C0600g gVar : this.f8071e) {
                    try {
                        gVar.mo6787a(true);
                    } catch (Exception e2) {
                        C0633h.m5666a(e2);
                    }
                }
            } else {
                C0633h.m5664a("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m5245a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
