package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* renamed from: frz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class frz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Uri uri = null;
        RegisterSectionInfo[] registerSectionInfoArr = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = null;
        Account account = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo = null;
        String str2 = null;
        String str3 = "0";
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    registerSectionInfoArr = (RegisterSectionInfo[]) sed.m35004b(parcel2, readInt, RegisterSectionInfo.CREATOR);
                    break;
                case 5:
                case 6:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 7:
                    globalSearchCorpusConfig = (GlobalSearchCorpusConfig) sed.m34998a(parcel2, readInt, GlobalSearchCorpusConfig.CREATOR);
                    break;
                case 8:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    account = (Account) sed.m34998a(parcel2, readInt, Account.CREATOR);
                    break;
                case 10:
                    registerCorpusIMEInfo = (RegisterCorpusIMEInfo) sed.m34998a(parcel2, readInt, RegisterCorpusIMEInfo.CREATOR);
                    break;
                case 11:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    i = sed.m35010g(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new RegisterCorpusInfo(str, str3, uri, registerSectionInfoArr, globalSearchCorpusConfig, z, account, registerCorpusIMEInfo, str2, z2, i);
    }
}
