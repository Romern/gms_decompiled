package p000;

import android.content.Intent;
import com.google.android.gms.nearby.mediums.WifiRadio$1;

/* renamed from: aioy */
public final /* synthetic */ class aioy implements Runnable {

    /* renamed from: a */
    private final WifiRadio$1 f69398a;

    /* renamed from: b */
    private final Intent f69399b;

    public aioy(WifiRadio$1 wifiRadio$1, Intent intent) {
        this.f69398a = wifiRadio$1;
        this.f69399b = intent;
    }

    public final void run() {
        WifiRadio$1 wifiRadio$1 = this.f69398a;
        wifiRadio$1.f80661a.mo37788a(this.f69399b);
    }
}
