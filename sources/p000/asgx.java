package p000;

import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.appusage.AppUsageIntervals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: asgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asgx {

    /* renamed from: a */
    public final Map f88942a = new HashMap();

    /* renamed from: b */
    public final AppUsageIntervals f88943b;

    /* renamed from: c */
    private final long f88944c;

    /* renamed from: d */
    private final long f88945d;

    /* renamed from: e */
    private Set f88946e;

    /* renamed from: f */
    private asgw f88947f;

    /* renamed from: g */
    private asgw f88948g;

    /* renamed from: h */
    private boolean f88949h;

    /* renamed from: i */
    private long f88950i;

    /* renamed from: j */
    private long f88951j;

    /* renamed from: k */
    private final Map f88952k = new HashMap();

    /* renamed from: l */
    private final UsageStatsManager f88953l;

    /* renamed from: m */
    private int f88954m;

    public asgx(long j, long j2, List list) {
        this.f88944c = j;
        this.f88945d = j2;
        if (list != null) {
            HashSet hashSet = new HashSet();
            this.f88946e = hashSet;
            hashSet.addAll(list);
        }
        this.f88953l = (UsageStatsManager) rpr.m34216b().getSystemService("usagestats");
        this.f88943b = new AppUsageIntervals(new ArrayList(), new ArrayList(), new ArrayList());
    }

    /* renamed from: a */
    private final void m74096a(long j) {
        this.f88951j = j;
        this.f88949h = false;
    }

    /* renamed from: b */
    private final long m74099b(long j) {
        return this.f88954m != 1 ? Math.max(this.f88950i, j - 30000) : this.f88944c;
    }

    /* renamed from: b */
    private final void m74100b() {
        this.f88951j = 0;
        this.f88949h = true;
    }

    /* renamed from: c */
    private final boolean m74101c() {
        return this.f88948g.f88939a.equals(this.f88947f.f88939a);
    }

    /* renamed from: d */
    private final void m74102d() {
        asgw asgw = this.f88948g;
        asgw.f88941c = Math.min(asgw.mo49152a() + 30000, this.f88951j);
        this.f88950i = Math.max(this.f88950i, this.f88948g.mo49152a());
    }

    /* renamed from: e */
    private final void m74103e() {
        m74097a(this.f88948g);
        this.f88948g = null;
        this.f88951j = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e5 A[SYNTHETIC] */
    /* renamed from: a */
    private final void m74097a(asgw asgw) {
        int i;
        List a;
        Pair create;
        long j;
        List list;
        int i2;
        String str = asgw.f88939a;
        Set set = this.f88946e;
        if (set == null || set.contains(str)) {
            long a2 = asgw.mo49152a();
            long j2 = asgw.f88940b;
            long j3 = a2 - j2;
            Map map = this.f88952k;
            PackageInfo packageInfo = (PackageInfo) map.get(str);
            int i3 = 0;
            if (packageInfo == null) {
                try {
                    packageInfo = rpr.m34216b().getPackageManager().getPackageInfo(str, 0);
                    try {
                        map.put(str, packageInfo);
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    String valueOf = String.valueOf(str);
                    Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Didn't find package info in PackageManager for ") : "Didn't find package info in PackageManager for ".concat(valueOf));
                    if (packageInfo == null) {
                    }
                    a = asgy.m74107a(str);
                    if (!a.isEmpty()) {
                    }
                    create = Pair.create(str, Integer.valueOf(i));
                    if (!this.f88942a.containsKey(create)) {
                    }
                    this.f88942a.put(create, Long.valueOf(j + j3));
                    long j4 = asgw.f88940b;
                    AppUsageIntervals appUsageIntervals = this.f88943b;
                    list = appUsageIntervals.f9816a;
                    List list2 = appUsageIntervals.f9817b;
                    List list3 = appUsageIntervals.f9818c;
                    while (true) {
                        if (i3 >= list.size()) {
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                    }
                    list3.add(new AppUsageIntervals.Interval(i2, j4, j3));
                }
            }
            if (packageInfo == null) {
                i = packageInfo.versionCode;
            } else {
                i = 0;
            }
            a = asgy.m74107a(str);
            if (!a.isEmpty()) {
                int size = a.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        i = ((Integer) ((Pair) bnjd.m109595d(a)).first).intValue();
                        break;
                    }
                    Pair pair = (Pair) a.get(i4);
                    i4++;
                    if (j2 >= ((Long) pair.second).longValue()) {
                        i = ((Integer) pair.first).intValue();
                        break;
                    }
                }
            }
            create = Pair.create(str, Integer.valueOf(i));
            if (!this.f88942a.containsKey(create)) {
                j = ((Long) this.f88942a.get(create)).longValue();
            } else {
                j = 0;
            }
            this.f88942a.put(create, Long.valueOf(j + j3));
            long j42 = asgw.f88940b;
            AppUsageIntervals appUsageIntervals2 = this.f88943b;
            list = appUsageIntervals2.f9816a;
            List list22 = appUsageIntervals2.f9817b;
            List list32 = appUsageIntervals2.f9818c;
            while (true) {
                if (i3 >= list.size()) {
                    if (str.equals(list.get(i3)) && i == ((Integer) list22.get(i3)).intValue()) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 >= 0) {
                int size2 = list.size();
                list.add(str);
                list22.add(Integer.valueOf(i));
                i2 = size2;
            } else {
                i2 = i3;
            }
            list32.add(new AppUsageIntervals.Interval(i2, j42, j3));
        }
    }

    /* renamed from: a */
    private final void m74098a(asgw asgw, long j) {
        asgw.f88941c = j;
        this.f88950i = Math.max(this.f88950i, j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    public final void mo49153a() {
        try {
            UsageEvents queryEvents = this.f88953l.queryEvents(this.f88944c, this.f88945d);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEvents.hasNextEvent()) {
                queryEvents.getNextEvent(event);
                long timeStamp = event.getTimeStamp();
                String packageName = event.getPackageName();
                if (event.getEventType() == 1) {
                    this.f88954m++;
                    asgw asgw = this.f88948g;
                    if (asgw != null) {
                        if (this.f88949h) {
                            if (asgw.mo49152a() + 250 <= timeStamp || !packageName.equals(this.f88948g.f88939a)) {
                                m74103e();
                            } else {
                                this.f88947f = this.f88948g;
                                this.f88948g = null;
                                this.f88951j = 0;
                            }
                        } else if (this.f88947f == null || asgw.mo49152a() + 30000 < this.f88947f.f88940b || !m74101c()) {
                            m74102d();
                            m74103e();
                        } else {
                            m74098a(this.f88948g, this.f88947f.f88940b);
                            m74096a(timeStamp);
                            this.f88947f = null;
                        }
                    }
                    asgw asgw2 = this.f88947f;
                    if (asgw2 != null) {
                        this.f88948g = asgw2;
                        m74096a(timeStamp);
                        this.f88947f = null;
                    }
                    this.f88947f = new asgw(packageName, timeStamp, 0);
                } else if (event.getEventType() == 2) {
                    this.f88954m++;
                    asgw asgw3 = this.f88948g;
                    if (asgw3 != null) {
                        if (this.f88949h) {
                            if (asgw3.mo49152a() + 30000 <= timeStamp || !packageName.equals(this.f88948g.f88939a) || this.f88947f != null) {
                                m74103e();
                            } else {
                                m74098a(this.f88948g, timeStamp);
                            }
                        } else if (this.f88951j + 1000 >= timeStamp && packageName.equals(asgw3.f88939a)) {
                            m74098a(this.f88948g, timeStamp);
                            if (this.f88947f == null || !m74101c() || timeStamp + 250 <= this.f88947f.f88940b) {
                                m74100b();
                            } else {
                                this.f88947f = this.f88948g;
                                this.f88948g = null;
                                this.f88951j = 0;
                            }
                        } else {
                            m74102d();
                            m74100b();
                            m74103e();
                        }
                    }
                    asgw asgw4 = this.f88947f;
                    if (asgw4 != null) {
                        if (!packageName.equals(asgw4.f88939a)) {
                            asgw asgw5 = this.f88947f;
                            if (asgw5.f88940b + 1000 > timeStamp) {
                                m74097a(new asgw(packageName, m74099b(timeStamp), timeStamp));
                            } else {
                                long min = Math.min(30000L, (timeStamp - asgw5.mo49152a()) / 2);
                                asgw asgw6 = this.f88947f;
                                asgw6.f88941c = asgw6.f88940b + min;
                                this.f88950i = Math.max(this.f88950i, asgw6.mo49152a());
                                m74097a(this.f88947f);
                                this.f88947f = null;
                            }
                        } else {
                            m74098a(this.f88947f, timeStamp);
                            this.f88948g = this.f88947f;
                            m74100b();
                            this.f88947f = null;
                        }
                    }
                    this.f88948g = new asgw(packageName, m74099b(timeStamp), timeStamp);
                    m74100b();
                    this.f88947f = null;
                }
            }
            if (this.f88948g != null) {
                if (!this.f88949h) {
                    m74102d();
                }
                m74103e();
            }
            asgw asgw7 = this.f88947f;
            if (asgw7 != null) {
                asgw7.f88941c = this.f88945d;
                m74097a(asgw7);
            }
        } catch (NullPointerException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("AppUsageUtil", valueOf.length() == 0 ? new String("Query events in UsageStatsManager caused NPE: ") : "Query events in UsageStatsManager caused NPE: ".concat(valueOf));
        }
    }
}
