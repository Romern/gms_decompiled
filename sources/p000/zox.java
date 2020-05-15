package p000;

/* renamed from: zox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zox extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    public zox(String str, String str2) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
        sb.append("No Server exists for [");
        sb.append(str);
        sb.append("] to sync with [");
        sb.append(str2);
        sb.append("]");
    }
}
