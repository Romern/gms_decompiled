package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: tgj */
final /* synthetic */ class tgj implements View.OnClickListener {

    /* renamed from: a */
    private final tgk f45934a;

    /* renamed from: b */
    private final String f45935b;

    public tgj(tgk tgk, String str) {
        this.f45934a = tgk;
        this.f45935b = str;
    }

    public void onClick(View view) {
        tgk tgk = this.f45934a;
        Intent a = aqqy.m72007a(tgk.f45938c.f45942d.getIntent(), this.f45935b, tgk.f45938c.f45943e);
        tgk.f45938c.f45940b.mo26568a(tio.SMART_PROFILE_PEOPLE_IN_COMMON_CARD_PERSON_BUTTON, tio.SMART_PROFILE_PEOPLE_IN_COMMON_CARD);
        tgk.f45938c.f45942d.startActivityForResult(a, 0);
    }
}
