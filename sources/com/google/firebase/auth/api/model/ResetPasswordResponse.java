package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ResetPasswordResponse extends AbstractSafeParcelable implements brpk {
    public static final Parcelable.Creator CREATOR = new brqx();

    /* renamed from: a */
    public String f152544a;

    /* renamed from: b */
    public String f152545b;

    /* renamed from: c */
    public String f152546c;

    /* renamed from: d */
    public MfaInfo f152547d;

    public ResetPasswordResponse() {
    }

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkkq.f124602f.mo74142c(7);
    }

    public ResetPasswordResponse(String str, String str2, String str3, MfaInfo mfaInfo) {
        this.f152544a = str;
        this.f152545b = str2;
        this.f152546c = str3;
        this.f152547d = mfaInfo;
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
        see.m35046a(parcel, 2, this.f152544a, false);
        see.m35046a(parcel, 3, this.f152545b, false);
        see.m35046a(parcel, 4, this.f152546c, false);
        see.m35040a(parcel, 5, this.f152547d, i, false);
        see.m35062b(parcel, a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        String str;
        if (bxxc instanceof bkkq) {
            bkkq bkkq = (bkkq) bxxc;
            this.f152544a = stm.m36300b(bkkq.f124605b);
            this.f152545b = stm.m36300b(bkkq.f124606c);
            bsmm a = bsmm.m115978a(bkkq.f124607d);
            if (a == null) {
                a = bsmm.OOB_REQ_TYPE_UNSPECIFIED;
            }
            int ordinal = a.ordinal();
            if (ordinal != 1) {
                switch (ordinal) {
                    case 4:
                        str = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str = "VERIFY_BEFORE_UPDATE_EMAIL";
                        break;
                    case 8:
                        str = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str = null;
                        break;
                }
            } else {
                str = "PASSWORD_RESET";
            }
            this.f152546c = str;
            if ((bkkq.f124604a & 16) != 0) {
                bkll bkll = bkkq.f124608e;
                if (bkll == null) {
                    bkll = bkll.f124790h;
                }
                this.f152547d = MfaInfo.m118902a(bkll);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of ResetPasswordResponse.");
    }
}
