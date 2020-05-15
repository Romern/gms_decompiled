package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaActionType;

/* renamed from: aopz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecaptchaAction[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        RecaptchaActionType recaptchaActionType = new RecaptchaActionType("other");
        Bundle bundle = new Bundle();
        String str = "";
        String str2 = str;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                recaptchaActionType = (RecaptchaActionType) sed.m34998a(parcel, readInt, RecaptchaActionType.CREATOR);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                bundle = sed.m35022s(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new RecaptchaAction(recaptchaActionType, str, bundle, str2);
    }
}
