package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bvck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvck extends bvcl {

    /* renamed from: a */
    final /* synthetic */ AtomicInteger f155597a;

    public bvck(AtomicInteger atomicInteger) {
        this.f155597a = atomicInteger;
    }

    /* renamed from: a */
    public final Integer mo73314a() {
        return Integer.valueOf(this.f155597a.getAndIncrement());
    }
}
