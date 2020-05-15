package com.google.android.gms.drive.p039ui.select;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.drive.ui.select.SelectFilePreferences */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectFilePreferences implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new vmz();

    /* renamed from: a */
    private final Map f31197a = new HashMap();

    /* renamed from: a */
    public final voa mo18327a(voc voc) {
        sdo.m34959a(voc);
        voa voa = (voa) this.f31197a.get(voc);
        return voa == null ? voc.f49628g : voa;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31197a.size());
        for (Map.Entry entry : this.f31197a.entrySet()) {
            parcel.writeString(((voc) entry.getKey()).f49627f);
            parcel.writeString(((voa) entry.getValue()).mo28672a());
        }
    }

    /* renamed from: a */
    public final void mo18328a(voc voc, voa voa) {
        sdo.m34959a(voc);
        sdo.m34959a(voa);
        this.f31197a.put(voc, voa);
    }
}
