package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.RelationFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tmq extends dck implements tmr {
    public tmq() {
        super("com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        tmo tmo;
        tmm tmm;
        tmm tmm2;
        tmj tmj;
        tmm tmm3;
        tmj tmj2;
        tmm tmm4;
        tmj tmj3;
        tmm tmm5;
        tmj tmj4;
        tmm tmm6;
        tmm tmm7;
        tmm tmm8;
        tmm tmm9;
        tmm tmm10;
        tmm tmm11;
        tmm tmm12 = null;
        tmm tmm13 = null;
        tmm tmm14 = null;
        tmm tmm15 = null;
        tmm tmm16 = null;
        tmm tmm17 = null;
        tmm tmm18 = null;
        tmj tmj5 = null;
        tmj tmj6 = null;
        tmj tmj7 = null;
        tmj tmj8 = null;
        tmm tmm19 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (queryLocalInterface instanceof tmo) {
                        tmo = (tmo) queryLocalInterface;
                        mo9993a(tmo, parcel.readString(), parcel.readString(), parcel.readString(), (WriteBatchImpl) dcl.m8163a(parcel, WriteBatchImpl.CREATOR));
                        break;
                    } else {
                        tmm12 = new tmm(readStrongBinder);
                    }
                }
                tmo = tmm12;
                mo9993a(tmo, parcel.readString(), parcel.readString(), parcel.readString(), (WriteBatchImpl) dcl.m8163a(parcel, WriteBatchImpl.CREATOR));
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    if (queryLocalInterface2 instanceof tmo) {
                        tmm = (tmo) queryLocalInterface2;
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) dcl.m8163a(parcel, ContextDataFilterImpl.CREATOR);
                        RelationFilterImpl relationFilterImpl = (RelationFilterImpl) dcl.m8163a(parcel, RelationFilterImpl.CREATOR);
                        mo9996b(tmm, readString, readString2, readString3, contextDataFilterImpl);
                        break;
                    } else {
                        tmm19 = new tmm(readStrongBinder2);
                    }
                }
                tmm = tmm19;
                String readString4 = parcel.readString();
                String readString22 = parcel.readString();
                String readString32 = parcel.readString();
                ContextDataFilterImpl contextDataFilterImpl2 = (ContextDataFilterImpl) dcl.m8163a(parcel, ContextDataFilterImpl.CREATOR);
                RelationFilterImpl relationFilterImpl2 = (RelationFilterImpl) dcl.m8163a(parcel, RelationFilterImpl.CREATOR);
                mo9996b(tmm, readString4, readString22, readString32, contextDataFilterImpl2);
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    tmm2 = queryLocalInterface3 instanceof tmo ? (tmo) queryLocalInterface3 : new tmm(readStrongBinder3);
                } else {
                    tmm2 = null;
                }
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ContextDataFilterImpl contextDataFilterImpl3 = (ContextDataFilterImpl) dcl.m8163a(parcel, ContextDataFilterImpl.CREATOR);
                RelationFilterImpl relationFilterImpl3 = (RelationFilterImpl) dcl.m8163a(parcel, RelationFilterImpl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (queryLocalInterface4 instanceof tml) {
                        tmj = (tml) queryLocalInterface4;
                        mo9990a(tmm2, readString5, readString6, readString7, contextDataFilterImpl3, tmj);
                        break;
                    } else {
                        tmj8 = new tmj(readStrongBinder4);
                    }
                }
                tmj = tmj8;
                mo9990a(tmm2, readString5, readString6, readString7, contextDataFilterImpl3, tmj);
            case 4:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    tmm3 = queryLocalInterface5 instanceof tmo ? (tmo) queryLocalInterface5 : new tmm(readStrongBinder5);
                } else {
                    tmm3 = null;
                }
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (queryLocalInterface6 instanceof tml) {
                        tmj2 = (tml) queryLocalInterface6;
                        mo9994a(tmm3, readString8, readString9, readString10, tmj2);
                        break;
                    } else {
                        tmj7 = new tmj(readStrongBinder6);
                    }
                }
                tmj2 = tmj7;
                mo9994a(tmm3, readString8, readString9, readString10, tmj2);
            case 5:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    tmm4 = queryLocalInterface7 instanceof tmo ? (tmo) queryLocalInterface7 : new tmm(readStrongBinder7);
                } else {
                    tmm4 = null;
                }
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                ContextDataFilterImpl contextDataFilterImpl4 = (ContextDataFilterImpl) dcl.m8163a(parcel, ContextDataFilterImpl.CREATOR);
                RelationFilterImpl relationFilterImpl4 = (RelationFilterImpl) dcl.m8163a(parcel, RelationFilterImpl.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (queryLocalInterface8 instanceof tml) {
                        tmj3 = (tml) queryLocalInterface8;
                        mo9991a(tmm4, readString11, readString12, readString13, contextDataFilterImpl4, tmj3, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                        break;
                    } else {
                        tmj6 = new tmj(readStrongBinder8);
                    }
                }
                tmj3 = tmj6;
                mo9991a(tmm4, readString11, readString12, readString13, contextDataFilterImpl4, tmj3, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
            case 6:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                    tmm5 = queryLocalInterface9 instanceof tmo ? (tmo) queryLocalInterface9 : new tmm(readStrongBinder9);
                } else {
                    tmm5 = null;
                }
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextListener");
                    if (queryLocalInterface10 instanceof tml) {
                        tmj4 = (tml) queryLocalInterface10;
                        mo9995a(tmm5, readString14, readString15, readString16, tmj4, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
                        break;
                    } else {
                        tmj5 = new tmj(readStrongBinder10);
                    }
                }
                tmj4 = tmj5;
                mo9995a(tmm5, readString14, readString15, readString16, tmj4, (PendingIntent) dcl.m8163a(parcel, PendingIntent.CREATOR));
            default:
                switch (i) {
                    case 12:
                        IBinder readStrongBinder11 = parcel.readStrongBinder();
                        if (readStrongBinder11 != null) {
                            IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                            if (queryLocalInterface11 instanceof tmo) {
                                tmm6 = (tmo) queryLocalInterface11;
                                mo9992a(tmm6, parcel.readString(), parcel.readString(), parcel.readString(), (InterestUpdateBatchImpl) dcl.m8163a(parcel, InterestUpdateBatchImpl.CREATOR));
                                break;
                            } else {
                                tmm18 = new tmm(readStrongBinder11);
                            }
                        }
                        tmm6 = tmm18;
                        mo9992a(tmm6, parcel.readString(), parcel.readString(), parcel.readString(), (InterestUpdateBatchImpl) dcl.m8163a(parcel, InterestUpdateBatchImpl.CREATOR));
                    case 13:
                        IBinder readStrongBinder12 = parcel.readStrongBinder();
                        if (readStrongBinder12 != null) {
                            IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                            if (queryLocalInterface12 instanceof tmo) {
                                tmm7 = (tmo) queryLocalInterface12;
                                mo9988a(tmm7, parcel.readString(), parcel.readString(), parcel.readString(), (FenceUpdateRequestImpl) dcl.m8163a(parcel, FenceUpdateRequestImpl.CREATOR));
                                break;
                            } else {
                                tmm17 = new tmm(readStrongBinder12);
                            }
                        }
                        tmm7 = tmm17;
                        mo9988a(tmm7, parcel.readString(), parcel.readString(), parcel.readString(), (FenceUpdateRequestImpl) dcl.m8163a(parcel, FenceUpdateRequestImpl.CREATOR));
                    case 14:
                        IBinder readStrongBinder13 = parcel.readStrongBinder();
                        if (readStrongBinder13 != null) {
                            IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                            if (queryLocalInterface13 instanceof tmo) {
                                tmm8 = (tmo) queryLocalInterface13;
                                mo9989a(tmm8, parcel.readString(), parcel.readString(), parcel.readString(), (ContextDataFilterImpl) dcl.m8163a(parcel, ContextDataFilterImpl.CREATOR));
                                break;
                            } else {
                                tmm16 = new tmm(readStrongBinder13);
                            }
                        }
                        tmm8 = tmm16;
                        mo9989a(tmm8, parcel.readString(), parcel.readString(), parcel.readString(), (ContextDataFilterImpl) dcl.m8163a(parcel, ContextDataFilterImpl.CREATOR));
                    case 15:
                        IBinder readStrongBinder14 = parcel.readStrongBinder();
                        if (readStrongBinder14 != null) {
                            IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                            if (queryLocalInterface14 instanceof tmo) {
                                tmm9 = (tmo) queryLocalInterface14;
                                mo9985a(tmm9, parcel.readString(), parcel.readString(), parcel.readString(), (SnapshotRequest) dcl.m8163a(parcel, SnapshotRequest.CREATOR));
                                break;
                            } else {
                                tmm15 = new tmm(readStrongBinder14);
                            }
                        }
                        tmm9 = tmm15;
                        mo9985a(tmm9, parcel.readString(), parcel.readString(), parcel.readString(), (SnapshotRequest) dcl.m8163a(parcel, SnapshotRequest.CREATOR));
                    case 16:
                        IBinder readStrongBinder15 = parcel.readStrongBinder();
                        if (readStrongBinder15 != null) {
                            IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                            if (queryLocalInterface15 instanceof tmo) {
                                tmm10 = (tmo) queryLocalInterface15;
                                mo9987a(tmm10, parcel.readString(), parcel.readString(), parcel.readString(), (FenceQueryRequestImpl) dcl.m8163a(parcel, FenceQueryRequestImpl.CREATOR));
                                break;
                            } else {
                                tmm14 = new tmm(readStrongBinder15);
                            }
                        }
                        tmm10 = tmm14;
                        mo9987a(tmm10, parcel.readString(), parcel.readString(), parcel.readString(), (FenceQueryRequestImpl) dcl.m8163a(parcel, FenceQueryRequestImpl.CREATOR));
                    case 17:
                        IBinder readStrongBinder16 = parcel.readStrongBinder();
                        if (readStrongBinder16 != null) {
                            IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.contextmanager.internal.IContextManagerPendingResult");
                            if (queryLocalInterface16 instanceof tmo) {
                                tmm11 = (tmo) queryLocalInterface16;
                                mo9986a(tmm11, parcel.readString(), parcel.readString(), parcel.readString(), (ContextFenceStub) dcl.m8163a(parcel, ContextFenceStub.CREATOR));
                                break;
                            } else {
                                tmm13 = new tmm(readStrongBinder16);
                            }
                        }
                        tmm11 = tmm13;
                        mo9986a(tmm11, parcel.readString(), parcel.readString(), parcel.readString(), (ContextFenceStub) dcl.m8163a(parcel, ContextFenceStub.CREATOR));
                    default:
                        return false;
                }
        }
        parcel2.writeNoException();
        return true;
    }
}
