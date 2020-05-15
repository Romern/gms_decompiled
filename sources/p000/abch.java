package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

/* renamed from: abch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abch extends dck implements abci {
    public abch() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        abcf abcf;
        abcf abcf2;
        abcf abcf3;
        abcf abcf4 = null;
        switch (i) {
            case 1:
                GoogleHelp googleHelp = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface;
                    } else {
                        abcf4 = new abcd(readStrongBinder);
                    }
                }
                mo32013a(googleHelp, abcf4);
                parcel2.writeNoException();
                return true;
            case 2:
                GoogleHelp googleHelp2 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                Bitmap bitmap = (Bitmap) dcl.m8163a(parcel, Bitmap.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface2 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface2;
                    } else {
                        abcf4 = new abcd(readStrongBinder2);
                    }
                }
                mo32023e(googleHelp2, abcf4);
                parcel2.writeNoException();
                return true;
            case 3:
                Bitmap bitmap2 = (Bitmap) dcl.m8163a(parcel, Bitmap.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface3 instanceof abcf) {
                        abcf abcf5 = (abcf) queryLocalInterface3;
                    } else {
                        new abcd(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface4 instanceof abcf) {
                        abcf abcf6 = (abcf) queryLocalInterface4;
                    } else {
                        new abcd(readStrongBinder4);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface5 instanceof abcf) {
                        abcf abcf7 = (abcf) queryLocalInterface5;
                    } else {
                        new abcd(readStrongBinder5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface6 instanceof abcf) {
                        abcf abcf8 = (abcf) queryLocalInterface6;
                    } else {
                        new abcd(readStrongBinder6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface7 instanceof abcf) {
                        abcf abcf9 = (abcf) queryLocalInterface7;
                    } else {
                        new abcd(readStrongBinder7);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                long readLong = parcel.readLong();
                GoogleHelp googleHelp3 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface8 instanceof abcf) {
                        abcf = (abcf) queryLocalInterface8;
                        mo32011a(bundle, readLong, googleHelp3, abcf);
                        return true;
                    }
                    abcf4 = new abcd(readStrongBinder8);
                }
                abcf = abcf4;
                mo32011a(bundle, readLong, googleHelp3, abcf);
                return true;
            case 9:
                Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                long readLong2 = parcel.readLong();
                GoogleHelp googleHelp4 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface9 instanceof abcf) {
                        abcf2 = (abcf) queryLocalInterface9;
                        mo32017b(bundle2, readLong2, googleHelp4, abcf2);
                        return true;
                    }
                    abcf4 = new abcd(readStrongBinder9);
                }
                abcf2 = abcf4;
                mo32017b(bundle2, readLong2, googleHelp4, abcf2);
                return true;
            case 10:
                FeedbackOptions feedbackOptions = (FeedbackOptions) dcl.m8163a(parcel, FeedbackOptions.CREATOR);
                Bundle bundle3 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
                long readLong3 = parcel.readLong();
                GoogleHelp googleHelp5 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface10 instanceof abcf) {
                        abcf3 = (abcf) queryLocalInterface10;
                        mo32012a(feedbackOptions, bundle3, readLong3, googleHelp5, abcf3);
                        return true;
                    }
                    abcf4 = new abcd(readStrongBinder10);
                }
                abcf3 = abcf4;
                mo32012a(feedbackOptions, bundle3, readLong3, googleHelp5, abcf3);
                return true;
            case 11:
                GoogleHelp googleHelp6 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface11 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface11;
                    } else {
                        abcf4 = new abcd(readStrongBinder11);
                    }
                }
                mo32014a(googleHelp6, readString, readString2, abcf4);
                return true;
            case 12:
                GoogleHelp googleHelp7 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface12 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface12;
                    } else {
                        abcf4 = new abcd(readStrongBinder12);
                    }
                }
                mo32019b(googleHelp7, readString3, readString4, abcf4);
                return true;
            case 13:
                GoogleHelp googleHelp8 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface13 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface13;
                    } else {
                        abcf4 = new abcd(readStrongBinder13);
                    }
                }
                mo32018b(googleHelp8, abcf4);
                return true;
            case 14:
                GoogleHelp googleHelp9 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface14 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface14;
                    } else {
                        abcf4 = new abcd(readStrongBinder14);
                    }
                }
                mo32021c(googleHelp9, abcf4);
                return true;
            case 15:
                SupportRequestHelp supportRequestHelp = (SupportRequestHelp) dcl.m8163a(parcel, SupportRequestHelp.CREATOR);
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface15 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface15;
                    } else {
                        abcf4 = new abcd(readStrongBinder15);
                    }
                }
                mo32016a(supportRequestHelp, abcf4);
                return true;
            case 16:
                SupportRequestHelp supportRequestHelp2 = (SupportRequestHelp) dcl.m8163a(parcel, SupportRequestHelp.CREATOR);
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface16 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface16;
                    } else {
                        abcf4 = new abcd(readStrongBinder16);
                    }
                }
                mo32020b(supportRequestHelp2, abcf4);
                return true;
            case 17:
                InProductHelp inProductHelp = (InProductHelp) dcl.m8163a(parcel, InProductHelp.CREATOR);
                Bitmap bitmap3 = (Bitmap) dcl.m8163a(parcel, Bitmap.CREATOR);
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface17 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface17;
                    } else {
                        abcf4 = new abcd(readStrongBinder17);
                    }
                }
                mo32015a(inProductHelp, abcf4);
                parcel2.writeNoException();
                return true;
            case 18:
                GoogleHelp googleHelp10 = (GoogleHelp) dcl.m8163a(parcel, GoogleHelp.CREATOR);
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
                    if (queryLocalInterface18 instanceof abcf) {
                        abcf4 = (abcf) queryLocalInterface18;
                    } else {
                        abcf4 = new abcd(readStrongBinder18);
                    }
                }
                mo32022d(googleHelp10, abcf4);
                return true;
            default:
                return false;
        }
    }
}
