package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;

/* renamed from: afyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class afyr extends Activity {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Class mo35067a();

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            spn.m35870c((Activity) this);
            startActivity(getIntent().setClassName(this, apuh.m71023a(mo35067a())));
            finish();
        } catch (SecurityException e) {
            agac.m53790a("LockscreenActivity calling app incorrectly signed, closing.", new Object[0]);
            setResult(1);
            finish();
        }
    }
}
