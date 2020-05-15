package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.p039ui.select.path.PathElement;
import com.google.android.gms.drive.p039ui.select.path.PathStack;
import java.util.ArrayList;

/* renamed from: vnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PathStack[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (parcel.readByte() == 0) {
            return new PathStack((DriveId) parcel.readParcelable(DriveId.class.getClassLoader()));
        }
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, PathElement.class.getClassLoader());
        return new PathStack(arrayList);
    }
}
