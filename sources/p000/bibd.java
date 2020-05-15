package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bibd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bibd extends bibp {

    /* renamed from: b */
    private final ClientContext f120107b;

    /* renamed from: c */
    private final byte[] f120108c;

    /* renamed from: d */
    private final int f120109d;

    /* renamed from: e */
    private final Object f120110e;

    /* renamed from: f */
    private final int f120111f;

    /* renamed from: g */
    private final sgv f120112g;

    public bibd(sgv sgv, ClientContext clientContext, String str, byte[] bArr, Object obj, int i, int i2) {
        super(str);
        this.f120112g = sgv;
        this.f120107b = clientContext;
        this.f120108c = bArr;
        this.f120109d = i2;
        this.f120110e = obj;
        this.f120111f = i;
    }

    /* renamed from: a */
    public bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        bonq a = bibp.m101914a(this.f120111f, i, j, placesParams);
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
        int i2 = this.f120111f;
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
        return this.f120112g.mo25515a(this.f120107b, 1, this.f120153a, this.f120108c, this.f120110e, cggs.m145360c(), this.f120109d);
    }
}
