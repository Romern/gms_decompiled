package p000;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: apdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apdc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ apdd f84153a;

    public apdc(apdd apdd) {
        this.f84153a = apdd;
    }

    public void onClick(View view) {
        CompoundButton compoundButton = this.f84153a.f84158e;
        compoundButton.setChecked(!compoundButton.isChecked());
    }
}
