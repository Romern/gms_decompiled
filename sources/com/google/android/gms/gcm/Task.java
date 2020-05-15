package com.google.android.gms.gcm;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class Task implements ReflectedParcelable {

    /* renamed from: c */
    public final String f32805c;

    /* renamed from: d */
    public final String f32806d;

    /* renamed from: e */
    public final boolean f32807e;

    /* renamed from: f */
    public final boolean f32808f;

    /* renamed from: g */
    public final aaly f32809g;

    @Deprecated
    public Task(Parcel parcel) {
        boolean z;
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.f32805c = parcel.readString();
        this.f32806d = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f32807e = z;
        this.f32808f = parcel.readInt() == 1 ? true : z2;
        Collections.emptySet();
        this.f32809g = aaly.f28427a;
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32805c);
        parcel.writeString(this.f32806d);
        parcel.writeInt(this.f32807e ? 1 : 0);
        parcel.writeInt(this.f32808f ? 1 : 0);
    }
}
