package p000;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: abit */
final /* synthetic */ class abit implements Callable {

    /* renamed from: a */
    private final String f57551a;

    /* renamed from: b */
    private final List f57552b;

    public abit(String str, List list) {
        this.f57551a = str;
        this.f57552b = list;
    }

    public final Object call() {
        return abjd.m47786a(this.f57551a, this.f57552b, false, abja.f57569a);
    }
}
