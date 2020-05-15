package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: alzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class alzo extends dck implements alzp {
    public alzo() {
        super("com.google.android.gms.people.internal.IPeopleService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        alzm alzm;
        alzm alzm2;
        alzm alzm3;
        alzm alzm4;
        alzm alzm5;
        alzm alzm6;
        alzm alzm7;
        alzm alzm8;
        alzm alzm9;
        alzm alzm10;
        alzm alzm11;
        alzm alzm12;
        alzm alzm13;
        alzm alzm14;
        alzm alzm15;
        alzm alzm16;
        alzm alzm17;
        alzm alzm18;
        alzm alzm19;
        int i2 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        alzm alzm20 = null;
        if (i2 == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                alzm = queryLocalInterface instanceof alzm ? (alzm) queryLocalInterface : new alzk(readStrongBinder);
            } else {
                alzm = null;
            }
            mo40578a(alzm, dcl.m8167a(parcel), dcl.m8167a(parcel), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i2 == 3) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                alzm2 = queryLocalInterface2 instanceof alzm ? (alzm) queryLocalInterface2 : new alzk(readStrongBinder2);
            } else {
                alzm2 = null;
            }
            mo40564a(alzm2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        } else if (i2 == 4) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                alzm3 = queryLocalInterface3 instanceof alzm ? (alzm) queryLocalInterface3 : new alzk(readStrongBinder3);
            } else {
                alzm3 = null;
            }
            mo40570a(alzm3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), dcl.m8167a(parcel), parcel.readLong());
            parcel2.writeNoException();
            return true;
        } else if (i2 == 5) {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                if (queryLocalInterface4 instanceof alzm) {
                    alzm20 = (alzm) queryLocalInterface4;
                } else {
                    alzm20 = new alzk(readStrongBinder4);
                }
            }
            mo40557a(alzm20, parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        } else if (i2 == 101) {
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                if (queryLocalInterface5 instanceof alzm) {
                    alzm alzm21 = (alzm) queryLocalInterface5;
                } else {
                    new alzk(readStrongBinder5);
                }
            }
            parcel.readString();
            parcel.readString();
            parcel2.writeNoException();
            return true;
        } else if (i2 == 102) {
            IBinder readStrongBinder6 = parcel.readStrongBinder();
            if (readStrongBinder6 != null) {
                IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                if (queryLocalInterface6 instanceof alzm) {
                    alzm alzm22 = (alzm) queryLocalInterface6;
                } else {
                    new alzk(readStrongBinder6);
                }
            }
            parcel.readString();
            parcel.readString();
            parcel2.writeNoException();
            return true;
        } else if (i2 == 501) {
            IBinder readStrongBinder7 = parcel.readStrongBinder();
            if (readStrongBinder7 != null) {
                IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                if (queryLocalInterface7 instanceof alzm) {
                    alzm20 = (alzm) queryLocalInterface7;
                } else {
                    alzm20 = new alzk(readStrongBinder7);
                }
            }
            mo40556a(alzm20, (AccountToken) dcl.m8163a(parcel3, AccountToken.CREATOR), parcel.createStringArrayList(), (ParcelableGetOptions) dcl.m8163a(parcel3, ParcelableGetOptions.CREATOR));
            parcel2.writeNoException();
            return true;
        } else if (i2 != 502) {
            switch (i2) {
                case 9:
                    IBinder readStrongBinder8 = parcel.readStrongBinder();
                    if (readStrongBinder8 != null) {
                        IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        alzm4 = queryLocalInterface8 instanceof alzm ? (alzm) queryLocalInterface8 : new alzk(readStrongBinder8);
                    } else {
                        alzm4 = null;
                    }
                    mo40575a(alzm4, parcel.readString(), parcel.readString(), parcel.readString(), dcl.m8167a(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    IBinder readStrongBinder9 = parcel.readStrongBinder();
                    if (readStrongBinder9 != null) {
                        IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface9 instanceof alzm) {
                            alzm alzm23 = (alzm) queryLocalInterface9;
                        } else {
                            new alzk(readStrongBinder9);
                        }
                    }
                    parcel.readString();
                    dcl.m8167a(parcel);
                    parcel.createStringArray();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    IBinder readStrongBinder10 = parcel.readStrongBinder();
                    if (readStrongBinder10 != null) {
                        IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        alzm5 = queryLocalInterface10 instanceof alzm ? (alzm) queryLocalInterface10 : new alzk(readStrongBinder10);
                    } else {
                        alzm5 = null;
                    }
                    Bundle a = mo40540a(alzm5, dcl.m8167a(parcel), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, a);
                    return true;
                case 12:
                    Bundle a2 = mo40541a(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    dcl.m8169b(parcel4, a2);
                    return true;
                case 13:
                    IBinder readStrongBinder11 = parcel.readStrongBinder();
                    if (readStrongBinder11 != null) {
                        IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface11 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface11;
                        } else {
                            alzm20 = new alzk(readStrongBinder11);
                        }
                    }
                    mo40561a(alzm20, parcel.readString(), parcel.readString(), (Uri) dcl.m8163a(parcel3, Uri.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    IBinder readStrongBinder12 = parcel.readStrongBinder();
                    if (readStrongBinder12 != null) {
                        IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface12 instanceof alzm) {
                            alzm alzm24 = (alzm) queryLocalInterface12;
                        } else {
                            new alzk(readStrongBinder12);
                        }
                    }
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.createStringArrayList();
                    parcel.createStringArrayList();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    dcl.m8167a(parcel);
                    mo40590c();
                    parcel2.writeNoException();
                    return true;
                case 601:
                    IBinder readStrongBinder13 = parcel.readStrongBinder();
                    if (readStrongBinder13 != null) {
                        IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface13 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface13;
                        } else {
                            alzm20 = new alzk(readStrongBinder13);
                        }
                    }
                    sce a3 = mo40545a(alzm20, (AccountToken) dcl.m8163a(parcel3, AccountToken.CREATOR), (ParcelableListOptions) dcl.m8163a(parcel3, ParcelableListOptions.CREATOR));
                    parcel2.writeNoException();
                    dcl.m8164a(parcel4, a3);
                    return true;
                case 701:
                    IBinder readStrongBinder14 = parcel.readStrongBinder();
                    if (readStrongBinder14 != null) {
                        IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface14 instanceof alzm) {
                            alzm alzm25 = (alzm) queryLocalInterface14;
                        } else {
                            new alzk(readStrongBinder14);
                        }
                    }
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    dcl.m8167a(parcel);
                    parcel2.writeNoException();
                    return true;
                case 1201:
                    IBinder readStrongBinder15 = parcel.readStrongBinder();
                    if (readStrongBinder15 != null) {
                        IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface15 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface15;
                        } else {
                            alzm20 = new alzk(readStrongBinder15);
                        }
                    }
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Bundle bundle = (Bundle) dcl.m8163a(parcel3, Bundle.CREATOR);
                    sce e = mo40595e(alzm20, readString, readString2);
                    parcel2.writeNoException();
                    dcl.m8164a(parcel4, e);
                    return true;
                case 1401:
                    IBinder readStrongBinder16 = parcel.readStrongBinder();
                    if (readStrongBinder16 != null) {
                        IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface16 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface16;
                        } else {
                            alzm20 = new alzk(readStrongBinder16);
                        }
                    }
                    mo40594d(alzm20, parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 1402:
                    IBinder readStrongBinder17 = parcel.readStrongBinder();
                    if (readStrongBinder17 != null) {
                        IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface17 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface17;
                        } else {
                            alzm20 = new alzk(readStrongBinder17);
                        }
                    }
                    mo40577a(alzm20, parcel.readString(), parcel.readString(), parcel.createStringArray());
                    parcel2.writeNoException();
                    return true;
                case 1602:
                    IBinder readStrongBinder18 = parcel.readStrongBinder();
                    if (readStrongBinder18 != null) {
                        IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface18 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface18;
                        } else {
                            alzm20 = new alzk(readStrongBinder18);
                        }
                    }
                    mo40585b(alzm20, parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2002:
                    IBinder readStrongBinder19 = parcel.readStrongBinder();
                    if (readStrongBinder19 != null) {
                        IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface19 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface19;
                        } else {
                            alzm20 = new alzk(readStrongBinder19);
                        }
                    }
                    mo40551a(alzm20, (Account) dcl.m8163a(parcel3, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2101:
                    IBinder readStrongBinder20 = parcel.readStrongBinder();
                    if (readStrongBinder20 != null) {
                        IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface20 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface20;
                        } else {
                            alzm20 = new alzk(readStrongBinder20);
                        }
                    }
                    mo40591c(alzm20, (Account) dcl.m8163a(parcel3, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2201:
                    IBinder readStrongBinder21 = parcel.readStrongBinder();
                    if (readStrongBinder21 != null) {
                        IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface21 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface21;
                        } else {
                            alzm20 = new alzk(readStrongBinder21);
                        }
                    }
                    mo40552a(alzm20, (Uri) dcl.m8163a(parcel3, Uri.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 2202:
                    IBinder readStrongBinder22 = parcel.readStrongBinder();
                    if (readStrongBinder22 != null) {
                        IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface22 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface22;
                        } else {
                            alzm20 = new alzk(readStrongBinder22);
                        }
                    }
                    mo40553a(alzm20, (Uri) dcl.m8163a(parcel3, Uri.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2203:
                    IBinder readStrongBinder23 = parcel.readStrongBinder();
                    if (readStrongBinder23 != null) {
                        IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        alzm6 = queryLocalInterface23 instanceof alzm ? (alzm) queryLocalInterface23 : new alzk(readStrongBinder23);
                    } else {
                        alzm6 = null;
                    }
                    mo40554a(alzm6, (Uri) dcl.m8163a(parcel3, Uri.CREATOR), parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2501:
                    IBinder readStrongBinder24 = parcel.readStrongBinder();
                    if (readStrongBinder24 != null) {
                        IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface24 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface24;
                        } else {
                            alzm20 = new alzk(readStrongBinder24);
                        }
                    }
                    mo40584b(alzm20, (Account) dcl.m8163a(parcel3, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4201:
                    IBinder readStrongBinder25 = parcel.readStrongBinder();
                    if (readStrongBinder25 != null) {
                        IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                        if (queryLocalInterface25 instanceof alzm) {
                            alzm20 = (alzm) queryLocalInterface25;
                        } else {
                            alzm20 = new alzk(readStrongBinder25);
                        }
                    }
                    mo40593d(alzm20, (Account) dcl.m8163a(parcel3, Account.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i2) {
                        case 17:
                            Bundle b = mo40580b(parcel.readString(), parcel.readString());
                            parcel2.writeNoException();
                            dcl.m8169b(parcel4, b);
                            return true;
                        case 18:
                            IBinder readStrongBinder26 = parcel.readStrongBinder();
                            if (readStrongBinder26 != null) {
                                IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                alzm7 = queryLocalInterface26 instanceof alzm ? (alzm) queryLocalInterface26 : new alzk(readStrongBinder26);
                            } else {
                                alzm7 = null;
                            }
                            mo40562a(alzm7, parcel.readString(), parcel.readString(), (Uri) dcl.m8163a(parcel3, Uri.CREATOR), dcl.m8167a(parcel));
                            parcel2.writeNoException();
                            return true;
                        case 19:
                            IBinder readStrongBinder27 = parcel.readStrongBinder();
                            if (readStrongBinder27 != null) {
                                IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                alzm8 = queryLocalInterface27 instanceof alzm ? (alzm) queryLocalInterface27 : new alzk(readStrongBinder27);
                            } else {
                                alzm8 = null;
                            }
                            mo40565a(alzm8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), dcl.m8167a(parcel));
                            parcel2.writeNoException();
                            return true;
                        case 20:
                            Bundle a4 = mo40542a(parcel.readString(), parcel.readString(), parcel.readLong());
                            parcel2.writeNoException();
                            dcl.m8169b(parcel4, a4);
                            return true;
                        case 21:
                            IBinder readStrongBinder28 = parcel.readStrongBinder();
                            if (readStrongBinder28 != null) {
                                IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                alzm9 = queryLocalInterface28 instanceof alzm ? (alzm) queryLocalInterface28 : new alzk(readStrongBinder28);
                            } else {
                                alzm9 = null;
                            }
                            mo40571a(alzm9, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), dcl.m8167a(parcel), parcel.readLong(), parcel.readString(), parcel.readInt());
                            parcel2.writeNoException();
                            return true;
                        case 22:
                            IBinder readStrongBinder29 = parcel.readStrongBinder();
                            if (readStrongBinder29 != null) {
                                IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                if (queryLocalInterface29 instanceof alzm) {
                                    alzm alzm26 = (alzm) queryLocalInterface29;
                                } else {
                                    new alzk(readStrongBinder29);
                                }
                            }
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.readInt();
                            parcel.readString();
                            parcel2.writeNoException();
                            return true;
                        case 23:
                            IBinder readStrongBinder30 = parcel.readStrongBinder();
                            if (readStrongBinder30 != null) {
                                IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                if (queryLocalInterface30 instanceof alzm) {
                                    alzm alzm27 = (alzm) queryLocalInterface30;
                                } else {
                                    new alzk(readStrongBinder30);
                                }
                            }
                            parcel.readString();
                            parcel.readString();
                            parcel.readString();
                            parcel.createStringArrayList();
                            parcel.createStringArrayList();
                            FavaDiagnosticsEntity favaDiagnosticsEntity = (FavaDiagnosticsEntity) dcl.m8163a(parcel3, FavaDiagnosticsEntity.CREATOR);
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i2) {
                                case 25:
                                    IBinder readStrongBinder31 = parcel.readStrongBinder();
                                    if (readStrongBinder31 != null) {
                                        IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                        if (queryLocalInterface31 instanceof alzm) {
                                            alzm20 = (alzm) queryLocalInterface31;
                                        } else {
                                            alzm20 = new alzk(readStrongBinder31);
                                        }
                                    }
                                    mo40558a(alzm20, parcel.readString(), parcel.readString());
                                    parcel2.writeNoException();
                                    return true;
                                case 26:
                                    Bundle a5 = mo40543a(parcel.readString(), parcel.readString(), parcel.readLong(), dcl.m8167a(parcel));
                                    parcel2.writeNoException();
                                    dcl.m8169b(parcel4, a5);
                                    return true;
                                case 27:
                                    IBinder readStrongBinder32 = parcel.readStrongBinder();
                                    if (readStrongBinder32 != null) {
                                        IInterface queryLocalInterface32 = readStrongBinder32.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                        if (queryLocalInterface32 instanceof alzm) {
                                            alzm alzm28 = (alzm) queryLocalInterface32;
                                        } else {
                                            new alzk(readStrongBinder32);
                                        }
                                    }
                                    parcel.readString();
                                    parcel.readString();
                                    parcel.readString();
                                    parcel.readString();
                                    parcel2.writeNoException();
                                    return true;
                                case 28:
                                    IBinder readStrongBinder33 = parcel.readStrongBinder();
                                    if (readStrongBinder33 != null) {
                                        IInterface queryLocalInterface33 = readStrongBinder33.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                        if (queryLocalInterface33 instanceof alzm) {
                                            alzm alzm29 = (alzm) queryLocalInterface33;
                                        } else {
                                            new alzk(readStrongBinder33);
                                        }
                                    }
                                    parcel.readString();
                                    parcel.readString();
                                    parcel.readString();
                                    parcel.createStringArrayList();
                                    parcel2.writeNoException();
                                    return true;
                                case 29:
                                    IBinder readStrongBinder34 = parcel.readStrongBinder();
                                    if (readStrongBinder34 != null) {
                                        IInterface queryLocalInterface34 = readStrongBinder34.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                        alzm10 = queryLocalInterface34 instanceof alzm ? (alzm) queryLocalInterface34 : new alzk(readStrongBinder34);
                                    } else {
                                        alzm10 = null;
                                    }
                                    mo40560a(alzm10, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                                    parcel2.writeNoException();
                                    return true;
                                default:
                                    switch (i2) {
                                        case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                                            IBinder readStrongBinder35 = parcel.readStrongBinder();
                                            if (readStrongBinder35 != null) {
                                                IInterface queryLocalInterface35 = readStrongBinder35.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                alzm11 = queryLocalInterface35 instanceof alzm ? (alzm) queryLocalInterface35 : new alzk(readStrongBinder35);
                                            } else {
                                                alzm11 = null;
                                            }
                                            mo40576a(alzm11, parcel.readString(), parcel.readString(), parcel.readString(), dcl.m8167a(parcel), parcel.readInt(), parcel.readInt());
                                            parcel2.writeNoException();
                                            return true;
                                        case 202:
                                            IBinder readStrongBinder36 = parcel.readStrongBinder();
                                            if (readStrongBinder36 != null) {
                                                IInterface queryLocalInterface36 = readStrongBinder36.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                alzm12 = queryLocalInterface36 instanceof alzm ? (alzm) queryLocalInterface36 : new alzk(readStrongBinder36);
                                            } else {
                                                alzm12 = null;
                                            }
                                            mo40566a(alzm12, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), dcl.m8167a(parcel), parcel.readInt(), parcel.readInt(), parcel.readString());
                                            parcel2.writeNoException();
                                            return true;
                                        case 203:
                                            IBinder readStrongBinder37 = parcel.readStrongBinder();
                                            if (readStrongBinder37 != null) {
                                                IInterface queryLocalInterface37 = readStrongBinder37.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                alzm13 = queryLocalInterface37 instanceof alzm ? (alzm) queryLocalInterface37 : new alzk(readStrongBinder37);
                                            } else {
                                                alzm13 = null;
                                            }
                                            mo40567a(alzm13, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), dcl.m8167a(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), dcl.m8167a(parcel));
                                            parcel2.writeNoException();
                                            return true;
                                        case 204:
                                            IBinder readStrongBinder38 = parcel.readStrongBinder();
                                            if (readStrongBinder38 != null) {
                                                IInterface queryLocalInterface38 = readStrongBinder38.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                if (queryLocalInterface38 instanceof alzm) {
                                                    alzm alzm30 = (alzm) queryLocalInterface38;
                                                } else {
                                                    new alzk(readStrongBinder38);
                                                }
                                            }
                                            parcel.readString();
                                            parcel.readString();
                                            parcel.readString();
                                            parcel2.writeNoException();
                                            return true;
                                        case 205:
                                            Bundle a6 = mo40544a(parcel.readString(), parcel.readString(), parcel.readLong(), dcl.m8167a(parcel), dcl.m8167a(parcel));
                                            parcel2.writeNoException();
                                            dcl.m8169b(parcel4, a6);
                                            return true;
                                        default:
                                            switch (i2) {
                                                case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                                    IBinder readStrongBinder39 = parcel.readStrongBinder();
                                                    if (readStrongBinder39 != null) {
                                                        IInterface queryLocalInterface39 = readStrongBinder39.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                        if (queryLocalInterface39 instanceof alzm) {
                                                            alzm20 = (alzm) queryLocalInterface39;
                                                        } else {
                                                            alzm20 = new alzk(readStrongBinder39);
                                                        }
                                                    }
                                                    mo40587b(alzm20, parcel.readString(), parcel.readString(), parcel.readInt());
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 302:
                                                    IBinder readStrongBinder40 = parcel.readStrongBinder();
                                                    if (readStrongBinder40 != null) {
                                                        IInterface queryLocalInterface40 = readStrongBinder40.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                        if (queryLocalInterface40 instanceof alzm) {
                                                            alzm alzm31 = (alzm) queryLocalInterface40;
                                                        } else {
                                                            new alzk(readStrongBinder40);
                                                        }
                                                    }
                                                    Bundle bundle2 = (Bundle) dcl.m8163a(parcel3, Bundle.CREATOR);
                                                    mo40583b();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 303:
                                                    IBinder readStrongBinder41 = parcel.readStrongBinder();
                                                    if (readStrongBinder41 != null) {
                                                        IInterface queryLocalInterface41 = readStrongBinder41.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                        if (queryLocalInterface41 instanceof alzm) {
                                                            alzm alzm32 = (alzm) queryLocalInterface41;
                                                        } else {
                                                            new alzk(readStrongBinder41);
                                                        }
                                                    }
                                                    parcel.readString();
                                                    parcel.readString();
                                                    parcel.readString();
                                                    parcel.readString();
                                                    parcel.readInt();
                                                    parcel.readString();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 304:
                                                    IBinder readStrongBinder42 = parcel.readStrongBinder();
                                                    if (readStrongBinder42 != null) {
                                                        IInterface queryLocalInterface42 = readStrongBinder42.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                        if (queryLocalInterface42 instanceof alzm) {
                                                            alzm20 = (alzm) queryLocalInterface42;
                                                        } else {
                                                            alzm20 = new alzk(readStrongBinder42);
                                                        }
                                                    }
                                                    mo40555a(alzm20, (Bundle) dcl.m8163a(parcel3, Bundle.CREATOR));
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 305:
                                                    IBinder readStrongBinder43 = parcel.readStrongBinder();
                                                    if (readStrongBinder43 != null) {
                                                        IInterface queryLocalInterface43 = readStrongBinder43.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                        alzm14 = queryLocalInterface43 instanceof alzm ? (alzm) queryLocalInterface43 : new alzk(readStrongBinder43);
                                                    } else {
                                                        alzm14 = null;
                                                    }
                                                    mo40579a(alzm14, dcl.m8167a(parcel), dcl.m8167a(parcel), parcel.readString(), parcel.readString(), parcel.readInt());
                                                    parcel2.writeNoException();
                                                    return true;
                                                default:
                                                    switch (i2) {
                                                        case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                                            IBinder readStrongBinder44 = parcel.readStrongBinder();
                                                            if (readStrongBinder44 != null) {
                                                                IInterface queryLocalInterface44 = readStrongBinder44.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                alzm15 = queryLocalInterface44 instanceof alzm ? (alzm) queryLocalInterface44 : new alzk(readStrongBinder44);
                                                            } else {
                                                                alzm15 = null;
                                                            }
                                                            mo40572a(alzm15, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), dcl.m8167a(parcel), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt());
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                                            IBinder readStrongBinder45 = parcel.readStrongBinder();
                                                            if (readStrongBinder45 != null) {
                                                                IInterface queryLocalInterface45 = readStrongBinder45.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                alzm16 = queryLocalInterface45 instanceof alzm ? (alzm) queryLocalInterface45 : new alzk(readStrongBinder45);
                                                            } else {
                                                                alzm16 = null;
                                                            }
                                                            mo40568a(alzm16, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), dcl.m8167a(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), dcl.m8167a(parcel), parcel.readInt(), parcel.readInt());
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 403:
                                                            IBinder readStrongBinder46 = parcel.readStrongBinder();
                                                            if (readStrongBinder46 != null) {
                                                                IInterface queryLocalInterface46 = readStrongBinder46.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                if (queryLocalInterface46 instanceof alzm) {
                                                                    alzm20 = (alzm) queryLocalInterface46;
                                                                } else {
                                                                    alzm20 = new alzk(readStrongBinder46);
                                                                }
                                                            }
                                                            mo40559a(alzm20, parcel.readString(), parcel.readString(), parcel.readInt());
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 404:
                                                            IBinder readStrongBinder47 = parcel.readStrongBinder();
                                                            if (readStrongBinder47 != null) {
                                                                IInterface queryLocalInterface47 = readStrongBinder47.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                alzm17 = queryLocalInterface47 instanceof alzm ? (alzm) queryLocalInterface47 : new alzk(readStrongBinder47);
                                                            } else {
                                                                alzm17 = null;
                                                            }
                                                            mo40573a(alzm17, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), dcl.m8167a(parcel), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                                                            parcel2.writeNoException();
                                                            return true;
                                                        default:
                                                            switch (i2) {
                                                                case 504:
                                                                    IBinder readStrongBinder48 = parcel.readStrongBinder();
                                                                    if (readStrongBinder48 != null) {
                                                                        IInterface queryLocalInterface48 = readStrongBinder48.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                        if (queryLocalInterface48 instanceof alzm) {
                                                                            alzm20 = (alzm) queryLocalInterface48;
                                                                        } else {
                                                                            alzm20 = new alzk(readStrongBinder48);
                                                                        }
                                                                    }
                                                                    sce a7 = mo40547a(alzm20, parcel.readString());
                                                                    parcel2.writeNoException();
                                                                    dcl.m8164a(parcel4, a7);
                                                                    return true;
                                                                case 505:
                                                                    IBinder readStrongBinder49 = parcel.readStrongBinder();
                                                                    if (readStrongBinder49 != null) {
                                                                        IInterface queryLocalInterface49 = readStrongBinder49.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                        alzm18 = queryLocalInterface49 instanceof alzm ? (alzm) queryLocalInterface49 : new alzk(readStrongBinder49);
                                                                    } else {
                                                                        alzm18 = null;
                                                                    }
                                                                    sce b2 = mo40582b(alzm18, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                                                                    parcel2.writeNoException();
                                                                    dcl.m8164a(parcel4, b2);
                                                                    return true;
                                                                case 506:
                                                                    IBinder readStrongBinder50 = parcel.readStrongBinder();
                                                                    if (readStrongBinder50 != null) {
                                                                        IInterface queryLocalInterface50 = readStrongBinder50.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                        if (queryLocalInterface50 instanceof alzm) {
                                                                            alzm20 = (alzm) queryLocalInterface50;
                                                                        } else {
                                                                            alzm20 = new alzk(readStrongBinder50);
                                                                        }
                                                                    }
                                                                    sce c = mo40589c(alzm20, parcel.readString(), parcel.readString(), parcel.readInt());
                                                                    parcel2.writeNoException();
                                                                    dcl.m8164a(parcel4, c);
                                                                    return true;
                                                                case 507:
                                                                    IBinder readStrongBinder51 = parcel.readStrongBinder();
                                                                    if (readStrongBinder51 != null) {
                                                                        IInterface queryLocalInterface51 = readStrongBinder51.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                        alzm19 = queryLocalInterface51 instanceof alzm ? (alzm) queryLocalInterface51 : new alzk(readStrongBinder51);
                                                                    } else {
                                                                        alzm19 = null;
                                                                    }
                                                                    sce a8 = mo40549a(alzm19, parcel.readString(), parcel.readString(), dcl.m8167a(parcel), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), dcl.m8167a(parcel));
                                                                    parcel2.writeNoException();
                                                                    dcl.m8164a(parcel4, a8);
                                                                    return true;
                                                                case 508:
                                                                    IBinder readStrongBinder52 = parcel.readStrongBinder();
                                                                    if (readStrongBinder52 != null) {
                                                                        IInterface queryLocalInterface52 = readStrongBinder52.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                        if (queryLocalInterface52 instanceof alzm) {
                                                                            alzm20 = (alzm) queryLocalInterface52;
                                                                        } else {
                                                                            alzm20 = new alzk(readStrongBinder52);
                                                                        }
                                                                    }
                                                                    sce a9 = mo40546a(alzm20, (AvatarReference) dcl.m8163a(parcel3, AvatarReference.CREATOR), (ParcelableLoadImageOptions) dcl.m8163a(parcel3, ParcelableLoadImageOptions.CREATOR));
                                                                    parcel2.writeNoException();
                                                                    dcl.m8164a(parcel4, a9);
                                                                    return true;
                                                                case 509:
                                                                    IBinder readStrongBinder53 = parcel.readStrongBinder();
                                                                    if (readStrongBinder53 != null) {
                                                                        IInterface queryLocalInterface53 = readStrongBinder53.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                                                                        if (queryLocalInterface53 instanceof alzm) {
                                                                            alzm20 = (alzm) queryLocalInterface53;
                                                                        } else {
                                                                            alzm20 = new alzk(readStrongBinder53);
                                                                        }
                                                                    }
                                                                    sce a10 = mo40548a(alzm20, parcel.readString(), parcel.readInt());
                                                                    parcel2.writeNoException();
                                                                    dcl.m8164a(parcel4, a10);
                                                                    return true;
                                                                default:
                                                                    return false;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            IBinder readStrongBinder54 = parcel.readStrongBinder();
            if (readStrongBinder54 != null) {
                IInterface queryLocalInterface54 = readStrongBinder54.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                if (queryLocalInterface54 instanceof alzm) {
                    alzm20 = (alzm) queryLocalInterface54;
                } else {
                    alzm20 = new alzk(readStrongBinder54);
                }
            }
            sce b3 = mo40581b(alzm20, parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            dcl.m8164a(parcel4, b3);
            return true;
        }
    }
}
