package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;

/* renamed from: aose */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aose implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateRecurrenceOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        int i = 0;
        Long l = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                l = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new UpdateRecurrenceOptions(Integer.valueOf(i), Boolean.valueOf(z), l);
    }
}
