package p000;

import android.content.Intent;

/* renamed from: adaj */
final /* synthetic */ class adaj implements bmzi {

    /* renamed from: a */
    private final adam f61206a;

    /* renamed from: b */
    private final int f61207b;

    /* renamed from: c */
    private final Intent f61208c;

    public adaj(adam adam, int i, Intent intent) {
        this.f61206a = adam;
        this.f61207b = i;
        this.f61208c = intent;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        adam adam = this.f61206a;
        int i = this.f61207b;
        Intent intent = this.f61208c;
        bqgy c = bqgy.m112818c();
        adam.f61213b.put(i, c);
        adam.f61212a.startActivityForResult(intent, i);
        return c;
    }
}
