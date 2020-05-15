package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.google.android.gms.fido.client.transport.UsbBroadcastReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import com.google.android.gms.fido.fido2.api.view.UsbViewOptions;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xhg extends xhb {

    /* renamed from: a */
    public final Context f52282a;

    /* renamed from: b */
    public final xwj f52283b;

    /* renamed from: c */
    public final RequestOptions f52284c;

    /* renamed from: d */
    public final xoo f52285d;

    /* renamed from: e */
    public final String f52286e;

    /* renamed from: f */
    public final String f52287f;

    /* renamed from: g */
    public final xhi f52288g;

    /* renamed from: h */
    public final PendingIntent f52289h;

    /* renamed from: i */
    public final Map f52290i = new ConcurrentHashMap();

    /* renamed from: j */
    public final bqgy f52291j = bqgy.m112818c();

    /* renamed from: k */
    public final UsbManager f52292k;

    /* renamed from: m */
    private final UsbBroadcastReceiver f52293m;

    /* renamed from: n */
    private final bqgj f52294n;

    public xhg(Context context, xwj xwj, RequestOptions requestOptions, xoo xoo, String str, String str2, xhi xhi, UsbManager usbManager) {
        bmxy.m108581a(context);
        this.f52282a = context;
        this.f52283b = xwj;
        this.f52284c = requestOptions;
        this.f52285d = xoo;
        this.f52286e = str;
        this.f52287f = str2;
        this.f52288g = xhi;
        this.f52292k = usbManager;
        this.f52293m = new UsbBroadcastReceiver(this, usbManager);
        Intent intent = new Intent("com.google.fido.android.gms.fido.client.USB_PERMISSION");
        intent.setFlags(268435456);
        this.f52289h = PendingIntent.getBroadcast(context, 0, intent, 0);
        this.f52294n = snp.m35704b(9);
    }

    /* renamed from: a */
    public final bqgg mo29726a() {
        return this.f52291j;
    }

    /* renamed from: b */
    public final void mo29730b() {
        this.f52290i.clear();
        for (UsbDevice usbDevice : this.f52292k.getDeviceList().values()) {
            if (this.f52292k.hasPermission(usbDevice)) {
                mo29744a(usbDevice);
            } else {
                this.f52292k.requestPermission(usbDevice, this.f52289h);
            }
        }
        IntentFilter intentFilter = new IntentFilter("com.google.fido.android.gms.fido.client.USB_PERMISSION");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        this.f52282a.registerReceiver(this.f52293m, intentFilter);
    }

    /* renamed from: c */
    public final void mo29731c() {
        this.f52282a.unregisterReceiver(this.f52293m);
    }

    /* renamed from: d */
    public final void mo29732d() {
        if (!this.f52291j.isDone()) {
            this.f52291j.mo69136a((Throwable) adbe.m50106a(34004));
        }
    }

    /* renamed from: e */
    public final Transport mo29733e() {
        return Transport.USB;
    }

    /* renamed from: f */
    public final void mo29734f() {
    }

    /* renamed from: a */
    public final void mo29727a(int i) {
        bmxv a = this.f52288g.mo29745a(i, new UsbViewOptions());
        if (a.mo66813a()) {
            this.f52285d.mo14261a(((ViewOptions) a.mo66814b()).toString());
        }
    }

    /* renamed from: a */
    public final void mo29744a(UsbDevice usbDevice) {
        try {
            xmh a = xmh.m43169a(usbDevice, this.f52292k);
            this.f52290i.put(Integer.valueOf(usbDevice.getDeviceId()), a);
            xlm xlm = new xlm(this.f52294n, a);
            bqgg a2 = bqdx.m112673a(xlm.mo29908b(), new xhd(this, xlm), this.f52294n);
            xlm.getClass();
            a2.mo741a(new xhe(xlm), this.f52294n);
            bqga.m112781a(a2, new xhf(this), this.f52294n);
        } catch (xmm e) {
        }
    }

    /* renamed from: a */
    public final void mo29728a(ViewOptions viewOptions) {
        for (UsbDevice usbDevice : this.f52292k.getDeviceList().values()) {
            if (this.f52292k.hasPermission(usbDevice)) {
                mo29744a(usbDevice);
            } else {
                this.f52292k.requestPermission(usbDevice, this.f52289h);
            }
        }
    }
}
