package p000;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.stats.radio.NetworkActivityEvent;
import com.google.android.gms.common.stats.radio.NetworkLatencyEvent;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: smr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smr {

    /* renamed from: a */
    public static final String f44772a = String.format("%25.25s\t%10.10s\t%6s\t%5s\t%7s\t%7s\t%7s\t%7s\t%7s\t%7s\t%6s\t%6s", "Component", "Tag", "Network", "State", "Wakeups", "Min Lat", "Med Lat", "Max Lat", "TTL Lat", "Std dev", "TTL Evt", "TTL Fail");

    /* renamed from: a */
    private static bxvd m35674a(NetworkActivityEvent networkActivityEvent, int i) {
        bxvd da = bpvw.f139435m.mo74144da();
        int i2 = networkActivityEvent.tag;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvw bpvw = (bpvw) da.f164949b;
        int i3 = bpvw.f139437a | 1;
        bpvw.f139437a = i3;
        bpvw.f139438b = i2;
        int i4 = networkActivityEvent.deviceState;
        bpvw.f139437a = i3 | 2;
        bpvw.f139439c = i4;
        int a = bpvv.m112335a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvw bpvw2 = (bpvw) da.f164949b;
        int i5 = a - 2;
        if (a != 0) {
            bpvw2.f139440d = i5;
            int i6 = bpvw2.f139437a | 4;
            bpvw2.f139437a = i6;
            bpvw2.f139437a = i6 | 8;
            bpvw2.f139441e = 0;
            return da;
        }
        throw null;
    }

    /* renamed from: a */
    public static List m35675a(long j, long j2, int i) {
        sqj sqj;
        Cursor a;
        Throwable th;
        int i2 = i;
        smv a2 = smv.m35679a();
        RadiosTracingLoggerProvider.NetworkActivityLogger networkActivityLogger = rpr.m34216b().getNetworkActivityLogger();
        if (a2 == null || networkActivityLogger.isNopLogger()) {
            return Collections.emptyList();
        }
        int i3 = Build.VERSION.SDK_INT;
        List events = networkActivityLogger.getEvents(j, j2, -1, -1);
        events.addAll(networkActivityLogger.getEvents(j, j2, i, -1));
        boolean z = false;
        String[] strArr = {"event_time_ms"};
        String[] strArr2 = {String.valueOf(i), String.valueOf(j), String.valueOf(j2)};
        TreeSet treeSet = new TreeSet();
        try {
            a = a2.f44778a.mo25970a("radio_activity", strArr, "network_type = ? AND event_time_ms BETWEEN ? AND ?", strArr2, "event_time_ms ASC", null);
            if (a != null) {
                int columnIndexOrThrow = a.getColumnIndexOrThrow("event_time_ms");
                while (a.moveToNext()) {
                    treeSet.add(Long.valueOf(a.getLong(columnIndexOrThrow)));
                }
            }
            if (a != null) {
                a.close();
            }
            sqj = a2.f44778a;
        } catch (IllegalArgumentException e) {
            try {
                Log.e("WLRadioListnr", "Unable to query radio logs: ", e);
                sqj = a2.f44778a;
            } catch (Throwable th2) {
                a2.f44778a.mo25971a();
                throw th2;
            }
        } catch (Throwable th3) {
            bqye.m113761a(th, th3);
        }
        sqj.mo25971a();
        if (events.isEmpty() || treeSet.isEmpty()) {
            return Collections.emptyList();
        }
        Collections.sort(events, smq.f44771a);
        long b = cdna.f181280a.mo6606a().mo77931b();
        HashMap hashMap = new HashMap();
        Iterator it = treeSet.iterator();
        long longValue = ((Long) it.next()).longValue();
        Iterator it2 = events.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            NetworkActivityEvent networkActivityEvent = (NetworkActivityEvent) it2.next();
            if (!networkActivityEvent.isNetworkActive) {
                if (it.hasNext()) {
                    while (true) {
                        long j3 = networkActivityEvent.eventTimeMillis;
                        long j4 = j3 + b;
                        if (longValue <= j4) {
                            if (j3 > longValue || longValue > j4) {
                                if (!it.hasNext()) {
                                    m35676a(hashMap, networkActivityEvent, i2, false);
                                    break;
                                }
                                longValue = ((Long) it.next()).longValue();
                            } else {
                                m35676a(hashMap, networkActivityEvent, i2, true);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    m35676a(hashMap, networkActivityEvent, i2, false);
                    break;
                }
            } else {
                m35676a(hashMap, networkActivityEvent, i2, false);
            }
        }
        RadiosTracingLoggerProvider.NetworkLatencyLogger networkLatencyLogger = rpr.m34216b().getNetworkLatencyLogger();
        if (cdna.f181280a.mo6606a().mo77942m() && !networkLatencyLogger.isNopLogger()) {
            Iterator it3 = hashMap.values().iterator();
            while (it3.hasNext()) {
                for (bxvd bxvd : ((Map) it3.next()).values()) {
                    int a3 = bpvv.m112335a(((bpvw) bxvd.f164949b).f139440d);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    bpvw bpvw = (bpvw) bxvd.f164949b;
                    List<NetworkLatencyEvent> events2 = networkLatencyLogger.getEvents(j, j2, a3 - 2, bpvw.f139438b, bpvw.f139439c, -1);
                    if (!events2.isEmpty()) {
                        Collections.sort(events2, smp.f44770a);
                        int size = events2.size();
                        double d = (double) size;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = z;
                        }
                        bpvw bpvw2 = (bpvw) bxvd.f164949b;
                        bpvw bpvw3 = bpvw.f139435m;
                        bpvw2.f139437a |= 512;
                        bpvw2.f139447k = d;
                        long j5 = ((NetworkLatencyEvent) events2.get(z ? 1 : 0)).latencyMillis;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = z;
                        }
                        bpvw bpvw4 = (bpvw) bxvd.f164949b;
                        bpvw4.f139437a |= 16;
                        bpvw4.f139442f = j5;
                        int i4 = size - 1;
                        long j6 = ((NetworkLatencyEvent) events2.get(i4)).latencyMillis;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = z;
                        }
                        bpvw bpvw5 = (bpvw) bxvd.f164949b;
                        bpvw5.f139437a |= 32;
                        bpvw5.f139443g = j6;
                        if (size % 2 != 0) {
                            long j7 = ((NetworkLatencyEvent) events2.get(i4 / 2)).latencyMillis;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = z;
                            }
                            bpvw bpvw6 = (bpvw) bxvd.f164949b;
                            bpvw6.f139437a |= 128;
                            bpvw6.f139445i = j7;
                        } else {
                            int i5 = size / 2;
                            long j8 = (((NetworkLatencyEvent) events2.get(i5 - 1)).latencyMillis + ((NetworkLatencyEvent) events2.get(i5)).latencyMillis) / 2;
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            bpvw bpvw7 = (bpvw) bxvd.f164949b;
                            bpvw7.f139437a |= 128;
                            bpvw7.f139445i = j8;
                        }
                        bpvw bpvw8 = (bpvw) bxvd.f164949b;
                        bpvw8.f139437a |= 1024;
                        double d2 = 0.0d;
                        bpvw8.f139448l = 0.0d;
                        double d3 = 0.0d;
                        for (NetworkLatencyEvent networkLatencyEvent : events2) {
                            Iterator it4 = it3;
                            double d4 = (double) networkLatencyEvent.latencyMillis;
                            Double.isNaN(d4);
                            d3 += d4;
                            if (!networkLatencyEvent.successful) {
                                double d5 = ((bpvw) bxvd.f164949b).f139448l + 1.0d;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                bpvw bpvw9 = (bpvw) bxvd.f164949b;
                                bpvw9.f139437a |= 1024;
                                bpvw9.f139448l = d5;
                            }
                            it3 = it4;
                        }
                        Iterator it5 = it3;
                        Double.isNaN(d);
                        double d6 = d3 / d;
                        long round = Math.round(d6);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        bpvw bpvw10 = (bpvw) bxvd.f164949b;
                        int i6 = bpvw10.f139437a | 64;
                        bpvw10.f139437a = i6;
                        bpvw10.f139444h = round;
                        if (size <= 1) {
                            bpvw10.f139437a = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bpvw10.f139446j = 0.0d;
                            it3 = it5;
                            z = false;
                        } else {
                            for (NetworkLatencyEvent networkLatencyEvent2 : events2) {
                                double d7 = (double) networkLatencyEvent2.latencyMillis;
                                Double.isNaN(d7);
                                double d8 = d7 - d6;
                                d2 += d8 * d8;
                            }
                            double d9 = (double) i4;
                            Double.isNaN(d9);
                            double d10 = d2 / d9;
                            if (!bxvd.f164950c) {
                                z = false;
                            } else {
                                bxvd.mo74035c();
                                z = false;
                                bxvd.f164950c = false;
                            }
                            bpvw bpvw11 = (bpvw) bxvd.f164949b;
                            bpvw11.f139437a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bpvw11.f139446j = d10;
                            it3 = it5;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map map : hashMap.values()) {
            for (bxvd bxvd2 : map.values()) {
                arrayList.add((bpvw) bxvd2.mo74062i());
            }
        }
        return arrayList;
        throw th;
    }

    /* renamed from: a */
    private static void m35676a(Map map, NetworkActivityEvent networkActivityEvent, int i, boolean z) {
        Map map2 = (Map) map.get(Integer.valueOf(networkActivityEvent.tag));
        if (map2 == null) {
            bxvd a = m35674a(networkActivityEvent, i);
            if (z) {
                long j = ((bpvw) a.f164949b).f139441e + 1;
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bpvw bpvw = (bpvw) a.f164949b;
                bpvw bpvw2 = bpvw.f139435m;
                bpvw.f139437a |= 8;
                bpvw.f139441e = j;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(networkActivityEvent.deviceState), a);
            map.put(Integer.valueOf(networkActivityEvent.tag), hashMap);
            return;
        }
        bxvd bxvd = (bxvd) map2.get(Integer.valueOf(networkActivityEvent.deviceState));
        if (bxvd == null) {
            bxvd = m35674a(networkActivityEvent, i);
            map2.put(Integer.valueOf(networkActivityEvent.deviceState), bxvd);
        }
        if (z) {
            long j2 = ((bpvw) bxvd.f164949b).f139441e + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpvw bpvw3 = (bpvw) bxvd.f164949b;
            bpvw bpvw4 = bpvw.f139435m;
            bpvw3.f139437a |= 8;
            bpvw3.f139441e = j2;
        }
    }
}
