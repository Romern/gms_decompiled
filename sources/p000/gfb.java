package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.audiomodem.AudioStreamParams;
import com.google.android.gms.audiomodem.Snoop$Params;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: gfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class gfb extends dck implements gfc {
    public gfb() {
        super("com.google.android.gms.audiomodem.internal.IAudioModemService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        gfm gfm;
        gfm gfm2;
        gfj gfj;
        gfj gfj2;
        gff gff;
        gez gez = null;
        gfg gfg = null;
        gez gez2 = null;
        gez gez3 = null;
        gez gez4 = null;
        gez gez5 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
                    gfm = queryLocalInterface instanceof gfm ? (gfm) queryLocalInterface : new gfk(readStrongBinder2);
                } else {
                    gfm = null;
                }
                TokenReceiver$Params tokenReceiver$Params = (TokenReceiver$Params) dcl.m8163a(parcel, TokenReceiver$Params.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
                    if (queryLocalInterface2 instanceof gez) {
                        gez = (gez) queryLocalInterface2;
                    } else {
                        gez = new gex(readStrongBinder3);
                    }
                }
                mo11757a(readStrongBinder, gfm, tokenReceiver$Params, gez);
                break;
            case 2:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.audiomodem.internal.ITokenReceiverListener");
                    gfm2 = queryLocalInterface3 instanceof gfm ? (gfm) queryLocalInterface3 : new gfk(readStrongBinder4);
                } else {
                    gfm2 = null;
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
                    if (queryLocalInterface4 instanceof gez) {
                        gez5 = (gez) queryLocalInterface4;
                    } else {
                        gez5 = new gex(readStrongBinder5);
                    }
                }
                mo11761a(gfm2, gez5);
                break;
            case 3:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder7.queryLocalInterface("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
                    gfj = queryLocalInterface5 instanceof gfj ? (gfj) queryLocalInterface5 : new gfh(readStrongBinder7);
                } else {
                    gfj = null;
                }
                TokenBroadcaster$Params tokenBroadcaster$Params = (TokenBroadcaster$Params) dcl.m8163a(parcel, TokenBroadcaster$Params.CREATOR);
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder8.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
                    if (queryLocalInterface6 instanceof gez) {
                        gez4 = (gez) queryLocalInterface6;
                    } else {
                        gez4 = new gex(readStrongBinder8);
                    }
                }
                mo11756a(readStrongBinder6, gfj, tokenBroadcaster$Params, gez4);
                break;
            case 4:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder9.queryLocalInterface("com.google.android.gms.audiomodem.internal.ITokenBroadcasterListener");
                    gfj2 = queryLocalInterface7 instanceof gfj ? (gfj) queryLocalInterface7 : new gfh(readStrongBinder9);
                } else {
                    gfj2 = null;
                }
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder10.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
                    if (queryLocalInterface8 instanceof gez) {
                        gez3 = (gez) queryLocalInterface8;
                    } else {
                        gez3 = new gex(readStrongBinder10);
                    }
                }
                mo11760a(gfj2, gez3);
                break;
            case 5:
                Snoop$Params snoop$Params = (Snoop$Params) dcl.m8163a(parcel, Snoop$Params.CREATOR);
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder11.queryLocalInterface("com.google.android.gms.audiomodem.internal.ISnoopCallback");
                    gff = queryLocalInterface9 instanceof gff ? (gff) queryLocalInterface9 : new gfd(readStrongBinder11);
                } else {
                    gff = null;
                }
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder12.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
                    if (queryLocalInterface10 instanceof gez) {
                        gez2 = (gez) queryLocalInterface10;
                    } else {
                        gez2 = new gex(readStrongBinder12);
                    }
                }
                mo11759a(snoop$Params, gff, gez2);
                break;
            case 6:
                AudioStreamParams audioStreamParams = (AudioStreamParams) dcl.m8163a(parcel, AudioStreamParams.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder13.queryLocalInterface("com.google.android.gms.audiomodem.internal.IStreamInputCallback");
                    if (queryLocalInterface11 instanceof gfg) {
                        gfg = (gfg) queryLocalInterface11;
                    } else {
                        gfg = new gfg(readStrongBinder13);
                    }
                }
                mo11758a(audioStreamParams, gfg);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
