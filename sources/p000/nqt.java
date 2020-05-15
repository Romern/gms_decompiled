package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarFrxEvent;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.CarUiInfo;
import java.util.List;

/* renamed from: nqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nqt extends dck implements nqu {
    public nqt() {
        super("com.google.android.gms.car.ICar");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nrl nrl = null;
        nss nss = null;
        nss nss2 = null;
        nrk nrk = null;
        nqv nqv = null;
        nqv nqv2 = null;
        nrl nrl2 = null;
        switch (i) {
            case 1:
                CarInfo o = mo21345o();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, o);
                return true;
            case 2:
                CarUiInfo r = mo21348r();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, r);
                return true;
            case 3:
                boolean l = mo21199l();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, l);
                return true;
            case 4:
                int t = mo21350t();
                parcel2.writeNoException();
                parcel2.writeInt(t);
                return true;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarConnectionListener");
                    if (queryLocalInterface instanceof nrl) {
                        nrl = (nrl) queryLocalInterface;
                    } else {
                        nrl = new nrl(readStrongBinder);
                    }
                }
                mo21283a(nrl);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarConnectionListener");
                    if (queryLocalInterface2 instanceof nrl) {
                        nrl2 = (nrl) queryLocalInterface2;
                    } else {
                        nrl2 = new nrl(readStrongBinder2);
                    }
                }
                mo21332b(nrl2);
                parcel2.writeNoException();
                return true;
            case 7:
                nso y = mo21355y();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, y);
                return true;
            case 8:
                nqx v = mo21352v();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, v);
                return true;
            case 9:
                nrz A = mo21238A();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, A);
                return true;
            case 10:
                boolean a = mo21293a((Intent) dcl.m8163a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 11:
                List b = mo21322b((Intent) dcl.m8163a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(b);
                return true;
            case 12:
                nri ae = mo21300ae();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, ae);
                return true;
            case 13:
                nsu a2 = mo21266a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a2);
                return true;
            case 14:
                nrt B = mo21239B();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, B);
                return true;
            case 15:
                nrr C = mo21240C();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, C);
                return true;
            case 16:
                nsc D = mo21241D();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, D);
                return true;
            case 17:
                nrw G = mo21244G();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, G);
                return true;
            case 18:
                nre H = mo21245H();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, H);
                return true;
            case 19:
                boolean b2 = mo21334b(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b2);
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarActivityStartListener");
                    if (queryLocalInterface3 instanceof nqv) {
                        nqv2 = (nqv) queryLocalInterface3;
                    } else {
                        nqv2 = new nqv(readStrongBinder3);
                    }
                }
                mo21281a(nqv2);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarActivityStartListener");
                    if (queryLocalInterface4 instanceof nqv) {
                        nqv = (nqv) queryLocalInterface4;
                    } else {
                        nqv = new nqv(readStrongBinder4);
                    }
                }
                mo21331b(nqv);
                parcel2.writeNoException();
                return true;
            case 22:
                mo21303ah();
                parcel2.writeNoException();
                return true;
            case 23:
                String b3 = mo21321b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b3);
                return true;
            case 24:
                mo21190a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 25:
                mo21192a(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                String c = mo21336c(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 27:
            case 30:
            case 31:
            case 33:
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
            case FelicaException.TYPE_RESET_FAILED:
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
            case 50:
            case 53:
            case 54:
            case FelicaException.TYPE_NOW_EXECUTING_FALP:
            case FelicaException.TYPE_INITIATE_ADHOC_ERROR:
            case 62:
            case 63:
            case 64:
            default:
                return false;
            case 28:
                mo21274a((CarFacet) dcl.m8163a(parcel, CarFacet.CREATOR));
                parcel2.writeNoException();
                return true;
            case 29:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.ICarCallback");
                    if (queryLocalInterface5 instanceof nrk) {
                        nrk = (nrk) queryLocalInterface5;
                    } else {
                        nrk = new nrk(readStrongBinder5);
                    }
                }
                mo21282a(nrk);
                parcel2.writeNoException();
                return true;
            case 32:
                nzv L = mo21249L();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, L);
                return true;
            case 34:
                mo21275a((CarFrxEvent) dcl.m8163a(parcel, CarFrxEvent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                nsi I = mo21246I();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, I);
                return true;
            case 36:
                nsl z = mo21356z();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, z);
                return true;
            case FelicaException.TYPE_NOT_CLOSED:
                List af = mo21301af();
                parcel2.writeNoException();
                parcel2.writeTypedList(af);
                return true;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                List ag = mo21302ag();
                parcel2.writeNoException();
                parcel2.writeTypedList(ag);
                return true;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                mo21276a((CarInfo) dcl.m8163a(parcel, CarInfo.CREATOR));
                parcel2.writeNoException();
                return true;
            case FelicaException.TYPE_PUSH_FAILED:
                List b4 = mo21323b((Intent) dcl.m8163a(parcel, Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedList(b4);
                return true;
            case 41:
                boolean e = mo21342e(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, e);
                return true;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                mo21277a((CarInfo) dcl.m8163a(parcel, CarInfo.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 47:
                ntb w = mo21353w();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, w);
                return true;
            case 48:
                mo21290a(parcel.createByteArray(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 51:
                nrp Y = mo21262Y();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, Y);
                return true;
            case 52:
                ntd k = mo21198k();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, k);
                return true;
            case 55:
                List b5 = mo21324b(parcel.readString(), parcel.createStringArrayList());
                parcel2.writeNoException();
                parcel2.writeStringList(b5);
                return true;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                mo21191a(parcel.readString(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 57:
                nsc E = mo21242E();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, E);
                return true;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                boolean f = mo21343f(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, f);
                return true;
            case FelicaException.TYPE_MFC_NOT_FOUND:
                mo21288a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case KeyInformation.AES128_DES56:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    if (queryLocalInterface6 instanceof nss) {
                        nss2 = (nss) queryLocalInterface6;
                    } else {
                        nss2 = new nss(readStrongBinder6);
                    }
                }
                mo21284a(nss2);
                parcel2.writeNoException();
                return true;
            case 66:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.car.ICarUiInfoChangedListener");
                    if (queryLocalInterface7 instanceof nss) {
                        nss = (nss) queryLocalInterface7;
                    } else {
                        nss = new nss(readStrongBinder7);
                    }
                }
                mo21333b(nss);
                parcel2.writeNoException();
                return true;
            case KeyInformation.AES128_DES112:
                boolean c2 = mo21339c(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, c2);
                return true;
            case 68:
                int a3 = mo21265a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(a3);
                return true;
            case 69:
                mo21330b(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 70:
                int c3 = mo21335c(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(c3);
                return true;
            case 71:
                boolean d = mo21341d(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                return true;
            case 72:
                String c4 = mo21337c(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(c4);
                return true;
            case 73:
                int d2 = mo21340d(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(d2);
                return true;
            case 74:
                double a4 = mo21264a(parcel.readString(), parcel.readDouble());
                parcel2.writeNoException();
                parcel2.writeDouble(a4);
                return true;
            case 75:
                boolean a5 = mo21295a((Intent) dcl.m8163a(parcel, Intent.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a5);
                return true;
            case 76:
                boolean J = mo21247J();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, J);
                return true;
            case 77:
                oap K = mo21248K();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, K);
                return true;
        }
    }
}
