package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bjxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxv {

    /* renamed from: a */
    static int f123609a = 1;

    /* renamed from: b */
    final ArrayList f123610b;

    /* renamed from: c */
    int f123611c = -1;

    /* renamed from: d */
    boolean f123612d = false;

    /* renamed from: e */
    private final AtomicInteger f123613e = new AtomicInteger();

    private bjxv(ArrayList arrayList, boolean z) {
        this.f123610b = arrayList;
        m104859a(0);
        this.f123612d = z;
    }

    /* renamed from: a */
    private final void m104859a(int i) {
        if (i >= this.f123610b.size()) {
            i = this.f123610b.size();
            this.f123610b.add(Integer.valueOf(m104864f()));
        }
        this.f123613e.set(((Integer) this.f123610b.get(i)).intValue());
        this.f123611c = i;
    }

    /* renamed from: b */
    public static bjxv m104860b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("idGenerator.startingIdList")) {
            return null;
        }
        return new bjxv(bundle.getIntegerArrayList("idGenerator.startingIdList"), bundle.getBoolean("idGenerator.isResettable", false));
    }

    /* renamed from: c */
    public static bjxv m104861c() {
        return new bjxv(new ArrayList(2), false);
    }

    /* renamed from: d */
    public static bjxv m104862d() {
        return new bjxv(new ArrayList(2), true);
    }

    /* renamed from: e */
    static synchronized void m104863e() {
        synchronized (bjxv.class) {
            f123609a = 1;
        }
    }

    /* renamed from: f */
    static synchronized int m104864f() {
        int i;
        synchronized (bjxv.class) {
            if (f123609a > 16777184) {
                m104863e();
            }
            i = f123609a;
            f123609a += 32;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized void mo65616b() {
        if (this.f123612d) {
            m104859a(0);
        } else {
            throw new IllegalStateException("Cannot be called on non-resettable IdGenerator.");
        }
    }

    /* renamed from: a */
    public final synchronized int mo65614a() {
        if (this.f123613e.get() == ((Integer) this.f123610b.get(this.f123611c)).intValue() + 32) {
            m104859a(this.f123611c + 1);
        }
        return this.f123613e.getAndIncrement();
    }

    /* renamed from: a */
    public final void mo65615a(Bundle bundle) {
        bundle.putIntegerArrayList("idGenerator.startingIdList", this.f123610b);
        bundle.putBoolean("idGenerator.isResettable", this.f123612d);
    }
}
