package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WriteDocumentServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new awws();

    /* renamed from: d */
    public final Uri f110388d;

    /* renamed from: e */
    public final String f110389e;

    public WriteDocumentServerRequest(Account account, bmqu bmqu, Uri uri, String str) {
        super(account, (bxxk) bmqu.f130430f.mo74142c(7), bmqu);
        this.f110388d = uri;
        this.f110389e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f110327a.writeToParcel(parcel, 0);
        parcel.writeByteArray(mo59971b());
        Uri.writeToParcel(parcel, this.f110388d);
        parcel.writeString(this.f110389e);
    }

    public WriteDocumentServerRequest(Account account, byte[] bArr, Uri uri, String str) {
        super(account, (bxxk) bmqu.f130430f.mo74142c(7), bArr);
        this.f110388d = uri;
        this.f110389e = str;
    }
}
