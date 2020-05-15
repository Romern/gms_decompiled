package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* renamed from: aikk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikk extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f69043a;

    public aikk(bqgy bqgy) {
        this.f69043a = bqgy;
    }

    public final void onStartFailure(int i) {
        this.f69043a.mo69136a((Throwable) new RuntimeException(String.format("Failed to start BLE Legacy advertising due to error %s", aila.m57407a(i))));
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        this.f69043a.mo69138b((Object) null);
    }
}
