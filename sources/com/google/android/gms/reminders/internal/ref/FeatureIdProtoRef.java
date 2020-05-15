package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.FeatureIdProto;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FeatureIdProtoRef extends aotf implements FeatureIdProto {
    public FeatureIdProtoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91897a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "cell_id"), i, i2) && dataHolder.mo17773f(aotf.m69487b(str, "fprint"), i, i2);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new FeatureIdProtoEntity(this);
    }

    /* renamed from: c */
    public final Long mo58645c() {
        return mo46855h(mo46858k("cell_id"));
    }

    /* renamed from: d */
    public final Long mo58646d() {
        return mo46855h(mo46858k("fprint"));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FeatureIdProto)) {
            return false;
        }
        if (this != obj) {
            return FeatureIdProtoEntity.m92065a(this, (FeatureIdProto) obj);
        }
        return true;
    }

    public final int hashCode() {
        return FeatureIdProtoEntity.m92064a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aotp.m69507a(new FeatureIdProtoEntity(this), parcel);
    }
}
