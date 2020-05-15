package p000;

import android.os.SystemClock;

/* renamed from: ahkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahkk {

    /* renamed from: a */
    public final long f67344a;

    /* renamed from: b */
    public final int f67345b;

    /* renamed from: c */
    private final long f67346c = SystemClock.elapsedRealtime();

    /* renamed from: d */
    private long f67347d = 0;

    /* renamed from: e */
    private int f67348e = 0;

    public ahkk(int i, long j) {
        this.f67345b = i;
        this.f67344a = j;
    }

    /* renamed from: a */
    public final bxvd mo36649a() {
        bxvd da = bven.f155761h.mo74144da();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f67346c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bven bven = (bven) da.f164949b;
        int i = bven.f155763a | 1;
        bven.f155763a = i;
        bven.f155764b = elapsedRealtime;
        bven.f155765c = this.f67345b - 1;
        int i2 = i | 2;
        bven.f155763a = i2;
        long j = this.f67344a;
        int i3 = i2 | 4;
        bven.f155763a = i3;
        bven.f155766d = j;
        long j2 = this.f67347d;
        int i4 = i3 | 8;
        bven.f155763a = i4;
        bven.f155767e = j2;
        int i5 = this.f67348e;
        bven.f155763a = i4 | 16;
        bven.f155768f = i5;
        return da;
    }

    /* renamed from: a */
    public final void mo36650a(long j) {
        this.f67347d += j;
        this.f67348e++;
    }
}
