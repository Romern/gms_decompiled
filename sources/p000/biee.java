package p000;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeoutException;

/* renamed from: biee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biee extends bien {

    /* renamed from: b */
    private final String f120373b;

    /* renamed from: c */
    private final aeno f120374c;

    public biee(String str, PlacesParams placesParams, aeno aeno, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "GetPhotoMetadata", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a((Object) str);
        sdo.m34959a(aeno);
        this.f120373b = str;
        this.f120374c = aeno;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo64562a() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo64563b() {
        return 1;
    }

    /* renamed from: c */
    public final bpqk mo64564c() {
        bpqk c = bhqq.m101365c(5, this.f120388a);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bxvd da = bprb.f138816d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bprb bprb = (bprb) da.f164949b;
        bprb.f138819b = 0;
        bprb.f138818a |= 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprb bprb2 = (bprb) da.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprb2.getClass();
        bpqk.f138745l = bprb2;
        bpqk.f138734a |= 512;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayList arrayList;
        super.mo6502a(context);
        biam f = mo64567f();
        try {
            String str = this.f120373b;
            PlacesParams placesParams = this.f120388a;
            sgv sgv = f.f120057e;
            String str2 = f.f120055c;
            String str3 = f.f120056d;
            Context context2 = f.f120053a;
            bxvd da = bvmc.f156635d.mo74144da();
            bvov a = bian.m101870a(context2, placesParams);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvmc bvmc = (bvmc) da.f164949b;
            a.getClass();
            bvmc.f156638b = a;
            int i = bvmc.f156637a | 1;
            bvmc.f156637a = i;
            str.getClass();
            bvmc.f156637a = i | 2;
            bvmc.f156639c = str;
            bvmd bvmd = (bvmd) f.mo64492a(new bibc(sgv, str2, str3, "getPlacePhotoMetadata", ((bvmc) da.mo74062i()).mo73642k(), bvmd.f156640c, 9, 10266), placesParams);
            Context context3 = f.f120053a;
            if (bvmd != null) {
                if (bvmd.f156643b.size() != 0) {
                    bvow bvow = bvmd.f156642a;
                    if (bvow == null) {
                        bvow = bvow.f157230c;
                    }
                    bian.m101877a(context3, bvow);
                    arrayList = new ArrayList(bvmd.f156643b.size());
                    for (int i2 = 0; i2 < bvmd.f156643b.size(); i2++) {
                        bvoo bvoo = (bvoo) bvmd.f156643b.get(i2);
                        arrayList.add(new aeoh(bvoo.f157067d, bvoo.f157064a, bvoo.f157065b, bvoo.f157066c, i2));
                    }
                    bioc.m102647a(0, arrayList, this.f120374c);
                }
            }
            arrayList = new ArrayList();
            bioc.m102647a(0, arrayList, this.f120374c);
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102647a(status.f30115i, Collections.emptyList(), this.f120374c);
    }
}
