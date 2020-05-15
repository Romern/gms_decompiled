package com.google.android.contextmanager.fence;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FencePendingIntentCache$FencePendingIntentItem extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dty();

    /* renamed from: a */
    public final String f7703a;

    /* renamed from: b */
    public final PendingIntent f7704b;

    public FencePendingIntentCache$FencePendingIntentItem(String str, PendingIntent pendingIntent) {
        sdo.m34977c(str);
        this.f7703a = str;
        sdo.m34959a(pendingIntent);
        this.f7704b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FencePendingIntentCache$FencePendingIntentItem) {
            return this.f7703a.equals(((FencePendingIntentCache$FencePendingIntentItem) obj).f7703a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7703a});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("key", this.f7703a);
        a.mo25396a("p.Int", this.f7704b);
        return a.toString();
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
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f7703a, false);
        see.m35040a(parcel, 3, this.f7704b, i, false);
        see.m35062b(parcel, a);
    }
}
