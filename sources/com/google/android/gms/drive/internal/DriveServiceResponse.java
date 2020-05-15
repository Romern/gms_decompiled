package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DriveServiceResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new usy();

    /* renamed from: a */
    final IBinder f30846a;

    public DriveServiceResponse(IBinder iBinder) {
        this.f30846a = iBinder;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [sce, android.os.IBinder], assign insn: null */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    public DriveServiceResponse(sce r1) {
        this((IBinder) r1);
        r1.asBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35038a(parcel, 2, this.f30846a);
        see.m35062b(parcel, a);
    }
}
