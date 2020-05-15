package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqb();

    /* renamed from: a */
    private final PublicKeyCredentialType f31779a;

    /* renamed from: b */
    private final COSEAlgorithmIdentifier f31780b;

    public PublicKeyCredentialParameters(String str, int i) {
        sdo.m34959a((Object) str);
        try {
            this.f31779a = PublicKeyCredentialType.m23492a(str);
            sdo.m34959a(Integer.valueOf(i));
            try {
                this.f31780b = COSEAlgorithmIdentifier.m23472a(i);
            } catch (xpo e) {
                throw new IllegalArgumentException(e);
            }
        } catch (xqg e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialParameters) {
            PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
            if (!this.f31779a.equals(publicKeyCredentialParameters.f31779a) || !this.f31780b.equals(publicKeyCredentialParameters.f31780b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31779a, this.f31780b});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f31779a.f31794b, false);
        see.m35044a(parcel, 3, Integer.valueOf(this.f31780b.f31736a.mo29977a()));
        see.m35062b(parcel, a);
    }
}
