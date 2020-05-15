package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FontComponent extends BaseComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class android.support.wearable.watchface.decomposition.FontComponent.C00201 */

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FontComponent(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FontComponent[i];
        }
    };

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Builder extends BaseComponent.BaseBuilder {
    }

    public FontComponent(Parcel parcel) {
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
