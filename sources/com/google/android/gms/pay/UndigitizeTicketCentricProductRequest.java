package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class UndigitizeTicketCentricProductRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alha();

    /* renamed from: a */
    public Account f81631a;

    /* renamed from: b */
    public long f81632b;

    /* renamed from: c */
    public long f81633c;

    /* renamed from: d */
    public int f81634d;

    private UndigitizeTicketCentricProductRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UndigitizeTicketCentricProductRequest) {
            UndigitizeTicketCentricProductRequest undigitizeTicketCentricProductRequest = (UndigitizeTicketCentricProductRequest) obj;
            return sdg.m34949a(this.f81631a, undigitizeTicketCentricProductRequest.f81631a) && sdg.m34949a(Long.valueOf(this.f81632b), Long.valueOf(undigitizeTicketCentricProductRequest.f81632b)) && sdg.m34949a(Long.valueOf(this.f81633c), Long.valueOf(undigitizeTicketCentricProductRequest.f81633c)) && sdg.m34949a(Integer.valueOf(this.f81634d), Integer.valueOf(undigitizeTicketCentricProductRequest.f81634d));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81631a, Long.valueOf(this.f81632b), Long.valueOf(this.f81633c), Integer.valueOf(this.f81634d)});
    }

    public UndigitizeTicketCentricProductRequest(Account account, long j, long j2, int i) {
        this.f81631a = account;
        this.f81632b = j;
        this.f81633c = j2;
        this.f81634d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81631a, i, false);
        see.m35036a(parcel, 2, this.f81632b);
        see.m35036a(parcel, 3, this.f81633c);
        see.m35063b(parcel, 4, this.f81634d);
        see.m35062b(parcel, a);
    }
}
