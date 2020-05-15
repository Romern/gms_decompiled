package p000;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;

/* renamed from: also */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class also extends dck implements alsp {
    public also() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        alss alss = null;
        if (i == 194202) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                if (queryLocalInterface instanceof alss) {
                    alss = (alss) queryLocalInterface;
                } else {
                    alss = new alsq(readStrongBinder);
                }
            }
            mo40714a(alss, (Uri) dcl.m8163a(parcel, Uri.CREATOR));
        } else if (i != 201202) {
            switch (i) {
                case 192402:
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                        if (queryLocalInterface2 instanceof alss) {
                            alss alss2 = (alss) queryLocalInterface2;
                        } else {
                            new alsq(readStrongBinder2);
                        }
                    }
                    parcel.createIntArray();
                    parcel.readString();
                    dcl.m8167a(parcel);
                    break;
                case 192403:
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                        if (queryLocalInterface3 instanceof alss) {
                            alss alss3 = (alss) queryLocalInterface3;
                        } else {
                            new alsq(readStrongBinder3);
                        }
                    }
                    parcel.readString();
                    break;
                default:
                    switch (i) {
                        case 192802:
                            IBinder readStrongBinder4 = parcel.readStrongBinder();
                            if (readStrongBinder4 != null) {
                                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                                if (queryLocalInterface4 instanceof alss) {
                                    alss = (alss) queryLocalInterface4;
                                } else {
                                    alss = new alsq(readStrongBinder4);
                                }
                            }
                            mo40715a(alss, parcel.readString());
                            break;
                        case 192803:
                            IBinder readStrongBinder5 = parcel.readStrongBinder();
                            if (readStrongBinder5 != null) {
                                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                                if (queryLocalInterface5 instanceof alss) {
                                    alss = (alss) queryLocalInterface5;
                                } else {
                                    alss = new alsq(readStrongBinder5);
                                }
                            }
                            mo40717a(alss, parcel.createIntArray());
                            break;
                        case 192804:
                            IBinder readStrongBinder6 = parcel.readStrongBinder();
                            if (readStrongBinder6 != null) {
                                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                                if (queryLocalInterface6 instanceof alss) {
                                    alss = (alss) queryLocalInterface6;
                                } else {
                                    alss = new alsq(readStrongBinder6);
                                }
                            }
                            mo40719b(alss, parcel.createIntArray());
                            break;
                        case 192805:
                            IBinder readStrongBinder7 = parcel.readStrongBinder();
                            if (readStrongBinder7 != null) {
                                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                                if (queryLocalInterface7 instanceof alss) {
                                    alss = (alss) queryLocalInterface7;
                                } else {
                                    alss = new alsq(readStrongBinder7);
                                }
                            }
                            mo40713a(alss);
                            break;
                        case 192806:
                            IBinder readStrongBinder8 = parcel.readStrongBinder();
                            if (readStrongBinder8 != null) {
                                IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                                if (queryLocalInterface8 instanceof alss) {
                                    alss = (alss) queryLocalInterface8;
                                } else {
                                    alss = new alsq(readStrongBinder8);
                                }
                            }
                            mo40718b(alss);
                            break;
                        case 192807:
                            IBinder readStrongBinder9 = parcel.readStrongBinder();
                            if (readStrongBinder9 != null) {
                                IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                                if (queryLocalInterface9 instanceof alss) {
                                    alss = (alss) queryLocalInterface9;
                                } else {
                                    alss = new alsq(readStrongBinder9);
                                }
                            }
                            mo40720c(alss);
                            break;
                        default:
                            return false;
                    }
            }
        } else {
            IBinder readStrongBinder10 = parcel.readStrongBinder();
            if (readStrongBinder10 != null) {
                IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
                if (queryLocalInterface10 instanceof alss) {
                    alss = (alss) queryLocalInterface10;
                } else {
                    alss = new alsq(readStrongBinder10);
                }
            }
            mo40716a(alss, parcel.createTypedArrayList(ClassifyAccountTypeRequest.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
