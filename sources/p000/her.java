package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: her */
final /* synthetic */ class her implements Callable {

    /* renamed from: a */
    private final het f19613a;

    /* renamed from: b */
    private final Iterable f19614b;

    /* renamed from: c */
    private final String f19615c;

    public her(het het, Iterable iterable, String str) {
        this.f19613a = het;
        this.f19614b = iterable;
        this.f19615c = str;
    }

    public final Object call() {
        het het = this.f19613a;
        Iterable<bqgg> iterable = this.f19614b;
        String str = this.f19615c;
        if (!ccda.m129287b()) {
            return new Object();
        }
        for (bqgg bqgg : iterable) {
            bonc bonc = (bonc) bqga.m112780a((Future) bqgg);
            qws qws = het.f19618b;
            bxvd da = bong.f133782r.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bong bong = (bong) da.f164949b;
            bong.f133785b = 2;
            int i = bong.f133784a | 1;
            bong.f133784a = i;
            str.getClass();
            int i2 = 2 | i;
            bong.f133784a = i2;
            bong.f133786c = str;
            bonc.getClass();
            bong.f133787d = bonc;
            bong.f133784a = i2 | 4;
            qws.mo24333a(da.mo74062i()).mo24327b();
        }
        return new Object();
    }
}
