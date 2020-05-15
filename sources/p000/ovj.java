package p000;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ovj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovj extends oxs implements oxk {

    /* renamed from: c */
    public static final /* synthetic */ int f38473c = 0;

    /* renamed from: e */
    private static final bnsn f38474e = odk.m28481a("CAR.SETUP");

    /* renamed from: a */
    public boolean f38475a;

    /* renamed from: b */
    otw f38476b;

    /* renamed from: f */
    private Context f38477f;

    /* renamed from: g */
    private boolean f38478g;

    /* renamed from: h */
    private oqx f38479h;

    /* renamed from: i */
    private boolean f38480i;

    /* renamed from: j */
    private boolean f38481j;

    /* renamed from: c */
    private final void m29844c(boolean z) {
        this.f38583d.mo22757a(new ovf(z));
    }

    /* renamed from: a */
    public final int mo22665a(String str) {
        if ("EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) {
            return 22;
        }
        if ("EVENT_APPLICATION_INSTALLATION_FAILED".equals(str)) {
            return 13;
        }
        if ("EVENT_APPLICATION_INSTALLED".equals(str)) {
            return 58;
        }
        if ("EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str)) {
            return 11;
        }
        if ("EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) {
            return 12;
        }
        if ("EVENT_APPLICATIONS_UP_TO_DATE".equals(str)) {
            return 14;
        }
        if ("EVENT_BACKBUTTON_PRESSED".equals(str)) {
            return 77;
        }
        if ("EVENT_CAR_CONNECTION_ALLOWED".equals(str)) {
            return 8;
        }
        if ("EVENT_CAR_CONNECTION_CANCELLED".equals(str)) {
            return 19;
        }
        if ("EVENT_CAR_CONNECTION_DISALLOWED".equals(str)) {
            return 9;
        }
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            return 2;
        }
        if ("EVENT_CAR_DOCK_CHOICE_RESET".equals(str)) {
            return 80;
        }
        if ("EVENT_CAR_PARKED".equals(str)) {
            return 78;
        }
        if ("EVENT_CAR_SERVICE_STARTED".equals(str)) {
            return 79;
        }
        if ("EVENT_CAR_STARTED_MOVING".equals(str)) {
            return 10;
        }
        if ("EVENT_COUNTRY_NOT_WHITELISTED".equals(str)) {
            return 4;
        }
        if ("EVENT_COUNTRY_WHITELISTED".equals(str)) {
            return 3;
        }
        if ("EVENT_DEVICE_COMPATIBLE".equals(str)) {
            return 53;
        }
        if ("EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS".equals(str)) {
            return 90;
        }
        if ("EVENT_DEVICE_INCOMPATIBLE".equals(str)) {
            return 54;
        }
        if ("EVENT_ERROR".equals(str)) {
            return 17;
        }
        if ("EVENT_FRX_OPT_IN_ACCEPTED".equals(str)) {
            return 16;
        }
        if ("EVENT_FRX_OPT_IN_CANCELLED".equals(str)) {
            return 15;
        }
        if ("EVENT_GEARHEAD_APK_INSTALLED".equals(str)) {
            return 5;
        }
        if ("EVENT_INTRO_ACKNOWLEDGED".equals(str)) {
            return 49;
        }
        if ("EVENT_INTRO_DECLINED".equals(str)) {
            return 48;
        }
        if ("EVENT_INTRO_LOCK_TIMEOUT".equals(str)) {
            return 60;
        }
        if ("EVENT_OK_STATE_SKIPPED".equals(str)) {
            return 76;
        }
        if ("EVENT_PERMISSION_DENIED".equals(str)) {
            return 21;
        }
        if ("EVENT_PHONE_IN_BLACKLIST".equals(str)) {
            return 6;
        }
        if ("EVENT_PHONE_NOT_IN_BLACKLIST".equals(str)) {
            return 7;
        }
        if (!"EVENT_USE_VANAGON_CLICKED".equals(str)) {
            return "EVENT_USER_EXIT".equals(str) ? 18 : 0;
        }
        return 50;
    }

    /* renamed from: b */
    public final void mo22671b(boolean z) {
        try {
            this.f38476b.f38442d.mo21381a(0);
        } catch (IllegalStateException | SecurityException e) {
            bnsi c = f38474e.mo68388c();
            c.mo68437a(e);
            c.mo68432a("ovj", "b", 194, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Error setIncompleteConnectionCount");
        }
        otw otw = this.f38476b;
        if (otw.f38448j) {
            bnsi b = otw.f38439a.mo68387b();
            b.mo68432a("otw", "b", 390, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Failed to update car authorization, setup already finished.");
            return;
        }
        otw.f38450l = z;
        otw.f38447i.mo22589b(z);
    }

    /* renamed from: c */
    public final boolean mo22673c() {
        return this.f38476b.f38450l;
    }

    /* renamed from: d */
    public final boolean mo22674d() {
        return !this.f38476b.f38442d.mo21386a("car_only_connect_to_known_cars", false);
    }

    /* renamed from: e */
    public final boolean mo22675e() {
        if (!nyz.m28216a()) {
            return true;
        }
        try {
            Activity activity = getActivity();
            activity.startIntentSenderForResult(sft.f44147a.mo25484a(activity, sft.m35178d()).getIntentSender(), 1, null, 0, 0, 0);
            return false;
        } catch (IntentSender.SendIntentException e) {
            this.f38583d.mo22754a("EVENT_ERROR");
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo22676f() {
        return this.f38479h.mo22527a().isEmpty();
    }

    /* renamed from: g */
    public final oye mo22677g() {
        return this.f38479h.f38260c;
    }

    /* renamed from: h */
    public final boolean mo22678h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f38477f.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: i */
    public final void mo22679i() {
        oqx oqx = this.f38479h;
        oqx.f38259b.registerSessionCallback(new oqw(oqx, this.f38583d));
    }

    /* renamed from: j */
    public final Intent mo22680j() {
        oqx oqx = this.f38479h;
        for (oyf oyf : oqx.f38261d) {
            if (!oyf.mo22779a(oqx.f38258a)) {
                if (oqx.mo22526a(oyf.f38609a) != null) {
                    return null;
                }
                Intent a = oyi.m29995a(oyf.f38609a);
                a.toUri(0);
                return a;
            }
        }
        return null;
    }

    /* renamed from: k */
    public final void mo22681k() {
        this.f38480i = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otw.a(java.lang.Boolean, boolean):void
     arg types: [java.lang.Boolean, int]
     candidates:
      otw.a(int, bpdu[]):void
      otw.a(bpcl, int):void
      otw.a(java.lang.Boolean, boolean):void */
    /* renamed from: l */
    public final void mo22682l() {
        if (!this.f38478g) {
            otw otw = this.f38476b;
            bnsi d = otw.f38439a.mo68390d();
            d.mo68432a("otw", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("onSetupSuccess");
            otw.mo22629a(Boolean.TRUE, true);
        }
        this.f38478g = true;
        m29844c(true);
    }

    /* renamed from: m */
    public final void mo22683m() {
        this.f38476b.mo22633b(Integer.MAX_VALUE);
    }

    /* renamed from: n */
    public final int mo22684n() {
        return this.f38476b.f38443e;
    }

    /* renamed from: o */
    public final boolean mo22685o() {
        otw otw = this.f38476b;
        if (!otw.f38449k) {
            return false;
        }
        if (!otw.f38451m) {
            otw.f38447i.mo22590c();
            otw.f38451m = true;
        }
        return otw.f38452n;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: otw.a(java.lang.Boolean, boolean):void
     arg types: [java.lang.Boolean, int]
     candidates:
      otw.a(int, bpdu[]):void
      otw.a(bpcl, int):void
      otw.a(java.lang.Boolean, boolean):void */
    public final void onActivityCreated(Bundle bundle) {
        otw otw;
        super.onActivityCreated(bundle);
        if (!this.f38481j && (otw = this.f38476b) != null) {
            ovi ovi = new ovi(this);
            if (!otw.f38449k) {
                ovi.mo22663a();
            } else if (otw.f38445g != null) {
                bnsi b = otw.f38439a.mo68387b();
                b.mo68432a("otw", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Unexpected listener registration");
                otw.mo22629a(Boolean.FALSE, true);
            } else {
                otw.f38445g = ovi;
                otw.f38447i.mo22586a();
            }
            this.f38481j = true;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f38477f = activity;
        if (this.f38476b == null) {
            try {
                this.f38476b = otw.m29729a(activity.getIntent());
            } catch (Exception e) {
                bnsi b = f38474e.mo68387b();
                b.mo68437a(e);
                b.mo68432a("ovj", "onAttach", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Failed to get FrxState");
            }
        }
        this.f38479h = oqx.m29633a(this.f38477f, this.f38476b);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        if (this.f38476b == null) {
            getActivity().finish();
        }
    }

    public final void onDestroy() {
        if (!this.f38478g) {
            otw otw = this.f38476b;
            if (otw != null) {
                otw.mo22631a(true);
            }
            this.f38478g = true;
            this.f38476b = null;
        }
        super.onDestroy();
    }

    public final void onStart() {
        oxv oxv;
        super.onStart();
        oxr oxr = this.f38583d;
        if (oxr != null) {
            oxv = oxr.f38577f;
        } else {
            oxv = null;
        }
        if (oxv != null) {
            bnsi d = f38474e.mo68390d();
            d.mo68432a("ovj", "onStart", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("FRX_ACTIVITY_START");
            mo22668a(46, oxv.mo17457a(), 88);
        }
    }

    public final void onStop() {
        oxv oxv;
        oxr oxr = this.f38583d;
        if (oxr != null) {
            oxv = oxr.f38577f;
        } else {
            oxv = null;
        }
        if (oxv != null) {
            bnsi d = f38474e.mo68390d();
            d.mo68432a("ovj", "onStop", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("FRX_ACTIVITY_STOP");
            mo22668a(oxv.mo17457a(), 46, 89);
        }
        super.onStop();
    }

    /* renamed from: p */
    public final pbx mo22686p() {
        return this.f38476b.mo22640g();
    }

    /* renamed from: q */
    public final boolean mo22687q() {
        return this.f38476b.f38444f;
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
    /* renamed from: r */
    public final Intent mo22688r() {
        otw otw = this.f38476b;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(pbt.m30183a(otw.f38440b), "com.google.android.projection.gearhead.frx.SetupActivity"));
        intent.putExtra("com.google.android.gearhead.NEW_FRX_STYLE", true);
        return intent;
    }

    /* renamed from: s */
    public final void mo22689s() {
        otw otw = this.f38476b;
        if (otw != null) {
            otw.mo22635c(true);
        }
    }

    /* renamed from: b */
    public final boolean mo22672b() {
        try {
            nuu.m27794b(this.f38477f, ccqx.m131305b());
            return true;
        } catch (IllegalStateException | SecurityException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo22666a() {
        int i;
        if (!this.f38475a) {
            otw otw = this.f38476b;
            if (otw == null) {
                bnsi c = f38474e.mo68388c();
                c.mo68432a("ovj", "a", 141, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("enableDrivingStatusListener called while mFrxState is null");
                i = 31;
            } else {
                i = otw.f38453o.mo22739c();
            }
            mo22667a(i);
            this.f38475a = true;
        }
    }

    /* renamed from: a */
    public final void mo22667a(int i) {
        if ((i & 8) != 0) {
            this.f38583d.mo22754a("EVENT_CAR_STARTED_MOVING");
        } else {
            this.f38583d.mo22754a("EVENT_CAR_PARKED");
        }
    }

    /* renamed from: a */
    public final void mo22668a(int i, int i2, int i3) {
        bxvd da = bpdc.f135904e.mo74144da();
        if (i >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdc bpdc = (bpdc) da.f164949b;
            bpdc.f135906a |= 1;
            bpdc.f135907b = i;
        }
        if (i2 >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdc bpdc2 = (bpdc) da.f164949b;
            bpdc2.f135906a |= 2;
            bpdc2.f135908c = i2;
        }
        if (i3 >= 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpdc bpdc3 = (bpdc) da.f164949b;
            bpdc3.f135906a |= 4;
            bpdc3.f135909d = i3;
        }
        if (this.f38476b != null) {
            bxvd da2 = bpcl.f135759L.mo74144da();
            bpdc bpdc4 = (bpdc) da.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpcl bpcl = (bpcl) da2.f164949b;
            bpdc4.getClass();
            bpcl.f135779g = bpdc4;
            bpcl.f135773a |= 16;
            this.f38476b.mo22627a((bpcl) da2.mo74062i(), 19);
            return;
        }
        bnsi c = f38474e.mo68388c();
        c.mo68432a("ovj", "a", 295, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("FrxState unavailable, not logging state change.");
    }

    /* renamed from: a */
    public final void mo22669a(bped bped) {
        bxvd da = bpcl.f135759L.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpcl bpcl = (bpcl) da.f164949b;
        bped.getClass();
        bpcl.f135784l = bped;
        bpcl.f135773a |= 4096;
        this.f38476b.mo22627a((bpcl) da.mo74062i(), 37);
    }

    /* renamed from: a */
    public final void mo22670a(boolean z) {
        String str;
        if (this.f38480i) {
            ori ori = new ori(this.f38477f, this.f38476b);
            int i = ori.f38276b.f38442d.f36296c.getInt("times_show_reminder_notification", 0);
            if (((long) i) < ccui.f179964a.mo6606a().mo76819c() && !oyh.f38613a.mo22782c(ori.f38275a)) {
                String string = ori.f38275a.getString(C0126R.string.car_setup_android_auto_reminder_title);
                String string2 = ori.f38275a.getString(C0126R.string.car_setup_android_auto_reminder_message);
                int b = oyh.f38613a.mo22781b(ori.f38275a);
                Intent intent = null;
                if (b == 2) {
                    intent = oyi.m29994a(ori.f38275a, "com.google.android.projection.gearhead", "utm_source%3Dgms_car_setup%26utm_campaign%3Dgms_car_setup_update_the_app");
                    str = ori.f38275a.getString(C0126R.string.car_setup_get_the_app);
                } else if (b != 3) {
                    str = null;
                } else {
                    intent = oyi.m29994a(ori.f38275a, "com.google.android.projection.gearhead", "utm_source%3Dgms_car_setup%26utm_campaign%3Dgms_car_setup_get_the_app");
                    str = ori.f38275a.getString(C0126R.string.car_setup_get_the_app);
                }
                if (intent != null) {
                    PendingIntent activity = PendingIntent.getActivity(ori.f38275a, 0, intent, 134217728);
                    C1099jb jbVar = new C1099jb(0, str, activity);
                    C1102je jeVar = new C1102je(ori.f38275a);
                    jeVar.mo13640e(string);
                    jeVar.mo13632b(string2);
                    jeVar.mo13630b(nyw.m28209a(ori.f38275a));
                    jeVar.f22271w = C1133kh.m17843b(ori.f38275a, C0126R.color.car_light_blue_500);
                    C1101jd jdVar = new C1101jd();
                    jdVar.mo13593a(string2);
                    jeVar.mo13626a(jdVar);
                    jeVar.mo13627a(true);
                    jeVar.mo13637c(true);
                    jeVar.f22268t = true;
                    jeVar.mo13624a(jbVar);
                    jeVar.f22254f = activity;
                    nyy.m28213a(ori.f38275a).f36993a.mo25441a(100, jeVar.mo13629b());
                    ori.f38276b.mo22633b(i + 1);
                    if (b == 3) {
                        ori.f38276b.mo22628a(bpea.CAR_SETUP_NOTIFICATION_GET_THE_APP);
                    } else if (b == 2) {
                        ori.f38276b.mo22628a(bpea.CAR_SETUP_NOTIFICATION_UPDATE_THE_APP);
                    }
                    intent.toUri(0);
                }
            }
        }
        if (!this.f38478g) {
            otw otw = this.f38476b;
            if (otw != null) {
                otw.mo22631a(z);
            }
            this.f38478g = true;
        }
        m29844c(false);
    }
}
