package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* renamed from: apis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apis implements Runnable, IBinder.DeathRecipient {

    /* renamed from: a */
    public final Context f84491a;

    /* renamed from: b */
    public final aall f84492b;

    /* renamed from: c */
    public final Intent f84493c;

    /* renamed from: d */
    public final Executor f84494d;

    /* renamed from: e */
    public final bmzi f84495e = bmzn.m108681a(apin.f84483a);

    /* renamed from: f */
    private final apir f84496f = new apir(this);

    public apis(Context context, aall aall, Intent intent, Executor executor) {
        this.f84491a = context;
        this.f84492b = aall;
        this.f84493c = intent;
        this.f84494d = executor;
    }

    /* renamed from: a */
    public final void mo47316a() {
        try {
            this.f84492b.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            Log.e("GcmBinderProxy", "Binder unlinkToDeath failed", e);
        }
    }

    public final void binderDied() {
        if (((Boolean) this.f84495e.mo6606a()).booleanValue()) {
            Log.e("GcmBinderProxy", "Scheduler process in user 0 died, unbinding from the task");
            this.f84496f.close();
        }
    }

    public final void run() {
        try {
            if (!skh.m35531a().mo25691a(this.f84491a, "NetworkScheduler", this.f84493c, this.f84496f, apjc.m70442a())) {
                try {
                    this.f84492b.mo16970a();
                } catch (RemoteException e) {
                    Log.e("GcmBinderProxy", "Error conveying bind result to primary user", e);
                }
                this.f84496f.close();
            } else if (((Boolean) this.f84495e.mo6606a()).booleanValue()) {
                try {
                    this.f84492b.asBinder().linkToDeath(this, 0);
                } catch (RemoteException e2) {
                    Log.e("GcmBinderProxy", "Scheduler process in user 0 died", e2);
                    this.f84496f.close();
                }
            }
        } catch (SecurityException e3) {
            Log.e("GcmBinderProxy", "Error binding to task service", e3);
            try {
                this.f84492b.mo16973c();
            } catch (RemoteException e4) {
                Log.e("GcmBinderProxy", "Error conveying binder exception to primary user", e4);
            }
            this.f84496f.close();
        }
    }
}
