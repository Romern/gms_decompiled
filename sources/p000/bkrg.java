package p000;

/* renamed from: bkrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkrg extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkrg(int i, int i2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(85);
        sb.append("Model size limit has been exceeded. Used: ");
        sb.append(i);
        sb.append(" bytes; Limit: ");
        sb.append(i2);
        sb.append(" bytes");
    }
}
