package p000;

import android.content.Context;
import com.google.android.gms.location.places.internal.PlacesParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: biay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biay implements Callable {

    /* renamed from: a */
    private final biam f120087a;

    /* renamed from: b */
    private final PlacesParams f120088b;

    /* renamed from: c */
    private final List f120089c;

    /* renamed from: d */
    private final int f120090d;

    public biay(biam biam, PlacesParams placesParams, List list, int i) {
        this.f120087a = biam;
        this.f120088b = placesParams;
        this.f120089c = list;
        this.f120090d = i;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        HashMap hashMap;
        HashMap hashMap2;
        int i;
        int i2;
        int i3;
        int i4;
        bxwc bxwc;
        biam biam = this.f120087a;
        List list = this.f120089c;
        int i5 = this.f120090d;
        PlacesParams placesParams = this.f120088b;
        bvlp bvlp = (bvlp) biam.mo64492a(new bibn(biam.f120057e, biam.f120053a, biam.f120054b, biam.f120055c, biam.f120056d, list, i5, "searchByClient", placesParams), placesParams);
        Context context = biam.f120053a;
        String str = placesParams.f79574d;
        if (bvlp == null || bvlp.f156583b.size() == 0) {
            hashMap = new HashMap();
        } else {
            bvow bvow = bvlp.f156582a;
            if (bvow == null) {
                bvow = bvow.f157230c;
            }
            bian.m101877a(context, bvow);
            hashMap = new HashMap();
            bxwc bxwc2 = bvlp.f156583b;
            int size = bxwc2.size();
            int i6 = 0;
            while (i6 < size) {
                bvlo bvlo = (bvlo) bxwc2.get(i6);
                String str2 = bvlo.f156577a;
                bxwc bxwc3 = bvlo.f156578b;
                int size2 = bxwc3.size();
                int i7 = 0;
                while (true) {
                    i3 = i6 + 1;
                    if (i7 >= size2) {
                        break;
                    }
                    bvln bvln = (bvln) bxwc3.get(i7);
                    if (bvln.f156572a.size() > 0) {
                        bxwc = bxwc2;
                        long j = bvln.f156573b;
                        ArrayList arrayList = new ArrayList();
                        bxwc bxwc4 = bvln.f156572a;
                        i4 = size;
                        int i8 = 0;
                        for (int size3 = bxwc4.size(); i8 < size3; size3 = size3) {
                            arrayList.add(((bvog) bxwc4.get(i8)).f157033b);
                            i8++;
                        }
                        hashMap.put(bhyw.m101782a(str, str2, Long.valueOf(j)), arrayList);
                    } else {
                        bxwc = bxwc2;
                        i4 = size;
                    }
                    i7++;
                    bxwc2 = bxwc;
                    size = i4;
                }
                i6 = i3;
            }
        }
        Context context2 = biam.f120053a;
        if (bvlp == null || bvlp.f156583b.size() == 0) {
            hashMap2 = new HashMap();
        } else {
            bvow bvow2 = bvlp.f156582a;
            if (bvow2 == null) {
                bvow2 = bvow.f157230c;
            }
            bian.m101877a(context2, bvow2);
            hashMap2 = new HashMap();
            bxwc bxwc5 = bvlp.f156583b;
            int size4 = bxwc5.size();
            int i9 = 0;
            while (i9 < size4) {
                bxwc bxwc6 = ((bvlo) bxwc5.get(i9)).f156578b;
                int size5 = bxwc6.size();
                int i10 = 0;
                while (true) {
                    i = i9 + 1;
                    if (i10 >= size5) {
                        break;
                    }
                    bxwc bxwc7 = ((bvln) bxwc6.get(i10)).f156572a;
                    int size6 = bxwc7.size();
                    int i11 = 0;
                    while (true) {
                        i2 = i10 + 1;
                        if (i11 >= size6) {
                            break;
                        }
                        bvog bvog = (bvog) bxwc7.get(i11);
                        float f = bvog.f157035d;
                        if (f == 0.0f) {
                            f = 80.0f;
                        }
                        String str3 = bvog.f157033b;
                        bzrv bzrv = bvog.f157034c;
                        if (bzrv == null) {
                            bzrv = bzrv.f171206c;
                        }
                        bxwc bxwc8 = bxwc5;
                        int i12 = size4;
                        double d = bzrv.f171208a;
                        bzrv bzrv2 = bvog.f157034c;
                        if (bzrv2 == null) {
                            bzrv2 = bzrv.f171206c;
                        }
                        hashMap2.put(str3, bhzl.m101798a(d, bzrv2.f171209b, f));
                        i11++;
                        i9 = i9;
                        bxwc5 = bxwc8;
                        size4 = i12;
                        bxwc6 = bxwc6;
                    }
                    i10 = i2;
                }
                i9 = i;
            }
        }
        return new bibb(hashMap, hashMap2);
    }
}
