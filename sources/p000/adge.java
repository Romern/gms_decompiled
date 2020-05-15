package p000;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.instantapps.LaunchSettings;
import com.google.android.gms.instantapps.internal.InstalledPackageInfo;
import com.google.android.gms.instantapps.internal.RoutingOptions;

/* renamed from: adge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class adge extends dck implements adgf {
    public adge() {
        super("com.google.android.gms.instantapps.internal.IInstantAppsService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        adgc adgc = null;
        rnt rnt = null;
        rnt rnt2 = null;
        rnt rnt3 = null;
        adgc adgc2 = null;
        adgc adgc3 = null;
        adgc adgc4 = null;
        rnt rnt4 = null;
        adgc adgc5 = null;
        adgc adgc6 = null;
        rnt rnt5 = null;
        rnt rnt6 = null;
        adgc adgc7 = null;
        rnt rnt7 = null;
        rnt rnt8 = null;
        rnt rnt9 = null;
        rnt rnt10 = null;
        rnt rnt11 = null;
        rnt rnt12 = null;
        rnt rnt13 = null;
        adgc adgc8 = null;
        rnt rnt14 = null;
        adgc adgc9 = null;
        adgc adgc10 = null;
        rnt rnt15 = null;
        rnt rnt16 = null;
        adgc adgc11 = null;
        rnt rnt17 = null;
        adgc adgc12 = null;
        adgc adgc13 = null;
        rnt rnt18 = null;
        rnt rnt19 = null;
        rnt rnt20 = null;
        switch (i) {
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface instanceof adgc) {
                        adgc = (adgc) queryLocalInterface;
                    } else {
                        adgc = new adga(readStrongBinder);
                    }
                }
                mo33453a(adgc, (Intent) dcl.m8163a(parcel, Intent.CREATOR));
                break;
            case 3:
            case 5:
            case 6:
            case 12:
            case 16:
            case 17:
            case 36:
            case FelicaException.TYPE_NOT_CLOSED:
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
            case FelicaException.TYPE_ALREADY_ACTIVATED:
            default:
                return false;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    rnt20 = queryLocalInterface2 instanceof rnt ? (rnt) queryLocalInterface2 : new rnr(readStrongBinder2);
                }
                mo33473b(rnt20, parcel.readString());
                break;
            case 7:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface3 instanceof rnt) {
                        rnt19 = (rnt) queryLocalInterface3;
                    } else {
                        rnt19 = new rnr(readStrongBinder3);
                    }
                }
                mo33461a(rnt19, parcel.readInt(), parcel.readString());
                break;
            case 8:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface4 instanceof rnt) {
                        rnt18 = (rnt) queryLocalInterface4;
                    } else {
                        rnt18 = new rnr(readStrongBinder4);
                    }
                }
                mo33460a(rnt18, parcel.readInt());
                break;
            case 9:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface5 instanceof adgc) {
                        adgc13 = (adgc) queryLocalInterface5;
                    } else {
                        adgc13 = new adga(readStrongBinder5);
                    }
                }
                mo33471b(adgc13, parcel.readString());
                break;
            case 10:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface6 instanceof adgc) {
                        adgc12 = (adgc) queryLocalInterface6;
                    } else {
                        adgc12 = new adga(readStrongBinder6);
                    }
                }
                mo33456a(adgc12, parcel.readString(), parcel.readString());
                break;
            case 11:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface7 instanceof rnt) {
                        rnt17 = (rnt) queryLocalInterface7;
                    } else {
                        rnt17 = new rnr(readStrongBinder7);
                    }
                }
                mo33465a(rnt17, parcel.readString(), parcel.readString(), parcel.readInt());
                break;
            case 13:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface8 instanceof adgc) {
                        adgc11 = (adgc) queryLocalInterface8;
                    } else {
                        adgc11 = new adga(readStrongBinder8);
                    }
                }
                mo33452a(adgc11);
                break;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface9 instanceof rnt) {
                        rnt16 = (rnt) queryLocalInterface9;
                    } else {
                        rnt16 = new rnr(readStrongBinder9);
                    }
                }
                mo33459a(rnt16);
                break;
            case 15:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface10 instanceof rnt) {
                        rnt15 = (rnt) queryLocalInterface10;
                    } else {
                        rnt15 = new rnr(readStrongBinder10);
                    }
                }
                mo33469a(rnt15, dcl.m8167a(parcel));
                break;
            case 18:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface11 instanceof adgc) {
                        adgc10 = (adgc) queryLocalInterface11;
                    } else {
                        adgc10 = new adga(readStrongBinder11);
                    }
                }
                mo33457a(adgc10, parcel.readString(), parcel.createByteArray());
                break;
            case 19:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface12 instanceof adgc) {
                        adgc9 = (adgc) queryLocalInterface12;
                    } else {
                        adgc9 = new adga(readStrongBinder12);
                    }
                }
                String readString = parcel.readString();
                LaunchSettings launchSettings = (LaunchSettings) dcl.m8163a(parcel, LaunchSettings.CREATOR);
                mo33477c(adgc9, readString);
                break;
            case 20:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface13 instanceof rnt) {
                        rnt14 = (rnt) queryLocalInterface13;
                    } else {
                        rnt14 = new rnr(readStrongBinder13);
                    }
                }
                mo33482d(rnt14, parcel.readString());
                break;
            case 21:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface14 instanceof adgc) {
                        adgc8 = (adgc) queryLocalInterface14;
                    } else {
                        adgc8 = new adga(readStrongBinder14);
                    }
                }
                mo33458a(adgc8, parcel.createStringArrayList(), dcl.m8167a(parcel));
                break;
            case 22:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface15 instanceof rnt) {
                        rnt13 = (rnt) queryLocalInterface15;
                    } else {
                        rnt13 = new rnr(readStrongBinder15);
                    }
                }
                mo33464a(rnt13, parcel.readString());
                break;
            case 23:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface16 instanceof rnt) {
                        rnt12 = (rnt) queryLocalInterface16;
                    } else {
                        rnt12 = new rnr(readStrongBinder16);
                    }
                }
                mo33479c(rnt12, parcel.readString());
                break;
            case 24:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface17 instanceof rnt) {
                        rnt11 = (rnt) queryLocalInterface17;
                    } else {
                        rnt11 = new rnr(readStrongBinder17);
                    }
                }
                mo33467a(rnt11, parcel.readString(), dcl.m8167a(parcel));
                break;
            case 25:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface18 instanceof rnt) {
                        rnt10 = (rnt) queryLocalInterface18;
                    } else {
                        rnt10 = new rnr(readStrongBinder18);
                    }
                }
                mo33466a(rnt10, parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 26:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface19 instanceof rnt) {
                        rnt9 = (rnt) queryLocalInterface19;
                    } else {
                        rnt9 = new rnr(readStrongBinder19);
                    }
                }
                mo33474b(rnt9, parcel.readString(), parcel.readString(), parcel.readString());
                break;
            case 27:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface20 instanceof rnt) {
                        rnt8 = (rnt) queryLocalInterface20;
                    } else {
                        rnt8 = new rnr(readStrongBinder20);
                    }
                }
                parcel.readString();
                mo33484e(rnt8);
                break;
            case 28:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface21 instanceof rnt) {
                        rnt7 = (rnt) queryLocalInterface21;
                    } else {
                        rnt7 = new rnr(readStrongBinder21);
                    }
                }
                mo33463a(rnt7, (PackageInfo) dcl.m8163a(parcel, PackageInfo.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case 29:
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface22 instanceof adgc) {
                        adgc7 = (adgc) queryLocalInterface22;
                    } else {
                        adgc7 = new adga(readStrongBinder22);
                    }
                }
                mo33470b(adgc7);
                break;
            case 30:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface23 instanceof rnt) {
                        rnt6 = (rnt) queryLocalInterface23;
                    } else {
                        rnt6 = new rnr(readStrongBinder23);
                    }
                }
                mo33462a(rnt6, (PackageInfo) dcl.m8163a(parcel, PackageInfo.CREATOR));
                break;
            case 31:
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface24 instanceof rnt) {
                        rnt5 = (rnt) queryLocalInterface24;
                    } else {
                        rnt5 = new rnr(readStrongBinder24);
                    }
                }
                mo33468a(rnt5, parcel.readString(), parcel.createByteArray());
                break;
            case 32:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface25 instanceof adgc) {
                        adgc6 = (adgc) queryLocalInterface25;
                    } else {
                        adgc6 = new adga(readStrongBinder25);
                    }
                }
                mo33454a(adgc6, (Intent) dcl.m8163a(parcel, Intent.CREATOR), (RoutingOptions) dcl.m8163a(parcel, RoutingOptions.CREATOR));
                break;
            case 33:
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 != null) {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface26 instanceof adgc) {
                        adgc5 = (adgc) queryLocalInterface26;
                    } else {
                        adgc5 = new adga(readStrongBinder26);
                    }
                }
                mo33455a(adgc5, parcel.readString());
                break;
            case 34:
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface27 instanceof rnt) {
                        rnt4 = (rnt) queryLocalInterface27;
                    } else {
                        rnt4 = new rnr(readStrongBinder27);
                    }
                }
                mo33472b(rnt4);
                break;
            case 35:
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface28 instanceof adgc) {
                        adgc4 = (adgc) queryLocalInterface28;
                    } else {
                        adgc4 = new adga(readStrongBinder28);
                    }
                }
                mo33476c(adgc4);
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface29 instanceof adgc) {
                        adgc3 = (adgc) queryLocalInterface29;
                    } else {
                        adgc3 = new adga(readStrongBinder29);
                    }
                }
                mo33480d(adgc3);
                break;
            case FelicaException.TYPE_PUSH_FAILED:
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
                    if (queryLocalInterface30 instanceof adgc) {
                        adgc2 = (adgc) queryLocalInterface30;
                    } else {
                        adgc2 = new adga(readStrongBinder30);
                    }
                }
                mo33483e(adgc2);
                break;
            case 41:
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface31 instanceof rnt) {
                        rnt3 = (rnt) queryLocalInterface31;
                    } else {
                        rnt3 = new rnr(readStrongBinder31);
                    }
                }
                mo33475b(rnt3, dcl.m8167a(parcel));
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                IBinder readStrongBinder32 = parcel.readStrongBinder();
                if (readStrongBinder32 != null) {
                    IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface32 instanceof rnt) {
                        rnt2 = (rnt) queryLocalInterface32;
                    } else {
                        rnt2 = new rnr(readStrongBinder32);
                    }
                }
                InstalledPackageInfo installedPackageInfo = (InstalledPackageInfo) dcl.m8163a(parcel, InstalledPackageInfo.CREATOR);
                mo33478c(rnt2);
                break;
            case FelicaException.TYPE_RESET_FAILED:
                IBinder readStrongBinder33 = parcel.readStrongBinder();
                if (readStrongBinder33 != null) {
                    IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    if (queryLocalInterface33 instanceof rnt) {
                        rnt = (rnt) queryLocalInterface33;
                    } else {
                        rnt = new rnr(readStrongBinder33);
                    }
                }
                InstalledPackageInfo installedPackageInfo2 = (InstalledPackageInfo) dcl.m8163a(parcel, InstalledPackageInfo.CREATOR);
                mo33481d(rnt);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
