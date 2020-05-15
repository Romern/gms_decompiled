package p000;

/* renamed from: ahfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfz {
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m55679a() {
        char c;
        String o = cfos.f185168a.mo6606a().mo82263o();
        switch (o.hashCode()) {
            case -869622582:
                if (o.equals("modulefood")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -404012026:
                if (o.equals("presto_dogfood")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3449687:
                if (o.equals("prod")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3556498:
                if (o.equals("test")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 2;
        }
        if (c == 1) {
            return 5;
        }
        if (c != 2) {
            return c != 3 ? 1 : 4;
        }
        return 3;
    }
}
