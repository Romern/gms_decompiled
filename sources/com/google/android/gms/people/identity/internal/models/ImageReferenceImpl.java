package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.people.identity.models.ImageReference;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImageReferenceImpl extends AbstractSafeParcelable implements ImageReference {
    public static final Parcelable.Creator CREATOR = new alyc();

    /* renamed from: a */
    final Set f81721a;

    /* renamed from: b */
    int f81722b;

    /* renamed from: c */
    public String f81723c;

    /* renamed from: d */
    byte[] f81724d;

    public ImageReferenceImpl() {
        this.f81721a = new HashSet();
    }

    /* renamed from: a */
    public final void mo46271a(int i) {
        this.f81721a.add(2);
        this.f81722b = i;
    }

    /* renamed from: b */
    public final int mo40913b() {
        return this.f81722b;
    }

    /* renamed from: c */
    public final boolean mo40914c() {
        return this.f81723c != null;
    }

    /* renamed from: d */
    public final String mo40915d() {
        return this.f81723c;
    }

    /* renamed from: e */
    public final boolean mo40916e() {
        return this.f81724d != null;
    }

    /* renamed from: f */
    public final byte[] mo40917f() {
        return this.f81724d;
    }

    public ImageReferenceImpl(alyz alyz) {
        this();
        this.f81721a.remove(2);
        if (alyz.mo40912a()) {
            mo46271a(alyz.mo40913b());
        }
        this.f81723c = null;
        if (alyz.mo40914c()) {
            this.f81723c = alyz.mo40915d();
        }
        this.f81724d = null;
        if (alyz.mo40916e()) {
            this.f81724d = alyz.mo40917f();
        }
    }

    /* renamed from: a */
    public final boolean mo40912a() {
        return this.f81721a.contains(2);
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
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f81721a;
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f81722b);
        }
        if (set.contains(3)) {
            see.m35046a(parcel, 3, this.f81723c, true);
        }
        if (set.contains(4)) {
            see.m35052a(parcel, 4, this.f81724d, true);
        }
        see.m35062b(parcel, a);
    }

    public ImageReferenceImpl(Set set, int i, String str, byte[] bArr) {
        this.f81721a = set;
        this.f81722b = i;
        this.f81723c = str;
        this.f81724d = bArr;
    }
}
