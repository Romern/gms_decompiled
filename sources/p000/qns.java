package p000;

/* renamed from: qns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qns extends Exception {

    /* renamed from: a */
    public final int f41797a;

    public qns() {
        this.f41797a = 5;
    }

    public final String getMessage() {
        String str;
        int i = this.f41797a;
        switch (i) {
            case 1:
                str = "CONFIG_ERROR";
                break;
            case 2:
                str = "SYNC_ERROR";
                break;
            case 3:
                str = "SYNC_TIMEOUT";
                break;
            case 4:
                str = "COMMIT_ERROR";
                break;
            case 5:
                str = "COMMIT_TIMEOUT";
                break;
            case 6:
                str = "BAD_FLAG_PROTO";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            String message = super.getMessage();
            if (message == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str.length() + 2 + message.length());
            sb.append(str);
            sb.append(", ");
            sb.append(message);
            return sb.toString();
        }
        throw null;
    }

    public qns(int i, Exception exc) {
        super(exc);
        this.f41797a = i;
    }

    public qns(String str) {
        super(str);
        this.f41797a = 1;
    }
}
