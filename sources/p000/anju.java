package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupEngineStatus;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.AutoBackupStatus;
import com.google.android.gms.photos.autobackup.model.LocalFolder;
import com.google.android.gms.photos.autobackup.model.MigrationStatus;
import com.google.android.gms.photos.autobackup.model.SyncSettings;
import java.util.Collections;

/* renamed from: anju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anju extends dck implements anjv {

    /* renamed from: a */
    private final Context f77005a;

    public anju() {
        super("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
    }

    /* renamed from: a */
    public final void mo41887a(anjs anjs) {
        anjs.mo41872a(0, Collections.singletonList(new AutoBackupSettings(1, null, false, true, false, true, true, false, false, false, null)));
    }

    public anju(Context context) {
        super("com.google.android.gms.photos.autobackup.internal.IAutoBackupService");
        this.f77005a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        anjs anjs;
        Parcel parcel3 = parcel;
        anjs anjs2 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface;
                    } else {
                        anjs2 = new anjq(readStrongBinder);
                    }
                }
                anjs2.mo41873a();
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    anjs2 = queryLocalInterface2 instanceof anjs ? (anjs) queryLocalInterface2 : new anjq(readStrongBinder2);
                }
                anjs2.mo41874a(PendingIntent.getActivity(this.f77005a, 0, new Intent(), 134217728));
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    anjs = queryLocalInterface3 instanceof anjs ? (anjs) queryLocalInterface3 : new anjq(readStrongBinder3);
                } else {
                    anjs = null;
                }
                parcel.readString();
                anjs.mo41874a((PendingIntent) null);
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface4 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface4;
                    } else {
                        anjs2 = new anjq(readStrongBinder4);
                    }
                }
                mo41887a(anjs2);
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface5 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface5;
                    } else {
                        anjs2 = new anjq(readStrongBinder5);
                    }
                }
                parcel.readString();
                anjs2.mo41880d();
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface6 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface6;
                    } else {
                        anjs2 = new anjq(readStrongBinder6);
                    }
                }
                parcel.readString();
                anjs2.mo41875a(new Status(8), (LocalFolder) dcl.m8163a(parcel3, LocalFolder.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface7 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface7;
                    } else {
                        anjs2 = new anjq(readStrongBinder7);
                    }
                }
                parcel.readString();
                anjs2.mo41877a(new AutoBackupStatus(1, 0, null, null, 0.0f, 0, 0, 0, null, null, 0));
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface8 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface8;
                    } else {
                        anjs2 = new anjq(readStrongBinder8);
                    }
                }
                anjs2.mo41882f();
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface9 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface9;
                    } else {
                        anjs2 = new anjq(readStrongBinder9);
                    }
                }
                AutoBackupSettings autoBackupSettings = (AutoBackupSettings) dcl.m8163a(parcel3, AutoBackupSettings.CREATOR);
                anjs2.mo41884h();
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface10 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface10;
                    } else {
                        anjs2 = new anjq(readStrongBinder10);
                    }
                }
                parcel.readString();
                anjs2.mo41879c();
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface11 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface11;
                    } else {
                        anjs2 = new anjq(readStrongBinder11);
                    }
                }
                parcel.readString();
                anjs2.mo41885i();
                break;
            case 12:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface12 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface12;
                    } else {
                        anjs2 = new anjq(readStrongBinder12);
                    }
                }
                parcel.readString();
                SyncSettings syncSettings = (SyncSettings) dcl.m8163a(parcel3, SyncSettings.CREATOR);
                anjs2.mo41886j();
                break;
            case 13:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface13 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface13;
                    } else {
                        anjs2 = new anjq(readStrongBinder13);
                    }
                }
                anjs2.mo41878a(new MigrationStatus(1, false));
                break;
            case 14:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface14 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface14;
                    } else {
                        anjs2 = new anjq(readStrongBinder14);
                    }
                }
                parcel.readString();
                parcel.createStringArray();
                anjs2.mo41881e();
                break;
            case 15:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface15 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface15;
                    } else {
                        anjs2 = new anjq(readStrongBinder15);
                    }
                }
                dcl.m8167a(parcel);
                anjs2.mo41883g();
                break;
            case 16:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.photos.autobackup.internal.IAutoBackupCallbacks");
                    if (queryLocalInterface16 instanceof anjs) {
                        anjs2 = (anjs) queryLocalInterface16;
                    } else {
                        anjs2 = new anjq(readStrongBinder16);
                    }
                }
                anjs2.mo41876a(new AutoBackupEngineStatus(1, false));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
