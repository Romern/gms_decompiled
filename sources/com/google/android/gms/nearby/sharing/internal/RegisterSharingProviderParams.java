package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RegisterSharingProviderParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akao();

    /* renamed from: a */
    public rnt f81115a;

    /* renamed from: b */
    public ajyk f81116b;

    private RegisterSharingProviderParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterSharingProviderParams) {
            RegisterSharingProviderParams registerSharingProviderParams = (RegisterSharingProviderParams) obj;
            return sdg.m34949a(this.f81116b, registerSharingProviderParams.f81116b) && sdg.m34949a(this.f81115a, registerSharingProviderParams.f81115a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81116b, this.f81115a});
    }

    public RegisterSharingProviderParams(IBinder iBinder, IBinder iBinder2) {
        ajyk ajyk;
        rnt rnt = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IExternalSharingProvider");
            ajyk = queryLocalInterface instanceof ajyk ? (ajyk) queryLocalInterface : new ajyk(iBinder);
        } else {
            ajyk = null;
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface2 instanceof rnt) {
                rnt = (rnt) queryLocalInterface2;
            } else {
                rnt = new rnr(iBinder2);
            }
        }
        this.f81116b = ajyk;
        this.f81115a = rnt;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 1, this.f81116b.f12819a);
        see.m35038a(parcel, 2, this.f81115a.asBinder());
        see.m35062b(parcel, a);
    }
}
