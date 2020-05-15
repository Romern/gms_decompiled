package p000;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarStartupServiceImpl;

/* renamed from: otf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class otf {

    /* renamed from: b */
    public static final bnsn f38376b = odk.m28481a("CAR.WIFI.INFO");

    /* renamed from: a */
    public final otd f38377a = new otd();

    /* renamed from: c */
    public final CarStartupServiceImpl f38378c;

    /* renamed from: d */
    public boolean f38379d;

    /* renamed from: e */
    public boolean f38380e;

    /* renamed from: f */
    public boolean f38381f;

    /* renamed from: g */
    public boolean f38382g;

    /* renamed from: h */
    private boolean f38383h;

    public otf(CarStartupServiceImpl carStartupServiceImpl, UsbManager usbManager) {
        boolean z;
        boolean z2 = false;
        this.f38379d = false;
        this.f38380e = false;
        this.f38381f = false;
        this.f38382g = false;
        this.f38383h = false;
        this.f38378c = carStartupServiceImpl;
        Intent registerReceiver = carStartupServiceImpl.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null || !m29708b(registerReceiver)) {
            z = false;
        } else {
            z = true;
        }
        this.f38381f = z;
        this.f38382g = usbManager.getAccessoryList() != null ? true : z2;
    }

    /* renamed from: b */
    public static final boolean m29708b(Intent intent) {
        return (intent.getIntExtra("plugged", 0) & 3) != 0;
    }

    /* renamed from: a */
    public final void mo22600a() {
        this.f38379d = false;
        mo22603b();
    }

    /* renamed from: a */
    public final void mo22601a(Intent intent) {
        String action = intent.getAction();
        try {
            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                boolean b = m29708b(intent);
                if (this.f38381f != b) {
                    this.f38381f = b;
                    this.f38380e = false;
                    mo22603b();
                }
            } else if ("com.google.android.gms.car.USB_ISSUE_FOUND".equals(action)) {
                ofb ofb = (ofb) ofd.m28610a(intent, ofb.values());
                if (ofb == ofb.CHARGE_ONLY_DETECTED) {
                    this.f38380e = true;
                    mo22603b();
                } else if (ofb == ofb.CHARGE_ONLY_OVER) {
                    this.f38380e = false;
                    mo22603b();
                }
            } else if ("com.google.android.gms.car.FIRST_ACTIVITY".equals(action)) {
                if (((oew) ofd.m28610a(intent, oew.values())) == oew.ACCESSORY_ATTACHED) {
                    this.f38380e = false;
                    this.f38382g = true;
                    mo22603b();
                }
            } else if ("android.hardware.usb.action.USB_ACCESSORY_DETACHED".equals(action)) {
                this.f38382g = false;
                mo22603b();
            } else if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                if ("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION".equals(action)) {
                    int intExtra = intent.getIntExtra("NOTIFICATION_TYPE_EXTRA", -1);
                    BinderParcel binderParcel = (BinderParcel) intent.getParcelableExtra("PARCEL_EXTRA");
                    if (binderParcel != null) {
                        if (binderParcel.f29535a == this.f38377a) {
                            if (intExtra < 0 || intExtra >= ote.m29707a().length) {
                                bnsi c = f38376b.mo68388c();
                                c.mo68432a("otf", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                c.mo68409a("Invalid notificationType: %d", intExtra);
                                return;
                            }
                            int i = ote.m29707a()[intExtra];
                            int i2 = i - 1;
                            if (i == 0) {
                                throw null;
                            } else if (i2 == 0) {
                                mo22602a(oet.CHARGE_ONLY_MORE_INFO_SELECTED);
                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                intent2.setFlags(268566528);
                                intent2.setData(Uri.parse(ccvx.f180056a.mo6606a().mo76900e()));
                                this.f38378c.startActivity(intent2);
                                this.f38378c.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    bnsi c2 = f38376b.mo68388c();
                    c2.mo68432a("otf", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c2.mo68405a("Notification action from unknown source");
                }
            } else if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) == 10) {
                mo22600a();
            }
        } catch (oex e) {
            intent.getAction();
            e.getMessage();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo22603b() {
        char c;
        PendingIntent pendingIntent;
        CarStartupServiceImpl carStartupServiceImpl;
        if (this.f38379d && !this.f38382g) {
            String string = this.f38378c.getString(C0126R.string.car_startup_available_title);
            String string2 = this.f38378c.getString(C0126R.string.car_startup_bluetooth_connected);
            C1099jb jbVar = null;
            if (this.f38381f) {
                if (this.f38380e) {
                    string = this.f38378c.getString(C0126R.string.car_startup_error_title);
                    string2 = this.f38378c.getString(C0126R.string.car_startup_charge_only_detected);
                    Intent intent = new Intent("com.google.android.gms.car_setup.CAR_STARTUP_NOTIFICATION");
                    intent.putExtra("NOTIFICATION_TYPE_EXTRA", 0);
                    intent.putExtra("PARCEL_EXTRA", new BinderParcel(this.f38377a));
                    intent.setPackage(this.f38378c.getPackageName());
                    C1099jb jbVar2 = new C1099jb(0, this.f38378c.getString(C0126R.string.common_learn_more), PendingIntent.getBroadcast(this.f38378c, 0, intent, 134217728));
                    this.f38383h = true;
                    mo22602a(oet.CHARGE_ONLY_SHOWN);
                    if (ccqo.f179766a.mo6606a().mo76653a()) {
                        bpdn bpdn = bpdn.USB_CHARGE_ONLY;
                        CarStartupServiceImpl carStartupServiceImpl2 = this.f38378c;
                        Intent a = nli.m26724a(1, bpdn, carStartupServiceImpl2.getString(C0126R.string.car_startup_error_details, new Object[]{carStartupServiceImpl2.getString(C0126R.string.car_connection_type_usb), Boolean.valueOf(this.f38381f), Boolean.valueOf(this.f38380e), Boolean.valueOf(this.f38379d), Boolean.valueOf(this.f38382g)}));
                        CarStartupServiceImpl carStartupServiceImpl3 = this.f38378c;
                        int i = Build.VERSION.SDK_INT;
                        pendingIntent = becl.m91780a(carStartupServiceImpl3, 0, a, 201326592);
                        jbVar = jbVar2;
                        c = 2;
                    } else {
                        pendingIntent = null;
                        jbVar = jbVar2;
                        c = 2;
                    }
                    carStartupServiceImpl = this.f38378c;
                    if (!carStartupServiceImpl.f29619g) {
                        bnsi d = CarStartupServiceImpl.f29613a.mo68390d();
                        d.mo68432a("com.google.android.gms.carsetup.CarStartupServiceImpl", "a", 311, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        d.mo68405a("start foreground service");
                        carStartupServiceImpl.f29618f.mo22344a(carStartupServiceImpl, 100);
                        int a2 = nyw.m28209a(carStartupServiceImpl);
                        C1102je jeVar = new C1102je(carStartupServiceImpl);
                        jeVar.mo13640e(carStartupServiceImpl.getString(C0126R.string.car_app_name));
                        C1101jd jdVar = new C1101jd();
                        jdVar.mo13593a(string2);
                        jeVar.mo13626a(jdVar);
                        jeVar.mo13640e(string);
                        jeVar.mo13632b(string2);
                        jeVar.f22271w = carStartupServiceImpl.getResources().getColor(C0126R.color.car_light_blue_500);
                        jeVar.mo13630b(a2);
                        jeVar.f22258j = -1;
                        oed.m28558a(jeVar, carStartupServiceImpl.getString(C0126R.string.car_app_name));
                        if (jbVar != null) {
                            jeVar.mo13624a(jbVar);
                        }
                        if (pendingIntent != null) {
                            jeVar.f22254f = pendingIntent;
                        }
                        jeVar.mo13624a(new C1099jb(0, carStartupServiceImpl.getString(C0126R.string.common_dismiss), PendingIntent.getBroadcast(carStartupServiceImpl, 0, new Intent("com.google.android.gms.car_setup.CAR_STARTUP_STOP_FOREGROUND"), 0)));
                        if (ccvx.m131833b()) {
                            jeVar.mo13624a(new C1099jb(0, carStartupServiceImpl.getString(C0126R.string.common_retry), PendingIntent.getBroadcast(carStartupServiceImpl, 0, new Intent("com.google.android.gms.car_setup.RESET_CONNECTION"), 0)));
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        nyy a3 = nyy.m28213a(carStartupServiceImpl);
                        if (a3.mo21865a("car.default_notification_channel") == null) {
                            a3.mo21866a(new NotificationChannel("car.default_notification_channel", carStartupServiceImpl.getString(C0126R.string.car_app_name), 3));
                        }
                        if (a3.mo21865a("car.low_priority_notification_channel") == null && carStartupServiceImpl.f29621i) {
                            a3.mo21866a(new NotificationChannel("car.low_priority_notification_channel", carStartupServiceImpl.getString(C0126R.string.car_status_notification_channel_name), 2));
                        }
                        if (c == 1 && carStartupServiceImpl.f29621i) {
                            jeVar.f22244B = "car.low_priority_notification_channel";
                        } else {
                            jeVar.f22244B = "car.default_notification_channel";
                        }
                        carStartupServiceImpl.startForeground(CarStartupServiceImpl.f29614b, jeVar.mo13629b());
                        carStartupServiceImpl.f29615c.removeCallbacks(carStartupServiceImpl.f29622j);
                        carStartupServiceImpl.f29615c.postDelayed(carStartupServiceImpl.f29622j, carStartupServiceImpl.f29620h);
                        return;
                    }
                    return;
                }
                string = this.f38378c.getString(C0126R.string.car_startup_connecting_title);
                this.f38383h = false;
                string2 = "";
            } else if (this.f38383h) {
                return;
            }
            pendingIntent = null;
            c = 1;
            carStartupServiceImpl = this.f38378c;
            if (!carStartupServiceImpl.f29619g) {
            }
        } else {
            this.f38378c.mo17440b();
            this.f38383h = false;
        }
    }

    /* renamed from: a */
    public final void mo22602a(oet oet) {
        ofd.m28611a(this.f38378c, "com.google.android.gms.car.CAR_STARTUP_NOTIFICATION", oet);
    }
}
