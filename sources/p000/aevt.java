package p000;

import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: aevt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aevt implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f63922a;

    /* renamed from: b */
    final /* synthetic */ boolean f63923b;

    /* renamed from: c */
    final /* synthetic */ aevz f63924c;

    /* renamed from: d */
    final /* synthetic */ aevu f63925d;

    public aevt(aevu aevu, boolean z, boolean z2, aevz aevz) {
        this.f63925d = aevu;
        this.f63922a = z;
        this.f63923b = z2;
        this.f63924c = aevz;
    }

    public void onClick(View view) {
        int i;
        boolean isSelected = this.f63925d.f201a.isSelected();
        boolean z = !isSelected;
        int i2 = 0;
        boolean z2 = true;
        if (!this.f63922a && !this.f63923b) {
            z2 = false;
        }
        ImageView imageView = this.f63925d.f63927t;
        if (!z2) {
            i = 8;
        } else {
            i = !z ? 0 : 8;
        }
        imageView.setVisibility(i);
        this.f63925d.mo34618a(view.getContext(), (AudienceMember) this.f63924c.f63929d, z);
        this.f63925d.f201a.setSelected(z);
        View view2 = this.f63925d.f63926s;
        if (isSelected) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        this.f63924c.mo34620a();
    }
}
