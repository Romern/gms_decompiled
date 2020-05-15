package p000;

import java.util.concurrent.Callable;

/* renamed from: bljt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bljt implements Callable {

    /* renamed from: a */
    final /* synthetic */ bljg f126702a;

    /* renamed from: b */
    final /* synthetic */ Callable f126703b;

    public bljt(bljg bljg, Callable callable) {
        this.f126702a = bljg;
        this.f126703b = callable;
    }

    public final Object call() {
        bljg b = blkh.m107293b(this.f126702a);
        try {
            return this.f126703b.call();
        } finally {
            blkh.m107293b(b);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f126703b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
