package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;
import com.google.android.gms.nearby.sharing.internal.CancelParams;
import com.google.android.gms.nearby.sharing.internal.GetAccountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsCountParams;
import com.google.android.gms.nearby.sharing.internal.GetContactsParams;
import com.google.android.gms.nearby.sharing.internal.GetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.GetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.GetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.IsEnabledParams;
import com.google.android.gms.nearby.sharing.internal.IsOptedInParams;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;
import com.google.android.gms.nearby.sharing.internal.OpenParams;
import com.google.android.gms.nearby.sharing.internal.OptInParams;
import com.google.android.gms.nearby.sharing.internal.RegisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.RegisterSharingProviderParams;
import com.google.android.gms.nearby.sharing.internal.RejectParams;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;
import com.google.android.gms.nearby.sharing.internal.SetDataUsageParams;
import com.google.android.gms.nearby.sharing.internal.SetDeviceNameParams;
import com.google.android.gms.nearby.sharing.internal.SetEnabledParams;
import com.google.android.gms.nearby.sharing.internal.SetVisibilityParams;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterReceiveSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSendSurfaceParams;
import com.google.android.gms.nearby.sharing.internal.UnregisterSharingProviderParams;

/* renamed from: ajyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajyp extends dck implements ajyq {
    public ajyp() {
        super("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                mo38656a((SetEnabledParams) dcl.m8163a(parcel, SetEnabledParams.CREATOR));
                return true;
            case 2:
                mo38643a((IsEnabledParams) dcl.m8163a(parcel, IsEnabledParams.CREATOR));
                return true;
            case 3:
                mo38655a((SetDeviceNameParams) dcl.m8163a(parcel, SetDeviceNameParams.CREATOR));
                return true;
            case 4:
                mo38641a((GetDeviceNameParams) dcl.m8163a(parcel, GetDeviceNameParams.CREATOR));
                return true;
            case 5:
            case 6:
            case 18:
            case 19:
            case 20:
            default:
                return false;
            case 7:
                mo38648a((RegisterReceiveSurfaceParams) dcl.m8163a(parcel, RegisterReceiveSurfaceParams.CREATOR));
                return true;
            case 8:
                mo38659a((UnregisterReceiveSurfaceParams) dcl.m8163a(parcel, UnregisterReceiveSurfaceParams.CREATOR));
                return true;
            case 9:
                mo38649a((RegisterSendSurfaceParams) dcl.m8163a(parcel, RegisterSendSurfaceParams.CREATOR));
                return true;
            case 10:
                mo38660a((UnregisterSendSurfaceParams) dcl.m8163a(parcel, UnregisterSendSurfaceParams.CREATOR));
                return true;
            case 11:
                mo38652a((SendParams) dcl.m8163a(parcel, SendParams.CREATOR));
                return true;
            case 12:
                mo38635a((AcceptParams) dcl.m8163a(parcel, AcceptParams.CREATOR));
                return true;
            case 13:
                mo38651a((RejectParams) dcl.m8163a(parcel, RejectParams.CREATOR));
                return true;
            case 14:
                mo38636a((CancelParams) dcl.m8163a(parcel, CancelParams.CREATOR));
                return true;
            case 15:
                mo38646a((OpenParams) dcl.m8163a(parcel, OpenParams.CREATOR));
                return true;
            case 16:
                mo38647a((OptInParams) dcl.m8163a(parcel, OptInParams.CREATOR));
                return true;
            case 17:
                mo38644a((IsOptedInParams) dcl.m8163a(parcel, IsOptedInParams.CREATOR));
                return true;
            case 21:
                mo38653a((SetAccountParams) dcl.m8163a(parcel, SetAccountParams.CREATOR));
                return true;
            case 22:
                mo38637a((GetAccountParams) dcl.m8163a(parcel, GetAccountParams.CREATOR));
                return true;
            case 23:
                mo38654a((SetDataUsageParams) dcl.m8163a(parcel, SetDataUsageParams.CREATOR));
                return true;
            case 24:
                mo38640a((GetDataUsageParams) dcl.m8163a(parcel, GetDataUsageParams.CREATOR));
                return true;
            case 25:
                mo38657a((SetVisibilityParams) dcl.m8163a(parcel, SetVisibilityParams.CREATOR));
                return true;
            case 26:
                mo38642a((GetVisibilityParams) dcl.m8163a(parcel, GetVisibilityParams.CREATOR));
                return true;
            case 27:
                mo38639a((GetContactsParams) dcl.m8163a(parcel, GetContactsParams.CREATOR));
                return true;
            case 28:
                mo38645a((MarkContactAsSelectedParams) dcl.m8163a(parcel, MarkContactAsSelectedParams.CREATOR));
                return true;
            case 29:
                mo38658a((UnmarkContactAsSelectedParams) dcl.m8163a(parcel, UnmarkContactAsSelectedParams.CREATOR));
                return true;
            case 30:
                mo38638a((GetContactsCountParams) dcl.m8163a(parcel, GetContactsCountParams.CREATOR));
                return true;
            case 31:
                mo38650a((RegisterSharingProviderParams) dcl.m8163a(parcel, RegisterSharingProviderParams.CREATOR));
                return true;
            case 32:
                mo38661a((UnregisterSharingProviderParams) dcl.m8163a(parcel, UnregisterSharingProviderParams.CREATOR));
                return true;
        }
    }
}
