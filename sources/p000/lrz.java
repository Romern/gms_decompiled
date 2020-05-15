package p000;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.NetworkStateImpl;
import com.google.android.gms.awareness.snapshot.internal.PowerStateImpl;
import com.google.android.gms.awareness.snapshot.internal.ScreenStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: lrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lrz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Snapshot[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ActivityRecognitionResult activityRecognitionResult = null;
        BeaconStateImpl beaconStateImpl = null;
        HeadphoneStateImpl headphoneStateImpl = null;
        Location location = null;
        NetworkStateImpl networkStateImpl = null;
        DataHolder dataHolder = null;
        PowerStateImpl powerStateImpl = null;
        ScreenStateImpl screenStateImpl = null;
        WeatherImpl weatherImpl = null;
        TimeIntervalsImpl timeIntervalsImpl = null;
        ContextData contextData = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) sed.m34998a(parcel, readInt, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    beaconStateImpl = (BeaconStateImpl) sed.m34998a(parcel, readInt, BeaconStateImpl.CREATOR);
                    break;
                case 4:
                    headphoneStateImpl = (HeadphoneStateImpl) sed.m34998a(parcel, readInt, HeadphoneStateImpl.CREATOR);
                    break;
                case 5:
                    location = (Location) sed.m34998a(parcel, readInt, Location.CREATOR);
                    break;
                case 6:
                    networkStateImpl = (NetworkStateImpl) sed.m34998a(parcel, readInt, NetworkStateImpl.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
                    break;
                case 8:
                    powerStateImpl = (PowerStateImpl) sed.m34998a(parcel, readInt, PowerStateImpl.CREATOR);
                    break;
                case 9:
                    screenStateImpl = (ScreenStateImpl) sed.m34998a(parcel, readInt, ScreenStateImpl.CREATOR);
                    break;
                case 10:
                    weatherImpl = (WeatherImpl) sed.m34998a(parcel, readInt, WeatherImpl.CREATOR);
                    break;
                case 11:
                    timeIntervalsImpl = (TimeIntervalsImpl) sed.m34998a(parcel, readInt, TimeIntervalsImpl.CREATOR);
                    break;
                case 12:
                    contextData = (ContextData) sed.m34998a(parcel, readInt, ContextData.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new Snapshot(activityRecognitionResult, beaconStateImpl, headphoneStateImpl, location, networkStateImpl, dataHolder, powerStateImpl, screenStateImpl, weatherImpl, timeIntervalsImpl, contextData);
    }
}
