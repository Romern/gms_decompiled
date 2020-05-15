package p000;

import java.io.Closeable;
import java.util.concurrent.Callable;

/* renamed from: bqen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqen implements Callable {

    /* renamed from: a */
    final /* synthetic */ bqeu f140548a;

    /* renamed from: b */
    final /* synthetic */ bemp f140549b;

    public bqen(bqeu bqeu, bemp bemp) {
        this.f140548a = bqeu;
        this.f140549b = bemp;
    }

    public final Object call() {
        bemp bemp = this.f140549b;
        bqes bqes = this.f140548a.f140564b;
        Closeable[] closeableArr = bemp.f111837a;
        bnrt bnrt = bend.f111847a;
        bqes.mo69184b(closeableArr[0], bqfb.INSTANCE);
        return null;
    }

    public final String toString() {
        return this.f140549b.toString();
    }
}
