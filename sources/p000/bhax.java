package p000;

import android.view.View;

/* renamed from: bhax */
final /* synthetic */ class bhax implements View.OnClickListener {

    /* renamed from: a */
    private final bhay f118219a;

    public bhax(bhay bhay) {
        this.f118219a = bhay;
    }

    public void onClick(View view) {
        bhay bhay = this.f118219a;
        sex a = sex.m35104a(bhay);
        if (a != null) {
            String str = bhay.mo63509i().f118214a;
            if (str != null) {
                a.mo25452d(str);
            }
            bhay.finish();
        }
    }
}
