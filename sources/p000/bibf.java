package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bibf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibf extends bibp {

    /* renamed from: b */
    private final Context f120122b;

    /* renamed from: c */
    private final ClientContext f120123c;

    /* renamed from: d */
    private final String f120124d;

    /* renamed from: e */
    private final String f120125e;

    /* renamed from: f */
    private final String f120126f;

    /* renamed from: g */
    private final LatLngBounds f120127g;

    /* renamed from: h */
    private final int f120128h;

    /* renamed from: i */
    private final AutocompleteFilter f120129i;

    /* renamed from: j */
    private final PlacesParams f120130j;

    /* renamed from: k */
    private final sgv f120131k;

    public bibf(sgv sgv, Context context, ClientContext clientContext, String str, String str2, String str3, LatLngBounds latLngBounds, int i, AutocompleteFilter autocompleteFilter, String str4, PlacesParams placesParams) {
        super(str4);
        this.f120131k = sgv;
        this.f120122b = context;
        this.f120123c = clientContext;
        this.f120124d = str;
        this.f120125e = str2;
        this.f120126f = str3;
        this.f120127g = latLngBounds;
        this.f120128h = i;
        this.f120129i = autocompleteFilter;
        this.f120130j = placesParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvlf bvlf = (bvlf) obj;
        bonq a = bibp.m101914a(6, i, j, this.f120130j);
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
        bxvd da = bppc.f138600c.mo74144da();
        if (bvlf != null) {
            i2 = bvlf.f156527b.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bppc bppc = (bppc) da.f164949b;
        bppc.f138602a |= 1;
        bppc.f138603b = i2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bppc bppc2 = (bppc) da.mo74062i();
        bppc2.getClass();
        bppp2.f138645k = bppc2;
        bppp2.f138635a |= 512;
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

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo64507a() {
        if (!TextUtils.isEmpty(this.f120130j.f79574d)) {
            return (bvlf) this.f120131k.mo25515a(this.f120123c, 1, this.f120153a, bian.m101865a(this.f120122b, this.f120126f, this.f120127g, this.f120128h, this.f120129i, this.f120130j).mo73642k(), bvlf.f156524c, cggs.m145360c(), 10247);
        }
        return (bvlf) this.f120131k.mo25517a(this.f120153a, bian.m101865a(this.f120122b, this.f120126f, this.f120127g, this.f120128h, this.f120129i, this.f120130j).mo73642k(), bvlf.f156524c, this.f120124d, this.f120125e, cggs.m145360c(), 10246);
    }
}
