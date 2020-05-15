package com.google.android.gms.locationsharing.preference;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.SettingInjectorService;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationSharingSettingInjectorChimeraService extends SettingInjectorService {

    /* renamed from: a */
    public static final String f79686a = String.valueOf(LocationSharingSettingInjectorChimeraService.class.getName()).concat(".CALL_COMPLETE");

    /* renamed from: g */
    private static final srn f79687g = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: h */
    private static final String f79688h = String.valueOf(LocationSharingSettingInjectorChimeraService.class.getName()).concat(".request_id");

    /* renamed from: b */
    public boolean f79689b;

    /* renamed from: c */
    public boolean f79690c;

    /* renamed from: d */
    public boolean f79691d;

    /* renamed from: e */
    public long f79692e;

    /* renamed from: f */
    public final Semaphore f79693f = new Semaphore(1, true);

    /* renamed from: i */
    private String f79694i;

    /* renamed from: j */
    private Boolean f79695j = null;

    /* renamed from: k */
    private Boolean f79696k = null;

    /* renamed from: l */
    private final aacn f79697l = new aacn("locationSharing") {
        /* class com.google.android.gms.locationsharing.preference.LocationSharingSettingInjectorChimeraService.C16051 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            LocationSharingSettingInjectorChimeraService locationSharingSettingInjectorChimeraService = LocationSharingSettingInjectorChimeraService.this;
            String str = LocationSharingSettingInjectorChimeraService.f79686a;
            if (locationSharingSettingInjectorChimeraService.mo43802a()) {
                if (!LocationSharingSettingInjectorChimeraService.f79686a.equals(intent.getAction())) {
                    return;
                }
                if (getResultCode() == 0) {
                    LocationSharingSettingInjectorChimeraService locationSharingSettingInjectorChimeraService2 = LocationSharingSettingInjectorChimeraService.this;
                    locationSharingSettingInjectorChimeraService2.f79689b = false;
                    locationSharingSettingInjectorChimeraService2.f79690c = intent.getBooleanExtra("is_effectively_sharing", false);
                    LocationSharingSettingInjectorChimeraService locationSharingSettingInjectorChimeraService3 = LocationSharingSettingInjectorChimeraService.this;
                    locationSharingSettingInjectorChimeraService3.f79691d = true;
                    locationSharingSettingInjectorChimeraService3.f79692e = System.currentTimeMillis();
                } else {
                    LocationSharingSettingInjectorChimeraService.this.f79689b = true;
                }
            }
            LocationSharingSettingInjectorChimeraService.this.f79693f.release();
            SettingInjectorService.refreshSettings(LocationSharingSettingInjectorChimeraService.this.getApplicationContext());
        }
    };

    public LocationSharingSettingInjectorChimeraService() {
        super("LocationSharingSettingInjectorService");
    }

    /* renamed from: a */
    public static void m67052a(Context context, boolean z) {
        spn.m35856a(context, "com.google.android.gms.locationsharing.service.LocationSharingSettingInjectorService", z);
    }

    /* renamed from: b */
    private final synchronized boolean m67053b() {
        if (this.f79695j == null) {
            this.f79695j = Boolean.valueOf(ceyd.f183506a.mo6606a().showOnOffStatusForLocationSharing());
        }
        return this.f79695j.booleanValue();
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
    /* renamed from: c */
    private final void m67054c() {
        if (mo43802a()) {
            int i = Build.VERSION.SDK_INT;
            List d = soz.m35801d(this, getPackageName());
            if (d.size() == 1 && ((Account) d.get(0)).name != null) {
                String str = ((Account) d.get(0)).name;
                try {
                    if (this.f79693f.tryAcquire(100, TimeUnit.MILLISECONDS)) {
                        if (this.f79691d) {
                            long currentTimeMillis = System.currentTimeMillis() - this.f79692e;
                            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                            String valueOf = String.valueOf(str);
                            if (!defaultSharedPreferences.getBoolean(valueOf.length() == 0 ? new String("has_recently_viewed_location_sharing_settings:") : "has_recently_viewed_location_sharing_settings:".concat(valueOf), false) && currentTimeMillis < 2000) {
                                this.f79693f.release();
                                return;
                            }
                        }
                        aexr.m52659a(getApplicationContext(), str, false);
                        this.f79691d = false;
                        this.f79689b = false;
                        if (mo43802a()) {
                            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(f79686a).setPackage(getPackageName()), JGCastService.FLAG_PRIVATE_DISPLAY);
                            Intent intent = new Intent("com.google.android.gms.social.location.activity.service.START");
                            intent.setPackage("com.google.android.gms");
                            intent.putExtra("account_name", str);
                            intent.putExtra("extra_pending_intent", broadcast);
                            intent.putExtra(f79688h, 0);
                            intent.putExtra("is_called_from_settings", true);
                            startService(intent);
                        }
                    }
                } catch (InterruptedException e) {
                    bnsl bnsl = (bnsl) f79687g.mo68390d();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("lookupSharingState interrupted: ");
                }
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        if (mo43802a()) {
            registerReceiver(this.f79697l, new IntentFilter(f79686a));
            m67054c();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (mo43802a()) {
            try {
                unregisterReceiver(this.f79697l);
            } catch (IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f79687g.mo68390d();
                bnsl.mo68437a(e);
                bnsl.mo68405a("onDestroy error in unregisterReceiver");
            }
        }
    }

    public final boolean onGetEnabled() {
        return sse.m36205a(this) && !soz.m35807f(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0091  */
    public final String onGetSummary() {
        InterruptedException e;
        Semaphore semaphore;
        String string;
        if (mo43802a()) {
            m67054c();
        }
        int i = Build.VERSION.SDK_INT;
        String str = null;
        if (mo43802a()) {
            boolean z = true;
            if (soz.m35801d(this, getPackageName()).size() == 1) {
                try {
                    if (this.f79693f.tryAcquire(100, TimeUnit.MILLISECONDS)) {
                        try {
                            if (this.f79689b) {
                                semaphore = this.f79693f;
                            } else if (!m67053b()) {
                                if (this.f79690c) {
                                    str = getString(C0126R.string.location_sharing_setting_description_sharing_enabled);
                                } else {
                                    str = getString(C0126R.string.location_sharing_setting_description_sharing_disabled);
                                }
                                semaphore = this.f79693f;
                            } else {
                                if (this.f79690c) {
                                    string = getString(C0126R.string.common_on);
                                } else {
                                    string = getString(C0126R.string.common_off);
                                }
                                semaphore = this.f79693f;
                            }
                        } catch (InterruptedException e2) {
                            e = e2;
                            try {
                                bnsl bnsl = (bnsl) f79687g.mo68390d();
                                bnsl.mo68437a(e);
                                bnsl.mo68405a("getSummary interrupted");
                                if (z) {
                                }
                                this.f79694i = str;
                                return str;
                            } catch (Throwable th) {
                                th = th;
                                if (z) {
                                }
                                throw th;
                            }
                        }
                        semaphore.release();
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    z = false;
                    bnsl bnsl2 = (bnsl) f79687g.mo68390d();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68405a("getSummary interrupted");
                    if (z) {
                        semaphore = this.f79693f;
                        semaphore.release();
                    }
                    this.f79694i = str;
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    if (z) {
                        this.f79693f.release();
                    }
                    throw th;
                }
            }
        }
        this.f79694i = str;
        return str;
    }

    /* renamed from: a */
    public final synchronized boolean mo43802a() {
        if (this.f79696k == null) {
            this.f79696k = Boolean.valueOf(ceyd.m138418b());
        }
        return this.f79696k.booleanValue();
    }
}
