package p000;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;

/* renamed from: awaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awaa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RecognitionOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Rect rect = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                rect = (Rect) sed.m34998a(parcel, readInt, Rect.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new RecognitionOptions(rect);
    }
}
