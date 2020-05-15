package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.telephonyspam.CallSpamOptions;
import com.google.android.gms.telephonyspam.LookupSpamSettingsOptions;
import com.google.android.gms.telephonyspam.LookupSpamStatusOptions;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsNotSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsSpamOptions;
import com.google.android.gms.telephonyspam.UpdateSpamSettingsOptions;

/* renamed from: audn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class audn extends dck implements audo {
    public audn() {
        super("com.google.android.gms.telephonyspam.internal.ITelephonySpamService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        audm audm = null;
        rnt rnt = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        audm audm2 = null;
        rnt rnt4 = null;
        rnt rnt5 = null;
        audm audm3 = null;
        rnt rnt6 = null;
        audm audm4 = null;
        rnt rnt7 = null;
        rnt rnt8 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
                    if (queryLocalInterface instanceof audm) {
                        audm = (audm) queryLocalInterface;
                    } else {
                        audm = new audm(readStrongBinder);
                    }
                }
                mo50434a(audm, parcel.readString(), parcel.readInt());
                break;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt8 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo50438a(rnt8, parcel.readString(), parcel.readInt());
                break;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt7 = (rnt) queryLocalInterface3;
                    } else {
                        rnt7 = new rnr(readStrongBinder3);
                    }
                }
                mo50443b(rnt7, parcel.readString(), parcel.readInt());
                break;
            case 5:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
                    if (queryLocalInterface4 instanceof audm) {
                        audm4 = (audm) queryLocalInterface4;
                    } else {
                        audm4 = new audm(readStrongBinder4);
                    }
                }
                mo50432a(audm4, parcel.readInt());
                break;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface5 instanceof rnt) {
                        rnt6 = (rnt) queryLocalInterface5;
                    } else {
                        rnt6 = new rnr(readStrongBinder5);
                    }
                }
                mo50436a(rnt6, parcel.readInt(), dcl.m8167a(parcel));
                break;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
                    if (queryLocalInterface6 instanceof audm) {
                        audm3 = (audm) queryLocalInterface6;
                    } else {
                        audm3 = new audm(readStrongBinder6);
                    }
                }
                mo50435a(audm3, parcel.readString(), parcel.readInt(), (LookupSpamStatusOptions) dcl.m8163a(parcel, LookupSpamStatusOptions.CREATOR));
                break;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface7 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface7;
                    } else {
                        rnt5 = new rnr(readStrongBinder7);
                    }
                }
                mo50440a(rnt5, parcel.readString(), parcel.readInt(), (ReportAsSpamOptions) dcl.m8163a(parcel, ReportAsSpamOptions.CREATOR));
                break;
            case 9:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface8 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface8;
                    } else {
                        rnt4 = new rnr(readStrongBinder8);
                    }
                }
                mo50439a(rnt4, parcel.readString(), parcel.readInt(), (ReportAsNotSpamOptions) dcl.m8163a(parcel, ReportAsNotSpamOptions.CREATOR));
                break;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.telephonyspam.internal.ITelephonySpamCallbacks");
                    if (queryLocalInterface9 instanceof audm) {
                        audm2 = (audm) queryLocalInterface9;
                    } else {
                        audm2 = new audm(readStrongBinder9);
                    }
                }
                mo50433a(audm2, parcel.readInt(), (LookupSpamSettingsOptions) dcl.m8163a(parcel, LookupSpamSettingsOptions.CREATOR));
                break;
            case 11:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface10 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface10;
                    } else {
                        rnt3 = new rnr(readStrongBinder10);
                    }
                }
                mo50437a(rnt3, parcel.readInt(), dcl.m8167a(parcel), (UpdateSpamSettingsOptions) dcl.m8163a(parcel, UpdateSpamSettingsOptions.CREATOR));
                break;
            case 12:
            case 13:
            default:
                return false;
            case 14:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface11 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface11;
                    } else {
                        rnt2 = new rnr(readStrongBinder11);
                    }
                }
                mo50441a(rnt2, parcel.readString(), dcl.m8167a(parcel), (CallSpamOptions) dcl.m8163a(parcel, CallSpamOptions.CREATOR));
                break;
            case 15:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface12 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface12;
                    } else {
                        rnt = new rnr(readStrongBinder12);
                    }
                }
                mo50442a(rnt, parcel.readString(), dcl.m8167a(parcel), (MessageSpamOptions) dcl.m8163a(parcel, MessageSpamOptions.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
