package p000;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: tou */
final /* synthetic */ class tou implements Callable {

    /* renamed from: a */
    private final tox f46420a;

    /* renamed from: b */
    private final bxxc f46421b;

    public tou(tox tox, bxxc bxxc) {
        this.f46420a = tox;
        this.f46421b = bxxc;
    }

    public final Object call() {
        tox tox = this.f46420a;
        return tox.f46425a.mo24203b(this.f46421b, (Bundle) null);
    }
}
