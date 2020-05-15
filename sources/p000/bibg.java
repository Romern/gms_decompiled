package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;

/* renamed from: bibg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibg extends bibc {

    /* renamed from: b */
    private final List f120132b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvmu bvmu = (bvmu) obj;
        bonq a = super.mo64506a(i, j, placesParams, bvmu);
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
        bxvd da = bppe.f138605d.mo74144da();
        int size = this.f120132b.size();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppe bppe = (bppe) da.f164949b;
        bppe.f138607a |= 1;
        bppe.f138608b = size;
        if (bvmu != null) {
            i2 = bvmu.f156796b.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppe bppe2 = (bppe) da.f164949b;
        bppe2.f138607a |= 2;
        bppe2.f138609c = i2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppe bppe3 = (bppe) da.mo74062i();
        bppe3.getClass();
        bppp2.f138646l = bppe3;
        bppp2.f138635a |= 1024;
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
    public bibg(sgv sgv, Context context, String str, String str2, List list, String str3, PlacesParams placesParams) {
        super(sgv, str, str2, str3, ((bvmt) r1.mo74062i()).serializeToBytes(), bvmu.f156793c, 7, 10264);
        List list2 = list;
        bxvd da = bvmt.f156788d.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvmt bvmt = (bvmt) da.f164949b;
        a.getClass();
        bvmt.f156791b = a;
        bvmt.f156790a |= 1;
        if (!bvmt.f156792c.mo73666a()) {
            bvmt.f156792c = GeneratedMessageLite.m124021a(bvmt.f156792c);
        }
        bxsy.m123078a(list2, bvmt.f156792c);
        this.f120132b = list2;
    }
}
