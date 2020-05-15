package p000;

import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: abce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class abce extends dck implements abcf {
    public abce() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    /* renamed from: a */
    public void mo31996a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo31998b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo32004c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo32006d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo32007e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public final void mo32008f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public final void mo32009g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final void mo32010h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo32000a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo32003b(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final void mo32005c(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo31999a(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo32001a(InProductHelp inProductHelp) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo32002a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo31999a((GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                TogglingData togglingData = (TogglingData) dcl.m8163a(parcel, TogglingData.CREATOR);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                mo31996a();
                return true;
            case 8:
                mo31998b();
                return true;
            case 9:
                mo32000a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                mo32004c();
                parcel2.writeNoException();
                return true;
            case 11:
                mo32006d();
                parcel2.writeNoException();
                return true;
            case 12:
                mo32007e();
                parcel2.writeNoException();
                return true;
            case 13:
                mo32002a(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 14:
                mo32008f();
                parcel2.writeNoException();
                return true;
            case 15:
                mo32003b(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 16:
                mo32009g();
                parcel2.writeNoException();
                return true;
            case 17:
                mo32001a((InProductHelp) dcl.m8163a(parcel, InProductHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                mo32005c(parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            case 19:
                mo32010h();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
