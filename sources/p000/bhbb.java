package p000;

import com.google.android.location.p094ui.widget.DeviceSwitch;

/* renamed from: bhbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DeviceSwitch f118226a;

    public bhbb(DeviceSwitch deviceSwitch) {
        this.f118226a = deviceSwitch;
    }

    public final void run() {
        this.f118226a.f150950b.setVisibility(4);
        this.f118226a.f150951c.setVisibility(0);
    }
}
