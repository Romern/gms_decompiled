package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ViewTransactionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhm();

    /* renamed from: a */
    public Account f81661a;

    /* renamed from: b */
    public GoogleTransactionId f81662b;

    /* renamed from: c */
    public Transaction f81663c;

    private ViewTransactionRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewTransactionRequest) {
            ViewTransactionRequest viewTransactionRequest = (ViewTransactionRequest) obj;
            return sdg.m34949a(this.f81661a, viewTransactionRequest.f81661a) && sdg.m34949a(this.f81662b, viewTransactionRequest.f81662b) && sdg.m34949a(this.f81663c, viewTransactionRequest.f81663c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81661a, this.f81662b, this.f81663c});
    }

    public ViewTransactionRequest(Account account, GoogleTransactionId googleTransactionId, Transaction transaction) {
        this.f81661a = account;
        this.f81662b = googleTransactionId;
        this.f81663c = transaction;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81661a, i, false);
        see.m35040a(parcel, 2, this.f81662b, i, false);
        see.m35040a(parcel, 3, this.f81663c, i, false);
        see.m35062b(parcel, a);
    }
}
