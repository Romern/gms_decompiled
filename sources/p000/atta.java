package p000;

import android.content.Intent;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: atta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atta extends atue {
    public atta(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50168a(int i, int i2, Intent intent, atsy atsy) {
        if (i2 == -1) {
            atsy.f90850m = intent.getStringExtra("alternate_cardholder_name");
            mo50180a(13, atsy);
            return;
        }
        mo50187b(i2, 4);
        mo50178a();
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        Intent className = new Intent().setClassName(this.f90898f, "com.google.android.gms.tapandpay.tokenization.NameResolutionActivity");
        className.putExtra("extra_account_info", atsy.f90857t);
        mo50181a(className, 12);
    }
}
