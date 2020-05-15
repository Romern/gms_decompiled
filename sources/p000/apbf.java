package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: apbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbf implements apbe {

    /* renamed from: a */
    private static final aoyh f84097a = aoyh.m69805a("DeviceUsageSettings");

    /* renamed from: b */
    private final Context f84098b;

    /* renamed from: c */
    private final rjx f84099c;

    public apbf(Context context) {
        this.f84098b = context;
        this.f84099c = aeyf.m52681a(context);
    }

    /* renamed from: b */
    private final bmxv m69991b() {
        try {
            return bmxv.m108566b((rkj) aucu.m76783a(this.f84099c.mo24760n(), 500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f84097a.mo46983c("Failed to get Lockbox signed-in status");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bmxv mo47076a() {
        bmxv b = m69991b();
        if (b.mo66813a()) {
            return bmxv.m108567c(((rkj) b.mo66814b()).mo24812f());
        }
        f84097a.mo46983c("getSignedInAccountName: Falling back to default value");
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final boolean mo47077a(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            try {
                bdtq b = apbg.m69995a(this.f84098b).mo58362b(new Account(str, "com.google"));
                if (!cgjh.f187066a.mo6606a().mo83901c()) {
                    i = 5;
                } else {
                    i = 11;
                }
                return ((Boolean) b.mo58355a(i).get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                aoyp.m69851a(this.f84098b).mo47009a(e, cgjy.m145765l());
                if (cgjy.m145760g()) {
                    f84097a.mo46980a(e, "Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS");
                } else {
                    f84097a.mo46987e("Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS", e);
                }
                return false;
            }
        } else {
            f84097a.mo46983c("Empty Udc Account Name");
            return false;
        }
    }

    /* renamed from: b */
    public final Set mo47078b(String str) {
        HashSet hashSet = new HashSet();
        auzx auzx = new auzx();
        auzx.mo51098a(str);
        try {
            return new HashSet(((avdi) ((rkj) aucu.m76783a(auzz.m78131a(this.f84098b, auzx.mo51097a()).mo24672D(), 500, TimeUnit.MILLISECONDS)).f43190a).mo51104b());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            aoyp.m69851a(this.f84098b).mo47009a(e, cgjy.m145765l());
            if (cgjy.m145760g()) {
                f84097a.mo46980a(e, "An error has occurred when retrieving UDC opted in accounts.");
                return hashSet;
            }
            f84097a.mo46987e("An error has occurred when retrieving UDC opted in accounts.", e);
            return hashSet;
        }
    }
}
