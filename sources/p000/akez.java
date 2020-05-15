package p000;

import java.util.ArrayList;

/* renamed from: akez */
final /* synthetic */ class akez implements Runnable {

    /* renamed from: a */
    private final akgy f71769a;

    /* renamed from: b */
    private final ajnw f71770b;

    public akez(akgy akgy, ajnw ajnw) {
        this.f71769a = akgy;
        this.f71770b = ajnw;
    }

    public final void run() {
        akgy akgy = this.f71769a;
        ajnb ajnb = this.f71770b.f71030g;
        if (ajnb == null) {
            ajnb = ajnb.f70956b;
        }
        ArrayList arrayList = new ArrayList();
        bxwc bxwc = ajnb.f70958a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ajnq ajnq = (ajnq) bxwc.get(i);
            bxvd da = ajhl.f70656i.mo74144da();
            ByteString bxtx = ajnq.f71000c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ajhl ajhl = (ajhl) da.f164949b;
            bxtx.getClass();
            int i2 = ajhl.f70658a | 2;
            ajhl.f70658a = i2;
            ajhl.f70660c = bxtx;
            ByteString bxtx2 = ajnq.f70999b;
            bxtx2.getClass();
            int i3 = i2 | 1;
            ajhl.f70658a = i3;
            ajhl.f70659b = bxtx2;
            long j = ajnq.f71003f;
            int i4 = i3 | 16;
            ajhl.f70658a = i4;
            ajhl.f70663f = j;
            long j2 = ajnq.f71002e;
            int i5 = i4 | 8;
            ajhl.f70658a = i5;
            ajhl.f70662e = j2;
            ByteString bxtx3 = ajnq.f71001d;
            bxtx3.getClass();
            int i6 = i5 | 4;
            ajhl.f70658a = i6;
            ajhl.f70661d = bxtx3;
            ByteString bxtx4 = ajnq.f71004g;
            bxtx4.getClass();
            int i7 = i6 | 32;
            ajhl.f70658a = i7;
            ajhl.f70664g = bxtx4;
            ByteString bxtx5 = ajnq.f71005h;
            bxtx5.getClass();
            ajhl.f70658a = i7 | 64;
            ajhl.f70665h = bxtx5;
            arrayList.add((ajhl) da.mo74062i());
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            akgy.f71946m.mo39195a((ajhl) arrayList.get(i8));
        }
    }
}
