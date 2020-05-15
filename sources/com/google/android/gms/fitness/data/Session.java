package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Session extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new yxp();

    /* renamed from: a */
    public final long f32166a;

    /* renamed from: b */
    public final long f32167b;

    /* renamed from: c */
    public final String f32168c;

    /* renamed from: d */
    public final String f32169d;

    /* renamed from: e */
    public final String f32170e;

    /* renamed from: f */
    public final int f32171f;

    /* renamed from: g */
    public final Application f32172g;

    /* renamed from: h */
    public final Long f32173h;

    public Session(long j, long j2, String str, String str2, String str3, int i, Application application, Long l) {
        this.f32166a = j;
        this.f32167b = j2;
        this.f32168c = str;
        this.f32169d = str2;
        this.f32170e = str3;
        this.f32171f = i;
        this.f32172g = application;
        this.f32173h = l;
    }

    /* renamed from: a */
    public final long mo18972a(TimeUnit timeUnit) {
        return timeUnit.convert(this.f32166a, TimeUnit.MILLISECONDS);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Session) {
            Session session = (Session) obj;
            return this.f32166a == session.f32166a && this.f32167b == session.f32167b && sdg.m34949a(this.f32168c, session.f32168c) && sdg.m34949a(this.f32169d, session.f32169d) && sdg.m34949a(this.f32170e, session.f32170e) && sdg.m34949a(this.f32172g, session.f32172g) && this.f32171f == session.f32171f;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32166a), Long.valueOf(this.f32167b), this.f32169d});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("startTime", Long.valueOf(this.f32166a));
        a.mo25396a("endTime", Long.valueOf(this.f32167b));
        a.mo25396a("name", this.f32168c);
        a.mo25396a("identifier", this.f32169d);
        a.mo25396a("description", this.f32170e);
        a.mo25396a("activity", Integer.valueOf(this.f32171f));
        a.mo25396a("application", this.f32172g);
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
        see.m35036a(parcel, 1, this.f32166a);
        see.m35036a(parcel, 2, this.f32167b);
        see.m35046a(parcel, 3, this.f32168c, false);
        see.m35046a(parcel, 4, this.f32169d, false);
        see.m35046a(parcel, 5, this.f32170e, false);
        see.m35063b(parcel, 7, this.f32171f);
        see.m35040a(parcel, 8, this.f32172g, i, false);
        see.m35045a(parcel, 9, this.f32173h);
        see.m35062b(parcel, a);
    }
}
