package p000;

import com.google.firebase.auth.internal.FederatedSignInActivity;

/* renamed from: brrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ FederatedSignInActivity f143286a;

    public brrx(FederatedSignInActivity federatedSignInActivity) {
        this.f143286a = federatedSignInActivity;
    }

    public final void run() {
        this.f143286a.mo8657d();
        FederatedSignInActivity.f152576k = null;
    }
}
