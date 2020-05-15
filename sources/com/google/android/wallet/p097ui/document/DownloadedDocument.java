package com.google.android.wallet.p097ui.document;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: com.google.android.wallet.ui.document.DownloadedDocument */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadedDocument implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bkif();

    /* renamed from: a */
    public final String f152299a;

    /* renamed from: b */
    public final String f152300b;

    public DownloadedDocument(Parcel parcel) {
        this.f152299a = parcel.readString();
        this.f152300b = parcel.readString();
    }

    /* renamed from: a */
    public final boolean mo72149a() {
        return TextUtils.isEmpty(this.f152299a);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152299a);
        parcel.writeString(this.f152300b);
    }

    public DownloadedDocument(String str, String str2) {
        this.f152299a = str;
        this.f152300b = str2;
    }
}
