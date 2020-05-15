package p000;

import android.net.Uri;
import androidx.slice.Slice;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wum implements apq {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f51378a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f51379b;

    /* renamed from: c */
    final /* synthetic */ apr f51380c;

    /* renamed from: d */
    final /* synthetic */ Uri f51381d;

    public wum(AtomicReference atomicReference, CountDownLatch countDownLatch, apr apr, Uri uri) {
        this.f51378a = atomicReference;
        this.f51379b = countDownLatch;
        this.f51380c = apr;
        this.f51381d = uri;
    }

    /* renamed from: a */
    public final void mo2272a(Slice slice) {
        try {
            this.f51378a.set(slice);
            this.f51379b.countDown();
        } finally {
            this.f51380c.mo2276b(this.f51381d, this);
        }
    }
}
