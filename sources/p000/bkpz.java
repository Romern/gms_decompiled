package p000;

/* renamed from: bkpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpz extends bkqe {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkpz(String str, String str2) {
        super(r2.toString(), null);
        StringBuilder sb = new StringBuilder(str.length() + 43 + String.valueOf(str2).length());
        sb.append("Expected a JSON element of type ");
        sb.append(str);
        sb.append(", but got ");
        sb.append(str2);
        sb.append(".");
    }
}
