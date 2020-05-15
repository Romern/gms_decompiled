package p000;

import java.util.UUID;
import java.util.concurrent.Future;

/* renamed from: bckv */
public final /* synthetic */ class bckv implements bqeg {

    /* renamed from: a */
    private final bcky f104419a;

    /* renamed from: b */
    private final bqgg f104420b;

    /* renamed from: c */
    private final bcoh f104421c;

    /* renamed from: d */
    private final bcoz f104422d;

    /* renamed from: e */
    private final bcej f104423e;

    /* renamed from: f */
    private final azbk f104424f;

    public bckv(bcky bcky, bqgg bqgg, bcoh bcoh, azbk azbk, bcoz bcoz, bcej bcej) {
        this.f104419a = bcky;
        this.f104420b = bqgg;
        this.f104421c = bcoh;
        this.f104424f = azbk;
        this.f104422d = bcoz;
        this.f104423e = bcej;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcky bcky = this.f104419a;
        bqgg bqgg = this.f104420b;
        bcoh bcoh = this.f104421c;
        azbk azbk = this.f104424f;
        bcoz bcoz = this.f104422d;
        bcej bcej = this.f104423e;
        bbyq bbyq = (bbyq) bqga.m112780a((Future) bqgg);
        if (bbyq.mo56531d() != 4) {
            return bqgg;
        }
        bqgg a = bcky.f104427a.mo56942a(UUID.randomUUID(), new bcna(bcoh, bcky.f104428b, azbk, bcoz.mo57134d(), ((Long) bbyq.mo56530c().mo66814b()).longValue()), bcky.f104427a.f104335d.mo56959a(), bcoh, bcoz, bcej);
        return bqga.m112786c(a).mo69214a(new bckx(a), bqfb.INSTANCE);
    }
}
