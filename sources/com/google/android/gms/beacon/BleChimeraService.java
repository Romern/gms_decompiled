package com.google.android.gms.beacon;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleChimeraService extends Service {

    /* renamed from: a */
    public nfx f29252a;

    /* renamed from: b */
    private Cnew f29253b;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("BleService beacon data dump...");
        printWriter.println(this.f29253b);
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.beacon.internal.IBleService.START".equals(intent.getAction())) {
            return new rzv(this, this);
        }
        return null;
    }

    public final void onCreate() {
        nga nga;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        ngz.m26241a(applicationContext);
        try {
            nga = ngb.m26161a(applicationContext);
        } catch (NullPointerException e) {
            nha.m26243a("Error while trying to obtain a BLE scanner.");
            nga = null;
        }
        if (nga != null) {
            SharedPreferences sharedPreferences = getSharedPreferences("BEACON_STATE", 0);
            new nhd();
            this.f29253b = new Cnew(sharedPreferences);
            this.f29252a = new nfx(nga, this.f29253b, applicationContext);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onDestroy() {
        nfx nfx = this.f29252a;
        if (nfx != null) {
            nfx.f35470d.lock();
            try {
                nfx.f35473g.mo20584a(true);
                nfx.f35470d.unlock();
                nfx.f35469c.unregisterReceiver(nfx.f35467a);
                this.f29253b.mo20547a();
            } catch (Throwable th) {
                nfx.f35470d.unlock();
                throw th;
            }
        }
        ngz.m26239a();
    }
}
