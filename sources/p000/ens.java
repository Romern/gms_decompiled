package p000;

/* renamed from: ens */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ens implements Comparable {

    /* renamed from: a */
    public int f15354a;

    /* renamed from: b */
    public int f15355b;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ens ens = (ens) obj;
        int i = this.f15355b;
        int i2 = ens.f15355b;
        return i == i2 ? this.f15354a - ens.f15354a : i - i2;
    }

    public final String toString() {
        return "Order{order=" + this.f15355b + ", index=" + this.f15354a + '}';
    }
}
