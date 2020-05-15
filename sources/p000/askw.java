package p000;

import com.google.android.gms.tapandpay.diagnostics.TapDiagnosticsChimeraActivity;

/* renamed from: askw */
public final /* synthetic */ class askw implements C0038ax {

    /* renamed from: a */
    private final TapDiagnosticsChimeraActivity f89141a;

    /* renamed from: b */
    private final asld f89142b;

    public askw(TapDiagnosticsChimeraActivity tapDiagnosticsChimeraActivity, asld asld) {
        this.f89141a = tapDiagnosticsChimeraActivity;
        this.f89142b = asld;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        TapDiagnosticsChimeraActivity tapDiagnosticsChimeraActivity = this.f89141a;
        Boolean bool = (Boolean) obj;
        if (!((Boolean) this.f89142b.f89154a.mo2448b()).booleanValue()) {
            tapDiagnosticsChimeraActivity.mo59208a(bool.booleanValue());
        }
    }
}
