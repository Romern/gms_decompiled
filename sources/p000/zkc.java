package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: zkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zkc {

    /* renamed from: a */
    final long f55274a;

    /* renamed from: b */
    final long f55275b;

    /* renamed from: c */
    final int f55276c;

    /* renamed from: d */
    final List f55277d;

    /* renamed from: e */
    final long f55278e;

    /* renamed from: f */
    final long f55279f;

    public zkc(long j, long j2, long j3, int i, List list, long j4) {
        this.f55274a = j;
        this.f55275b = j2;
        this.f55278e = j3;
        this.f55276c = i;
        this.f55277d = list;
        this.f55279f = j4;
    }

    /* renamed from: a */
    public final boolean mo31186a(zkc zkc) {
        return this.f55274a == zkc.f55274a && this.f55275b == zkc.f55275b && this.f55276c == zkc.f55276c && this.f55279f == zkc.f55279f && this.f55277d.equals(zkc.f55277d) && this.f55278e == zkc.f55278e;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof zkc) && mo31186a((zkc) obj));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f55274a), Long.valueOf(this.f55275b), Long.valueOf(this.f55278e), Integer.valueOf(this.f55276c), this.f55277d, Long.valueOf(this.f55279f)});
    }

    public final String toString() {
        return String.format("rate=%sus latency=%sus delivery=%sus accuracy=%s timeout=%sus", Long.valueOf(this.f55274a), Long.valueOf(this.f55275b), Long.valueOf(this.f55278e), Integer.valueOf(this.f55276c), Long.valueOf(this.f55279f));
    }
}
