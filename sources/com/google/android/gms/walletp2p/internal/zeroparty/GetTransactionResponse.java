package com.google.android.gms.walletp2p.internal.zeroparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetTransactionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axnp();

    /* renamed from: a */
    public Transaction f110817a;

    /* renamed from: b */
    public List f110818b;

    /* renamed from: c */
    public ErrorDetails f110819c;

    public GetTransactionResponse(ErrorDetails errorDetails) {
        this(null, null, errorDetails);
    }

    public GetTransactionResponse(Transaction transaction, List list) {
        this(transaction, list, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35040a(parcel, 2, this.f110817a, i, false);
        see.m35066c(parcel, 3, this.f110818b, false);
        see.m35040a(parcel, 4, this.f110819c, i, false);
        see.m35062b(parcel, a);
    }

    public GetTransactionResponse(Transaction transaction, List list, ErrorDetails errorDetails) {
        this.f110817a = transaction;
        this.f110818b = list;
        this.f110819c = errorDetails;
    }
}
