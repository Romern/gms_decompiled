package p000;

import android.content.Intent;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f23394a;

    /* renamed from: b */
    final /* synthetic */ Intent f23395b;

    /* renamed from: c */
    final /* synthetic */ PreAddAccountChimeraActivity f23396c;

    public jwe(PreAddAccountChimeraActivity preAddAccountChimeraActivity, int i, Intent intent) {
        this.f23396c = preAddAccountChimeraActivity;
        this.f23394a = i;
        this.f23395b = intent;
    }

    public final void run() {
        jwe.super.mo7874a(this.f23394a, this.f23395b);
    }
}
