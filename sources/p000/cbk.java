package p000;

/* renamed from: cbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbk extends IllegalArgumentException {
    private static final long serialVersionUID = 1;

    /* JADX WARNING: Illegal instructions before constructor call */
    public cbk(CharSequence charSequence, int i) {
        super(r1.toString());
        String str = (String) charSequence;
        StringBuilder sb = new StringBuilder(str.length() + 53);
        sb.append("\"");
        sb.append(str);
        sb.append("\" input is not hex formatted at position ");
        sb.append(i);
    }

    public cbk(String str) {
        super(str);
    }
}
