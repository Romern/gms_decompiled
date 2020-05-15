package p000;

import android.accounts.Account;
import android.os.Looper;
import android.os.Message;

/* renamed from: glr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glr extends adzt {
    public glr(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        String string;
        int i = message.what;
        if (i == 1) {
            String string2 = message.getData().getString("mastercredential");
            Account account = (Account) message.getData().getParcelable("dataAccount");
            if (string2 != null) {
                gls.f18572c.put(account, string2);
            }
        } else if (i == 1001 && (string = message.getData().getString("errorMsg")) != null) {
            gls.f18570a.mo25418e("Error completing bootstrap: %s", string);
        }
        gls.f18571b.release();
    }
}
