package p000;

import android.content.Context;
import android.net.Uri;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

/* renamed from: bidy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidy extends bien {

    /* renamed from: b */
    private final AddPlaceRequest f120355b;

    /* renamed from: c */
    private final aenr f120356c;

    public bidy(AddPlaceRequest addPlaceRequest, PlacesParams placesParams, aenr aenr, bidi bidi, bidx bidx, bhpt bhpt) {
        super(65, "AddPlace", placesParams, bidi, bidx, "", bhpt);
        sdo.m34959a(addPlaceRequest);
        sdo.m34959a(aenr);
        this.f120355b = addPlaceRequest;
        this.f120356c = aenr;
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
        AddPlaceRequest addPlaceRequest = this.f120355b;
        PlacesParams placesParams = this.f120388a;
        bpqk c = bhqq.m101365c(1, placesParams);
        bxvd bxvd = (bxvd) c.mo74142c(5);
        bxvd.mo73625a((bxvk) c);
        bprg a = bhqq.m101359a(4, placesParams.f79573c, Locale.getDefault().toString());
        bxvd bxvd2 = (bxvd) a.mo74142c(5);
        bxvd2.mo73625a((bxvk) a);
        bxvd da = bppz.f138678h.mo74144da();
        String str = addPlaceRequest.f79450a;
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppz bppz = (bppz) da.f164949b;
            str.getClass();
            bppz.f138680a |= 1;
            bppz.f138681b = str;
        }
        LatLng latLng = addPlaceRequest.f79451b;
        if (latLng != null) {
            bxvd da2 = bplh.f138088d.mo74144da();
            int i = (int) (latLng.f79894a * 1.0E7d);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bplh bplh = (bplh) da2.f164949b;
            int i2 = 1 | bplh.f138090a;
            bplh.f138090a = i2;
            bplh.f138091b = i;
            double d = latLng.f79895b;
            bplh.f138090a = i2 | 2;
            bplh.f138092c = (int) (d * 1.0E7d);
            bplh bplh2 = (bplh) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppz bppz2 = (bppz) da.f164949b;
            bplh2.getClass();
            bppz2.f138682c = bplh2;
            bppz2.f138680a |= 2;
        }
        String str2 = addPlaceRequest.f79452c;
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppz bppz3 = (bppz) da.f164949b;
            str2.getClass();
            bppz3.f138680a = 4 | bppz3.f138680a;
            bppz3.f138683d = str2;
        }
        List list = addPlaceRequest.f79453d;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                String a2 = bhqm.m101334a(((Integer) list.get(i3)).intValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bppz bppz4 = (bppz) da.f164949b;
                a2.getClass();
                if (!bppz4.f138684e.mo73666a()) {
                    bppz4.f138684e = bxvk.m124021a(bppz4.f138684e);
                }
                bppz4.f138684e.add(a2);
            }
        }
        String str3 = addPlaceRequest.f79454e;
        if (str3 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppz bppz5 = (bppz) da.f164949b;
            str3.getClass();
            bppz5.f138680a |= 8;
            bppz5.f138685f = str3;
        }
        Uri uri = addPlaceRequest.f79455f;
        if (uri != null) {
            String uri2 = uri.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bppz bppz6 = (bppz) da.f164949b;
            uri2.getClass();
            bppz6.f138680a |= 16;
            bppz6.f138686g = uri2;
        }
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bprg bprg = (bprg) bxvd2.f164949b;
        bppz bppz7 = (bppz) da.mo74062i();
        bprg bprg2 = bprg.f138829s;
        bppz7.getClass();
        bprg.f138837g = bppz7;
        bprg.f138831a |= 64;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpqk bpqk = (bpqk) bxvd.f164949b;
        bprg bprg3 = (bprg) bxvd2.mo74062i();
        bpqk bpqk2 = bpqk.f138732w;
        bprg3.getClass();
        bpqk.f138742i = bprg3;
        bpqk.f138734a |= 64;
        return (bpqk) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        ArrayList arrayList;
        super.mo6502a(context);
        biam f = mo64567f();
        try {
            AddPlaceRequest addPlaceRequest = this.f120355b;
            PlacesParams placesParams = this.f120388a;
            sgv sgv = f.f120057e;
            String str = f.f120055c;
            String str2 = f.f120056d;
            Context context2 = f.f120053a;
            bxvd da = bvkv.f156470i.mo74144da();
            bvov a = bian.m101870a(context2, placesParams);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvkv bvkv = (bvkv) da.f164949b;
            a.getClass();
            bvkv.f156473b = a;
            int i = bvkv.f156472a | 1;
            bvkv.f156472a = i;
            String str3 = addPlaceRequest.f79450a;
            str3.getClass();
            bvkv.f156472a = i | 2;
            bvkv.f156475d = str3;
            bzrv a2 = bian.m101871a(addPlaceRequest.f79451b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvkv bvkv2 = (bvkv) da.f164949b;
            a2.getClass();
            bvkv2.f156478g = a2;
            int i2 = bvkv2.f156472a | 16;
            bvkv2.f156472a = i2;
            String str4 = addPlaceRequest.f79452c;
            str4.getClass();
            int i3 = i2 | 4;
            bvkv2.f156472a = i3;
            bvkv2.f156476e = str4;
            String str5 = addPlaceRequest.f79454e;
            str5.getClass();
            bvkv2.f156472a = i3 | 8;
            bvkv2.f156477f = str5;
            List list = addPlaceRequest.f79453d;
            if (list != null) {
                List a3 = bhqm.m101335a(list);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvkv bvkv3 = (bvkv) da.f164949b;
                if (!bvkv3.f156474c.mo73666a()) {
                    bvkv3.f156474c = bxvk.m124021a(bvkv3.f156474c);
                }
                bxsy.m123078a(a3, bvkv3.f156474c);
            }
            Uri uri = addPlaceRequest.f79455f;
            if (uri != null) {
                String uri2 = uri.toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvkv bvkv4 = (bvkv) da.f164949b;
                uri2.getClass();
                bvkv4.f156472a |= 32;
                bvkv4.f156479h = uri2;
            }
            bvkw bvkw = (bvkw) f.mo64492a(new bibc(sgv, str, str2, "addPlace", ((bvkv) da.mo74062i()).mo73642k(), bvkw.f156480d, 2, 10241), placesParams);
            Context context3 = f.f120053a;
            if (bvkw != null) {
                if ((bvkw.f156482a & 2) != 0) {
                    bvow bvow = bvkw.f156483b;
                    if (bvow == null) {
                        bvow = bvow.f157230c;
                    }
                    bian.m101877a(context3, bvow);
                    bvmv bvmv = bvkw.f156484c;
                    if (bvmv == null) {
                        bvmv = bvmv.f156798q;
                    }
                    PlaceEntity a4 = bian.m101872a(bvmv);
                    arrayList = new ArrayList();
                    arrayList.add(a4);
                    bioc.m102648a(0, arrayList, this.f120356c);
                }
            }
            arrayList = new ArrayList();
            bioc.m102648a(0, arrayList, this.f120356c);
        } catch (VolleyError | gid | TimeoutException e) {
            throw bien.m102124a(e);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        bioc.m102648a(status.f30115i, Collections.emptyList(), this.f120356c);
    }
}
