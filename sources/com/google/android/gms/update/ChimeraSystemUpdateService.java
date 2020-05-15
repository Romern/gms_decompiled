package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraSystemUpdateService extends Service {

    /* renamed from: a */
    private static alai f109422a = alai.m60751a();

    /* renamed from: b */
    private avkf f109423b;

    public final IBinder onBind(Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.update.START_SERVICE")) {
            avkf avkf = this.f109423b;
            avkf.asBinder();
            return avkf;
        }
        Log.w("CmaSystemUpdateService", "onBind is called with an unexpected intent, returning null.");
        return null;
    }

    public final void onCreate() {
        this.f109423b = new avkf(this, this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("onStartCommand: intent: ");
        sb.append(valueOf);
        sb.toString();
        stopSelf(i2);
        return 2;
    }

    /* renamed from: a */
    public static int m93686a(Context context) {
        if (!cfsg.m142819f()) {
            return ((Long) avme.f93383e.mo51364a()).intValue();
        }
        int intValue = ((Long) avme.f93383e.mo51364a()).intValue();
        Object f = alai.f73223a.mo26195f(context);
        if (f == null || ((long) intValue) == avme.f93380b.longValue()) {
            return intValue;
        }
        if (avmb.m78775a(context, ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109472n).f93369a == 0) {
            if (!f109422a.mo40052a(f)) {
                Log.i("CmaSystemUpdateService", "Revert back to user choice after policy expiration.");
                return intValue;
            }
            Log.i("CmaSystemUpdateService", "Urgency overridden to automatic after policy expiration.");
            return avme.f93380b.intValue();
        } else if (f109422a.mo40052a(f)) {
            Log.i("CmaSystemUpdateService", "Urgency overridden to automatic.");
            return avme.f93380b.intValue();
        } else if (alai.f73223a.mo26188b(f)) {
            Log.i("CmaSystemUpdateService", "Urgency overridden to windowed.");
            return avme.f93381c.intValue();
        } else if (((Boolean) avma.f93362h.mo51364a()).booleanValue()) {
            Log.i("CmaSystemUpdateService", "Urgency not overridden for security updates.");
            return intValue;
        } else {
            Log.i("CmaSystemUpdateService", "Urgency overridden to recommended.");
            return avme.f93382d.intValue();
        }
    }
}
