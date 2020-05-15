package p000;

import android.widget.CompoundButton;

/* renamed from: tpu */
final /* synthetic */ class tpu implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final tpx f46464a;

    public tpu(tpx tpx) {
        this.f46464a = tpx;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        tpx tpx = this.f46464a;
        tpx.f46468b.mo26763a(tsg.m37426a(z, "credentials_enable_service"));
        tpx.f46467a.mo26715a(!z ? 47011 : 47012);
    }
}
