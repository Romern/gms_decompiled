package com.google.android.gms.mdm.services;

import android.accounts.Account;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.BatteryManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.telephony.euicc.EuiccManager;
import android.text.TextUtils;
import android.util.Base64;
import com.android.volley.Response;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mdm.receivers.ActivateDeviceAdminUponUnlockChimeraReceiver;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmReceiverChimeraService extends afzk {

    /* renamed from: d */
    private boolean f80054d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030d, code lost:
        if (android.telephony.PhoneNumberUtils.isEmergencyNumber(r2) == false) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0310, code lost:
        r3.add(p000.cake.LOCKSCREEN_PHONE_NUMBER_INVALID);
        r2 = null;
     */
    /* renamed from: b */
    public final void mo35097b(Intent intent) {
        cakc cakc;
        cajz cajz;
        String str;
        boolean z;
        cajz cajz2;
        String str2;
        String str3;
        Intent intent2 = intent;
        cajz cajz3 = null;
        ((afzk) this).f65010a = null;
        ((afzk) this).f65011b = false;
        this.f80054d = false;
        bxvd da = cakc.f174926m.mo74144da();
        try {
            if (intent2.hasExtra("rp")) {
                da.mo73633b(Base64.decode(intent2.getStringExtra("rp"), 0));
            } else if (intent2.hasExtra("payload")) {
                da.mo73633b(intent2.getByteArrayExtra("payload"));
            } else {
                if (intent2.hasExtra("action")) {
                    cakb a = cakb.m126711a(intent2.getIntExtra("action", 0));
                    if (a == null) {
                        a = cakb.NOOP;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cakc cakc2 = (cakc) da.f164949b;
                    cakc2.f174929b = a.f174925m;
                    cakc2.f174928a |= 1;
                } else {
                    cakb cakb = cakb.NOOP;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cakc cakc3 = (cakc) da.f164949b;
                    cakc3.f174929b = cakb.f174925m;
                    cakc3.f174928a |= 1;
                }
                String str4 = "";
                if (intent2.hasExtra("token")) {
                    str2 = intent2.getStringExtra("token");
                } else {
                    str2 = str4;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakc cakc4 = (cakc) da.f164949b;
                str2.getClass();
                cakc4.f174928a |= 2;
                cakc4.f174930c = str2;
                byte[] a2 = spn.m35862a(intent2.hasExtra("email") ? intent2.getStringExtra("email") : str4, "SHA-256");
                if (a2 != null) {
                    bxtx a3 = bxtx.m123261a(a2);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cakc cakc5 = (cakc) da.f164949b;
                    a3.getClass();
                    cakc5.f174928a |= 4;
                    cakc5.f174931d = a3;
                }
                boolean booleanExtra = intent2.getBooleanExtra("locate", false);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakc cakc6 = (cakc) da.f164949b;
                cakc6.f174928a |= 8;
                cakc6.f174932e = booleanExtra;
                if (intent2.hasExtra("new_password")) {
                    str3 = intent2.getStringExtra("new_password");
                } else {
                    str3 = str4;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakc cakc7 = (cakc) da.f164949b;
                str3.getClass();
                cakc7.f174928a |= 16;
                cakc7.f174933f = str3;
                if (intent2.hasExtra("lock_message")) {
                    str4 = intent2.getStringExtra("lock_message");
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cakc cakc8 = (cakc) da.f164949b;
                str4.getClass();
                cakc8.f174928a |= 32;
                cakc8.f174934g = str4;
            }
            cakc = (cakc) da.mo74062i();
        } catch (bxwf e) {
            agac.m53790a("Invalid remote policy proto. Ignoring", new Object[0]);
            cakc = null;
        }
        if (cakc != null) {
            Object[] objArr = new Object[4];
            cakb a4 = cakb.m126711a(cakc.f174929b);
            if (a4 == null) {
                a4 = cakb.NOOP;
            }
            objArr[0] = a4;
            objArr[1] = cakc.f174930c;
            objArr[2] = sqd.m35970c(cakc.f174931d.mo73780k());
            objArr[3] = Boolean.valueOf(cakc.f174932e);
            agac.m53792b("processing remote instruction: [%s, %s, %s, %s]", objArr);
            ((afzk) this).f65010a = cakc.f174930c;
            afzd.f64998l.mo10352a(((afzk) this).f65010a);
            ((afzk) this).f65011b = cakc.f174937j;
            mo35098b(cakc);
            byte[] k = cakc.f174931d.mo73780k();
            if (!(k == null || k.length == 0)) {
                Account[] a5 = adyd.m51363a(this).mo33916a("com.google");
                int length = a5.length;
                int i = 0;
                while (i < length) {
                    String str5 = a5[i].name;
                    if (!TextUtils.isEmpty(str5)) {
                        String lowerCase = str5.toLowerCase(Locale.US);
                        if (!afzk.m53723a(lowerCase, k)) {
                            String[] strArr = ((afzk) this).f65012c;
                            int length2 = strArr.length;
                            int i2 = 0;
                            while (i2 < length2) {
                                String str6 = strArr[i2];
                                if (!lowerCase.endsWith(str6) || !afzk.m53723a(lowerCase.replaceAll(str6, "@gmail.com"), k)) {
                                    i2++;
                                }
                            }
                            continue;
                        }
                        if (cgki.m145894b() && !((Boolean) afzd.f64991e.mo10351a()).booleanValue()) {
                            mo35099b(cake.LOCATION_DISABLED_IN_CONSOLE);
                            return;
                        }
                        boolean z2 = cakc.f174932e;
                        cakb a6 = cakb.m126711a(cakc.f174929b);
                        if (a6 == null) {
                            a6 = cakb.NOOP;
                        }
                        switch (a6.ordinal()) {
                            case 0:
                                mo35099b(cake.SUCCESS);
                                return;
                            case 1:
                                if (mo35100b()) {
                                    if (z2) {
                                        try {
                                            mo35090a(10000);
                                            SystemClock.sleep(10000);
                                        } catch (Exception e2) {
                                        } catch (Throwable th) {
                                            mo35089a();
                                            throw th;
                                        }
                                    }
                                    mo35099b(cake.SUCCESS);
                                    mo35089a();
                                    return;
                                }
                                return;
                            case 2:
                                mo35090a(60000);
                                return;
                            case 3:
                                mo35101c();
                                if (z2) {
                                    mo35090a(60000);
                                    return;
                                }
                                return;
                            case 4:
                                mo35091a(cakc);
                                return;
                            case 5:
                                String str7 = cakc.f174933f;
                                String str8 = cakc.f174934g;
                                String str9 = cakc.f174935h;
                                if (mo35100b()) {
                                    ArrayList arrayList = new ArrayList();
                                    if (afzw.m53778a(this)) {
                                        if (!str7.isEmpty()) {
                                            arrayList.add(cake.LOCKSCREEN_ALREADY_ENABLED);
                                        }
                                        afzq.m53765c(this);
                                        afzk.m53722a(this);
                                        cajz = cajz3;
                                    } else {
                                        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
                                        if (str7 == null || str7.isEmpty()) {
                                            z = false;
                                        } else {
                                            if (!cgki.f187161a.mo6606a().mo83984b()) {
                                                char[] charArray = str7.toCharArray();
                                                int length3 = charArray.length;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 < length3) {
                                                        char c = charArray[i3];
                                                        if (c < ' ') {
                                                            z = false;
                                                        } else if (c <= '~') {
                                                            i3++;
                                                        } else {
                                                            z = false;
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                z = devicePolicyManager.resetPassword(str7, 0);
                                            } catch (IllegalArgumentException | IllegalStateException | SecurityException e3) {
                                                z = false;
                                            }
                                        }
                                        afzq.m53765c(this);
                                        if (!z) {
                                            agac.m53793c("Unable to reset. Password was not strong enough", new Object[0]);
                                            cajz2 = afzq.m53758a(devicePolicyManager);
                                        } else {
                                            cajz2 = null;
                                        }
                                        afzk.m53722a(this);
                                        if (cajz2 != null) {
                                            arrayList.add(cake.PASSWORD_NOT_STRONG_ENOUGH);
                                        }
                                        cajz = cajz2;
                                    }
                                    char[] charArray2 = str9.toCharArray();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= charArray2.length) {
                                            break;
                                        } else if (!PhoneNumberUtils.isISODigit(charArray2[i4]) && charArray2[i4] != '+') {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (TextUtils.isEmpty(str9) || spn.m35874c(this)) {
                                        str = str9;
                                    } else {
                                        arrayList.add(cake.DEVICE_HAS_NO_TELEPHONY);
                                        str = null;
                                    }
                                    if (arrayList.isEmpty()) {
                                        mo35092a(cake.SUCCESS);
                                    } else {
                                        cake[] cakeArr = new cake[arrayList.size()];
                                        for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                            cakeArr[i5] = (cake) arrayList.get(i5);
                                        }
                                        mo35096a(cakeArr, null, ((afzk) this).f65010a, cajz, null, null);
                                    }
                                    if (!TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str)) {
                                        afzj.m53718a(this, str8, str);
                                    } else {
                                        afzj.m53717a(this);
                                    }
                                    if (z2) {
                                        mo35090a(60000);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 6:
                                mo35094a(cakk.SITREP_REMOTE_INSTRUCTION);
                                mo35099b(cake.SUCCESS);
                                return;
                            case 7:
                                mo35095a(true);
                                return;
                            case 8:
                                mo35095a(false);
                                return;
                            case 9:
                            default:
                                agac.m53790a("Unrecognized action passed with tickle. Ignoring.", new Object[0]);
                                mo35099b(cake.UNKNOWN_COMMAND);
                                return;
                            case 10:
                                mo35102d();
                                return;
                            case 11:
                                byte[] k2 = cakc.f174939l.mo73780k();
                                String str10 = ((afzk) this).f65010a;
                                int i6 = afzm.f65014n;
                                Intent a7 = apuh.m71022a(this, "com.google.android.gms.mdm.services.RingService");
                                a7.putExtra("echoServerToken", str10);
                                a7.putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", k2);
                                a7.setAction("unpair");
                                aseo.m73885c(this, a7);
                                return;
                        }
                    }
                    i++;
                    cajz3 = null;
                }
            }
            mo35099b(cake.MISSING_ACCOUNT);
            return;
        }
        mo35099b(cake.INVALID_REMOTE_INSTRUCTION);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35098b(cakc cakc) {
        this.f80054d = cakc.f174938k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo35101c() {
        afzm.m53740a(this, ((afzk) this).f65010a, ((afzk) this).f65011b, Boolean.valueOf(this.f80054d), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo35102d() {
        afzm.m53740a(this, ((afzk) this).f65010a, this.f80054d, false, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35089a() {
        int i;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (((EuiccManager) getSystemService("euicc")).isEnabled()) {
            int i4 = Build.VERSION.SDK_INT;
            i = 4;
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("wipeEuiccFlag=");
        sb.append(i);
        agac.m53792b(sb.toString(), new Object[0]);
        int i5 = Build.VERSION.SDK_INT;
        Intent intent = new Intent("android.intent.action.FACTORY_RESET");
        intent.addFlags(285212672);
        intent.putExtra("android.intent.extra.REASON", "Find My Device wiping device remotely");
        intent.putExtra("android.intent.extra.WIPE_EXTERNAL_STORAGE", true);
        intent.putExtra("com.android.internal.intent.extra.WIPE_ESIMS", true);
        sendBroadcast(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35090a(long j) {
        agaa a = agaa.m53787a();
        afzp afzp = new afzp(((afzk) this).f65010a, ((afzk) this).f65011b, this.f80054d);
        if (a.f65051a.size() < 10) {
            a.f65051a.put(afzp.f65029a, afzp);
        } else if (!a.f65051a.containsKey(afzp.f65029a)) {
            agac.m53790a("Too many pending locate requests, start throttling.", new Object[0]);
            mo35099b(cake.LOCATION_TIME_OUT);
            return;
        }
        String str = ((afzk) this).f65010a;
        boolean z = ((afzk) this).f65011b;
        boolean z2 = this.f80054d;
        if (afzi.f65003a.compareAndSet(false, true)) {
            Intent startIntent = IntentOperation.getStartIntent(this, LocateChimeraService.class, "com.google.android.gms.mdm.services.LOCATE");
            startIntent.putExtra("echo_server_token", str);
            startIntent.putExtra("includeBatteryStatus", z);
            startIntent.putExtra("includeConnectivityStatus", z2);
            startIntent.putExtra("timeout", j);
            aseo.m73885c(this, startIntent);
            return;
        }
        Location location = (Location) agaa.m53787a().f65052b.get();
        if (location != null) {
            int i = eoa.f15378a;
            mo35093a(cake.SUCCESS, location, ((afzk) this).f65010a, null, null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35091a(cakc cakc) {
        boolean z = cakc.f174936i;
        if (afzq.m53764b(this)) {
            mo35094a(cakk.DEVICE_ADMIN_ALREADY_ENABLED);
            mo35092a(cake.REMIND_ALREADY_DEVICE_ADMINISTRATOR);
            agac.m53790a("Device administrator is already enabled; not showing notification.", new Object[0]);
        } else if (!z) {
            Intent intent = new Intent("com.google.android.gms.settings.ADM_SETTINGS");
            intent.setPackage(getPackageName());
            intent.putExtra("show_device_admin", true);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 134217728);
            int a = qkj.m32287a(this, C0126R.C0127drawable.mdm_ic_notification);
            afzw.m53779b(this);
            int i = Build.VERSION.SDK_INT;
            C1102je jeVar = new C1102je(this, "find_my_device");
            jeVar.mo13630b(a);
            jeVar.mo13640e(getString(C0126R.string.common_mdm_feature_name));
            jeVar.mo13632b(getString(C0126R.string.mdm_reminder_notification_text));
            jeVar.f22254f = activity;
            jeVar.mo13627a(true);
            jeVar.f22271w = C1133kh.m17843b(this, C0126R.color.mdm_accent_color);
            jeVar.f22269u = "recommendation";
            jeVar.f22272x = 1;
            sex.m35104a(this).mo25445a("mdm.notification_reminder", 1, jeVar.mo13629b());
            mo35092a(cake.SUCCESS);
        } else {
            ActivateDeviceAdminUponUnlockChimeraReceiver.m67194a(true);
            mo35092a(cake.SUCCESS);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afzn.a(android.content.Context, boolean, cakk):android.content.Intent
     arg types: [com.google.android.gms.mdm.services.GcmReceiverChimeraService, int, cakk]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      afzn.a(android.content.Context, boolean, cakk):android.content.Intent */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35094a(cakk cakk) {
        afzn.m53752a();
        Intent a = afzn.m53750a((Context) this, true, cakk);
        if (a != null) {
            startService(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35096a(cake[] cakeArr, Location location, String str, cajz cajz, Response.Listener listener, Response.ErrorListener errorListener) {
        cajs cajs;
        cake[] cakeArr2 = cakeArr;
        int length = cakeArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                cake cake = cakeArr2[i];
                if (cake != cake.USER_NOT_PRIVILEGED) {
                    if (cake == cake.LOCATION_DISABLED_IN_CONSOLE) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        BatteryManager batteryManager = (BatteryManager) getSystemService("batterymanager");
        cajt cajt = null;
        if (!((afzk) this).f65011b) {
            cajs = null;
        } else {
            cajs = !z ? afzx.m53781a(this) : null;
        }
        if (this.f80054d) {
            cajt = afzw.m53780c(this);
        }
        afyu.m53686a(cakeArr, location, cajs, cajt, str, cajz, afzw.m53778a(this), afzw.m53776a(), listener, errorListener);
    }
}
