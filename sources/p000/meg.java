package p000;

import android.hardware.usb.UsbAccessory;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;

/* renamed from: meg */
public final /* synthetic */ class meg implements Runnable {

    /* renamed from: a */
    private final UsbAccessory f33509a;

    /* renamed from: b */
    private final mfx f33510b;

    public meg(mfx mfx, UsbAccessory usbAccessory) {
        this.f33510b = mfx;
        this.f33509a = usbAccessory;
    }

    public final void run() {
        mfx mfx = this.f33510b;
        UsbAccessory usbAccessory = this.f33509a;
        D2dSourceChimeraService d2dSourceChimeraService = mfx.f33611a;
        lvn lvn = D2dSourceChimeraService.f29027a;
        d2dSourceChimeraService.f29029c.mo19983a(new mjw(d2dSourceChimeraService, usbAccessory));
    }
}
