package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: vuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vuo extends dcj implements vuq {
    public vuo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drivingmode.IDrivingModeManager");
    }

    /* renamed from: a */
    public final void mo28867a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(23, bj);
    }

    /* renamed from: b */
    public final void mo28873b(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(26, bj);
    }

    /* renamed from: c */
    public final String mo28877c() {
        Parcel a = mo8526a(8, mo8529bj());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final void mo28879d(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(17, bj);
    }

    /* renamed from: e */
    public final void mo28881e(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(19, bj);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* renamed from: f */
    public final void mo28883f(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        mo8528b(22, bj);
    }

    /* renamed from: g */
    public final boolean mo28885g() {
        Parcel a = mo8526a(16, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final boolean mo28886h() {
        Parcel a = mo8526a(18, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final boolean mo28887i() {
        Parcel a = mo8526a(21, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final int mo28888j() {
        Parcel a = mo8526a(24, mo8529bj());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: k */
    public final void mo28889k() {
        mo8528b(25, mo8529bj());
    }

    /* renamed from: l */
    public final boolean mo28890l() {
        Parcel a = mo8526a(27, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo28868a(String str, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8166a(bj, z);
        mo8528b(7, bj);
    }

    /* renamed from: b */
    public final void mo28874b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8528b(9, bj);
    }

    /* renamed from: c */
    public final void mo28878c(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(15, bj);
    }

    /* renamed from: d */
    public final boolean mo28880d() {
        Parcel a = mo8526a(10, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: e */
    public final boolean mo28882e() {
        Parcel a = mo8526a(12, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final boolean mo28884f() {
        Parcel a = mo8526a(14, mo8529bj());
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo28869a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(11, bj);
    }

    /* renamed from: b */
    public final void mo28875b(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final boolean mo28870a() {
        Parcel a = mo8526a(1, mo8529bj());
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
    /* renamed from: b */
    public final boolean mo28876b(boolean z, int i) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        bj.writeInt(i);
        Parcel a = mo8526a(3, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo28871a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(6, bj);
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
    /* renamed from: a */
    public final boolean mo28872a(boolean z, int i) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, true);
        bj.writeInt(i);
        Parcel a = mo8526a(2, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
