package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: sbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sbh implements Parcelable.Creator {
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
     arg types: [android.os.Parcel, int, android.os.Bundle, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void
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
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void */
    /* renamed from: a */
    public static void m34831a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, getServiceRequest.f30227a);
        see.m35063b(parcel, 2, getServiceRequest.f30228b);
        see.m35063b(parcel, 3, getServiceRequest.f30229c);
        see.m35046a(parcel, 4, getServiceRequest.f30230d, false);
        see.m35038a(parcel, 5, getServiceRequest.f30231e);
        see.m35057a(parcel, 6, getServiceRequest.f30232f, i);
        see.m35037a(parcel, 7, getServiceRequest.f30233g, false);
        see.m35040a(parcel, 8, getServiceRequest.f30234h, i, false);
        see.m35057a(parcel, 10, getServiceRequest.f30235i, i);
        see.m35057a(parcel, 11, getServiceRequest.f30236j, i);
        see.m35051a(parcel, 12, getServiceRequest.f30237k);
        see.m35063b(parcel, 13, getServiceRequest.f30238l);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) sed.m35004b(parcel2, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 8:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 9:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 10:
                    featureArr = (Feature[]) sed.m35004b(parcel2, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) sed.m35004b(parcel2, readInt, Feature.CREATOR);
                    break;
                case 12:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
