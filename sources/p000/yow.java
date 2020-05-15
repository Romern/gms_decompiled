package p000;

/* renamed from: yow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yow implements Comparable {

    /* renamed from: a */
    public final long f54302a;

    /* renamed from: b */
    public final float f54303b;

    public yow(long j, float f) {
        this.f54302a = j;
        this.f54303b = f;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Float.compare(this.f54303b, ((yow) obj).f54303b);
    }
}
