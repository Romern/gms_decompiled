package p000;

/* renamed from: axzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axzz implements Comparable {

    /* renamed from: a */
    final Object f96874a;

    /* renamed from: b */
    final int f96875b;

    /* renamed from: c */
    final long f96876c;

    public axzz(Object obj, int i, long j) {
        this.f96874a = obj;
        this.f96875b = i;
        this.f96876c = j;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.f96875b;
        int i2 = ((axzz) obj).f96875b;
        if (i != i2) {
            return i < i2 ? -1 : 1;
        }
        return 0;
    }
}
