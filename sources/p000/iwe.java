package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.AccountNameCheckResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import java.util.ArrayList;

/* renamed from: iwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iwe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountNameCheckResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        CaptchaChallenge captchaChallenge = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                arrayList = sed.m34992D(parcel, readInt);
            } else if (a == 4) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                captchaChallenge = (CaptchaChallenge) sed.m34998a(parcel, readInt, CaptchaChallenge.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AccountNameCheckResponse(i, str, arrayList, str2, captchaChallenge);
    }
}
