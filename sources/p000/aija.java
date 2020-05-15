package p000;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.nearby.mediums.BluetoothClassic$AdvertisingOperation$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: aija */
final /* synthetic */ class aija implements Runnable {

    /* renamed from: a */
    private final aijb f68935a;

    /* renamed from: b */
    private final int f68936b;

    public aija(aijb aijb, int i) {
        this.f68935a = aijb;
        this.f68936b = i;
    }

    public final void run() {
        Context context;
        aijb aijb = this.f68935a;
        int i = this.f68936b;
        if (aijb.f68938b.getScanMode() != i) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            BluetoothClassic$AdvertisingOperation$1 bluetoothClassic$AdvertisingOperation$1 = new BluetoothClassic$AdvertisingOperation$1("nearby", i, countDownLatch);
            aijb.f68937a.registerReceiver(bluetoothClassic$AdvertisingOperation$1, new IntentFilter("android.bluetooth.adapter.action.SCAN_MODE_CHANGED"));
            try {
                if (((Boolean) ahft.m55666a(aijb.f68938b).mo36404a("setScanMode", Integer.TYPE).mo36403a(Integer.valueOf(i))).booleanValue()) {
                    try {
                        countDownLatch.await(cfnv.m140789m(), TimeUnit.SECONDS);
                        ahhd.m55766a(aijb.f68937a, bluetoothClassic$AdvertisingOperation$1);
                        if (aijb.f68938b.getScanMode() != i) {
                            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                            bnsl.mo68432a("aijb", "e", 789, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68412a("Couldn't set scan mode to %d in %d seconds", i, cfnv.m140789m());
                            throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", Integer.valueOf(i)));
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                        bnsl2.mo68432a("aijb", "e", 780, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68409a("Interrupted while waiting to set Bluetooth scan mode to %d", i);
                        context = aijb.f68937a;
                    } catch (Throwable th) {
                        ahhd.m55766a(aijb.f68937a, bluetoothClassic$AdvertisingOperation$1);
                        throw th;
                    }
                } else {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl3.mo68432a("aijb", "e", 760, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68409a("Failed to set scan mode to %d", i);
                    context = aijb.f68937a;
                    ahhd.m55766a(context, bluetoothClassic$AdvertisingOperation$1);
                    throw new RuntimeException(String.format("Failed to set Bluetooth scan mode to %s", Integer.valueOf(i)));
                }
            } catch (ahfu e2) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68437a(e2);
                bnsl4.mo68432a("aijb", "e", 764, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68409a("Failed to use reflection to invoke setScanMode to %d", i);
                context = aijb.f68937a;
            }
        }
    }
}
