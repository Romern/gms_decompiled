package p000;

import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.concurrent.TimeUnit;

/* renamed from: bici */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bici extends bick {

    /* renamed from: a */
    private final int f120208a;

    /* renamed from: b */
    private final bibx f120209b;

    /* renamed from: c */
    private final LatLngBounds f120210c;

    public bici(bibx bibx, LatLngBounds latLngBounds, int i) {
        this.f120209b = bibx;
        this.f120210c = latLngBounds;
        this.f120208a = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64517a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvtm bvtm = (bvtm) obj;
        bonq a = bick.m101948a(11, bppo.m112155a(i), j, placesParams);
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
        bppp2.f138636b = 10;
        bppp2.f138635a |= 1;
        bxvd da = bpro.f138878d.mo74144da();
        int i3 = this.f120208a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpro bpro = (bpro) da.f164949b;
        bpro.f138880a |= 1;
        bpro.f138881b = i3;
        if (bvtm != null) {
            i2 = bvtm.f157584a.size();
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
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp3 = (bppp) bxvd3.f164949b;
        bpro3.getClass();
        bppp3.f138644j = bpro3;
        bppp3.f138635a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bpqk bpqk2 = (bpqk) bxvd2.f164949b;
        bppp bppp4 = (bppp) bxvd3.mo74062i();
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
        bibx bibx = this.f120209b;
        LatLngBounds latLngBounds = this.f120210c;
        int i = this.f120208a;
        bxvd da = bvtl.f157577d.mo74144da();
        bvtx a = bibr.m101922a(latLngBounds);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtl bvtl = (bvtl) da.f164949b;
        a.getClass();
        bvtl.f157580b = a;
        int i2 = bvtl.f157579a | 1;
        bvtl.f157579a = i2;
        bvtl.f157579a = i2 | 2;
        bvtl.f157581c = i;
        bvtl bvtl2 = (bvtl) da.mo74062i();
        long c = cghh.m145422c();
        if (bibx.f120173f == null) {
            bibx.f120173f = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/SearchByBeacon", ciie.m150370a(bvtl.f157577d), ciie.m150370a(bvtm.f157582b));
        }
        return (bvtm) bibx.f120175a.mo25554a(bibx.f120173f, bvtl2, c, TimeUnit.MILLISECONDS);
    }
}
