package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import java.util.ArrayList;

/* renamed from: lde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lde implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AbstractDetectionHistory$DetectionResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        FillForm fillForm = parcel.readInt() == 1 ? (FillForm) parcel.readTypedObject(FillForm.CREATOR) : null;
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, FillField.CREATOR);
        return AbstractDetectionHistory$DetectionResult.m7160a(fillForm, arrayList);
    }
}
