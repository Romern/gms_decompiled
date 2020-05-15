package com.google.android.gms.ads.internal.httpcache;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.request.LargeParcelTeleporter;
import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0648g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.internal.httpcache.n */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0441n implements Network {

    /* renamed from: a */
    public volatile C0428a f8401a;

    /* renamed from: b */
    private final Context f8402b;

    public C0441n(Context context) {
        this.f8402b = context;
    }

    public final NetworkResponse performRequest(Request request) {
        Map headers = request.getHeaders();
        int size = headers.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : headers.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        HttpRequestParcel httpRequestParcel = new HttpRequestParcel(request.getUrl(), strArr, strArr2);
        long b = C0387d.m5368f().mo20506b();
        try {
            C0648g gVar = new C0648g();
            this.f8401a = new C0428a(this.f8402b, C0387d.m5371i().mo6792a(), new C0439l(this, gVar), new C0440m(gVar));
            this.f8401a.mo25308x();
            bqgg a = bqga.m112773a(bqdx.m112674a(gVar, new C0437j(httpRequestParcel), C0645d.f8973a), (long) ((Integer) C0371o.f8233ak.mo6604a()).intValue(), TimeUnit.MILLISECONDS, C0645d.f8975c);
            a.mo741a(new C0438k(this), C0645d.f8973a);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) a.get();
            long b2 = C0387d.m5368f().mo20506b();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Http assets remote cache took ");
            sb.append(b2 - b);
            sb.append("ms");
            sb.toString();
            HttpResponseParcel httpResponseParcel = (HttpResponseParcel) new LargeParcelTeleporter(parcelFileDescriptor).mo6718a(HttpResponseParcel.CREATOR);
            if (httpResponseParcel == null) {
                return null;
            }
            if (httpResponseParcel.f8387a) {
                throw new VolleyError(httpResponseParcel.f8388b);
            } else if (httpResponseParcel.f8391e.length != httpResponseParcel.f8392f.length) {
                return null;
            } else {
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = httpResponseParcel.f8391e;
                    if (i >= strArr3.length) {
                        return new NetworkResponse(httpResponseParcel.f8389c, httpResponseParcel.f8390d, hashMap, httpResponseParcel.f8393g, httpResponseParcel.f8394h);
                    }
                    hashMap.put(strArr3[i], httpResponseParcel.f8392f[i]);
                    i++;
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            long b3 = C0387d.m5368f().mo20506b();
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(b3 - b);
            sb2.append("ms");
            sb2.toString();
            return null;
        } catch (Throwable th) {
            long b4 = C0387d.m5368f().mo20506b();
            StringBuilder sb3 = new StringBuilder(52);
            sb3.append("Http assets remote cache took ");
            sb3.append(b4 - b);
            sb3.append("ms");
            sb3.toString();
            throw th;
        }
    }
}
