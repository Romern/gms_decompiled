package p000;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bies */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bies implements bieq {

    /* renamed from: a */
    private static final long f120404a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private final bhpt f120405b;

    /* renamed from: c */
    private final PlaceFilter f120406c;

    /* renamed from: d */
    private final aenr f120407d;

    public bies(bhpt bhpt, PlaceFilter placeFilter, aenr aenr) {
        this.f120405b = bhpt;
        this.f120406c = placeFilter;
        this.f120407d = aenr;
    }

    /* renamed from: a */
    private final void m102160a(Context context, PlacesParams placesParams, PlaceFilter placeFilter, aenr aenr, int i, long j) {
        biao biao;
        biao biao2;
        Throwable th;
        biao biao3;
        bngx bngx;
        bice bice;
        PlaceFilter placeFilter2;
        ArrayList arrayList;
        ArrayList arrayList2;
        PlaceFilter placeFilter3;
        Iterator it;
        PlaceLikelihoodEntity placeLikelihoodEntity;
        bvuk bvuk;
        PlaceEntity placeEntity;
        float f;
        LatLngBounds latLngBounds;
        Uri uri;
        boolean z;
        float f2;
        int i2;
        float f3;
        int i3;
        PlaceOpeningHoursEntity placeOpeningHoursEntity;
        Locale locale;
        PlaceFilter placeFilter4;
        int i4;
        int i5;
        int i6;
        int i7;
        float f4;
        Context context2 = context;
        PlacesParams placesParams2 = placesParams;
        if (cgfl.m145006b()) {
            this.f120405b.mo64139a(bhqq.m101346a(bhqq.m101353a(placeFilter, placesParams2)));
        }
        biao biao4 = new biao(aenr, i);
        biog a = bioh.m102655a(context2, placesParams2.f79572b, aeie.m51878c(context), f120404a);
        if (a.f121045b != 0) {
            biao = biao4;
        } else {
            Location location = a.f121044a;
            if (location != null) {
                LatLng latLng = new LatLng(location.getLatitude(), a.f121044a.getLongitude());
                try {
                    if (!cghh.f186930a.mo6606a().mo83787d()) {
                        try {
                            bngx = biam.m101859a(context2, placesParams2, this.f120405b).mo64494a(latLng, i, true, placesParams, this.f120406c);
                            biao3 = biao4;
                        } catch (chuw | VolleyError | gid | SecurityException | TimeoutException e) {
                            th = e;
                            biao2 = biao4;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        }
                    } else {
                        bibq a2 = bibq.m101917a(context2, placesParams2, this.f120405b);
                        biao3 = biao4;
                        bice bice2 = bice;
                        PlaceFilter placeFilter5 = this.f120406c;
                        try {
                            bice = new bice(a2.f120155b, a2.f120156c, a2.f120154a, a2.f120157d, latLng, i, placesParams);
                            bvtt bvtt = (bvtt) a2.mo64508a(bice2, placesParams2);
                            if (bvtt != null) {
                                try {
                                    if (bvtt.f157620a.size() != 0) {
                                        ArrayList arrayList3 = new ArrayList(bvtt.f157620a.size());
                                        Iterator it2 = bvtt.f157620a.iterator();
                                        while (it2.hasNext()) {
                                            bvuk bvuk2 = (bvuk) it2.next();
                                            if ((bvuk2.f157705a & 1) != 0) {
                                                bvue bvue = bvuk2.f157706b;
                                                if (bvue == null) {
                                                    bvue = bvue.f157659q;
                                                }
                                                if (bvue != null) {
                                                    int i8 = bvue.f157661a;
                                                    if ((i8 & 1) == 0) {
                                                        if (Log.isLoggable("Places", 6)) {
                                                            bioi.m102658a("Places", "received place lacks id");
                                                        }
                                                        it = it2;
                                                        arrayList2 = arrayList;
                                                        placeFilter3 = placeFilter2;
                                                        bvuk = bvuk2;
                                                        placeEntity = null;
                                                    } else if ((i8 & 32) == 0) {
                                                        if (Log.isLoggable("Places", 6)) {
                                                            bioi.m102658a("Places", "received place lacks geometry");
                                                        }
                                                        it = it2;
                                                        arrayList2 = arrayList;
                                                        placeFilter3 = placeFilter2;
                                                        bvuk = bvuk2;
                                                        placeEntity = null;
                                                    } else {
                                                        bvuf bvuf = bvue.f157669i;
                                                        if (bvuf == null) {
                                                            bvuf = bvuf.f157677d;
                                                        }
                                                        if ((bvuf.f157679a & 1) == 0) {
                                                            if (Log.isLoggable("Places", 6)) {
                                                                bioi.m102658a("Places", "received place lacks latlng");
                                                            }
                                                            it = it2;
                                                            arrayList2 = arrayList;
                                                            placeFilter3 = placeFilter2;
                                                            bvuk = bvuk2;
                                                            placeEntity = null;
                                                        } else {
                                                            String str = bvue.f157662b;
                                                            int size = bvue.f157663c.size();
                                                            List arrayList4 = new ArrayList(size);
                                                            if (size == 0) {
                                                                if (Log.isLoggable("Places", 5)) {
                                                                    bioi.m102662c("Places", "place is missing type. Defaulting to 'other'");
                                                                }
                                                                arrayList4 = bngx.m109356a((Object) 0);
                                                            } else {
                                                                for (String str2 : bvue.f157663c) {
                                                                    arrayList4.add(Integer.valueOf(bhqm.m101333a(str2)));
                                                                }
                                                            }
                                                            bvuf bvuf2 = bvue.f157669i;
                                                            if (bvuf2 == null) {
                                                                bvuf2 = bvuf.f157677d;
                                                            }
                                                            bzrv bzrv = bvuf2.f157680b;
                                                            if (bzrv == null) {
                                                                bzrv = bzrv.f171206c;
                                                            }
                                                            LatLng a3 = bibr.m101924a(bzrv);
                                                            if ((bvuf2.f157679a & 2) != 0) {
                                                                bvtx bvtx = bvuf2.f157681c;
                                                                if (bvtx == null) {
                                                                    bvtx = bvtx.f157629d;
                                                                }
                                                                bzrv bzrv2 = bvtx.f157632b;
                                                                if (bzrv2 == null) {
                                                                    bzrv2 = bzrv.f171206c;
                                                                }
                                                                LatLng a4 = bibr.m101924a(bzrv2);
                                                                bzrv bzrv3 = bvtx.f157633c;
                                                                if (bzrv3 == null) {
                                                                    bzrv3 = bzrv.f171206c;
                                                                }
                                                                latLngBounds = new LatLngBounds(a4, bibr.m101924a(bzrv3));
                                                            } else {
                                                                latLngBounds = null;
                                                            }
                                                            if ((bvue.f157661a & 64) != 0) {
                                                                uri = Uri.parse(bvue.f157670j);
                                                            } else {
                                                                uri = null;
                                                            }
                                                            int i9 = bvue.f157661a;
                                                            it = it2;
                                                            if ((i9 & 128) == 0 || !bvue.f157671k) {
                                                                z = false;
                                                            } else {
                                                                z = true;
                                                            }
                                                            if ((i9 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                                                f2 = bvue.f157672l;
                                                            } else {
                                                                f2 = -1.0f;
                                                            }
                                                            if ((i9 & 512) != 0) {
                                                                i2 = bvue.f157673m;
                                                            } else {
                                                                i2 = -1;
                                                            }
                                                            if ((i9 & 4096) != 0) {
                                                                bvum bvum = bvue.f157675o;
                                                                if (bvum == null) {
                                                                    bvum = bvum.f157714c;
                                                                }
                                                                ArrayList arrayList5 = new ArrayList();
                                                                for (bvus bvus : bvum.f157716a) {
                                                                    ArrayList arrayList6 = arrayList;
                                                                    PlaceFilter placeFilter6 = placeFilter2;
                                                                    float f5 = f2;
                                                                    int i10 = i2;
                                                                    bvuk bvuk3 = bvuk2;
                                                                    int i11 = bvus.f157737a;
                                                                    if ((i11 & 1) == 0 || (i11 & 2) == 0) {
                                                                        placeFilter2 = placeFilter6;
                                                                        arrayList = arrayList6;
                                                                        bvuk2 = bvuk3;
                                                                        i7 = i10;
                                                                        f4 = f5;
                                                                    } else {
                                                                        arrayList5.add(PlaceOpeningHoursEntity.BusinessHoursInterval.m66966a(bvus.f157738b, bvus.f157739c));
                                                                        placeFilter2 = placeFilter6;
                                                                        arrayList = arrayList6;
                                                                        bvuk2 = bvuk3;
                                                                        i7 = i10;
                                                                        f4 = f5;
                                                                    }
                                                                }
                                                                ArrayList arrayList7 = new ArrayList();
                                                                Iterator it3 = bvum.f157717b.iterator();
                                                                while (it3.hasNext()) {
                                                                    Iterator it4 = it3;
                                                                    bvur bvur = (bvur) it3.next();
                                                                    PlaceFilter placeFilter7 = placeFilter2;
                                                                    if ((bvur.f157732a & 1) != 0) {
                                                                        bvuq bvuq = bvur.f157733b;
                                                                        if (bvuq == null) {
                                                                            bvuq = bvuq.f157725d;
                                                                        }
                                                                        ArrayList arrayList8 = arrayList;
                                                                        int i12 = bvuq.f157727a;
                                                                        if ((i12 & 1) == 0 || (i12 & 2) == 0) {
                                                                            placeFilter4 = placeFilter7;
                                                                            it3 = it4;
                                                                            arrayList = arrayList8;
                                                                        } else {
                                                                            bvup bvup = bvuq.f157728b;
                                                                            if (bvup == null) {
                                                                                bvup = bvup.f157719e;
                                                                            }
                                                                            bvup bvup2 = bvuq.f157729c;
                                                                            if (bvup2 == null) {
                                                                                bvup2 = bvup.f157719e;
                                                                            }
                                                                            bvuk bvuk4 = bvuk2;
                                                                            int i13 = bvup.f157721a;
                                                                            if (!((i13 & 1) == 0 || (i13 & 2) == 0 || (i13 & 4) == 0)) {
                                                                                int i14 = bvup2.f157721a;
                                                                                if (!((i14 & 1) == 0 || (i14 & 2) == 0 || (i14 & 4) == 0)) {
                                                                                    ArrayList arrayList9 = new ArrayList();
                                                                                    Iterator it5 = bvur.f157734c.iterator();
                                                                                    while (it5.hasNext()) {
                                                                                        Iterator it6 = it5;
                                                                                        bvus bvus2 = (bvus) it5.next();
                                                                                        int i15 = i2;
                                                                                        int i16 = bvus2.f157737a;
                                                                                        if ((i16 & 1) == 0 || (i16 & 2) == 0) {
                                                                                            it5 = it6;
                                                                                            i6 = i15;
                                                                                        } else {
                                                                                            arrayList9.add(PlaceOpeningHoursEntity.BusinessHoursInterval.m66966a(bvus2.f157738b, bvus2.f157739c));
                                                                                            it5 = it6;
                                                                                            i6 = i15;
                                                                                        }
                                                                                    }
                                                                                    int i17 = i2;
                                                                                    int i18 = bvup.f157724d;
                                                                                    int a5 = bvuo.m121482a(bvup.f157723c);
                                                                                    if (a5 != 0) {
                                                                                        i4 = a5;
                                                                                    } else {
                                                                                        i4 = 1;
                                                                                    }
                                                                                    int i19 = bvup.f157722b;
                                                                                    int i20 = bvup2.f157724d;
                                                                                    float f6 = f2;
                                                                                    int a6 = bvuo.m121482a(bvup2.f157723c);
                                                                                    if (a6 != 0) {
                                                                                        i5 = a6;
                                                                                    } else {
                                                                                        i5 = 1;
                                                                                    }
                                                                                    arrayList7.add(PlaceOpeningHoursEntity.ExceptionalHours.m66967a(i18, i4, i19, i20, i5, bvup2.f157722b, arrayList9));
                                                                                    placeFilter4 = placeFilter7;
                                                                                    it3 = it4;
                                                                                    arrayList = arrayList8;
                                                                                    bvuk2 = bvuk4;
                                                                                    i2 = i17;
                                                                                    f2 = f6;
                                                                                }
                                                                            }
                                                                            placeFilter4 = placeFilter7;
                                                                            it3 = it4;
                                                                            arrayList = arrayList8;
                                                                            bvuk2 = bvuk4;
                                                                        }
                                                                    } else {
                                                                        placeFilter4 = placeFilter7;
                                                                        it3 = it4;
                                                                    }
                                                                }
                                                                arrayList2 = arrayList;
                                                                placeFilter3 = placeFilter2;
                                                                f3 = f2;
                                                                i3 = i2;
                                                                bvuk = bvuk2;
                                                                placeOpeningHoursEntity = PlaceOpeningHoursEntity.m66965a(arrayList5, arrayList7);
                                                            } else {
                                                                arrayList2 = arrayList;
                                                                placeFilter3 = placeFilter2;
                                                                f3 = f2;
                                                                i3 = i2;
                                                                bvuk = bvuk2;
                                                                placeOpeningHoursEntity = null;
                                                            }
                                                            String str3 = bvue.f157665e;
                                                            String str4 = bvue.f157666f;
                                                            String str5 = bvue.f157667g;
                                                            bxwc bxwc = bvue.f157668h;
                                                            String str6 = bvue.f157674n;
                                                            String str7 = bvue.f157676p;
                                                            aeob aeob = new aeob();
                                                            aeob.f63547a = str;
                                                            aeob.f63557k = arrayList4;
                                                            aeob.f63548b = str3;
                                                            aeob.f63558l = str4;
                                                            aeob.f63559m = str5;
                                                            aeob.f63560n = bxwc;
                                                            aeob.f63549c = a3;
                                                            aeob.f63551e = latLngBounds;
                                                            aeob.f63553g = uri;
                                                            aeob.f63554h = z;
                                                            aeob.f63555i = f3;
                                                            aeob.f63556j = i3;
                                                            aeob.f63552f = str6;
                                                            aeob.f63561o = placeOpeningHoursEntity;
                                                            aeob.f63563q = str7;
                                                            placeEntity = aeob.mo34381a();
                                                            if ((bvue.f157661a & 2) == 0 || bvue.f157664d.isEmpty()) {
                                                                placeEntity.f79552r = Locale.getDefault();
                                                            } else {
                                                                List c = bmyx.m108644b("[-_]").mo66925c((CharSequence) bvue.f157664d);
                                                                if (c.size() >= 2 && ((String) c.get(1)).length() == 2) {
                                                                    locale = new Locale((String) c.get(0), (String) c.get(1));
                                                                } else if (((String) c.get(0)).length() > 0) {
                                                                    locale = new Locale((String) c.get(0));
                                                                } else {
                                                                    locale = Locale.getDefault();
                                                                }
                                                                placeEntity.f79552r = locale;
                                                            }
                                                        }
                                                    }
                                                } else if (Log.isLoggable("Places", 6)) {
                                                    bioi.m102658a("Places", "received null place");
                                                    it = it2;
                                                    arrayList2 = arrayList;
                                                    placeFilter3 = placeFilter2;
                                                    bvuk = bvuk2;
                                                    placeEntity = null;
                                                } else {
                                                    it = it2;
                                                    arrayList2 = arrayList;
                                                    placeFilter3 = placeFilter2;
                                                    bvuk = bvuk2;
                                                    placeEntity = null;
                                                }
                                                if (placeEntity != null) {
                                                    bvuk bvuk5 = bvuk;
                                                    if ((bvuk5.f157705a & 2) != 0) {
                                                        f = bvuk5.f157707c;
                                                    } else {
                                                        f = 0.0f;
                                                    }
                                                    placeLikelihoodEntity = PlaceLikelihoodEntity.m66960a(placeEntity, f);
                                                } else {
                                                    placeLikelihoodEntity = null;
                                                }
                                            } else {
                                                it = it2;
                                                arrayList2 = arrayList;
                                                placeFilter3 = placeFilter2;
                                                placeLikelihoodEntity = null;
                                            }
                                            if (placeLikelihoodEntity != null) {
                                                arrayList2.add(placeLikelihoodEntity);
                                                arrayList3 = arrayList2;
                                                it2 = it;
                                                placeFilter5 = placeFilter3;
                                            } else {
                                                arrayList3 = arrayList2;
                                                it2 = it;
                                                placeFilter5 = placeFilter3;
                                            }
                                        }
                                        ArrayList<PlaceLikelihoodEntity> arrayList10 = arrayList;
                                        PlaceFilter placeFilter8 = placeFilter2;
                                        if (placeFilter8 != null) {
                                            PlaceFilter placeFilter9 = new PlaceFilter(placeFilter8.f79477e, placeFilter8.f79474b, placeFilter8.f79479g, placeFilter8.f79478f);
                                            ArrayList arrayList11 = new ArrayList(arrayList10.size());
                                            for (PlaceLikelihoodEntity placeLikelihoodEntity2 : arrayList10) {
                                                if (placeFilter9.mo43626a(placeLikelihoodEntity2.f79558a)) {
                                                    arrayList11.add(placeLikelihoodEntity2);
                                                }
                                            }
                                            bngx = bngx.m109368a((Collection) arrayList11);
                                        } else {
                                            bngx = bngx.m109368a((Collection) arrayList10);
                                        }
                                    }
                                } catch (chuw | VolleyError | gid | SecurityException | TimeoutException e2) {
                                    th = e2;
                                    biao2 = biao3;
                                    m102161a(placeFilter, j, placesParams, false);
                                    biao2.mo64173a(th);
                                    return;
                                }
                            }
                            bngx = bngx.m109376e();
                        } catch (chuw | VolleyError | gid | SecurityException | TimeoutException e3) {
                            e = e3;
                            biao2 = biao3;
                            th = e;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        }
                    }
                    if (bioh.m102656a(context, placesParams.f79572b)) {
                        biao2 = biao3;
                        try {
                            m102161a(placeFilter, j, placesParams, true);
                            biao2.mo64172a((List) bngx);
                            return;
                        } catch (SecurityException e4) {
                            e = e4;
                            th = e;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        } catch (VolleyError e5) {
                            e = e5;
                            th = e;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        } catch (gid e6) {
                            e = e6;
                            th = e;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        } catch (TimeoutException e7) {
                            e = e7;
                            th = e;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        } catch (chuw e8) {
                            e = e8;
                            th = e;
                            m102161a(placeFilter, j, placesParams, false);
                            biao2.mo64173a(th);
                            return;
                        }
                    } else {
                        throw new SecurityException();
                    }
                } catch (chuw | VolleyError | gid | SecurityException | TimeoutException e9) {
                    e = e9;
                    biao2 = biao4;
                    th = e;
                    m102161a(placeFilter, j, placesParams, false);
                    biao2.mo64173a(th);
                    return;
                }
            } else {
                biao = biao4;
            }
        }
        m102161a(placeFilter, j, placesParams, false);
        biao.mo64173a((Throwable) new IllegalStateException("Unable to determine current location."));
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 1;
    }

    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return null;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 2;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return false;
    }

    /* renamed from: a */
    private final void m102161a(PlaceFilter placeFilter, long j, PlacesParams placesParams, boolean z) {
        if (cgfl.m145006b()) {
            int currentTimeMillis = (int) (System.currentTimeMillis() - j);
            bpqk c = bhqq.m101365c(6, placesParams);
            bxvd bxvd = (bxvd) c.mo74142c(5);
            bxvd.mo73625a((bxvk) c);
            bxvd da = bpqs.f138781e.mo74144da();
            bppt a = bhqq.m101348a(placeFilter.f79477e, placeFilter.f79474b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpqs bpqs = (bpqs) da.f164949b;
            a.getClass();
            bpqs.f138784b = a;
            int i = bpqs.f138783a | 1;
            bpqs.f138783a = i;
            bpqs.f138785c = 1;
            int i2 = i | 2;
            bpqs.f138783a = i2;
            bpqs.f138783a = i2 | 4;
            bpqs.f138786d = currentTimeMillis;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpqk bpqk = (bpqk) bxvd.f164949b;
            bpqs bpqs2 = (bpqs) da.mo74062i();
            bpqk bpqk2 = bpqk.f138732w;
            bpqs2.getClass();
            bpqk.f138746m = bpqs2;
            bpqk.f138734a |= 1024;
            bpqk bpqk3 = (bpqk) bxvd.mo74062i();
            bxvd bxvd2 = (bxvd) bpqk3.mo74142c(5);
            bxvd2.mo73625a((bxvk) bpqk3);
            if (!z) {
                bpqs bpqs3 = ((bpqk) bxvd2.f164949b).f138746m;
                if (bpqs3 == null) {
                    bpqs3 = bpqs.f138781e;
                }
                bxvd bxvd3 = (bxvd) bpqs3.mo74142c(5);
                bxvd3.mo73625a((bxvk) bpqs3);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bpqs bpqs4 = (bpqs) bxvd3.f164949b;
                bpqs4.f138785c = 0;
                bpqs4.f138783a |= 2;
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpqk bpqk4 = (bpqk) bxvd2.f164949b;
                bpqs bpqs5 = (bpqs) bxvd3.mo74062i();
                bpqs5.getClass();
                bpqk4.f138746m = bpqs5;
                bpqk4.f138734a |= 1024;
            }
            this.f120405b.mo64139a(bhqq.m101346a((bpqk) bxvd2.mo74062i()));
        }
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        m102160a(context, placesParams, this.f120406c, this.f120407d, (int) cggm.f186849a.mo6606a().mo83723b(), System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        bioc.m102646a(status.f30115i, Collections.emptyList(), 106, this.f120407d);
    }
}
