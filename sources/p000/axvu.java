package p000;

/* renamed from: axvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axvu {
    /* renamed from: a */
    public static void m83329a(ayek ayek, StringBuilder sb, StringBuilder sb2) {
        sb.append((CharSequence) sb2);
        sb.append("channel_id: ");
        sb.append(ayek.f97318b);
        sb.append((CharSequence) sb2);
        sb.append("from_channel_opener: ");
        sb.append(ayek.f97319c);
        sb.append((CharSequence) sb2);
        sb.append("request_id: ");
        sb.append(ayek.f97320d);
    }

    /* renamed from: a */
    public static void m83330a(StringBuilder sb, StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb.append((CharSequence) sb2);
            sb.append(str);
            sb.append(": \"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
