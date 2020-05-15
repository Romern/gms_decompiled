package p000;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: barm */
final /* synthetic */ class barm implements bamd {

    /* renamed from: a */
    private final babr f101619a;

    /* renamed from: b */
    private final bqgg f101620b;

    /* renamed from: c */
    private final cayo f101621c;

    /* renamed from: d */
    private final barw f101622d;

    /* renamed from: e */
    private final Executor f101623e;

    public barm(babr babr, bqgg bqgg, cayo cayo, barw barw, Executor executor) {
        this.f101619a = babr;
        this.f101620b = bqgg;
        this.f101621c = cayo;
        this.f101622d = barw;
        this.f101623e = executor;
    }

    /* renamed from: a */
    public final bqgg mo32716a(Bundle bundle) {
        babr babr = this.f101619a;
        bqgg bqgg = this.f101620b;
        cayo cayo = this.f101621c;
        barw barw = this.f101622d;
        Executor executor = this.f101623e;
        if (babr.mo32699u()) {
            return bqdf.m112619a(bqdx.m112674a(bqgg, new barn(cayo, barw, executor), executor), baan.class, baro.f101627a, executor);
        }
        return bqdf.m112619a(bqdx.m112673a(bqgg, new barp(barw), executor), baan.class, barq.f101629a, executor);
    }
}
