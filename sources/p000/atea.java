package p000;

import android.content.Context;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: atea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atea {
    /* renamed from: a */
    public static final byte[] m75731a(askf askf) {
        Context context = askf.f89126d;
        awbt awbt = new awbt();
        awbt.mo51835a(1);
        try {
            return (byte[]) aucu.m76783a(awbv.m79579a(context, awbt.mo51834a()).mo52198a(new GetClientTokenRequest(atvh.m76455a(askf.f89126d))), 2, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException("Unable to retrieve clientToken within timeout.", e);
        }
    }
}
