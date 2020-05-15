package p000;

import android.content.Context;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileRequest;
import com.google.android.gms.drive.internal.OnDriveIdResponse;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ucx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ucx extends ucg {

    /* renamed from: f */
    private final ubq f47281f;

    /* renamed from: g */
    private final uhn f47282g;

    /* renamed from: h */
    private final CreateFileRequest f47283h;

    public ucx(ubk ubk, ubq ubq, uhn uhn, CreateFileRequest createFileRequest, uto uto) {
        super("CreateFileOperation", ubk, uto, 4);
        this.f47281f = ubq;
        this.f47282g = uhn;
        this.f47283h = createFileRequest;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: uvx.a(uey, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean):void
     arg types: [uey, com.google.android.gms.drive.metadata.internal.MetadataBundle, int]
     candidates:
      uvx.a(java.lang.String, java.lang.String, int):void
      uvx.a(java.lang.String, java.lang.String, java.lang.String):void
      uvx.a(java.lang.String, ujx, com.google.android.gms.drive.metadata.internal.MetadataBundle):void
      uvx.a(uey, ujx, com.google.android.gms.drive.metadata.internal.MetadataBundle):void
      uvx.a(uey, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean):void */
    /* renamed from: b */
    public final void mo27230b(Context context) {
        int i;
        DriveId driveId;
        boolean z;
        aaal.m21020a(this.f47283h, "Invalid create request: no request");
        int b = this.f47283h.mo18185b();
        this.f47239c.mo28302d(b);
        int a = this.f47283h.mo18184a();
        boolean z2 = false;
        if (b == 0) {
            if (a != 0) {
                z = true;
            } else {
                z = false;
            }
            aaal.m21021a(z, "Invalid create request: invalid contents");
        } else if (a != 0) {
            throw new aaaj(10, "Shortcut files may not have content");
        }
        MetadataBundle metadataBundle = this.f47283h.f30836b;
        aaal.m21020a(metadataBundle, "Invalid create request: no metadata");
        this.f47239c.mo28282a(metadataBundle);
        DriveId driveId2 = this.f47283h.f30835a;
        aaal.m21020a(driveId2, "Invalid create request: no parent");
        uyy a2 = uyy.m39807a((String) metadataBundle.mo18269a(uzm.f48738N));
        this.f47239c.mo28292a(this.f47237a.mo27086a(driveId2), a2 != null ? a2.f48723a : null);
        CreateFileRequest createFileRequest = this.f47283h;
        int i2 = createFileRequest.f30841g;
        String str = createFileRequest.f30840f;
        this.f47239c.mo28293a(createFileRequest.f30839e, str != null, Integer.valueOf(i2));
        if (b != 0 || a2 == null || !a2.f48723a.startsWith("application/vnd.google-apps")) {
            if (b == 1) {
                if (a2 == null) {
                    metadataBundle.mo18273b(uzm.f48738N, "application/vnd.google-apps.drive-sdk");
                } else if (!a2.mo28124a()) {
                    throw new aaaj(10, "Shortcut files must have MIME type application/vnd.google-apps.drive-sdk");
                }
            }
            uey b2 = mo27233b();
            if (!(a == 1 || b == 1)) {
                if (this.f47281f.mo27160a(b2, a) > this.f47282g.mo27418b(b2.f47394a.f47682a).f47688c) {
                    throw new aaaj(1508, "Contents too large to create or save file");
                }
            }
            aaal.m21021a(twv.m37575b(i2), "Invalid commitStrategy.");
            if (!(i2 == 0 || str == null)) {
                aaal.m21021a(twv.m37574a(str), "Tracking tag is invalid");
            }
            MetadataBundle metadataBundle2 = this.f47283h.f30836b;
            Date date = new Date();
            metadataBundle2.mo18273b(uzp.f48771c, date);
            metadataBundle2.mo18273b(uzp.f48772d, date);
            metadataBundle2.mo18273b(uzp.f48769a, date);
            int a3 = this.f47283h.mo18184a();
            if (a3 == 1) {
                a3 = this.f47281f.mo27162a(mo27233b(), 536870912, this.f47238b.asBinder()).f30721b;
            }
            CreateFileRequest createFileRequest2 = this.f47283h;
            DriveId driveId3 = createFileRequest2.f30835a;
            int b3 = createFileRequest2.mo18185b();
            CreateFileRequest createFileRequest3 = this.f47283h;
            int i3 = createFileRequest3.f30841g;
            boolean z3 = createFileRequest3.f30839e;
            String str2 = createFileRequest3.f30840f;
            ubk ubk = this.f47237a;
            DriveId e = ubk.mo27094e(driveId3);
            uvx.m39531a(ubk.f47143d, metadataBundle2, false);
            if (b3 != 1) {
                i = a3;
            } else {
                i = 0;
            }
            uaw a4 = uaw.m37852a(i3, z3, ubk.mo27093d(), str2, ubk.mo27100h(), uaw.f47070a.f47076g);
            uvw uvw = ubk.f47148i;
            uey uey = ubk.f47143d;
            if (b3 == 0) {
                uvw.f48658b.mo27165a(uey.f47396c, i);
            }
            String str3 = (String) metadataBundle2.mo18269a(uzm.f48738N);
            uyy a5 = uyy.m39807a(str3);
            if (a5 == null || !a5.f48723a.equals("application/vnd.google-apps.folder")) {
                z2 = true;
            }
            sdo.m34975b(z2, "This method may not be used to create folders.");
            if (TextUtils.isEmpty((CharSequence) metadataBundle2.mo18269a(uzm.f48741Q))) {
                metadataBundle2.mo18273b(uzm.f48741Q, uvw.f48659c.getResources().getString(C0126R.string.drive_create_file_default_title));
            }
            if (b3 != 0) {
                sdo.m34975b(!uvw.m39525a(metadataBundle2), "Creating singleton shortcut file is not supported.");
                metadataBundle2.mo18273b(uzm.f48738N, "application/vnd.google-apps.drive-sdk");
                tyh tyh = new tyh(uey.f47394a, uey.f47396c, metadataBundle2, e);
                uvw.f48660d.mo26998a(tyh);
                driveId = tyh.f46921g;
            } else {
                if (str3 == null) {
                    metadataBundle2.mo18273b(uzm.f48738N, "application/octet-stream");
                }
                if (uvw.m39525a(metadataBundle2)) {
                    uvw.m39524a(uvw.f48657a, uey.f47394a, e, metadataBundle2, uey.f47395b);
                }
                driveId = uvw.f48658b.mo27164a(uey, i, metadataBundle2, e, a4);
            }
            this.f47238b.mo27945a(new OnDriveIdResponse(driveId));
            return;
        }
        throw new aaaj(10, "This method may not be used to create Google Apps files.");
    }
}
