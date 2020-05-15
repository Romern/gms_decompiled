package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bibl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibl extends bibc {

    /* renamed from: b */
    private final int f120134b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvlh bvlh = (bvlh) obj;
        bonq a = super.mo64506a(i, j, placesParams, bvlh);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        bxvd da = bpro.f138878d.mo74144da();
        int i3 = this.f120134b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpro bpro = (bpro) da.f164949b;
        bpro.f138880a |= 1;
        bpro.f138881b = i3;
        if (bvlh != null) {
            i2 = bvlh.f156538b.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpro bpro2 = (bpro) da.f164949b;
        bpro2.f138880a |= 2;
        bpro2.f138882c = i2;
        bpro bpro3 = (bpro) da.mo74062i();
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
        bpro3.getClass();
        bppp2.f138644j = bpro3;
        bppp2.f138635a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
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
    public bibl(sgv sgv, Context context, String str, String str2, LatLngBounds latLngBounds, int i, String str3, PlacesParams placesParams) {
        super(sgv, str, str2, str3, ((bvlg) r1.mo74062i()).mo73642k(), bvlh.f156535c, 11, 10275);
        int i2 = i;
        bxvd da = bvlg.f156529e.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlg bvlg = (bvlg) da.f164949b;
        a.getClass();
        bvlg.f156532b = a;
        bvlg.f156531a |= 1;
        bvme a2 = bian.m101869a(latLngBounds);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlg bvlg2 = (bvlg) da.f164949b;
        a2.getClass();
        bvlg2.f156533c = a2;
        int i3 = bvlg2.f156531a | 2;
        bvlg2.f156531a = i3;
        bvlg2.f156531a = i3 | 4;
        bvlg2.f156534d = i2;
        this.f120134b = i2;
    }
}
