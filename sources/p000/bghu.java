package p000;

import android.app.AlarmManager;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.gms.location.internal.NlpTestingRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bghu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bghu extends BroadcastReceiver {

    /* renamed from: a */
    final bgoy f116463a;

    /* renamed from: b */
    final /* synthetic */ bgid f116464b;

    /* renamed from: c */
    private final WifiManager f116465c = ((WifiManager) this.f116464b.f116480a.getApplicationContext().getSystemService("wifi"));

    public bghu(bgid bgid, bgoy bgoy) {
        this.f116464b = bgid;
        this.f116463a = bgoy;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    private final void m98924a(Intent intent, int i) {
        bgma a;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (bluetoothDevice != null && (a = bgkx.f116729g.mo62943a(bluetoothDevice)) != null) {
            String valueOf = String.valueOf(a.mo61923a());
            if (valueOf.length() == 0) {
                new String("BluetoothDevice event received from ");
            } else {
                "BluetoothDevice event received from ".concat(valueOf);
            }
            bfor bfor = this.f116464b.f116481b;
            String valueOf2 = String.valueOf(a.mo61925c());
            String str = "";
            StringBuilder sb = new StringBuilder((valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2)).replace(":", str).replace("-", str));
            if (i == 1) {
                String a2 = a.mo61923a();
                String b = a.mo61924b();
                String[] strArr = new String[2];
                if (a2 == null) {
                    a2 = str;
                }
                strArr[0] = a2;
                if (b != null) {
                    str = b;
                }
                strArr[1] = str;
                for (int i2 = 0; i2 < 2; i2++) {
                    String str2 = strArr[i2];
                    sb.append("\u0000");
                    sb.append((CharSequence) str2, 0, Math.min(str2.length(), 20));
                    if (str2.length() > 20) {
                        sb.append("+");
                        sb.append(str2.length() - 20);
                    }
                }
            }
            bfor.mo62047a(new bgfq(bfos.BLUETOOTH_DEVICE_EVENT, bfor.mo62055b(), sb.toString(), i, a.mo61927e(), i, a));
            this.f116463a.mo61027a(a, i);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgid.a(java.util.List, bfnz[], boolean):void
     arg types: [java.util.ArrayList, ?[OBJECT, ARRAY], int]
     candidates:
      bgid.a(android.net.ConnectivityManager, android.net.wifi.WifiManager, bgoy):void
      bgid.a(bgnq, long, long):void
      bgid.a(java.util.List, bfnz[], boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0377, code lost:
        if (r2 == 1) goto L_0x0379;
     */
    public final void onReceive(Context context, Intent intent) {
        char c;
        List<ScanResult> list;
        ArrayList arrayList;
        byte[] byteArrayExtra;
        int i;
        long j;
        char c2;
        Context context2 = context;
        Intent intent2 = intent;
        String action = intent.getAction();
        if (action != null) {
            NlpTestingRequest nlpTestingRequest = null;
            this.f116464b.f116485f.f116630k.mo62923b(bgnq.CALLBACK_RUNNER, 60000, null);
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (!"android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED".equals(action)) {
                    char c3 = 65535;
                    switch (action.hashCode()) {
                        case -2128145023:
                            if (action.equals("android.intent.action.SCREEN_OFF")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -2115714282:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTION_TRIGGER")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1932583755:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_PASSIVE_COLLECTOR")) {
                                c = 9;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                c = 24;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1875733435:
                            if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                                c = 20;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1530327060:
                            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                c = 30;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1492944353:
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1454123155:
                            if (action.equals("android.intent.action.SCREEN_ON")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1447825418:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_LOCATOR")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1239299127:
                            if (action.equals("com.google.android.gms.location.reporting.SETTINGS_CHANGED")) {
                                c = 18;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1172645946:
                            if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                                c = 25;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1076576821:
                            if (action.equals("android.intent.action.AIRPLANE_MODE")) {
                                c = 22;
                                break;
                            }
                            c = 65535;
                            break;
                        case -840265874:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_BURST_COLLECTOR")) {
                                c = 8;
                                break;
                            }
                            c = 65535;
                            break;
                        case -544318258:
                            if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                                c = 31;
                                break;
                            }
                            c = 65535;
                            break;
                        case -511271086:
                            if (action.equals("android.location.MODE_CHANGED")) {
                                c = ' ';
                                break;
                            }
                            c = 65535;
                            break;
                        case -408368299:
                            if (action.equals("android.app.action.NEXT_ALARM_CLOCK_CHANGED")) {
                                c = '!';
                                break;
                            }
                            c = 65535;
                            break;
                        case -301431627:
                            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -153800628:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_CACHE_UPDATER")) {
                                c = 10;
                                break;
                            }
                            c = 65535;
                            break;
                        case 61159861:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_ACTIVITY_DETECTION")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 391194280:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_SENSOR_COLLECTOR")) {
                                c = 12;
                                break;
                            }
                            c = 65535;
                            break;
                        case 407474387:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_SENSOR_UPLOADER")) {
                                c = 13;
                                break;
                            }
                            c = 65535;
                            break;
                        case 576984862:
                            if (action.equals("com.google.android.location.internal.intent.action.NLP_TESTING")) {
                                c = 28;
                                break;
                            }
                            c = 65535;
                            break;
                        case 665559796:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_ACTIVE_COLLECTOR")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 823795052:
                            if (action.equals("android.intent.action.USER_PRESENT")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 870701415:
                            if (action.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED")) {
                                c = 27;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                c = 23;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1064040788:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_VEHICLE_EXIT_DETECTOR")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1161967544:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_CALIBRATION_COLLECTOR")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1170068450:
                            if (action.equals("com.google.android.apps.gmm.NAVIGATION_STATE")) {
                                c = 29;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1197370151:
                            if (action.equals("com.google.android.location.ALARM_WAKEUP_IN_OUT_DOOR_COLLECTOR")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1369399522:
                            if (action.equals("android.net.wifi.rtt.action.WIFI_RTT_STATE_CHANGED")) {
                                c = 21;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1779291251:
                            if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                                c = 26;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1821585647:
                            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1878357501:
                            if (action.equals("android.net.wifi.SCAN_RESULTS")) {
                                c = 19;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            bgfx.m98784b(this.f116464b.f116481b, false);
                            this.f116463a.mo61034a(false);
                            break;
                        case 1:
                            bgfx.m98784b(this.f116464b.f116481b, true);
                            this.f116463a.mo61034a(true);
                            break;
                        case 2:
                            m98924a(intent2, 1);
                            break;
                        case 3:
                            m98924a(intent2, 2);
                            break;
                        case 4:
                            m98924a(intent2, 3);
                            break;
                        case 5:
                            bfor bfor = this.f116464b.f116481b;
                            bfor.mo62047a(new bfop(bfos.USER_PRESENT, bfor.mo62055b()));
                            this.f116463a.mo61039b();
                            break;
                        case 6:
                            this.f116464b.mo62837a(0);
                            if (ceze.m138459d()) {
                                aki.m919a(context).mo874a(new Intent("com.google.android.location.internal.LOCATOR_ALARM_TRIGGERED"));
                                break;
                            }
                            break;
                        case 7:
                            this.f116464b.mo62837a(1);
                            break;
                        case 8:
                            this.f116464b.mo62837a(2);
                            break;
                        case 9:
                            this.f116464b.mo62837a(3);
                            break;
                        case 10:
                            this.f116464b.mo62837a(4);
                            break;
                        case 11:
                            this.f116464b.mo62837a(5);
                            break;
                        case 12:
                            this.f116464b.mo62837a(6);
                            break;
                        case 13:
                            this.f116464b.mo62837a(7);
                            break;
                        case 14:
                            this.f116464b.mo62837a(8);
                            break;
                        case 15:
                            this.f116464b.mo62837a(9);
                            break;
                        case 16:
                            this.f116464b.mo62837a(10);
                            break;
                        case 17:
                            this.f116464b.mo62837a(11);
                            break;
                        case 18:
                            this.f116464b.f116485f.f116629j.mo62927b();
                            break;
                        case 19:
                            try {
                                list = this.f116464b.f116489j ? this.f116465c.getScanResults() : null;
                            } catch (RuntimeException e) {
                                list = null;
                            }
                            if (list != null) {
                                if (list.size() > 0) {
                                    bgkx bgkx = bgkx.f116729g;
                                    bgkf[] bgkfArr = new bgkf[list.size()];
                                    int i3 = 0;
                                    for (ScanResult scanResult : list) {
                                        bgkfArr[i3] = bgkx.mo62951a(scanResult);
                                        i3++;
                                    }
                                    arrayList = new ArrayList(1);
                                    arrayList.add(bgkfArr);
                                    this.f116464b.mo62843a((List) arrayList, (bfnz[]) null, false);
                                    break;
                                }
                            }
                            arrayList = new ArrayList(0);
                            this.f116464b.mo62843a((List) arrayList, (bfnz[]) null, false);
                        case 20:
                            int intExtra = intent2.getIntExtra("wifi_state", 4);
                            if (intExtra == 3) {
                            }
                            this.f116464b.mo62849b(this.f116463a);
                            break;
                        case 21:
                            bgid bgid = this.f116464b;
                            bgjp bgjp = bgid.f116485f;
                            bgid.m98971a(bgid.f116481b, context2);
                            break;
                        case 22:
                            boolean a = bgid.m98972a(context);
                            bgfx.m98782a(this.f116464b.f116481b, a);
                            this.f116463a.mo61052g(a);
                            break;
                        case 23:
                        case 24:
                            if (cese.m138164m()) {
                                this.f116464b.mo62840a(this.f116463a);
                                break;
                            }
                            break;
                        case 25:
                            this.f116464b.mo62838a((ConnectivityManager) context2.getSystemService("connectivity"), this.f116465c, this.f116463a);
                            break;
                        case 26:
                            bgkx bgkx2 = bgkx.f116729g;
                            boolean isPowerSaveMode = ((PowerManager) context2.getSystemService("power")).isPowerSaveMode();
                            bgfx.m98786d(this.f116464b.f116481b, isPowerSaveMode);
                            this.f116463a.mo61042b(isPowerSaveMode);
                            break;
                        case 27:
                            bgkx bgkx3 = bgkx.f116729g;
                            boolean isDeviceIdleMode = ((PowerManager) context2.getSystemService("power")).isDeviceIdleMode();
                            bgfx.m98787e(this.f116464b.f116481b, isDeviceIdleMode);
                            this.f116463a.mo61044c(isDeviceIdleMode);
                            break;
                        case 28:
                            if (ceze.f183524a.mo6606a().enableTestingFeatures()) {
                                if (!(intent2 == null || (byteArrayExtra = intent2.getByteArrayExtra("com.google.android.gms.location.internal.EXTRA_NLP_TESTING_REQUEST")) == null)) {
                                    nlpTestingRequest = (NlpTestingRequest) sef.m35069a(byteArrayExtra, NlpTestingRequest.CREATOR);
                                }
                                if (nlpTestingRequest != null) {
                                    this.f116463a.mo61040b(nlpTestingRequest.f79437a);
                                    break;
                                }
                            }
                            break;
                        case 29:
                            bgoy bgoy = this.f116463a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            bmxy.m108581a(intent);
                            boolean booleanExtra = intent2.getBooleanExtra("nav", false);
                            String stringExtra = intent2.getStringExtra("mode");
                            if (stringExtra != null) {
                                int hashCode = stringExtra.hashCode();
                                if (hashCode != 98) {
                                    if (hashCode != 100) {
                                        if (hashCode != 105) {
                                            if (hashCode != 114) {
                                                if (hashCode == 119 && stringExtra.equals("w")) {
                                                    c3 = 2;
                                                }
                                            } else if (stringExtra.equals("r")) {
                                                c3 = 1;
                                            }
                                        } else if (stringExtra.equals("i")) {
                                            c3 = 4;
                                        }
                                    } else if (stringExtra.equals("d")) {
                                        c3 = 0;
                                    }
                                } else if (stringExtra.equals("b")) {
                                    c3 = 3;
                                }
                                i = c3 != 0 ? c3 != 1 ? c3 != 2 ? c3 != 3 ? c3 != 4 ? 0 : 5 : 4 : 3 : 2 : 1;
                            } else {
                                i = 0;
                            }
                            boolean booleanExtra2 = intent2.getBooleanExtra("fg", false);
                            Locale locale = Locale.US;
                            Object[] objArr = {Boolean.valueOf(booleanExtra), Integer.valueOf(i), stringExtra, Boolean.valueOf(booleanExtra2)};
                            bgoy.mo61022a(new bfkk(booleanExtra2, booleanExtra, i, elapsedRealtime));
                            break;
                        case 30:
                            this.f116463a.mo61016a(intent2.getIntExtra("android.bluetooth.adapter.extra.STATE", -1));
                            break;
                        case 31:
                            if ("com.google.android.location".equals(intent2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                                this.f116463a.mo61053h();
                                break;
                            }
                            break;
                        case ' ':
                            int i4 = Build.VERSION.SDK_INT;
                            LocationManager locationManager = (LocationManager) context2.getSystemService("location");
                            if (locationManager != null) {
                                this.f116463a.mo61046d(locationManager.isLocationEnabled());
                                break;
                            }
                            break;
                        case '!':
                            bgid bgid2 = this.f116464b;
                            int i5 = Build.VERSION.SDK_INT;
                            AlarmManager.AlarmClockInfo nextAlarmClock = ((AlarmManager) bgid2.f116480a.getSystemService("alarm")).getNextAlarmClock();
                            if (nextAlarmClock != null) {
                                j = nextAlarmClock.getTriggerTime();
                            } else {
                                j = 0;
                            }
                            bgid2.f116491l.mo61020a(j);
                            break;
                        default:
                            bgkx bgkx4 = bgkx.f116729g;
                            if (!"android.intent.action.USER_FOREGROUND".equals(action)) {
                                c2 = !"android.intent.action.USER_BACKGROUND".equals(action) ? (char) 0 : 1;
                            } else {
                                c2 = 2;
                            }
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    if (action.length() != 0) {
                                        "Unexpected action ".concat(action);
                                        break;
                                    } else {
                                        new String("Unexpected action ");
                                        break;
                                    }
                                } else {
                                    this.f116463a.mo61043c();
                                    this.f116464b.f116489j = true;
                                    break;
                                }
                            } else {
                                this.f116463a.mo61045d();
                                this.f116464b.f116489j = false;
                                break;
                            }
                    }
                } else {
                    this.f116463a.mo61051g();
                }
                this.f116464b.f116485f.f116630k.mo62925c(bgnq.CALLBACK_RUNNER);
            } catch (Exception e2) {
                throw e2;
            } catch (Throwable th) {
                Throwable th2 = th;
                this.f116464b.f116485f.f116630k.mo62925c(bgnq.CALLBACK_RUNNER);
                throw th2;
            }
        }
    }
}
