package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.reminders.AccountState;
import com.google.android.gms.reminders.CreateReminderOptionsInternal;
import com.google.android.gms.reminders.LoadRemindersOptions;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import com.google.android.gms.reminders.UpdateRecurrenceOptions;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TaskEntity;
import com.google.android.gms.reminders.model.TaskIdEntity;

/* renamed from: aosv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aosv extends dck implements aosw {
    public aosv() {
        super("com.google.android.gms.reminders.internal.IRemindersService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aost aost = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface instanceof aost) {
                        aost = (aost) queryLocalInterface;
                    } else {
                        aost = new aost(readStrongBinder);
                    }
                }
                mo46836a(aost, (LoadRemindersOptions) dcl.m8163a(parcel, LoadRemindersOptions.CREATOR));
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    aost = queryLocalInterface2 instanceof aost ? (aost) queryLocalInterface2 : new aost(readStrongBinder2);
                }
                mo46834a(aost);
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface3 instanceof aost) {
                        aost = (aost) queryLocalInterface3;
                    } else {
                        aost = new aost(readStrongBinder3);
                    }
                }
                mo46839a(aost, (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR));
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface4 instanceof aost) {
                        aost = (aost) queryLocalInterface4;
                    } else {
                        aost = new aost(readStrongBinder4);
                    }
                }
                mo46847b(aost, (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR));
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface5 instanceof aost) {
                        aost = (aost) queryLocalInterface5;
                    } else {
                        aost = new aost(readStrongBinder5);
                    }
                }
                mo46841a(aost, (TaskIdEntity) dcl.m8163a(parcel, TaskIdEntity.CREATOR));
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface6 instanceof aost) {
                        aost = (aost) queryLocalInterface6;
                    } else {
                        aost = new aost(readStrongBinder6);
                    }
                }
                mo46848b(aost, (TaskIdEntity) dcl.m8163a(parcel, TaskIdEntity.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface7 instanceof aost) {
                        aost = (aost) queryLocalInterface7;
                    } else {
                        aost = new aost(readStrongBinder7);
                    }
                }
                mo46845b(aost);
                break;
            case 8:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface8 instanceof aost) {
                        aost = (aost) queryLocalInterface8;
                    } else {
                        aost = new aost(readStrongBinder8);
                    }
                }
                mo46851c(aost, (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR));
                break;
            case 9:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface9 instanceof aost) {
                        aost = (aost) queryLocalInterface9;
                    } else {
                        aost = new aost(readStrongBinder9);
                    }
                }
                mo46843a(aost, parcel.readString(), (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR), (UpdateRecurrenceOptions) dcl.m8163a(parcel, UpdateRecurrenceOptions.CREATOR));
                break;
            case 10:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface10 instanceof aost) {
                        aost = (aost) queryLocalInterface10;
                    } else {
                        aost = new aost(readStrongBinder10);
                    }
                }
                mo46842a(aost, parcel.readString(), (UpdateRecurrenceOptions) dcl.m8163a(parcel, UpdateRecurrenceOptions.CREATOR));
                break;
            case 11:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface11 instanceof aost) {
                        aost = (aost) queryLocalInterface11;
                    } else {
                        aost = new aost(readStrongBinder11);
                    }
                }
                mo46849b(aost, parcel.readString(), (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR), (UpdateRecurrenceOptions) dcl.m8163a(parcel, UpdateRecurrenceOptions.CREATOR));
                break;
            case 12:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface12 instanceof aost) {
                        aost = (aost) queryLocalInterface12;
                    } else {
                        aost = new aost(readStrongBinder12);
                    }
                }
                mo46854d(aost, (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR));
                break;
            case 13:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface13 instanceof aost) {
                        aost = (aost) queryLocalInterface13;
                    } else {
                        aost = new aost(readStrongBinder13);
                    }
                }
                mo46852c(aost, parcel.readString(), (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR), (UpdateRecurrenceOptions) dcl.m8163a(parcel, UpdateRecurrenceOptions.CREATOR));
                break;
            case 14:
                mo46833a();
                break;
            case 15:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface14 instanceof aost) {
                        aost = (aost) queryLocalInterface14;
                    } else {
                        aost = new aost(readStrongBinder14);
                    }
                }
                mo46844a(aost, parcel.createTypedArrayList(TaskEntity.CREATOR));
                break;
            case 16:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface15 instanceof aost) {
                        aost = (aost) queryLocalInterface15;
                    } else {
                        aost = new aost(readStrongBinder15);
                    }
                }
                mo46840a(aost, (TaskEntity) dcl.m8163a(parcel, TaskEntity.CREATOR), (CreateReminderOptionsInternal) dcl.m8163a(parcel, CreateReminderOptionsInternal.CREATOR));
                break;
            case 17:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface16 instanceof aost) {
                        aost = (aost) queryLocalInterface16;
                    } else {
                        aost = new aost(readStrongBinder16);
                    }
                }
                mo46850c(aost);
                break;
            case 18:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface17 instanceof aost) {
                        aost = (aost) queryLocalInterface17;
                    } else {
                        aost = new aost(readStrongBinder17);
                    }
                }
                mo46838a(aost, (CustomizedSnoozePresetEntity) dcl.m8163a(parcel, CustomizedSnoozePresetEntity.CREATOR));
                break;
            case 19:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface18 instanceof aost) {
                        aost = (aost) queryLocalInterface18;
                    } else {
                        aost = new aost(readStrongBinder18);
                    }
                }
                mo46835a(aost, (AccountState) dcl.m8163a(parcel, AccountState.CREATOR));
                break;
            case 20:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface19 instanceof aost) {
                        aost = (aost) queryLocalInterface19;
                    } else {
                        aost = new aost(readStrongBinder19);
                    }
                }
                mo46853d(aost);
                break;
            case 21:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface20 instanceof aost) {
                        aost = (aost) queryLocalInterface20;
                    } else {
                        aost = new aost(readStrongBinder20);
                    }
                }
                mo46837a(aost, (ReindexDueDatesOptions) dcl.m8163a(parcel, ReindexDueDatesOptions.CREATOR));
                break;
            case 22:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.reminders.internal.IRemindersCallbacks");
                    if (queryLocalInterface21 instanceof aost) {
                        aost = (aost) queryLocalInterface21;
                    } else {
                        aost = new aost(readStrongBinder21);
                    }
                }
                mo46846b(aost, (ReindexDueDatesOptions) dcl.m8163a(parcel, ReindexDueDatesOptions.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
