package p000;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: aslk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aslk {

    /* renamed from: a */
    public final long f89170a = System.currentTimeMillis();

    /* renamed from: b */
    public AccountInfo f89171b;

    /* renamed from: c */
    public Boolean f89172c;

    /* renamed from: d */
    public Long f89173d;

    /* renamed from: e */
    public Map f89174e;

    /* renamed from: f */
    public Map f89175f;

    /* renamed from: g */
    public final List f89176g = new ArrayList();

    public aslk(Context context, C0008af afVar) {
        afVar.mo557a(new aslj(this, context));
    }

    /* renamed from: a */
    public static bngx m74326a(Map map, aslx aslx) {
        bngs j = bngx.m109377j();
        for (Map.Entry entry : map.entrySet()) {
            if (((aslx) entry.getValue()).equals(aslx)) {
                j.mo67668c(m74327a((asly) entry.getKey()));
            }
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public static bpax m74327a(asly asly) {
        asly asly2 = asly.UNKNOWN;
        int ordinal = asly.ordinal();
        if (ordinal == 0) {
            return bpax.UNKNOWN;
        }
        if (ordinal == 1) {
            return bpax.NFC_ENABLED;
        }
        if (ordinal == 2) {
            return bpax.DEFAULT_PAYMENT_SERVICE;
        }
        if (ordinal == 3) {
            return bpax.DEVICE_LOCK;
        }
        if (ordinal == 4) {
            return bpax.TOKENIZED_FOP;
        }
        if (ordinal != 5) {
            return bpax.UNKNOWN;
        }
        return bpax.ATTESTATION_PASS;
    }
}
