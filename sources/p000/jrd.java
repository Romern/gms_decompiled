package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jrd extends jsl {

    /* renamed from: a */
    public final List f23113a = new ArrayList();

    /* renamed from: b */
    protected final Runnable f23114b;

    /* renamed from: c */
    public ScheduledFuture f23115c;

    /* renamed from: d */
    private final ScheduledExecutorService f23116d;

    protected jrd(ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.f23116d = scheduledExecutorService;
        this.f23114b = runnable;
    }

    /* renamed from: a */
    public final void mo14016a() {
        ScheduledFuture scheduledFuture = this.f23115c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f23115c = ((sny) this.f23116d).schedule(this.f23114b, 10, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public final void mo13884a(String str, int i, int i2, int i3) {
        this.f23113a.add(new jra(str, i, i2, i3));
    }

    /* renamed from: a */
    public final void mo13885a(String str, String str2, byte[] bArr) {
        this.f23113a.add(new jrc(str, str2, bArr));
    }
}
