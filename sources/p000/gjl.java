package p000;

import com.google.android.gms.auth.account.accounttransfer.AccountBootstrapPayload;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.internal.DeviceMetaDataRequest;
import com.google.android.gms.auth.api.accounttransfer.internal.RetrieveDataRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: gjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gjl {

    /* renamed from: a */
    protected final gto f18352a;

    public gjl(gto gto) {
        this.f18352a = gto;
    }

    /* renamed from: a */
    private static Object m13276a(aucb aucb) {
        return aucu.m76783a(aucb, gnv.m13533af(), TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public final AccountBootstrapPayload mo11941b() {
        gto gto = this.f18352a;
        sdo.m34959a((Object) "com.google");
        byte[] bArr = (byte[]) m13276a(gto.mo24701a((rpa) new gtb(new RetrieveDataRequest("com.google"))));
        if (bArr == null || bArr.length == 0) {
            throw new gji("TransferBytes is null or empty");
        }
        AccountBootstrapPayload accountBootstrapPayload = new AccountBootstrapPayload();
        try {
            accountBootstrapPayload.mo59187e(bArr);
            return accountBootstrapPayload;
        } catch (asbx e) {
            throw new gji("TransferBytes could not be serialized to AccountBootstrapPayload");
        }
    }

    /* renamed from: a */
    public final DeviceMetaData mo11940a() {
        gto gto = this.f18352a;
        sdo.m34959a((Object) "com.google");
        return (DeviceMetaData) m13276a(gto.mo24701a((rpa) new gtd(new DeviceMetaDataRequest("com.google"))));
    }
}
