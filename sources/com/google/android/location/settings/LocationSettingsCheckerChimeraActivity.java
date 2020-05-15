package com.google.android.location.settings;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.UserManager;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsConfiguration;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.location.internal.LocationSettings$2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSettingsCheckerChimeraActivity extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, bgaw {

    /* renamed from: a */
    public long f150934a;

    /* renamed from: b */
    public boolean f150935b = false;

    /* renamed from: c */
    public boolean f150936c = false;

    /* renamed from: d */
    public final ArrayList f150937d = new ArrayList();

    /* renamed from: e */
    private String f150938e;

    /* renamed from: f */
    private bgba f150939f;

    /* renamed from: g */
    private bgaz f150940g;

    /* renamed from: h */
    private LocationSettingsStates f150941h;

    /* renamed from: i */
    private String f150942i;

    /* renamed from: j */
    private boolean f150943j = false;

    /* renamed from: k */
    private LocationSettingsConfiguration f150944k = null;

    /* renamed from: a */
    private final void m117377a(int i) {
        Intent intent = new Intent();
        LocationSettingsStates locationSettingsStates = this.f150941h;
        if (locationSettingsStates != null) {
            sef.m35071a(locationSettingsStates, intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES");
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: b */
    private final void m117379b() {
        m117377a(-1);
    }

    /* renamed from: c */
    private final void m117381c() {
        m117377a(0);
    }

    public final void onBackPressed() {
        m117381c();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m117380b("dialog_dismissed");
        m117382c("dialog_canceled");
        m117381c();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bgax bgax;
        if (i == -2) {
            m117380b("dialog_canceled");
            m117382c("dialog_canceled:");
            m117381c();
        } else if (i == -1) {
            m117380b("dialog_ok");
            m117382c("dialog_ok:");
            bgaz bgaz = this.f150940g;
            if (bgaz != null) {
                int[] a = bqcn.m112584a(this.f150937d);
                bgaz.f115957f = 0;
                LocationSettings$2 locationSettings$2 = null;
                if (bgaz.f115956e[5]) {
                    bgax = new bgax(bgaz, this);
                    bgaz.f115957f++;
                } else {
                    bgax = null;
                }
                int c = aeri.m52438c(bgaz.f115955d.f115940a);
                boolean[] zArr = bgaz.f115956e;
                if (zArr[1]) {
                    if (c == 1) {
                        c = 3;
                    } else if (c == 0) {
                        c = 2;
                    }
                }
                if (zArr[0]) {
                    if (c == 2) {
                        c = 3;
                    } else if (c == 0) {
                        c = 1;
                    }
                }
                bgay bgay = new bgay(bgaz, this);
                bgaz.f115957f++;
                if (bgaz.f115956e[4]) {
                    aymx.m84287a(bgaz.f115955d.f115940a);
                }
                if (bgaz.f115956e[2]) {
                    bgaz.f115955d.f115941b.setWifiEnabled(true);
                }
                if (bgaz.f115956e[3]) {
                    Settings.Global.putInt(bgaz.f115955d.f115943d, "wifi_scan_always_enabled", 1);
                }
                if (bgaz.f115956e[7]) {
                    Settings.Global.putInt(bgaz.f115955d.f115943d, "ble_scan_always_enabled", 1);
                }
                if (bgaz.f115957f == 0) {
                    mo62584a();
                }
                if (bgaz.f115956e[5]) {
                    bgav bgav = bgaz.f115955d;
                    if (bgav.f115945f != null) {
                        if (bgax != null) {
                            locationSettings$2 = new LocationSettings$2(bgav, "location", bgax);
                            bgav.f115940a.registerReceiver(locationSettings$2, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                        }
                        if (!bgav.f115945f.enable() && locationSettings$2 != null) {
                            bgav.f115940a.unregisterReceiver(locationSettings$2);
                            bgax.mo62585a();
                        }
                    }
                }
                if (bgaz.f115956e[8]) {
                    bgav bgav2 = bgaz.f115955d;
                    int i2 = Build.VERSION.SDK_INT;
                    UserManager userManager = bgav2.f115944e;
                    if (userManager != null) {
                        userManager.setUserRestriction("no_share_location", false);
                    }
                }
                bgaz.f115955d.mo62572a(c, bgay, 5, a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0159  */
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        boolean[] zArr;
        int size;
        String str;
        super.onCreate(bundle);
        beyc.m96082a(getApplicationContext());
        if (bundle != null) {
            this.f150936c = bundle.getBoolean("isDialogExpanded");
        }
        String a = spn.m35852a((Activity) this);
        this.f150938e = a;
        if (a == null) {
            Log.e("LocationSettingsChecker", "Cannot find caller. Did you pass a negative request code?");
            m117381c();
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("locationSettingsRequests")) {
            LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) sef.m35067a(intent, "locationSettingsRequests", LocationSettingsRequest.CREATOR);
            arrayList = new ArrayList(locationSettingsRequest.mo43567a());
            this.f150935b = locationSettingsRequest.f79362a;
            this.f150943j = locationSettingsRequest.f79363b;
            this.f150944k = locationSettingsRequest.f79364c;
            String stringExtra = intent.getStringExtra("originalPackageName");
            if (stringExtra != null && this.f150938e.equals("com.google.android.gms")) {
                this.f150938e = stringExtra;
            }
        } else {
            arrayList = sef.m35076b(intent, "locationRequests", LocationRequest.CREATOR);
        }
        if (intent.hasExtra("locationSettingsStates")) {
            this.f150941h = (LocationSettingsStates) sef.m35067a(intent, "locationSettingsStates", LocationSettingsStates.CREATOR);
        }
        if (arrayList != null) {
            mo70949a("request_dialog");
            bgba bgba = new bgba(this, new bgav(this), this.f150938e);
            bgba.mo62590a(arrayList);
            bgba.f115958a = this.f150943j;
            this.f150939f = bgba;
            bgaz a2 = bgba.mo62589a();
            this.f150940g = a2;
            int i = a2.f115952a;
            if (i == 0) {
                mo70949a("all_satisfied");
                m117379b();
            } else if (i == 8505) {
                mo70949a("in_airplane_mode");
                m117381c();
            } else if (i == 8500) {
                mo70949a("user_restricted");
                m117381c();
            } else if (i != 8501) {
                ArrayList arrayList2 = new ArrayList();
                boolean[] zArr2 = a2.f115956e;
                if (zArr2[5]) {
                    arrayList2.add(7);
                } else if (zArr2[7]) {
                    arrayList2.add(9);
                }
                boolean[] zArr3 = a2.f115956e;
                if (!zArr3[0]) {
                    if (zArr3[1]) {
                        arrayList2.add(1);
                    }
                    if (a2.f115956e[8]) {
                        arrayList2.add(10);
                    }
                    zArr = a2.f115956e;
                    if (!zArr[2]) {
                        arrayList2.add(3);
                    } else if (zArr[3]) {
                        arrayList2.add(4);
                    }
                    if (a2.f115956e[1]) {
                        arrayList2.add(5);
                    }
                    if (a2.f115956e[4]) {
                        arrayList2.add(6);
                    }
                    StringBuilder sb = new StringBuilder();
                    size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        switch (((Integer) arrayList2.get(i2)).intValue()) {
                            case 0:
                                str = "gps";
                                break;
                            case 1:
                                str = "nlp";
                                break;
                            case 2:
                                str = "gpsnlp";
                                break;
                            case 3:
                                str = "wifi";
                                break;
                            case 4:
                                str = "wifiscanning";
                                break;
                            case 5:
                                str = "glsconsent";
                                break;
                            case 6:
                                str = "lgaayl";
                                break;
                            case 7:
                                str = "bluetooth";
                                break;
                            case 8:
                            default:
                                throw new IllegalArgumentException();
                            case 9:
                                str = "blescanning";
                                break;
                            case 10:
                                str = "managedprofile";
                                break;
                            case 11:
                                str = "automotiveofflinemaps";
                                break;
                        }
                        sb.append(str);
                        sb.append(',');
                    }
                    sb.setLength(sb.length() - 1);
                    this.f150942i = sb.toString();
                    this.f150941h = this.f150940g.f115953b;
                    runOnUiThread(new bhao(this, arrayList2));
                } else if (zArr3[1]) {
                    arrayList2.add(2);
                } else {
                    arrayList2.add(0);
                }
                sre.m36087g(a2.f115954c);
                if (a2.f115956e[8]) {
                }
                zArr = a2.f115956e;
                if (!zArr[2]) {
                }
                if (a2.f115956e[1]) {
                }
                if (a2.f115956e[4]) {
                }
                StringBuilder sb2 = new StringBuilder();
                size = arrayList2.size();
                while (i2 < size) {
                }
                sb2.setLength(sb2.length() - 1);
                this.f150942i = sb2.toString();
                this.f150941h = this.f150940g.f115953b;
                runOnUiThread(new bhao(this, arrayList2));
            } else {
                mo70949a("user_suppressed");
                m117381c();
            }
        } else {
            m117381c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.f150936c = bundle.getBoolean("isDialogExpanded");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isDialogExpanded", this.f150936c);
    }

    /* renamed from: b */
    private final void m117380b(String str) {
        String str2 = this.f150942i;
        StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_actions:");
        sb.append(str2);
        String sb2 = sb.toString();
        LocationSettingsConfiguration locationSettingsConfiguration = this.f150944k;
        if (locationSettingsConfiguration != null && !locationSettingsConfiguration.f79360b.isEmpty()) {
            String str3 = this.f150944k.f79360b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 1 + String.valueOf(str3).length());
            sb3.append(sb2);
            sb3.append(":");
            sb3.append(str3);
            sb2 = sb3.toString();
        }
        beyc.m96083a("lsd_v2", str, this.f150938e, 1);
        beyc.m96083a("lsd_v2", sb2, this.f150938e, 1);
    }

    /* renamed from: c */
    private final void m117382c(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f150934a;
        String valueOf = String.valueOf(this.f150942i);
        String str2 = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        String str3 = this.f150938e;
        fjk a = beyc.m96081a();
        if (a == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 42 + String.valueOf(str3).length());
            sb.append("location analytics disabled, can't send ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.toString();
            return;
        }
        String p = cese.m138167p();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 65 + String.valueOf(str3).length() + String.valueOf(p).length());
        sb2.append("Timing lsd_v2.");
        sb2.append(str2);
        sb2.append("=");
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(elapsedRealtime);
        sb2.append(". AnalyticsUtil userDomain: ");
        sb2.append(p);
        sb2.toString();
        fis fis = new fis();
        fis.mo10869b(elapsedRealtime);
        fis.mo10864b("utm_source=location");
        fis.mo10868a("lsd_v2");
        fis.mo10870f(str3);
        fis.mo10863a("&utv", str2);
        fis.mo10858a(1, p);
        a.mo10893a(fis.mo10861a());
    }

    /* renamed from: a */
    public static final void m117378a(View view) {
        if (view != null && (view instanceof ScrollView)) {
            ScrollView scrollView = (ScrollView) view;
            scrollView.post(new bhap(scrollView));
        }
    }

    /* renamed from: a */
    public final void mo62584a() {
        bgaz a = this.f150939f.mo62589a();
        this.f150940g = a;
        this.f150941h = a.f115953b;
        if (cevw.f183465a.mo6606a().bugfixLsdAlwaysOk() || this.f150940g.mo62587a() == 0) {
            m117379b();
        } else {
            m117381c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo70948a(SpannableString spannableString, ImageSpan imageSpan, TextView textView, LinearLayout linearLayout, List list) {
        int i;
        int i2;
        this.f150937d.add(Integer.valueOf((int) C0126R.string.location_settings_dialog_message_details_start_paragraph));
        spannableString.removeSpan(imageSpan);
        textView.setText(spannableString);
        int b = C1133kh.m17843b(this, C0126R.color.location_settings_dialog_icons);
        int i3 = 0;
        while (i3 < list.size()) {
            int intValue = ((Integer) list.get(i3)).intValue();
            i3++;
            View inflate = getLayoutInflater().inflate((int) C0126R.C0128layout.location_settings_dialog_message_item, (ViewGroup) linearLayout, false);
            ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.image);
            TextView textView2 = (TextView) inflate.findViewById(C0126R.C0129id.text);
            int i4 = C0126R.C0127drawable.quantum_ic_bluetooth_white_24;
            switch (intValue) {
                case 0:
                    i = C0126R.string.location_settings_dialog_message_location_services_gps;
                    i4 = C0126R.C0127drawable.quantum_ic_my_location_white_24;
                    break;
                case 1:
                    i2 = C0126R.string.location_settings_dialog_message_location_services_nlp;
                    i4 = C0126R.C0127drawable.quantum_ic_my_location_white_24;
                    break;
                case 2:
                    i2 = C0126R.string.location_settings_dialog_message_location_services_gps_and_nlp;
                    i4 = C0126R.C0127drawable.quantum_ic_my_location_white_24;
                    break;
                case 3:
                    i = C0126R.string.location_settings_dialog_message_wifi;
                    i4 = C0126R.C0127drawable.quantum_ic_network_wifi_white_24;
                    break;
                case 4:
                    i = C0126R.string.location_settings_dialog_message_wifi_scanning;
                    i4 = C0126R.C0127drawable.quantum_ic_network_wifi_white_24;
                    break;
                case 5:
                    i = C0126R.string.location_settings_dialog_message_gls_consent;
                    i4 = C0126R.C0127drawable.quantum_ic_google_circle_white_24;
                    break;
                case 6:
                    i = C0126R.string.location_settings_dialog_message_lgaayl;
                    i4 = C0126R.C0127drawable.quantum_ic_apps_white_24;
                    break;
                case 7:
                    i = C0126R.string.common_turn_on_bluetooth;
                    break;
                case 8:
                default:
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("Invalid message: ");
                    sb.append(intValue);
                    Log.wtf("LocationSettingsChecker", sb.toString(), new Exception());
                    continue;
                case 9:
                    i = C0126R.string.location_settings_dialog_message_ble_scanning;
                    break;
                case 10:
                    i = C0126R.string.location_settings_dialog_message_location_services_profile;
                    i4 = C0126R.C0127drawable.quantum_ic_work_white_24;
                    break;
                case 11:
                    i2 = C0126R.string.automotive_offline_maps_notice;
                    i4 = C0126R.C0127drawable.quantum_ic_my_location_white_24;
                    break;
            }
            this.f150937d.add(Integer.valueOf(i));
            imageView.setImageDrawable(getResources().getDrawable(i4));
            C1173lt.m19599a(imageView.getDrawable(), b);
            textView2.setText(i);
            linearLayout.addView(inflate, i3);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f150937d.add(Integer.valueOf((int) C0126R.string.f7400xcb8b19ff));
        int i6 = Build.VERSION.SDK_INT;
        this.f150937d.add(Integer.valueOf((int) C0126R.string.location_settings_dialog_message_details_end_paragraph_v28));
        ((TextView) linearLayout.findViewById(C0126R.C0129id.details_end)).setText(getString(C0126R.string.location_settings_dialog_message_details_end_paragraph_v28, new Object[]{getString(C0126R.string.f7400xcb8b19ff)}));
        linearLayout.setVisibility(0);
        textView.setClickable(false);
        this.f150936c = true;
        mo70949a("dialog_expanded");
    }

    /* renamed from: a */
    public final void mo70949a(String str) {
        String str2;
        LocationSettingsConfiguration locationSettingsConfiguration = this.f150944k;
        if (locationSettingsConfiguration == null || locationSettingsConfiguration.f79360b.isEmpty()) {
            str2 = str;
        } else {
            String str3 = this.f150944k.f79360b;
            StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str3).length());
            sb.append(str);
            sb.append(":");
            sb.append(str3);
            str2 = sb.toString();
        }
        beyc.m96083a("lsd_v2", str, this.f150938e, 1);
        beyc.m96083a("lsd_v2", str2, this.f150938e, 1);
    }
}
