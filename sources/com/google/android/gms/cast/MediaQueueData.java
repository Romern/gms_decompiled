package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgk();

    /* renamed from: a */
    public String f29791a;

    /* renamed from: b */
    public String f29792b;

    /* renamed from: c */
    public int f29793c;

    /* renamed from: d */
    public String f29794d;

    /* renamed from: e */
    public MediaQueueContainerMetadata f29795e;

    /* renamed from: f */
    public int f29796f;

    /* renamed from: g */
    public List f29797g;

    /* renamed from: h */
    public int f29798h;

    /* renamed from: i */
    public long f29799i;

    public MediaQueueData() {
        mo17552a();
    }

    /* renamed from: a */
    public final void mo17552a() {
        this.f29791a = null;
        this.f29792b = null;
        this.f29793c = 0;
        this.f29794d = null;
        this.f29796f = 0;
        this.f29797g = null;
        this.f29798h = 0;
        this.f29799i = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaQueueData) {
            MediaQueueData mediaQueueData = (MediaQueueData) obj;
            return TextUtils.equals(this.f29791a, mediaQueueData.f29791a) && TextUtils.equals(this.f29792b, mediaQueueData.f29792b) && this.f29793c == mediaQueueData.f29793c && TextUtils.equals(this.f29794d, mediaQueueData.f29794d) && sdg.m34949a(this.f29795e, mediaQueueData.f29795e) && this.f29796f == mediaQueueData.f29796f && sdg.m34949a(this.f29797g, mediaQueueData.f29797g) && this.f29798h == mediaQueueData.f29798h && this.f29799i == mediaQueueData.f29799i;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29791a, this.f29792b, Integer.valueOf(this.f29793c), this.f29794d, this.f29795e, Integer.valueOf(this.f29796f), this.f29797g, Integer.valueOf(this.f29798h), Long.valueOf(this.f29799i)});
    }

    public MediaQueueData(MediaQueueData mediaQueueData) {
        this.f29791a = mediaQueueData.f29791a;
        this.f29792b = mediaQueueData.f29792b;
        this.f29793c = mediaQueueData.f29793c;
        this.f29794d = mediaQueueData.f29794d;
        this.f29795e = mediaQueueData.f29795e;
        this.f29796f = mediaQueueData.f29796f;
        this.f29797g = mediaQueueData.f29797g;
        this.f29798h = mediaQueueData.f29798h;
        this.f29799i = mediaQueueData.f29799i;
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
    public final void writeToParcel(Parcel parcel, int i) {
        List list;
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f29791a, false);
        see.m35046a(parcel, 3, this.f29792b, false);
        see.m35063b(parcel, 4, this.f29793c);
        see.m35046a(parcel, 5, this.f29794d, false);
        see.m35040a(parcel, 6, this.f29795e, i, false);
        see.m35063b(parcel, 7, this.f29796f);
        List list2 = this.f29797g;
        if (list2 != null) {
            list = Collections.unmodifiableList(list2);
        } else {
            list = null;
        }
        see.m35066c(parcel, 8, list, false);
        see.m35063b(parcel, 9, this.f29798h);
        see.m35036a(parcel, 10, this.f29799i);
        see.m35062b(parcel, a);
    }

    public MediaQueueData(String str, String str2, int i, String str3, MediaQueueContainerMetadata mediaQueueContainerMetadata, int i2, List list, int i3, long j) {
        this.f29791a = str;
        this.f29792b = str2;
        this.f29793c = i;
        this.f29794d = str3;
        this.f29795e = mediaQueueContainerMetadata;
        this.f29796f = i2;
        this.f29797g = list;
        this.f29798h = i3;
        this.f29799i = j;
    }
}
