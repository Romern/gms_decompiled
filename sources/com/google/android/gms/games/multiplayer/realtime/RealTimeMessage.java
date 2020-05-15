package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RealTimeMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aafc();

    /* renamed from: a */
    private final String f32679a;

    /* renamed from: b */
    private final byte[] f32680b;

    /* renamed from: c */
    private final int f32681c;

    public RealTimeMessage(String str, byte[] bArr, int i) {
        sdo.m34959a((Object) str);
        this.f32679a = str;
        this.f32680b = (byte[]) ((byte[]) sdo.m34959a(bArr)).clone();
        this.f32681c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32679a);
        parcel.writeByteArray(this.f32680b);
        parcel.writeInt(this.f32681c);
    }
}
