package p000;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: apfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apfd {

    /* renamed from: a */
    private static apfd f84294a = null;

    /* renamed from: b */
    private final AtomicInteger f84295b = new AtomicInteger(0);

    private apfd() {
    }

    /* renamed from: a */
    static synchronized apfd m70140a() {
        apfd apfd;
        synchronized (apfd.class) {
            if (f84294a == null) {
                f84294a = new apfd();
            }
            apfd = f84294a;
        }
        return apfd;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final apfc mo47152a(Context context) {
        return new apfc(context, this.f84295b.getAndIncrement());
    }
}
