package p000;

/* renamed from: bnuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnuo {

    /* renamed from: a */
    public final int f132201a;

    /* renamed from: b */
    public final bnss f132202b;

    protected bnuo(bnss bnss, int i) {
        if (bnss == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i >= 0) {
            this.f132201a = i;
            this.f132202b = bnss;
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("invalid index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public abstract void mo68499a(bnup bnup, Object obj);
}
