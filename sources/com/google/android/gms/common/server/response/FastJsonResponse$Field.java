package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final sjb CREATOR = new sjb();

    /* renamed from: a */
    public final int f30313a;

    /* renamed from: b */
    public final int f30314b;

    /* renamed from: c */
    public final boolean f30315c;

    /* renamed from: d */
    public final int f30316d;

    /* renamed from: e */
    public final boolean f30317e;

    /* renamed from: f */
    public final String f30318f;

    /* renamed from: g */
    public final int f30319g;

    /* renamed from: h */
    public final Class f30320h;

    /* renamed from: i */
    protected final String f30321i;

    /* renamed from: j */
    public FieldMappingDictionary f30322j;

    /* renamed from: k */
    public StringToIntConverter f30323k;

    public FastJsonResponse$Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
        this.f30313a = i;
        this.f30314b = i2;
        this.f30315c = z;
        this.f30316d = i3;
        this.f30317e = z2;
        this.f30318f = str;
        this.f30319g = i4;
        StringToIntConverter stringToIntConverter = null;
        if (str2 != null) {
            this.f30320h = SafeParcelResponse.class;
            this.f30321i = str2;
        } else {
            this.f30320h = null;
            this.f30321i = null;
        }
        if (converterWrapper == null || (stringToIntConverter = converterWrapper.f30306b) != null) {
            this.f30323k = stringToIntConverter;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    /* renamed from: a */
    public static FastJsonResponse$Field m22650a(String str) {
        return new FastJsonResponse$Field(0, false, 0, false, str, -1, null, null);
    }

    /* renamed from: b */
    public static FastJsonResponse$Field m22655b(String str) {
        return new FastJsonResponse$Field(2, false, 2, false, str, -1, null, null);
    }

    /* renamed from: c */
    public static FastJsonResponse$Field m22659c(String str) {
        return new FastJsonResponse$Field(3, false, 3, false, str, -1, null, null);
    }

    /* renamed from: d */
    public static FastJsonResponse$Field m22661d(String str) {
        return new FastJsonResponse$Field(4, false, 4, false, str, -1, null, null);
    }

    /* renamed from: e */
    public static FastJsonResponse$Field m22663e(String str) {
        return new FastJsonResponse$Field(6, false, 6, false, str, -1, null, null);
    }

    /* renamed from: f */
    public static FastJsonResponse$Field m22665f(String str) {
        return new FastJsonResponse$Field(7, false, 7, false, str, -1, null, null);
    }

    /* renamed from: g */
    public static FastJsonResponse$Field m22667g(String str) {
        return new FastJsonResponse$Field(7, true, 7, true, str, -1, null, null);
    }

    /* renamed from: h */
    public static FastJsonResponse$Field m22669h(String str, int i) {
        return new FastJsonResponse$Field(8, false, 8, false, str, i, null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo17857a() {
        String str = this.f30321i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("versionCode", Integer.valueOf(this.f30313a));
        a.mo25396a("typeIn", Integer.valueOf(this.f30314b));
        a.mo25396a("typeInArray", Boolean.valueOf(this.f30315c));
        a.mo25396a("typeOut", Integer.valueOf(this.f30316d));
        a.mo25396a("typeOutArray", Boolean.valueOf(this.f30317e));
        a.mo25396a("outputFieldName", this.f30318f);
        a.mo25396a("safeParcelFieldId", Integer.valueOf(this.f30319g));
        a.mo25396a("concreteTypeName", mo17857a());
        Class cls = this.f30320h;
        if (cls != null) {
            a.mo25396a("concreteType.class", cls.getCanonicalName());
        }
        StringToIntConverter stringToIntConverter = this.f30323k;
        if (stringToIntConverter != null) {
            a.mo25396a("converterName", stringToIntConverter.getClass().getCanonicalName());
        }
        return a.toString();
    }

    /* renamed from: a */
    public static FastJsonResponse$Field m22651a(String str, int i) {
        return new FastJsonResponse$Field(0, false, 0, false, str, i, null, null);
    }

    /* renamed from: b */
    public static FastJsonResponse$Field m22656b(String str, int i) {
        return new FastJsonResponse$Field(2, false, 2, false, str, i, null, null);
    }

    /* renamed from: c */
    public static FastJsonResponse$Field m22660c(String str, int i) {
        return new FastJsonResponse$Field(3, false, 3, false, str, i, null, null);
    }

    /* renamed from: d */
    public static FastJsonResponse$Field m22662d(String str, int i) {
        return new FastJsonResponse$Field(4, false, 4, false, str, i, null, null);
    }

    /* renamed from: e */
    public static FastJsonResponse$Field m22664e(String str, int i) {
        return new FastJsonResponse$Field(6, false, 6, false, str, i, null, null);
    }

    /* renamed from: f */
    public static FastJsonResponse$Field m22666f(String str, int i) {
        return new FastJsonResponse$Field(7, false, 7, false, str, i, null, null);
    }

    /* renamed from: g */
    public static FastJsonResponse$Field m22668g(String str, int i) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i, null, null);
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
        see.m35063b(parcel, 1, this.f30313a);
        see.m35063b(parcel, 2, this.f30314b);
        see.m35051a(parcel, 3, this.f30315c);
        see.m35063b(parcel, 4, this.f30316d);
        see.m35051a(parcel, 5, this.f30317e);
        see.m35046a(parcel, 6, this.f30318f, false);
        see.m35063b(parcel, 7, this.f30319g);
        see.m35046a(parcel, 8, mo17857a(), false);
        see.m35040a(parcel, 9, mo17858b(), i, false);
        see.m35062b(parcel, a);
    }

    public FastJsonResponse$Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls, StringToIntConverter stringToIntConverter) {
        this.f30313a = 1;
        this.f30314b = i;
        this.f30315c = z;
        this.f30316d = i2;
        this.f30317e = z2;
        this.f30318f = str;
        this.f30319g = i3;
        this.f30320h = cls;
        this.f30321i = cls != null ? cls.getCanonicalName() : null;
        this.f30323k = stringToIntConverter;
    }

    /* renamed from: a */
    public static FastJsonResponse$Field m22652a(String str, int i, StringToIntConverter stringToIntConverter) {
        return new FastJsonResponse$Field(7, false, 0, false, str, i, null, stringToIntConverter);
    }

    /* renamed from: b */
    public static FastJsonResponse$Field m22657b(String str, int i, Class cls) {
        return new FastJsonResponse$Field(11, true, 11, true, str, i, cls, null);
    }

    /* renamed from: c */
    public final sio mo17859c() {
        Class cls = this.f30320h;
        if (cls != SafeParcelResponse.class) {
            return (sio) cls.newInstance();
        }
        sdo.m34966a(this.f30322j, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
        return new SafeParcelResponse(this.f30322j, this.f30321i);
    }

    /* renamed from: d */
    public final Map mo17860d() {
        sdo.m34959a((Object) this.f30321i);
        sdo.m34959a(this.f30322j);
        return this.f30322j.mo17866a(this.f30321i);
    }

    /* renamed from: a */
    public static FastJsonResponse$Field m22653a(String str, int i, Class cls) {
        return new FastJsonResponse$Field(11, false, 11, false, str, i, cls, null);
    }

    /* renamed from: b */
    public static FastJsonResponse$Field m22658b(String str, Class cls) {
        return new FastJsonResponse$Field(11, true, 11, true, str, -1, cls, null);
    }

    /* renamed from: a */
    public static FastJsonResponse$Field m22654a(String str, Class cls) {
        return new FastJsonResponse$Field(11, false, 11, false, str, -1, cls, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConverterWrapper mo17858b() {
        StringToIntConverter stringToIntConverter = this.f30323k;
        if (stringToIntConverter != null) {
            return new ConverterWrapper(stringToIntConverter);
        }
        return null;
    }
}
