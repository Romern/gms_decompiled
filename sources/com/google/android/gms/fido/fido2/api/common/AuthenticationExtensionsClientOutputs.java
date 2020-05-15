package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xoz();

    /* renamed from: a */
    public UvmEntries f31718a;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries) {
        this.f31718a = uvmEntries;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticationExtensionsClientOutputs) {
            return sdg.m34949a(this.f31718a, ((AuthenticationExtensionsClientOutputs) obj).f31718a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31718a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f31718a, i, false);
        see.m35062b(parcel, a);
    }
}
