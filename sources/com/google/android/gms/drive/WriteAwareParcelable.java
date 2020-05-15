package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class WriteAwareParcelable extends AbstractSafeParcelable {

    /* renamed from: a */
    public volatile transient boolean f30754a = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18132a(Parcel parcel, int i);

    public final void writeToParcel(Parcel parcel, int i) {
        sdo.m34970a(!this.f30754a);
        this.f30754a = true;
        mo18132a(parcel, i);
    }
}
