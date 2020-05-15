package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RecordBulletinInteractionsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alfv();

    /* renamed from: a */
    public Account f81568a;

    /* renamed from: b */
    public ProtoSafeParcelable f81569b;

    private RecordBulletinInteractionsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecordBulletinInteractionsRequest) {
            RecordBulletinInteractionsRequest recordBulletinInteractionsRequest = (RecordBulletinInteractionsRequest) obj;
            return sdg.m34949a(this.f81568a, recordBulletinInteractionsRequest.f81568a) && sdg.m34949a(this.f81569b, recordBulletinInteractionsRequest.f81569b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81568a, this.f81569b});
    }

    public RecordBulletinInteractionsRequest(Account account, ProtoSafeParcelable protoSafeParcelable) {
        this.f81568a = account;
        this.f81569b = protoSafeParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81568a, i, false);
        see.m35040a(parcel, 2, this.f81569b, i, false);
        see.m35062b(parcel, a);
    }
}
