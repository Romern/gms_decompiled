package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new hus();

    /* renamed from: a */
    public final PasswordRequestOptions f10212a;

    /* renamed from: b */
    public final GoogleIdTokenRequestOptions f10213b;

    /* renamed from: c */
    public final String f10214c;

    /* renamed from: d */
    public final boolean f10215d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new huz();

        /* renamed from: a */
        public final boolean f10216a;

        /* renamed from: b */
        public final String f10217b;

        /* renamed from: c */
        public final String f10218c;

        /* renamed from: d */
        public final boolean f10219d;

        /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
         method: sdo.a(java.lang.Object, java.lang.Object):void
         arg types: [java.lang.String, java.lang.String]
         candidates:
          sdo.a(int, java.lang.Object):void
          sdo.a(android.os.Handler, java.lang.String):void
          sdo.a(java.lang.String, android.content.ContentValues):void
          sdo.a(java.lang.String, java.lang.Object):void
          sdo.a(boolean, java.lang.Object):void
          sdo.a(java.lang.Object, java.lang.Object):void */
        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2) {
            this.f10216a = z;
            if (z) {
                sdo.m34966a((Object) str, (Object) "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f10217b = str;
            this.f10218c = str2;
            this.f10219d = z2;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof GoogleIdTokenRequestOptions) {
                GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
                if (this.f10216a != googleIdTokenRequestOptions.f10216a || !sdg.m34949a(this.f10217b, googleIdTokenRequestOptions.f10217b) || !sdg.m34949a(this.f10218c, googleIdTokenRequestOptions.f10218c) || this.f10219d != googleIdTokenRequestOptions.f10219d) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10216a), this.f10217b, this.f10218c, Boolean.valueOf(this.f10219d)});
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
            see.m35051a(parcel, 1, this.f10216a);
            see.m35046a(parcel, 2, this.f10217b, false);
            see.m35046a(parcel, 3, this.f10218c, false);
            see.m35051a(parcel, 4, this.f10219d);
            see.m35062b(parcel, a);
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new hvh();

        /* renamed from: a */
        public final boolean f10220a;

        public PasswordRequestOptions(boolean z) {
            this.f10220a = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.f10220a != ((PasswordRequestOptions) obj).f10220a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10220a)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = see.m35030a(parcel);
            see.m35051a(parcel, 1, this.f10220a);
            see.m35062b(parcel, a);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z) {
        sdo.m34959a(passwordRequestOptions);
        this.f10212a = passwordRequestOptions;
        sdo.m34959a(googleIdTokenRequestOptions);
        this.f10213b = googleIdTokenRequestOptions;
        this.f10214c = str;
        this.f10215d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BeginSignInRequest) {
            BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
            if (!sdg.m34949a(this.f10212a, beginSignInRequest.f10212a) || !sdg.m34949a(this.f10213b, beginSignInRequest.f10213b) || !sdg.m34949a(this.f10214c, beginSignInRequest.f10214c) || this.f10215d != beginSignInRequest.f10215d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10212a, this.f10213b, this.f10214c, Boolean.valueOf(this.f10215d)});
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
        see.m35040a(parcel, 1, this.f10212a, i, false);
        see.m35040a(parcel, 2, this.f10213b, i, false);
        see.m35046a(parcel, 3, this.f10214c, false);
        see.m35051a(parcel, 4, this.f10215d);
        see.m35062b(parcel, a);
    }
}
