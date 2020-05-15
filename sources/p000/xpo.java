package p000;

/* renamed from: xpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xpo extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    public xpo(int i) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(51);
        sb.append("Algorithm with COSE value ");
        sb.append(i);
        sb.append(" not supported");
    }
}
