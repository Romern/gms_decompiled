package p000;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: vwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vwy {

    /* renamed from: a */
    private final ArrayBlockingQueue f50170a = new ArrayBlockingQueue(1);

    /* renamed from: b */
    private boolean f50171b = false;

    /* renamed from: c */
    private boolean f50172c = false;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo28919a(long j) {
        if (!this.f50172c) {
            this.f50172c = true;
            return this.f50170a.poll(j, TimeUnit.MILLISECONDS);
        }
        throw new RuntimeException("BlockingChannel can be read only once.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28920a(Object obj) {
        if (!this.f50171b) {
            this.f50171b = true;
            this.f50170a.offer(obj);
            return;
        }
        throw new RuntimeException("BlockingChannel can be written only once.");
    }
}
