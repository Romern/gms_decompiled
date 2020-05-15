package p000;

import android.content.pm.PackageInfo;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.instantapps.LaunchData;
import com.google.android.gms.instantapps.internal.DiagnosticInfo;
import com.google.android.gms.instantapps.internal.InstantAppPreLaunchInfo;
import com.google.android.gms.instantapps.internal.OptInInfo;
import com.google.android.gms.instantapps.internal.Permissions;
import java.util.List;

/* renamed from: adgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface adgc extends IInterface {
    /* renamed from: a */
    void mo33440a(int i);

    /* renamed from: a */
    void mo33441a(Status status, PackageInfo packageInfo);

    /* renamed from: a */
    void mo33442a(Status status, ParcelFileDescriptor parcelFileDescriptor);

    /* renamed from: a */
    void mo33443a(Status status, BitmapTeleporter bitmapTeleporter);

    /* renamed from: a */
    void mo33444a(Status status, LaunchData launchData);

    /* renamed from: a */
    void mo33445a(Status status, DiagnosticInfo diagnosticInfo);

    /* renamed from: a */
    void mo33446a(Status status, InstantAppPreLaunchInfo instantAppPreLaunchInfo);

    /* renamed from: a */
    void mo33447a(Status status, OptInInfo optInInfo);

    /* renamed from: a */
    void mo33448a(Status status, Permissions permissions);

    /* renamed from: a */
    void mo33449a(Status status, List list);

    /* renamed from: a */
    void mo33450a(Status status, boolean z);

    /* renamed from: b */
    void mo33451b(Status status, boolean z);
}
