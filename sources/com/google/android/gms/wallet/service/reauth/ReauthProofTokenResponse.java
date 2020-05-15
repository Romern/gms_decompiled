package com.google.android.gms.wallet.service.reauth;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReauthProofTokenResponse implements Parcelable, awyg {
    public static final Parcelable.Creator CREATOR = new awxq();

    /* renamed from: a */
    public final String f110397a;

    /* renamed from: b */
    public final int f110398b;

    /* renamed from: c */
    public final long f110399c;

    public ReauthProofTokenResponse(String str, int i, long j) {
        this.f110397a = str;
        this.f110398b = i;
        this.f110399c = j;
    }

    /* renamed from: a */
    public static ReauthProofTokenResponse m94153a(int i, long j) {
        return new ReauthProofTokenResponse("", i, j);
    }

    /* renamed from: a */
    public final boolean mo52756a() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110397a);
        parcel.writeInt(this.f110398b);
        parcel.writeLong(this.f110399c);
    }
}
