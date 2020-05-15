package p000;

import android.content.Context;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: uvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uvw {

    /* renamed from: a */
    public final uhn f48657a;

    /* renamed from: b */
    public final ubq f48658b;

    /* renamed from: c */
    public final Context f48659c;

    /* renamed from: d */
    public final uaj f48660d;

    public uvw(vpu vpu) {
        this.f48657a = vpu.f49757d;
        this.f48658b = vpu.f49758e;
        this.f48659c = vpu.f49755b;
        this.f48660d = vpu.f49759f;
    }

    /* renamed from: a */
    public static void m39524a(uhn uhn, uih uih, DriveId driveId, MetadataBundle metadataBundle, String str) {
        sdo.m34966a(driveId, "Parent Drive ID cannot be null.");
        uey a = uey.m38255a(uih);
        try {
            if (!uhn.mo27402a(a, ukk.m38862a(driveId.f30729b)).mo27573ai()) {
                throw new aaaj(10, "Creating singletons is only supported in appFolder.");
            } else if (uhn.mo27420b(a, (String) metadataBundle.mo18269a(uzm.f48729E), str, true) != null) {
                throw new aaaj(1501, "Unique resource with the same identifier already exists.");
            }
        } catch (uaa e) {
            throw new aaaj(8, "Application is no longer authorized.");
        }
    }

    /* renamed from: a */
    public static boolean m39525a(MetadataBundle metadataBundle) {
        return metadataBundle.mo18275c(uzm.f48729E);
    }
}
