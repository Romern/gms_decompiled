package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyc implements Parcelable.Creator {
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
    /* renamed from: a */
    public static void m81487a(BuyFlowConfig buyFlowConfig, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, buyFlowConfig.f110417a, false);
        see.m35040a(parcel, 3, buyFlowConfig.f110418b, i, false);
        see.m35046a(parcel, 4, buyFlowConfig.f110419c, false);
        see.m35046a(parcel, 5, buyFlowConfig.f110420d, false);
        see.m35046a(parcel, 6, buyFlowConfig.f110421e, false);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ApplicationParameters applicationParameters = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                applicationParameters = (ApplicationParameters) sed.m34998a(parcel, readInt, ApplicationParameters.CREATOR);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 5) {
                str3 = sed.m35020q(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                str4 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new BuyFlowConfig(str, applicationParameters, str2, str3, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowConfig[i];
    }
}
