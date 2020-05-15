package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GetAllCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new asnq();

    /* renamed from: a */
    public CardInfo[] f108369a;

    /* renamed from: b */
    public AccountInfo f108370b;

    /* renamed from: c */
    public String f108371c;

    /* renamed from: d */
    public String f108372d;

    /* renamed from: e */
    public SparseArray f108373e;

    public GetAllCardsResponse(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray sparseArray) {
        this.f108369a = cardInfoArr;
        this.f108370b = accountInfo;
        this.f108371c = str;
        this.f108372d = str2;
        this.f108373e = sparseArray;
    }

    /* renamed from: a */
    public final String mo59225a(int i) {
        return (String) this.f108373e.get(i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35057a(parcel, 2, this.f108369a, i);
        see.m35040a(parcel, 3, this.f108370b, i, false);
        see.m35046a(parcel, 4, this.f108371c, false);
        see.m35046a(parcel, 5, this.f108372d, false);
        SparseArray sparseArray = this.f108373e;
        if (sparseArray != null) {
            int a2 = see.m35031a(parcel, 6);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString((String) sparseArray.valueAt(i2));
            }
            see.m35062b(parcel, a2);
        }
        see.m35062b(parcel, a);
    }
}
