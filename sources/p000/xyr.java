package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.common.api.controller.BluetoothBroadcastReceiver;
import com.google.android.gms.fido.u2f.api.view.BleDeviceIdentifier;
import com.google.android.gms.fido.u2f.api.view.BleEnableViewOptions;
import com.google.android.gms.fido.u2f.api.view.BlePairViewOptions;
import com.google.android.gms.fido.u2f.api.view.BleProcessRequestViewOptions;
import com.google.android.gms.fido.u2f.api.view.BleSelectViewOptions;
import com.google.android.gms.fido.u2f.api.view.BleViewOptions;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import java.util.concurrent.Future;

/* renamed from: xyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xyr implements xhq, xiq, xyw, xim {

    /* renamed from: l */
    public static final Logger f53375l = new Logger(new String[]{"BleSKRequestController"}, (short[]) null);

    /* renamed from: a */
    public final xwj f53376a;

    /* renamed from: b */
    public final xzq f53377b;

    /* renamed from: c */
    public final xgn f53378c;

    /* renamed from: d */
    public final xzz f53379d;

    /* renamed from: e */
    public final xws f53380e;

    /* renamed from: f */
    volatile BluetoothDevice f53381f;

    /* renamed from: g */
    volatile BluetoothDevice f53382g;

    /* renamed from: h */
    public volatile boolean f53383h = false;

    /* renamed from: i */
    volatile boolean f53384i = false;

    /* renamed from: j */
    public volatile boolean f53385j = false;

    /* renamed from: k */
    volatile int f53386k;

    /* renamed from: m */
    private final xyx f53387m;

    /* renamed from: n */
    private final Context f53388n;

    /* renamed from: o */
    private final BluetoothAdapter f53389o;

    /* renamed from: p */
    private final xfo f53390p;

    /* renamed from: q */
    private final xin f53391q;

    /* renamed from: r */
    private final xiz f53392r;

    /* renamed from: s */
    private final xih f53393s;

    /* renamed from: t */
    private xis f53394t;

    /* renamed from: u */
    private BluetoothBroadcastReceiver f53395u;

    /* renamed from: v */
    private volatile boolean f53396v;

    /* renamed from: w */
    private boolean f53397w = false;

    public xyr(Context context, xwj xwj, BluetoothAdapter bluetoothAdapter, xgn xgn, xzq xzq, xfo xfo, xzz xzz, xws xws) {
        xyx xyx = new xyx(xwj, new xyu());
        xir xir = new xir();
        xhn xhn = new xhn();
        xin xin = new xin(context);
        xiz xiz = new xiz();
        xih xih = new xih(context);
        this.f53376a = xwj;
        bmxy.m108581a(xzq);
        this.f53377b = xzq;
        bmxy.m108581a(xfo);
        this.f53390p = xfo;
        bmxy.m108581a(xyx);
        this.f53387m = xyx;
        bmxy.m108581a(xir);
        bmxy.m108581a(context);
        this.f53388n = context;
        bmxy.m108581a(bluetoothAdapter);
        this.f53389o = bluetoothAdapter;
        bmxy.m108581a(xgn);
        this.f53378c = xgn;
        bmxy.m108581a(xhn);
        bmxy.m108581a(xzz);
        this.f53379d = xzz;
        bmxy.m108581a(xin);
        this.f53391q = xin;
        bmxy.m108581a(xiz);
        this.f53392r = xiz;
        bmxy.m108581a(xih);
        this.f53393s = xih;
        this.f53386k = 1;
        this.f53380e = xws;
    }

    /* renamed from: a */
    public static final BleDeviceIdentifier m43652a(BluetoothDevice bluetoothDevice) {
        return new BleDeviceIdentifier(bluetoothDevice.getName(), bluetoothDevice.getAddress());
    }

    /* renamed from: b */
    private final void m43653b(int i) {
        this.f53379d.mo30295a(i, new BleSelectViewOptions(this.f53397w, this.f53392r.mo29822a()));
    }

    /* renamed from: c */
    public final void mo29767c() {
        mo30276h();
    }

    /* renamed from: d */
    public final void mo29768d() {
        if (this.f53389o.isDiscovering()) {
            this.f53389o.cancelDiscovery();
        }
        mo30276h();
        BluetoothBroadcastReceiver bluetoothBroadcastReceiver = this.f53395u;
        if (bluetoothBroadcastReceiver != null) {
            try {
                this.f53388n.unregisterReceiver(bluetoothBroadcastReceiver);
                this.f53395u = null;
            } catch (IllegalArgumentException e) {
                f53375l.mo25418e("Cannot unregister Bluetooth broadcast receiver", new Object[0]);
            }
        }
        if (this.f53383h) {
            this.f53389o.disable();
            this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_PROGRAMMATICALLY_ADAPTER_DISABLED);
        }
        if (this.f53384i) {
            this.f53393s.mo29803c();
        }
    }

    /* renamed from: e */
    public final void mo29769e() {
        this.f53392r.mo29824b();
    }

    /* renamed from: f */
    public final void mo30274f() {
        this.f53389o.startDiscovery();
        mo30275g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo30275g() {
        if (this.f53389o.isEnabled()) {
            this.f53396v = true;
            if (this.f53394t == null) {
                this.f53394t = xir.m43012a();
            }
            this.f53394t.mo29815a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo30276h() {
        if (this.f53396v && this.f53389o.isEnabled()) {
            this.f53396v = false;
            if (this.f53394t == null) {
                this.f53394t = xir.m43012a();
            }
            this.f53394t.mo29814a();
            this.f53394t = null;
        }
    }

    /* renamed from: a */
    public final void mo29763a() {
        BluetoothAdapter bluetoothAdapter = this.f53389o;
        if (bluetoothAdapter == null) {
            f53375l.mo25418e("BluetoothAdapter is null.", new Object[0]);
        } else if (!bluetoothAdapter.isEnabled()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            BluetoothBroadcastReceiver bluetoothBroadcastReceiver = new BluetoothBroadcastReceiver(this);
            this.f53395u = bluetoothBroadcastReceiver;
            this.f53388n.registerReceiver(bluetoothBroadcastReceiver, intentFilter);
        } else if (this.f53393s.mo29801a()) {
            mo30274f();
        }
    }

    /* renamed from: b */
    private final void m43654b(BluetoothDevice bluetoothDevice) {
        BluetoothDevice bluetoothDevice2 = bluetoothDevice;
        bmxy.m108581a(bluetoothDevice);
        f53375l.mo25414c("signRequestWithBleDevice is called for device %s", bluetoothDevice2);
        if (this.f53386k == 4) {
            f53375l.mo25414c("signRequestWithBleDevice: mCurrentState is already PROCESSING_REQUEST", new Object[0]);
            return;
        }
        this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_START_AUTHENTICATION);
        this.f53379d.mo30295a(3, new BleProcessRequestViewOptions(m43652a(bluetoothDevice), false));
        xyx xyx = this.f53387m;
        Context context = this.f53388n;
        xws xws = this.f53380e;
        xfo xfo = this.f53390p;
        Future future = xyx.f53413a;
        if (future == null || future.isDone()) {
            xjg xjg = new xjg(context, xhu.f52320a, new xig(bluetoothDevice2), new xys(this));
            xfk xfk = (xfk) xfu.m42833a(xyx.f53414b, xjg, xws);
            xyx.f53413a = ((soc) xyx.f53415c).submit(new xyv(xyx.f53414b, xjg, xfk, xws, bluetoothDevice, xfo, this, new adzt(Looper.getMainLooper()), new xgm(context), xyx));
        } else {
            xyx.f53412d.mo25418e("New Ble request issued while previous request was still active.", new Object[0]);
        }
        this.f53386k = 4;
        this.f53382g = bluetoothDevice2;
    }

    /* renamed from: a */
    public final void mo29764a(int i) {
        ViewOptions viewOptions;
        boolean isEnabled = this.f53389o.isEnabled();
        boolean a = this.f53393s.mo29801a();
        if (!isEnabled || !a) {
            viewOptions = new BleEnableViewOptions(isEnabled, a);
        } else if (this.f53378c.mo29737a()) {
            this.f53385j = false;
            viewOptions = new BleViewOptions(true);
        } else {
            this.f53385j = true;
            viewOptions = new BleViewOptions(false);
        }
        this.f53379d.mo30295a(i, viewOptions);
    }

    /* renamed from: a */
    public final void mo29723a(int i, BluetoothDevice bluetoothDevice) {
        if (this.f53386k != 3) {
            Logger Logger = f53375l;
            Object[] objArr = new Object[1];
            int i2 = this.f53386k;
            String a = xyq.m43651a(i2);
            if (i2 != 0) {
                objArr[0] = a;
                Logger.mo25414c("onBleDeviceBondStateChanged: mCurrentState: %s is not BONDING", objArr);
                return;
            }
            throw null;
        } else if (!this.f53381f.getAddress().equals(bluetoothDevice.getAddress())) {
            f53375l.mo25418e("Received bond state change intent for %s, waiting for %s, ignoring.", bluetoothDevice, this.f53381f);
        } else {
            yav yav = yav.MULTI_TRANSPORT;
            if (i - 1 != 0) {
                f53375l.mo25414c("Bluetooth device: %s Can't bond: BONDING_FAILURE", bluetoothDevice.getAddress());
                this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_PAIRING_FAILURE);
                this.f53397w = true;
                this.f53386k = 2;
                this.f53392r.mo29824b();
                m43653b(3);
                return;
            }
            this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_PAIRING_SUCCESS);
            this.f53392r.mo29824b();
            this.f53397w = false;
            m43654b(bluetoothDevice);
        }
    }

    /* renamed from: b */
    public final void mo29766b() {
        mo30275g();
    }

    /* renamed from: a */
    public final void mo29724a(ScanResult scanResult) {
        if (this.f53386k != 4 && xit.m43017c(scanResult)) {
            if (this.f53386k == 3 && xit.m43015a(scanResult)) {
                this.f53392r.mo29823a(scanResult);
                return;
            }
            BluetoothDevice device = scanResult.getDevice();
            if (device.getBondState() == 12) {
                f53375l.mo25409a("Discovered device: %s is already bonded", device);
                this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_BONDED_U2F_DEVICE_FOUND);
                m43654b(device);
            } else if (!xit.m43015a(scanResult)) {
            } else {
                if (this.f53385j) {
                    boolean a = this.f53392r.mo29823a(scanResult);
                    this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_UNBONDED_U2F_DEVICE_FOUND);
                    if (a) {
                        this.f53386k = 2;
                        this.f53397w = false;
                        m43653b(2);
                        return;
                    }
                    return;
                }
                f53375l.mo25412b("Skip onSecurityKeyFound since it is not in pairing flow.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo29765a(ViewOptions viewOptions) {
        bmxy.m108600b(Transport.BLUETOOTH_LOW_ENERGY.equals(viewOptions.mo18854b()));
        yav yav = yav.MULTI_TRANSPORT;
        int ordinal = viewOptions.mo18855c().ordinal();
        if (ordinal == 3) {
            xzz xzz = this.f53379d;
            xzz.f53506c.mo25412b("getCurrentView %s", xzz.f53507a);
            ViewOptions viewOptions2 = xzz.f53507a;
            if (!viewOptions2.mo18855c().equals(yav.BLE_ENABLE)) {
                if (viewOptions2.mo18855c().equals(yav.BLE) && ((BleViewOptions) viewOptions2).f31964a) {
                    if (this.f53386k == 1 || this.f53386k == 2) {
                        f53375l.mo25414c("onUserRequestedPairingAnotherSecurityKey", new Object[0]);
                        this.f53385j = true;
                        this.f53379d.mo30295a(3, new BleViewOptions(false));
                        return;
                    }
                    Logger Logger = f53375l;
                    Object[] objArr = new Object[1];
                    int i = this.f53386k;
                    String a = xyq.m43651a(i);
                    if (i != 0) {
                        objArr[0] = a;
                        Logger.mo25414c("Requested pairing another security key when mState isn't INIT or SELECTING (is %s)", objArr);
                        return;
                    }
                    throw null;
                }
            } else if (this.f53386k == 1) {
                f53375l.mo25414c("onUserRequestedEnablingBluetooth", new Object[0]);
                boolean isEnabled = this.f53389o.isEnabled();
                boolean a2 = this.f53393s.mo29801a();
                if (!isEnabled) {
                    this.f53389o.enable();
                }
                if (!a2) {
                    this.f53393s.mo29802b();
                    this.f53384i = true;
                    if (isEnabled) {
                        if (this.f53378c.mo29737a()) {
                            this.f53385j = false;
                            this.f53379d.mo30295a(2, new BleViewOptions(true));
                        } else {
                            this.f53385j = true;
                            this.f53379d.mo30295a(2, new BleViewOptions(false));
                        }
                        mo30274f();
                    }
                }
            } else {
                Logger logger2 = f53375l;
                Object[] objArr2 = new Object[1];
                int i2 = this.f53386k;
                String a3 = xyq.m43651a(i2);
                if (i2 != 0) {
                    objArr2[0] = a3;
                    logger2.mo25414c("Requested enabling Bluetooth when mState isn't INIT (is %s)", objArr2);
                    return;
                }
                throw null;
            }
        } else if (ordinal != 7) {
            this.f53379d.mo30295a(3, viewOptions);
        } else if (this.f53386k != 2) {
            Logger logger3 = f53375l;
            Object[] objArr3 = new Object[1];
            int i3 = this.f53386k;
            String a4 = xyq.m43651a(i3);
            if (i3 != 0) {
                objArr3[0] = a4;
                logger3.mo25414c("Requested pairing retry when mState isn't SELECTING (is %s)", objArr3);
                return;
            }
            throw null;
        } else {
            f53375l.mo25414c("onUserRequestedPairingRetry", new Object[0]);
            this.f53397w = false;
            this.f53385j = true;
            m43653b(3);
            this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_USER_REQUESTS_RETRY_PAIRING);
        }
    }

    /* renamed from: a */
    public final void mo30273a(String str, boolean z) {
        if (this.f53386k != 2) {
            Logger Logger = f53375l;
            Object[] objArr = new Object[1];
            int i = this.f53386k;
            String a = xyq.m43651a(i);
            if (i != 0) {
                objArr[0] = a;
                Logger.mo25414c("onUserSelectedBleDevice: mCurrentState: %s is not SELECTING", objArr);
                return;
            }
            throw null;
        }
        this.f53385j = false;
        BluetoothDevice a2 = this.f53392r.mo29821a(str);
        if (a2 == null) {
            Logger logger2 = f53375l;
            String valueOf = String.valueOf(str);
            logger2.mo25414c(valueOf.length() == 0 ? new String("User selected device not found in list. Device: ") : "User selected device not found in list. Device: ".concat(valueOf), new Object[0]);
            this.f53392r.mo29824b();
            m43653b(2);
            return;
        }
        int bondState = a2.getBondState();
        switch (bondState) {
            case 10:
                f53375l.mo25414c("Bluetooth device: %s is unbonded", a2.getAddress());
                if (!z) {
                    this.f53392r.mo29824b();
                    bmxy.m108581a(a2);
                    f53375l.mo25414c("pairWithBleDevice is called for device %s", a2);
                    this.f53380e.mo30186a(this.f53376a, xag.TYPE_BLUETOOTH_USER_REQUESTS_PAIRING);
                    this.f53379d.mo30295a(3, new BlePairViewOptions(m43652a(a2)));
                    this.f53386k = 3;
                    this.f53381f = a2;
                    this.f53391q.mo29812a(a2, this);
                    return;
                }
                return;
            case 11:
                f53375l.mo25414c("Bluetooth device: %s is bonding", a2.getAddress());
                return;
            case 12:
                f53375l.mo25414c("Bluetooth device: %s is bonded", a2.getAddress());
                this.f53392r.mo29824b();
                m43654b(a2);
                return;
            default:
                f53375l.mo25418e("Unknown bond state: %d", Integer.valueOf(bondState));
                return;
        }
    }
}
