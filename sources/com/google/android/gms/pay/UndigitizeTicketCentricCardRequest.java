package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UndigitizeTicketCentricCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new algz();

    /* renamed from: a */
    public Account f81628a;

    /* renamed from: b */
    public long f81629b;

    /* renamed from: c */
    public int f81630c;

    private UndigitizeTicketCentricCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UndigitizeTicketCentricCardRequest) {
            UndigitizeTicketCentricCardRequest undigitizeTicketCentricCardRequest = (UndigitizeTicketCentricCardRequest) obj;
            return sdg.m34949a(this.f81628a, undigitizeTicketCentricCardRequest.f81628a) && sdg.m34949a(Long.valueOf(this.f81629b), Long.valueOf(undigitizeTicketCentricCardRequest.f81629b)) && sdg.m34949a(Integer.valueOf(this.f81630c), Integer.valueOf(undigitizeTicketCentricCardRequest.f81630c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81628a, Long.valueOf(this.f81629b), Integer.valueOf(this.f81630c)});
    }

    public UndigitizeTicketCentricCardRequest(Account account, long j, int i) {
        this.f81628a = account;
        this.f81629b = j;
        this.f81630c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81628a, i, false);
        see.m35036a(parcel, 2, this.f81629b);
        see.m35063b(parcel, 3, this.f81630c);
        see.m35062b(parcel, a);
    }
}
