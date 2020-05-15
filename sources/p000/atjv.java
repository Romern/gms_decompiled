package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.android.volley.AuthFailureError;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.internal.firstparty.SetActiveAccountRequest;
import java.io.IOException;

/* renamed from: atjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjv extends atki {

    /* renamed from: a */
    public static final /* synthetic */ int f90403a = 0;

    public atjv(SetActiveAccountRequest setActiveAccountRequest, String str, aswm aswm) {
        super("SetActiveAccount", setActiveAccountRequest, str, aswm);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49627e(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        int a;
        int a2;
        Intent startIntent;
        askf b = askg.m74284b(((SetActiveAccountRequest) this.f90410b).f108552a, context, this.f90413c);
        try {
            new asiv().mo49195a(b);
            if (cgwn.f187872a.mo6606a().mo84602Q()) {
                if (!alfj.m60866b(context) && (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.init.PayInitIntentOperation", "com.google.android.gms.tapandpay.ACCOUNT_SELECTED")) != null) {
                    context.startService(startIntent);
                }
            }
            this.f90414d.mo49627e(Status.f30107a);
        } catch (IOException e) {
            if (!(e.getCause() instanceof AuthFailureError)) {
                throw new RuntimeException(e);
            } else if (atey.m75754b(b)) {
                throw new aaaj(15011, "Auth error", null, e);
            } else {
                throw new aaaj(4, "Auth error", null, e);
            }
        } catch (atfh e2) {
            btnf btnf = e2.f90231a;
            btpi btpi = (btpi) atff.m75762a(btnf, btpi.f149847b, 4);
            if (btpi != null && (((a = btph.m117009a(btpi.f149849a)) != 0 && a == 3) || ((a2 = btph.m117009a(btpi.f149849a)) != 0 && a2 == 4))) {
                new adzt(Looper.getMainLooper()).post(new atju(context, btnf));
            }
            throw new RuntimeException(e2);
        }
    }
}
