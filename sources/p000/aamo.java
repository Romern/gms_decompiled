package p000;

/* renamed from: aamo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aamo extends aamq {

    /* renamed from: a */
    final String f28474a;

    /* renamed from: b */
    final boolean f28475b;

    public aamo(blmp blmp) {
        this(blmp, false);
    }

    /* renamed from: a */
    public final int mo17038a() {
        return 3;
    }

    public final String toString() {
        String aamq = super.toString();
        boolean z = this.f28475b;
        StringBuilder sb = new StringBuilder(String.valueOf(aamq).length() + 23);
        sb.append(aamq);
        sb.append(" deleted_messages=");
        sb.append(z);
        return sb.toString();
    }

    public aamo(blmp blmp, boolean z) {
        super(blmp);
        this.f28474a = blmp.f126871f;
        this.f28475b = z;
    }
}
