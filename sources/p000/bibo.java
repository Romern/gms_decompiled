package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collection;
import java.util.List;

/* renamed from: bibo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibo extends bibc {

    /* renamed from: b */
    private final int f120152b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvpa bvpa = (bvpa) obj;
        bonq a = super.mo64506a(i, j, placesParams, bvpa);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = bpru.f138903d.mo74144da();
        int i3 = this.f120152b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpru bpru = (bpru) da.f164949b;
        bpru.f138905a |= 1;
        bpru.f138906b = i3;
        if (bvpa != null) {
            i2 = bvpa.f157255b.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpru bpru2 = (bpru) da.f164949b;
        bpru2.f138905a |= 2;
        bpru2.f138907c = i2;
        bpru bpru3 = (bpru) da.mo74062i();
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
        bpru3.getClass();
        bppp2.f138648n = bpru3;
        bppp2.f138635a |= 4096;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    public bibo(sgv sgv, Context context, String str, String str2, LatLngBounds latLngBounds, int i, String str3, Collection collection, boolean z, String str4, PlacesParams placesParams) {
        super(sgv, str, str2, str4, ((bvoz) r1.mo74062i()).serializeToBytes(), bvpa.f157252c, 10, 10242);
        int i2 = i;
        bxvd da = bvoz.f157244g.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvoz bvoz = (bvoz) da.f164949b;
        a.getClass();
        bvoz.f157247b = a;
        bvoz.f157246a |= 1;
        bxvd da2 = bvmw.f156816d.mo74144da();
        List a2 = bhqm.m101335a(collection);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvmw bvmw = (bvmw) da2.f164949b;
        if (!bvmw.f156820c.mo73666a()) {
            bvmw.f156820c = GeneratedMessageLite.m124021a(bvmw.f156820c);
        }
        bxsy.m123078a(a2, bvmw.f156820c);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvmw bvmw2 = (bvmw) da2.f164949b;
        bvmw2.f156818a |= 1;
        bvmw2.f156819b = z;
        bvmw bvmw3 = (bvmw) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvoz bvoz2 = (bvoz) da.f164949b;
        bvmw3.getClass();
        bvoz2.f157248c = bvmw3;
        bvoz2.f157246a |= 2;
        bvme a3 = bian.m101869a(latLngBounds);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvoz bvoz3 = (bvoz) da.f164949b;
        a3.getClass();
        bvoz3.f157249d = a3;
        int i3 = bvoz3.f157246a | 4;
        bvoz3.f157246a = i3;
        int i4 = i3 | 16;
        bvoz3.f157246a = i4;
        bvoz3.f157251f = i2;
        str3.getClass();
        bvoz3.f157246a = i4 | 8;
        bvoz3.f157250e = str3;
        this.f120152b = i2;
    }
}
