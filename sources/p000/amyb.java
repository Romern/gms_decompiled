package p000;

/* renamed from: amyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amyb extends Exception {

    /* renamed from: a */
    public final int f76365a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public amyb(int i) {
        super(r0);
        String a = amya.m63708a(i);
        if (i != 0) {
            this.f76365a = i;
            return;
        }
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public amyb(String str) {
        super(r4.toString());
        String a = amya.m63708a(4);
        StringBuilder sb = new StringBuilder(a.length() + 1 + str.length());
        sb.append(a);
        sb.append(":");
        sb.append(str);
        this.f76365a = 4;
    }
}
