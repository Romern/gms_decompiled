package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.p039ui.select.SelectFilePreferences;

/* renamed from: vmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vmz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        SelectFilePreferences selectFilePreferences = new SelectFilePreferences();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            selectFilePreferences.mo18328a(voc.m40914a(parcel.readString()), vob.m40913a(parcel.readString()));
        }
        return selectFilePreferences;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SelectFilePreferences[i];
    }
}
