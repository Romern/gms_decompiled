package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;

/* renamed from: bibh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibh extends bibd {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvmb bvmb = (bvmb) obj;
        bonq a = super.mo64506a(i, j, placesParams, bvmb);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bppa bppa = (bppa) bppb.f138595d.mo74144da();
        bppa.mo68969a(bpoz.NICKNAME);
        if (bvmb != null) {
            i2 = bvmb.f156633b.size();
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
        bppb bppb2 = (bppb) bppa.mo74062i();
        bpqk bpqk = ((bonq) bxvd.f164949b).f133837c;
        if (bpqk == null) {
            bpqk = bpqk.f138732w;
        }
        bxvd bxvd2 = (bxvd) bpqk.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bpqk);
        bppp bppp = ((bpqk) bxvd2.f164949b).f138755v;
        if (bppp == null) {
            bppp = bppp.f138633q;
        }
        bxvd bxvd3 = (bxvd) bppp.mo74142c(5);
        bxvd3.mo73625a((GeneratedMessageLite) bppp);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppb2.getClass();
        bppp2.f138642h = bppb2;
        bppp2.f138635a |= 64;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) bxvd2.f164949b;
        bppp bppp3 = (bppp) bxvd3.mo74062i();
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

    /* JADX WARNING: Illegal instructions before constructor call */
    public bibh(sgv sgv, Context context, ClientContext clientContext, String str, PlacesParams placesParams) {
        super(sgv, clientContext, str, ((bvma) r0.mo74062i()).serializeToBytes(), bvmb.f156630c, 5, 10272);
        bvlz bvlz = (bvlz) bvma.f156625d.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (bvlz.f164950c) {
            bvlz.mo74035c();
            bvlz.f164950c = false;
        }
        bvma bvma = (bvma) bvlz.f164949b;
        a.getClass();
        bvma.f156628b = a;
        bvma.f156627a |= 1;
        bvlz.mo73381a(bvkz.NICKNAME);
    }
}
