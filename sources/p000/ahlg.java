package p000;

import java.util.ArrayList;

/* renamed from: ahlg */
final /* synthetic */ class ahlg implements Runnable {

    /* renamed from: a */
    private final ahlh f67432a;

    /* renamed from: b */
    private final ahkv f67433b;

    /* renamed from: c */
    private final String f67434c;

    public ahlg(ahlh ahlh, ahkv ahkv, String str) {
        this.f67432a = ahlh;
        this.f67433b = ahkv;
        this.f67434c = str;
    }

    public final void run() {
        ahlh ahlh = this.f67432a;
        ahkv ahkv = this.f67433b;
        String str = this.f67434c;
        if (ahkv.mo36716e(str)) {
            ahlh.mo36781a(ahkv, str, new ArrayList(ahkv.mo36733n(str)));
        }
    }
}
