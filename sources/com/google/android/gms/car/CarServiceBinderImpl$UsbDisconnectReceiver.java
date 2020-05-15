package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarServiceBinderImpl$UsbDisconnectReceiver extends TracingBroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ noj f29368a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarServiceBinderImpl$UsbDisconnectReceiver(noj noj) {
        super("car");
        this.f29368a = noj;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if (((UsbAccessory) intent.getParcelableExtra("accessory")) != null && action.equals("android.hardware.usb.action.USB_ACCESSORY_DETACHED")) {
            Handler handler = this.f29368a.f36225l;
            noi noi = new noi(this);
            if (handler.getLooper() == Looper.myLooper()) {
                noi.run();
                return;
            }
            nut nut = new nut(noi);
            handler.post(nut);
            nut.mo21620a();
        }
    }
}
