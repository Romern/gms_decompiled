package p000;

import android.widget.TextView;
import com.google.android.gms.credential.manager.util.FadeInImageView;

/* renamed from: tta */
final /* synthetic */ class tta implements C0038ax {

    /* renamed from: a */
    private final ttb f46624a;

    /* renamed from: b */
    private final FadeInImageView f46625b;

    /* renamed from: c */
    private final TextView f46626c;

    public tta(ttb ttb, FadeInImageView fadeInImageView, TextView textView) {
        this.f46624a = ttb;
        this.f46625b = fadeInImageView;
        this.f46626c = textView;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        ttb ttb = this.f46624a;
        FadeInImageView fadeInImageView = this.f46625b;
        TextView textView = this.f46626c;
        bsjx bsjx = (bsjx) obj;
        if (bsjx != null) {
            tog.m37287a(fadeInImageView, textView, (bskf) bsjx.mo70638c().get(0), bsjx.mo70637b(), ttb.getActivity());
        }
    }
}
