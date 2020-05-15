package p000;

import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bicf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicf extends bick {

    /* renamed from: a */
    private final List f120200a;

    /* renamed from: b */
    private final bibx f120201b;

    public bicf(bibx bibx, List list) {
        this.f120201b = bibx;
        this.f120200a = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64517a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvua bvua = (bvua) obj;
        bonq a = bick.m101948a(7, bppo.m112155a(i), j, placesParams);
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
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppp2.f138636b = 6;
        bppp2.f138635a |= 1;
        bxvd da = bppe.f138605d.mo74144da();
        int size = this.f120200a.size();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppe bppe = (bppe) da.f164949b;
        bppe.f138607a |= 1;
        bppe.f138608b = size;
        if (bvua != null) {
            i2 = bvua.f157645a.size();
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
        bppp bppp3 = (bppp) bxvd3.f164949b;
        bppe bppe3 = (bppe) da.mo74062i();
        bppe3.getClass();
        bppp3.f138646l = bppe3;
        bppp3.f138635a |= 1024;
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
        bibx bibx = this.f120201b;
        List list = this.f120200a;
        bxvd da = bvtz.f157640b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtz bvtz = (bvtz) da.f164949b;
        if (!bvtz.f157642a.mo73666a()) {
            bvtz.f157642a = GeneratedMessageLite.m124021a(bvtz.f157642a);
        }
        bxsy.m123078a(list, bvtz.f157642a);
        bvtz bvtz2 = (bvtz) da.mo74062i();
        long c = cghh.m145422c();
        if (bibx.f120171d == null) {
            bibx.f120171d = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/GetNearbyAlertDataById", ciie.m150370a(bvtz.f157640b), ciie.m150370a(bvua.f157643b));
        }
        return (bvua) bibx.f120175a.mo25554a(bibx.f120171d, bvtz2, c, TimeUnit.MILLISECONDS);
    }
}
