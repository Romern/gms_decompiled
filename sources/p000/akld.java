package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: akld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akld {
    /* renamed from: a */
    public static ComponentName m59953a() {
        String b = cfpm.m142486b();
        String valueOf = String.valueOf(b);
        String valueOf2 = String.valueOf(cfpm.f185392a.mo6606a().mo82476l());
        return new ComponentName(b, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: c */
    public static final void m59956c(Context context) {
        if (aklx.m59989a(context)) {
            boolean a = aklx.m59990a(context, m59953a());
            boolean b = m59955b(context);
            if (a && !b) {
                int i = Build.VERSION.SDK_INT;
                sdo.m34971a(true, (Object) "Should not set use_open_wifi_package setting pre-O");
                new Object[1][0] = cfpm.m142486b();
                int i2 = eoa.f15378a;
                Settings.Global.putString(context.getContentResolver(), "use_open_wifi_package", cfpm.m142486b());
                aklk.m59959a(context);
            } else if (!a && b) {
                m59954a(context);
                aklk.m59959a(context);
            }
        } else if (m59955b(context)) {
            m59954a(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    static boolean m59955b(Context context) {
        int i = Build.VERSION.SDK_INT;
        sdo.m34971a(true, (Object) "Should not be using use_open_wifi_package setting pre-O");
        return TextUtils.equals(Settings.Global.getString(context.getContentResolver(), "use_open_wifi_package"), cfpm.m142486b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    static void m59954a(Context context) {
        int i = Build.VERSION.SDK_INT;
        sdo.m34971a(true, (Object) "Should not clear use_open_wifi_package setting pre-O");
        int i2 = eoa.f15378a;
        Settings.Global.putString(context.getContentResolver(), "use_open_wifi_package", "");
    }
}
