package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeleteTicketCentricProductRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aldc();

    /* renamed from: a */
    public Account f81461a;

    /* renamed from: b */
    public long f81462b;

    /* renamed from: c */
    public int f81463c;

    private DeleteTicketCentricProductRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeleteTicketCentricProductRequest) {
            DeleteTicketCentricProductRequest deleteTicketCentricProductRequest = (DeleteTicketCentricProductRequest) obj;
            return sdg.m34949a(this.f81461a, deleteTicketCentricProductRequest.f81461a) && sdg.m34949a(Long.valueOf(this.f81462b), Long.valueOf(deleteTicketCentricProductRequest.f81462b)) && sdg.m34949a(Integer.valueOf(this.f81463c), Integer.valueOf(deleteTicketCentricProductRequest.f81463c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81461a, Long.valueOf(this.f81462b), Integer.valueOf(this.f81463c)});
    }

    public DeleteTicketCentricProductRequest(Account account, long j, int i) {
        this.f81461a = account;
        this.f81462b = j;
        this.f81463c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81461a, i, false);
        see.m35036a(parcel, 2, this.f81462b);
        see.m35063b(parcel, 3, this.f81463c);
        see.m35062b(parcel, a);
    }
}
