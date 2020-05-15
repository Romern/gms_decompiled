package p000;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: azqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azqj implements Callable {

    /* renamed from: a */
    final /* synthetic */ Method f99887a;

    /* renamed from: b */
    final /* synthetic */ aztz f99888b;

    /* renamed from: c */
    final /* synthetic */ azql f99889c;

    public azqj(azql azql, Method method, aztz aztz) {
        this.f99889c = azql;
        this.f99887a = method;
        this.f99888b = aztz;
    }

    public final Object call() {
        new Object[1][0] = this.f99887a.getName();
        return this.f99887a.invoke(this.f99889c.f99896c, this.f99888b.mo55230c().toArray());
    }
}
