package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WatchFaceDecomposition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class android.support.wearable.watchface.decomposition.WatchFaceDecomposition.C00261 */

        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WatchFaceDecomposition(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WatchFaceDecomposition[i];
        }
    };

    /* renamed from: a */
    private final List f1462a;

    /* renamed from: b */
    private final List f1463b;

    /* renamed from: c */
    private final List f1464c;

    /* renamed from: d */
    private final List f1465d;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Component {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface DrawnComponent extends Component {
    }

    public WatchFaceDecomposition(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        List parcelableArrayList = readBundle.getParcelableArrayList("images");
        List parcelableArrayList2 = readBundle.getParcelableArrayList("numbers");
        List parcelableArrayList3 = readBundle.getParcelableArrayList("fonts");
        List parcelableArrayList4 = readBundle.getParcelableArrayList("complications");
        this.f1462a = parcelableArrayList == null ? Collections.emptyList() : parcelableArrayList;
        this.f1463b = parcelableArrayList2 == null ? Collections.emptyList() : parcelableArrayList2;
        this.f1464c = parcelableArrayList3 == null ? Collections.emptyList() : parcelableArrayList3;
        this.f1465d = parcelableArrayList4 == null ? Collections.emptyList() : parcelableArrayList4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("images", new ArrayList(this.f1462a));
        bundle.putParcelableArrayList("numbers", new ArrayList(this.f1463b));
        bundle.putParcelableArrayList("fonts", new ArrayList(this.f1464c));
        bundle.putParcelableArrayList("complications", new ArrayList(this.f1465d));
        parcel.writeBundle(bundle);
    }
}
