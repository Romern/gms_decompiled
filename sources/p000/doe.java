package p000;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: doe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class doe {

    /* renamed from: a */
    public static final Pattern f13679a = Pattern.compile(" +");

    /* renamed from: d */
    private static final Pattern f13680d = Pattern.compile("\\W");

    /* renamed from: e */
    private static doe f13681e = new doe(new doc[0]);

    /* renamed from: f */
    private static Object f13682f;

    /* renamed from: b */
    public final doc[] f13683b;

    /* renamed from: c */
    public final Pattern f13684c;

    public doe(doc[] docArr) {
        Arrays.sort(docArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < docArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(f13680d.matcher(docArr[i].f13676b).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.f13684c = Pattern.compile(sb.toString());
        this.f13683b = docArr;
    }

    /* renamed from: a */
    public static synchronized doe m8922a(ContentResolver contentResolver) {
        doe doe;
        synchronized (doe.class) {
            Object a = aymn.m84262a(contentResolver);
            if (a != f13682f) {
                Map a2 = aymn.m84266a(contentResolver, "url:");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : a2.entrySet()) {
                    try {
                        String substring = ((String) entry.getKey()).substring(4);
                        String str = (String) entry.getValue();
                        if (!(str == null || str.length() == 0)) {
                            arrayList.add(new doc(substring, str));
                        }
                    } catch (dod e) {
                        Log.e("UrlRules", "Invalid rule from Gservices", e);
                    }
                }
                doe = new doe((doc[]) arrayList.toArray(new doc[arrayList.size()]));
                f13681e = doe;
                f13682f = a;
            } else {
                doe = f13681e;
            }
        }
        return doe;
    }
}
