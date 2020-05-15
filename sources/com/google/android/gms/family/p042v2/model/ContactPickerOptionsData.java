package com.google.android.gms.family.p042v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.family.v2.model.ContactPickerOptionsData */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ContactPickerOptionsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new wqq();

    /* renamed from: a */
    public final String f31440a;

    /* renamed from: b */
    public final String f31441b;

    /* renamed from: c */
    public final String f31442c;

    /* renamed from: d */
    public final String f31443d;

    /* renamed from: e */
    public final String f31444e;

    /* renamed from: f */
    public final String f31445f;

    /* renamed from: g */
    public final String f31446g;

    /* renamed from: h */
    public final String f31447h;

    /* renamed from: i */
    public final String f31448i;

    /* renamed from: j */
    public int f31449j;

    /* renamed from: k */
    public int[] f31450k;

    public ContactPickerOptionsData(Parcel parcel) {
        this.f31440a = parcel.readString();
        this.f31441b = parcel.readString();
        this.f31442c = parcel.readString();
        this.f31443d = parcel.readString();
        this.f31444e = parcel.readString();
        this.f31445f = parcel.readString();
        this.f31446g = parcel.readString();
        this.f31447h = parcel.readString();
        this.f31448i = parcel.readString();
        this.f31449j = parcel.readInt();
        this.f31450k = parcel.createIntArray();
    }

    /* renamed from: a */
    public final void mo18549a(int[] iArr) {
        this.f31450k = Arrays.copyOf(iArr, iArr.length);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31440a);
        parcel.writeString(this.f31441b);
        parcel.writeString(this.f31442c);
        parcel.writeString(this.f31443d);
        parcel.writeString(this.f31444e);
        parcel.writeString(this.f31445f);
        parcel.writeString(this.f31446g);
        parcel.writeString(this.f31447h);
        parcel.writeString(this.f31448i);
        parcel.writeInt(this.f31449j);
        parcel.writeIntArray(this.f31450k);
    }

    public ContactPickerOptionsData(brbh brbh) {
        this.f31440a = brbh.f142252a;
        this.f31441b = brbh.f142253b;
        this.f31442c = brbh.f142254c;
        this.f31443d = brbh.f142255d;
        this.f31444e = brbh.f142256e;
        this.f31445f = brbh.f142257f;
        this.f31446g = brbh.f142258g;
        this.f31447h = brbh.f142259h;
        this.f31448i = brbh.f142260i;
    }
}
