package p000;

import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tpa */
final /* synthetic */ class tpa implements aubw {

    /* renamed from: a */
    private final tpf f46432a;

    /* renamed from: b */
    private final View f46433b;

    public tpa(tpf tpf, View view) {
        this.f46432a = tpf;
        this.f46433b = view;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        tpf tpf = this.f46432a;
        View view = this.f46433b;
        tpf.addAll((bngx) obj);
        view.findViewById(C0126R.C0129id.progress_bar).setVisibility(8);
    }
}
