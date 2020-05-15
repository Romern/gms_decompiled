package com.google.android.gms.plus.model.posts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Comment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anxq();

    /* renamed from: a */
    public final int f82541a;

    /* renamed from: b */
    public final String f82542b;

    /* renamed from: c */
    public final String f82543c;

    /* renamed from: d */
    public final String f82544d;

    /* renamed from: e */
    public final String f82545e;

    /* renamed from: f */
    public final String f82546f;

    public Comment(int i, String str, String str2, String str3, String str4, String str5) {
        this.f82541a = i;
        this.f82542b = str;
        this.f82543c = str2;
        this.f82544d = str3;
        this.f82545e = str4;
        this.f82546f = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Comment) {
            Comment comment = (Comment) obj;
            if (this.f82541a != comment.f82541a || !sdg.m34949a(this.f82543c, comment.f82543c) || !sdg.m34949a(this.f82544d, comment.f82544d) || !sdg.m34949a(this.f82545e, comment.f82545e) || !sdg.m34949a(this.f82546f, comment.f82546f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82541a), this.f82543c, this.f82544d, this.f82545e, this.f82546f});
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
        see.m35046a(parcel, 1, this.f82542b, false);
        see.m35046a(parcel, 2, this.f82543c, false);
        see.m35046a(parcel, 3, this.f82544d, false);
        see.m35046a(parcel, 4, this.f82545e, false);
        see.m35046a(parcel, 5, this.f82546f, false);
        see.m35063b(parcel, 1000, this.f82541a);
        see.m35062b(parcel, a);
    }
}
