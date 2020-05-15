package p000;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: beit */
final /* synthetic */ class beit implements bqeg {

    /* renamed from: a */
    private final beja f111603a;

    /* renamed from: b */
    private final bqgg f111604b;

    /* renamed from: c */
    private final bqgg f111605c;

    public beit(beja beja, bqgg bqgg, bqgg bqgg2) {
        this.f111603a = beja;
        this.f111604b = bqgg;
        this.f111605c = bqgg2;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        beja beja = this.f111603a;
        bqgg bqgg = this.f111604b;
        bqgg bqgg2 = this.f111605c;
        Uri uri = (Uri) bqga.m112780a((Future) bqgg);
        Set<String> set = (Set) bqga.m112780a((Future) bqgg2);
        beiz beiz = new beiz(set);
        for (String str : set) {
            Intent intent = new Intent();
            intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
            intent.setData(uri);
            intent.setPackage(str);
            intent.setFlags(268435456);
            beja.f111627b.sendOrderedBroadcast(intent, null, beiz, beja.f111629d, -1, null, null);
        }
        bmza b = bmza.m108659b(bmvy.f131119a);
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        Integer num = (Integer) beja.f111630e.mo6606a();
        bqgg a = bqdf.m112619a(bqfl.m112747c(beiz.f111624a).mo69206a((long) num.intValue(), beja.f111631f, beja.f111632g), TimeoutException.class, new beiv(atomicBoolean), bqfb.INSTANCE);
        bqga.m112781a(a, new beiw(beja, atomicBoolean, set, b, beiz, num), bqfb.INSTANCE);
        return a;
    }
}
