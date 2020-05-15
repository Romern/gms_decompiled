package p000;

import java.util.UUID;
import java.util.concurrent.Future;

/* renamed from: bcin */
final /* synthetic */ class bcin implements bqeg {

    /* renamed from: a */
    private final bcjm f104230a;

    /* renamed from: b */
    private final bqgg f104231b;

    /* renamed from: c */
    private final bmxj f104232c;

    /* renamed from: d */
    private final UUID f104233d;

    /* renamed from: e */
    private final bcoh f104234e;

    public bcin(bcjm bcjm, bqgg bqgg, bmxj bmxj, UUID uuid, bcoh bcoh) {
        this.f104230a = bcjm;
        this.f104231b = bqgg;
        this.f104232c = bmxj;
        this.f104233d = uuid;
        this.f104234e = bcoh;
    }

    /* renamed from: a */
    public final bqgg mo7073a() {
        bcjm bcjm = this.f104230a;
        bqgg bqgg = this.f104231b;
        bmxj bmxj = this.f104232c;
        UUID uuid = this.f104233d;
        bcoh bcoh = this.f104234e;
        bcoz bcoz = (bcoz) bqga.m112780a((Future) bqgg);
        if (bcoz == null) {
            return bqga.m112777a((Throwable) new chuw(chuv.f189223j));
        }
        bxvd a = bcka.m89176a(bcjm.f104332a, bqce.m112561a(bcoz.mo57131a()), uuid);
        cbma a2 = bclg.m89237a(bcoh.mo57058b().mo57074e());
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        cbmo cbmo = cbmo.f177654h;
        a2.getClass();
        ((cbmo) a.f164949b).f177662g = a2;
        return (bqgg) bmxj.apply((cbmo) a.mo74062i());
    }
}
