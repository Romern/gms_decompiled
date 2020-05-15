package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.internal.connection.AcceptConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.CancelPayloadParams;
import com.google.android.gms.nearby.internal.connection.ClientDisconnectingParams;
import com.google.android.gms.nearby.internal.connection.DisconnectFromEndpointParams;
import com.google.android.gms.nearby.internal.connection.InitiateBandwidthUpgradeParams;
import com.google.android.gms.nearby.internal.connection.RejectConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.SendPayloadParams;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StartDiscoveryParams;
import com.google.android.gms.nearby.internal.connection.StopAdvertisingParams;
import com.google.android.gms.nearby.internal.connection.StopAllEndpointsParams;
import com.google.android.gms.nearby.internal.connection.StopDiscoveryParams;

/* renamed from: aigk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aigk extends dck implements aigl {
    public aigk() {
        super("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        aigi aigi;
        aigi aigi2;
        aigi aigi3;
        aigi aigi4;
        aigi aigi5 = null;
        switch (i) {
            case 1001:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    if (queryLocalInterface instanceof aigi) {
                        aigi = (aigi) queryLocalInterface;
                        String readString = parcel.readString();
                        AppMetadata appMetadata = (AppMetadata) dcl.m8163a(parcel, AppMetadata.CREATOR);
                        mo36607b(aigi, readString, parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    }
                    aigi5 = new aigi(readStrongBinder);
                }
                aigi = aigi5;
                String readString2 = parcel.readString();
                AppMetadata appMetadata2 = (AppMetadata) dcl.m8163a(parcel, AppMetadata.CREATOR);
                mo36607b(aigi, readString2, parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 1002:
                mo36585a(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 1003:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                    if (queryLocalInterface2 instanceof aigi) {
                        aigi2 = (aigi) queryLocalInterface2;
                        mo36587a(aigi2, parcel.readString(), parcel.readLong(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    }
                    aigi5 = new aigi(readStrongBinder2);
                }
                aigi2 = aigi5;
                mo36587a(aigi2, parcel.readString(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 1004:
                parcel.readString();
                mo36614g(parcel.readLong());
                parcel2.writeNoException();
                return true;
            default:
                switch (i) {
                    case 1007:
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                            if (queryLocalInterface3 instanceof aigi) {
                                aigi3 = (aigi) queryLocalInterface3;
                                mo36588a(aigi3, parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                                parcel2.writeNoException();
                                return true;
                            }
                            aigi5 = new aigi(readStrongBinder3);
                        }
                        aigi3 = aigi5;
                        mo36588a(aigi3, parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1008:
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        if (readStrongBinder4 != null) {
                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                            if (queryLocalInterface4 instanceof aigi) {
                                aigi4 = (aigi) queryLocalInterface4;
                                mo36589a(aigi4, parcel.readString(), parcel.createByteArray(), parcel.readLong());
                                parcel2.writeNoException();
                                return true;
                            }
                            aigi5 = new aigi(readStrongBinder4);
                        }
                        aigi4 = aigi5;
                        mo36589a(aigi4, parcel.readString(), parcel.createByteArray(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1009:
                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                        if (readStrongBinder5 != null) {
                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionCallbacks");
                            if (queryLocalInterface5 instanceof aigi) {
                                aigi5 = (aigi) queryLocalInterface5;
                            } else {
                                aigi5 = new aigi(readStrongBinder5);
                            }
                        }
                        mo36586a(aigi5, parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1010:
                        mo36605a(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1011:
                        mo36608b(parcel.createStringArray(), parcel.createByteArray(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1012:
                        mo36603a(parcel.readString(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1013:
                        mo36606b(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1014:
                        mo36609c(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 1015:
                        String d = mo36610d(parcel.readLong());
                        parcel2.writeNoException();
                        parcel2.writeString(d);
                        return true;
                    case 1016:
                        String a = mo36584a();
                        parcel2.writeNoException();
                        parcel2.writeString(a);
                        return true;
                    default:
                        switch (i) {
                            case 2001:
                                mo36598a((StartAdvertisingParams) dcl.m8163a(parcel, StartAdvertisingParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2002:
                                mo36600a((StopAdvertisingParams) dcl.m8163a(parcel, StopAdvertisingParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2003:
                                mo36599a((StartDiscoveryParams) dcl.m8163a(parcel, StartDiscoveryParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2004:
                                mo36602a((StopDiscoveryParams) dcl.m8163a(parcel, StopDiscoveryParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2005:
                                mo36596a((SendConnectionRequestParams) dcl.m8163a(parcel, SendConnectionRequestParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2006:
                                mo36590a((AcceptConnectionRequestParams) dcl.m8163a(parcel, AcceptConnectionRequestParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2007:
                                mo36595a((RejectConnectionRequestParams) dcl.m8163a(parcel, RejectConnectionRequestParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2008:
                                mo36597a((SendPayloadParams) dcl.m8163a(parcel, SendPayloadParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2009:
                                mo36593a((DisconnectFromEndpointParams) dcl.m8163a(parcel, DisconnectFromEndpointParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2010:
                                mo36601a((StopAllEndpointsParams) dcl.m8163a(parcel, StopAllEndpointsParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2011:
                                mo36592a((ClientDisconnectingParams) dcl.m8163a(parcel, ClientDisconnectingParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2012:
                                mo36591a((CancelPayloadParams) dcl.m8163a(parcel, CancelPayloadParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            case 2013:
                                mo36594a((InitiateBandwidthUpgradeParams) dcl.m8163a(parcel, InitiateBandwidthUpgradeParams.CREATOR));
                                parcel2.writeNoException();
                                return true;
                            default:
                                return false;
                        }
                }
        }
    }
}
