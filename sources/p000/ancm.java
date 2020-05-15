package p000;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: ancm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ancm {

    /* renamed from: a */
    public static final Map f76630a;

    /* renamed from: b */
    public static final String[] f76631b = new String[0];

    /* renamed from: c */
    public static final Pattern f76632c = Pattern.compile("\\,");

    /* renamed from: d */
    public static final Pattern f76633d = Pattern.compile("[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]+");

    /* renamed from: e */
    public static final Pattern f76634e = Pattern.compile(Pattern.quote("\u0001"));

    /* renamed from: f */
    public static final SecureRandom f76635f = new SecureRandom();

    static {
        HashMap hashMap = new HashMap();
        f76630a = hashMap;
        hashMap.put("circle", -1);
        f76630a.put("extendedCircles", 4);
        f76630a.put("myCircles", 3);
        f76630a.put("domain", 2);
        f76630a.put("public", 1);
        f76630a.put(null, -2);
        new adzt(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static String m64002a(String str) {
        if (str != null) {
            return str.replaceAll("^[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]*", "").replaceAll("[     ᠎             　\t\u000b\f\u001c\u001d\u001e\u001f\n\r]*$", "");
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m64007a(char c) {
        if (c == 160 || c == 5760 || c == 6158 || c == 8239 || c == 8287 || c == 12288 || c == 8232 || c == 8233) {
            return true;
        }
        switch (c) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return true;
            default:
                switch (c) {
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                        return true;
                    default:
                        switch (c) {
                            case 8192:
                            case 8193:
                            case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE:
                            case 8195:
                            case 8196:
                            case 8197:
                            case 8198:
                            case 8199:
                            case 8200:
                            case 8201:
                            case 8202:
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }

    /* renamed from: a */
    public static boolean m64009a(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* renamed from: b */
    public static String m64011b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: c */
    public static String m64014c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public static String[] m64015d(String str) {
        return !TextUtils.isEmpty(str) ? f76632c.split(str, 0) : f76631b;
    }

    /* renamed from: e */
    public static String m64016e(String str) {
        if (str == null || !str.startsWith("g:")) {
            return null;
        }
        return str.substring(2);
    }

    /* renamed from: f */
    public static String m64017f(String str) {
        sdo.m34959a((Object) str);
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("g:") : "g:".concat(valueOf);
    }

    /* renamed from: g */
    public static String m64018g(String str) {
        if (str == null || !str.startsWith("e:")) {
            return null;
        }
        return str.substring(2);
    }

    /* renamed from: h */
    public static String m64019h(String str) {
        sdo.m34977c(str);
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("e:") : "e:".concat(valueOf);
    }

    /* renamed from: i */
    public static boolean m64020i(String str) {
        return str != null && str.startsWith("e:");
    }

    /* renamed from: j */
    public static boolean m64021j(String str) {
        return str != null && str.startsWith("g:");
    }

    /* renamed from: k */
    public static boolean m64022k(String str) {
        return m64020i(str) || m64021j(str);
    }

    /* renamed from: l */
    public static String m64023l(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '%' || charAt == '\\' || charAt == '_') {
                z = true;
            }
        }
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt2 = str.charAt(i2);
            if (charAt2 == '%' || charAt2 == '\\' || charAt2 == '_') {
                sb.append('\\');
            }
            sb.append(charAt2);
        }
        return sb.toString();
    }

    /* renamed from: m */
    public static String m64024m(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }

    /* renamed from: a */
    public static List m64003a(List list) {
        return !m64008a(list) ? list.subList(0, 1) : list;
    }

    /* renamed from: b */
    public static Random m64012b(Context context) {
        Random random = (Random) context.getSystemService("gms.people.random");
        return random == null ? f76635f : random;
    }

    /* renamed from: b */
    public static boolean m64013b(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }

    @SafeVarargs
    /* renamed from: a */
    public static List m64004a(List... listArr) {
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            if (!m64008a((Collection) list)) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static sqv m64005a(Context context) {
        sqv sqv = (sqv) context.getSystemService("gms.people.clock");
        return sqv == null ? srb.f45012a : sqv;
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
    public static void m64006a(String str, String str2) {
        sdo.m34969a(str, (Object) str2);
        boolean z = true;
        if (!str.startsWith("g:") && !str.startsWith("e:")) {
            z = false;
        }
        sdo.m34975b(z, str2.concat(": Expecting qualified-id, not gaia-id"));
    }

    /* renamed from: a */
    public static boolean m64008a(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: a */
    public static String[] m64010a(String[] strArr) {
        int i = 0;
        while (true) {
            int length = strArr.length;
            if (i >= length) {
                return strArr;
            }
            if (TextUtils.isEmpty(strArr[i])) {
                ArrayList arrayList = new ArrayList(length);
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(f76631b);
            }
            i++;
        }
    }
}
