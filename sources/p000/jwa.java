package p000;

import android.content.Intent;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwa */
public final /* synthetic */ class jwa implements aubw {

    /* renamed from: a */
    private final PreAddAccountChimeraActivity f23388a;

    /* renamed from: b */
    private final String f23389b;

    public jwa(PreAddAccountChimeraActivity preAddAccountChimeraActivity, String str) {
        this.f23388a = preAddAccountChimeraActivity;
        this.f23389b = str;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        Void voidR = (Void) obj;
        this.f23388a.sendBroadcast(new Intent("com.google.android.gms.auth.PHENOTYPE_SYNC_COMPLETE").putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", this.f23389b));
    }
}
