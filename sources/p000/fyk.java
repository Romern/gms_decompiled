package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appinvite.p015ui.context.section.SelectionSectionInfo;

/* renamed from: fyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fyk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SelectionSectionInfo(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SelectionSectionInfo[i];
    }
}
