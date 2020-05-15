package p000;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyh {

    /* renamed from: a */
    public final ahyf f68344a;

    /* renamed from: b */
    public final LruCache f68345b = new LruCache((int) cfog.m141292t());

    /* renamed from: c */
    public final Context f68346c;

    /* renamed from: d */
    public final buqn f68347d = new ahyg(this, "DismissHalfSheet");

    /* renamed from: e */
    private final AtomicInteger f68348e = new AtomicInteger(-323583948);

    public ahyh(Context context) {
        this.f68346c = context;
        this.f68344a = new ahyf(context);
    }

    /* renamed from: a */
    public final Integer mo37290a() {
        return Integer.valueOf(this.f68348e.getAndIncrement());
    }
}
