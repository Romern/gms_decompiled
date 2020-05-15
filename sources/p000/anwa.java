package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.model.posts.Settings;

/* renamed from: anwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anwa extends saf {

    /* renamed from: a */
    private final ConnectionResult f77801a;

    /* renamed from: b */
    private final Settings f77802b;

    public anwa(anwj anwj, anuu anuu, ConnectionResult connectionResult, Settings settings) {
        super(anwj, anuu);
        this.f77801a = connectionResult;
        this.f77802b = settings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        ((anuu) obj).mo42301a(this.f77801a, this.f77802b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
    }
}
