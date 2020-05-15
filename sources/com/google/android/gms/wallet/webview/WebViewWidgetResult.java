package com.google.android.gms.wallet.webview;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebViewWidgetResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axdl();

    /* renamed from: a */
    public final byte[] f110597a;

    public WebViewWidgetResult(Parcel parcel) {
        this.f110597a = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f110597a, ((WebViewWidgetResult) obj).f110597a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f110597a);
    }

    public WebViewWidgetResult(byte[] bArr) {
        this.f110597a = bArr;
    }
}
