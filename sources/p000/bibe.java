package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bibe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibe extends bibp {

    /* renamed from: b */
    private final Context f120113b;

    /* renamed from: c */
    private final ClientContext f120114c;

    /* renamed from: d */
    private final String f120115d;

    /* renamed from: e */
    private final String f120116e;

    /* renamed from: f */
    private final int f120117f;

    /* renamed from: g */
    private final LatLng f120118g;

    /* renamed from: h */
    private final boolean f120119h;

    /* renamed from: i */
    private final PlacesParams f120120i;

    /* renamed from: j */
    private final sgv f120121j;

    public bibe(sgv sgv, Context context, ClientContext clientContext, String str, String str2, LatLng latLng, int i, boolean z, String str3, PlacesParams placesParams) {
        super(str3);
        this.f120121j = sgv;
        this.f120113b = context;
        this.f120114c = clientContext;
        this.f120115d = str;
        this.f120116e = str2;
        this.f120118g = latLng;
        this.f120117f = i;
        this.f120119h = z;
        this.f120120i = placesParams;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bonq mo64506a(int i, long j, PlacesParams placesParams, Object obj) {
        int i2;
        bvly bvly = (bvly) obj;
        bonq a = bibp.m101914a(4, i, j, placesParams);
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
        bxvd da = bpow.f138581c.mo74144da();
        if (bvly != null) {
            i2 = bvly.f156623b.size();
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpow bpow = (bpow) da.f164949b;
        bpow.f138583a |= 1;
        bpow.f138584b = i2;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bppp bppp2 = (bppp) bxvd3.f164949b;
        bpow bpow2 = (bpow) da.mo74062i();
        bpow2.getClass();
        bppp2.f138643i = bpow2;
        bppp2.f138635a |= 128;
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
        if (!TextUtils.isEmpty(this.f120120i.f79574d)) {
            return (bvly) this.f120121j.mo25515a(this.f120114c, 1, this.f120153a, bian.m101868a(this.f120113b, this.f120118g, this.f120117f, this.f120119h, this.f120120i).serializeToBytes(), bvly.f156620c, cggs.m145360c(), 10265);
        }
        return (bvly) this.f120121j.mo25517a(this.f120153a, bian.m101868a(this.f120113b, this.f120118g, this.f120117f, this.f120119h, this.f120120i).serializeToBytes(), bvly.f156620c, this.f120115d, this.f120116e, cggs.m145360c(), 10265);
    }
}
