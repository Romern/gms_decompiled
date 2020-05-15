package p000;

import com.google.android.gms.car.CarServiceBinderImpl$UsbDisconnectReceiver;
import com.google.android.gms.car.diagnostics.CriticalError;

/* renamed from: noi */
public final /* synthetic */ class noi implements Runnable {

    /* renamed from: a */
    private final CarServiceBinderImpl$UsbDisconnectReceiver f36153a;

    public noi(CarServiceBinderImpl$UsbDisconnectReceiver carServiceBinderImpl$UsbDisconnectReceiver) {
        this.f36153a = carServiceBinderImpl$UsbDisconnectReceiver;
    }

    public final void run() {
        this.f36153a.f29368a.mo21188a(CriticalError.m22086a(bpdn.PROTOCOL_BYEBYE_REQUESTED_BY_USER, bpdo.BYEBYE_BY_USER));
    }
}
