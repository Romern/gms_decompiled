package p000;

/* renamed from: bkrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkrm extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkrm(blhg blhg) {
        super(r1.toString());
        String valueOf = String.valueOf(blhg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Unsupported operation type: ");
        sb.append(valueOf);
    }
}
