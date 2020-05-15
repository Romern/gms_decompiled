package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwj extends jxi {

    /* renamed from: a */
    final /* synthetic */ PreAddAccountChimeraActivity f23402a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jwj(PreAddAccountChimeraActivity preAddAccountChimeraActivity, Context context, boolean z) {
        super(context, z);
        this.f23402a = preAddAccountChimeraActivity;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        new ixl(this.f23402a).mo13428a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("loader_result_certified", true);
        return bundle;
    }
}
