package p000;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import com.google.android.gms.instantapps.internal.VisitedApplication;
import java.util.List;

/* renamed from: adgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class adgb extends dck implements adgc {
    public adgb() {
        super("com.google.android.gms.instantapps.internal.IInstantAppsCallbacks");
    }

    /* renamed from: a */
    public final void mo33440a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo33451b(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33441a(Status status, PackageInfo packageInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33442a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33443a(Status status, BitmapTeleporter bitmapTeleporter) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33444a(Status status, LaunchData launchData) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33445a(Status status, DiagnosticInfo diagnosticInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33446a(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo33447a(Status status, OptInInfo optInInfo) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33448a(Status status, Permissions permissions) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33449a(Status status, List list) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo33450a(Status status, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo33446a((Status) dcl.m8163a(parcel, Status.CREATOR), (InstantAppPreLaunchInfo) dcl.m8163a(parcel, InstantAppPreLaunchInfo.CREATOR));
            return true;
        } else if (i == 13) {
            mo33447a((Status) dcl.m8163a(parcel, Status.CREATOR), (OptInInfo) dcl.m8163a(parcel, OptInInfo.CREATOR));
            return true;
        } else if (i == 9) {
            mo33448a((Status) dcl.m8163a(parcel, Status.CREATOR), (Permissions) dcl.m8163a(parcel, Permissions.CREATOR));
            return true;
        } else if (i == 10) {
            mo33440a(parcel.readInt());
            return true;
        } else if (i == 26) {
            mo33450a((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel));
            return true;
        } else if (i != 27) {
            switch (i) {
                case 18:
                    mo33441a((Status) dcl.m8163a(parcel, Status.CREATOR), (PackageInfo) dcl.m8163a(parcel, PackageInfo.CREATOR));
                    return true;
                case 19:
                    mo33444a((Status) dcl.m8163a(parcel, Status.CREATOR), (LaunchData) dcl.m8163a(parcel, LaunchData.CREATOR));
                    return true;
                case 20:
                    mo33449a((Status) dcl.m8163a(parcel, Status.CREATOR), parcel.createTypedArrayList(VisitedApplication.CREATOR));
                    return true;
                case 21:
                    mo33442a((Status) dcl.m8163a(parcel, Status.CREATOR), (ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
                    return true;
                case 22:
                    mo33443a((Status) dcl.m8163a(parcel, Status.CREATOR), (BitmapTeleporter) dcl.m8163a(parcel, BitmapTeleporter.CREATOR));
                    return true;
                case 23:
                    mo33445a((Status) dcl.m8163a(parcel, Status.CREATOR), (DiagnosticInfo) dcl.m8163a(parcel, DiagnosticInfo.CREATOR));
                    return true;
                default:
                    return false;
            }
        } else {
            mo33451b((Status) dcl.m8163a(parcel, Status.CREATOR), dcl.m8167a(parcel));
            return true;
        }
    }
}
