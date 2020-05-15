package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApplicationInformation extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new iyy();

    /* renamed from: a */
    final int f10843a;

    /* renamed from: b */
    public String f10844b;

    /* renamed from: c */
    public String f10845c;

    /* renamed from: d */
    public boolean f10846d;

    /* renamed from: e */
    public boolean f10847e;

    public ApplicationInformation(int i, String str, String str2, boolean z, boolean z2) {
        this.f10843a = i;
        this.f10844b = str;
        this.f10845c = str2;
        this.f10846d = z;
        this.f10847e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApplicationInformation) {
            ApplicationInformation applicationInformation = (ApplicationInformation) obj;
            if (!TextUtils.equals(this.f10844b, applicationInformation.f10844b) || !TextUtils.equals(this.f10845c, applicationInformation.f10845c) || this.f10846d != applicationInformation.f10846d || this.f10847e != applicationInformation.f10847e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10844b, this.f10845c, Boolean.valueOf(this.f10846d), Boolean.valueOf(this.f10847e)});
    }

    public ApplicationInformation(String str, String str2, boolean z, boolean z2) {
        this.f10843a = 1;
        this.f10844b = str;
        this.f10845c = str2;
        this.f10846d = z;
        this.f10847e = z2;
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
        see.m35063b(parcel, 1, this.f10843a);
        see.m35046a(parcel, 2, this.f10844b, false);
        see.m35046a(parcel, 3, this.f10845c, false);
        see.m35051a(parcel, 4, this.f10846d);
        see.m35051a(parcel, 5, this.f10847e);
        see.m35062b(parcel, a);
    }
}
