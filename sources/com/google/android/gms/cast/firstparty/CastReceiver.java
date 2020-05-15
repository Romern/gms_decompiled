package com.google.android.gms.cast.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pqq();

    /* renamed from: a */
    public final String f29880a;

    /* renamed from: b */
    public final String f29881b;

    /* renamed from: c */
    public final String f29882c;

    /* renamed from: d */
    private final List f29883d;

    public CastReceiver(String str, List list, String str2, String str3) {
        this.f29880a = str;
        this.f29883d = list;
        this.f29881b = str2;
        this.f29882c = str3;
    }

    /* renamed from: a */
    public final ArrayList mo17584a() {
        return new ArrayList(this.f29883d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CastReceiver) {
            CastReceiver castReceiver = (CastReceiver) obj;
            return ptk.m31236a(this.f29880a, castReceiver.f29880a) && ptk.m31236a(this.f29883d, castReceiver.f29883d) && ptk.m31236a(this.f29881b, castReceiver.f29881b) && ptk.m31236a(this.f29882c, castReceiver.f29882c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f29880a, this.f29883d, this.f29881b, this.f29882c});
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = this.f29880a;
        objArr[1] = this.f29881b;
        objArr[2] = this.f29882c;
        List list = this.f29883d;
        if (list != null) {
            str = TextUtils.join(",", list);
        } else {
            str = "NULL";
        }
        objArr[3] = str;
        return String.format(locale, "Device Cert: %s\n\tMessage: %s\n\tSignature: %s\n\t ICA:%s", objArr);
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
        see.m35046a(parcel, 2, this.f29880a, false);
        see.m35065b(parcel, 3, mo17584a(), false);
        see.m35046a(parcel, 4, this.f29881b, false);
        see.m35046a(parcel, 5, this.f29882c, false);
        see.m35062b(parcel, a);
    }
}
