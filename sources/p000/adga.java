package p000;

import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import java.util.List;

/* renamed from: adga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adga extends dcj implements adgc {
    public adga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    /* renamed from: a */
    public final void mo33440a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(10, bj);
    }

    /* renamed from: b */
    public final void mo33451b(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(27, bj);
    }

    /* renamed from: a */
    public final void mo33441a(Status status, PackageInfo packageInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, packageInfo);
        mo8530c(18, bj);
    }

    /* renamed from: a */
    public final void mo33442a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, parcelFileDescriptor);
        mo8530c(21, bj);
    }

    /* renamed from: a */
    public final void mo33443a(Status status, BitmapTeleporter bitmapTeleporter) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, bitmapTeleporter);
        mo8530c(22, bj);
    }

    /* renamed from: a */
    public final void mo33444a(Status status, LaunchData launchData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, launchData);
        mo8530c(19, bj);
    }

    /* renamed from: a */
    public final void mo33445a(Status status, DiagnosticInfo diagnosticInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, diagnosticInfo);
        mo8530c(23, bj);
    }

    /* renamed from: a */
    public final void mo33446a(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, instantAppPreLaunchInfo);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo33447a(Status status, OptInInfo optInInfo) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, optInInfo);
        mo8530c(13, bj);
    }

    /* renamed from: a */
    public final void mo33448a(Status status, Permissions permissions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, permissions);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo33449a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(20, bj);
    }

    /* renamed from: a */
    public final void mo33450a(Status status, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8166a(bj, z);
        mo8530c(26, bj);
    }
}
