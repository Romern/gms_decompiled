package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.mdm.internal.DeviceInfo;
import java.util.concurrent.ExecutionException;

/* renamed from: afza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afza extends dck implements IInterface {

    /* renamed from: a */
    private final int f64986a;

    public afza() {
        super("com.google.android.gms.mdm.internal.IDeviceManagerService");
    }

    /* renamed from: a */
    private final void m53692a(afyz afyz, int i, DeviceInfo deviceInfo) {
        String str;
        if (srq.m36142c(this.f64986a)) {
            Parcel bj = afyz.mo8529bj();
            bj.writeInt(i);
            dcl.m8165a(bj, deviceInfo);
            afyz.mo8528b(4, bj);
            return;
        }
        if (deviceInfo != null) {
            str = deviceInfo.f80047a;
        } else {
            str = null;
        }
        Parcel bj2 = afyz.mo8529bj();
        bj2.writeInt(i);
        bj2.writeString(str);
        afyz.mo8528b(1, bj2);
    }

    public afza(int i) {
        super("com.google.android.gms.mdm.internal.IDeviceManagerService");
        this.f64986a = i;
    }

    /* renamed from: a */
    public static void m53693a(RequestFuture requestFuture) {
        caki caki = (caki) requestFuture.get();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        afyz afyz;
        afyz afyz2;
        DeviceInfo deviceInfo = null;
        afyz afyz3 = null;
        int i2 = 0;
        int i3 = 0;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
                afyz = queryLocalInterface instanceof afyz ? (afyz) queryLocalInterface : new afyz(readStrongBinder);
            } else {
                afyz = null;
            }
            sdo.m34959a(afyz);
            RequestFuture newFuture = RequestFuture.newFuture();
            RequestQueue a = afyu.m53684a();
            bxvd da = cajx.f174890e.mo74144da();
            long a2 = spn.m35843a(rpr.m34216b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajx cajx = (cajx) da.f164949b;
            if (!cajx.f174893b.mo73666a()) {
                cajx.f174893b = bxvk.m124020a(cajx.f174893b);
            }
            cajx.f174893b.mo74161a(a2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cajx cajx2 = (cajx) da.f164949b;
            int i4 = 2 | cajx2.f174892a;
            cajx2.f174892a = i4;
            cajx2.f174895d = a2;
            cajx2.f174892a = i4 | 1;
            cajx2.f174894c = true;
            a.add(afyv.m53688a(String.valueOf(cgko.m145918b()).concat("/nova/get_devices"), true, newFuture, newFuture, (bxxk) cajy.f174896b.mo74142c(7), (cajx) da.mo74062i()));
            int i5 = 13;
            try {
                bxwc bxwc = ((cajy) newFuture.get()).f174898a;
                if (bxwc.size() == 1) {
                    cajv cajv = ((cakn) bxwc.get(0)).f175023a;
                    if (cajv == null) {
                        cajv = cajv.f174878c;
                    }
                    try {
                        deviceInfo = new DeviceInfo(cajv.f174880a, cajv.f174881b);
                    } catch (InterruptedException | ExecutionException e) {
                        e = e;
                        i5 = 0;
                        try {
                            agac.m53791a(e, "Failed to retrieve device name", new Object[0]);
                            m53692a(afyz, i5, (DeviceInfo) null);
                            parcel2.writeNoException();
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            i2 = i5;
                            m53692a(afyz, i2, (DeviceInfo) null);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        m53692a(afyz, i2, (DeviceInfo) null);
                        throw th;
                    }
                } else {
                    i3 = 13;
                }
                m53692a(afyz, i3, deviceInfo);
            } catch (InterruptedException | ExecutionException e2) {
                e = e2;
                agac.m53791a(e, "Failed to retrieve device name", new Object[0]);
                m53692a(afyz, i5, (DeviceInfo) null);
                parcel2.writeNoException();
                return true;
            } catch (Throwable th3) {
                th = th3;
                i2 = 13;
                m53692a(afyz, i2, (DeviceInfo) null);
                throw th;
            }
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
                if (queryLocalInterface2 instanceof afyz) {
                    afyz3 = (afyz) queryLocalInterface2;
                } else {
                    afyz3 = new afyz(readStrongBinder2);
                }
            }
            String readString = parcel.readString();
            sdo.m34959a(afyz3);
            if (readString == null) {
                afyz3.mo35072a(10);
            } else {
                RequestFuture newFuture2 = RequestFuture.newFuture();
                afyu.m53685a(readString, newFuture2, newFuture2);
                try {
                    m53693a(newFuture2);
                    afyz3.mo35072a(0);
                } catch (InterruptedException | ExecutionException e3) {
                    agac.m53790a("Failed to rename device name", new Object[0]);
                }
            }
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
                afyz2 = queryLocalInterface3 instanceof afyz ? (afyz) queryLocalInterface3 : new afyz(readStrongBinder3);
            } else {
                afyz2 = null;
            }
            sdo.m34959a(afyz2);
            RequestFuture newFuture3 = RequestFuture.newFuture();
            afyu.m53685a(null, newFuture3, newFuture3);
            try {
                m53693a(newFuture3);
                Parcel bj = afyz2.mo8529bj();
                bj.writeInt(0);
                afyz2.mo8528b(3, bj);
            } catch (InterruptedException | ExecutionException e4) {
                agac.m53790a("Failed to clear device name", new Object[0]);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
