package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchAppCorpusFeatures;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;

/* renamed from: fri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fri implements Parcelable.Creator {
    /* renamed from: a */
    public static void m12223a(GlobalSearchApplication globalSearchApplication, Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, globalSearchApplication.f9559a, i, false);
        see.m35057a(parcel, 2, globalSearchApplication.f9560b, i);
        see.m35051a(parcel, 3, globalSearchApplication.f9561c);
        see.m35062b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        GlobalSearchApplicationInfo globalSearchApplicationInfo = null;
        GlobalSearchAppCorpusFeatures[] globalSearchAppCorpusFeaturesArr = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                globalSearchApplicationInfo = (GlobalSearchApplicationInfo) sed.m34998a(parcel, readInt, GlobalSearchApplicationInfo.CREATOR);
            } else if (a == 2) {
                globalSearchAppCorpusFeaturesArr = (GlobalSearchAppCorpusFeatures[]) sed.m35004b(parcel, readInt, GlobalSearchAppCorpusFeatures.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new GlobalSearchApplication(globalSearchApplicationInfo, globalSearchAppCorpusFeaturesArr, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchApplication[i];
    }
}
