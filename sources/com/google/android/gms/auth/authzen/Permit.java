package com.google.android.gms.auth.authzen;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Permit extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ifp();

    /* renamed from: a */
    final int f10381a;

    /* renamed from: b */
    public final String f10382b;

    /* renamed from: c */
    public final String f10383c;

    /* renamed from: d */
    public final String f10384d;

    /* renamed from: e */
    public final PermitAccess f10385e;

    /* renamed from: f */
    List f10386f;

    /* renamed from: g */
    public final Map f10387g;

    /* renamed from: h */
    List f10388h;

    /* renamed from: i */
    final Set f10389i;

    public Permit(int i, String str, String str2, String str3, PermitAccess permitAccess, Map map, Set set) {
        this.f10381a = i;
        sdo.m34977c(str);
        this.f10382b = str;
        sdo.m34977c(str2);
        this.f10383c = str2;
        sdo.m34977c(str3);
        this.f10384d = str3;
        sdo.m34959a(permitAccess);
        this.f10385e = permitAccess;
        this.f10387g = new LinkedHashMap(map);
        this.f10389i = new HashSet(set);
    }

    /* renamed from: a */
    public final List mo7543a() {
        return Collections.unmodifiableList(new ArrayList(this.f10389i));
    }

    /* renamed from: b */
    public final List mo7544b() {
        return Collections.unmodifiableList(new ArrayList(this.f10387g.values()));
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Permit) {
            Permit permit = (Permit) obj;
            return TextUtils.equals(this.f10383c, permit.f10383c) && TextUtils.equals(this.f10382b, permit.f10382b) && TextUtils.equals(this.f10384d, permit.f10384d) && this.f10385e.equals(permit.f10385e) && this.f10389i.equals(permit.f10389i) && this.f10387g.equals(permit.f10387g);
        }
    }

    public final int hashCode() {
        return ((((((((((this.f10382b.hashCode() + 527) * 31) + this.f10383c.hashCode()) * 31) + this.f10384d.hashCode()) * 31) + this.f10389i.hashCode()) * 31) + this.f10385e.hashCode()) * 31) + this.f10387g.hashCode();
    }

    public final String toString() {
        return String.format("Permit{ mVersion=%d, mId='%s', mAccountId='%s', mType='%s',  mLicense=%s, mAllowedChannels=%s, mRequesterAccesses=%s}", Integer.valueOf(this.f10381a), this.f10382b, this.f10383c, this.f10384d, this.f10385e, this.f10389i, this.f10387g);
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
        this.f10386f = new ArrayList(this.f10387g.values());
        this.f10388h = new ArrayList(this.f10389i);
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10381a);
        see.m35046a(parcel, 2, this.f10382b, false);
        see.m35046a(parcel, 3, this.f10383c, false);
        see.m35046a(parcel, 5, this.f10384d, false);
        see.m35040a(parcel, 6, this.f10385e, i, false);
        see.m35066c(parcel, 7, this.f10386f, false);
        see.m35065b(parcel, 8, this.f10388h, false);
        see.m35062b(parcel, a);
    }
}
