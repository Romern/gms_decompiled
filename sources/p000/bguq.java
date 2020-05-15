package p000;

/* renamed from: bguq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguq extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bguq(String str, String str2) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
    }
}
