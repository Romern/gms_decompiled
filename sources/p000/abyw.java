package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: abyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyw {

    /* renamed from: a */
    public final acrl f58767a;

    /* renamed from: b */
    public final Context f58768b;

    /* renamed from: c */
    public final PackageManager f58769c;

    /* renamed from: d */
    public final acao f58770d;

    /* renamed from: e */
    public final abrl f58771e;

    public abyw(acrl acrl, Context context, PackageManager packageManager, abrl abrl, acao acao) {
        this.f58767a = acrl;
        this.f58768b = context;
        this.f58769c = packageManager;
        this.f58771e = abrl;
        this.f58770d = acao;
    }

    /* renamed from: a */
    public final boolean mo32490a() {
        return !TextUtils.isEmpty(this.f58770d.mo32592a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1240of mo32492b(String str) {
        try {
            PackageInfo packageInfo = this.f58769c.getPackageInfo(str, 64);
            if (packageInfo == null) {
                return new C1240of(0, "");
            }
            return new C1240of(Integer.valueOf(packageInfo.versionCode), spn.m35850a(packageInfo));
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo32491a(String str) {
        return rfz.m33557a(this.f58768b).mo24610b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo32493b() {
        return mo32491a("com.google.android.googlequicksearchbox");
    }
}
