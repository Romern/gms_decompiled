package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

/* renamed from: iyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iyd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TokenResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        CaptchaChallenge captchaChallenge = null;
        String str9 = null;
        String str10 = null;
        PostSignInData postSignInData = null;
        Account account = null;
        String str11 = null;
        TokenData tokenData = null;
        String str12 = null;
        ResolutionData resolutionData = null;
        AuthzenBeginTxData authzenBeginTxData = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    captchaChallenge = (CaptchaChallenge) sed.m34998a(parcel2, readInt, CaptchaChallenge.CREATOR);
                    break;
                case 15:
                    arrayList = sed.m35005c(parcel2, readInt, ScopeDetail.CREATOR);
                    break;
                case 16:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    str10 = sed.m35020q(parcel2, readInt);
                    break;
                case 18:
                case 23:
                case 24:
                case 25:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 19:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 20:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 21:
                    postSignInData = (PostSignInData) sed.m34998a(parcel2, readInt, PostSignInData.CREATOR);
                    break;
                case 22:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 26:
                    str11 = sed.m35020q(parcel2, readInt);
                    break;
                case 27:
                    tokenData = (TokenData) sed.m34998a(parcel2, readInt, TokenData.CREATOR);
                    break;
                case 28:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 29:
                    str12 = sed.m35020q(parcel2, readInt);
                    break;
                case 30:
                    resolutionData = (ResolutionData) sed.m34998a(parcel2, readInt, ResolutionData.CREATOR);
                    break;
                case 31:
                    authzenBeginTxData = (AuthzenBeginTxData) sed.m34998a(parcel2, readInt, AuthzenBeginTxData.CREATOR);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new TokenResponse(i, str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, captchaChallenge, arrayList, str9, str10, z5, i2, postSignInData, account, str11, tokenData, bundle, str12, resolutionData, authzenBeginTxData);
    }
}
