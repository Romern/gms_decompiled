package p000;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: abis */
final /* synthetic */ class abis implements Callable {

    /* renamed from: a */
    private final String f57549a;

    /* renamed from: b */
    private final List f57550b;

    public abis(String str, List list) {
        this.f57549a = str;
        this.f57550b = list;
    }

    public final Object call() {
        return abjd.m47786a(this.f57549a, this.f57550b, true, abjb.f57570a);
    }
}
