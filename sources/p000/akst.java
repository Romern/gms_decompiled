package p000;

/* renamed from: akst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akst implements Comparable {

    /* renamed from: a */
    public final int f72673a;

    /* renamed from: b */
    public final int f72674b;

    /* renamed from: c */
    public final int f72675c;

    public akst(int i, int i2, int i3) {
        this.f72674b = i;
        this.f72675c = i2;
        this.f72673a = i3;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        akst akst = (akst) obj;
        int i = this.f72675c - akst.f72675c;
        return i == 0 ? this.f72674b - akst.f72674b : i;
    }

    public final String toString() {
        return String.format("%02d/%02d", Integer.valueOf(this.f72674b), Integer.valueOf(this.f72675c));
    }
}
