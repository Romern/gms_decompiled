package p000;

import java.security.KeyPair;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bcjv */
public final /* synthetic */ class bcjv implements Callable {

    /* renamed from: a */
    private final bcjz f104353a;

    /* renamed from: b */
    private final cbmo f104354b;

    /* renamed from: c */
    private final long f104355c;

    /* renamed from: d */
    private final KeyPair f104356d;

    /* renamed from: e */
    private final cbma f104357e;

    /* renamed from: f */
    private final bqgg f104358f;

    public bcjv(bcjz bcjz, cbmo cbmo, long j, KeyPair keyPair, cbma cbma, bqgg bqgg) {
        this.f104353a = bcjz;
        this.f104354b = cbmo;
        this.f104355c = j;
        this.f104356d = keyPair;
        this.f104357e = cbma;
        this.f104358f = bqgg;
    }

    public final Object call() {
        bcjz bcjz = this.f104353a;
        cbmo cbmo = this.f104354b;
        long j = this.f104355c;
        KeyPair keyPair = this.f104356d;
        cbma cbma = this.f104357e;
        bqgg bqgg = this.f104358f;
        String uuid = bcla.m89213a(cbmo.f177657b).toString();
        bxtx a = bbqc.m88385a(String.format(Locale.US, "%s:%d", uuid.toLowerCase(Locale.US), Long.valueOf(j)), keyPair);
        bxvd da = cblf.f177482m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblf cblf = (cblf) da.f164949b;
        cblf.f177486c = j;
        cbmo.getClass();
        cblf.f177484a = cbmo;
        cbma.getClass();
        cblf.f177485b = cbma;
        cbld a2 = bcjz.mo56952a((String) bqga.m112780a((Future) bqgg), null, keyPair.getPublic());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblf cblf2 = (cblf) da.f164949b;
        a2.getClass();
        cblf2.f177489f = a2;
        if (a == null) {
            return (cblf) da.mo74062i();
        }
        cblf2.f177487d = 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cblf) da.f164949b).f177488e = a;
        return (cblf) da.mo74062i();
    }
}
