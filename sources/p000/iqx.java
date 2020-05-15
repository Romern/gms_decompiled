package p000;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;

/* renamed from: iqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class iqx extends dck implements iqy {
    public iqx() {
        super("com.google.android.gms.auth.cryptauth.internal.ICryptauthService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        iru iru;
        iru iru2;
        isd isd;
        irr irr;
        iri iri;
        irf irf;
        rnr rnr;
        rnr rnr2;
        isi isi = null;
        irq irq = null;
        ire ire = null;
        ire ire2 = null;
        irz irz = null;
        irz irz2 = null;
        irn irn = null;
        isi isi2 = null;
        irb irb = null;
        isc isc = null;
        irb irb2 = null;
        isl isl = null;
        isl isl2 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
                    iru = queryLocalInterface instanceof irw ? (irw) queryLocalInterface : new iru(readStrongBinder);
                } else {
                    iru = null;
                }
                mo13278a(iru, parcel.readInt(), parcel.createStringArrayList(), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), dcl.m8168b(parcel), parcel.createByteArray());
                break;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyRegistrationResultCallback");
                    iru2 = queryLocalInterface2 instanceof irw ? (irw) queryLocalInterface2 : new iru(readStrongBinder2);
                } else {
                    iru2 = null;
                }
                mo13277a(iru2, parcel.readInt(), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.createByteArray(), parcel.createByteArray(), parcel.createByteArray());
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ISignedResultCallback");
                    if (queryLocalInterface3 instanceof isi) {
                        isi = (isi) queryLocalInterface3;
                    } else {
                        isi = new isg(readStrongBinder3);
                    }
                }
                mo13283a(isi, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), (Payload) dcl.m8163a(parcel, Payload.CREATOR));
                break;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ISignCryptResultCallback");
                    isd = queryLocalInterface4 instanceof isf ? (isf) queryLocalInterface4 : new isd(readStrongBinder4);
                } else {
                    isd = null;
                }
                mo13282a(isd, parcel.readString(), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), (Payload) dcl.m8163a(parcel, Payload.CREATOR));
                break;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
                    if (queryLocalInterface5 instanceof isl) {
                        isl2 = (isl) queryLocalInterface5;
                    } else {
                        isl2 = new isj(readStrongBinder5);
                    }
                }
                parcel.readString();
                mo13285a(isl2, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), (Payload) dcl.m8163a(parcel, Payload.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IVerifyDecryptCallback");
                    if (queryLocalInterface6 instanceof isl) {
                        isl = (isl) queryLocalInterface6;
                    } else {
                        isl = new isj(readStrongBinder6);
                    }
                }
                mo13286a(isl, parcel.readString(), parcel.createByteArray(), (Payload) dcl.m8163a(parcel, Payload.CREATOR));
                break;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
                    if (queryLocalInterface7 instanceof irb) {
                        irb2 = (irb) queryLocalInterface7;
                    } else {
                        irb2 = new iqz(readStrongBinder7);
                    }
                }
                mo13268a(irb2, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IRetrievePublicKeyCallback");
                    if (queryLocalInterface8 instanceof isc) {
                        isc = (isc) queryLocalInterface8;
                    } else {
                        isc = new isa(readStrongBinder8);
                    }
                }
                mo13281a(isc, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IExportedSymmetricKeyCallback");
                    if (queryLocalInterface9 instanceof irb) {
                        irb = (irb) queryLocalInterface9;
                    } else {
                        irb = new iqz(readStrongBinder9);
                    }
                }
                mo13269a(irb, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), (ClientPublicKey) dcl.m8163a(parcel, ClientPublicKey.CREATOR));
                break;
            case 11:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyInvalidationResultCallback");
                    irr = queryLocalInterface10 instanceof irt ? (irt) queryLocalInterface10 : new irr(readStrongBinder10);
                } else {
                    irr = null;
                }
                mo13276a(irr, parcel.readInt(), parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), dcl.m8168b(parcel));
                break;
            case 12:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.ISignedResultCallback");
                    if (queryLocalInterface11 instanceof isi) {
                        isi2 = (isi) queryLocalInterface11;
                    } else {
                        isi2 = new isg(readStrongBinder11);
                    }
                }
                mo13284a(isi2, parcel.createByteArray(), parcel.readString(), parcel.createByteArray());
                break;
            case 13:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHmacResultCallback");
                    iri = queryLocalInterface12 instanceof irk ? (irk) queryLocalInterface12 : new iri(readStrongBinder12);
                } else {
                    iri = null;
                }
                mo13273a(iri, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.createByteArray());
                break;
            case 14:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHkdfResultCallback");
                    irf = queryLocalInterface13 instanceof irh ? (irh) queryLocalInterface13 : new irf(readStrongBinder13);
                } else {
                    irf = null;
                }
                mo13272a(irf, (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.createByteArray());
                break;
            case 15:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IIncrementAndGetCounterCallback");
                    if (queryLocalInterface14 instanceof irn) {
                        irn = (irn) queryLocalInterface14;
                    } else {
                        irn = new irl(readStrongBinder14);
                    }
                }
                mo13274a(irn, parcel.createByteArray());
                break;
            case 16:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnr = queryLocalInterface15 instanceof rnt ? (rnt) queryLocalInterface15 : new rnr(readStrongBinder15);
                } else {
                    rnr = null;
                }
                mo13288a(rnr, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), parcel.createByteArray(), parcel.createStringArrayList());
                break;
            case 17:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
                    if (queryLocalInterface16 instanceof irz) {
                        irz2 = (irz) queryLocalInterface16;
                    } else {
                        irz2 = new irx(readStrongBinder16);
                    }
                }
                mo13280a(irz2, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 18:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IRetrieveDeviceSyncMetadataCallback");
                    if (queryLocalInterface17 instanceof irz) {
                        irz = (irz) queryLocalInterface17;
                    } else {
                        irz = new irx(readStrongBinder17);
                    }
                }
                mo13279a(irz, parcel.readString());
                break;
            case 19:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
                    if (queryLocalInterface18 instanceof ire) {
                        ire2 = (ire) queryLocalInterface18;
                    } else {
                        ire2 = new irc(readStrongBinder18);
                    }
                }
                mo13270a(ire2, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            case 20:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnr2 = queryLocalInterface19 instanceof rnt ? (rnt) queryLocalInterface19 : new rnr(readStrongBinder19);
                } else {
                    rnr2 = null;
                }
                mo13287a(rnr2, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR), parcel.readInt(), dcl.m8168b(parcel));
                break;
            case 21:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
                    if (queryLocalInterface20 instanceof ire) {
                        ire = (ire) queryLocalInterface20;
                    } else {
                        ire = new irc(readStrongBinder20);
                    }
                }
                mo13271a(ire, parcel.createByteArray());
                break;
            case 22:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.auth.cryptauth.internal.IKeyHandleResultCallback");
                    if (queryLocalInterface21 instanceof irq) {
                        irq = (irq) queryLocalInterface21;
                    } else {
                        irq = new iro(readStrongBinder21);
                    }
                }
                mo13275a(irq, parcel.readString(), (Account) dcl.m8163a(parcel, Account.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
