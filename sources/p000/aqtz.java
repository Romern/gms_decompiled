package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aqtz */
final /* synthetic */ class aqtz implements View.OnClickListener {

    /* renamed from: a */
    private final aqua f86801a;

    /* renamed from: b */
    private final bzjj f86802b;

    public aqtz(aqua aqua, bzjj bzjj) {
        this.f86801a = aqua;
        this.f86802b = bzjj;
    }

    public void onClick(View view) {
        aqua aqua = this.f86801a;
        Intent a = aqqy.m72007a(aqua.f86805c.getIntent(), this.f86802b.f170296b, aqua.f86804b);
        aqua.f86806d.mo26568a(tio.SMART_PROFILE_PEOPLE_IN_COMMON_CARD_PERSON_BUTTON, tio.SMART_PROFILE_PEOPLE_IN_COMMON_CARD);
        aqua.f86805c.startActivityForResult(a, 0);
    }
}
