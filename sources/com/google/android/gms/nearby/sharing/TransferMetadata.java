package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransferMetadata extends AbstractSafeParcelable implements Cloneable {
    public static final Parcelable.Creator CREATOR = new ajuc();

    /* renamed from: a */
    public final int f81052a;

    /* renamed from: b */
    public final float f81053b;

    /* renamed from: c */
    public final String f81054c;

    /* renamed from: d */
    public final boolean f81055d;

    /* renamed from: e */
    public final boolean f81056e;

    public TransferMetadata(int i, float f, String str, boolean z, boolean z2) {
        this.f81052a = i;
        this.f81053b = f;
        this.f81054c = str;
        this.f81055d = z;
        this.f81056e = z2;
    }

    /* renamed from: a */
    public final TransferMetadata clone() {
        try {
            return (TransferMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransferMetadata) {
            TransferMetadata transferMetadata = (TransferMetadata) obj;
            return sdg.m34949a(Integer.valueOf(this.f81052a), Integer.valueOf(transferMetadata.f81052a)) && sdg.m34949a(Float.valueOf(this.f81053b), Float.valueOf(transferMetadata.f81053b)) && sdg.m34949a(this.f81054c, transferMetadata.f81054c) && sdg.m34949a(Boolean.valueOf(this.f81055d), Boolean.valueOf(transferMetadata.f81055d)) && sdg.m34949a(Boolean.valueOf(this.f81056e), Boolean.valueOf(transferMetadata.f81056e));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f81052a), Float.valueOf(this.f81053b), this.f81054c, Boolean.valueOf(this.f81055d), Boolean.valueOf(this.f81056e)});
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        switch (this.f81052a) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "CONNECTING";
                break;
            case 2:
                str = "AWAITING_LOCAL_CONFIRMATION";
                break;
            case 3:
                str = "AWAITING_REMOTE_ACCEPTANCE";
                break;
            case 4:
                str = "AWAITING_REMOTE_ACCEPTANCE_FAILED";
                break;
            case 5:
                str = "IN_PROGRESS";
                break;
            case 6:
                str = "COMPLETE";
                break;
            case 7:
                str = "FAILED";
                break;
            case 8:
                str = "REJECTED";
                break;
            case 9:
                str = "CANCELLED";
                break;
            case 10:
                str = "TIMED_OUT";
                break;
            case 11:
                str = "MEDIA_UNAVAILABLE";
                break;
            case 12:
                str = "MEDIA_DOWNLOADING";
                break;
            case 13:
                str = "NOT_ENOUGH_SPACE";
                break;
            case 14:
                str = "UNSUPPORTED_ATTACHMENT_TYPE";
                break;
            case 15:
                str = "EXTERNAL_PROVIDER_LAUNCHED";
                break;
            default:
                str = "INVALID_STATUS";
                break;
        }
        objArr[0] = str;
        objArr[1] = Float.valueOf(this.f81053b);
        objArr[2] = this.f81054c;
        objArr[3] = Boolean.valueOf(this.f81055d);
        objArr[4] = Boolean.valueOf(this.f81056e);
        return String.format(locale, "TransferMetadata<status: %s, progress: %s, token: %s, isOriginal: %s, isFinalStatus: %s>", objArr);
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
        see.m35063b(parcel, 1, this.f81052a);
        see.m35034a(parcel, 2, this.f81053b);
        see.m35046a(parcel, 3, this.f81054c, false);
        see.m35051a(parcel, 4, this.f81055d);
        see.m35051a(parcel, 5, this.f81056e);
        see.m35062b(parcel, a);
    }
}
