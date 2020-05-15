package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.NetworkKey;
import android.net.Uri;
import android.net.WifiKey;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.ParseError;
import com.android.volley.RequestQueue;
import com.android.volley.ServerError;
import com.android.volley.toolbox.RequestFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: akmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmf {

    /* renamed from: a */
    public final Context f72247a;

    /* renamed from: b */
    public final akmy f72248b;

    /* renamed from: c */
    private final akjy f72249c;

    /* renamed from: d */
    private final akmg f72250d;

    /* renamed from: e */
    private final RequestFuture f72251e;

    /* renamed from: f */
    private final RequestQueue f72252f;

    public akmf(Context context, akmy akmy, akjy akjy, akmg akmg, RequestFuture requestFuture, RequestQueue requestQueue) {
        this.f72247a = context;
        this.f72248b = akmy;
        this.f72249c = akjy;
        this.f72250d = akmg;
        this.f72251e = requestFuture;
        this.f72252f = requestQueue;
    }

    /* renamed from: a */
    private static void m60000a() {
        akka.f72127b.mo10352a(Long.valueOf(SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(cfpd.f185332a.mo6606a().mo82417A())));
    }

    /* renamed from: b */
    private final int m60001b(String str) {
        if ("rapid_refresh_scores_task".equals(str)) {
            if (cfps.f185410a.mo6606a().mo82481a()) {
                new Object[1][0] = str;
                int i = eoa.f15378a;
                aknf.m60075a("ScoresRefreshedRapidFailureDropped");
                return 2;
            } else if (cfps.f185410a.mo6606a().mo82482b()) {
                eoa.m10826b("NetRec", "Will retry failed %s task as standard refresh.", str);
                aknf.m60075a("ScoresRefreshedRapidFailureConverted");
                new akme(this.f72247a).mo39555b();
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final int mo39556a(String str) {
        akjw akjw;
        int b;
        sdo.m34973b("Cannot be called from the main thread.");
        try {
            int w = (int) cfpd.f185332a.mo6606a().mo82458w();
            List a = this.f72248b.mo39570a(w);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < a.size(); i++) {
                NetworkKey networkKey = (NetworkKey) a.get(i);
                bxvd da = akkp.f72169e.mo74144da();
                String str2 = networkKey.wifiKey.ssid;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                akkp akkp = (akkp) da.f164949b;
                str2.getClass();
                akkp.f72171a |= 1;
                akkp.f72172b = str2;
                String str3 = networkKey.wifiKey.bssid;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                akkp akkp2 = (akkp) da.f164949b;
                str3.getClass();
                akkp2.f72171a = 2 | akkp2.f72171a;
                akkp2.f72173c = str3;
                arrayList.add((akkp) da.mo74062i());
            }
            if (a.size() == w) {
                new Object[1][0] = Integer.valueOf(arrayList.size());
                int i2 = eoa.f15378a;
            }
            if (arrayList.isEmpty()) {
                int i3 = eoa.f15378a;
                return 0;
            }
            eoa.m10826b("NetRec", "Refreshing scores for %d networks.", Integer.valueOf(arrayList.size()));
            aknf.m60079b(19);
            akjy akjy = this.f72249c;
            RequestFuture requestFuture = this.f72251e;
            bxvd da2 = cafb.f172878f.mo74144da();
            TelephonyManager telephonyManager = (TelephonyManager) akjy.f72125b.getSystemService("phone");
            if (telephonyManager.getSimState() == 5) {
                String simOperator = telephonyManager.getSimOperator();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cafb cafb = (cafb) da2.f164949b;
                simOperator.getClass();
                cafb.f172880a |= 1;
                cafb.f172882c = simOperator;
            }
            caey a2 = akmj.m60011a((String) akka.f72133h.mo10351a());
            if (akmj.m60013a(a2)) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cafb cafb2 = (cafb) da2.f164949b;
                a2.getClass();
                if (!cafb2.f172884e.mo73666a()) {
                    cafb2.f172884e = GeneratedMessageLite.m124021a(cafb2.f172884e);
                }
                cafb2.f172884e.add(a2);
            }
            bngx bngx = akjy.f72124a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cafb cafb3 = (cafb) da2.f164949b;
            if (!cafb3.f172883d.mo73666a()) {
                cafb3.f172883d = GeneratedMessageLite.m124019a(cafb3.f172883d);
            }
            int size = bngx.size();
            for (int i4 = 0; i4 < size; i4++) {
                cafb3.f172883d.mo74153d(((caev) bngx.get(i4)).f172865d);
            }
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                akkp akkp3 = (akkp) arrayList.get(i5);
                bxvd da3 = cafh.f172902d.mo74144da();
                String b2 = akmk.m60017b(akkp3.f72172b, stm.m36299a(akkp3.f72173c));
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cafh cafh = (cafh) da3.f164949b;
                b2.getClass();
                cafh.f172904a |= 1;
                cafh.f172905b = b2;
                if (cfpe.f185334a.mo6606a().mo82410b()) {
                    String c = akmk.m60019c(akkp3.f72172b);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cafh cafh2 = (cafh) da3.f164949b;
                    c.getClass();
                    cafh2.f172904a |= 2;
                    cafh2.f172906c = c;
                }
                hashMap.put(((cafh) da3.f164949b).f172905b, akkp3);
                arrayList2.add((cafh) da3.mo74062i());
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cafb cafb4 = (cafb) da2.f164949b;
            if (!cafb4.f172881b.mo73666a()) {
                cafb4.f172881b = GeneratedMessageLite.m124021a(cafb4.f172881b);
            }
            bxsy.m123078a(arrayList2, cafb4.f172881b);
            if (cfpp.f185406a.mo6606a().mo82478a()) {
                akjw = new akjw(hashMap, requestFuture);
            } else {
                akjw = new akjx(hashMap, requestFuture, arrayList);
            }
            rpr b3 = rpr.m34216b();
            cafb cafb5 = (cafb) da2.mo74062i();
            String uri = Uri.withAppendedPath(Uri.parse(cfpd.f185332a.mo6606a().mo82423G()), cfpe.f185334a.mo6606a().mo82412d()).toString();
            new Object[1][0] = uri;
            akjq akjq = new akjq(b3, uri, akjw, requestFuture, cafb5);
            if (cfpe.m142372b()) {
                akjq.mo39510a((akjr) new akjv(b3));
                akjr a3 = akju.m59900a(b3);
                if (a3 != null) {
                    akjq.mo39510a(a3);
                }
            }
            akjq.setTag("quality_tag");
            rpr.m34216b().getRequestQueue().add(akjq);
            qxo a4 = aknf.m60073a().mo24389f("GetNetworkQuality").mo24372a();
            try {
                Collection<akkp> collection = (Collection) this.f72251e.get(cfpe.m142373c() + 200, TimeUnit.MILLISECONDS);
                a4.mo24371b();
                aknf.m60079b(20);
                m60000a();
                try {
                    this.f72248b.mo39568a(collection, 3);
                    this.f72248b.mo39576a(arrayList);
                    NetworkKey[] networkKeyArr = new NetworkKey[collection.size()];
                    int i6 = 0;
                    for (akkp akkp4 : collection) {
                        networkKeyArr[i6] = new NetworkKey(new WifiKey(akkp4.f72172b, akkp4.f72173c));
                        i6++;
                    }
                    this.f72250d.mo39557a(networkKeyArr);
                    aknf.m60076a("ScoresRefreshed", arrayList.size());
                    return 0;
                } catch (SQLiteException e) {
                    eoa.m10825a("NetRec", e, "Database update failed after fetching scores.", new Object[0]);
                    return 0;
                }
            } catch (InterruptedException e2) {
                akjy.m59904a(this.f72252f);
                Thread.currentThread().interrupt();
                b = m60001b(str);
                eoa.m10828c("NetRec", "Unexpected interruption while waiting for score updates. Returning %d.", Integer.valueOf(b));
                m60000a();
                return b;
            } catch (ExecutionException e3) {
                int b4 = m60001b(str);
                eoa.m10828c("NetRec", "Unexpected exception %s while waiting for score updates (%s). Returning %d.", e3.getCause(), e3.getMessage(), Integer.valueOf(b4));
                Throwable cause = !cfpp.f185406a.mo6606a().mo82479b() ? e3.getCause() : bmzo.m108688b(e3);
                if (cause instanceof AuthFailureError) {
                    aknf.m60079b(26);
                } else if (cause instanceof ClientError) {
                    aknf.m60079b(27);
                } else if (cause instanceof NetworkError) {
                    aknf.m60079b(28);
                } else if (cause instanceof ParseError) {
                    aknf.m60079b(29);
                } else if (!(cause instanceof ServerError)) {
                    aknf.m60079b(21);
                } else {
                    aknf.m60079b(30);
                }
                m60000a();
                return b4;
            } catch (TimeoutException e4) {
                b = m60001b(str);
                eoa.m10828c("NetRec", "Timeout after %d ms while waiting for score updates. Returning %d.", Long.valueOf(a4.mo24370a()), Integer.valueOf(b));
                aknf.m60079b(33);
                m60000a();
                return b;
            } catch (Throwable th) {
                m60000a();
                throw th;
            }
        } catch (SQLiteException e5) {
            eoa.m10825a("NetRec", e5, "Failed to select bssidsToUpdate to update.", new Object[0]);
            throw new ExecutionException(e5);
        } catch (ExecutionException e6) {
            int b5 = m60001b(str);
            eoa.m10827b("NetRec", e6, "Failed to query networks to update; returning %d.", Integer.valueOf(b5));
            return b5;
        }
    }
}
