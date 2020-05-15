package p000;

/* renamed from: bqby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqby implements bmxj {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str = (String) obj;
        if (bqca.f140448a.mo66835b(str) && !str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 13 || charAt == '\\' || charAt == '\"') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        sb.append('\"');
        return sb.toString();
    }
}
