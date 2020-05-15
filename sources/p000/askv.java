package p000;

import android.support.p002v7.widget.RecyclerView;
import android.widget.ViewSwitcher;
import com.google.android.gms.tapandpay.diagnostics.TapDiagnosticsChimeraActivity;

/* renamed from: askv */
public final /* synthetic */ class askv implements C0038ax {

    /* renamed from: a */
    private final TapDiagnosticsChimeraActivity f89136a;

    /* renamed from: b */
    private final aslk f89137b;

    /* renamed from: c */
    private final asld f89138c;

    /* renamed from: d */
    private final ViewSwitcher f89139d;

    /* renamed from: e */
    private final RecyclerView f89140e;

    public askv(TapDiagnosticsChimeraActivity tapDiagnosticsChimeraActivity, aslk aslk, asld asld, ViewSwitcher viewSwitcher, RecyclerView recyclerView) {
        this.f89136a = tapDiagnosticsChimeraActivity;
        this.f89137b = aslk;
        this.f89138c = asld;
        this.f89139d = viewSwitcher;
        this.f89140e = recyclerView;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        TapDiagnosticsChimeraActivity tapDiagnosticsChimeraActivity = this.f89136a;
        aslk aslk = this.f89137b;
        asld asld = this.f89138c;
        ViewSwitcher viewSwitcher = this.f89139d;
        RecyclerView recyclerView = this.f89140e;
        if (!((Boolean) obj).booleanValue()) {
            bnhe a = asld.mo49220a();
            aslk.f89173d = Long.valueOf(System.currentTimeMillis());
            aslk.f89174e = a;
            aslk.f89175f = a;
            viewSwitcher.setDisplayedChild(viewSwitcher.indexOfChild(recyclerView));
            tapDiagnosticsChimeraActivity.mo59208a(((Boolean) asld.f89155b.mo2448b()).booleanValue());
        }
    }
}
