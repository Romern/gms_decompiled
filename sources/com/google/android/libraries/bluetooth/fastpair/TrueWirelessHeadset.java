package com.google.android.libraries.bluetooth.fastpair;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class TrueWirelessHeadset implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ayqv();

    /* renamed from: a */
    public static boolean m94499a(int i) {
        return i >= 0 && i <= 100;
    }

    /* renamed from: i */
    public static ayqw m94500i() {
        ayqw ayqw = new ayqw();
        ayqw.mo54296b(0);
        ayqw.mo54295a("");
        ayqw.mo54293a(0);
        return ayqw;
    }

    /* renamed from: a */
    public abstract String mo60346a();

    /* renamed from: b */
    public abstract HeadsetPiece mo60347b();

    /* renamed from: c */
    public abstract HeadsetPiece mo60348c();

    /* renamed from: d */
    public abstract HeadsetPiece mo60349d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract long mo60350e();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrueWirelessHeadset) {
            TrueWirelessHeadset trueWirelessHeadset = (TrueWirelessHeadset) obj;
            return Objects.equals(mo60346a(), trueWirelessHeadset.mo60346a()) && Objects.equals(mo60347b(), trueWirelessHeadset.mo60347b()) && Objects.equals(mo60348c(), trueWirelessHeadset.mo60348c()) && Objects.equals(mo60349d(), trueWirelessHeadset.mo60349d()) && Objects.equals(mo60353h(), trueWirelessHeadset.mo60353h()) && mo60350e() == trueWirelessHeadset.mo60350e() && Objects.equals(mo60351f(), trueWirelessHeadset.mo60351f()) && mo60352g() == trueWirelessHeadset.mo60352g();
        }
    }

    /* renamed from: f */
    public abstract String mo60351f();

    /* renamed from: g */
    public abstract long mo60352g();

    /* renamed from: h */
    public abstract Uri mo60353h();

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo60346a(), mo60347b(), mo60348c(), mo60349d(), mo60353h(), Long.valueOf(mo60350e()), mo60351f(), Long.valueOf(mo60352g())});
    }

    /* renamed from: j */
    public final int mo60365j() {
        int a = m94499a(mo60347b().mo60341b());
        if (m94499a(mo60348c().mo60341b())) {
            a++;
        }
        return m94499a(mo60349d().mo60341b()) ? a + 1 : a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mo60346a());
        mo60347b().writeToParcel(parcel, i);
        mo60348c().writeToParcel(parcel, i);
        mo60349d().writeToParcel(parcel, i);
        parcel.writeParcelable(mo60353h(), i);
        parcel.writeLong(mo60350e());
        parcel.writeString(mo60351f());
        parcel.writeLong(mo60352g());
    }
}
