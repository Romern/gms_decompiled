package p000;

import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: anly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anly implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BleDevicesResult f77101a;

    /* renamed from: b */
    final /* synthetic */ anlz f77102b;

    public anly(anlz anlz, BleDevicesResult bleDevicesResult) {
        this.f77102b = anlz;
        this.f77101a = bleDevicesResult;
    }

    public final void run() {
        anme anme = this.f77102b.f77103a;
        BleDevicesResult bleDevicesResult = this.f77101a;
        if (bleDevicesResult.f32326b.mo17710c()) {
            anme.f77112f = bleDevicesResult.f32325a;
            anme.mo41936b();
        } else {
            anme.mo41937b(3);
        }
        anme.f77117k = null;
    }
}
