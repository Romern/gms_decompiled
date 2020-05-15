package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ConsentStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new agqk();

    /* renamed from: a */
    public int f80270a;

    public ConsentStatus() {
    }

    /* renamed from: a */
    public static boolean m67281a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentStatus) {
            return sdg.m34949a(Integer.valueOf(this.f80270a), Integer.valueOf(((ConsentStatus) obj).f80270a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f80270a)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("EnumVal", Integer.valueOf(this.f80270a));
        return a.toString();
    }

    public ConsentStatus(int i) {
        if (m67281a(i)) {
            this.f80270a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final bygb mo44081a() {
        return bygb.m124774a(this.f80270a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f80270a);
        see.m35062b(parcel, a);
    }
}
