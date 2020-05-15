package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: abgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgq extends abgl {

    /* renamed from: f */
    private final InProductHelp f57422f;

    public abgq(GoogleHelpChimeraService googleHelpChimeraService, String str, abcf abcf, InProductHelp inProductHelp) {
        super("ProcessInProductHelpAndPipOperation", googleHelpChimeraService, str, abcf);
        this.f57422f = inProductHelp;
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        abgp.m47693a(this.f57422f.f78784a, this.f57413d, this.f57412a);
        this.f57414e.mo32001a(this.f57422f);
    }
}
