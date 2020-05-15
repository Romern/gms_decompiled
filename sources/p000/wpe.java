package p000;

import android.view.View;
import com.google.android.gms.family.model.MemberDataModel;

/* renamed from: wpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpe implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ MemberDataModel f51075a;

    /* renamed from: b */
    final /* synthetic */ wpg f51076b;

    public wpe(wpg wpg, MemberDataModel memberDataModel) {
        this.f51076b = wpg;
        this.f51075a = memberDataModel;
    }

    public void onClick(View view) {
        this.f51076b.f51077a.mo18443b().mo29109a(6);
        wpg wpg = this.f51076b;
        wpg.f51077a.mo18508a(this.f51075a, wpg.f51078b, false);
    }
}
