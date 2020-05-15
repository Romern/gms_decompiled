package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.plus.model.posts.Post;
import java.util.ArrayList;

/* renamed from: anxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Post[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Boolean bool = null;
        String str = null;
        ArrayList arrayList = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str5 = null;
        String str6 = null;
        Audience audience = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel2, readInt);
            } else if (a != 1000) {
                switch (a) {
                    case 3:
                        arrayList = sed.m35005c(parcel2, readInt, Uri.CREATOR);
                        continue;
                    case 4:
                        uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                        continue;
                    case 5:
                        str2 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 6:
                        str3 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 7:
                        str4 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 8:
                        bundle = sed.m35022s(parcel2, readInt);
                        continue;
                    case 9:
                        bundle2 = sed.m35022s(parcel2, readInt);
                        continue;
                    case 10:
                        str5 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 11:
                        bool = sed.m35007d(parcel2, readInt);
                        continue;
                    case 12:
                        str6 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 13:
                        audience = (Audience) sed.m34998a(parcel2, readInt, Audience.CREATOR);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new Post(i, str, arrayList, uri, str2, str3, str4, bundle, bundle2, str5, bool.booleanValue(), str6, audience);
    }
}
