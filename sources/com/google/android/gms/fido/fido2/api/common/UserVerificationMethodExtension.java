package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UserVerificationMethodExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqp();

    /* renamed from: a */
    public final boolean f31806a;

    public UserVerificationMethodExtension(boolean z) {
        this.f31806a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UserVerificationMethodExtension) || this.f31806a != ((UserVerificationMethodExtension) obj).f31806a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f31806a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35051a(parcel, 1, this.f31806a);
        see.m35062b(parcel, a);
    }
}
