package p000;

import com.google.android.gms.auth.api.identity.MatchPasswordResult;

/* renamed from: hhr */
final /* synthetic */ class hhr implements C0038ax {

    /* renamed from: a */
    private final hhv f19795a;

    public hhr(hhv hhv) {
        this.f19795a = hhv;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hhv hhv = this.f19795a;
        if (((MatchPasswordResult) obj).f10237a.size() == 1) {
            hhv.f19807e.setVisibility(8);
            hhv.f19806d.setBackground(null);
            hhv.f19806d.setOnClickListener(null);
        }
    }
}
