package p000;

import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.NetworkKey;
import android.net.WifiKey;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: aklz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ akma f72230a;

    /* renamed from: b */
    private final NetworkKey[] f72231b;

    /* renamed from: c */
    private final PendingIntent f72232c;

    public aklz(akma akma, NetworkKey[] networkKeyArr, PendingIntent pendingIntent) {
        this.f72230a = akma;
        this.f72231b = networkKeyArr;
        this.f72232c = pendingIntent;
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
    public final void run() {
        int length;
        SQLiteDatabase a;
        Set set;
        String b;
        List<ScanResult> list;
        WifiKey wifiKey;
        NetworkKey networkKey;
        boolean z;
        if (cfpd.m142364d()) {
            NetworkKey[] networkKeyArr = this.f72231b;
            if (networkKeyArr == null || (length = networkKeyArr.length) == 0) {
                eoa.m10829d("NetRec", "NULL or empty NetworkKey array provided, not scheduling fetch.", new Object[0]);
                return;
            }
            new Object[1][0] = Integer.valueOf(length);
            int i = eoa.f15378a;
            NetworkKey[] networkKeyArr2 = this.f72231b;
            akmb akmb = this.f72230a.f72236d;
            ArrayList arrayList = new ArrayList();
            Map map = null;
            if (cfpd.f185332a.mo6606a().mo82424H()) {
                Context context = akmb.f72239a;
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (akmi.m60010b(context)) {
                    try {
                        list = wifiManager.getScanResults();
                    } catch (SecurityException e) {
                        eoa.m10827b("NetRec", e, "No permission to get scan results", new Object[0]);
                        list = null;
                    } catch (RuntimeException e2) {
                        RuntimeException runtimeException = e2;
                        if (RuntimeException.class.getName().equals(runtimeException.getClass().getName())) {
                            aknf.m60075a("WifiManagerRte");
                            list = null;
                        } else {
                            throw runtimeException;
                        }
                    }
                } else {
                    list = null;
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        ScanResult scanResult = list.get(i2);
                        if (scanResult != null) {
                            try {
                                wifiKey = new WifiKey(aknk.m60086a(scanResult.SSID), scanResult.BSSID);
                            } catch (IllegalArgumentException | NullPointerException e3) {
                                eoa.m10825a("NetRec", e3, "Couldn't make a wifi key from %s/%s", eoa.m10821a(scanResult.SSID, cfpd.m142365e()), eoa.m10821a(scanResult.BSSID, cfpd.m142365e()));
                                wifiKey = null;
                            }
                        } else {
                            eoa.m10824a("NetRec", "Couldn't create WifiKey, provided scan result is null.", new Object[0]);
                            wifiKey = null;
                        }
                        if (wifiKey != null) {
                            networkKey = new NetworkKey(wifiKey);
                        } else {
                            networkKey = null;
                        }
                        if (networkKey != null) {
                            if (scanResult.capabilities.contains("WEP") || scanResult.capabilities.contains("PSK")) {
                                z = false;
                            } else if (scanResult.capabilities.contains("EAP")) {
                                z = false;
                            } else {
                                z = true;
                            }
                            hashMap.put(networkKey, Boolean.valueOf(z));
                        }
                    }
                    map = hashMap;
                } else {
                    map = Collections.emptyMap();
                }
            }
            for (NetworkKey networkKey2 : networkKeyArr2) {
                if (!TextUtils.isEmpty(akng.m60080a(networkKey2)) && (map == null || ((!map.containsKey(networkKey2) || ((Boolean) map.get(networkKey2)).booleanValue()) && ((b = aknk.m60088b(akng.m60080a(networkKey2))) == null || !b.endsWith("_nomap"))))) {
                    arrayList.add(networkKey2);
                }
            }
            int length2 = networkKeyArr2.length;
            Object[] objArr = {Integer.valueOf(arrayList.size()), Integer.valueOf(length2)};
            if (arrayList.size() != length2) {
                networkKeyArr2 = (NetworkKey[]) arrayList.toArray(new NetworkKey[arrayList.size()]);
            }
            int length3 = networkKeyArr2.length;
            if (length3 != 0) {
                Integer valueOf = Integer.valueOf(length3);
                new Object[1][0] = valueOf;
                try {
                    akmy akmy = this.f72230a.f72234b;
                    a = akmy.mo39569a();
                    if (a != null) {
                        a.beginTransaction();
                        akmy.m60049c(a);
                        int b2 = akmy.m60048b(a);
                        if (b2 + length3 > akmy.f72279b) {
                            int i3 = akmy.f72280c - length3;
                            if (i3 < 0) {
                                new Object[1][0] = valueOf;
                                i3 = 0;
                            }
                            int i4 = b2 - i3;
                            while (i4 > 0) {
                                int min = Math.min(i4, 100);
                                StringBuilder sb = new StringBuilder(76);
                                sb.append("SELECT rowid FROM network ORDER BY requested_timestamp ASC LIMIT ");
                                sb.append(min);
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 37);
                                sb3.append("DELETE FROM network WHERE rowid IN (");
                                sb3.append(sb2);
                                sb3.append(")");
                                a.execSQL(sb3.toString());
                                i4 -= min;
                            }
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        HashSet<NetworkKey> hashSet = new HashSet(Arrays.asList(networkKeyArr2));
                        List<akna> a2 = akmy.mo39573a(networkKeyArr2);
                        Date date = new Date(currentTimeMillis - TimeUnit.SECONDS.toMillis(cfpd.f185332a.mo6606a().mo82418B()));
                        for (akna akna : a2) {
                            Timestamp timestamp = akna.f72290f;
                            if (timestamp != null && timestamp.after(date)) {
                                hashSet.remove(akna.f72285a);
                            }
                        }
                        Object[] objArr2 = {Integer.valueOf(hashSet.size()), Integer.valueOf(networkKeyArr2.length)};
                        for (NetworkKey networkKey3 : hashSet) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("requested_timestamp", Long.valueOf(currentTimeMillis));
                            contentValues.put("waiting_for_update", (Integer) 1);
                            akmy.mo39567a(a, contentValues, networkKey3.wifiKey.ssid, networkKey3.wifiKey.bssid, 3);
                        }
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        set = new HashSet(Arrays.asList(networkKeyArr2));
                        set.removeAll(hashSet);
                    } else {
                        set = bnon.f131923a;
                    }
                    if (!set.isEmpty()) {
                        new Object[1][0] = Integer.valueOf(set.size());
                        this.f72230a.f72235c.mo39558a((NetworkKey[]) set.toArray(new NetworkKey[set.size()]), this.f72232c);
                    }
                    if (set.size() != networkKeyArr2.length) {
                        if (this.f72232c != null) {
                            HashSet<NetworkKey> hashSet2 = new HashSet();
                            Collections.addAll(hashSet2, this.f72231b);
                            hashSet2.removeAll(set);
                            PendingIntent pendingIntent = this.f72232c;
                            synchronized (akmg.f72253a) {
                                for (NetworkKey networkKey4 : hashSet2) {
                                    akmg.f72253a.mo67268a(networkKey4, pendingIntent);
                                }
                            }
                        }
                        if (((Boolean) akka.f72126a.mo10351a()).booleanValue()) {
                            this.f72230a.f72237e.mo39553a();
                            akka.f72126a.mo10352a((Object) false);
                        } else if (!cfpd.f185332a.mo6606a().mo82436a() || !((PowerManager) this.f72230a.f72233a.getSystemService("power")).isInteractive()) {
                            this.f72230a.f72237e.mo39555b();
                        } else {
                            long longValue = ((Long) akka.f72127b.mo10351a()).longValue() - SystemClock.elapsedRealtime();
                            if (longValue > 0) {
                                new Object[1][0] = Long.valueOf(longValue);
                                this.f72230a.f72237e.mo39555b();
                                return;
                            }
                            this.f72230a.f72237e.mo39553a();
                        }
                    }
                } catch (SQLiteException e4) {
                    eoa.m10825a("NetRec", e4, "Failed to request score updates.", new Object[0]);
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            }
        } else {
            int i5 = eoa.f15378a;
        }
    }
}
