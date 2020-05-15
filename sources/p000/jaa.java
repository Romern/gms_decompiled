package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;

/* renamed from: jaa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jaa extends dcj implements jac {
    public jaa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
    }

    /* renamed from: a */
    public final void mo13549a(izw izw, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, izw);
        bj.writeString(str);
        mo8528b(4, bj);
    }

    /* renamed from: a */
    public final void mo13551a(izz izz, String str) {
        throw null;
    }

    /* renamed from: a */
    public final void mo13550a(izw izw, String str, SharedKey[] sharedKeyArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, izw);
        bj.writeString(str);
        bj.writeTypedArray(sharedKeyArr, 0);
        mo8528b(6, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: a */
    public final void mo13552a(izz izz, String str, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, izz);
        bj.writeString(str);
        dcl.m8166a(bj, true);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo13553a(jaf jaf, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jaf);
        bj.writeString(str);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo13554a(jai jai, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, jai);
        bj.writeString(str);
        mo8528b(5, bj);
    }
}
