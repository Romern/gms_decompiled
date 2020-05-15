package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.folsom.SharedKey;

/* renamed from: jab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jab extends dck implements jac {
    public jab() {
        super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        izz izz = null;
        izw izw = null;
        jai jai = null;
        izw izw2 = null;
        jaf jaf = null;
        izz izz2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
                    if (queryLocalInterface instanceof izz) {
                        izz = (izz) queryLocalInterface;
                    } else {
                        izz = new izx(readStrongBinder);
                    }
                }
                mo13552a(izz, parcel.readString(), dcl.m8167a(parcel));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
                    izz2 = queryLocalInterface2 instanceof izz ? (izz) queryLocalInterface2 : new izx(readStrongBinder2);
                }
                mo13551a(izz2, parcel.readString());
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
                    if (queryLocalInterface3 instanceof jaf) {
                        jaf = (jaf) queryLocalInterface3;
                    } else {
                        jaf = new jad(readStrongBinder3);
                    }
                }
                mo13553a(jaf, parcel.readString());
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
                    if (queryLocalInterface4 instanceof izw) {
                        izw2 = (izw) queryLocalInterface4;
                    } else {
                        izw2 = new izu(readStrongBinder4);
                    }
                }
                mo13549a(izw2, parcel.readString());
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.auth.folsom.internal.ISharedKeyCallback");
                    if (queryLocalInterface5 instanceof jai) {
                        jai = (jai) queryLocalInterface5;
                    } else {
                        jai = new jag(readStrongBinder5);
                    }
                }
                mo13554a(jai, parcel.readString());
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalCallback");
                    if (queryLocalInterface6 instanceof izw) {
                        izw = (izw) queryLocalInterface6;
                    } else {
                        izw = new izu(readStrongBinder6);
                    }
                }
                mo13550a(izw, parcel.readString(), (SharedKey[]) parcel.createTypedArray(SharedKey.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
