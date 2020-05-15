package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: burc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class burc {

    /* renamed from: a */
    public burx f154753a;

    /* renamed from: b */
    public CountDownLatch f154754b = new CountDownLatch(1);

    /* renamed from: c */
    public boolean f154755c;

    /* renamed from: d */
    public final burb f154756d;

    /* renamed from: e */
    final ServiceConnection f154757e = new bura(this);

    /* renamed from: f */
    private final Context f154758f;

    public burc(Context context, burb burb) {
        this.f154758f = context;
        this.f154756d = burb;
    }

    /* renamed from: a */
    public final synchronized DeviceDetailsLinks mo73020a(String str) {
        burx burx = this.f154753a;
        if (burx == null) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("burc", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getDeviceDetailsLinks failed due to no service connection.");
            return null;
        }
        return burx.mo73073b(str);
    }

    /* renamed from: b */
    public final synchronized TrueWirelessHeadset mo73024b(String str) {
        burx burx = this.f154753a;
        if (burx == null) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("burc", "b", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getTrueWirelessHeadset failed due to no service connection.");
            return null;
        }
        return burx.mo73070a(str);
    }

    /* renamed from: a */
    public final synchronized String mo73021a(byte[] bArr) {
        burx burx = this.f154753a;
        if (burx == null) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("burc", "a", 131, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("getFastPairDeviceAddress failed due to no service connection.");
            return null;
        }
        return burx.mo73071a(bArr);
    }

    /* renamed from: b */
    public final synchronized void mo73025b() {
        bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
        bnsl.mo68432a("burc", "b", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("FastPair: DeviceStatusServiceConnUtil stopServiceConnection called, serviceStarted=%b", Boolean.valueOf(this.f154755c));
        if (this.f154755c) {
            this.f154755c = false;
            this.f154758f.unbindService(this.f154757e);
            this.f154753a = null;
            this.f154754b = new CountDownLatch(1);
        }
    }

    /* renamed from: a */
    public final synchronized void mo73022a() {
        bnsl bnsl = (bnsl) busr.f154819a.mo68390d();
        bnsl.mo68432a("burc", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("FastPair: DeviceStatusServiceConnUtil startServiceConnection called, serviceStarted=%b", Boolean.valueOf(this.f154755c));
        if (!this.f154755c) {
            this.f154755c = true;
            Intent b = butb.m120417b(this.f154758f);
            b.setAction("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE");
            this.f154758f.bindService(b, this.f154757e, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo73023a(long j, bqgy bqgy) {
        try {
            this.f154754b.await(j, TimeUnit.MILLISECONDS);
            synchronized (this) {
                burx burx = this.f154753a;
                if (burx == null) {
                    bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
                    bnsl.mo68432a("burc", "a", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("getFirmwareUpdatableItems fail because deviceStatusService is null!");
                    bqgy.mo69138b((Object) null);
                } else {
                    bqgy.mo69138b(burx.mo73072a());
                }
            }
        } catch (RemoteException | InterruptedException e) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("burc", "a", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("getFirmwareUpdatableItems meet exception!");
            bqgy.mo69138b((Object) null);
        }
    }
}
