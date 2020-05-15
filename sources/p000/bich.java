package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bich */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bich extends bick {

    /* renamed from: a */
    private final bibt f120205a;

    /* renamed from: b */
    private final ClientContext f120206b;

    /* renamed from: c */
    private final String f120207c;

    public bich(bibt bibt, ClientContext clientContext, String str) {
        this.f120205a = bibt;
        this.f120206b = clientContext;
        this.f120207c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64517a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvtw bvtw = (bvtw) obj;
        bonq a = bick.m101948a(5, bppo.m112155a(i), j, placesParams);
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
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppp2.f138636b = 4;
        bppp2.f138635a |= 1;
        bppa bppa = (bppa) bppb.f138595d.mo74144da();
        bppa.mo68969a(bpoz.INFERRED_HOME);
        bppa.mo68969a(bpoz.INFERRED_WORK);
        if (bvtw != null) {
            i2 = bvtw.f157628a.size();
        } else {
            i2 = 0;
        }
        if (bppa.f164950c) {
            bppa.mo74035c();
            bppa.f164950c = false;
        }
        bppb bppb = (bppb) bppa.f164949b;
        bppb.f138597a |= 1;
        bppb.f138599c = i2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp3 = (bppp) bxvd3.f164949b;
        bppb bppb2 = (bppb) bppa.mo74062i();
        bppb2.getClass();
        bppp3.f138642h = bppb2;
        bppp3.f138635a |= 64;
        bppp bppp4 = (bppp) bxvd3.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) bxvd2.f164949b;
        bppp4.getClass();
        bpqk2.f138755v = bppp4;
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
    public final /* bridge */ /* synthetic */ Object mo64518a() {
        bibt bibt = this.f120205a;
        ClientContext clientContext = this.f120206b;
        String str = this.f120207c;
        bvtu bvtu = (bvtu) bvtv.f157621d.mo74144da();
        if (bvtu.f164950c) {
            bvtu.mo74035c();
            bvtu.f164950c = false;
        }
        bvtv bvtv = (bvtv) bvtu.f164949b;
        str.getClass();
        bvtv.f157623a |= 1;
        bvtv.f157624b = str;
        bvtu.mo73386a(bvuc.INFERRED_HOME);
        bvtu.mo73386a(bvuc.INFERRED_WORK);
        return bibt.mo64509a(clientContext, (bvtv) bvtu.mo74062i(), cghh.m145422c());
    }
}
