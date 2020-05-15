package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Looper;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.controller.UsbBroadcastReceiver;
import com.google.android.gms.fido.u2f.api.view.UsbViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.HashSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xzt implements xhq, xzu {

    /* renamed from: o */
    private static final sek f53476o = new sek(new String[]{"UsbRequestController"}, (short[]) null);

    /* renamed from: a */
    public final xzq f53477a;

    /* renamed from: b */
    final UsbBroadcastReceiver f53478b;

    /* renamed from: c */
    final xzy f53479c = new xzy(new xzw());

    /* renamed from: d */
    public final ConcurrentSkipListMap f53480d;

    /* renamed from: e */
    public volatile HashSet f53481e;

    /* renamed from: f */
    public volatile int f53482f;

    /* renamed from: g */
    private final Context f53483g;

    /* renamed from: h */
    private final xwj f53484h;

    /* renamed from: i */
    private final xws f53485i;

    /* renamed from: j */
    private final xfo f53486j;

    /* renamed from: k */
    private final xzz f53487k;

    /* renamed from: l */
    private final UsbManager f53488l;

    /* renamed from: m */
    private final PendingIntent f53489m;

    /* renamed from: n */
    private final AtomicBoolean f53490n;

    public xzt(Context context, xwj xwj, xzq xzq, xfo xfo, xzz xzz, xws xws) {
        this.f53483g = context;
        this.f53484h = xwj;
        this.f53477a = xzq;
        this.f53485i = xws;
        this.f53486j = xfo;
        this.f53487k = xzz;
        this.f53488l = (UsbManager) this.f53483g.getSystemService("usb");
        this.f53480d = new ConcurrentSkipListMap();
        this.f53482f = 1;
        this.f53490n = new AtomicBoolean(false);
        this.f53481e = new HashSet();
        this.f53478b = new UsbBroadcastReceiver(this, this.f53488l);
        Intent intent = new Intent("com.google.fido.u2f.api.USB_PERMISSION");
        intent.setFlags(268435456);
        this.f53489m = PendingIntent.getBroadcast(this.f53483g, 0, intent, 0);
    }

    /* renamed from: h */
    private final void m43700h() {
        if (this.f53490n.compareAndSet(false, true)) {
            IntentFilter intentFilter = new IntentFilter("com.google.fido.u2f.api.USB_PERMISSION");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            this.f53483g.registerReceiver(this.f53478b, intentFilter);
        }
    }

    /* renamed from: i */
    private final void m43701i() {
        this.f53482f = 4;
        m43700h();
        for (UsbDevice usbDevice : this.f53488l.getDeviceList().values()) {
            if (this.f53488l.hasPermission(usbDevice)) {
                f53476o.mo25412b("Already have permission for device (%d)", Integer.valueOf(usbDevice.getDeviceId()));
                try {
                    this.f53480d.put(Integer.valueOf(usbDevice.getDeviceId()), xmh.m43169a(usbDevice, this.f53488l));
                } catch (xmm e) {
                    f53476o.mo25412b("Device (%d) not a valid U2F device", Integer.valueOf(usbDevice.getDeviceId()));
                }
            } else {
                mo30289a(usbDevice);
            }
        }
        if (this.f53481e.isEmpty() && !this.f53480d.isEmpty()) {
            mo30290f();
        }
    }

    /* renamed from: a */
    public final void mo29763a() {
        this.f53482f = 1;
        m43700h();
    }

    /* renamed from: b */
    public final void mo29766b() {
        m43700h();
        int i = this.f53482f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            m43701i();
        }
    }

    /* renamed from: c */
    public final void mo29767c() {
        int i = this.f53482f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
        } else {
            if (i2 != 2) {
                this.f53482f = 4;
                return;
            }
            mo30291g();
            this.f53482f = 2;
        }
    }

    /* renamed from: d */
    public final void mo29768d() {
        mo30291g();
        this.f53482f = 2;
        if (this.f53490n.compareAndSet(true, false)) {
            try {
                this.f53483g.unregisterReceiver(this.f53478b);
            } catch (IllegalArgumentException e) {
            }
        }
        this.f53480d.clear();
        this.f53481e.clear();
    }

    /* renamed from: e */
    public final void mo29769e() {
    }

    /* renamed from: f */
    public final void mo30290f() {
        if (this.f53480d.size() <= 1) {
            this.f53482f = 3;
            xmh xmh = (xmh) this.f53480d.firstEntry().getValue();
            bmxy.m108581a(xmh);
            xzy xzy = this.f53479c;
            Context context = this.f53483g;
            xwj xwj = this.f53484h;
            xws xws = this.f53485i;
            xfo xfo = this.f53486j;
            Future future = xzy.f53503a;
            if (future == null || future.isDone()) {
                xlm xlm = new xlm(xhu.f52320a, xmh);
                xzy.f53505c = (xfw) xfu.m42833a(xwj, xlm, xws);
                xzy.f53503a = ((soc) xzy.f53504b).submit(new xzx(context, xwj, xlm, xzy.f53505c, xws, xfo, this, new adzt(Looper.getMainLooper()), xzy));
                return;
            }
            xzy.f53502d.mo25418e("New Usb request issued while previous request was still active.", new Object[0]);
        }
    }

    /* renamed from: g */
    public final void mo30291g() {
        Future future = this.f53479c.f53503a;
        if (future == null) {
            xzy.f53502d.mo25416d("Cancel request received on nonexistent operation.", new Object[0]);
        } else {
            future.cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo29764a(int i) {
        this.f53487k.mo30295a(i, new UsbViewOptions());
        m43701i();
    }

    /* renamed from: a */
    public final void mo30289a(UsbDevice usbDevice) {
        this.f53481e.add(Integer.valueOf(usbDevice.getDeviceId()));
        this.f53488l.requestPermission(usbDevice, this.f53489m);
    }

    /* renamed from: a */
    public final void mo29765a(ViewOptions viewOptions) {
        bmxy.m108600b(Transport.USB.equals(viewOptions.mo18854b()));
        m43701i();
    }
}
