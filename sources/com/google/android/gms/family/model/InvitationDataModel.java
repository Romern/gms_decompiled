package com.google.android.gms.family.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InvitationDataModel implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new wid();

    /* renamed from: a */
    public final String f31343a;

    /* renamed from: b */
    public final String f31344b;

    /* renamed from: c */
    public final String f31345c;

    /* renamed from: d */
    public final String f31346d;

    /* renamed from: e */
    public final String f31347e;

    /* renamed from: f */
    public final Long f31348f;

    /* renamed from: g */
    public final int f31349g;

    public InvitationDataModel(Parcel parcel) {
        this.f31343a = parcel.readString();
        this.f31344b = parcel.readString();
        this.f31345c = parcel.readString();
        this.f31346d = parcel.readString();
        this.f31347e = parcel.readString();
        int a = brdj.m113900a(parcel.readInt());
        this.f31349g = a == 0 ? 1 : a;
        this.f31348f = Long.valueOf(parcel.readLong());
    }

    /* renamed from: a */
    public final String mo18425a() {
        if (!TextUtils.isEmpty(this.f31344b)) {
            return this.f31344b;
        }
        return TextUtils.isEmpty(this.f31346d) ? stm.m36299a(this.f31345c) : this.f31346d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31343a);
        parcel.writeString(this.f31344b);
        parcel.writeString(this.f31345c);
        parcel.writeString(this.f31346d);
        parcel.writeString(this.f31347e);
        parcel.writeString(this.f31343a);
        parcel.writeInt(this.f31349g - 1);
        parcel.writeLong(this.f31348f.longValue());
    }

    public InvitationDataModel(String str, String str2, String str3, String str4, String str5, int i, Long l) {
        this.f31343a = str;
        this.f31344b = str2;
        this.f31345c = str3;
        this.f31346d = str4;
        this.f31347e = str5;
        this.f31349g = i;
        this.f31348f = l;
    }
}
