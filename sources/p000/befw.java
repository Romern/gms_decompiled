package p000;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: befw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befw implements Future {

    /* renamed from: a */
    private final Uri f111519a;

    /* renamed from: b */
    private final begm f111520b;

    /* renamed from: c */
    private final CountDownLatch f111521c;

    /* renamed from: d */
    private final begh f111522d;

    public befw(Uri uri, List list) {
        this.f111519a = uri;
        this.f111520b = begm.m95021a(uri);
        this.f111521c = new CountDownLatch(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((begu) list.get(i)).mo60706a(this);
        }
        begi a = this.f111520b.mo60695a("transform");
        this.f111522d = a != null ? a.mo60686a() : begi.m95013a("transform");
    }

    /* renamed from: a */
    public final Uri get() {
        this.f111521c.await();
        begm begm = this.f111520b;
        begg begg = new begg(null);
        List list = begm.f111543b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            begg.mo60684a(((begi) list.get(i)).mo60686a());
        }
        begg.mo60684a(this.f111522d);
        return this.f111519a.buildUpon().encodedFragment(begg.mo60683a().toString()).build();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f111521c.getCount() == 0;
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (this.f111521c.await(j, timeUnit)) {
            return get();
        }
        throw new TimeoutException();
    }

    /* renamed from: a */
    public final void mo60675a(begk begk) {
        this.f111522d.mo60685a(begk.mo60691a());
        this.f111521c.countDown();
    }
}
