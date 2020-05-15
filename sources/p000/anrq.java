package p000;

import android.widget.ImageView;

/* renamed from: anrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anrq implements rkl {

    /* renamed from: a */
    final /* synthetic */ String f77523a;

    /* renamed from: b */
    final /* synthetic */ ImageView f77524b;

    /* renamed from: c */
    final /* synthetic */ anrs f77525c;

    public anrq(anrs anrs, String str, ImageView imageView) {
        this.f77525c = anrs;
        this.f77523a = str;
        this.f77524b = imageView;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        allh allh = (allh) rkk;
        if (allh.mo7183bo().mo17710c() && allh.mo40486b() != null) {
            new anrr(this.f77525c, allh.mo40486b(), this.f77523a, this.f77524b).execute(new Void[0]);
        }
    }
}
