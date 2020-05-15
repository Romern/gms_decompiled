package p000;

/* renamed from: bxzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxzb extends IllegalArgumentException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bxzb(int i, int i2) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
    }
}
