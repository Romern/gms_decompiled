package p000;

import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: bcjx */
final /* synthetic */ class bcjx implements Callable {

    /* renamed from: a */
    private final Map f104360a;

    /* renamed from: b */
    private final azbl f104361b;

    public bcjx(azbl azbl, Map map) {
        this.f104361b = azbl;
        this.f104360a = map;
    }

    public final Object call() {
        azbl azbl = this.f104361b;
        return vvp.m41461a(azbl.f98904a.f98906a, "tachyon_registration", this.f104360a);
    }
}
