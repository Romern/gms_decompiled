package p000;

import android.content.Intent;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.plus.activity.AccountSignUpChimeraActivity;
import java.util.Set;

/* renamed from: anla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anla extends anlg {

    /* renamed from: a */
    final /* synthetic */ AccountSignUpChimeraActivity f77041a;

    public anla(AccountSignUpChimeraActivity accountSignUpChimeraActivity) {
        this.f77041a = accountSignUpChimeraActivity;
    }

    /* renamed from: c */
    public final boolean mo41917c() {
        return this.f77041a.f82214a != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent
     arg types: [java.lang.String, com.google.android.gms.common.api.Scope[], int]
     candidates:
      sbv.a(android.content.Context, java.lang.String, java.lang.String):void
      sbv.a(android.content.Context, java.lang.String, int[]):void
      sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent */
    /* renamed from: d */
    public final void mo41918d() {
        Set a = stc.m36282a(this.f77041a.f82218e.substring(7).split(" "));
        Intent a2 = sbv.m34873a(this.f77041a.f82221h, (Scope[]) a.toArray(new Scope[a.size()]), false);
        a2.putExtra("overrideTheme", 1);
        this.f77041a.startActivityForResult(a2, 1);
    }
}
