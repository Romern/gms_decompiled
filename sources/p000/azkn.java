package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.p091ui.CardChimeraActivity;

/* renamed from: azkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azkn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CardChimeraActivity f99561a;

    public azkn(CardChimeraActivity cardChimeraActivity) {
        this.f99561a = cardChimeraActivity;
    }

    public final void run() {
        String str;
        CardChimeraActivity cardChimeraActivity = this.f99561a;
        if (cardChimeraActivity.f111242z != null) {
            str = cardChimeraActivity.mo60412c(4);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || cardChimeraActivity.mo60418p()) {
            azoj.m85932b("CardChimeraActivity", "No OnboardingMessage found in app data", new Object[0]);
            return;
        }
        cardChimeraActivity.mo60403C();
        String u = cardChimeraActivity.mo55081u();
        String o = cardChimeraActivity.mo60417o();
        String string = cardChimeraActivity.getString(C0126R.string.common_got_it);
        String string2 = cardChimeraActivity.getString(C0126R.string.common_no_thanks);
        azlk azlk = new azlk();
        Bundle bundle = new Bundle();
        bundle.putString("app_name", u);
        bundle.putString("sender_name", o);
        bundle.putString("onboarding_message", str);
        bundle.putString("positive_button_string", string);
        bundle.putString("negative_button_string", string2);
        azlk.setArguments(bundle);
        cardChimeraActivity.getSupportFragmentManager().beginTransaction().addToBackStack(null).add(azlk, "first_time_clicked").commitAllowingStateLoss();
        cardChimeraActivity.mo60410b(72);
    }
}
