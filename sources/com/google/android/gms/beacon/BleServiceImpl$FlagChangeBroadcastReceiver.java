package com.google.android.gms.beacon;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleServiceImpl$FlagChangeBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ nfx f29264a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleServiceImpl$FlagChangeBroadcastReceiver(nfx nfx) {
        super("beacon");
        this.f29264a = nfx;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r3 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r3 == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r3 == false) goto L_0x0063;
     */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        nga nga;
        String action = intent.getAction();
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.UPDATE".equals(action)) {
            boolean z = ngk.f35513a;
            if (!ccov.m131091b()) {
                if (ccov.m131091b() || !z) {
                    this.f29264a.f35470d.lock();
                    try {
                        boolean a = nfx.m26142a(this.f29264a.f35473g);
                        this.f29264a.f35470d.unlock();
                        if (ccos.m131056c()) {
                            int i = Build.VERSION.SDK_INT;
                            if (BluetoothAdapter.getDefaultAdapter() != null) {
                            }
                        }
                        if (!ccos.m131056c()) {
                        }
                        this.f29264a.f35470d.lock();
                        try {
                            this.f29264a.f35473g.mo20587b();
                            return;
                        } finally {
                            this.f29264a.f35470d.unlock();
                        }
                    } catch (Throwable th) {
                        this.f29264a.f35470d.unlock();
                        throw th;
                    }
                }
            }
            try {
                nga = ngb.m26161a(context);
            } catch (NullPointerException e) {
                nha.m26243a("Error while trying to obtain a BLE scanner.");
                nga = null;
            }
            if (nga != null) {
                this.f29264a.f35470d.lock();
                try {
                    this.f29264a.f35473g.mo20584a(true);
                    nfx nfx = this.f29264a;
                    nfx.f35473g = nga;
                    nfx.f35470d.unlock();
                } catch (Throwable th2) {
                    this.f29264a.f35470d.unlock();
                    throw th2;
                }
            }
        }
    }
}
