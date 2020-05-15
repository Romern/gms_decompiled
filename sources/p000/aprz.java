package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;

/* renamed from: aprz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aprz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalQueryCall$Request[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        GlobalSearchQuerySpecification globalSearchQuerySpecification = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                globalSearchQuerySpecification = (GlobalSearchQuerySpecification) sed.m34998a(parcel, readInt, GlobalSearchQuerySpecification.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                bundle = sed.m35022s(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GlobalQueryCall$Request(str, i, i2, globalSearchQuerySpecification, bundle);
    }
}
