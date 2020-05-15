package p000;

/* renamed from: ayvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayvk {

    /* renamed from: a */
    public final String f98564a;

    /* renamed from: b */
    public final int f98565b;

    public ayvk(int i, String str) {
        this.f98565b = i;
        this.f98564a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayvk) {
            ayvk ayvk = (ayvk) obj;
            return ayvk.f98565b + -1 == this.f98565b + -1 && bmxi.m108538a(ayvk.f98564a, this.f98564a);
        }
    }

    public final int hashCode() {
        int i = this.f98565b - 1;
        String str = this.f98564a;
        return i + ((str != null ? str.hashCode() : 0) * 31);
    }
}
