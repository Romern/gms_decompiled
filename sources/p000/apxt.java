package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* renamed from: apxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apxt {

    /* renamed from: a */
    final CharSequence f85089a;

    /* renamed from: b */
    final boolean f85090b;

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence], assign insn: 0x0009: INVOKE  (r5v4 ? I:java.lang.CharSequence) = (r2v0 android.content.pm.ApplicationInfo), (r5v0 android.content.pm.PackageManager) type: VIRTUAL call: android.content.pm.ApplicationInfo.loadLabel(android.content.pm.PackageManager):java.lang.CharSequence */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public apxt(PackageManager packageManager, String str) {
        int i;
        boolean z = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            str = applicationInfo.loadLabel(packageManager);
            i = applicationInfo.flags & 1;
        } catch (PackageManager.NameNotFoundException e) {
            i = 0;
        }
        this.f85089a = str;
        this.f85090b = i == 0 ? false : z;
    }
}
