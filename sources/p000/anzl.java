package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;

/* renamed from: anzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzl implements anzj, rjz, rka, anux {

    /* renamed from: a */
    public String f77924a;

    /* renamed from: b */
    public String f77925b;

    /* renamed from: c */
    public String f77926c;

    /* renamed from: d */
    public final anul f77927d = anuy.f77749a;

    /* renamed from: e */
    public anuy f77928e;

    /* renamed from: f */
    public anzi f77929f;

    /* renamed from: g */
    public Activity f77930g;

    /* renamed from: h */
    public boolean f77931h;

    /* renamed from: i */
    public UpgradeAccountEntity f77932i;

    /* renamed from: j */
    public UpgradeAccountEntity f77933j;

    /* renamed from: k */
    private UpgradeAccountEntity f77934k;

    static {
        ((Boolean) ansx.f77660J.mo25081c()).booleanValue();
    }

    /* renamed from: a */
    public static Bundle m65646a(String str, String str2, PlusCommonExtras plusCommonExtras) {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", str2);
        plusCommonExtras.mo46574a(bundle);
        return bundle;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (this.f77932i == null) {
            this.f77928e.mo42321a(this, this.f77925b, (UpgradeAccountEntity) null);
        } else if (this.f77931h) {
            this.f77928e.mo42321a(this, this.f77925b, this.f77933j);
        }
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (this.f77932i == null || this.f77931h) {
            this.f77928e.mo42332x();
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        anzi anzi = this.f77929f;
        if (anzi != null) {
            anzi.mo42488b(connectionResult, null);
        }
    }

    /* renamed from: a */
    public final void mo42304a(ConnectionResult connectionResult, UpgradeAccountEntity upgradeAccountEntity) {
        if (!connectionResult.mo17671b()) {
            anzi anzi = this.f77929f;
            if (anzi != null) {
                anzi.mo42488b(connectionResult, upgradeAccountEntity);
            }
            this.f77931h = false;
        } else if (this.f77932i == null) {
            this.f77932i = upgradeAccountEntity;
            anzi anzi2 = this.f77929f;
            if (anzi2 != null) {
                anzi2.mo42487a(connectionResult, upgradeAccountEntity);
            }
        } else if (this.f77931h) {
            this.f77931h = false;
            this.f77933j = null;
            this.f77934k = upgradeAccountEntity;
            anzi anzi3 = this.f77929f;
            if (anzi3 != null) {
                anzi3.mo42488b(connectionResult, upgradeAccountEntity);
            }
        }
    }
}
