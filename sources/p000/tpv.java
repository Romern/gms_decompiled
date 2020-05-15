package p000;

import android.widget.CompoundButton;

/* renamed from: tpv */
final /* synthetic */ class tpv implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final tpx f46465a;

    public tpv(tpx tpx) {
        this.f46465a = tpx;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        tpx tpx = this.f46465a;
        tpx.f46468b.mo26763a(tsg.m37426a(z, "credentials_enable_autosignin"));
        tpx.f46467a.mo26715a(!z ? 47013 : 47014);
    }
}
