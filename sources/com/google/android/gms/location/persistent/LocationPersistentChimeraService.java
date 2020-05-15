package com.google.android.gms.location.persistent;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationPersistentChimeraService extends Service {

    /* renamed from: a */
    public static WeakReference f79447a = new WeakReference(null);

    /* renamed from: b */
    public final C1223np f79448b = new C1223np();

    /* renamed from: c */
    private Handler f79449c;

    /* renamed from: a */
    public static void m66897a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.location.persistent.LocationPersistentService"));
        bmxy.m108600b(context.startService(intent) != null);
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ssb ssb = new ssb(printWriter, "  ");
        ssb.mo26034a();
        for (Map.Entry entry : this.f79448b.entrySet()) {
            printWriter.print((String) entry.getKey());
            printWriter.println(":");
            ((aeks) entry.getValue()).mo34272a(ssb);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f79449c = new adzt();
        m66898a(this);
        Intent intent = new Intent("com.google.android.gms.location.persistent.REGISTER");
        intent.setPackage("com.google.android.gms");
        sendBroadcast(intent);
    }

    public final void onDestroy() {
        m66898a((LocationPersistentChimeraService) null);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* renamed from: a */
    private static synchronized void m66898a(LocationPersistentChimeraService locationPersistentChimeraService) {
        boolean z;
        synchronized (LocationPersistentChimeraService.class) {
            boolean z2 = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            LocationPersistentChimeraService locationPersistentChimeraService2 = (LocationPersistentChimeraService) f79447a.get();
            if (locationPersistentChimeraService2 != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    z2 = false;
                }
                bmxy.m108600b(z2);
                for (aeks aeks : locationPersistentChimeraService2.f79448b.values()) {
                    aeks.mo34270a();
                }
                locationPersistentChimeraService2.f79448b.clear();
            }
            f79447a = new WeakReference(locationPersistentChimeraService);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m66899a(String str, aeks aeks) {
        synchronized (LocationPersistentChimeraService.class) {
            LocationPersistentChimeraService locationPersistentChimeraService = (LocationPersistentChimeraService) f79447a.get();
            if (locationPersistentChimeraService == null) {
                Log.w("LocationPersistentSvc", "unable to register client - no service");
            } else if (aeks != null) {
                locationPersistentChimeraService.f79449c.post(new aekr(locationPersistentChimeraService, str, aeks));
            }
        }
    }
}
