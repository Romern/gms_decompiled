package p000;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: mqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mqb extends dck implements mqc {
    public mqb() {
        super("com.google.android.gms.backup.migrate.helper.ID2dMigrateHelper");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        mqf mqf;
        mqf mqf2;
        Parcel parcel3 = parcel;
        mqf mqf3 = null;
        mqf mqf4 = null;
        mqa mqa = null;
        mqf mqf5 = null;
        mqf mqf6 = null;
        mqf mqf7 = null;
        mqf mqf8 = null;
        mqf mqf9 = null;
        mqa mqa2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    mqf3 = queryLocalInterface instanceof mqf ? (mqf) queryLocalInterface : new mqf(readStrongBinder);
                }
                mo19890a(mqf3);
                return true;
            case 2:
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IBooleanCallbacks");
                    if (queryLocalInterface2 instanceof mqa) {
                        mqa2 = (mqa) queryLocalInterface2;
                    } else {
                        mqa2 = new mqa(readStrongBinder2);
                    }
                }
                mo19888a(readString, mqa2);
                return true;
            case 3:
                String readString2 = parcel.readString();
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) dcl.m8163a(parcel3, ParcelFileDescriptor.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    if (queryLocalInterface3 instanceof mqf) {
                        mqf9 = (mqf) queryLocalInterface3;
                    } else {
                        mqf9 = new mqf(readStrongBinder3);
                    }
                }
                mo19887a(readString2, parcelFileDescriptor, mqf9);
                return true;
            case 4:
                String readString3 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    if (queryLocalInterface4 instanceof mqf) {
                        mqf8 = (mqf) queryLocalInterface4;
                    } else {
                        mqf8 = new mqf(readStrongBinder4);
                    }
                }
                mo19889a(readString3, mqf8);
                return true;
            case 5:
                String readString4 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    if (queryLocalInterface5 instanceof mqf) {
                        mqf7 = (mqf) queryLocalInterface5;
                    } else {
                        mqf7 = new mqf(readStrongBinder5);
                    }
                }
                mo19892b(readString4, mqf7);
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    if (queryLocalInterface6 instanceof mqf) {
                        mqf6 = (mqf) queryLocalInterface6;
                    } else {
                        mqf6 = new mqf(readStrongBinder6);
                    }
                }
                mo19893b(mqf6);
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    if (queryLocalInterface7 instanceof mqf) {
                        mqf5 = (mqf) queryLocalInterface7;
                    } else {
                        mqf5 = new mqf(readStrongBinder7);
                    }
                }
                mo19895c(mqf5);
                return true;
            case 8:
                String readString5 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IBooleanCallbacks");
                    if (queryLocalInterface8 instanceof mqa) {
                        mqa = (mqa) queryLocalInterface8;
                    } else {
                        mqa = new mqa(readStrongBinder8);
                    }
                }
                mo19891b(readString5, mqa);
                return true;
            case 9:
                Account account = (Account) dcl.m8163a(parcel3, Account.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                byte[] createByteArray2 = parcel.createByteArray();
                byte[] createByteArray3 = parcel.createByteArray();
                ComponentName componentName = (ComponentName) dcl.m8163a(parcel3, ComponentName.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    mqf = queryLocalInterface9 instanceof mqf ? (mqf) queryLocalInterface9 : new mqf(readStrongBinder9);
                } else {
                    mqf = null;
                }
                mo19885a(account, createByteArray, createByteArray2, createByteArray3, componentName, mqf);
                return true;
            case 10:
                Account account2 = (Account) dcl.m8163a(parcel3, Account.CREATOR);
                byte[] createByteArray4 = parcel.createByteArray();
                byte[] createByteArray5 = parcel.createByteArray();
                byte[] createByteArray6 = parcel.createByteArray();
                byte[] createByteArray7 = parcel.createByteArray();
                byte[] createByteArray8 = parcel.createByteArray();
                int readInt = parcel.readInt();
                byte[] createByteArray9 = parcel.createByteArray();
                ComponentName componentName2 = (ComponentName) dcl.m8163a(parcel3, ComponentName.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    mqf2 = queryLocalInterface10 instanceof mqf ? (mqf) queryLocalInterface10 : new mqf(readStrongBinder10);
                } else {
                    mqf2 = null;
                }
                mo19886a(account2, createByteArray4, createByteArray5, createByteArray6, createByteArray7, createByteArray8, readInt, createByteArray9, componentName2, mqf2);
                return true;
            case 11:
                String readString6 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.backup.migrate.helper.IVoidCallbacks");
                    if (queryLocalInterface11 instanceof mqf) {
                        mqf4 = (mqf) queryLocalInterface11;
                    } else {
                        mqf4 = new mqf(readStrongBinder11);
                    }
                }
                mo19894c(readString6, mqf4);
                return true;
            default:
                return false;
        }
    }
}
