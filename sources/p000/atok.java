package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tapandpay.tap2.TapUiChimeraActivity;

/* renamed from: atok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atok extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ TapUiChimeraActivity f90591a;

    public atok(TapUiChimeraActivity tapUiChimeraActivity) {
        this.f90591a = tapUiChimeraActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        String str;
        animator.removeListener(this);
        TapUiChimeraActivity tapUiChimeraActivity = this.f90591a;
        srn srn = TapUiChimeraActivity.f108685b;
        if (tapUiChimeraActivity.f108716h.isEmpty()) {
            this.f90591a.f108721n.setVisibility(4);
            TapUiChimeraActivity tapUiChimeraActivity2 = this.f90591a;
            Intent addFlags = new Intent("com.google.commerce.tapandpay.android.tap.AFTER_TAP_SHOWN").putExtra("account_id_extra", tapUiChimeraActivity2.f108732y.f108325a).putExtra("card_info_extra", tapUiChimeraActivity2.f108733z).addFlags(67108864).addFlags(268435456);
            String str2 = (String) tapUiChimeraActivity2.f108731x.getTag();
            if (!TextUtils.isEmpty(str2)) {
                if (tapUiChimeraActivity2.f108731x.getDrawable() == null) {
                    str = "doodle_failed_id_extra";
                } else {
                    str = "doodle_id_extra";
                }
                addFlags.putExtra(str, str2);
            }
            if (atxn.m76506a(tapUiChimeraActivity2, addFlags)) {
                tapUiChimeraActivity2.startActivity(addFlags);
            }
            tapUiChimeraActivity2.finish();
            tapUiChimeraActivity2.overridePendingTransition(0, 0);
            return;
        }
        this.f90591a.f108693D.mo33956a(new atoj(this));
    }
}
