package p000;

/* renamed from: adln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adln {
    /* renamed from: a */
    public static String m50800a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 15 + String.valueOf(str2).length());
        sb.append("<a href=\"");
        sb.append(str);
        sb.append("\">");
        sb.append(str2);
        sb.append("</a>");
        return sb.toString();
    }
}
