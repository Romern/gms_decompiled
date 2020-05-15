package p000;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bicj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicj extends bick {

    /* renamed from: a */
    private final bibx f120211a;

    /* renamed from: b */
    private final bibt f120212b;

    /* renamed from: c */
    private final ClientContext f120213c;

    /* renamed from: d */
    private final int f120214d;

    /* renamed from: e */
    private final List f120215e;

    /* renamed from: f */
    private final LatLngBounds f120216f;

    /* renamed from: g */
    private final PlacesParams f120217g;

    public bicj(bibx bibx, bibt bibt, ClientContext clientContext, LatLngBounds latLngBounds, int i, List list, PlacesParams placesParams) {
        this.f120211a = bibx;
        this.f120212b = bibt;
        this.f120213c = clientContext;
        this.f120214d = i;
        this.f120215e = list;
        this.f120216f = latLngBounds;
        this.f120217g = placesParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64517a(int i, long j, PlacesParams placesParams, Object obj) {
        bvtp bvtp = (bvtp) obj;
        bonq a = bick.m101948a(12, bppo.m112155a(i), j, this.f120217g);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((bxvk) a);
        bprp bprp = (bprp) bprq.f138883e.mo74144da();
        int i2 = this.f120214d;
        if (bprp.f164950c) {
            bprp.mo74035c();
            bprp.f164950c = false;
        }
        bprq bprq = (bprq) bprp.f164949b;
        bprq.f138885a |= 1;
        bprq.f138886b = i2;
        if (this.f120215e != null) {
            for (int i3 = 0; i3 < this.f120215e.size(); i3++) {
                bprp.mo68976a(bhqq.m101360a((String) this.f120215e.get(i3)));
            }
        }
        if (bvtp != null) {
            bxvd da = bprr.f138889d.mo74144da();
            String a2 = bhqq.m101360a(bvtp.f157600c);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprr bprr = (bprr) da.f164949b;
            a2.getClass();
            bprr.f138891a |= 1;
            bprr.f138892b = a2;
            int size = bvtp.f157599b.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprr bprr2 = (bprr) da.f164949b;
            bprr2.f138891a |= 2;
            bprr2.f138893c = size;
            bprp.mo68975a(da);
            for (int i4 = 0; i4 < bvtp.f157601d.size(); i4++) {
                bxvd da2 = bprr.f138889d.mo74144da();
                String a3 = bhqq.m101360a(((bvto) bvtp.f157601d.get(i4)).f157594b);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprr bprr3 = (bprr) da2.f164949b;
                a3.getClass();
                bprr3.f138891a |= 1;
                bprr3.f138892b = a3;
                int size2 = ((bvto) bvtp.f157601d.get(i4)).f157593a.size();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprr bprr4 = (bprr) da2.f164949b;
                bprr4.f138891a |= 2;
                bprr4.f138893c = size2;
                bprp.mo68974a((bprr) da2.mo74062i());
            }
        }
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
        bprq bprq2 = (bprq) bprp.mo74062i();
        bprq2.getClass();
        bppp2.f138647m = bprq2;
        bppp2.f138635a |= 2048;
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
    public final /* bridge */ /* synthetic */ Object mo64518a() {
        if (TextUtils.isEmpty(this.f120217g.f79574d)) {
            bibx bibx = this.f120211a;
            bvtn a = bibr.m101920a(this.f120216f, this.f120214d, this.f120215e);
            if (bibx.f120172e == null) {
                bibx.f120172e = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/SearchByChain", ciie.m150370a(bvtn.f157585e), ciie.m150370a(bvtp.f157596e));
            }
            return (bvtp) bibx.f120175a.mo25554a(bibx.f120172e, a, 10000, TimeUnit.MILLISECONDS);
        }
        Account account = new Account(this.f120217g.f79574d, "com.google");
        ClientContext clientContext = new ClientContext(this.f120213c);
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        bibt bibt = this.f120212b;
        bvtn a2 = bibr.m101920a(this.f120216f, this.f120214d, this.f120215e);
        long c = cghh.m145422c();
        if (bibt.f120160b == null) {
            bibt.f120160b = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/SearchByChain", ciie.m150370a(bvtn.f157585e), ciie.m150370a(bvtp.f157596e));
        }
        return (bvtp) bibt.f120163a.mo25553a(bibt.f120160b, clientContext, a2, c, TimeUnit.MILLISECONDS);
    }
}
