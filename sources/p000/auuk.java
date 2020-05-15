package p000;

import com.google.android.gms.trustlet.face.internal.FaceUnlockTrustletChimeraService;

/* renamed from: auuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auuk implements aumq {

    /* renamed from: a */
    final /* synthetic */ FaceUnlockTrustletChimeraService f92550a;

    public auuk(FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService) {
        this.f92550a = faceUnlockTrustletChimeraService;
    }

    /* renamed from: a */
    public final void mo50647a() {
    }

    /* renamed from: b */
    public final void mo50648b() {
        FaceUnlockTrustletChimeraService faceUnlockTrustletChimeraService;
        String str;
        this.f92550a.mo59573A();
        if (FaceUnlockTrustletChimeraService.m93505z()) {
            faceUnlockTrustletChimeraService = this.f92550a;
            str = "Trusted_face_is_enabled_by_user";
        } else {
            faceUnlockTrustletChimeraService = this.f92550a;
            str = "Trusted_face_is_disabled_by_user";
        }
        faceUnlockTrustletChimeraService.mo50778u(str);
    }
}
