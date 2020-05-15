package p000;

import android.content.Context;
import android.view.LayoutInflater;
import com.felicanetworks.mfc.C0126R;

/* renamed from: akpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akpr implements akqi {

    /* renamed from: a */
    final /* synthetic */ LayoutInflater f72397a;

    /* renamed from: b */
    final /* synthetic */ akpv f72398b;

    public akpr(akpv akpv, LayoutInflater layoutInflater) {
        this.f72398b = akpv;
        this.f72397a = layoutInflater;
    }

    /* renamed from: a */
    public final void mo39677a(int i) {
        int i2;
        int i3;
        if (i == 2) {
            i2 = C0126R.C0127drawable.quantum_ic_flash_on_white_24;
            i3 = C0126R.string.ocr_flash_state_on;
        } else if (i != 3) {
            i2 = C0126R.C0127drawable.quantum_ic_flash_auto_white_24;
            i3 = C0126R.string.ocr_flash_state_auto;
        } else {
            i2 = C0126R.C0127drawable.quantum_ic_flash_off_white_24;
            i3 = C0126R.string.ocr_flash_state_off;
        }
        Context context = this.f72397a.getContext();
        this.f72398b.f72410i.setImageDrawable(C1133kh.m17836a(context, i2));
        this.f72398b.f72410i.setContentDescription(context.getString(i3));
        this.f72398b.f72410i.sendAccessibilityEvent(4);
    }
}
