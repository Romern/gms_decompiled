package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: behq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behq implements beez {

    /* renamed from: a */
    private boolean f111570a = false;

    static {
        new AtomicInteger();
    }

    private behq() {
    }

    /* renamed from: a */
    public static behq m95058a() {
        return new behq();
    }

    /* renamed from: b */
    public final File mo14941a(beey beey) {
        if (!this.f111570a) {
            begv a = begv.m95030a(behs.m95064b(beey));
            try {
                Closeable closeable = a.f111550a;
                if (closeable instanceof bege) {
                    File c = ((bege) closeable).mo60682c();
                    a.close();
                    return c;
                }
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else if (!beey.mo60640a()) {
            return beey.f111468b.mo36273k(beey.f111472f);
        } else {
            throw new begy("Short circuit would skip transforms.");
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo60713b() {
        this.f111570a = true;
    }
}
