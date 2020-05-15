package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.UploadDataProvider;

/* renamed from: augu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class augu extends auft {

    /* renamed from: d */
    private static final DecimalFormat f91791d = new DecimalFormat("0.#######", DecimalFormatSymbols.getInstance(Locale.ROOT));

    /* renamed from: a */
    final URL f91792a;

    /* renamed from: b */
    final boolean f91793b;

    /* renamed from: c */
    final byte[] f91794c;

    public augu(URL url, boolean z, byte[] bArr) {
        this.f91792a = url;
        this.f91793b = z;
        this.f91794c = bArr;
    }

    /* renamed from: a */
    public static augu m77041a(aufk aufk) {
        int a = aufj.m76984a(aufk.f91687b);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        if (a != 2) {
            z = false;
        }
        bmxy.m108588a(z);
        return new augu(new URL(aufk.f91689d), aufk.f91688c, aufk.f91692g.mo73780k());
    }

    /* renamed from: a */
    public final String mo50499a() {
        return "GoogleHttpQueryReporter";
    }

    /* renamed from: b */
    public final aufk mo50500b() {
        bxvd da = aufk.f91684h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aufk aufk = (aufk) da.f164949b;
        aufk.f91687b = 1;
        aufk.f91686a = 1 | aufk.f91686a;
        String externalForm = this.f91792a.toExternalForm();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aufk aufk2 = (aufk) da.f164949b;
        externalForm.getClass();
        int i = aufk2.f91686a | 4;
        aufk2.f91686a = i;
        aufk2.f91689d = externalForm;
        boolean z = this.f91793b;
        aufk2.f91686a = i | 2;
        aufk2.f91688c = z;
        bxtx a = bxtx.m123261a(this.f91794c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aufk aufk3 = (aufk) da.f164949b;
        a.getClass();
        aufk3.f91686a |= 32;
        aufk3.f91692g = a;
        return (aufk) da.mo74062i();
    }

    /* renamed from: c */
    public final int mo50501c() {
        return 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleHttpQueryReporter");
        sb.append("{");
        sb.append(this.f91792a);
        if (this.f91793b) {
            sb.append(", debug");
        }
        if (this.f91794c.length > 0) {
            sb.append(", key=");
            sb.append(bnzb.m110871a(this.f91794c));
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m77042a(augv augv, EmergencyInfo emergencyInfo, aufq aufq, Location location) {
        String str;
        String str2;
        byte[] byteArray;
        StringBuilder sb = new StringBuilder();
        m77045a(sb, "v", 2);
        m77045a(sb, "thunderbird_version", 201515033);
        m77047a(sb, "emergency_number", emergencyInfo.mo59537a());
        m77047a(sb, "source", emergencyInfo.mo59538b());
        m77046a(sb, "time", emergencyInfo.mo59540d());
        if (this.f91793b) {
            m77047a(sb, "config_name", aufq.f91719a);
        }
        Location location2 = emergencyInfo.f109086a.f109076f;
        if (location2 != null) {
            m77043a(sb, "gt_location_latitude", location2.getLatitude());
            m77043a(sb, "gt_location_longitude", location2.getLongitude());
        }
        if (location != null) {
            m77043a(sb, "location_latitude", location.getLatitude());
            m77043a(sb, "location_longitude", location.getLongitude());
            m77046a(sb, "location_time", location.getTime());
            if (location.hasAltitude()) {
                m77043a(sb, "location_altitude", location.getAltitude());
            }
            if (aeim.m51904h(location)) {
                m77044a(sb, "location_vertical_accuracy", auft.m76996a(aeim.m51905i(location), aufq.f91731m));
            }
            String f = aeim.m51902f(location);
            if (f != null) {
                m77047a(sb, "location_floor", f);
            }
            if (location.hasAccuracy()) {
                m77044a(sb, "location_accuracy", auft.m76996a(location.getAccuracy(), aufq.f91731m));
            }
            if (location.hasBearing()) {
                m77044a(sb, "location_bearing", location.getBearing());
            }
            if (location.hasSpeed()) {
                m77044a(sb, "location_speed", location.getSpeed());
            }
            m77044a(sb, "location_confidence", aufq.f91731m);
            int j = aeim.m51906j(location);
            if (j != 1) {
                str2 = j != 2 ? j != 3 ? "unknown" : "wifi" : "cell";
            } else {
                str2 = "gps";
            }
            m77047a(sb, "location_source", str2);
            if (this.f91793b && aeim.m51892a(location) && (byteArray = location.getExtras().getByteArray("wifiScan")) != null) {
                WifiScan a = WifiScan.m66876a(byteArray);
                if (a.mo43592a() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i = 0; i < a.mo43592a(); i++) {
                        sb2.append(a.mo43593a(i));
                        sb2.append("=");
                        sb2.append((int) a.mo43594b(i));
                        sb2.append(",");
                    }
                    sb2.setLength(sb2.length() - 1);
                    m77047a(sb, "location_wifi_scan", sb2.toString());
                }
            }
        }
        m77047a(sb, "device_number", emergencyInfo.mo59541e().f109081e);
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
        sb3.append(str3);
        sb3.append(" ");
        sb3.append(str4);
        m77047a(sb, "device_model", sb3.toString());
        m77047a(sb, "device_imei", emergencyInfo.mo59541e().f109078b);
        m77047a(sb, "device_imsi", emergencyInfo.mo59541e().f109079c);
        m77047a(sb, "device_iccid", emergencyInfo.mo59541e().f109080d);
        if (cgyq.f188062a.mo6606a().mo84769m()) {
            m77047a(sb, "device_languages", C1188mh.m19636a(augv.getResources().getConfiguration()).mo15464b());
        }
        String str5 = emergencyInfo.mo59541e().f109083g;
        String str6 = null;
        if (str5 != null) {
            str = str5.substring(0, 3);
        } else {
            str = null;
        }
        m77047a(sb, "cell_home_mcc", str);
        String str7 = emergencyInfo.mo59541e().f109083g;
        if (str7 != null) {
            str6 = str7.substring(3);
        }
        m77047a(sb, "cell_home_mnc", str6);
        m77047a(sb, "cell_network_mcc", emergencyInfo.mo59541e().mo59530b());
        m77047a(sb, "cell_network_mnc", emergencyInfo.mo59541e().mo59531c());
        if (this.f91793b) {
            m77047a(sb, "cell_id", emergencyInfo.mo59541e().f109085i);
        }
        if (aufq.f91732n) {
            try {
                aufd aufd = (aufd) auhp.m77075a(augv).mo60776a().get(cgyq.f188062a.mo6606a().mo84765i(), TimeUnit.MILLISECONDS);
                bxvd da = auez.f91620d.mo74144da();
                for (int i2 = 0; i2 < aufd.f91635a.size(); i2++) {
                    da.mo73625a((bxvk) ((auez) aufd.f91635a.get(i2)));
                }
                auez auez = (auez) da.mo74062i();
                if ((auez.f91622a & 4) != 0) {
                    aufb aufb = auez.f91624c;
                    if (aufb == null) {
                        aufb = aufb.f91629b;
                    }
                    bxyk bxyk = aufb.f91631a;
                    if (bxyk == null) {
                        bxyk = bxyk.f165095c;
                    }
                    m77046a(sb, "adr_carcrash_time", bxzt.m124578a(bxyk));
                }
            } catch (ExecutionException | TimeoutException e) {
                auho.m77069a(augv, e);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
            }
        }
        byte[] bArr = this.f91794c;
        if (bArr.length > 0) {
            m77047a(sb, "hmac", bnzi.m110898a(bArr).mo68721a(sb.toString(), bmwy.f131158c).toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static void m77043a(StringBuilder sb, String str, double d) {
        if (Double.isNaN(d)) {
            Log.w("Thunderbird", str.length() == 0 ? new String("ignoring NaN value for key ") : "ignoring NaN value for key ".concat(str));
        } else {
            m77047a(sb, str, f91791d.format(d));
        }
    }

    /* renamed from: a */
    private static void m77044a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            Log.w("Thunderbird", str.length() == 0 ? new String("ignoring NaN value for key ") : "ignoring NaN value for key ".concat(str));
        } else {
            m77047a(sb, str, f91791d.format((double) f));
        }
    }

    /* renamed from: a */
    private static void m77045a(StringBuilder sb, String str, int i) {
        m77047a(sb, str, Integer.toString(i));
    }

    /* renamed from: a */
    private static void m77046a(StringBuilder sb, String str, long j) {
        m77047a(sb, str, Long.toString(j));
    }

    /* renamed from: a */
    private static void m77047a(StringBuilder sb, String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode(charSequence.toString(), "UTF-8"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.ExperimentalUrlRequest$Builder
     arg types: [java.lang.String, java.lang.String]
     candidates:
      org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder
      org.chromium.net.UrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.UrlRequest$Builder
      org.chromium.net.ExperimentalUrlRequest.Builder.addHeader(java.lang.String, java.lang.String):org.chromium.net.ExperimentalUrlRequest$Builder */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.ExperimentalUrlRequest$Builder
     arg types: [augp, bqgk]
     candidates:
      org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      org.chromium.net.UrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.UrlRequest$Builder
      org.chromium.net.ExperimentalUrlRequest.Builder.setUploadDataProvider(org.chromium.net.UploadDataProvider, java.util.concurrent.Executor):org.chromium.net.ExperimentalUrlRequest$Builder */
    /* renamed from: a */
    public final bqgg mo50498a(Context context, EmergencyInfo emergencyInfo, aufq aufq, Location location) {
        CronetEngine cronetEngine;
        augv a = augv.m77052a(context);
        bmxy.m108600b(emergencyInfo.f109087b.size() == 1);
        if (auho.m77070a()) {
            String valueOf = String.valueOf(this.f91792a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("sending message to HTTP endpoint: ");
            sb.append(valueOf);
            Log.d("Thunderbird", sb.toString());
        }
        try {
            String a2 = m77042a(a, emergencyInfo, aufq, location);
            augt augt = new augt(this, a);
            URL url = this.f91792a;
            byte[] bytes = a2.getBytes("UTF-8");
            bmxy.m108600b(!augt.f91788b);
            augt.f91788b = true;
            augs augs = new augs(augt);
            augv augv = augt.f91787a;
            synchronized (augv.class) {
                if (augv.f91795b == null) {
                    augv.f91795b = new CronetEngine.Builder(augv).build();
                }
                cronetEngine = augv.f91795b;
            }
            ExperimentalUrlRequest.Builder builder = (ExperimentalUrlRequest.Builder) cronetEngine.newUrlRequestBuilder(url.toString(), new augq(augs), augt.f91787a.f91796a);
            builder.setHttpMethod(DataParser.CONNECT_TYPE_POST);
            builder.addHeader("Content-Type", DataParser.CONTENT_TYPE_VALUE);
            builder.addHeader("Content-Length", Integer.toString(bytes.length));
            builder.setUploadDataProvider((UploadDataProvider) new augp(bytes), (Executor) augt.f91787a.f91796a);
            builder.setTrafficStatsTag(shr.m35311a(1543));
            builder.setPriority(4);
            augt.f91789c = builder.build();
            augt.f91789c.start();
            return bqdf.m112619a(bqga.m112773a(augs, cgyq.f188062a.mo6606a().mo84766j(), TimeUnit.MILLISECONDS, a.f91796a), TimeoutException.class, augo.f91779a, bqfb.INSTANCE);
        } catch (UnsupportedEncodingException e) {
            return bqga.m112777a((Throwable) e);
        }
    }
}
