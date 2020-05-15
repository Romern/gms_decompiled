package p000;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* renamed from: arrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arrt extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ arrv f88186a;

    public arrt(arrv arrv) {
        this.f88186a = arrv;
    }

    public final void onStartFailure(int i) {
        Logger Logger = arrv.f88192j;
        StringBuilder sb = new StringBuilder(37);
        sb.append("Start advertising failed: ");
        sb.append(i);
        Logger.mo25412b(sb.toString(), new Object[0]);
        this.f88186a.f88197i = null;
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        arrv.f88192j.mo25412b("Start advertising succeed.", new Object[0]);
    }
}
