package p000;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.ArrayList;

/* renamed from: ajsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajsm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShareTarget[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Uri uri = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str2 = null;
        String str3 = null;
        PendingIntent pendingIntent = null;
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 6:
                    arrayList = sed.m35005c(parcel2, readInt, TextAttachment.CREATOR);
                    break;
                case 7:
                    arrayList2 = sed.m35005c(parcel2, readInt, FileAttachment.CREATOR);
                    break;
                case 8:
                    arrayList3 = sed.m35005c(parcel2, readInt, WifiCredentialsAttachment.CREATOR);
                    break;
                case 9:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 14:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ShareTarget(j, str, uri, i, bundle, arrayList, arrayList2, arrayList3, z, str2, z2, str3, pendingIntent, z3);
    }
}
