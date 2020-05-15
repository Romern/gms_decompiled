package p000;

import android.net.Uri;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

/* renamed from: amij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amij implements rkl {

    /* renamed from: a */
    final /* synthetic */ AvatarChimeraActivity f74940a;

    public amij(AvatarChimeraActivity avatarChimeraActivity) {
        this.f74940a = avatarChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alky alky = (alky) rkk;
        if (!alky.mo7183bo().mo17710c() || alky.mo12459b().mo24660a() != 1) {
            this.f74940a.mo46371f();
            this.f74940a.mo46369d();
            return;
        }
        AvatarChimeraActivity avatarChimeraActivity = this.f74940a;
        avatarChimeraActivity.f81948b = true;
        Uri uri = avatarChimeraActivity.f81949c;
        if (uri == null && avatarChimeraActivity.f81950d == null && !avatarChimeraActivity.f81952f) {
            new amis().show(avatarChimeraActivity.getSupportFragmentManager(), "source_dialog");
        } else if ((uri == null && avatarChimeraActivity.f81950d == null) || avatarChimeraActivity.f81952f || avatarChimeraActivity.f81951e != null) {
        } else {
            if (uri == null) {
                Uri uri2 = avatarChimeraActivity.f81950d;
                if (uri2 != null) {
                    avatarChimeraActivity.mo46366a(uri2);
                    return;
                }
                return;
            }
            avatarChimeraActivity.mo46366a(uri);
        }
    }
}
