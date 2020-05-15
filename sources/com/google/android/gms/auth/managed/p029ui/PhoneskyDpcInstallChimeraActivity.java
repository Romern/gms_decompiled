package com.google.android.gms.auth.managed.p029ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.setupcompat.internal.TemplateLayout;

/* renamed from: com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneskyDpcInstallChimeraActivity extends rrd implements LoaderManager.LoaderCallbacks {

    /* renamed from: b */
    private static final sek f11079b = ght.m13171a("AuthManaged", "PhoneskyDpcInstallChimeraActivity");

    /* renamed from: c */
    private String f11080c;

    /* renamed from: d */
    private rrr f11081d;

    /* renamed from: e */
    private ProgressBar f11082e;

    /* renamed from: a */
    public static Intent m6727a(Context context, String str, boolean z, Bundle bundle) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.managed.ui.PhoneskyDpcInstallActivity").putExtra("dpc_package_name", str).putExtra("hide_back_button", z).putExtras(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bizb.a(android.view.Window, boolean):void
     arg types: [android.view.Window, int]
     candidates:
      bizb.a(android.view.Window, int):void
      bizb.a(android.view.Window, biyz):void
      bizb.a(android.view.Window, boolean):void */
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
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        this.f11080c = getIntent().getStringExtra("dpc_package_name");
        int i2 = Build.VERSION.SDK_INT;
        if (!m6729a(this) || TextUtils.isEmpty(this.f11080c)) {
            m6728a(2);
            return;
        }
        if (!rrp.m34306a(mo25039j())) {
            i = C0126R.C0128layout.phonesky_dpc_install_activity;
        } else {
            i = C0126R.C0128layout.phonesky_dpc_install_activity_glif;
        }
        rrr a = rrr.m34310a(this, i);
        this.f11081d = a;
        rrp.m34302a(a.mo25046a());
        this.f11081d.mo25049b();
        this.f11081d.mo25050b(false);
        if (getIntent().getBooleanExtra("hide_back_button", false)) {
            this.f11081d.mo25051c(false);
            bizb.m103020a(getWindow(), false);
        }
        setContentView(this.f11081d.mo25046a());
        this.f11081d.mo25047a(getText(C0126R.string.auth_device_management_download_progress));
        this.f11081d.mo25048a(true);
        this.f11082e = ((bjai) ((TemplateLayout) this.f11081d.mo25046a()).mo71342a(bjai.class)).mo64951b();
        String str = this.f11080c;
        for (PackageInfo packageInfo : getPackageManager().getInstalledPackages(0)) {
            if (str.equals(packageInfo.packageName)) {
                m6728a(-1);
                return;
            }
        }
        getSupportLoaderManager().initLoader(0, null, this);
        setResult(0, new Intent().putExtra("intentionally_canceled", true));
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jhb(this, this.f11080c);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() < 0) {
            switch (num.intValue()) {
                case -6:
                case -5:
                case -4:
                    this.f11082e.setIndeterminate(false);
                    this.f11082e.setMax(100);
                    return;
                case -3:
                    m6728a(2);
                    return;
                case -2:
                    m6728a(3);
                    return;
                case -1:
                    m6728a(-1);
                    return;
                default:
                    sek sek = f11079b;
                    String valueOf = String.valueOf(num);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                    sb.append("Unknown result ");
                    sb.append(valueOf);
                    sb.append(" received from the loader!");
                    sek.mo25418e(sb.toString(), new Object[0]);
                    return;
            }
        } else {
            this.f11082e.setProgress(num.intValue());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* renamed from: a */
    private final void m6728a(int i) {
        setResult(i);
        finish();
    }

    /* renamed from: a */
    public static boolean m6729a(Context context) {
        try {
            return new svq(context).mo26176b("com.android.vending", 0).versionCode >= 80770000;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
