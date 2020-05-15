package p000;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: vkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkx {
    /* renamed from: a */
    public static String m40756a() {
        String str = (String) twy.f46888o.mo58455c();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("token:") : "token:".concat(valueOf);
    }

    /* renamed from: b */
    public static String m40758b() {
        String str;
        String str2 = (String) twy.f46868az.mo58455c();
        if ("corp".equals(str2) || "scary".equals(str2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1);
            sb.append('.');
            sb.append(str2);
            str = sb.toString();
        } else {
            str = "";
        }
        return String.format("/drive/v2internal%s/", str);
    }

    /* renamed from: a */
    public static void m40757a(Uri.Builder builder) {
        String a = m40756a();
        if (a != null) {
            builder.appendQueryParameter("trace", a);
            if (((Boolean) twy.f46801L.mo58455c()).booleanValue()) {
                builder.appendQueryParameter("trace.deb", "genoa:3:all,driveService:3:all,cospel:3:all,DriveService:3:all");
            }
        }
    }
}
