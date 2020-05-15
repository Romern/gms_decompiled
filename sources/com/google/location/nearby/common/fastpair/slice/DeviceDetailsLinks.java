package com.google.location.nearby.common.fastpair.slice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class DeviceDetailsLinks implements Parcelable {
    public static final Parcelable.Creator CREATOR = new butc();

    /* renamed from: h */
    public static butd m151151h() {
        return new butd();
    }

    /* renamed from: a */
    public abstract byte[] mo86671a();

    /* renamed from: b */
    public abstract boolean mo86672b();

    /* renamed from: c */
    public abstract String mo86673c();

    /* renamed from: d */
    public abstract String mo86674d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract boolean mo86675e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceDetailsLinks) {
            DeviceDetailsLinks deviceDetailsLinks = (DeviceDetailsLinks) obj;
            return Arrays.equals(mo86671a(), deviceDetailsLinks.mo86671a()) && mo86672b() == deviceDetailsLinks.mo86672b() && Objects.equals(mo86673c(), deviceDetailsLinks.mo86673c()) && Objects.equals(mo86674d(), deviceDetailsLinks.mo86674d()) && mo86675e() == deviceDetailsLinks.mo86675e() && mo86676f().equals(deviceDetailsLinks.mo86676f()) && mo86677g().equals(deviceDetailsLinks.mo86677g());
        }
    }

    /* renamed from: f */
    public abstract String mo86676f();

    /* renamed from: g */
    public abstract String mo86677g();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo86671a(), Boolean.valueOf(mo86672b()), mo86673c(), mo86674d(), Boolean.valueOf(mo86675e()), mo86676f(), mo86677g()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] a = mo86671a();
        parcel.writeInt(a.length);
        parcel.writeByteArray(a);
        parcel.writeByte(mo86672b() ? (byte) 1 : 0);
        parcel.writeString(mo86673c());
        parcel.writeString(mo86674d());
        parcel.writeByte(mo86675e() ? (byte) 1 : 0);
        parcel.writeString(mo86676f());
        parcel.writeString(mo86677g());
    }
}
