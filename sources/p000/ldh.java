package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import com.google.android.gms.autofill.service.common.DetectionHistory;
import java.util.ArrayList;

/* renamed from: ldh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ldh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, AbstractDetectionHistory$DetectionResult.CREATOR);
        return new DetectionHistory(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DetectionHistory[i];
    }
}
