package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Goal;

/* renamed from: ywz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Goal.FrequencyObjective[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Goal.FrequencyObjective(i);
    }
}
