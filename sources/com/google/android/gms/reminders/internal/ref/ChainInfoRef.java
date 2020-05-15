package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.FeatureIdProto;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChainInfoRef extends aotf implements ChainInfo {

    /* renamed from: f */
    private boolean f107056f = false;

    /* renamed from: g */
    private FeatureIdProtoRef f107057g;

    public ChainInfoRef(DataHolder dataHolder, int i, String str) {
        super(dataHolder, i, str);
    }

    /* renamed from: a */
    public static boolean m91874a(DataHolder dataHolder, int i, int i2, String str) {
        return dataHolder.mo17773f(aotf.m69487b(str, "chain_name"), i, i2) && FeatureIdProtoRef.m91897a(dataHolder, i, i2, str.concat("chain_id_"));
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new ChainInfoEntity(this);
    }

    /* renamed from: c */
    public final String mo58621c() {
        return mo25151d(mo46858k("chain_name"));
    }

    /* renamed from: d */
    public final FeatureIdProto mo58622d() {
        if (!this.f107056f) {
            this.f107056f = true;
            this.f107057g = !FeatureIdProtoRef.m91897a(this.f43672a, this.f43673b, this.f83582e, this.f83581d.concat("chain_id_")) ? new FeatureIdProtoRef(this.f43672a, this.f43673b, this.f83581d.concat("chain_id_")) : null;
        }
        return this.f107057g;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this != obj) {
            return ChainInfoEntity.m92014a(this, (ChainInfo) obj);
        }
        return true;
    }

    public final int hashCode() {
        return ChainInfoEntity.m92013a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoti.m69496a(new ChainInfoEntity(this), parcel, i);
    }
}
