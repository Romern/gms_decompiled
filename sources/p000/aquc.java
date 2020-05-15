package p000;

import android.content.Intent;
import android.view.View;

/* renamed from: aquc */
final /* synthetic */ class aquc implements View.OnClickListener {

    /* renamed from: a */
    private final aqud f86813a;

    /* renamed from: b */
    private final bzjn f86814b;

    public aquc(aqud aqud, bzjn bzjn) {
        this.f86813a = aqud;
        this.f86814b = bzjn;
    }

    public void onClick(View view) {
        aqud aqud = this.f86813a;
        bzjn bzjn = this.f86814b;
        if (!bzjn.f170315c.isEmpty()) {
            Intent a = aqqy.m72007a(aqud.f86815a.getIntent(), bzjn.f170315c, aqud.f86817c);
            aqud.f86818d.mo26568a(tio.REPORTING_CHAIN_PERSON_BUTTON, tio.REPORTING_CHAIN_CARD);
            aqud.f86815a.startActivityForResult(a, 0);
        }
    }
}
