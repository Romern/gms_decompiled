package p000;

import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: ubq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface ubq {
    /* renamed from: a */
    long mo27160a(uey uey, int i);

    /* renamed from: a */
    ParcelFileDescriptor mo27161a(ujx ujx);

    /* renamed from: a */
    Contents mo27162a(uey uey, int i, IBinder iBinder);

    /* renamed from: a */
    DriveId mo27164a(uey uey, int i, MetadataBundle metadataBundle, DriveId driveId, uaw uaw);

    /* renamed from: a */
    void mo27165a(AppIdentity appIdentity, int i);

    /* renamed from: a */
    void mo27167a(uey uey, int i, MetadataBundle metadataBundle, boolean z, uaw uaw);
}
