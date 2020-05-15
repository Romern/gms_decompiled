package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AudienceMember extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new sff();

    /* renamed from: a */
    public final int f30291a;

    /* renamed from: b */
    public final int f30292b;

    /* renamed from: c */
    public final int f30293c;

    /* renamed from: d */
    public final String f30294d;

    /* renamed from: e */
    public final String f30295e;

    /* renamed from: f */
    public final String f30296f;

    /* renamed from: g */
    public final String f30297g;
    @Deprecated

    /* renamed from: h */
    public final Bundle f30298h;

    public AudienceMember(int i, int i2, int i3, String str, String str2, String str3, String str4, Bundle bundle) {
        this.f30291a = i;
        this.f30292b = i2;
        this.f30293c = i3;
        this.f30294d = str;
        this.f30295e = str2;
        this.f30296f = str3;
        this.f30297g = str4;
        this.f30298h = bundle == null ? new Bundle() : bundle;
    }

    /* renamed from: a */
    public static AudienceMember m22638a(String str, String str2) {
        return m22641b(ancm.m64019h(str), str2, null);
    }

    /* renamed from: b */
    public static AudienceMember m22640b(String str, String str2) {
        return new AudienceMember(1, -1, str, null, str2, null);
    }

    /* renamed from: c */
    public static AudienceMember m22642c(String str, String str2) {
        Integer num = (Integer) ancm.f76630a.get(str);
        if (num == null) {
            num = (Integer) ancm.f76630a.get(null);
        }
        return new AudienceMember(1, num.intValue(), str, null, str2, null);
    }

    /* renamed from: a */
    public final boolean mo17845a() {
        return this.f30292b == 1 && this.f30293c == -1;
    }

    /* renamed from: b */
    public final boolean mo17846b() {
        return this.f30292b == 1 && this.f30293c != -1;
    }

    /* renamed from: c */
    public final boolean mo17847c() {
        return this.f30292b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudienceMember) {
            AudienceMember audienceMember = (AudienceMember) obj;
            if (this.f30291a == audienceMember.f30291a && this.f30292b == audienceMember.f30292b && this.f30293c == audienceMember.f30293c && sdg.m34949a(this.f30294d, audienceMember.f30294d) && sdg.m34949a(this.f30295e, audienceMember.f30295e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f30291a), Integer.valueOf(this.f30292b), Integer.valueOf(this.f30293c), this.f30294d, this.f30295e});
    }

    public final String toString() {
        if (mo17847c()) {
            return String.format("Person [%s] %s", this.f30295e, this.f30296f);
        } else if (mo17845a()) {
            return String.format("Circle [%s] %s", this.f30294d, this.f30296f);
        } else {
            return String.format("Group [%s] %s", this.f30294d, this.f30296f);
        }
    }

    /* renamed from: b */
    public static AudienceMember m22641b(String str, String str2, String str3) {
        return new AudienceMember(2, 0, null, str, str2, str3);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f30292b);
        see.m35063b(parcel, 2, this.f30293c);
        see.m35046a(parcel, 3, this.f30294d, false);
        see.m35046a(parcel, 4, this.f30295e, false);
        see.m35046a(parcel, 5, this.f30296f, false);
        see.m35046a(parcel, 6, this.f30297g, false);
        see.m35037a(parcel, 7, this.f30298h, false);
        see.m35063b(parcel, 1000, this.f30291a);
        see.m35062b(parcel, a);
    }

    private AudienceMember(int i, int i2, String str, String str2, String str3, String str4) {
        this(1, i, i2, str, str2, str3, str4, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public static AudienceMember m22639a(String str, String str2, String str3) {
        sdo.m34969a(str, (Object) "Person ID must not be empty.");
        return m22641b(ancm.m64017f(str), str2, str3);
    }
}
