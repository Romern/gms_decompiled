package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Goal;
import java.util.ArrayList;

/* renamed from: yxc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Goal[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        Goal.Recurrence recurrence = null;
        Goal.MetricObjective metricObjective = null;
        Goal.DurationObjective durationObjective = null;
        Goal.FrequencyObjective frequencyObjective = null;
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j2 = sed.m35012i(parcel, readInt);
                    break;
                case 2:
                    j = sed.m35012i(parcel, readInt);
                    break;
                case 3:
                    sed.m35000a(parcel, readInt, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    recurrence = (Goal.Recurrence) sed.m34998a(parcel, readInt, Goal.Recurrence.CREATOR);
                    break;
                case 5:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    metricObjective = (Goal.MetricObjective) sed.m34998a(parcel, readInt, Goal.MetricObjective.CREATOR);
                    break;
                case 7:
                    durationObjective = (Goal.DurationObjective) sed.m34998a(parcel, readInt, Goal.DurationObjective.CREATOR);
                    break;
                case 8:
                    frequencyObjective = (Goal.FrequencyObjective) sed.m34998a(parcel, readInt, Goal.FrequencyObjective.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Goal(j2, j, arrayList, recurrence, i, metricObjective, durationObjective, frequencyObjective);
    }
}
