package p000;

import java.util.Arrays;
import java.util.IllegalFormatException;

/* renamed from: zvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvw {

    /* renamed from: a */
    private static final bmxr f56037a = bmxr.m108543a(',');

    /* renamed from: a */
    private static Object m46583a(caaa caaa) {
        return String.format("{%s@[%s, %s,raw=%s,mod=%s](%s %s)}", yyp.m45050a(caaa.f172312f), Long.valueOf(caaa.f172308b), Long.valueOf(caaa.f172309c), Long.valueOf(caaa.f172314h), Long.valueOf(caaa.f172313g), caaa.f172310d, caaa.f172311e);
    }

    /* renamed from: a */
    public static Object m46584a(Object obj) {
        String str;
        if (obj instanceof caah) {
            return bzzn.m126367c((caah) obj);
        }
        if (obj instanceof caae) {
            return yyd.m44990b((caae) obj);
        }
        if (obj instanceof cadn) {
            return yyk.m45023b((cadn) obj);
        }
        if (obj instanceof cadr) {
            return yyo.m45045c((cadr) obj);
        }
        if (obj instanceof caaa) {
            return m46583a((caaa) obj);
        }
        if (obj instanceof cabc) {
            cabc cabc = (cabc) obj;
            Object[] objArr = new Object[3];
            objArr[0] = cabc.f172416d;
            caaa caaa = cabc.f172417e;
            if (caaa == null) {
                caaa = caaa.f172305j;
            }
            objArr[1] = m46583a(caaa);
            if (!cabc.f172415c) {
                str = "ins";
            } else {
                str = "del";
            }
            objArr[2] = str;
            return String.format("Change{%s %s %s}", objArr);
        } else if (obj instanceof cadp) {
            return yyl.m45030a((cadp) obj);
        } else {
            if (obj instanceof cadj) {
                return yyj.m45005a((cadj) obj);
            }
            if (!(obj instanceof Iterable)) {
                return obj;
            }
            String a = f56037a.mo66874a(bnjd.m109575a((Iterable) obj, zvv.f56036a));
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
            sb.append("[");
            sb.append(a);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static String m46585a(String str, Object... objArr) {
        int i = 0;
        while (i < objArr.length) {
            try {
                objArr[i] = m46584a(objArr[i]);
                i++;
            } catch (IllegalFormatException e) {
                String arrays = Arrays.toString(objArr);
                StringBuilder sb = new StringBuilder(str.length() + 36 + String.valueOf(arrays).length());
                sb.append("Malformed log call. Format: ");
                sb.append(str);
                sb.append(", args: ");
                sb.append(arrays);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }
        return String.format(str, objArr);
    }
}
