package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: yyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyp {
    /* renamed from: a */
    public static caaw m45046a(double d) {
        caau caau = (caau) caaw.f172379i.mo74144da();
        if (caau.f164950c) {
            caau.mo74035c();
            caau.f164950c = false;
        }
        caaw caaw = (caaw) caau.f164949b;
        caaw.f172381a |= 2;
        caaw.f172383c = d;
        return (caaw) caau.mo74062i();
    }

    /* renamed from: b */
    public static void m45051b(caaw caaw) {
        if (!m45052c(caaw)) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static boolean m45052c(caaw caaw) {
        if (caaw == null) {
            return false;
        }
        int i = caaw.f172381a;
        return ((i & 1) == 0 && (i & 2) == 0 && (i & 4) == 0 && caaw.f172385e.size() <= 0 && caaw.f172386f.size() <= 0 && caaw.f172387g.size() <= 0 && (caaw.f172381a & 8) == 0) ? false : true;
    }

    /* renamed from: a */
    public static caaw m45047a(int i) {
        caau caau = (caau) caaw.f172379i.mo74144da();
        if (caau.f164950c) {
            caau.mo74035c();
            caau.f164950c = false;
        }
        caaw caaw = (caaw) caau.f164949b;
        caaw.f172381a |= 1;
        caaw.f172382b = i;
        return (caaw) caau.mo74062i();
    }

    /* renamed from: a */
    public static caaw m45048a(Map map) {
        caar caar;
        caau caau = (caau) caaw.f172379i.mo74144da();
        for (Map.Entry entry : map.entrySet()) {
            Number number = (Number) entry.getValue();
            String str = (String) entry.getKey();
            if (number != null) {
                double doubleValue = number.doubleValue();
                bxvd da = caar.f172365c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                caar caar2 = (caar) da.f164949b;
                caar2.f172367a |= 1;
                caar2.f172368b = doubleValue;
                caar = (caar) da.mo74062i();
            } else {
                caar = caar.f172365c;
            }
            caau.mo74602a(str, caar);
        }
        return (caaw) caau.mo74062i();
    }

    /* renamed from: a */
    public static String m45049a(caaw caaw) {
        if (!m45052c(caaw)) {
            return "<unset>";
        }
        int i = caaw.f172381a;
        if ((i & 2) != 0) {
            return Double.toString(caaw.f172383c);
        }
        if ((i & 1) != 0) {
            return Integer.toString(caaw.f172382b);
        }
        if (caaw.f172386f.size() > 0) {
            return caaw.f172386f.toString();
        }
        if (caaw.f172387g.size() > 0) {
            return caaw.f172387g.toString();
        }
        if ((caaw.f172381a & 4) != 0) {
            return caaw.f172384d;
        }
        if (caaw.f172385e.size() <= 0) {
            return (caaw.f172381a & 8) != 0 ? "<binary>" : "unknown";
        }
        Map unmodifiableMap = Collections.unmodifiableMap(caaw.f172385e);
        StringBuilder sb = new StringBuilder("{");
        String str = "";
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            sb.append(str);
            sb.append((String) entry.getKey());
            sb.append(":");
            sb.append(((caar) entry.getValue()).f172368b);
            str = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m45050a(List list) {
        int i = 0;
        if (list.size() == 1) {
            return m45049a((caaw) list.get(0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int size = list.size();
        String str = "";
        while (i < size) {
            sb.append(str);
            sb.append(m45049a((caaw) list.get(i)));
            i++;
            str = ",";
        }
        sb.append("]");
        return sb.toString();
    }
}
