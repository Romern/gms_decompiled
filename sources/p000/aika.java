package p000;

import android.bluetooth.le.AdvertisingSet;
import android.bluetooth.le.AdvertisingSetCallback;
import java.util.Locale;

/* renamed from: aika */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aika extends AdvertisingSetCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f69011a;

    public aika(bqgy bqgy) {
        this.f69011a = bqgy;
    }

    public final void onAdvertisingSetStarted(AdvertisingSet advertisingSet, int i, int i2) {
        String str;
        if (i2 != 0) {
            bqgy bqgy = this.f69011a;
            Object[] objArr = new Object[1];
            if (i2 != 1) {
                str = i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "UNKNOWN" : "ADVERTISE_FAILED_FEATURE_UNSUPPORTED" : "ADVERTISE_FAILED_INTERNAL_ERROR" : "ADVERTISE_FAILED_ALREADY_STARTED" : "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS";
            } else {
                str = "ADVERTISE_FAILED_DATA_TOO_LARGE";
            }
            objArr[0] = String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i2), str);
            bqgy.mo69136a((Throwable) new RuntimeException(String.format("Failed to start BLE Extended advertising due to error %s", objArr)));
            return;
        }
        this.f69011a.mo69138b((Object) null);
    }
}
