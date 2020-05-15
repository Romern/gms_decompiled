package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pgi();

    /* renamed from: a */
    public int f29786a;

    /* renamed from: b */
    public String f29787b;

    /* renamed from: c */
    public List f29788c;

    /* renamed from: d */
    public List f29789d;

    /* renamed from: e */
    public double f29790e;

    public MediaQueueContainerMetadata() {
        mo17548a();
    }

    /* renamed from: a */
    public final void mo17548a() {
        this.f29786a = 0;
        this.f29787b = null;
        this.f29788c = null;
        this.f29789d = null;
        this.f29790e = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaQueueContainerMetadata) {
            MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
            return this.f29786a == mediaQueueContainerMetadata.f29786a && TextUtils.equals(this.f29787b, mediaQueueContainerMetadata.f29787b) && sdg.m34949a(this.f29788c, mediaQueueContainerMetadata.f29788c) && sdg.m34949a(this.f29789d, mediaQueueContainerMetadata.f29789d) && this.f29790e == mediaQueueContainerMetadata.f29790e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29786a), this.f29787b, this.f29788c, this.f29789d, Double.valueOf(this.f29790e)});
    }

    public MediaQueueContainerMetadata(int i, String str, List list, List list2, double d) {
        this.f29786a = i;
        this.f29787b = str;
        this.f29788c = list;
        this.f29789d = list2;
        this.f29790e = d;
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
        see.m35063b(parcel, 2, this.f29786a);
        see.m35046a(parcel, 3, this.f29787b, false);
        List list2 = this.f29788c;
        List list3 = null;
        if (list2 != null) {
            list = Collections.unmodifiableList(list2);
        } else {
            list = null;
        }
        see.m35066c(parcel, 4, list, false);
        List list4 = this.f29789d;
        if (list4 != null) {
            list3 = Collections.unmodifiableList(list4);
        }
        see.m35066c(parcel, 5, list3, false);
        see.m35033a(parcel, 6, this.f29790e);
        see.m35062b(parcel, a);
    }

    public MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata) {
        this.f29786a = mediaQueueContainerMetadata.f29786a;
        this.f29787b = mediaQueueContainerMetadata.f29787b;
        this.f29788c = mediaQueueContainerMetadata.f29788c;
        this.f29789d = mediaQueueContainerMetadata.f29789d;
        this.f29790e = mediaQueueContainerMetadata.f29790e;
    }
}
