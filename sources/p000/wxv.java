package p000;

/* renamed from: wxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxv extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    public wxv(String str, String str2) {
        super(r2.toString());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(str2).length());
        sb.append("ErrorReport packageName is null. Product: ");
        sb.append(str);
        sb.append(", description: ");
        sb.append(str2);
    }
}
