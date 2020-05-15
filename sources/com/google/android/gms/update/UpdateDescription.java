package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateDescription extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avlk();

    /* renamed from: a */
    public final String f109485a;

    /* renamed from: b */
    public final String f109486b;

    /* renamed from: c */
    public final String f109487c;

    public UpdateDescription(String str, String str2, String str3) {
        this.f109485a = str;
        this.f109486b = str2;
        this.f109487c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UpdateDescription) {
            UpdateDescription updateDescription = (UpdateDescription) obj;
            if (!updateDescription.f109485a.equals(this.f109485a) || !updateDescription.f109486b.equals(this.f109486b) || !updateDescription.f109487c.equals(this.f109487c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f109485a, this.f109486b, this.f109487c});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("title", this.f109485a);
        a.mo25396a("description", this.f109486b);
        a.mo25396a("size", this.f109487c);
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
        see.m35046a(parcel, 1, this.f109485a, false);
        see.m35046a(parcel, 2, this.f109486b, false);
        see.m35046a(parcel, 3, this.f109487c, false);
        see.m35062b(parcel, a);
    }
}
