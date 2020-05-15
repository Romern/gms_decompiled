package p000;

import java.util.Map;

/* renamed from: asbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asbp {

    /* renamed from: a */
    public final String f88677a;

    /* renamed from: b */
    public final Map f88678b;

    public asbp(String str, Map map) {
        this.f88677a = str;
        this.f88678b = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("network={");
        for (String str : this.f88678b.keySet()) {
            String str2 = (String) this.f88678b.get(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
            sb2.append("\t");
            sb2.append(str);
            sb2.append("=");
            sb2.append(str2);
            sb2.append("\n");
            sb.append(sb2.toString());
        }
        sb.append("}");
        return sb.toString();
    }
}
