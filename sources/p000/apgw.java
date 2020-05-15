package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: apgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apgw {

    /* renamed from: b */
    private static final String[] f84351b = {"http", "https", "ftp"};

    /* renamed from: a */
    public final Integer f84352a;

    /* renamed from: c */
    private final String f84353c;

    /* renamed from: d */
    private final Uri f84354d;

    /* renamed from: e */
    private final String f84355e = mo47197a();

    /* renamed from: f */
    private final Boolean f84356f = Boolean.valueOf(mo47198b());

    public apgw(String str) {
        int port;
        this.f84353c = str;
        this.f84354d = Uri.parse(str);
        Integer num = this.f84352a;
        int i = -1;
        if (num == null) {
            Uri uri = this.f84354d;
            if (!(uri == null || (port = uri.getPort()) == -1)) {
                i = port;
            }
        } else {
            i = num.intValue();
        }
        this.f84352a = Integer.valueOf(i);
    }

    /* renamed from: a */
    private static boolean m70257a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                String[] strArr = f84351b;
                if (i >= strArr.length) {
                    break;
                } else if (strArr[i].equals(str)) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo47198b() {
        Boolean bool = this.f84356f;
        if (bool == null) {
            return m70257a(this.f84355e);
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public final String mo47197a() {
        String str;
        String str2 = this.f84355e;
        if (str2 != null) {
            return str2;
        }
        Uri uri = this.f84354d;
        if (uri != null) {
            str = uri.getScheme();
        } else {
            str = null;
        }
        TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f84353c)) {
            int indexOf = this.f84353c.indexOf(":");
            if (indexOf != -1) {
                String lowerCase = this.f84353c.substring(0, indexOf).toLowerCase(Locale.US);
                if (m70257a(lowerCase)) {
                    str = lowerCase;
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = !this.f84353c.startsWith("www.") ? "http" : "http";
            }
        }
        if (str != null) {
            return str.toLowerCase(Locale.US);
        }
        return null;
    }
}
