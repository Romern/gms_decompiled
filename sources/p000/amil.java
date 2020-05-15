package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.DialogFragment;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.profile.AvatarChimeraActivity;

/* renamed from: amil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amil implements rkl {

    /* renamed from: a */
    final /* synthetic */ AvatarChimeraActivity f74942a;

    public amil(AvatarChimeraActivity avatarChimeraActivity) {
        this.f74942a = avatarChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        alli alli = (alli) rkk;
        Status bo = alli.mo7183bo();
        String b = alli.mo40487b();
        AvatarChimeraActivity avatarChimeraActivity = this.f74942a;
        boolean z = false;
        avatarChimeraActivity.f81952f = false;
        DialogFragment dialogFragment = avatarChimeraActivity.f81947a;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        Intent intent = new Intent();
        if (!bo.mo17710c() || TextUtils.isEmpty(b)) {
            this.f74942a.mo46368b(8);
            this.f74942a.setResult(1, intent);
        } else {
            intent.putExtra("com.google.android.gms.people.profile.EXTRA_AVATAR_URL", b);
            this.f74942a.mo46367a(riq.f43085b, "2");
            this.f74942a.mo46367a(rip.f43083a, (String) null);
            AvatarChimeraActivity avatarChimeraActivity2 = this.f74942a;
            if (avatarChimeraActivity2.f81949c != null) {
                z = true;
            }
            avatarChimeraActivity2.mo46365a(7, z);
            this.f74942a.setResult(-1, intent);
        }
        this.f74942a.finish();
    }
}
