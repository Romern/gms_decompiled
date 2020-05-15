package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: gkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkr {

    /* renamed from: a */
    public static final imn f18427a = new gkq();

    /* renamed from: b */
    private final gko f18428b;

    /* renamed from: c */
    private final SharedPreferences f18429c;

    public gkr(Context context) {
        gko gko = (gko) gko.f18416b.mo13145b();
        SharedPreferences sharedPreferences = context.getSharedPreferences("auth.work.account.whitelist.prefs", 0);
        sdo.m34959a(gko);
        this.f18428b = gko;
        sdo.m34959a(sharedPreferences);
        this.f18429c = sharedPreferences;
    }

    /* renamed from: a */
    public final boolean mo11995a() {
        return this.f18429c.edit().clear().commit();
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
    public final boolean mo11996a(String str) {
        sdo.m34969a(str, (Object) "Package name must not be empty");
        if ("com.google.android.gms".equals(str) || "com.android.vending".equals(str)) {
            return true;
        }
        String string = this.f18429c.getString(str, null);
        if (string != null) {
            return string.equalsIgnoreCase(this.f18428b.mo11990a(str).f18411b);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo11997a(String str, String str2) {
        SharedPreferences.Editor edit = this.f18429c.edit();
        if (str2 == null) {
            edit.remove(str);
        } else {
            edit.putString(str, str2);
        }
        return edit.commit();
    }
}
