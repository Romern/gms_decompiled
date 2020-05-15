package p000;

import com.felicanetworks.mfc.C0126R;

/* renamed from: ttq */
final /* synthetic */ class ttq implements C0038ax {

    /* renamed from: a */
    private final tts f46655a;

    public ttq(tts tts) {
        this.f46655a = tts;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tts tts = this.f46655a;
        tql tql = (tql) obj;
        if (tql != null) {
            int c = tql.mo26737c();
            int i = c - 1;
            if (c != 0) {
                if (i == 0) {
                    tsl.m37443a(tts.getActivity()).mo26769b();
                } else if (i == 1) {
                    return;
                } else {
                    if (i == 2) {
                        tts.getView().findViewById(C0126R.C0129id.ep_screen_error).setVisibility(0);
                        tts.getView().findViewById(C0126R.C0129id.ep_screen_error_description).setVisibility(0);
                        tts.mo26799a(false);
                    }
                }
                tts.mo26799a(false);
                return;
            }
            throw null;
        }
    }
}
