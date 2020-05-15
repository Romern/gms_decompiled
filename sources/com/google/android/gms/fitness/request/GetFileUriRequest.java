package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GetFileUriRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zes();

    /* renamed from: a */
    public final zbd f32257a;

    public GetFileUriRequest(IBinder iBinder) {
        zbd zbd;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IFileUriCallback");
            zbd = queryLocalInterface instanceof zbd ? (zbd) queryLocalInterface : new zbd(iBinder);
        } else {
            zbd = null;
        }
        this.f32257a = zbd;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "GetFileUriRequest {%s}", this.f32257a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f32257a.f12819a);
        see.m35062b(parcel, a);
    }
}
