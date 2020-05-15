package com.google.android.gms.fido.credentialstore;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KeyData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xmp();

    /* renamed from: a */
    public final xmq f31682a;

    /* renamed from: b */
    public final boolean f31683b;

    /* renamed from: c */
    public final byte[] f31684c;

    /* renamed from: d */
    public final PublicKey f31685d;

    /* renamed from: e */
    public final PrivateKey f31686e;

    /* renamed from: f */
    public final String f31687f;

    /* renamed from: g */
    public final byte[] f31688g;

    /* renamed from: h */
    public final byte[] f31689h;

    public KeyData(int i, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, byte[] bArr4, byte[] bArr5) {
        PrivateKey privateKey;
        PublicKey publicKey;
        this.f31682a = xmq.m43182a(i);
        this.f31683b = z;
        this.f31684c = bArr;
        this.f31687f = str;
        PublicKey publicKey2 = null;
        if (bArr2 == null) {
            privateKey = null;
        } else if (bArr3 != null) {
            try {
                KeyFactory instance = KeyFactory.getInstance("EC");
                publicKey = instance.generatePublic(new X509EncodedKeySpec(bArr2));
                try {
                    privateKey = instance.generatePrivate(new PKCS8EncodedKeySpec(bArr3));
                    publicKey2 = publicKey;
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                    Log.e("KeyData", "unable to decode key pair");
                    privateKey = null;
                    publicKey2 = publicKey;
                    this.f31685d = publicKey2;
                    this.f31686e = privateKey;
                    this.f31688g = bArr4;
                    this.f31689h = bArr5;
                }
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
                publicKey = null;
                Log.e("KeyData", "unable to decode key pair");
                privateKey = null;
                publicKey2 = publicKey;
                this.f31685d = publicKey2;
                this.f31686e = privateKey;
                this.f31688g = bArr4;
                this.f31689h = bArr5;
            }
        } else {
            privateKey = null;
        }
        this.f31685d = publicKey2;
        this.f31686e = privateKey;
        this.f31688g = bArr4;
        this.f31689h = bArr5;
    }

    /* renamed from: a */
    public static KeyData m23436a(int i, byte[] bArr) {
        sdo.m34975b(bArr != null, "Parameters should not be empty.");
        return new KeyData(i, true, bArr, null, null, null, null, null);
    }

    /* renamed from: a */
    public static KeyData m23437a(int i, byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        if (!(bArr == null || str == null)) {
            z = true;
        }
        sdo.m34975b(z, "Parameters should not be empty.");
        sdo.m34975b(true, "Parameter should be false.");
        return new KeyData(i, false, bArr, null, null, str, bArr2, bArr3);
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
        byte[] bArr;
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f31682a.f52779d);
        see.m35051a(parcel, 2, this.f31683b);
        see.m35052a(parcel, 3, this.f31684c, false);
        PublicKey publicKey = this.f31685d;
        byte[] bArr2 = null;
        if (publicKey != null) {
            bArr = publicKey.getEncoded();
        } else {
            bArr = null;
        }
        see.m35052a(parcel, 4, bArr, false);
        PrivateKey privateKey = this.f31686e;
        if (privateKey != null) {
            bArr2 = privateKey.getEncoded();
        }
        see.m35052a(parcel, 5, bArr2, false);
        see.m35046a(parcel, 6, this.f31687f, false);
        see.m35052a(parcel, 7, this.f31688g, false);
        see.m35052a(parcel, 8, this.f31689h, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public static KeyData m23438a(byte[] bArr, KeyPair keyPair, String str, byte[] bArr2, byte[] bArr3) {
        boolean z = false;
        if (!(bArr == null || keyPair == null || str == null)) {
            z = true;
        }
        sdo.m34975b(z, "Parameters should not be empty.");
        sdo.m34975b(true, "Parameter should be false.");
        return new KeyData(xmq.SOFTWARE.f52779d, false, bArr, keyPair.getPublic().getEncoded(), keyPair.getPrivate().getEncoded(), str, bArr2, bArr3);
    }
}
