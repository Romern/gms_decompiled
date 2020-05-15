package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class HeadsetPiece implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aypy();

    /* renamed from: f */
    public static aypz m94492f() {
        return new aypz();
    }

    /* renamed from: a */
    public abstract int mo60340a();

    /* renamed from: b */
    public abstract int mo60341b();

    /* renamed from: c */
    public abstract String mo60342c();

    /* renamed from: d */
    public abstract boolean mo60343d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract Uri mo60344e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof HeadsetPiece) {
            HeadsetPiece headsetPiece = (HeadsetPiece) obj;
            return mo60340a() == headsetPiece.mo60340a() && mo60341b() == headsetPiece.mo60341b() && Objects.equals(mo60342c(), headsetPiece.mo60342c()) && mo60343d() == headsetPiece.mo60343d() && Objects.equals(mo60344e(), headsetPiece.mo60344e());
        }
    }

    /* renamed from: g */
    public final boolean mo60359g() {
        return mo60341b() <= mo60340a() && mo60341b() >= 0 && !mo60343d();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(mo60340a()), Integer.valueOf(mo60341b()), mo60342c(), Boolean.valueOf(mo60343d()), mo60344e()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo60342c());
        parcel.writeInt(mo60340a());
        parcel.writeInt(mo60341b());
        parcel.writeByte(mo60343d() ? (byte) 1 : 0);
        parcel.writeParcelable(mo60344e(), i);
    }
}
