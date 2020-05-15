package p000;

import java.util.concurrent.Callable;

/* renamed from: abiy */
final /* synthetic */ class abiy implements Callable {

    /* renamed from: a */
    private final abjd f57563a;

    /* renamed from: b */
    private final bsme f57564b;

    /* renamed from: c */
    private final String f57565c;

    public abiy(abjd abjd, bsme bsme, String str) {
        this.f57563a = abjd;
        this.f57564b = bsme;
        this.f57565c = str;
    }

    public final Object call() {
        return this.f57563a.f57571a.getPackageManager().hasSystemFeature(this.f57564b.f145006a) ? abjc.m47783c() : abjc.m47781a(this.f57565c);
    }
}
