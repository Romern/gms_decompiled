package p000;

/* renamed from: bkre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkre extends RuntimeException {
    /* JADX WARNING: Illegal instructions before constructor call */
    public bkre(blgq blgq, blhg blhg) {
        super(r2.toString());
        String valueOf = String.valueOf(blgq);
        String valueOf2 = String.valueOf(blhg.f126522b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length());
        sb.append("Object of type ");
        sb.append(valueOf);
        sb.append(" does not support operation of type ");
        sb.append(valueOf2);
    }
}
