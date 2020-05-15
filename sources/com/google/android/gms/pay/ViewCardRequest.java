package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ViewCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alhi();

    /* renamed from: a */
    public Account f81655a;

    /* renamed from: b */
    public GooglePaymentMethodId f81656b;

    private ViewCardRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ViewCardRequest) {
            ViewCardRequest viewCardRequest = (ViewCardRequest) obj;
            return sdg.m34949a(this.f81655a, viewCardRequest.f81655a) && sdg.m34949a(this.f81656b, viewCardRequest.f81656b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81655a, this.f81656b});
    }

    public ViewCardRequest(Account account, GooglePaymentMethodId googlePaymentMethodId) {
        this.f81655a = account;
        this.f81656b = googlePaymentMethodId;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81655a, i, false);
        see.m35040a(parcel, 2, this.f81656b, i, false);
        see.m35062b(parcel, a);
    }
}
