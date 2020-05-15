package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xay {

    /* renamed from: a */
    private static final int f51832a = ((int) TimeUnit.SECONDS.toMillis(10));

    /* renamed from: b */
    private static final int f51833b = ((int) TimeUnit.SECONDS.toMillis(10));

    /* renamed from: c */
    private static final Charset f51834c = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final Logger f51835e = new Logger(new String[]{"AuthorizedFacetFetcher"}, (short[]) null);

    /* renamed from: d */
    private final xav f51836d;

    public xay(Context context) {
        this.f51836d = new xav(context);
    }

    /* renamed from: a */
    private static final String m42586a(xia xia) {
        bqbw a = bqbw.m112542a(xia.mo29780c());
        int i = a.f140445d;
        boolean z = true;
        if (i != 1) {
            if (i <= 0) {
                z = false;
            }
            bmxy.m108605b(z, "Not under a public suffix: %s", a.f140443b);
            int i2 = a.f140445d;
            bmxr bmxr = bqbw.f140436a;
            bngx bngx = a.f140444c;
            a = bqbw.m112542a(bmxr.mo66874a((Iterable) bngx.subList(i2 - 1, bngx.size())));
        }
        return a.f140443b;
    }

    /* renamed from: b */
    private static final String m42588b(xia xia) {
        try {
            return new URL(xia.mo29779b(), xia.mo29780c(), xia.f52323a.getPort(), "").toString();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static void m42587a(xwj xwj, xwg xwg, xag xag) {
        if (xwg != null) {
            xwg.mo30186a(xwj, xag);
        }
    }

    /* renamed from: a */
    public final bmxv mo29596a(xwj xwj, Set set, xbc xbc, xwg xwg) {
        Iterator it = set.iterator();
        String str = null;
        while (it.hasNext()) {
            str = mo29597a(xwj, ((Uri) it.next()).toString(), xbc, xwg);
            if (str == null) {
                return bmvz.f131120a;
            }
        }
        return bmxv.m108567c(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e A[Catch:{ SQLiteException | IOException -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e2 A[SYNTHETIC, Splitter:B:81:0x01e2] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0203 A[SYNTHETIC, Splitter:B:92:0x0203] */
    /* renamed from: a */
    public final String mo29597a(xwj xwj, String str, xbc xbc, xwg xwg) {
        String str2;
        Pair pair;
        xav xav;
        int i;
        Charset charset;
        JSONObject jSONObject;
        Cursor cursor;
        Throwable th;
        Long l;
        Throwable th2;
        Cursor cursor2;
        xwj xwj2 = xwj;
        String str3 = str;
        xbc xbc2 = xbc;
        xwg xwg2 = xwg;
        try {
            xia a = xia.m42981a(str);
            if (xbc2.f51856a == xbb.ORIGIN) {
                try {
                    xia a2 = xia.m42981a(xbc.mo29598a());
                    String b = m42588b(a2);
                    if (b.equals(m42588b(a))) {
                        m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATED_ALLOW);
                        return b;
                    } else if (!a.mo29779b().equals("https")) {
                        f51835e.mo25418e("The appId url scheme is not https: %s", str3);
                        m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATED_DENY);
                        return null;
                    } else if (m42586a(a2).equals("google.com") && m42586a(a).equals("gstatic.com")) {
                        f51835e.mo25414c("appId is %s and facetId is %s; appId is asserted", str3, xbc2);
                        m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATED_ALLOW);
                        return b;
                    } else if (!m42586a(a2).equals(m42586a(a))) {
                        f51835e.mo25418e("appId and facetId don't share the same TLD+1: %s vs %s", str3, xbc2);
                        m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATED_DENY);
                        return null;
                    }
                } catch (MalformedURLException e) {
                    m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
                    return null;
                } catch (IllegalStateException e2) {
                    m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
                    return null;
                }
            }
            try {
                xav xav2 = this.f51836d;
                xav.f51828b.mo25412b("findMatchedFacetInAppIdCache(%s, %s)", str3, xbc2);
                try {
                    xax xax = xav2.f51829a;
                    xax.f51830b.mo25412b("getExpirationTime(%s)", str3);
                    try {
                        cursor = xax.f51831a.getReadableDatabase().query("appid_expiry", new String[]{"expiry"}, "appid = ?", new String[]{str3}, null, null, null);
                        if (cursor != null) {
                            try {
                                cursor.moveToFirst();
                                if (!cursor.isAfterLast()) {
                                    l = Long.valueOf(cursor.getLong(0));
                                    cursor.close();
                                    if (l != null) {
                                        if (xav.m42577b() < l.longValue()) {
                                            xav.f51828b.mo25412b("hasAppIdCacheExpired(%s) false", str3);
                                            xax xax2 = xav2.f51829a;
                                            xax.f51830b.mo25412b("getTrustedFacets(%s)", str3);
                                            try {
                                                cursor2 = xax2.f51831a.getReadableDatabase().query("appid_facet", new String[]{"trustedfacet"}, "appid = ?", new String[]{str3}, null, null, null);
                                                try {
                                                    ArrayList arrayList = new ArrayList();
                                                    if (cursor2 != null) {
                                                        cursor2.moveToFirst();
                                                        while (!cursor2.isAfterLast()) {
                                                            arrayList.add(cursor2.getString(0));
                                                            cursor2.moveToNext();
                                                        }
                                                    }
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    if (!arrayList.isEmpty()) {
                                                        Iterator it = arrayList.iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                str2 = (String) it.next();
                                                                if (xbc2.mo29599a(xwj2, str2, xwg2)) {
                                                                    xav.f51828b.mo25412b("Facet %s is authorized by %s in the cache of AppID %s", xbc2, str2, str3);
                                                                    break;
                                                                }
                                                            } else {
                                                                xav.f51828b.mo25412b("Facet %s is NOT authorized by the cache of AppID %s", xbc2, str3);
                                                                str2 = null;
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        xav.f51828b.mo25412b("No trusted facet found in AppId cache.", new Object[0]);
                                                        str2 = null;
                                                    }
                                                    if (str2 == null) {
                                                        int i2 = 0;
                                                        while (true) {
                                                            try {
                                                                URLConnection a3 = a.mo29778a();
                                                                a3.setUseCaches(true);
                                                                a3.setConnectTimeout(f51832a);
                                                                a3.setReadTimeout(f51833b);
                                                                pair = Pair.create(a3, a3.getInputStream());
                                                                break;
                                                            } catch (IOException e3) {
                                                                IOException iOException = e3;
                                                                i2++;
                                                                if (i2 == 2) {
                                                                    Logger Logger = f51835e;
                                                                    String valueOf = String.valueOf(a);
                                                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                                                                    sb.append("Cannot fetch the facet JSON array from the app_id url: ");
                                                                    sb.append(valueOf);
                                                                    Logger.mo25417e(sb.toString(), iOException, new Object[0]);
                                                                    m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
                                                                    pair = null;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        if (pair != null) {
                                                            URLConnection uRLConnection = (URLConnection) pair.first;
                                                            InputStream inputStream = (InputStream) pair.second;
                                                            String headerField = uRLConnection.getHeaderField("Cache-Control");
                                                            if (headerField != null) {
                                                                caub caub = new caub();
                                                                caub.mo74870c("Cache-Control", headerField);
                                                                catm a4 = catm.m127180a(caub.mo74866a());
                                                                f51835e.mo25412b("AppId %s CacheControl: %s", str3, a4);
                                                                i = a4.f175842c;
                                                            } else {
                                                                i = 0;
                                                            }
                                                            try {
                                                                if (uRLConnection.getContentType() != null) {
                                                                    bqca a5 = bqca.m112550a(uRLConnection.getContentType());
                                                                    bmxv bmxv = a5.f140456d;
                                                                    if (bmxv == null) {
                                                                        bmxv = bmvz.f131120a;
                                                                        bnre i3 = a5.f140455c.mo67692g("charset").listIterator();
                                                                        String str4 = null;
                                                                        while (i3.hasNext()) {
                                                                            bnre bnre = i3;
                                                                            String str5 = (String) i3.next();
                                                                            if (str4 == null) {
                                                                                bmxv = bmxv.m108566b(Charset.forName(str5));
                                                                                str4 = str5;
                                                                            } else if (!str4.equals(str5)) {
                                                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 35 + String.valueOf(str5).length());
                                                                                sb2.append("Multiple charset values defined: ");
                                                                                sb2.append(str4);
                                                                                sb2.append(", ");
                                                                                sb2.append(str5);
                                                                                throw new IllegalStateException(sb2.toString());
                                                                            }
                                                                            i3 = bnre;
                                                                        }
                                                                        a5.f140456d = bmxv;
                                                                    }
                                                                    charset = (Charset) bmxv.mo66812a(f51834c);
                                                                } else {
                                                                    charset = f51834c;
                                                                }
                                                                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset.name());
                                                                StringBuilder sb3 = new StringBuilder();
                                                                bmxy.m108581a(inputStreamReader);
                                                                bmxy.m108581a(sb3);
                                                                char[] cArr = new char[2048];
                                                                while (true) {
                                                                    int read = inputStreamReader.read(cArr);
                                                                    if (read == -1) {
                                                                        break;
                                                                    }
                                                                    sb3.append(cArr, 0, read);
                                                                }
                                                                try {
                                                                    JSONArray jSONArray = new JSONObject(sb3.toString()).getJSONArray("trustedFacets");
                                                                    int i4 = 0;
                                                                    while (true) {
                                                                        if (i4 >= jSONArray.length()) {
                                                                            jSONObject = null;
                                                                            break;
                                                                        }
                                                                        jSONObject = jSONArray.getJSONObject(i4);
                                                                        JSONObject jSONObject2 = jSONObject.getJSONObject("version");
                                                                        int i5 = jSONObject2.getInt("major");
                                                                        int i6 = jSONObject2.getInt("minor");
                                                                        if (i5 == 1 && i6 == 0) {
                                                                            break;
                                                                        }
                                                                        i4++;
                                                                    }
                                                                    if (jSONObject != null) {
                                                                        JSONArray jSONArray2 = jSONObject.getJSONArray("ids");
                                                                        ArrayList arrayList2 = new ArrayList();
                                                                        int i7 = 0;
                                                                        while (i7 < jSONArray2.length()) {
                                                                            try {
                                                                                String string = jSONArray2.getString(i7);
                                                                                arrayList2.add(string);
                                                                                if (xbc2.mo29599a(xwj2, string, xwg2)) {
                                                                                    f51835e.mo25412b("Facet %s is authorized by %s in the cache of AppID %s", xbc2, string, str3);
                                                                                    str2 = string;
                                                                                }
                                                                                i7++;
                                                                            } catch (JSONException e4) {
                                                                                JSONException jSONException = e4;
                                                                                Logger logger2 = f51835e;
                                                                                String valueOf2 = String.valueOf(str);
                                                                                logger2.mo25417e(valueOf2.length() == 0 ? new String("Cannot parse the facet JSON from the app_id url : ") : "Cannot parse the facet JSON from the app_id url : ".concat(valueOf2), jSONException, new Object[0]);
                                                                                m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
                                                                                xav = this.f51836d;
                                                                            }
                                                                        }
                                                                        if (i > 0) {
                                                                            xav xav3 = this.f51836d;
                                                                            long j = (long) i;
                                                                            xav.f51828b.mo25412b("updateAppIdCache(%s, %s, %d)", str3, arrayList2, Long.valueOf(j));
                                                                            try {
                                                                                try {
                                                                                    xav3.f51829a.mo29593a(str3, xav.m42577b() + (j * 1000));
                                                                                    xav3.f51829a.mo29594a(str3, arrayList2);
                                                                                } catch (SQLiteException | IOException e5) {
                                                                                    Throwable th3 = e5;
                                                                                    xav.f51828b.mo25418e("Failed to update expiry and trusted facets for AppID %s ", str3, th3);
                                                                                    xwg2.mo30184a(xwj2, th3);
                                                                                }
                                                                            } catch (IOException e6) {
                                                                                IOException iOException2 = e6;
                                                                                xav.f51828b.mo25418e("Failed to get network time, fetched AppId is not updated in cache.", new Object[0]);
                                                                                xwg2.mo30184a(xwj2, iOException2);
                                                                                try {
                                                                                    xax xax3 = xav3.f51829a;
                                                                                    xax.f51830b.mo25412b("clearCacheForAppId(%s)", str3);
                                                                                    xax3.mo29592a(str3);
                                                                                    xax3.mo29595b(str3);
                                                                                } catch (SQLiteException e7) {
                                                                                    SQLiteException sQLiteException = e7;
                                                                                    xav.f51828b.mo25418e("Failed to clearCacheForAppId(%s)", str3, iOException2);
                                                                                    xwg2.mo30184a(xwj2, sQLiteException);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (str2 == null) {
                                                                            f51835e.mo25418e("Unauthorized origin %s for app_id %s", xbc2, str3);
                                                                            m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATED_DENY);
                                                                            xav = this.f51836d;
                                                                        }
                                                                    } else {
                                                                        throw new JSONException("No matching version found");
                                                                    }
                                                                } catch (JSONException e8) {
                                                                    JSONException jSONException2 = e8;
                                                                    Logger logger3 = f51835e;
                                                                    String valueOf3 = String.valueOf(str);
                                                                    logger3.mo25417e(valueOf3.length() == 0 ? new String("Cannot parse the facet JSON from the app_id url : ") : "Cannot parse the facet JSON from the app_id url : ".concat(valueOf3), jSONException2, new Object[0]);
                                                                    m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
                                                                    xav = this.f51836d;
                                                                }
                                                            } catch (IOException e9) {
                                                                IOException iOException3 = e9;
                                                                Logger logger4 = f51835e;
                                                                String valueOf4 = String.valueOf(str);
                                                                logger4.mo25417e(valueOf4.length() == 0 ? new String("Cannot parse the facet JSON array from the app_id url : ") : "Cannot parse the facet JSON array from the app_id url : ".concat(valueOf4), iOException3, new Object[0]);
                                                                m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
                                                                xav = this.f51836d;
                                                            }
                                                        } else {
                                                            xav = this.f51836d;
                                                        }
                                                        xav.mo29590a();
                                                        return null;
                                                    }
                                                    this.f51836d.mo29590a();
                                                    return str2;
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable th5) {
                                                th2 = th5;
                                                cursor2 = null;
                                                if (cursor2 != null) {
                                                }
                                                throw th2;
                                            }
                                        }
                                        xav.f51828b.mo25412b("hasAppIdCacheExpired(%s) true", str3);
                                    }
                                    xav.f51828b.mo25412b("FacetId is not authorized by AppId cache, as AppId cache has expired.", new Object[0]);
                                    str2 = null;
                                    if (str2 == null) {
                                    }
                                    this.f51836d.mo29590a();
                                    return str2;
                                }
                                cursor.close();
                            } catch (Throwable th6) {
                                th = th6;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        l = null;
                        if (l != null) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteException | IOException e10) {
                    Throwable th8 = e10;
                    xav.f51828b.mo25418e("hasAppIdCacheExpired(%s)", str3, th8);
                    xwg2.mo30184a(xwj2, th8);
                }
                xav.f51828b.mo25412b("FacetId is not authorized by AppId cache, as AppId cache has expired.", new Object[0]);
                str2 = null;
            } catch (SQLiteException e11) {
                SQLiteException sQLiteException2 = e11;
                xav.f51828b.mo25418e("findMatchedFacetInAppIdCache(%s, %s)", str3, xbc2, sQLiteException2);
                xwg2.mo30184a(xwj2, sQLiteException2);
                str2 = null;
            } catch (Throwable th9) {
                Throwable th10 = th9;
                this.f51836d.mo29590a();
                throw th10;
            }
            if (str2 == null) {
            }
            this.f51836d.mo29590a();
            return str2;
        } catch (MalformedURLException e12) {
            f51835e.mo25418e("The app_id url is malformed: %s", str3, e12);
            m42587a(xwj2, xwg2, xag.TYPE_APPID_VALIDATION_FAILED);
            return null;
        }
    }
}
