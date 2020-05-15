package p000;

/* renamed from: eq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0967eq implements Comparable {

    /* renamed from: a */
    final int f15501a;

    /* renamed from: b */
    final int f15502b;

    /* renamed from: c */
    final String f15503c;

    /* renamed from: d */
    final String f15504d;

    public C0967eq(int i, int i2, String str, String str2) {
        this.f15501a = i;
        this.f15502b = i2;
        this.f15503c = str;
        this.f15504d = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0967eq eqVar = (C0967eq) obj;
        int i = this.f15501a - eqVar.f15501a;
        return i == 0 ? this.f15502b - eqVar.f15502b : i;
    }
}
