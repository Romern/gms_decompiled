package p000;

/* renamed from: rcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcq implements Comparable {

    /* renamed from: a */
    public final long f42650a;

    /* renamed from: b */
    public final long f42651b;

    public rcq(long j, long j2) {
        this.f42650a = j;
        this.f42651b = j2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (((rcq) obj).f42650a > this.f42650a ? 1 : (((rcq) obj).f42650a == this.f42650a ? 0 : -1));
    }
}
