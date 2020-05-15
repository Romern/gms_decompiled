package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqh();

    /* renamed from: a */
    public final byte[] f31795a;

    /* renamed from: b */
    public final String f31796b;

    /* renamed from: c */
    public final String f31797c;

    /* renamed from: d */
    public final String f31798d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this.f31795a = (byte[]) sdo.m34959a(bArr);
        sdo.m34959a((Object) str);
        this.f31796b = str;
        this.f31797c = str2;
        sdo.m34959a((Object) str3);
        this.f31798d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialUserEntity) {
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
            if (!Arrays.equals(this.f31795a, publicKeyCredentialUserEntity.f31795a) || !sdg.m34949a(this.f31796b, publicKeyCredentialUserEntity.f31796b) || !sdg.m34949a(this.f31797c, publicKeyCredentialUserEntity.f31797c) || !sdg.m34949a(this.f31798d, publicKeyCredentialUserEntity.f31798d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31795a, this.f31796b, this.f31797c, this.f31798d});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, byte[], boolean):void
     arg types: [android.os.Parcel, int, byte[], int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void */
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
        see.m35052a(parcel, 2, this.f31795a, false);
        see.m35046a(parcel, 3, this.f31796b, false);
        see.m35046a(parcel, 4, this.f31797c, false);
        see.m35046a(parcel, 5, this.f31798d, false);
        see.m35062b(parcel, a);
    }
}
