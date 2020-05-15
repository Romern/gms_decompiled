package com.google.android.gms.security.provider;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.ContentProvider;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SecurityChimeraProvider extends ContentProvider {

    /* renamed from: a */
    private Context f107496a;

    /* renamed from: b */
    private apgy f107497b;

    /* renamed from: d */
    private final apup m92374d() {
        return new apus(this.f107496a).mo47632a(false, 10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo58922b() {
        int i = 1;
        if (!this.f107497b.mo47202a(this.f107496a) && !this.f107497b.mo47205d()) {
            i = -1;
        }
        Settings.Secure.putInt(this.f107496a.getContentResolver(), "package_verifier_state", i);
        return i;
    }

    public final Bundle call(String str, String str2, Bundle bundle) {
        Uri parse;
        List<String> pathSegments;
        String str3;
        String str4;
        List<ResolveInfo> queryIntentActivities;
        Date a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (parse = Uri.parse(str2)) != null && "content".equals(parse.getScheme()) && "com.google.android.gms.security.provider".equals(parse.getAuthority()) && parse.getPort() == -1 && (pathSegments = parse.getPathSegments()) != null && pathSegments.size() == 2) {
            int i = 0;
            if (str.equals(pathSegments.get(0))) {
                String str5 = pathSegments.get(1);
                if (!"getText".equals(str)) {
                    if ("getIcon".equals(str) && (queryIntentActivities = this.f107496a.getPackageManager().queryIntentActivities(new Intent("android.settings.SETTINGS"), 1114112)) != null && !queryIntentActivities.isEmpty()) {
                        ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                        String str6 = activityInfo != null ? activityInfo.packageName : null;
                        if (!TextUtils.isEmpty(str6)) {
                            if ("PackageVerifierIcon".equals(str5)) {
                                apup d = m92374d();
                                if (d != null) {
                                    i = d.f84939b;
                                }
                                i = (mo58922b() == 1 && i == 0) ? mo58921a(str6, "ic_package_verifier_enabled") : mo58921a(str6, "ic_package_verifier_disabled");
                            } else if ("FindDeviceIcon".equals(str5)) {
                                i = mo58923c() == 1 ? mo58921a(str6, "ic_find_device_enabled") : mo58921a(str6, "ic_find_device_disabled");
                            } else if ("SecurityPatchLevelIcon".equals(str5)) {
                                String a2 = m92372a();
                                if (!TextUtils.isEmpty(a2) && (a = m92373a(a2)) != null) {
                                    long time = new Date().getTime() - a.getTime();
                                    i = time <= 0 ? mo58921a(str6, "ic_ota_update_current") : TimeUnit.DAYS.convert(time, TimeUnit.MILLISECONDS) > 90 ? mo58921a(str6, "ic_ota_update_none") : mo58921a(str6, "ic_ota_update_current");
                                }
                            }
                            if (i != 0) {
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("com.android.settings.icon", i);
                                bundle2.putString("com.android.settings.icon_package", str6);
                                return bundle2;
                            }
                        }
                    }
                    return null;
                }
                Bundle bundle3 = new Bundle();
                if ("PackageVerifierSummary".equals(str5)) {
                    if (mo58922b() != 1) {
                        str3 = this.f107496a.getString(C0126R.string.security_status_verify_apps_disabled);
                    } else {
                        apup d2 = m92374d();
                        str3 = d2 != null ? d2.mo47631a(this.f107496a) : null;
                    }
                    bundle3.putString("com.android.settings.summary", str3);
                } else if ("FindDeviceSummary".equals(str5)) {
                    int c = mo58923c();
                    if (c == -4) {
                        str4 = this.f107496a.getString(C0126R.string.security_status_no_google_account_summary);
                    } else if (c == -2 || c == -3) {
                        str4 = this.f107496a.getString(C0126R.string.security_status_find_device_location_off_summary);
                    } else if (c == -1) {
                        str4 = this.f107496a.getString(C0126R.string.common_off);
                    } else {
                        str4 = c == 1 ? this.f107496a.getString(C0126R.string.common_on) : null;
                    }
                    bundle3.putString("com.android.settings.summary", str4);
                } else if ("SecurityPatchLevelSummary".equals(str5)) {
                    String a3 = m92372a();
                    if (!TextUtils.isEmpty(a3)) {
                        Date a4 = m92373a(a3);
                        if (a4 != null) {
                            int i2 = Build.VERSION.SDK_INT;
                            a3 = DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), "dMMMMyyyy"), a4).toString();
                        }
                    } else {
                        a3 = null;
                    }
                    bundle3.putString("com.android.settings.summary", a3);
                }
                if (!bundle3.isEmpty()) {
                    return bundle3;
                }
                return null;
            }
        }
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        this.f107496a = getContext();
        this.f107497b = new apgy(this.f107496a);
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public static String m92372a() {
        int i = Build.VERSION.SDK_INT;
        return Build.VERSION.SECURITY_PATCH;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo58923c() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f107496a;
        if (soz.m35801d(context, context.getPackageName()).isEmpty()) {
            return -4;
        }
        if (!((Boolean) afzd.f64991e.mo10351a()).booleanValue()) {
            return -1;
        }
        if (srs.m36149a(this.f107496a)) {
            return agab.m53789a(this.f107496a) ? 1 : -2;
        }
        return -3;
    }

    /* renamed from: a */
    public static Date m92373a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str);
        } catch (ParseException e) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo58921a(String str, String str2) {
        try {
            return this.f107496a.getPackageManager().getResourcesForApplication(str).getIdentifier(str2, "drawable", str);
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }
}
