package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.util.ArrayList;

/* renamed from: brsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShortDynamicLinkImpl[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Uri uri = null;
        Uri uri2 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                uri = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            } else if (a == 2) {
                uri2 = (Uri) sed.m34998a(parcel, readInt, Uri.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, ShortDynamicLinkImpl.WarningImpl.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ShortDynamicLinkImpl(uri, uri2, arrayList);
    }
}
