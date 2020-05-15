package p000;

import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.audience.AudienceAvatarImageView;
import com.google.android.gms.plus.audience.UpdateCirclesChimeraActivity;

/* renamed from: anrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrc implements rkl {

    /* renamed from: a */
    final /* synthetic */ UpdateCirclesChimeraActivity f77488a;

    public anrc(UpdateCirclesChimeraActivity updateCirclesChimeraActivity) {
        this.f77488a = updateCirclesChimeraActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        allh allh = (allh) rkk;
        ParcelFileDescriptor b = allh.mo40486b();
        if (allh.mo7183bo().mo17710c() && b != null) {
            this.f77488a.f82329x = alls.m61238a(b);
            UpdateCirclesChimeraActivity updateCirclesChimeraActivity = this.f77488a;
            if (updateCirclesChimeraActivity.f82329x != null) {
                updateCirclesChimeraActivity.findViewById(C0126R.C0129id.add_to_circles_user_icon).setVisibility(0);
                ((AudienceAvatarImageView) this.f77488a.findViewById(C0126R.C0129id.add_to_circles_user_icon)).mo46542a(this.f77488a.f82329x);
            }
        }
    }
}
