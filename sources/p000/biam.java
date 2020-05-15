package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* renamed from: biam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biam {

    /* renamed from: a */
    public final Context f120053a;

    /* renamed from: b */
    public final ClientContext f120054b;

    /* renamed from: c */
    public final String f120055c;

    /* renamed from: d */
    public final String f120056d;

    /* renamed from: e */
    public final sgv f120057e;

    /* renamed from: f */
    private final bhpt f120058f;

    public biam(Context context, String str, ClientContext clientContext, String str2, String str3, bhpt bhpt) {
        sgv sgv = new sgv(context, cggs.f186898a.mo6606a().mo83763g(), cggs.f186898a.mo6606a().mo83757a(), cggs.f186898a.mo6606a().mo83761e(), cggs.f186898a.mo6606a().mo83764h(), cggs.f186898a.mo6606a().mo83758b(), cggs.f186898a.mo6606a().mo83760d(), str);
        this.f120053a = context;
        this.f120054b = clientContext;
        this.f120055c = str2;
        this.f120056d = str3;
        this.f120058f = bhpt;
        this.f120057e = sgv;
        sgv.f44447g = 10240;
    }

    /* renamed from: a */
    public static int m101858a(VolleyError volleyError) {
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            return 7;
        }
        if (networkResponse.statusCode == 404) {
            return 8;
        }
        String a = sil.m35352a(volleyError);
        if ("dailyLimitExceededUnreg".equals(a) || "keyInvalid".equals(a)) {
            if (!Log.isLoggable("Places", 6)) {
                return 9002;
            }
            Log.e("Places", "Invalid API key.  Check that <meta-data android:name=\"com.google.android.geo.API_KEY\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml. See https://developers.google.com/places/android/start#api-key for more details.");
            return 9002;
        } else if ("keyExpired".equals(a)) {
            return 9007;
        } else {
            if ("accessNotConfigured".equals(a)) {
                if (!Log.isLoggable("Places", 6)) {
                    return 9003;
                }
                Log.e("Places", "Places API for Android does not seem to be enabled for your app. See https://developers.google.com/places/android/signup for more details.");
                return 9003;
            } else if ("rateLimitExceeded".equals(a)) {
                return 9005;
            } else {
                if ("limitExceeded".equals(a) || "dailyLimitExceeded".equals(a)) {
                    return 9001;
                }
                if ("ipRefererBlocked".equals(a)) {
                    return 9008;
                }
                sij b = sil.m35354b(volleyError, "Places");
                if (b == null || (str = (String) b.f44540b.get("domain")) == null) {
                    return 13;
                }
                if (((str.hashCode() == 696981785 && str.equals("usageLimits")) ? (char) 0 : 65535) != 0) {
                    return 13;
                }
                return 9001;
            }
        }
    }

    /* renamed from: a */
    public static biam m101859a(Context context, PlacesParams placesParams, bhpt bhpt) {
        ClientContext clientContext = new ClientContext();
        String str = placesParams.f79572b;
        clientContext.f30215e = str;
        clientContext.f30216f = str;
        clientContext.mo17806d(cggs.m145359b());
        clientContext.f30212b = spn.m35897i(context, placesParams.f79572b);
        if (!TextUtils.isEmpty(placesParams.f79574d)) {
            Account account = new Account(placesParams.f79574d, "com.google");
            clientContext.f30214d = account;
            clientContext.f30213c = account;
        }
        return new biam(context, spn.m35849a(context, placesParams.f79572b, "com.google.android.geo.API_KEY"), clientContext, placesParams.f79572b, spn.m35895h(context, placesParams.f79572b), bhpt);
    }

    /* renamed from: a */
    public final Status mo64491a(String str, PlacesParams placesParams) {
        sgv sgv = this.f120057e;
        Context context = this.f120053a;
        bxvd da = bvlq.f156585c.mo74144da();
        bvov a = bian.m101870a(context, placesParams);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvlq bvlq = (bvlq) da.f164949b;
        a.getClass();
        bvlq.f156588b = a;
        bvlq.f156587a |= 1;
        bvlr bvlr = (bvlr) sgv.mo25517a(str, ((bvlq) da.mo74062i()).serializeToBytes(), bvlr.f156589b, this.f120055c, this.f120056d, cggs.m145360c(), 10268);
        Context context2 = this.f120053a;
        if (bvlr == null) {
            return aemj.m52157b(13);
        }
        bvow bvow = bvlr.f156591a;
        if (bvow == null) {
            bvow = bvow.f157230c;
        }
        bian.m101877a(context2, bvow);
        return aemj.m52157b(0);
    }

    /* renamed from: a */
    public final Object mo64492a(bibp bibp, PlacesParams placesParams) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Object a = bibp.mo64507a();
            if (cgfl.m145007c()) {
                this.f120058f.mo64139a(bibp.mo64506a(2, currentTimeMillis, placesParams, a));
            }
            return a;
        } catch (TimeoutException e) {
            if (cgfl.m145007c()) {
                this.f120058f.mo64139a(bibp.mo64506a(3, currentTimeMillis, placesParams, (Object) null));
            }
            throw e;
        } catch (VolleyError | gid e2) {
            Throwable th = e2;
            if (cgfl.m145007c()) {
                this.f120058f.mo64139a(bibp.mo64506a(4, currentTimeMillis, placesParams, (Object) null));
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final List mo64493a(PlacesParams placesParams) {
        return bian.m101875a(this.f120053a, (bvmb) mo64492a(new bibj(this.f120057e, this.f120053a, this.f120054b, "getAliases", placesParams), placesParams));
    }

    /* renamed from: a */
    public final List mo64494a(LatLng latLng, int i, boolean z, PlacesParams placesParams, PlaceFilter placeFilter) {
        float f;
        PlaceFilter placeFilter2 = placeFilter;
        bvly bvly = (bvly) mo64492a(new bibe(this.f120057e, this.f120053a, this.f120054b, this.f120055c, this.f120056d, latLng, i, z, "estimatePlacesByLocation", placesParams), placesParams);
        Context context = this.f120053a;
        if (bvly == null || bvly.f156623b.size() == 0) {
            return new ArrayList();
        }
        bvow bvow = bvly.f156622a;
        if (bvow == null) {
            bvow = bvow.f157230c;
        }
        bian.m101877a(context, bvow);
        ArrayList arrayList = new ArrayList(bvly.f156623b.size());
        bxwc bxwc = bvly.f156623b;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            bvof bvof = (bvof) bxwc.get(i2);
            PlaceLikelihoodEntity placeLikelihoodEntity = null;
            if ((bvof.f157027a & 1) != 0) {
                bvmv bvmv = bvof.f157028b;
                if (bvmv == null) {
                    bvmv = bvmv.f156798q;
                }
                PlaceEntity a = bian.m101872a(bvmv);
                if (a != null) {
                    if ((bvof.f157027a & 2) != 0) {
                        f = bvof.f157029c;
                    } else {
                        f = 0.0f;
                    }
                    placeLikelihoodEntity = PlaceLikelihoodEntity.m66960a(a, f);
                }
            }
            if (placeLikelihoodEntity != null) {
                arrayList.add(placeLikelihoodEntity);
            }
        }
        if (placeFilter2 == null) {
            return arrayList;
        }
        PlaceFilter placeFilter3 = new PlaceFilter(placeFilter2.f79477e, placeFilter2.f79474b, placeFilter2.f79479g, placeFilter2.f79478f);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            PlaceLikelihoodEntity placeLikelihoodEntity2 = (PlaceLikelihoodEntity) arrayList.get(i3);
            if (placeFilter3.mo43626a(placeLikelihoodEntity2.f79558a)) {
                arrayList2.add(placeLikelihoodEntity2);
            }
        }
        return arrayList2;
    }
}
