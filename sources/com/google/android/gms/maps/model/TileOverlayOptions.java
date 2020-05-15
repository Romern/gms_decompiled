package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new afhq();

    /* renamed from: a */
    public boolean f79944a = true;

    /* renamed from: b */
    public float f79945b;

    /* renamed from: c */
    public boolean f79946c = true;

    /* renamed from: d */
    public float f79947d = 0.0f;

    /* renamed from: e */
    public afiq f79948e;

    public TileOverlayOptions() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 2, this.f79948e.f12819a);
        see.m35051a(parcel, 3, this.f79944a);
        see.m35034a(parcel, 4, this.f79945b);
        see.m35051a(parcel, 5, this.f79946c);
        see.m35034a(parcel, 6, this.f79947d);
        see.m35062b(parcel, a);
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        afiq afiq;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            afiq = queryLocalInterface instanceof afiq ? (afiq) queryLocalInterface : new afiq(iBinder);
        } else {
            afiq = null;
        }
        this.f79948e = afiq;
        if (afiq != null) {
            new afhp(this);
        }
        this.f79944a = z;
        this.f79945b = f;
        this.f79946c = z2;
        this.f79947d = f2;
    }
}
