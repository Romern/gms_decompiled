package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* renamed from: ajwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajwh extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f71413a;

    public ajwh(bqgy bqgy) {
        this.f71413a = bqgy;
    }

    public final void onStartFailure(int i) {
        this.f71413a.mo69136a((Throwable) new RuntimeException(String.format("Failed to start BLE advertising due to error %s", aila.m57407a(i))));
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        this.f71413a.mo69138b((Object) null);
    }
}
