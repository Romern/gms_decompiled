package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.languageprofile.LanguageFluency;

/* renamed from: adus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adus implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LanguageFluency[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        float f = 0.0f;
        String str = null;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                f = sed.m35015l(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                f2 = sed.m35015l(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new LanguageFluency(adwl.m51285b(str), f, f2);
    }
}
