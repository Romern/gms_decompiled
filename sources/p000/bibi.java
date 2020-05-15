package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;

/* renamed from: bibi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibi extends bibc {

    /* renamed from: b */
    private final List f120133b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvmz bvmz = (bvmz) obj;
        bonq a = super.mo64506a(i, j, placesParams, bvmz);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
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
        bxvd da = bppf.f138610d.mo74144da();
        int size = this.f120133b.size();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppf bppf = (bppf) da.f164949b;
        bppf.f138612a |= 1;
        bppf.f138613b = size;
        if (bvmz != null) {
            i2 = bvmz.f156834b.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppf bppf2 = (bppf) da.f164949b;
        bppf2.f138612a |= 2;
        bppf2.f138614c = i2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppf bppf3 = (bppf) da.mo74062i();
        bppf3.getClass();
        bppp2.f138641g = bppf3;
        bppp2.f138635a |= 32;
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
    public bibi(sgv sgv, Context context, String str, String str2, List list, String str3, PlacesParams placesParams) {
        super(sgv, str, str2, str3, ((bvmy) r1.mo74062i()).serializeToBytes(), bvmz.f156831c, 8, 10243);
        List list2 = list;
        bxvd da = bvmy.f156826d.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvmy bvmy = (bvmy) da.f164949b;
        a.getClass();
        bvmy.f156829b = a;
        bvmy.f156828a |= 1;
        if (!bvmy.f156830c.mo73666a()) {
            bvmy.f156830c = GeneratedMessageLite.m124021a(bvmy.f156830c);
        }
        bxsy.m123078a(list2, bvmy.f156830c);
        this.f120133b = list2;
    }
}
