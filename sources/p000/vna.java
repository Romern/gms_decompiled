package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.p039ui.select.Selection;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* renamed from: vna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vna implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Selection(((FilterHolder) parcel.readParcelable(FilterHolder.class.getClassLoader())).f31112j, (DriveId) parcel.readParcelable(DriveId.class.getClassLoader()));
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Selection[0];
    }
}
