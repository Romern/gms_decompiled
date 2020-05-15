package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;

/* renamed from: kza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kza implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UserFieldTypeManager[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int[] createIntArray = parcel.createIntArray();
        UserFieldTypeManager userFieldTypeManager = new UserFieldTypeManager();
        for (int i : createIntArray) {
            userFieldTypeManager.mo7965b(kpb.m18276a(i));
        }
        return userFieldTypeManager;
    }
}
