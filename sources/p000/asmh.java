package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tapandpay.firstparty.BadgeInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InAppCvmConfig;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.OnlineAccountCardLinkInfo;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.firstparty.TransactionInfo;
import java.util.ArrayList;

/* renamed from: asmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asmh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CardInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        TokenStatus tokenStatus = null;
        String str4 = null;
        Uri uri = null;
        IssuerInfo issuerInfo = null;
        String str5 = null;
        TransactionInfo transactionInfo = null;
        String str6 = null;
        byte[] bArr2 = null;
        InStoreCvmConfig inStoreCvmConfig = null;
        InAppCvmConfig inAppCvmConfig = null;
        String str7 = null;
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 4:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    tokenStatus = (TokenStatus) sed.m34998a(parcel2, readInt, TokenStatus.CREATOR);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 10:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    issuerInfo = (IssuerInfo) sed.m34998a(parcel2, readInt, IssuerInfo.CREATOR);
                    break;
                case 13:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                case 19:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 15:
                    transactionInfo = (TransactionInfo) sed.m34998a(parcel2, readInt, TransactionInfo.CREATOR);
                    break;
                case 16:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 17:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                case 18:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 20:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 21:
                    i6 = sed.m35010g(parcel2, readInt);
                    break;
                case 22:
                    inStoreCvmConfig = (InStoreCvmConfig) sed.m34998a(parcel2, readInt, InStoreCvmConfig.CREATOR);
                    break;
                case 23:
                    inAppCvmConfig = (InAppCvmConfig) sed.m34998a(parcel2, readInt, InAppCvmConfig.CREATOR);
                    break;
                case 24:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 25:
                    onlineAccountCardLinkInfoArr = (OnlineAccountCardLinkInfo[]) sed.m35004b(parcel2, readInt, OnlineAccountCardLinkInfo.CREATOR);
                    break;
                case 26:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 27:
                    arrayList = sed.m35005c(parcel2, readInt, BadgeInfo.CREATOR);
                    break;
                case 28:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 29:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 30:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 31:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 32:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 33:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 34:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 35:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new CardInfo(str, bArr, str2, str3, i, tokenStatus, str4, uri, i2, i3, issuerInfo, str5, transactionInfo, str6, bArr2, i4, i5, i6, inStoreCvmConfig, inAppCvmConfig, str7, onlineAccountCardLinkInfoArr, z, arrayList, z2, z3, j, j2, z4, j3, str8, str9);
    }
}
