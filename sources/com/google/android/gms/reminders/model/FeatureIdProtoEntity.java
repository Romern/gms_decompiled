package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeatureIdProtoEntity extends AbstractSafeParcelable implements FeatureIdProto {
    public static final Parcelable.Creator CREATOR = new aotp();

    /* renamed from: a */
    public final Long f107136a;

    /* renamed from: b */
    public final Long f107137b;

    public FeatureIdProtoEntity(FeatureIdProto featureIdProto) {
        this(featureIdProto.mo58645c(), featureIdProto.mo58646d());
    }

    /* renamed from: a */
    public static int m92064a(FeatureIdProto featureIdProto) {
        return Arrays.hashCode(new Object[]{featureIdProto.mo58645c(), featureIdProto.mo58646d()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Long mo58645c() {
        return this.f107136a;
    }

    /* renamed from: d */
    public final Long mo58646d() {
        return this.f107137b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this != obj) {
            return m92065a(this, (FeatureIdProto) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92064a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotp.m69507a(this, parcel);
    }

    public FeatureIdProtoEntity(Long l, Long l2) {
        this.f107136a = l;
        this.f107137b = l2;
    }

    /* renamed from: a */
    public static boolean m92065a(FeatureIdProto featureIdProto, FeatureIdProto featureIdProto2) {
        return sdg.m34949a(featureIdProto.mo58645c(), featureIdProto2.mo58645c()) && sdg.m34949a(featureIdProto.mo58646d(), featureIdProto2.mo58646d());
    }
}
