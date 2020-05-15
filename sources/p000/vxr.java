package p000;

import android.net.Network;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.droidguard.DroidGuardChimeraService;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* renamed from: vxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxr extends dck implements vxs {

    /* renamed from: a */
    final /* synthetic */ DroidGuardChimeraService f50205a;

    /* renamed from: b */
    private final String f50206b;

    public vxr() {
        super("com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    /* renamed from: a */
    public final vxp mo28941a() {
        vyo a = this.f50205a.mo18375a(this.f50206b);
        String str = this.f50206b;
        DroidGuardChimeraService droidGuardChimeraService = this.f50205a;
        bnic bnic = DroidGuardChimeraService.f31244a;
        return new vxo(str, droidGuardChimeraService, droidGuardChimeraService.f31245b, a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vxr(DroidGuardChimeraService droidGuardChimeraService, String str) {
        super("com.google.android.gms.droidguard.internal.IDroidGuardService");
        this.f50205a = droidGuardChimeraService;
        this.f50206b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        android.util.Log.w("DG", "Error running fast program, falling through", r1);
        r3.f50223d.mo28911a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        android.util.Log.w("DG", "Fast program not available, falling through");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[ExcHandler: LinkageError (e java.lang.LinkageError), Splitter:B:3:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[Catch:{ RemoteException -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo28942a(vxm vxm, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        byte[] bArr;
        ParcelFileDescriptor parcelFileDescriptor;
        abpc abpc;
        Bundle bundle;
        vyo a = this.f50205a.mo18375a(this.f50206b);
        DroidGuardChimeraService droidGuardChimeraService = this.f50205a;
        bnic bnic = DroidGuardChimeraService.f31244a;
        try {
            vyc vyc = droidGuardChimeraService.f31245b;
            String str2 = this.f50206b;
            if (cdrq.m134759b() && vwh.m41491a(str)) {
                bArr = vyc.mo28951a(str, a, droidGuardResultsRequest).mo28990a(map);
                Parcel bj = vxm.mo8529bj();
                bj.writeByteArray(bArr);
                vxm.mo8530c(1, bj);
                if (droidGuardResultsRequest == null && (parcelFileDescriptor = (ParcelFileDescriptor) droidGuardResultsRequest.f31252a.getParcelable("fd")) != null) {
                    try {
                        parcelFileDescriptor.close();
                        return;
                    } catch (Exception e) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!(droidGuardResultsRequest == null || (bundle = droidGuardResultsRequest.f31252a) == null)) {
                int i = Build.VERSION.SDK_INT;
                Network network = (Network) bundle.getParcelable("networkToUse");
                if (network != null) {
                    abpc = new abpc(network);
                    bArr = vyc.mo28950a(str2, str, a, abpc, droidGuardResultsRequest).mo28990a(map);
                    Parcel bj2 = vxm.mo8529bj();
                    bj2.writeByteArray(bArr);
                    vxm.mo8530c(1, bj2);
                    if (droidGuardResultsRequest == null) {
                        return;
                    }
                    return;
                }
            }
            abpc = null;
            bArr = vyc.mo28950a(str2, str, a, abpc, droidGuardResultsRequest).mo28990a(map);
        } catch (Exception e2) {
            e = e2;
            try {
                bArr = vwn.m41495a(str, this.f50205a, map, e);
                Parcel bj22 = vxm.mo8529bj();
                bj22.writeByteArray(bArr);
                vxm.mo8530c(1, bj22);
                if (droidGuardResultsRequest == null) {
                }
            } catch (RemoteException e3) {
                DroidGuardChimeraService droidGuardChimeraService2 = this.f50205a;
                bnic bnic2 = DroidGuardChimeraService.f31244a;
                droidGuardChimeraService2.f31248e.mo28911a(e3);
                return;
            }
        } catch (LinkageError e4) {
        }
        Parcel bj222 = vxm.mo8529bj();
        bj222.writeByteArray(bArr);
        vxm.mo8530c(1, bj222);
        if (droidGuardResultsRequest == null) {
        }
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        vxm vxm;
        vxm vxm2 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                vxm = queryLocalInterface instanceof vxm ? (vxm) queryLocalInterface : new vxm(readStrongBinder);
            } else {
                vxm = null;
            }
            mo28942a(vxm, parcel.readString(), dcl.m8170c(parcel), null);
        } else if (i == 2) {
            vxp a = mo28941a();
            parcel2.writeNoException();
            dcl.m8164a(parcel2, a);
        } else if (i == 3) {
            long a2 = cdrh.f181595a.mo6606a().mo78207a();
            parcel2.writeNoException();
            parcel2.writeInt((int) a2);
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
                if (queryLocalInterface2 instanceof vxm) {
                    vxm2 = (vxm) queryLocalInterface2;
                } else {
                    vxm2 = new vxm(readStrongBinder2);
                }
            }
            mo28942a(vxm2, parcel.readString(), dcl.m8170c(parcel), (DroidGuardResultsRequest) dcl.m8163a(parcel, DroidGuardResultsRequest.CREATOR));
        }
        return true;
    }
}
