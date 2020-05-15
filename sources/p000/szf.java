package p000;

import android.content.ContentValues;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkSpecifier;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.common.stats.radio.NetworkLatencyContract;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: szf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class szf extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ szg f45484a;

    public szf(szg szg) {
        this.f45484a = szg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    public final void onAvailable(Network network) {
        ConnectivityManager connectivityManager;
        int i;
        Network[] networkArr;
        int i2;
        boolean z;
        szg.f45485a.mo25412b("New network available: %s", network);
        bxyk a = tdo.m36764a(System.currentTimeMillis());
        boolean b = szn.m36663b(rpr.m34216b());
        boolean a2 = szn.m36661a(rpr.m34216b());
        boolean z2 = Settings.Global.getInt(rpr.m34216b().getContentResolver(), "mobile_data_always_on", 0) != 0;
        ConnectivityManager connectivityManager2 = (ConnectivityManager) rpr.m34216b().getSystemService("connectivity");
        Network[] allNetworks = connectivityManager2.getAllNetworks();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        int length = allNetworks.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            Network network2 = allNetworks[i3];
            NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network2);
            if (networkCapabilities == null) {
                connectivityManager = connectivityManager2;
                networkArr = allNetworks;
                i = length;
            } else {
                connectivityManager = connectivityManager2;
                if (networkCapabilities.hasTransport(0)) {
                    bxvd da = cbow.f177871c.mo74144da();
                    ArrayList arrayList = new ArrayList();
                    networkArr = allNetworks;
                    int i4 = 0;
                    while (true) {
                        i = length;
                        if (i4 > 22) {
                            break;
                        }
                        if (networkCapabilities.hasCapability(i4)) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                        i4++;
                        length = i;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cbow cbow = (cbow) da.f164949b;
                    if (!cbow.f177873a.mo73666a()) {
                        cbow.f177873a = bxvk.m124019a(cbow.f177873a);
                    }
                    bxsy.m123078a(arrayList, cbow.f177873a);
                    rpr.m34216b();
                    try {
                        Method declaredMethod = NetworkCapabilities.class.getDeclaredMethod("getNetworkSpecifier", new Class[0]);
                        declaredMethod.setAccessible(true);
                        int i5 = Build.VERSION.SDK_INT;
                        i2 = Integer.parseInt(((NetworkSpecifier) declaredMethod.invoke(networkCapabilities, new Object[0])).toString());
                    } catch (Exception e) {
                        i2 = -1;
                    }
                    Integer valueOf = Integer.valueOf(i2);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, new ArrayList());
                    }
                    if (networkCapabilities.hasCapability(12)) {
                        NetworkCapabilities networkCapabilities2 = ((ConnectivityManager) rpr.m34216b().getSystemService("connectivity")).getNetworkCapabilities(network2);
                        if (networkCapabilities2 == null || !networkCapabilities2.hasCapability(12)) {
                            z = false;
                        } else {
                            try {
                                HttpURLConnection httpURLConnection = (HttpURLConnection) network2.openConnection(new URL("https://www.gstatic.com/generate_204"));
                                httpURLConnection.connect();
                                z = httpURLConnection.getResponseCode() == 204;
                            } catch (IOException e2) {
                                z = false;
                            }
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((cbow) da.f164949b).f177874b = z;
                        hashSet.add(Integer.valueOf(i2));
                    }
                    Integer valueOf2 = Integer.valueOf(i2);
                    ((List) hashMap.get(valueOf2)).add((cbow) da.mo74062i());
                    szg.f45485a.mo25412b("Processed network %s for subId %d", network2, valueOf2);
                } else {
                    networkArr = allNetworks;
                    i = length;
                    if (networkCapabilities.hasTransport(1)) {
                        z3 = true;
                    }
                }
            }
            i3++;
            connectivityManager2 = connectivityManager;
            allNetworks = networkArr;
            length = i;
        }
        for (Integer num : hashMap.keySet()) {
            bxvd da2 = cbox.f177875g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbox cbox = (cbox) da2.f164949b;
            a.getClass();
            cbox.f177877a = a;
            cbox.f177878b = b;
            cbox.f177879c = a2;
            cbox.f177880d = z2;
            cbox.f177881e = z3;
            Iterable iterable = (Iterable) hashMap.get(num);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbox cbox2 = (cbox) da2.f164949b;
            if (!cbox2.f177882f.mo73666a()) {
                cbox2.f177882f = bxvk.m124021a(cbox2.f177882f);
            }
            bxsy.m123078a(iterable, cbox2.f177882f);
            cbox cbox3 = (cbox) da2.mo74062i();
            szr.m36692a();
            int intValue = num.intValue();
            boolean contains = hashSet.contains(num);
            szr.f45526a.mo25409a("Saving a CellularNetworkEvent", new Object[0]);
            ContentValues contentValues = new ContentValues();
            contentValues.put("subscription_id", Integer.valueOf(intValue));
            bxyk bxyk = cbox3.f177877a;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
            contentValues.put("event_time", Long.valueOf(tdo.m36763a(bxyk)));
            contentValues.put("event_type", (Integer) 1);
            contentValues.put(NetworkLatencyContract.NetworkLatencyColumns.SUCCESSFUL, Integer.valueOf(contains ? 1 : 0));
            contentValues.put("event_proto", cbox3.mo73642k());
            szr.m36693a(contentValues);
        }
        if (hashSet.isEmpty()) {
            szg szg = this.f45484a;
            int i6 = szg.f45489d + 1;
            szg.f45489d = i6;
            if (i6 >= szg.f45487b) {
                szg.f45485a.mo25412b("Reached maximum number of events (%d). Will stop listening.", Integer.valueOf(this.f45484a.f45487b));
                this.f45484a.mo26268c();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            szg szg2 = this.f45484a;
            if (currentTimeMillis / 1000 > szg2.f45490e + szg2.f45488c) {
                szg.f45485a.mo25412b("Reached maximum listening time (%ds). Will stop listening.", Long.valueOf(this.f45484a.f45488c));
                this.f45484a.mo26268c();
                return;
            }
            return;
        }
        szg.f45485a.mo25412b("Google is reachable. Will stop listening.", new Object[0]);
        this.f45484a.mo26268c();
    }
}
