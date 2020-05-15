package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: anwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anwi extends saf {

    /* renamed from: a */
    private final ConnectionResult f77816a;

    /* renamed from: b */
    private final UpgradeAccountEntity f77817b;

    public anwi(anwj anwj, anux anux, ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        super(anwj, anux);
        this.f77816a = connectionResult;
        this.f77817b = upgradeAccountEntity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        ((anux) obj).mo42304a(this.f77816a, this.f77817b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
    }
}
