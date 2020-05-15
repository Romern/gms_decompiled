package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ywr();

    /* renamed from: g */
    private static final String f32003g = caad.RAW.name().toLowerCase(Locale.ROOT);

    /* renamed from: h */
    private static final String f32004h = caad.DERIVED.name().toLowerCase(Locale.ROOT);

    /* renamed from: a */
    public final DataType f32005a;

    /* renamed from: b */
    public final int f32006b;

    /* renamed from: c */
    public final Device f32007c;

    /* renamed from: d */
    public final Application f32008d;

    /* renamed from: e */
    public final String f32009e;

    /* renamed from: f */
    public final String f32010f = m23679b();

    public DataSource(DataType dataType, int i, Device device, Application application, String str) {
        this.f32005a = dataType;
        this.f32006b = i;
        this.f32007c = device;
        this.f32008d = application;
        this.f32009e = str;
    }

    /* renamed from: b */
    private final String m23679b() {
        StringBuilder sb = new StringBuilder();
        sb.append(m23680c());
        sb.append(":");
        sb.append(this.f32005a.f32064a);
        if (this.f32008d != null) {
            sb.append(":");
            sb.append(this.f32008d.f31980b);
        }
        if (this.f32007c != null) {
            sb.append(":");
            sb.append(this.f32007c.mo18925a());
        }
        if (this.f32009e != null) {
            sb.append(":");
            sb.append(this.f32009e);
        }
        return sb.toString();
    }

    /* renamed from: c */
    private final String m23680c() {
        int i = this.f32006b;
        return i != 0 ? i != 1 ? f32004h : f32004h : f32003g;
    }

    /* renamed from: a */
    public final String mo18911a() {
        String str;
        String str2;
        String str3;
        int i = this.f32006b;
        if (i != 0) {
            str = i != 1 ? "?" : "d";
        } else {
            str = "r";
        }
        String a = this.f32005a.mo18916a();
        Application application = this.f32008d;
        String str4 = "";
        if (application == null) {
            str2 = str4;
        } else if (!application.equals(Application.f31979a)) {
            String valueOf = String.valueOf(this.f32008d.f31980b);
            str2 = valueOf.length() == 0 ? new String(":") : ":".concat(valueOf);
        } else {
            str2 = ":gms";
        }
        Device device = this.f32007c;
        if (device != null) {
            String str5 = device.f32074b;
            String str6 = device.f32075c;
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 2 + String.valueOf(str6).length());
            sb.append(":");
            sb.append(str5);
            sb.append(":");
            sb.append(str6);
            str3 = sb.toString();
        } else {
            str3 = str4;
        }
        String str7 = this.f32009e;
        if (str7 != null) {
            str4 = str7.length() == 0 ? new String(":") : ":".concat(str7);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(a).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(a);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataSource) {
            return this.f32010f.equals(((DataSource) obj).f32010f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32010f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSource{");
        sb.append(m23680c());
        if (this.f32008d != null) {
            sb.append(":");
            sb.append(this.f32008d);
        }
        if (this.f32007c != null) {
            sb.append(":");
            sb.append(this.f32007c);
        }
        if (this.f32009e != null) {
            sb.append(":");
            sb.append(this.f32009e);
        }
        sb.append(":");
        sb.append(this.f32005a);
        sb.append("}");
        return sb.toString();
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
        see.m35040a(parcel, 1, this.f32005a, i, false);
        see.m35063b(parcel, 3, this.f32006b);
        see.m35040a(parcel, 4, this.f32007c, i, false);
        see.m35040a(parcel, 5, this.f32008d, i, false);
        see.m35046a(parcel, 6, this.f32009e, false);
        see.m35062b(parcel, a);
    }

    public DataSource(ywq ywq) {
        this.f32005a = ywq.f54712a;
        this.f32006b = ywq.f54713b;
        this.f32007c = ywq.f54714c;
        this.f32008d = ywq.f54715d;
        this.f32009e = ywq.f54716e;
    }
}
