package p000;

import java.util.concurrent.Callable;

/* renamed from: awrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awrc implements Callable {

    /* renamed from: a */
    private awrf f94903a;

    public awrc(awrf awrf) {
        this.f94903a = awrf;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        try {
            Object b = this.f94903a.mo52499b();
            return new awre(b, this.f94903a.mo52496a(b));
        } finally {
            this.f94903a = null;
        }
    }
}
