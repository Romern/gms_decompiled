package com.google.android.gms.wallet.service.reauth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReauthProofTokenRequest implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awxp();

    /* renamed from: a */
    public final Account f110393a;

    /* renamed from: b */
    public final String f110394b;

    /* renamed from: c */
    public final int f110395c;

    /* renamed from: d */
    public final int f110396d;

    public ReauthProofTokenRequest(Account account, String str, int i, int i2) {
        this.f110393a = account;
        this.f110394b = str;
        this.f110396d = i;
        this.f110395c = i2;
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f110393a.writeToParcel(parcel, i);
        parcel.writeString(this.f110394b);
        int i2 = this.f110396d;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f110395c);
            return;
        }
        throw null;
    }
}
