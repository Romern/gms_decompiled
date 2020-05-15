package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* renamed from: bibm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibm extends bibp {

    /* renamed from: b */
    private final Context f120135b;

    /* renamed from: c */
    private final ClientContext f120136c;

    /* renamed from: d */
    private final String f120137d;

    /* renamed from: e */
    private final String f120138e;

    /* renamed from: f */
    private final int f120139f;

    /* renamed from: g */
    private final List f120140g;

    /* renamed from: h */
    private final LatLngBounds f120141h;

    /* renamed from: i */
    private final PlacesParams f120142i;

    /* renamed from: j */
    private final sgv f120143j;

    public bibm(sgv sgv, Context context, ClientContext clientContext, String str, String str2, LatLngBounds latLngBounds, int i, List list, String str3, PlacesParams placesParams) {
        super(str3);
        this.f120143j = sgv;
        this.f120135b = context;
        this.f120136c = clientContext;
        this.f120137d = str;
        this.f120138e = str2;
        this.f120139f = i;
        this.f120140g = list;
        this.f120141h = latLngBounds;
        this.f120142i = placesParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        bvlk bvlk = (bvlk) obj;
        bonq a = bibp.m101914a(12, i, j, this.f120142i);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bprp bprp = (bprp) bprq.f138883e.mo74144da();
        int i2 = this.f120139f;
        if (bprp.f164950c) {
            bprp.mo74035c();
            bprp.f164950c = false;
        }
        bprq bprq = (bprq) bprp.f164949b;
        bprq.f138885a |= 1;
        bprq.f138886b = i2;
        if (this.f120140g != null) {
            for (int i3 = 0; i3 < this.f120140g.size(); i3++) {
                bprp.mo68976a(bhqq.m101360a((String) this.f120140g.get(i3)));
            }
        }
        if (bvlk != null) {
            bxvd da = bprr.f138889d.mo74144da();
            String a2 = bhqq.m101360a(bvlk.f156557d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprr bprr = (bprr) da.f164949b;
            a2.getClass();
            bprr.f138891a |= 1;
            bprr.f138892b = a2;
            int size = bvlk.f156556c.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bprr bprr2 = (bprr) da.f164949b;
            bprr2.f138891a |= 2;
            bprr2.f138893c = size;
            bprp.mo68975a(da);
            for (int i4 = 0; i4 < bvlk.f156558e.size(); i4++) {
                bxvd da2 = bprr.f138889d.mo74144da();
                String a3 = bhqq.m101360a(((bvlj) bvlk.f156558e.get(i4)).f156550b);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bprr bprr3 = (bprr) da2.f164949b;
                a3.getClass();
                bprr3.f138891a |= 1;
                bprr3.f138892b = a3;
                int size2 = ((bvlj) bvlk.f156558e.get(i4)).f156549a.size();
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
    public final /* bridge */ /* synthetic */ Object mo64507a() {
        if (TextUtils.isEmpty(this.f120142i.f79574d)) {
            return (bvlk) this.f120143j.mo25517a(this.f120153a, bian.m101866a(this.f120135b, this.f120141h, this.f120139f, this.f120140g, this.f120142i).serializeToBytes(), bvlk.f156552f, this.f120137d, this.f120138e, cggs.m145360c(), 10274);
        }
        Account account = new Account(this.f120142i.f79574d, "com.google");
        ClientContext clientContext = new ClientContext(this.f120136c);
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        return (bvlk) this.f120143j.mo25515a(clientContext, 1, this.f120153a, bian.m101866a(this.f120135b, this.f120141h, this.f120139f, this.f120140g, this.f120142i).serializeToBytes(), bvlk.f156552f, cggs.m145360c(), 10274);
    }
}
