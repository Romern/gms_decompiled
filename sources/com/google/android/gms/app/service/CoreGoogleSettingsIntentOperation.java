package com.google.android.gms.app.service;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CoreGoogleSettingsIntentOperation extends qld {

    /* renamed from: a */
    private boolean f9502a;

    /* renamed from: a */
    private static final void m6133a(bngs bngs, GoogleSettingsItem googleSettingsItem) {
        if (googleSettingsItem != null) {
            bngs.mo67668c(googleSettingsItem);
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
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0124  */
    /* renamed from: a */
    public final List mo6342a() {
        GoogleSettingsItem googleSettingsItem;
        GoogleSettingsItem googleSettingsItem2;
        GoogleSettingsItem googleSettingsItem3;
        bngs j = bngx.m109377j();
        adyl.m51422a();
        this.f9502a = adyl.m51426b(this);
        if (soz.m35807f(this) || !this.f9502a) {
            googleSettingsItem = null;
        } else {
            sre.m36087g(this);
            Intent intent = new Intent("com.google.android.gms.plus.action.MANAGE_APPS");
            intent.setPackage(getPackageName());
            intent.putExtra("com.google.android.gms.extras.ALL_APPS", true);
            googleSettingsItem = new GoogleSettingsItem(intent, 4, (int) C0126R.string.common_connected_apps_settings_title, 14);
        }
        m6133a(j, googleSettingsItem);
        Intent intent2 = new Intent("com.google.android.apps.plus.PRIVACY_SETTINGS");
        intent2.putExtra("account", new Account("fake", "com.google"));
        m6133a(j, new GoogleSettingsItem(intent2, 1, (int) C0126R.string.common_plus_settings_title, 49));
        if (this.f9502a) {
            try {
                if (getPackageManager().getPackageInfo("com.google.android.play.games", 0).versionCode >= 30000000) {
                    Intent intent3 = new Intent("com.google.android.gms.games.SHOW_GOOGLE_SETTINGS");
                    intent3.addCategory("android.intent.category.DEFAULT");
                    intent3.setPackage("com.google.android.play.games");
                    googleSettingsItem2 = new GoogleSettingsItem(intent3, 4, (int) C0126R.string.common_games_settings_title, 27);
                    m6133a(j, googleSettingsItem2);
                    m6133a(j, !this.f9502a ? new GoogleSettingsItem(mo24067a("com.google.android.gms.fitness.settings.GOOGLE_FITNESS_SETTINGS"), 4, (int) C0126R.string.common_fitness_settings_title, 26) : null);
                    if (!cdlk.f181194a.mo6606a().mo77859a()) {
                        m6133a(j, new GoogleSettingsItem(new Intent("com.google.android.apps.maps.LOCATION_SETTINGS"), 0, (int) C0126R.string.common_maps_settings_title, 36));
                    }
                    Intent intent4 = new Intent("com.google.android.googlequicksearchbox.action.PRIVACY_SETTINGS");
                    sre.m36087g(this);
                    m6133a(j, new GoogleSettingsItem(intent4, 4, (int) C0126R.string.common_search_settings_title, 52));
                    m6133a(j, new GoogleSettingsItem(mo24067a("com.google.android.gms.settings.ADS_PRIVACY"), 0, (int) C0126R.string.common_ads_settings_title, 3));
                    if (!((Boolean) rsv.f43630s.mo25081c()).booleanValue()) {
                        Intent intent5 = new Intent("com.google.android.apps.gcs.action.NETWORKING_SETTINGS");
                        intent5.setPackage((String) rsv.f43631t.mo25081c());
                        googleSettingsItem3 = new GoogleSettingsItem(intent5, 5, (int) C0126R.string.common_networking_settings_title, 44);
                    } else {
                        googleSettingsItem3 = null;
                    }
                    m6133a(j, googleSettingsItem3);
                    cdlk.m133967b();
                    m6133a(j, (GoogleSettingsItem) null);
                    return j.mo67664a();
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        googleSettingsItem2 = null;
        m6133a(j, googleSettingsItem2);
        m6133a(j, !this.f9502a ? new GoogleSettingsItem(mo24067a("com.google.android.gms.fitness.settings.GOOGLE_FITNESS_SETTINGS"), 4, (int) C0126R.string.common_fitness_settings_title, 26) : null);
        if (!cdlk.f181194a.mo6606a().mo77859a()) {
        }
        Intent intent42 = new Intent("com.google.android.googlequicksearchbox.action.PRIVACY_SETTINGS");
        sre.m36087g(this);
        m6133a(j, new GoogleSettingsItem(intent42, 4, (int) C0126R.string.common_search_settings_title, 52));
        m6133a(j, new GoogleSettingsItem(mo24067a("com.google.android.gms.settings.ADS_PRIVACY"), 0, (int) C0126R.string.common_ads_settings_title, 3));
        if (!((Boolean) rsv.f43630s.mo25081c()).booleanValue()) {
        }
        m6133a(j, googleSettingsItem3);
        cdlk.m133967b();
        m6133a(j, (GoogleSettingsItem) null);
        return j.mo67664a();
    }
}
