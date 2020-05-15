package com.google.android.libraries.photos.backup.api;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class StatusResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bebb();

    /* renamed from: a */
    public final int f111404a;

    /* renamed from: b */
    public final long f111405b;

    /* renamed from: c */
    private final boolean f111406c;

    /* renamed from: d */
    private final PermissionAskingState f111407d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum PermissionAskingState {
        NOT_ASKED,
        ASKING,
        ASKED,
        ASKED_DO_NOT_ASK_AGAIN
    }

    public StatusResult(Parcel parcel) {
        this.f111404a = parcel.readInt();
        this.f111405b = parcel.readLong();
        this.f111406c = beei.m91849a(parcel);
        this.f111407d = (PermissionAskingState) parcel.readSerializable();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f111404a);
        parcel.writeLong(this.f111405b);
        parcel.writeInt(this.f111406c ? 1 : 0);
        parcel.writeSerializable(this.f111407d);
    }
}
