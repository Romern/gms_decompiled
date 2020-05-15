package p000;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: xvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvu extends Fragment {

    /* renamed from: a */
    public xeg f53252a;

    /* renamed from: b */
    public xwn f53253b;

    /* renamed from: c */
    public xwj f53254c;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f53253b.mo30186a(this.f53254c, xag.TYPE_SCREEN_LOCK_SELECTED);
        Intent createConfirmDeviceCredentialIntent = ((KeyguardManager) getContext().getSystemService("keyguard")).createConfirmDeviceCredentialIntent(getContext().getString(C0126R.string.verify_your_identity_title), String.format(getContext().getString(C0126R.string.verify_your_identity_description), getArguments().getCharSequence("caller_name")));
        if (createConfirmDeviceCredentialIntent != null && isAdded()) {
            startActivityForResult(createConfirmDeviceCredentialIntent, 10);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10) {
            return;
        }
        if (i2 != -1) {
            this.f53253b.mo30186a(this.f53254c, xag.TYPE_SCREEN_LOCK_NOT_RECOGNIZED);
            this.f53252a.mo29667a(new xma("Lock screen credential verification failed"));
            return;
        }
        this.f53253b.mo30186a(this.f53254c, xag.TYPE_SCREEN_LOCK_RECOGNIZED);
        this.f53252a.mo29668a(xpj.SCREEN_LOCK);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }
}
