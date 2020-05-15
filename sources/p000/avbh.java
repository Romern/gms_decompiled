package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: avbh */
final /* synthetic */ class avbh implements Callable {

    /* renamed from: a */
    private final int f92904a;

    /* renamed from: b */
    private final bqgg f92905b;

    /* renamed from: c */
    private final bqgg f92906c;

    public avbh(int i, bqgg bqgg, bqgg bqgg2) {
        this.f92904a = i;
        this.f92905b = bqgg;
        this.f92906c = bqgg2;
    }

    public final Object call() {
        int i = this.f92904a;
        bqgg bqgg = this.f92905b;
        bqgg bqgg2 = this.f92906c;
        bxvd da = bxpd.f164240f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxpd bxpd = (bxpd) da.f164949b;
        bxpd.f164242a |= 1;
        bxpd.f164243b = i;
        boolean booleanValue = ((Boolean) bqga.m112780a((Future) bqgg)).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxpd bxpd2 = (bxpd) da.f164949b;
        bxpd2.f164242a |= 2;
        bxpd2.f164244c = booleanValue;
        boolean booleanValue2 = ((Boolean) bqga.m112780a((Future) bqgg2)).booleanValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxpd bxpd3 = (bxpd) da.f164949b;
        bxpd3.f164242a |= 8;
        bxpd3.f164246e = booleanValue2;
        return new avbm((bxpd) da.mo74062i());
    }
}
