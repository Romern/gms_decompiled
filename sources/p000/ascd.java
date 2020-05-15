package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: ascd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascd {

    /* renamed from: a */
    private static final sek f88687a = ascp.m73787a("Utils", "PackageVerifier");

    /* renamed from: b */
    private final Context f88688b;

    /* renamed from: c */
    private final PackageManager f88689c;

    public ascd(Context context) {
        sdo.m34966a(context, "context cannot be null.");
        this.f88688b = context;
        this.f88689c = context.getPackageManager();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final boolean mo49036a(String str) {
        sdo.m34969a(str, (Object) "name cannot be null or empty.");
        try {
            PackageInfo packageInfo = this.f88689c.getPackageInfo(str, 0);
            return (packageInfo == null || (packageInfo.applicationInfo.flags & 1) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException e) {
            f88687a.mo25415d(String.format("Could not find package [%s]", str), e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final boolean mo49037b(String str) {
        return rfz.m33557a(this.f88688b).mo24610b(str);
    }
}
