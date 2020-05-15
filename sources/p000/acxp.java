package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acxp {

    /* renamed from: a */
    public final Map f61041a = new HashMap();

    /* renamed from: b */
    public final Map f61042b = new HashMap();

    /* renamed from: c */
    public final abzo f61043c;

    /* renamed from: d */
    private final PackageManager f61044d;

    /* renamed from: e */
    private final abyx f61045e;

    public acxp(PackageManager packageManager, abzo abzo, abyx abyx) {
        this.f61044d = packageManager;
        this.f61043c = abzo;
        this.f61045e = abyx;
    }

    /* renamed from: b */
    private final PackageInfo m49962b(String str) {
        PackageInfo packageInfo;
        if (this.f61041a.containsKey(str)) {
            return (PackageInfo) this.f61041a.get(str);
        }
        try {
            packageInfo = this.f61044d.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
        }
        this.f61041a.put(str, packageInfo);
        return packageInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final abyy mo33215a(String str) {
        PackageInfo b = m49962b(str);
        if (b != null) {
            return this.f61045e.mo32496a(b.applicationInfo.uid, str, -1);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo33216a(String str, long j) {
        PackageInfo b = m49962b(str);
        return b != null && b.firstInstallTime < j;
    }
}
