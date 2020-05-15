package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.Event;

/* renamed from: ayot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayot implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Event[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ayou f = Event.m94486f();
        f.mo54175a(bvjc.m121167a(parcel.readInt()));
        f.mo54174a(parcel.readLong());
        f.f98133a = (Short) parcel.readValue(Short.class.getClassLoader());
        f.f98134b = (BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader());
        f.f98135c = (Exception) parcel.readSerializable();
        return f.mo54173a();
    }
}
