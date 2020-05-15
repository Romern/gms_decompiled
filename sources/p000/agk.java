package p000;

import android.text.TextUtils;

/* renamed from: agk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ago f504a;

    public agk(ago ago) {
        this.f504a = ago;
    }

    public final void run() {
        try {
            agk.super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
