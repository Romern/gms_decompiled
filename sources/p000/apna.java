package p000;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Response;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: apna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apna extends aplq {

    /* renamed from: a */
    private final abrv f84737a;

    public apna(abrv abrv, GetStorageStatsCall$Request getStorageStatsCall$Request, abyy abyy) {
        super(bqbd.GET_STORAGE_STATS, 1, 4, abrv.f58066b, getStorageStatsCall$Request, abyy);
        this.f84737a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        SparseArray sparseArray;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z;
        SparseArray sparseArray2;
        abzo a = this.f84737a.mo32298a();
        synchronized (((abzm) a).mo32525a()) {
            sparseArray = new SparseArray(((abzm) a).f58817f.size());
            bnre i = ((abzm) a).mo32541c().listIterator();
            while (i.hasNext()) {
                absr absr = (absr) i.next();
                sparseArray.put(absr.f58137b, absr.f58140e);
            }
        }
        long a2 = NativeIndex.m66678a(this.f84737a.f58073i.f58511a);
        File[] listFiles = new File(this.f84737a.f58066b.getApplicationInfo().dataDir).listFiles();
        if (listFiles == null) {
            absg.m48191b("Failed to get data files, please check if proper Android permissions are added.");
            j = -1;
        } else {
            long j6 = 0;
            for (File file : listFiles) {
                if (!file.getName().equals("cache") && !file.getName().equals("lib")) {
                    j6 += NativeIndex.m66678a(file);
                }
            }
            j = j6;
        }
        HashMap hashMap = new HashMap();
        abuw h = this.f84737a.f58078n.mo43413h();
        if (h != null) {
            bxwc bxwc = h.f58493a;
            int size = bxwc.size();
            int i2 = 0;
            j4 = 0;
            j3 = 0;
            j2 = 0;
            while (i2 < size) {
                abuv abuv = (abuv) bxwc.get(i2);
                long j7 = abuv.f58488d;
                bxwc bxwc2 = bxwc;
                int i3 = size;
                long j8 = abuv.f58489e;
                j2 += j8;
                long j9 = j3 + j7;
                String str = (String) sparseArray.get(abuv.f58485a);
                if (str != null) {
                    Pair pair = (Pair) hashMap.get(str);
                    if (pair == null) {
                        pair = Pair.create(0L, 0L);
                    }
                    sparseArray2 = sparseArray;
                    hashMap.put(str, Pair.create(Long.valueOf(((Long) pair.first).longValue() + j7), Long.valueOf(((Long) pair.second).longValue() + j8)));
                } else {
                    sparseArray2 = sparseArray;
                    j4 += j8;
                    if (j7 != 0) {
                        absg.m48193b("Corpus %d from an unknown package using %d bytes.", Integer.valueOf(abuv.f58485a), Long.valueOf(j7));
                    }
                }
                i2++;
                bxwc = bxwc2;
                size = i3;
                j3 = j9;
                sparseArray = sparseArray2;
            }
        } else {
            absg.m48205e("Error parsing usage stats from native");
            j4 = 0;
            j3 = 0;
            j2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            Pair pair2 = (Pair) entry.getValue();
            if (j3 != 0) {
                j5 = ((a2 - j2) * ((Long) pair2.first).longValue()) / j3;
            } else {
                j5 = 0;
            }
            GetStorageStatsCall$PackageStats getStorageStatsCall$PackageStats = new GetStorageStatsCall$PackageStats();
            getStorageStatsCall$PackageStats.f107373a = (String) entry.getKey();
            getStorageStatsCall$PackageStats.f107374b = j5;
            abyv d = this.f84737a.f58077m.mo32506d((String) entry.getKey());
            if (d != null) {
                z = d.mo32474c();
            } else {
                z = false;
            }
            getStorageStatsCall$PackageStats.f107375c = z;
            getStorageStatsCall$PackageStats.f107376d = ((Long) pair2.second).longValue();
            arrayList.add(getStorageStatsCall$PackageStats);
        }
        GetStorageStatsCall$Response getStorageStatsCall$Response = new GetStorageStatsCall$Response();
        getStorageStatsCall$Response.f107377a = Status.f30107a;
        getStorageStatsCall$Response.f107378b = (GetStorageStatsCall$PackageStats[]) arrayList.toArray(new GetStorageStatsCall$PackageStats[arrayList.size()]);
        getStorageStatsCall$Response.f107379c = j4;
        getStorageStatsCall$Response.f107380d = a2;
        getStorageStatsCall$Response.f107381e = j;
        return getStorageStatsCall$Response;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        GetStorageStatsCall$Response getStorageStatsCall$Response = new GetStorageStatsCall$Response();
        getStorageStatsCall$Response.f107377a = status;
        return getStorageStatsCall$Response;
    }
}
