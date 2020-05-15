package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: anvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvo extends saf {

    /* renamed from: a */
    private final ConnectionResult f77778a;

    /* renamed from: b */
    private final String f77779b;

    public anvo(anwj anwj, anmx anmx, ConnectionResult connectionResult, String str) {
        super(anwj, anmx);
        this.f77778a = connectionResult;
        this.f77779b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        anmw anmw;
        anmx anmx = (anmx) obj;
        ConnectionResult connectionResult = this.f77778a;
        String str = this.f77779b;
        if (anmx.f77173e && (anmw = anmx.f77172d) != null) {
            anmw.mo41973a(str, !connectionResult.mo17671b());
        }
        anmx.f77173e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
    }
}
