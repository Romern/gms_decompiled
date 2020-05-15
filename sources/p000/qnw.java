package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* renamed from: qnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qnw {

    /* renamed from: a */
    public static final rtc f41807a = rtc.m34378a("gms:chimera:dev_test_package", "");

    /* renamed from: b */
    public static final rtc f41808b = rtc.m34378a("gms:chimera:dev_test_filter_rules", "");

    /* renamed from: c */
    public final Set f41809c;

    /* renamed from: d */
    private final Context f41810d;

    /* renamed from: e */
    private final rfz f41811e;

    /* renamed from: f */
    private final String f41812f;

    /* renamed from: g */
    private final boolean f41813g;

    public qnw(Context context, rfz rfz) {
        String str;
        this.f41810d = context;
        this.f41811e = rfz;
        if (rtc.m34382b()) {
            str = (String) f41807a.mo25081c();
        } else {
            str = "";
        }
        this.f41812f = str;
        boolean z = !TextUtils.isEmpty(str);
        this.f41813g = z;
        bnic bnic = null;
        if (z) {
            String str2 = (String) f41808b.mo25081c();
            if (TextUtils.isEmpty(str2)) {
                Log.e("TestHelper", "No classloader filter rules were provided for testing");
            } else {
                bnic = bnic.m109496a((Object[]) TextUtils.split(str2, ","));
            }
        }
        this.f41809c = bnic;
    }

    /* renamed from: c */
    private final ApplicationInfo m32534c() {
        if (!this.f41813g) {
            return null;
        }
        String valueOf = String.valueOf(this.f41812f);
        if (valueOf.length() == 0) {
            new String("Using testPackageName: ");
        } else {
            "Using testPackageName: ".concat(valueOf);
        }
        PackageManager packageManager = this.f41810d.getPackageManager();
        if (this.f41811e.mo24609b(packageManager.getPackageInfo(this.f41812f, 64))) {
            return packageManager.getApplicationInfo(this.f41812f, 0);
        }
        Log.e("TestHelper", String.format("Test package %s is not signed by Google, not adding  its APK path to the module's class path.", this.f41812f));
        return null;
    }

    /* renamed from: b */
    public final String mo24144b() {
        ApplicationInfo c = m32534c();
        if (c != null) {
            return c.nativeLibraryDir;
        }
        return null;
    }

    /* renamed from: a */
    public static qnw m32533a(Context context) {
        CharSequence charSequence;
        if (rtc.m34382b()) {
            charSequence = (CharSequence) f41807a.mo25081c();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            return new qnw(context, rfz.m33557a(context));
        }
        return null;
    }

    /* renamed from: a */
    public final String mo24143a() {
        ApplicationInfo c = m32534c();
        if (c != null) {
            return c.sourceDir;
        }
        return null;
    }
}
