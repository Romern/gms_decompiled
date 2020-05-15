package p000;

import android.os.IBinder;
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

/* renamed from: ajyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyo extends dcj implements ajyq {
    public ajyo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.INearbySharingService");
    }

    /* renamed from: a */
    public final void mo38635a(AcceptParams acceptParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, acceptParams);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo38650a(RegisterSharingProviderParams registerSharingProviderParams) {
        throw null;
    }

    /* renamed from: a */
    public final void mo38661a(UnregisterSharingProviderParams unregisterSharingProviderParams) {
        throw null;
    }

    /* renamed from: a */
    public final void mo38636a(CancelParams cancelParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, cancelParams);
        mo8530c(14, bj);
    }

    /* renamed from: a */
    public final void mo38637a(GetAccountParams getAccountParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getAccountParams);
        mo8530c(22, bj);
    }

    /* renamed from: a */
    public final void mo38638a(GetContactsCountParams getContactsCountParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getContactsCountParams);
        mo8530c(30, bj);
    }

    /* renamed from: a */
    public final void mo38639a(GetContactsParams getContactsParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getContactsParams);
        mo8530c(27, bj);
    }

    /* renamed from: a */
    public final void mo38640a(GetDataUsageParams getDataUsageParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getDataUsageParams);
        mo8530c(24, bj);
    }

    /* renamed from: a */
    public final void mo38641a(GetDeviceNameParams getDeviceNameParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getDeviceNameParams);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo38642a(GetVisibilityParams getVisibilityParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getVisibilityParams);
        mo8530c(26, bj);
    }

    /* renamed from: a */
    public final void mo38643a(IsEnabledParams isEnabledParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, isEnabledParams);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo38644a(IsOptedInParams isOptedInParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, isOptedInParams);
        mo8530c(17, bj);
    }

    /* renamed from: a */
    public final void mo38645a(MarkContactAsSelectedParams markContactAsSelectedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, markContactAsSelectedParams);
        mo8530c(28, bj);
    }

    /* renamed from: a */
    public final void mo38646a(OpenParams openParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, openParams);
        mo8530c(15, bj);
    }

    /* renamed from: a */
    public final void mo38647a(OptInParams optInParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, optInParams);
        mo8530c(16, bj);
    }

    /* renamed from: a */
    public final void mo38648a(RegisterReceiveSurfaceParams registerReceiveSurfaceParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, registerReceiveSurfaceParams);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo38649a(RegisterSendSurfaceParams registerSendSurfaceParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, registerSendSurfaceParams);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo38651a(RejectParams rejectParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, rejectParams);
        mo8530c(13, bj);
    }

    /* renamed from: a */
    public final void mo38652a(SendParams sendParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sendParams);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo38653a(SetAccountParams setAccountParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setAccountParams);
        mo8530c(21, bj);
    }

    /* renamed from: a */
    public final void mo38654a(SetDataUsageParams setDataUsageParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setDataUsageParams);
        mo8530c(23, bj);
    }

    /* renamed from: a */
    public final void mo38655a(SetDeviceNameParams setDeviceNameParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setDeviceNameParams);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo38656a(SetEnabledParams setEnabledParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setEnabledParams);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo38657a(SetVisibilityParams setVisibilityParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setVisibilityParams);
        mo8530c(25, bj);
    }

    /* renamed from: a */
    public final void mo38658a(UnmarkContactAsSelectedParams unmarkContactAsSelectedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, unmarkContactAsSelectedParams);
        mo8530c(29, bj);
    }

    /* renamed from: a */
    public final void mo38659a(UnregisterReceiveSurfaceParams unregisterReceiveSurfaceParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, unregisterReceiveSurfaceParams);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo38660a(UnregisterSendSurfaceParams unregisterSendSurfaceParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, unregisterSendSurfaceParams);
        mo8530c(10, bj);
    }
}
