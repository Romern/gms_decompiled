package p000;

/* renamed from: aopo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopo extends Exception {

    /* renamed from: a */
    public final int f78656a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public aopo(String str, int i) {
        super(r1.toString());
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append(str);
        sb.append(" - status: ");
        sb.append(i);
        this.f78656a = i;
    }
}
