package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImageComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class android.support.wearable.watchface.decomposition.ImageComponent.C00221 */

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ImageComponent(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ImageComponent[i];
        }
    };

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Builder extends BaseDrawnComponent.BaseDrawnBuilder {
    }

    public ImageComponent(Parcel parcel) {
        super(parcel.readBundle());
        this.f1461a.setClassLoader(getClass().getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1461a);
    }
}
