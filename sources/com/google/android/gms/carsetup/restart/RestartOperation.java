package com.google.android.gms.carsetup.restart;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.carsetup.BinderParcel;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RestartOperation extends IntentOperation {

    /* renamed from: a */
    public static final bnsn f29669a = odk.m28481a("CAR.SETUP.RESTART");

    /* renamed from: a */
    public static void m22235a(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, RestartOperation.class, "com.google.android.gms.carsetup.DO_RESTART");
        bmxy.m108581a(startIntent);
        startIntent.putExtra("binder", new BinderParcel(new oyl()));
        startIntent.putExtra("restart_intent", intent);
        context.startService(startIntent);
    }

    public final void onHandleIntent(Intent intent) {
        ouo ouo;
        bnsi d = f29669a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.restart.RestartOperation", "onHandleIntent", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Beginning restart process");
        BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("binder");
        bmxy.m108581a(binderParcel);
        IBinder iBinder = binderParcel.f29535a;
        Semaphore semaphore = new Semaphore(0);
        try {
            iBinder.linkToDeath(new oyk(semaphore, iBinder), 0);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.IRestartCallback");
                ouo = !(queryLocalInterface instanceof ouo) ? new oum(iBinder) : (ouo) queryLocalInterface;
            } else {
                ouo = null;
            }
            ouo.mo22656a();
        } catch (RemoteException e) {
            semaphore.release();
        }
        bnsi d2 = f29669a.mo68390d();
        d2.mo68432a("com.google.android.gms.carsetup.restart.RestartOperation", "onHandleIntent", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d2.mo68405a("Waiting for remote death");
        semaphore.acquireUninterruptibly();
        bnsi d3 = f29669a.mo68390d();
        d3.mo68432a("com.google.android.gms.carsetup.restart.RestartOperation", "onHandleIntent", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d3.mo68405a("Firing restart intent");
        Intent intent2 = (Intent) intent.getParcelableExtra("restart_intent");
        bmxy.m108581a(intent2);
        intent2.setFlags(intent2.getFlags() | 268435456);
        ouz.m29833a(intent2);
        startActivity(intent2);
    }

    /* renamed from: a */
    public static boolean m22236a() {
        return ccsq.f179858a.mo6606a().mo76734h();
    }
}
