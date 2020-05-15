package com.google.android.gms.carsetup;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Service;
import com.google.android.gms.car.compat.TracingBroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarStartupServiceImpl extends Service {

    /* renamed from: a */
    public static final bnsn f29613a = odk.m28481a("CAR.WIFI.INFO");

    /* renamed from: b */
    public static final int f29614b = C0126R.C0129id.car_startup_service_notification_id;

    /* renamed from: c */
    public final Handler f29615c = new adzt(Looper.getMainLooper());

    /* renamed from: d */
    ovl f29616d;

    /* renamed from: e */
    public otf f29617e;

    /* renamed from: f */
    public omx f29618f;

    /* renamed from: g */
    public boolean f29619g = false;

    /* renamed from: h */
    public long f29620h = 60000;

    /* renamed from: i */
    public boolean f29621i = false;

    /* renamed from: j */
    public final Runnable f29622j = new osz(this);

    /* renamed from: k */
    public pec f29623k;

    /* renamed from: l */
    final ota f29624l = new ota();

    /* renamed from: m */
    final otb f29625m = new otb(this);

    /* renamed from: n */
    final otc f29626n = new otc(this);

    /* renamed from: o */
    private final BroadcastReceiver f29627o = new CarStartupBroadcastReceiver();

    /* renamed from: p */
    private npd f29628p;

    /* renamed from: q */
    private HandlerThread f29629q;

    /* renamed from: r */
    private HandlerThread f29630r;

    /* renamed from: s */
    private boolean f29631s = false;

    /* renamed from: t */
    private boolean f29632t;

    /* renamed from: u */
    private final osy f29633u = osy.f38372a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    class CarStartupBroadcastReceiver extends TracingBroadcastReceiver {
        public CarStartupBroadcastReceiver() {
            super("car");
        }

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            if ("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND".equals(intent.getAction())) {
                CarStartupServiceImpl.this.mo17440b();
                return;
            }
            if ("com.google.android.gms.car_setup.RESET_CONNECTION".equals(intent.getAction())) {
                CarStartupServiceImpl carStartupServiceImpl = CarStartupServiceImpl.this;
                bnsn bnsn = CarStartupServiceImpl.f29613a;
                omx omx = carStartupServiceImpl.f29618f;
                if (omx != null) {
                    omx.mo22345a();
                    return;
                }
            }
            CarStartupServiceImpl carStartupServiceImpl2 = CarStartupServiceImpl.this;
            bnsn bnsn2 = CarStartupServiceImpl.f29613a;
            otf otf = carStartupServiceImpl2.f29617e;
            if (otf != null) {
                String action = intent.getAction();
                try {
                    if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                        boolean b = otf.m29708b(intent);
                        if (otf.f38381f != b) {
                            otf.f38381f = b;
                            otf.f38380e = false;
                            otf.mo22603b();
                        }
                    } else if ("com.google.android.gms.car.USB_ISSUE_FOUND".equals(action)) {
                        ofb ofb = (ofb) ofd.m28610a(intent, ofb.values());
                        if (ofb == ofb.CHARGE_ONLY_DETECTED) {
                            otf.f38380e = true;
                            otf.mo22603b();
                        } else if (ofb == ofb.CHARGE_ONLY_OVER) {
                            otf.f38380e = false;
                            otf.mo22603b();
                        }
                    } else if ("com.google.android.gms.car.FIRST_ACTIVITY".equals(action)) {
                        if (((oew) ofd.m28610a(intent, oew.values())) == oew.ACCESSORY_ATTACHED) {
                            otf.f38380e = false;
                            otf.f38382g = true;
                            otf.mo22603b();
                        }
                    } else if ("android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action)) {
                        otf.f38382g = false;
                        otf.mo22603b();
                    } else if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                        if ("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION".equals(action)) {
                            int intExtra = intent.getIntExtra("NOTIFICATION_TYPE_EXTRA", -1);
                            BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("PARCEL_EXTRA");
                            if (binderParcel != null) {
                                if (binderParcel.f29535a == otf.f38377a) {
                                    if (intExtra < 0 || intExtra >= ote.m29707a().length) {
                                        bnsi c = otf.f38376b.mo68388c();
                                        c.mo68432a("otf", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        c.mo68409a("Invalid notificationType: %d", intExtra);
                                        return;
                                    }
                                    int i = ote.m29707a()[intExtra];
                                    int i2 = i - 1;
                                    if (i == 0) {
                                        throw null;
                                    } else if (i2 == 0) {
                                        otf.mo22602a(oet.CHARGE_ONLY_MORE_INFO_SELECTED);
                                        Intent intent2 = new Intent("android.intent.action.VIEW");
                                        intent2.setFlags(268566528);
                                        intent2.setData(Uri.parse(ccvx.f180056a.mo6606a().mo76900e()));
                                        otf.f38378c.startActivity(intent2);
                                        otf.f38378c.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                            }
                            bnsi c2 = otf.f38376b.mo68388c();
                            c2.mo68432a("otf", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c2.mo68405a("Notification action from unknown source");
                        }
                    } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10) {
                        otf.mo22600a();
                    }
                } catch (oex e) {
                    intent.getAction();
                    e.getMessage();
                }
            }
        }
    }

    /* renamed from: a */
    static final HandlerThread m22154a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }

    /* renamed from: b */
    public final void mo17440b() {
        if (this.f29619g) {
            this.f29615c.removeCallbacks(this.f29622j);
            this.f29618f.mo22343a((Object) this);
            stopForeground(true);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.f29619g = ccwa.m131880b() && ccql.m131267b();
        bnsi d = f29613a.mo68390d();
        d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "onCreate", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68420a("onCreate usbMonitoringEnabled %b", Boolean.valueOf(this.f29619g));
        this.f29620h = ccvx.f180056a.mo6606a().mo76898c();
        this.f29621i = ccvx.f180056a.mo6606a().mo76916u();
        this.f29628p = npd.m27127a(this);
        this.f29629q = m22154a("Car-Wifi-Control");
        this.f29630r = m22154a("Car-Wifi-BT-Read");
        this.f29616d = new ovl(new orn(this, this.f29628p));
        pcu pcu = ccui.f179964a.mo6606a().mo76833q() ? new pcu(getApplicationContext()) : null;
        peb peb = new peb(this);
        peb.f38953b = this.f29629q;
        peb.f38954c = this.f29630r;
        peb.f38961j = this.f29633u;
        peb.f38955d = this.f29616d;
        peb.f38962k = this.f29625m;
        peb.f38956e = npp.f36342d;
        bngj bngj = pcn.f38842a;
        bmxy.m108581a(bngj);
        peb.f38957f = bngj;
        peb.f38958g = pcu;
        if (Log.isLoggable("CAR.WIFI.INFO", 2)) {
            peb.f38960i = this.f29624l;
        }
        this.f29623k = new pdz(peb.f38952a, peb.f38953b, peb.f38954c, null, peb.f38960i, peb.f38961j, peb.f38955d, peb.f38962k, peb.f38956e, peb.f38957f, false, peb.f38958g, false, false, false, false, false, false, peb.f38959h);
        if (ccui.f179964a.mo6606a().mo76827k() && m22156a((BluetoothDevice) null)) {
            pec pec = this.f29623k;
            otc otc = this.f29626n;
            synchronized (((pdz) pec).f38925b) {
                ((pdz) pec).f38928e.add(otc);
            }
            pec pec2 = this.f29623k;
            pdz pdz = (pdz) pec2;
            synchronized (pdz.f38925b) {
                if (dcm.IDLE.equals(((pdz) pec2).f38927d) || dcm.SHUTDOWN.equals(((pdz) pec2).f38927d)) {
                    ((pdz) pec2).f38927d = dcm.IDLE;
                    WifiManager.WifiLock createWifiLock = ((WifiManager) pdz.f38929f.getApplicationContext().getSystemService("wifi")).createWifiLock(3, "Car wifi lock");
                    createWifiLock.setReferenceCounted(false);
                    pdz.f38943t = createWifiLock;
                    pdz.f38948y = pdz.m30227a(pdz.f38945v.getLooper());
                    pdz.f38949z = pdz.m30227a(pdz.f38946w.getLooper());
                    if (pdz.f38900D) {
                        pdz.f38897A = pdz.m30227a(pdz.f38947x.getLooper());
                    }
                    pdz.f38903G = new pce(pdz.f38929f, pdz.f38944u, pdz.f38948y, new pdy(pdz), pdz.f38912P);
                    pce pce = pdz.f38903G;
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                        pce.f38816f = new pcd(pce);
                        defaultAdapter.getProfileProxy(pce.f38812b, pce.f38816f, 1);
                    }
                    IntentFilter intentFilter = new IntentFilter("android.net.wifi.supplicant.STATE_CHANGE");
                    intentFilter.addAction("android.net.wifi.supplicant.STATE_CHANGE");
                    intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                    intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    pdz.f38929f.registerReceiver(pdz.f38910N, intentFilter);
                } else {
                    bnsi b = pdz.f38896a.mo68387b();
                    b.mo68432a("pdz", "a", 366, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    b.mo68420a("Not the right mostRecentSetupEvent to start: %s", ((pdz) pec2).f38927d);
                }
            }
            this.f29631s = true;
        }
        if (this.f29619g) {
            this.f29618f = omx.m29200a((Context) this);
            this.f29617e = new otf(this, (UsbManager) getSystemService("usb"));
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.BATTERY_CHANGED");
            intentFilter2.addAction("com.google.android.gms.car.FIRST_ACTIVITY");
            intentFilter2.addAction("android.hardware.usb.action.USB_ACCESSORY_DETACHED");
            intentFilter2.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter2.addAction("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION");
            intentFilter2.addAction("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND");
            intentFilter2.addAction("com.google.android.gms.car_setup.RESET_CONNECTION");
            if (ccvx.f180056a.mo6606a().mo76901f()) {
                intentFilter2.addAction("com.google.android.gms.car.USB_ISSUE_FOUND");
            }
            registerReceiver(this.f29627o, intentFilter2);
            aki.m919a(this).mo873a(this.f29627o, intentFilter2);
            this.f29632t = true;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f29632t) {
            this.f29632t = false;
            unregisterReceiver(this.f29627o);
            aki.m919a(this).mo872a(this.f29627o);
        }
        this.f29615c.removeCallbacks(this.f29622j);
        if (this.f29631s) {
            pec pec = this.f29623k;
            otc otc = this.f29626n;
            synchronized (((pdz) pec).f38925b) {
                ((pdz) pec).f38928e.remove(otc);
            }
            this.f29623k.mo22953b();
            this.f29631s = false;
        }
        this.f29629q.quitSafely();
        this.f29630r.quitSafely();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = 2;
        if (intent == null) {
            return 2;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice == null) {
            bnsi d = f29613a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "onStartCommand", 454, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("No device: %s", intent);
        } else if (this.f29631s && intent.getBooleanExtra("car_startup.HAS_WIFI", true) && m22156a(bluetoothDevice)) {
            pec pec = this.f29623k;
            pdz pdz = (pdz) pec;
            synchronized (pdz.f38925b) {
                if (!dcm.IDLE.equals(((pdz) pec).f38927d)) {
                    ((pdz) pec).f38912P.mo22596a();
                    i3 = 1;
                } else {
                    pdz.f38948y.post(new pdi(pdz, bluetoothDevice));
                    i3 = 1;
                }
            }
        }
        String action = intent.getAction();
        if (intent.getBooleanExtra("car_setup.SUPPORTS_ANDROID_AUTO", false) && this.f29619g && this.f29617e != null) {
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                otf otf = this.f29617e;
                otf.f38379d = true;
                otf.mo22603b();
            } else if ("android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                this.f29617e.mo22600a();
            }
        }
        return i3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: npd.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      npd.a(java.lang.String, int):int
      npd.a(java.lang.String, java.lang.String):java.lang.String
      npd.a(java.lang.String, java.util.Set):java.util.Set
      npd.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    private final boolean m22156a(BluetoothDevice bluetoothDevice) {
        String str;
        if (ccui.f179964a.mo6606a().mo76830n()) {
            String a = pbt.m30183a(this);
            if (!TextUtils.isEmpty(a)) {
                Intent addCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.CAR_DOCK");
                addCategory.setPackage(a);
                ResolveInfo resolveActivity = getPackageManager().resolveActivity(addCategory, 65664);
                if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
                    bnsi d = f29613a.mo68390d();
                    d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 498, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    d.mo68405a("Gearhead available to handle. Skip setup.");
                    return false;
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (C1133kh.m17835a(this, "android.permission.READ_PHONE_STATE") != 0) {
            str = "unknown";
        } else {
            str = Build.getSerial();
        }
        if ("unknown".equals(str) && bluetoothDevice != null) {
            this.f29616d.mo22691a(0, 1, 1, 4, bluetoothDevice);
            return false;
        }
        if (!ccws.f180121a.mo6606a().mo76955b()) {
            bnsi c = f29613a.mo68388c();
            c.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 521, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Unsupported GmsCore version for wireless projection.");
        } else if (!this.f29628p.mo21386a("car_disable_wireless_projection", false)) {
            return true;
        } else {
            bnsi d2 = f29613a.mo68390d();
            d2.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 518, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("Wireless projection disabled by user.");
        }
        return false;
    }

    /* renamed from: a */
    public final void mo17438a() {
        dcm dcm;
        pec pec = this.f29623k;
        synchronized (((pdz) pec).f38925b) {
            dcm = ((pdz) pec).f38927d;
        }
        if (dcm.SHUTDOWN.equals(dcm) || dcm.IDLE.equals(dcm)) {
            bnsi d = f29613a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 230, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Startup service stopping");
            mo17440b();
            stopSelf();
        }
    }

    /* renamed from: a */
    public final void mo17439a(String str, String str2, int i, C1099jb jbVar, PendingIntent pendingIntent) {
        if (this.f29619g) {
            bnsi d = f29613a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 311, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("start foreground service");
            this.f29618f.mo22344a(this, 100);
            int a = nyw.m28209a(this);
            C1102je jeVar = new C1102je(this);
            jeVar.mo13640e(getString(C0126R.string.car_app_name));
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(str2);
            jeVar.mo13626a(jdVar);
            jeVar.mo13640e(str);
            jeVar.mo13632b(str2);
            jeVar.f22271w = getResources().getColor(C0126R.color.car_light_blue_500);
            jeVar.mo13630b(a);
            jeVar.f22258j = -1;
            oed.m28558a(jeVar, getString(C0126R.string.car_app_name));
            if (jbVar != null) {
                jeVar.mo13624a(jbVar);
            }
            if (pendingIntent != null) {
                jeVar.f22254f = pendingIntent;
            }
            jeVar.mo13624a(new C1099jb(0, getString(C0126R.string.common_dismiss), PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND"), 0)));
            if (ccvx.m131833b()) {
                jeVar.mo13624a(new C1099jb(0, getString(C0126R.string.common_retry), PendingIntent.getBroadcast(this, 0, new Intent("com.google.android.gms.car_setup.RESET_CONNECTION"), 0)));
            }
            int i2 = Build.VERSION.SDK_INT;
            nyy a2 = nyy.m28213a(this);
            if (a2.mo21865a("car.default_notification_channel") == null) {
                a2.mo21866a(new NotificationChannel("car.default_notification_channel", getString(C0126R.string.car_app_name), 3));
            }
            if (a2.mo21865a("car.low_priority_notification_channel") == null && this.f29621i) {
                a2.mo21866a(new NotificationChannel("car.low_priority_notification_channel", getString(C0126R.string.car_status_notification_channel_name), 2));
            }
            if (i == 1 && this.f29621i) {
                jeVar.f22244B = "car.low_priority_notification_channel";
            } else {
                jeVar.f22244B = "car.default_notification_channel";
            }
            startForeground(f29614b, jeVar.mo13629b());
            this.f29615c.removeCallbacks(this.f29622j);
            this.f29615c.postDelayed(this.f29622j, this.f29620h);
        }
    }
}
