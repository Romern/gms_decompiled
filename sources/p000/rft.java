package p000;

import java.util.concurrent.Callable;

/* renamed from: rft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rft extends rfu {

    /* renamed from: e */
    private final Callable f42884e;

    public rft(Callable callable) {
        super(false, null, null);
        this.f42884e = callable;
    }

    /* renamed from: a */
    public final String mo24602a() {
        try {
            return (String) this.f42884e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
