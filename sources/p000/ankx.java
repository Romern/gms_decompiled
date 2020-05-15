package p000;

import android.content.Intent;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;

/* renamed from: ankx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ankx extends anlg {

    /* renamed from: a */
    final /* synthetic */ AccountSignUpChimeraActivity f77038a;

    public ankx(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.f77038a = accountSignUpChimeraActivity;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        return this.f77038a.f82217d == 0;
    }

    /* renamed from: d */
    public final void mo41918d() {
        Intent intent = new Intent();
        intent.setClassName(this.f77038a, "com.google.android.gms.plus.oob.PlusActivity");
        if (this.f77038a.getIntent().hasExtra("com.google.android.gms.plus.OVERRIDE_THEME")) {
            intent.putExtra("com.google.android.gms.plus.OVERRIDE_THEME", this.f77038a.getIntent().getIntExtra("com.google.android.gms.plus.OVERRIDE_THEME", 0));
        }
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_BACK_BUTTON_NAME", this.f77038a.f82215b);
        intent.putExtra("com.google.android.gms.common.oob.EXTRA_ACCOUNT_NAME", this.f77038a.f82214a);
        intent.putExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE", this.f77038a.f82220g);
        this.f77038a.f82223j.mo46573a(intent);
        this.f77038a.startActivityForResult(intent, 2);
        AccountSignUpChimeraActivity accountSignUpChimeraActivity = this.f77038a;
        shz.m35338a(accountSignUpChimeraActivity, accountSignUpChimeraActivity.f82214a, riz.f43144b, rin.f43077b, this.f77038a.f82220g);
    }
}
