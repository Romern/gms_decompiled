package p000;

import android.hardware.usb.UsbAccessory;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;

/* renamed from: mdk */
final /* synthetic */ class mdk implements mdj {

    /* renamed from: a */
    private final mdl f33483a;

    public mdk(mdl mdl) {
        this.f33483a = mdl;
    }

    /* renamed from: a */
    public final void mo19852a() {
        mdl mdl = this.f33483a;
        D2dSourceChimeraActivity d2dSourceChimeraActivity = mdl.f33484a;
        d2dSourceChimeraActivity.f29018b.mo19956a(d2dSourceChimeraActivity.f29019c, new mga(d2dSourceChimeraActivity));
        D2dSourceChimeraActivity d2dSourceChimeraActivity2 = mdl.f33484a;
        if (d2dSourceChimeraActivity2.f29021e) {
            d2dSourceChimeraActivity2.mo17232i();
        }
        if (mdl.f33484a.f29023g == mtf.USB) {
            mdl.f33484a.f29018b.mo19954a((UsbAccessory) mdl.f33484a.getIntent().getParcelableExtra("accessory"));
            mdl.f33484a.f29023g = null;
        } else if (mdl.f33484a.f29023g == mtf.WIFI) {
            mdl.f33484a.f29018b.mo19953a();
            mdl.f33484a.f29023g = null;
        } else {
            mdl.f33484a.f29018b.mo19960f();
        }
    }
}
