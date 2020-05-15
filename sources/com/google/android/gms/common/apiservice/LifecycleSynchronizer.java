package com.google.android.gms.common.apiservice;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.Service;
import java.util.Random;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LifecycleSynchronizer {

    /* renamed from: a */
    private int f30136a;

    /* renamed from: b */
    private final Object f30137b = new Object();

    /* renamed from: c */
    private Intent f30138c;

    /* renamed from: d */
    private final Service f30139d;

    /* renamed from: e */
    private final bmzu f30140e;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Callback {
        void onServiceDestroy();
    }

    public LifecycleSynchronizer(Service service) {
        bmzz a = bmzz.m108708a();
        a.mo66952a(4);
        a.mo66963e();
        this.f30140e = a.mo66962d();
        this.f30139d = service;
    }

    public int getRefCount() {
        int i;
        synchronized (this.f30137b) {
            i = this.f30136a;
        }
        return i;
    }

    public void onAfterExecution() {
        synchronized (this.f30137b) {
            int i = this.f30136a;
            if (i > 0) {
                int i2 = i - 1;
                this.f30136a = i2;
                if (i2 == 0) {
                    for (Callback callback : ((bnbb) this.f30140e).f131333a.keySet()) {
                        try {
                            callback.onServiceDestroy();
                        } catch (RuntimeException e) {
                            Log.e("LifecycleSync", "Failed to execute a callback", e);
                        }
                    }
                    this.f30139d.stopSelf();
                }
            }
        }
    }

    public void onBeforeDispatching() {
        synchronized (this.f30137b) {
            int i = this.f30136a;
            this.f30136a = i + 1;
            if (i == 0) {
                if (this.f30138c == null) {
                    sdo.m34959a(this.f30139d.getContainerService());
                    this.f30138c = spn.m35893h(this.f30139d.getContainerService().getClass().getName());
                }
                Intent intent = this.f30138c;
                try {
                    this.f30139d.startService(intent);
                } catch (IllegalStateException e) {
                    int i2 = Build.VERSION.SDK_INT;
                    if ((bmxx.m108577a(intent.getPackage()) || intent.getPackage().equals("com.google.android.gms")) && cdje.m133542b() && ((double) new Random().nextFloat()) < cdje.m133543c()) {
                        Log.e("LifecycleSync", "Google Play services is unable to start a service. Exiting.", e);
                        spn.m35884e();
                    }
                    throw e;
                }
            }
        }
    }

    public void onServiceStart() {
        synchronized (this.f30137b) {
            if (this.f30136a == 0) {
                this.f30139d.stopSelf();
            }
        }
    }

    public LifecycleSynchronizer registerCallback(Callback callback) {
        this.f30140e.mo66946a(callback, true);
        return this;
    }
}
