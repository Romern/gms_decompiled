package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqh {

    /* renamed from: a */
    public final AtomicInteger f106261a = new AtomicInteger(0);

    /* renamed from: b */
    public final bdqd f106262b;

    /* renamed from: c */
    public final Map f106263c = new ConcurrentHashMap();

    /* renamed from: d */
    public final List f106264d;

    public bdqh(String str) {
        new bdqg(this);
        this.f106264d = new ArrayList();
        this.f106262b = bdqd.m91278a(str, Thread.currentThread().getId(), 2);
    }
}
