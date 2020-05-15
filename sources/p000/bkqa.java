package p000;

/* renamed from: bkqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkqa extends bkqe {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkqa(String str) {
        super(r1.toString(), null);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
        sb.append("Root object must have the ID 'root', but it actually has ID ");
        sb.append(str);
        sb.append(".");
    }
}
