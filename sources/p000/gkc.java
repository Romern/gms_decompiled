package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;

/* renamed from: gkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gkc extends adzt {

    /* renamed from: a */
    final /* synthetic */ gkd f18372a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gkc(gkd gkd, Looper looper) {
        super(looper);
        this.f18372a = gkd;
    }

    public final void handleMessage(Message message) {
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest;
        String string;
        int i = message.what;
        if (i == 1) {
            byte[] byteArray = message.getData().getByteArray("bootstrapAssertion");
            gkd gkd = this.f18372a;
            if (byteArray != null) {
                exchangeAssertionsForUserCredentialsRequest = (ExchangeAssertionsForUserCredentialsRequest) sef.m35069a(byteArray, ExchangeAssertionsForUserCredentialsRequest.CREATOR);
            } else {
                exchangeAssertionsForUserCredentialsRequest = null;
            }
            sek sek = gkd.f18373a;
            gkd.f18375b = exchangeAssertionsForUserCredentialsRequest;
        } else if (i == 1001 && (string = message.getData().getString("errorMsg")) != null) {
            gkd.f18373a.mo25418e("Error fetching assertion: %s", string);
        }
        gkd.f18374c.release();
    }
}
