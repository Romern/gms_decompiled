package p000;

/* renamed from: btws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btws {
    /* renamed from: a */
    public static int m118961a(int i) {
        switch (i) {
            case 0:
            case 1:
                return 0;
            case 2:
            case 3:
                return 1;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 3;
            case 7:
                return 4;
            default:
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
