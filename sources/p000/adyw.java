package p000;

import java.io.Closeable;

/* renamed from: adyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyw implements Closeable {

    /* renamed from: a */
    private static final adyw f62948a = new adyw(false, null);

    /* renamed from: b */
    private final boolean f62949b;

    /* renamed from: c */
    private final adyz f62950c;

    private adyw(boolean z, adyz adyz) {
        this.f62949b = z;
        this.f62950c = adyz;
    }

    /* renamed from: a */
    public static adyw m51454a(boolean z, adyy adyy) {
        if (!z || adyy == null || Thread.currentThread().isInterrupted()) {
            return f62948a;
        }
        adyz adyz = new adyz(adyy.f62951a);
        adyw adyw = new adyw(true, adyz);
        try {
            adyz.mo33952f();
            return adyw;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new adyx(e);
        }
    }

    public final void close() {
        adyz adyz;
        if (this.f62949b && (adyz = this.f62950c) != null && adyz.mo33942a()) {
            this.f62950c.mo33944b();
        }
    }
}
