package com.google.android.gms.ads.identifier.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.ads.identifier.internal.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0275b extends dcj implements C0277d {
    public C0275b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: a */
    public final String mo6493a() {
        Parcel a = mo8526a(1, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo6496b(String str, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8166a(bj, z);
        Parcel a = mo8526a(5, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final boolean mo6497c() {
        Parcel a = mo8526a(6, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: d */
    public final boolean mo6498d() {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        Parcel a = mo8526a(2, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final String mo6494a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(3, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo6495a(String str, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8166a(bj, z);
        mo8528b(4, bj);
    }
}
