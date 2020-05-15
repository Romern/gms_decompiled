package p000;

import android.os.Bundle;
import android.view.MenuItem;

/* renamed from: aupg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aupg extends aupe {

    /* renamed from: b */
    public dns f92267b;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract dns mo50789e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo50790g();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo8628aW().mo15853b(true);
        dns dns = (dns) getSupportFragmentManager().findFragmentByTag(mo50790g());
        this.f92267b = dns;
        if (dns == null) {
            this.f92267b = mo50789e();
            getSupportFragmentManager().beginTransaction().replace(16908290, this.f92267b, mo50790g()).commit();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }
}
