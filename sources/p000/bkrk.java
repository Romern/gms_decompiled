package p000;

/* renamed from: bkrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkrk extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkrk(blgs blgs) {
        super(r1.toString());
        String valueOf = String.valueOf(blgs);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unsupported delete mode: ");
        sb.append(valueOf);
    }
}
