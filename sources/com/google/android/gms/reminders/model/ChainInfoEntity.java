package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChainInfoEntity extends AbstractSafeParcelable implements ChainInfo {
    public static final Parcelable.Creator CREATOR = new aoti();

    /* renamed from: a */
    public final String f107117a;

    /* renamed from: b */
    public final FeatureIdProtoEntity f107118b;

    public ChainInfoEntity(ChainInfo chainInfo) {
        String c = chainInfo.mo58621c();
        FeatureIdProto d = chainInfo.mo58622d();
        this.f107117a = c;
        this.f107118b = d != null ? new FeatureIdProtoEntity(d) : null;
    }

    /* renamed from: a */
    public static int m92013a(ChainInfo chainInfo) {
        return Arrays.hashCode(new Object[]{chainInfo.mo58621c(), chainInfo.mo58622d()});
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo58621c() {
        return this.f107117a;
    }

    /* renamed from: d */
    public final FeatureIdProto mo58622d() {
        return this.f107118b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        if (this != obj) {
            return m92014a(this, (ChainInfo) obj);
        }
        return true;
    }

    public final int hashCode() {
        return m92013a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aoti.m69496a(this, parcel, i);
    }

    /* renamed from: a */
    public static boolean m92014a(ChainInfo chainInfo, ChainInfo chainInfo2) {
        return sdg.m34949a(chainInfo.mo58621c(), chainInfo2.mo58621c()) && sdg.m34949a(chainInfo.mo58622d(), chainInfo2.mo58622d());
    }

    public ChainInfoEntity(String str, FeatureIdProtoEntity featureIdProtoEntity) {
        this.f107117a = str;
        this.f107118b = featureIdProtoEntity;
    }
}
