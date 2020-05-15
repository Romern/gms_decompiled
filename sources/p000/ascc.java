package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: ascc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascc {

    /* renamed from: a */
    private final PackageManager f88686a;

    public ascc(Context context) {
        sdo.m34959a(context);
        this.f88686a = context.getPackageManager();
    }

    /* renamed from: a */
    public final boolean mo49035a(String str) {
        sdo.m34959a((Object) str);
        try {
            this.f88686a.getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
