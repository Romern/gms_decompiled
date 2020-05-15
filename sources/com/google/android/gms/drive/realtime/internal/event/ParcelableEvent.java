package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ParcelableEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vkh();

    /* renamed from: a */
    final String f31150a;

    /* renamed from: b */
    final String f31151b;

    /* renamed from: c */
    final List f31152c;

    /* renamed from: d */
    final boolean f31153d;

    /* renamed from: e */
    final boolean f31154e;

    /* renamed from: f */
    final boolean f31155f;

    /* renamed from: g */
    final String f31156g;

    /* renamed from: h */
    final String f31157h;

    /* renamed from: i */
    final TextInsertedDetails f31158i;

    /* renamed from: j */
    final TextDeletedDetails f31159j;

    /* renamed from: k */
    final ValuesAddedDetails f31160k;

    /* renamed from: l */
    final ValuesRemovedDetails f31161l;

    /* renamed from: m */
    final ValuesSetDetails f31162m;

    /* renamed from: n */
    final ValueChangedDetails f31163n;

    /* renamed from: o */
    final ReferenceShiftedDetails f31164o;

    /* renamed from: p */
    final ObjectChangedDetails f31165p;

    /* renamed from: q */
    final FieldChangedDetails f31166q;

    public ParcelableEvent(String str, String str2, List list, boolean z, boolean z2, boolean z3, String str3, String str4, TextInsertedDetails textInsertedDetails, TextDeletedDetails textDeletedDetails, ValuesAddedDetails valuesAddedDetails, ValuesRemovedDetails valuesRemovedDetails, ValuesSetDetails valuesSetDetails, ValueChangedDetails valueChangedDetails, ReferenceShiftedDetails referenceShiftedDetails, ObjectChangedDetails objectChangedDetails, FieldChangedDetails fieldChangedDetails) {
        this.f31150a = str;
        this.f31151b = str2;
        this.f31152c = list;
        this.f31153d = z;
        this.f31154e = z2;
        this.f31155f = z3;
        this.f31156g = str3;
        this.f31157h = str4;
        this.f31158i = textInsertedDetails;
        this.f31159j = textDeletedDetails;
        this.f31160k = valuesAddedDetails;
        this.f31161l = valuesRemovedDetails;
        this.f31162m = valuesSetDetails;
        this.f31163n = valueChangedDetails;
        this.f31164o = referenceShiftedDetails;
        this.f31165p = objectChangedDetails;
        this.f31166q = fieldChangedDetails;
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
        see.m35046a(parcel, 2, this.f31150a, false);
        see.m35046a(parcel, 3, this.f31151b, false);
        see.m35065b(parcel, 4, this.f31152c, false);
        see.m35051a(parcel, 5, this.f31153d);
        see.m35046a(parcel, 6, this.f31156g, false);
        see.m35046a(parcel, 7, this.f31157h, false);
        see.m35040a(parcel, 8, this.f31158i, i, false);
        see.m35040a(parcel, 9, this.f31159j, i, false);
        see.m35040a(parcel, 10, this.f31160k, i, false);
        see.m35040a(parcel, 11, this.f31161l, i, false);
        see.m35040a(parcel, 12, this.f31162m, i, false);
        see.m35040a(parcel, 13, this.f31163n, i, false);
        see.m35040a(parcel, 14, this.f31164o, i, false);
        see.m35040a(parcel, 15, this.f31165p, i, false);
        see.m35051a(parcel, 16, this.f31154e);
        see.m35051a(parcel, 17, this.f31155f);
        see.m35040a(parcel, 18, this.f31166q, i, false);
        see.m35062b(parcel, a);
    }
}
