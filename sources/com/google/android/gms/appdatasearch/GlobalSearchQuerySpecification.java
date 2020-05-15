package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GlobalSearchQuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new frn();

    /* renamed from: a */
    final CorpusId[] f9572a;

    /* renamed from: b */
    public final int f9573b;

    /* renamed from: c */
    final CorpusScoringInfo[] f9574c;

    /* renamed from: d */
    public final int f9575d;

    /* renamed from: e */
    public final int f9576e;

    /* renamed from: f */
    public final int f9577f;

    /* renamed from: g */
    public final String f9578g;

    /* renamed from: h */
    public final boolean f9579h;

    /* renamed from: i */
    public final byte[] f9580i;

    /* renamed from: j */
    public final boolean f9581j;

    /* renamed from: k */
    public final boolean f9582k;

    /* renamed from: l */
    public final boolean f9583l;

    /* renamed from: m */
    public final int[] f9584m;

    /* renamed from: n */
    public final byte[] f9585n;

    /* renamed from: o */
    public final STSortSpec f9586o;

    /* renamed from: p */
    public final String f9587p;

    /* renamed from: q */
    public final int f9588q;

    /* renamed from: r */
    public final CacheSpec f9589r;

    /* renamed from: s */
    public final transient Map f9590s;

    /* renamed from: t */
    public final transient Map f9591t;

    public GlobalSearchQuerySpecification(CorpusId[] corpusIdArr, int i, CorpusScoringInfo[] corpusScoringInfoArr, int i2, int i3, int i4, String str, boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4, int[] iArr, byte[] bArr2, STSortSpec sTSortSpec, String str2, int i5, CacheSpec cacheSpec) {
        int length;
        CorpusId[] corpusIdArr2 = corpusIdArr;
        CorpusScoringInfo[] corpusScoringInfoArr2 = corpusScoringInfoArr;
        this.f9572a = corpusIdArr2;
        this.f9573b = i;
        this.f9575d = i2;
        this.f9576e = i3;
        this.f9577f = i4;
        this.f9578g = str;
        this.f9579h = z;
        this.f9580i = bArr;
        this.f9581j = z2;
        this.f9582k = z3;
        this.f9583l = z4;
        this.f9584m = iArr;
        this.f9585n = bArr2;
        this.f9586o = sTSortSpec;
        this.f9587p = str2;
        this.f9588q = i5;
        this.f9589r = cacheSpec;
        this.f9574c = corpusScoringInfoArr2;
        if (corpusIdArr2 == null || corpusIdArr2.length == 0) {
            this.f9590s = null;
        } else {
            this.f9590s = new HashMap();
            for (int i6 = 0; i6 < corpusIdArr2.length; i6++) {
                Set set = (Set) this.f9590s.get(corpusIdArr2[i6].f9517a);
                if (set == null) {
                    set = new HashSet();
                    this.f9590s.put(corpusIdArr2[i6].f9517a, set);
                }
                String str3 = corpusIdArr2[i6].f9518b;
                if (str3 != null) {
                    set.add(str3);
                }
            }
        }
        if (corpusScoringInfoArr2 == null || (length = corpusScoringInfoArr2.length) == 0) {
            this.f9591t = null;
            return;
        }
        this.f9591t = new HashMap(length);
        for (CorpusScoringInfo corpusScoringInfo : corpusScoringInfoArr2) {
            this.f9591t.put(corpusScoringInfo.f9520a, corpusScoringInfo);
        }
    }

    /* renamed from: a */
    public final int mo7196a() {
        Map map = this.f9590s;
        if (map != null) {
            int i = 0;
            for (Set set : map.values()) {
                i += set.size();
            }
            if (i != 0) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GlobalSearchQuerySpecification) {
            GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) obj;
            return sdg.m34949a(Integer.valueOf(this.f9573b), Integer.valueOf(globalSearchQuerySpecification.f9573b)) && sdg.m34949a(Integer.valueOf(this.f9575d), Integer.valueOf(globalSearchQuerySpecification.f9575d)) && sdg.m34949a(Integer.valueOf(this.f9576e), Integer.valueOf(globalSearchQuerySpecification.f9576e)) && sdg.m34949a(Integer.valueOf(this.f9577f), Integer.valueOf(globalSearchQuerySpecification.f9577f)) && sdg.m34949a(this.f9578g, globalSearchQuerySpecification.f9578g) && sdg.m34949a(Boolean.valueOf(this.f9579h), Boolean.valueOf(globalSearchQuerySpecification.f9579h)) && sdg.m34949a(Boolean.valueOf(this.f9581j), Boolean.valueOf(globalSearchQuerySpecification.f9581j)) && sdg.m34949a(Boolean.valueOf(this.f9582k), Boolean.valueOf(globalSearchQuerySpecification.f9582k)) && sdg.m34949a(Boolean.valueOf(this.f9583l), Boolean.valueOf(globalSearchQuerySpecification.f9583l)) && sdg.m34949a(this.f9591t, globalSearchQuerySpecification.f9591t) && sdg.m34949a(this.f9586o, globalSearchQuerySpecification.f9586o) && sdg.m34949a(this.f9587p, globalSearchQuerySpecification.f9587p) && Arrays.equals(this.f9572a, globalSearchQuerySpecification.f9572a) && Arrays.equals(this.f9580i, globalSearchQuerySpecification.f9580i) && Arrays.equals(this.f9574c, globalSearchQuerySpecification.f9574c) && Arrays.equals(this.f9584m, globalSearchQuerySpecification.f9584m) && Arrays.equals(this.f9585n, globalSearchQuerySpecification.f9585n) && sdg.m34949a(Integer.valueOf(this.f9588q), Integer.valueOf(globalSearchQuerySpecification.f9588q)) && sdg.m34949a(this.f9589r, globalSearchQuerySpecification.f9589r);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9573b), Integer.valueOf(this.f9575d), Integer.valueOf(this.f9576e), Integer.valueOf(this.f9577f), this.f9578g, Boolean.valueOf(this.f9579h), Boolean.valueOf(this.f9581j), Boolean.valueOf(this.f9582k), Boolean.valueOf(this.f9583l), this.f9591t, this.f9586o, this.f9587p, Integer.valueOf(Arrays.hashCode(this.f9572a)), Integer.valueOf(Arrays.hashCode(this.f9580i)), Integer.valueOf(Arrays.hashCode(this.f9574c)), Integer.valueOf(Arrays.hashCode(this.f9585n)), Integer.valueOf(this.f9588q), this.f9589r});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f9590s != null) {
            sb.append("mFilter\n");
            for (String str : this.f9590s.keySet()) {
                String str2 = "";
                for (String str3 : (Set) this.f9590s.get(str)) {
                    String valueOf = String.valueOf(str2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str3).length());
                    sb2.append(valueOf);
                    sb2.append(str3);
                    sb2.append(",");
                    str2 = sb2.toString();
                }
                sb.append("key:");
                sb.append(str);
                sb.append(", values:");
                sb.append(str2);
                sb.append("\n");
            }
        }
        if (this.f9591t != null) {
            sb.append("mCorpusScoringInfoMap\n");
            for (CorpusId corpusId : this.f9591t.keySet()) {
                sb.append(String.valueOf(corpusId.toString()).concat("\n"));
            }
        }
        if (this.f9586o != null) {
            sb.append("STSortSpec: ");
            sb.append(this.f9586o.toString());
            sb.append("\n");
        }
        if (this.f9587p != null) {
            sb.append("Origin: ");
            sb.append(this.f9587p);
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final CorpusScoringInfo mo7197a(String str, String str2) {
        Map map = this.f9591t;
        if (map == null) {
            return null;
        }
        CorpusScoringInfo corpusScoringInfo = (CorpusScoringInfo) map.get(new CorpusId(str, str2));
        return corpusScoringInfo == null ? (CorpusScoringInfo) this.f9591t.get(new CorpusId(str, null)) : corpusScoringInfo;
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, int[], boolean):void
     arg types: [android.os.Parcel, int, int[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 1, this.f9572a, i);
        see.m35063b(parcel, 2, this.f9573b);
        see.m35057a(parcel, 3, this.f9574c, i);
        see.m35063b(parcel, 4, this.f9575d);
        see.m35063b(parcel, 5, this.f9576e);
        see.m35063b(parcel, 6, this.f9577f);
        see.m35046a(parcel, 7, this.f9578g, false);
        see.m35051a(parcel, 8, this.f9579h);
        see.m35052a(parcel, 9, this.f9580i, false);
        see.m35051a(parcel, 10, this.f9581j);
        see.m35051a(parcel, 11, this.f9582k);
        see.m35051a(parcel, 12, this.f9583l);
        see.m35055a(parcel, 13, this.f9584m, false);
        see.m35052a(parcel, 14, this.f9585n, false);
        see.m35040a(parcel, 15, this.f9586o, i, false);
        see.m35046a(parcel, 16, this.f9587p, false);
        see.m35063b(parcel, 17, this.f9588q);
        see.m35040a(parcel, 18, this.f9589r, i, false);
        see.m35062b(parcel, a);
    }
}
