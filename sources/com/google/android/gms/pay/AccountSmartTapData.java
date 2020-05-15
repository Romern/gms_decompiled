package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AccountSmartTapData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alct();

    /* renamed from: a */
    public Account f81441a;

    /* renamed from: b */
    public byte[][] f81442b;

    /* renamed from: c */
    public byte[][] f81443c;

    private AccountSmartTapData() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountSmartTapData) {
            AccountSmartTapData accountSmartTapData = (AccountSmartTapData) obj;
            return sdg.m34949a(this.f81441a, accountSmartTapData.f81441a) && Arrays.equals(this.f81442b, accountSmartTapData.f81442b) && Arrays.equals(this.f81443c, accountSmartTapData.f81443c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f81441a, Integer.valueOf(Arrays.hashCode(this.f81442b)), Integer.valueOf(Arrays.hashCode(this.f81443c))});
    }

    public AccountSmartTapData(Account account, byte[][] bArr, byte[][] bArr2) {
        this.f81441a = account;
        this.f81442b = bArr;
        this.f81443c = bArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 1, this.f81441a, i, false);
        see.m35060a(parcel, 2, this.f81442b);
        see.m35060a(parcel, 3, this.f81443c);
        see.m35062b(parcel, a);
    }
}
