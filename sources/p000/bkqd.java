package p000;

/* renamed from: bkqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkqd extends bkqe {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkqd(String str, String str2) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(str.length() + 54 + String.valueOf(str2).length());
        sb.append("Expected property ");
        sb.append(str);
        sb.append(" on JSON object ");
        sb.append(str2);
        sb.append(", but it is missing.");
    }
}
