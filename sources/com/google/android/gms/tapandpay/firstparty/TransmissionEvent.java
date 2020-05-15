package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TransmissionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aspf();

    /* renamed from: a */
    public int f108472a;

    /* renamed from: b */
    public PassInfo[] f108473b;

    /* renamed from: c */
    public boolean f108474c;

    /* renamed from: d */
    public int f108475d;

    /* renamed from: e */
    public TransmissionFailureUiInfo f108476e;

    private TransmissionEvent() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransmissionEvent) {
            TransmissionEvent transmissionEvent = (TransmissionEvent) obj;
            return sdg.m34949a(Integer.valueOf(this.f108472a), Integer.valueOf(transmissionEvent.f108472a)) && Arrays.equals(this.f108473b, transmissionEvent.f108473b) && sdg.m34949a(Boolean.valueOf(this.f108474c), Boolean.valueOf(transmissionEvent.f108474c)) && sdg.m34949a(Integer.valueOf(this.f108475d), Integer.valueOf(transmissionEvent.f108475d)) && sdg.m34949a(this.f108476e, transmissionEvent.f108476e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f108472a), Integer.valueOf(Arrays.hashCode(this.f108473b)), Boolean.valueOf(this.f108474c), Integer.valueOf(this.f108475d), this.f108476e});
    }

    public TransmissionEvent(int i, PassInfo[] passInfoArr, boolean z, int i2, TransmissionFailureUiInfo transmissionFailureUiInfo) {
        this.f108472a = i;
        this.f108473b = passInfoArr;
        this.f108474c = z;
        this.f108475d = i2;
        this.f108476e = transmissionFailureUiInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f108472a);
        see.m35057a(parcel, 2, this.f108473b, i);
        see.m35051a(parcel, 3, this.f108474c);
        see.m35063b(parcel, 4, this.f108475d);
        see.m35040a(parcel, 5, this.f108476e, i, false);
        see.m35062b(parcel, a);
    }
}
