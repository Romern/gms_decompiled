package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Locale;

/* renamed from: foh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class foh extends fkj {

    /* renamed from: a */
    protected String f17008a;

    /* renamed from: b */
    protected String f17009b;

    /* renamed from: c */
    protected boolean f17010c;

    /* renamed from: e */
    protected int f17011e;

    /* renamed from: f */
    public boolean f17012f;

    /* renamed from: g */
    public boolean f17013g;

    public foh(fkm fkm) {
        super(fkm);
    }

    /* renamed from: b */
    public final String mo11062b() {
        mo10954t();
        return this.f17008a;
    }

    /* renamed from: c */
    public final String mo11063c() {
        mo10954t();
        return this.f17009b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
        ApplicationInfo applicationInfo;
        int i;
        fnk a;
        int i2;
        Context f = mo10939f();
        try {
            applicationInfo = f.getPackageManager().getApplicationInfo(f.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            mo10934d("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0 && (a = new flg(this.f16779d).mo11004a(i)) != null) {
                mo10933d("Loading global XML config values");
                String str = a.f16951a;
                if (str != null) {
                    this.f17009b = str;
                    mo10929b("XML config - app name", str);
                }
                String str2 = a.f16952b;
                if (str2 != null) {
                    this.f17008a = str2;
                    mo10929b("XML config - app version", str2);
                }
                String str3 = a.f16953c;
                boolean z = false;
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(Locale.US);
                    if (!"verbose".equals(lowerCase)) {
                        i2 = !"info".equals(lowerCase) ? !"warning".equals(lowerCase) ? "error".equals(lowerCase) ? 3 : -1 : 2 : 1;
                    } else {
                        i2 = 0;
                    }
                    if (i2 >= 0) {
                        mo10926a("XML config - log level", Integer.valueOf(i2));
                    }
                }
                int i3 = a.f16954d;
                if (i3 >= 0) {
                    this.f17011e = i3;
                    this.f17010c = true;
                    mo10929b("XML config - dispatch period (sec)", Integer.valueOf(i3));
                }
                int i4 = a.f16955e;
                if (i4 != -1) {
                    if (i4 != 0) {
                        z = true;
                    }
                    this.f17013g = z;
                    this.f17012f = true;
                    mo10929b("XML config - dry run", Boolean.valueOf(z));
                    return;
                }
                return;
            }
            return;
        }
        mo10940f("Couldn't get ApplicationInfo to load global config");
    }
}
