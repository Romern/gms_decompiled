package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MdpDataPlanStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agoo();

    /* renamed from: a */
    public static final Map f80161a;

    /* renamed from: u */
    private static final Map f80162u = new HashMap();

    /* renamed from: b */
    public String f80163b;

    /* renamed from: c */
    public String f80164c;

    /* renamed from: d */
    public String f80165d;

    /* renamed from: e */
    public long f80166e;

    /* renamed from: f */
    public long f80167f;

    /* renamed from: g */
    public MdpFlexTimeWindow[] f80168g;

    /* renamed from: h */
    public int f80169h;

    /* renamed from: i */
    public String f80170i;

    /* renamed from: j */
    public String f80171j;

    /* renamed from: k */
    public String f80172k;

    /* renamed from: l */
    public String f80173l;

    /* renamed from: m */
    public int f80174m;

    /* renamed from: n */
    public List f80175n;

    /* renamed from: o */
    public long f80176o;

    /* renamed from: p */
    public long f80177p;

    /* renamed from: q */
    public long f80178q;

    /* renamed from: r */
    public String f80179r;

    /* renamed from: s */
    public String f80180s;

    /* renamed from: t */
    public boolean f80181t = true;

    static {
        HashMap hashMap = new HashMap();
        f80161a = hashMap;
        hashMap.put(0, "UNSPECIFIED");
        f80161a.put(1, "THROTTLED");
        f80161a.put(2, "BLOCKED");
        f80161a.put(3, "PAY_AS_YOU_GO");
        for (Map.Entry entry : f80161a.entrySet()) {
            f80162u.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    public MdpDataPlanStatus() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdpDataPlanStatus mdpDataPlanStatus = (MdpDataPlanStatus) obj;
            return sdg.m34949a(this.f80163b, mdpDataPlanStatus.f80163b) && sdg.m34949a(this.f80164c, mdpDataPlanStatus.f80164c) && sdg.m34949a(this.f80165d, mdpDataPlanStatus.f80165d) && sdg.m34949a(Long.valueOf(this.f80166e), Long.valueOf(mdpDataPlanStatus.f80166e)) && sdg.m34949a(Long.valueOf(this.f80167f), Long.valueOf(mdpDataPlanStatus.f80167f)) && Arrays.equals(this.f80168g, mdpDataPlanStatus.f80168g) && sdg.m34949a(Integer.valueOf(this.f80169h), Integer.valueOf(mdpDataPlanStatus.f80169h)) && sdg.m34949a(Long.valueOf(this.f80176o), Long.valueOf(mdpDataPlanStatus.f80176o)) && sdg.m34949a(Long.valueOf(this.f80177p), Long.valueOf(mdpDataPlanStatus.f80177p)) && sdg.m34949a(Long.valueOf(this.f80178q), Long.valueOf(mdpDataPlanStatus.f80178q)) && sdg.m34949a(this.f80179r, mdpDataPlanStatus.f80179r) && sdg.m34949a(this.f80170i, mdpDataPlanStatus.f80170i) && sdg.m34949a(this.f80180s, mdpDataPlanStatus.f80180s) && sdg.m34949a(this.f80171j, mdpDataPlanStatus.f80171j) && sdg.m34949a(Boolean.valueOf(this.f80181t), Boolean.valueOf(mdpDataPlanStatus.f80181t)) && sdg.m34949a(this.f80172k, mdpDataPlanStatus.f80172k) && sdg.m34949a(this.f80173l, mdpDataPlanStatus.f80173l) && sdg.m34949a(Integer.valueOf(this.f80174m), Integer.valueOf(mdpDataPlanStatus.f80174m)) && sdg.m34949a(this.f80175n, mdpDataPlanStatus.f80175n);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f80163b, this.f80164c, this.f80165d, Long.valueOf(this.f80166e), Long.valueOf(this.f80167f), this.f80170i, this.f80171j, this.f80172k, this.f80173l, Integer.valueOf(this.f80174m), this.f80175n})), Integer.valueOf(Arrays.hashCode(this.f80168g))})), Integer.valueOf(this.f80169h), Long.valueOf(this.f80176o), Long.valueOf(this.f80177p), Long.valueOf(this.f80178q), this.f80179r, this.f80180s, Boolean.valueOf(this.f80181t)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("PlanName", this.f80163b);
        a.mo25396a("ExpirationTime", this.f80164c);
        a.mo25396a("TrafficCategory", this.f80165d);
        a.mo25396a("QuotaBytes", Long.valueOf(this.f80166e));
        a.mo25396a("QuotaMinutes", Long.valueOf(this.f80167f));
        a.mo25396a("FlexTimeWindows", Arrays.toString(this.f80168g));
        int i = this.f80169h;
        String str = (String) f80161a.get(Integer.valueOf(i));
        if (str != null) {
            a.mo25396a("OverUsagePolicy", str);
            a.mo25396a("RemainingBytes", Long.valueOf(this.f80177p));
            a.mo25396a("RemainingMinutes", Long.valueOf(this.f80178q));
            a.mo25396a("ShortDescription", this.f80172k);
            a.mo25396a("DisplayRefreshPeriod", this.f80173l);
            a.mo25396a("PlanType", Integer.valueOf(this.f80174m));
            a.mo25396a("Pmtcs", this.f80175n);
            a.mo25396a("SnapshotTime", Long.valueOf(this.f80176o));
            a.mo25396a("Description", this.f80179r);
            a.mo25396a("PlanId", this.f80170i);
            a.mo25396a("Balance", this.f80180s);
            a.mo25396a("ModuleName", this.f80171j);
            a.mo25396a("IsActive", Boolean.valueOf(this.f80181t));
            return a.toString();
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append("Illegal overusage policy string: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public MdpDataPlanStatus(String str, String str2, String str3, long j, long j2, MdpFlexTimeWindow[] mdpFlexTimeWindowArr, int i, String str4, String str5, String str6, String str7, int i2, List list, long j3, long j4, long j5, String str8, String str9, boolean z) {
        int i3 = i;
        this.f80163b = str;
        this.f80170i = str4;
        this.f80171j = str5;
        this.f80164c = str2;
        this.f80165d = str3;
        this.f80166e = j;
        this.f80167f = j2;
        this.f80168g = mdpFlexTimeWindowArr;
        if (f80161a.keySet().contains(Integer.valueOf(i))) {
            this.f80169h = i3;
            this.f80176o = j3;
            this.f80177p = j4;
            this.f80178q = j5;
            this.f80179r = str8;
            this.f80180s = str9;
            this.f80172k = str6;
            this.f80181t = z;
            this.f80173l = str7;
            this.f80174m = i2;
            this.f80175n = list;
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Illegal overusage policy: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.util.List, boolean):void
     arg types: [android.os.Parcel, int, java.util.List, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 1, this.f80163b, false);
        see.m35046a(parcel, 2, this.f80164c, false);
        see.m35046a(parcel, 3, this.f80165d, false);
        see.m35036a(parcel, 4, this.f80166e);
        see.m35036a(parcel, 5, this.f80167f);
        see.m35057a(parcel, 6, this.f80168g, i);
        see.m35063b(parcel, 7, this.f80169h);
        see.m35046a(parcel, 8, this.f80170i, false);
        see.m35046a(parcel, 9, this.f80171j, false);
        see.m35046a(parcel, 10, this.f80172k, false);
        see.m35046a(parcel, 11, this.f80173l, false);
        see.m35063b(parcel, 12, this.f80174m);
        see.m35049a(parcel, 13, this.f80175n, false);
        see.m35036a(parcel, 20, this.f80176o);
        see.m35036a(parcel, 21, this.f80177p);
        see.m35036a(parcel, 22, this.f80178q);
        see.m35046a(parcel, 23, this.f80179r, false);
        see.m35046a(parcel, 24, this.f80180s, false);
        see.m35051a(parcel, 25, this.f80181t);
        see.m35062b(parcel, a);
    }
}
