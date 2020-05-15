package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fqu();

    /* renamed from: a */
    public final boolean f9523a;

    /* renamed from: b */
    public final long f9524b;

    /* renamed from: c */
    public final long f9525c;

    /* renamed from: d */
    final long f9526d;

    /* renamed from: e */
    final Bundle f9527e;

    /* renamed from: f */
    public final String f9528f;

    /* renamed from: g */
    public final String f9529g;

    CorpusStatus() {
        this(false, 0, 0, 0, null, null, null);
    }

    /* renamed from: a */
    public final Map mo7162a() {
        HashMap hashMap = new HashMap();
        for (String str : this.f9527e.keySet()) {
            int i = this.f9527e.getInt(str, -1);
            if (i != -1) {
                hashMap.put(str, Integer.valueOf(i));
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (!sdg.m34949a(Boolean.valueOf(this.f9523a), Boolean.valueOf(corpusStatus.f9523a)) || !sdg.m34949a(Long.valueOf(this.f9524b), Long.valueOf(corpusStatus.f9524b)) || !sdg.m34949a(Long.valueOf(this.f9525c), Long.valueOf(corpusStatus.f9525c)) || !sdg.m34949a(Long.valueOf(this.f9526d), Long.valueOf(corpusStatus.f9526d)) || !sdg.m34949a(mo7162a(), corpusStatus.mo7162a()) || !sdg.m34949a(this.f9529g, corpusStatus.f9529g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9523a), Long.valueOf(this.f9524b), Long.valueOf(this.f9525c), Long.valueOf(this.f9526d), mo7162a(), this.f9529g});
    }

    public final String toString() {
        boolean z = this.f9523a;
        String str = this.f9529g;
        long j = this.f9524b;
        long j2 = this.f9525c;
        long j3 = this.f9526d;
        String valueOf = String.valueOf(this.f9527e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 181 + String.valueOf(valueOf).length());
        sb.append("CorpusStatus{found=");
        sb.append(z);
        sb.append(", contentIncarnation=");
        sb.append(str);
        sb.append(", lastIndexedSeqno=");
        sb.append(j);
        sb.append(", lastCommittedSeqno=");
        sb.append(j2);
        sb.append(", committedNumDocuments=");
        sb.append(j3);
        sb.append(", counters=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.f9523a = z;
        this.f9524b = j;
        this.f9525c = j2;
        this.f9526d = j3;
        this.f9527e = bundle == null ? new Bundle() : bundle;
        this.f9528f = str;
        this.f9529g = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f9523a);
        see.m35036a(parcel, 2, this.f9524b);
        see.m35036a(parcel, 3, this.f9525c);
        see.m35036a(parcel, 4, this.f9526d);
        see.m35037a(parcel, 5, this.f9527e, false);
        see.m35046a(parcel, 6, this.f9528f, false);
        see.m35046a(parcel, 7, this.f9529g, false);
        see.m35062b(parcel, a);
    }
}
