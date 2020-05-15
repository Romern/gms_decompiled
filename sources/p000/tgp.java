package p000;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: tgp */
final /* synthetic */ class tgp implements View.OnClickListener {

    /* renamed from: a */
    private final tgr f45951a;

    /* renamed from: b */
    private final bzjn f45952b;

    public tgp(tgr tgr, bzjn bzjn) {
        this.f45951a = tgr;
        this.f45952b = bzjn;
    }

    public void onClick(View view) {
        tgr tgr = this.f45951a;
        bzjn bzjn = this.f45952b;
        tgr.f45955a.mo26568a(tio.REPORTING_CHAIN_PERSON_BUTTON, tio.REPORTING_CHAIN_CARD);
        if (!bzjn.f170315c.isEmpty()) {
            aqpr aqpr = tgr.f45961g;
            String str = bzjn.f170315c;
            Activity activity = aqpr.f86524a;
            activity.startActivityForResult(aqqy.m72007a(activity.getIntent(), str, aqpr.f86525b), 0);
        }
    }
}
