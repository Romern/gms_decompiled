package p000;

import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bibc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bibc extends bibp {

    /* renamed from: b */
    private final String f120100b;

    /* renamed from: c */
    private final String f120101c;

    /* renamed from: d */
    private final byte[] f120102d;

    /* renamed from: e */
    private final int f120103e;

    /* renamed from: f */
    private final Object f120104f;

    /* renamed from: g */
    private final int f120105g;

    /* renamed from: h */
    private final sgv f120106h;

    public bibc(sgv sgv, String str, String str2, String str3, byte[] bArr, Object obj, int i, int i2) {
        super(str3);
        this.f120106h = sgv;
        this.f120100b = str;
        this.f120101c = str2;
        this.f120102d = bArr;
        this.f120103e = i2;
        this.f120104f = obj;
        this.f120105g = i;
    }

    /* renamed from: a */
    public bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        bonq a = bibp.m101914a(this.f120105g, i, j, placesParams);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        bpqk bpqk = ((bonq) bxvd.f164949b).f133837c;
        if (bpqk == null) {
            bpqk = bpqk.f138732w;
        }
        bxvd bxvd2 = (bxvd) bpqk.mo74142c(5);
        bxvd2.mo73625a((bxvk) bpqk);
        bppp bppp = ((bpqk) bxvd2.f164949b).f138755v;
        if (bppp == null) {
            bppp = bppp.f138633q;
        }
        bxvd bxvd3 = (bxvd) bppp.mo74142c(5);
        bxvd3.mo73625a((bxvk) bppp);
        int i2 = this.f120105g;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppp2.f138636b = i2 - 1;
        bppp2.f138635a |= 1;
        bppp bppp3 = (bppp) bxvd3.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) bxvd2.f164949b;
        bppp3.getClass();
        bpqk2.f138755v = bppp3;
        bpqk2.f138734a |= 8388608;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bonq bonq = (bonq) bxvd.f164949b;
        bpqk bpqk3 = (bpqk) bxvd2.mo74062i();
        bonq bonq2 = bonq.f133833p;
        bpqk3.getClass();
        bonq.f133837c = bpqk3;
        bonq.f133835a |= 2;
        return (bonq) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final Object mo64507a() {
        return this.f120106h.mo25517a(this.f120153a, this.f120102d, this.f120104f, this.f120100b, this.f120101c, cggs.m145360c(), this.f120103e);
    }
}
