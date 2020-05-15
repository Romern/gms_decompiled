package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xph();

    /* renamed from: a */
    public final Attachment f31729a;

    /* renamed from: b */
    public final Boolean f31730b;

    /* renamed from: c */
    private final UserVerificationRequirement f31731c;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2) {
        if (str != null) {
            try {
                this.f31729a = Attachment.m23443a(str);
            } catch (xou e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            this.f31729a = null;
        }
        this.f31730b = bool;
        if (str2 != null) {
            try {
                this.f31731c = UserVerificationRequirement.m23501a(str2);
            } catch (xqr e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.f31731c = null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticatorSelectionCriteria) {
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
            if (!sdg.m34949a(this.f31729a, authenticatorSelectionCriteria.f31729a) || !sdg.m34949a(this.f31730b, authenticatorSelectionCriteria.f31730b) || !sdg.m34949a(this.f31731c, authenticatorSelectionCriteria.f31731c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31729a, this.f31730b, this.f31731c});
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
        String str;
        int a = see.m35030a(parcel);
        Attachment attachment = this.f31729a;
        String str2 = null;
        if (attachment != null) {
            str = attachment.f31709c;
        } else {
            str = null;
        }
        see.m35046a(parcel, 2, str, false);
        see.m35041a(parcel, 3, this.f31730b);
        UserVerificationRequirement userVerificationRequirement = this.f31731c;
        if (userVerificationRequirement != null) {
            str2 = userVerificationRequirement.f31811d;
        }
        see.m35046a(parcel, 4, str2, false);
        see.m35062b(parcel, a);
    }
}
