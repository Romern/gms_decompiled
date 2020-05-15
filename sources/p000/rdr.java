package p000;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.system.ErrnoException;
import android.system.OsConstants;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: rdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rdr {

    /* renamed from: a */
    private static final Pattern f42755a = Pattern.compile(".* \\(code -?([0-9]+)\\).*");

    /* renamed from: a */
    public static String m33428a(String str, Throwable th) {
        if (th instanceof SQLiteException) {
            Matcher matcher = f42755a.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(group).length());
                sb.append(str);
                sb.append("_SQLERR_");
                sb.append(group);
                return sb.toString();
            }
        }
        Throwable cause = th.getCause();
        int i = Build.VERSION.SDK_INT;
        if (cause instanceof ErrnoException) {
            int i2 = ((ErrnoException) cause).errno;
            String errnoName = OsConstants.errnoName(i2);
            if (errnoName == null) {
                errnoName = Integer.toString(i2);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(errnoName).length());
            sb2.append(str);
            sb2.append("_ERRNO_");
            sb2.append(errnoName);
            return sb2.toString();
        } else if (cause != null) {
            String simpleName = cause.getClass().getSimpleName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(simpleName).length());
            sb3.append(str);
            sb3.append("_");
            sb3.append(simpleName);
            return sb3.toString();
        } else if (!(th instanceof IOException) || th.getClass() == IOException.class) {
            return str;
        } else {
            String simpleName2 = th.getClass().getSimpleName();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(simpleName2).length());
            sb4.append(str);
            sb4.append("_");
            sb4.append(simpleName2);
            return sb4.toString();
        }
    }
}
