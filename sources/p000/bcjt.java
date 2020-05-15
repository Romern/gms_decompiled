package p000;

import java.security.KeyPair;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: bcjt */
public final /* synthetic */ class bcjt implements Callable {

    /* renamed from: a */
    private final bcjz f104341a;

    /* renamed from: b */
    private final cbmo f104342b;

    /* renamed from: c */
    private final cbma f104343c;

    /* renamed from: d */
    private final bqgg f104344d;

    /* renamed from: e */
    private final bqgg f104345e;

    /* renamed from: f */
    private final bqgg f104346f;

    public bcjt(bcjz bcjz, cbmo cbmo, cbma cbma, bqgg bqgg, bqgg bqgg2, bqgg bqgg3) {
        this.f104341a = bcjz;
        this.f104342b = cbmo;
        this.f104343c = cbma;
        this.f104344d = bqgg;
        this.f104345e = bqgg2;
        this.f104346f = bqgg3;
    }

    public final Object call() {
        bcjz bcjz = this.f104341a;
        cbmo cbmo = this.f104342b;
        cbma cbma = this.f104343c;
        bqgg bqgg = this.f104344d;
        bqgg bqgg2 = this.f104345e;
        bqgg bqgg3 = this.f104346f;
        bxvd da = cblh.f177503d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblh cblh = (cblh) da.f164949b;
        cbmo.getClass();
        cblh.f177505a = cbmo;
        cbma.getClass();
        cblh.f177506b = cbma;
        cbld a = bcjz.mo56952a((String) bqga.m112780a((Future) bqgg), (String) bqga.m112780a((Future) bqgg2), ((KeyPair) bqga.m112780a((Future) bqgg3)).getPublic());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cblh) da.f164949b).f177507c = a;
        return (cblh) da.mo74062i();
    }
}
