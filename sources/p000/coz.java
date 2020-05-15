package p000;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: coz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class coz implements Handler.Callback {

    /* renamed from: a */
    final Map f11752a = new HashMap();

    /* renamed from: b */
    final Map f11753b = new HashMap();

    /* renamed from: c */
    private volatile ccd f11754c;

    /* renamed from: d */
    private final Handler f11755d;

    public coz() {
        new C1223np();
        new C1223np();
        new Bundle();
        this.f11755d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private static void m7236a(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    public static boolean m7237b(Context context) {
        Activity c = m7238c(context);
        return c == null || !c.isFinishing();
    }

    /* renamed from: c */
    private static Activity m7238c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m7238c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        C1050hj hjVar;
        int i = message.what;
        Object obj = null;
        if (i == 1) {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            hjVar = fragmentManager;
            obj = this.f11752a.remove(fragmentManager);
            z = true;
        } else if (i != 2) {
            z = false;
            hjVar = null;
        } else {
            C1050hj hjVar2 = (C1050hj) message.obj;
            hjVar = hjVar2;
            obj = this.f11753b.remove(hjVar2);
            z = true;
        }
        if (!z || obj != null || !Log.isLoggable("RMRetriever", 5)) {
            return z;
        }
        String valueOf = String.valueOf(hjVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("Failed to remove expected request manager fragment, manager: ");
        sb.append(valueOf);
        Log.w("RMRetriever", sb.toString());
        return true;
    }

    /* renamed from: a */
    public final ccd mo8074a(Context context) {
        if (context != null) {
            if (crd.m7397b() && !(context instanceof Application)) {
                if (context instanceof C1021gj) {
                    C1021gj gjVar = (C1021gj) context;
                    if (crd.m7400c()) {
                        return mo8074a(gjVar.getApplicationContext());
                    }
                    m7236a((Activity) gjVar);
                    cpd a = mo8076a(gjVar.mo11924aK(), m7237b(gjVar));
                    ccd ccd = a.f11768c;
                    if (ccd != null) {
                        return ccd;
                    }
                    ccd a2 = coy.m7235a(cbo.m3902a(gjVar), a.f11766a, a.f11767b, gjVar);
                    a.f11768c = a2;
                    return a2;
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (crd.m7400c()) {
                        return mo8074a(activity.getApplicationContext());
                    }
                    m7236a(activity);
                    cox a3 = mo8075a(activity.getFragmentManager(), m7237b(activity));
                    ccd ccd2 = a3.f11749c;
                    if (ccd2 != null) {
                        return ccd2;
                    }
                    ccd a4 = coy.m7235a(cbo.m3902a(activity), a3.f11747a, a3.f11748b, activity);
                    a3.f11749c = a4;
                    return a4;
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo8074a(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f11754c == null) {
                synchronized (this) {
                    if (this.f11754c == null) {
                        this.f11754c = coy.m7235a(cbo.m3902a(context.getApplicationContext()), new con(), new cos(), context.getApplicationContext());
                    }
                }
            }
            return this.f11754c;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: a */
    public final cox mo8075a(FragmentManager fragmentManager, boolean z) {
        cox cox = (cox) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (cox == null && (cox = (cox) this.f11752a.get(fragmentManager)) == null) {
            cox = new cox();
            if (z) {
                cox.f11747a.mo4037a();
            }
            this.f11752a.put(fragmentManager, cox);
            fragmentManager.beginTransaction().add(cox, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f11755d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return cox;
    }

    /* renamed from: a */
    public final cpd mo8076a(C1050hj hjVar, boolean z) {
        cpd cpd = (cpd) hjVar.mo12515a("com.bumptech.glide.manager");
        if (cpd == null && (cpd = (cpd) this.f11753b.get(hjVar)) == null) {
            cpd = new cpd();
            if (z) {
                cpd.f11766a.mo4037a();
            }
            this.f11753b.put(hjVar, cpd);
            C1058hr a = hjVar.mo12516a();
            a.mo12686a(cpd, "com.bumptech.glide.manager");
            a.mo11295g();
            this.f11755d.obtainMessage(2, hjVar).sendToTarget();
        }
        return cpd;
    }
}
