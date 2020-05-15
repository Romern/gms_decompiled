package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: azzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azzu {

    /* renamed from: a */
    private boolean f100344a;

    /* renamed from: b */
    private int f100345b;

    /* renamed from: a */
    public final azzv mo55525a() {
        return new azzn(this.f100344a, this.f100345b);
    }

    /* renamed from: a */
    public final void mo55526a(int i, TimeUnit timeUnit) {
        this.f100344a = true;
        this.f100345b = (int) timeUnit.toSeconds((long) i);
    }
}
