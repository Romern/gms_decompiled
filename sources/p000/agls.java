package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: agls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agls {

    /* renamed from: a */
    public final Context f65902a;

    public agls(Context context) {
        sdo.m34959a(context);
        this.f65902a = context;
    }

    /* renamed from: a */
    public final IBinder mo35634a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new aghp(agmn.m54505a(this.f65902a), null);
            }
            mo35640c().f65567f.mo35436a("onBind received unknown action", action);
            return null;
        }
        mo35640c().f65564c.mo35435a("onBind called with null intent");
        return null;
    }

    /* renamed from: b */
    public final void mo35638b() {
        agje a = agje.m54353a(this.f65902a);
        agid E = a.mo35497E();
        if (a.f65690f.f65291a) {
            E.f65572k.mo35435a("Device PackageMeasurementTaskService is shutting down");
        } else {
            E.f65572k.mo35435a("Local AppMeasurementService is shutting down");
        }
    }

    /* renamed from: c */
    public final agid mo35640c() {
        return agje.m54353a(this.f65902a).mo35497E();
    }

    /* renamed from: c */
    public final void mo35641c(Intent intent) {
        if (intent != null) {
            mo35640c().f65572k.mo35436a("onUnbind called for intent. action", intent.getAction());
            return;
        }
        mo35640c().f65564c.mo35435a("onUnbind called with null intent");
    }

    /* renamed from: b */
    public final void mo35639b(Intent intent) {
        if (intent != null) {
            mo35640c().f65572k.mo35436a("onRebind called. action", intent.getAction());
            return;
        }
        mo35640c().f65564c.mo35435a("onRebind called with null intent");
    }

    /* renamed from: a */
    public final void mo35635a() {
        agje a = agje.m54353a(this.f65902a);
        agid E = a.mo35497E();
        if (a.f65690f.f65291a) {
            E.f65572k.mo35435a("Device PackageMeasurementTaskService is starting up");
        } else {
            E.f65572k.mo35435a("Local AppMeasurementService is starting up");
        }
    }

    /* renamed from: a */
    public final void mo35636a(Intent intent, int i) {
        agje a = agje.m54353a(this.f65902a);
        agid E = a.mo35497E();
        if (intent == null) {
            E.f65567f.mo35435a("AppMeasurementService started with null intent");
            return;
        }
        String action = intent.getAction();
        if (a.f65690f.f65291a) {
            E.f65572k.mo35437a("Device PackageMeasurementTaskService called. startId, action", Integer.valueOf(i), action);
        } else {
            E.f65572k.mo35437a("Local AppMeasurementService called. startId, action", Integer.valueOf(i), action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo35637a(new aglo(this, i, E, intent));
        }
    }

    /* renamed from: a */
    public final void mo35637a(Runnable runnable) {
        agmn a = agmn.m54505a(this.f65902a);
        a.mo35498F().mo35492a(new aglq(a, runnable));
    }
}
