package p000;

import android.app.KeyguardManager;
import android.content.Intent;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: jwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jwk {

    /* renamed from: a */
    private final KeyguardManager f23403a;

    /* renamed from: b */
    private final CharSequence f23404b;

    public jwk(KeyguardManager keyguardManager, CharSequence charSequence) {
        this.f23403a = keyguardManager;
        this.f23404b = charSequence;
    }

    /* renamed from: a */
    public final Intent mo14167a() {
        try {
            return this.f23403a.createConfirmFactoryResetCredentialIntent(null, null, this.f23404b);
        } catch (IllegalStateException | UnsupportedOperationException e) {
            Logger Logger = PreAddAccountChimeraActivity.f11420a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Error while createConfirmFactoryResetCredentialIntent:");
            sb.append(valueOf);
            Logger.mo25416d(sb.toString(), new Object[0]);
            return null;
        }
    }
}
