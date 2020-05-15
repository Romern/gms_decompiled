package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: wse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wse extends qki {

    /* renamed from: b */
    public buqu f51235b;

    /* renamed from: c */
    protected boolean f51236c;

    /* renamed from: d */
    private burh f51237d;

    /* renamed from: b */
    private static final int m42209b(Intent intent) {
        return intent.getIntExtra("caller", 0);
    }

    /* renamed from: a */
    public final void mo29348a(int i) {
        String string = getResources().getString(i);
        if (mo8628aW() != null) {
            mo8628aW().mo15845a(string);
        }
        setTitle(string);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (r0 != false) goto L_0x00ac;
     */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (!this.f51236c) {
            if (cfoj.m141545Z() && new burh(this).mo73038b()) {
                if (!rfz.m33557a(this).mo24610b("com.google.location.nearby.apps.fastpair.autotest")) {
                    bnsl bnsl = (bnsl) wtw.f51331a.mo68388c();
                    bnsl.mo68432a("wrw", "a", 28, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("AutoTestChecker: Auto test is not Google signed, check if it's local build");
                    try {
                        PackageInfo packageInfo = getPackageManager().getPackageInfo("com.google.location.nearby.apps.fastpair.autotest", 64);
                        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                            bnsl bnsl2 = (bnsl) wtw.f51331a.mo68388c();
                            bnsl2.mo68432a("wrw", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("AutoTestChecker: Auto test should only have one signature!");
                        } else {
                            boolean equals = cfog.f184854a.mo6606a().mo82026d().equals(packageInfo.signatures[0].toCharsString());
                            bnsl bnsl3 = (bnsl) wtw.f51331a.mo68388c();
                            bnsl3.mo68432a("wrw", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("AutoTestChecker: isNearByDevSigned=%b", Boolean.valueOf(equals));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        bnsl bnsl4 = (bnsl) wtw.f51331a.mo68388c();
                        bnsl4.mo68437a(e);
                        bnsl4.mo68432a("wrw", "a", 39, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("AutoTestChecker: Auto test package not found!");
                    }
                }
                ModuleManager.ModuleInfo c = sqq.m35994c(this);
                buqu buqu = new buqu(this, c != null ? c.moduleApk.apkPackageName : getPackageName());
                this.f51235b = buqu;
                Log.w("AutoTestUiInjector", "init called");
                Context context = (Context) buqu.f154739a.get();
                if (context == null) {
                    Log.w("AutoTestUiInjector", "Error! init failed because context is null!");
                } else {
                    busi busi = buqu.f154742d;
                    if (busi != null) {
                        try {
                            busi.mo73082a(buqu.f154741c);
                        } catch (RemoteException e2) {
                            String valueOf = String.valueOf(e2.getMessage());
                            Log.w("AutoTestUiInjector", valueOf.length() == 0 ? new String("Error! iAutoTestService.register meet exception! ") : "Error! iAutoTestService.register meet exception! ".concat(valueOf));
                        }
                    }
                    Log.w("AutoTestUiInjector", "Try to bind TestHandlerService");
                    Intent intent = new Intent("com.google.location.nearby.common.fastpair.autotest.ACTION_BIND_FOR_UI_TEST");
                    intent.setClassName("com.google.location.nearby.apps.fastpair.autotest", "com.google.location.nearby.apps.fastpair.autotest.TestHandlerService");
                    context.bindService(intent, buqu.f154740b, 1);
                }
            }
            Intent intent2 = getIntent();
            Fragment fragment = null;
            if (intent2 != null && "com.google.android.gms.nearby.fastpair.GMSCORE_DEVICE_DETAILS".equals(intent2.getAction())) {
                fragment = wts.m42239a(intent2.getByteArrayExtra("account_key"));
                str = "fast_pair_device_details";
            } else if (bundle == null) {
                fragment = new wsl();
                str = "devices_list";
            } else {
                str = null;
            }
            if (fragment != null) {
                getSupportFragmentManager().beginTransaction().replace(16908290, fragment, str).commit();
                buqu buqu2 = this.f51235b;
                if (buqu2 != null) {
                    buqu2.mo73004a(fragment);
                }
            }
            this.f51237d = new burh(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        buqu buqu = this.f51235b;
        if (buqu != null) {
            Context context = (Context) buqu.f154739a.get();
            if (context == null) {
                Log.w("AutoTestUiInjector", "Error! release failed because context is null!");
                return;
            }
            Log.w("AutoTestUiInjector", "release called");
            buqu.mo73003a();
            buqu.f154742d = null;
            context.unbindService(buqu.f154740b);
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (!this.f51236c) {
            setIntent(intent);
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f51236c) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (menuItem.getItemId() != C0126R.C0129id.action_debug_items) {
            return super.onOptionsItemSelected(menuItem);
        }
        menuItem.setChecked(!menuItem.isChecked());
        busr busr = busr.f154819a;
        menuItem.isChecked();
        burh burh = this.f51237d;
        burh.mo73039c().edit().putBoolean("nearby_debug_mode", menuItem.isChecked()).commit();
        startService(butb.m120417b(this).setAction("com.google.android.gms.nearby.discovery:ACTION_DEBUG_CHANGE"));
        return true;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (this.f51236c) {
            return super.onPrepareOptionsMenu(menu);
        }
        MenuItem findItem = menu.findItem(C0126R.C0129id.action_debug_items);
        if (Settings.Global.getInt(getContentResolver(), "development_settings_enabled", 0) != 0 || this.f51237d.mo73036a()) {
            findItem.setChecked(this.f51237d.mo73036a());
        } else {
            menu.removeItem(findItem.getItemId());
        }
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!this.f51236c) {
            int b = m42209b(getIntent());
            if (b == 1) {
                wtv.m42254a(this, bvin.DEVICES_LIST_VIEW_LAUNCHED_FROM_NOTIFICATION);
            } else if (b != 2) {
                bnsl bnsl = (bnsl) busr.f154819a.mo68387b();
                bnsl.mo68432a("wse", "onStart", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("Invalid caller %d", m42209b(getIntent()));
            } else {
                wtv.m42254a(this, bvin.DEVICES_LIST_VIEW_LAUNCHED_FROM_SETTINGS);
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getWindow().getDecorView().sendAccessibilityEvent(32);
    }
}
