package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: xct */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xct extends aaab {

    /* renamed from: d */
    public static final Logger f51961d = new Logger(new String[]{"GetKeyOperation"}, (short[]) null);

    /* renamed from: a */
    public final xde f51962a = new xde(rpr.m34216b());

    /* renamed from: b */
    public final xmy f51963b;

    /* renamed from: c */
    public final byte[] f51964c;

    /* renamed from: e */
    private final xcm f51965e = ((xcm) xcm.f51937d.mo33309a());

    /* renamed from: f */
    private final ios f51966f = inl.m15759a(rpr.m34216b());

    /* renamed from: g */
    private final String f51967g;

    public xct(xmy xmy, String str, byte[] bArr) {
        super(BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, "GetKey");
        bmxy.m108582a(str, "rpId cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "rpId cannot be empty");
        bmxy.m108582a(bArr, "keyHandle cannot be null");
        this.f51963b = xmy;
        this.f51967g = str;
        this.f51964c = bArr;
    }

    /* renamed from: a */
    public final bmxv mo29644a(String str, byte[] bArr) {
        KeyPair keyPair;
        try {
            xcv xcv = new xcv(str, bArr);
            xmq xmq = xcv.f51972a;
            String a = xcv.mo29645a();
            xcm xcm = this.f51965e;
            bmxy.m108582a(a, "identifier cannot be null");
            xcm.f51938e.mo25412b("Retrieves the SQLiteKeyData of a registered key from SQLite database", new Object[0]);
            xcl xcl = (xcl) bmxv.m108567c(xcm.mo29637c(a)).mo66815c();
            xmq xmq2 = xmq.KEYSTORE;
            int ordinal = xmq.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new IllegalStateException("Not supported key storage type");
                    }
                } else if (xcl == null || (keyPair = xcl.f51931c) == null) {
                    return bmvz.f131120a;
                } else {
                    return bmxv.m108566b(KeyData.m23438a(bArr, keyPair, a, xcl.f51932d, xcl.f51933e));
                }
            }
            if (xcl != null) {
                if (xde.m42698d(a)) {
                    return bmxv.m108566b(KeyData.m23437a(xmq.f52779d, bArr, a, xcl.f51932d, xcl.f51933e));
                }
                this.f51965e.mo29633a(a);
            }
            return bmvz.f131120a;
        } catch (adbe e) {
            Logger Logger = f51961d;
            String valueOf = String.valueOf(e.getMessage());
            Logger.mo25414c(valueOf.length() == 0 ? new String("Failed to get key from CredentialStore: ") : "Failed to get key from CredentialStore: ".concat(valueOf), new Object[0]);
            return bmvz.f131120a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        bqgg bqgg;
        String str = this.f51967g;
        byte[] bArr = this.f51964c;
        Logger Logger = f51961d;
        String arrays = Arrays.toString(bArr);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(arrays).length());
        sb.append("getKey with rpId ");
        sb.append(str);
        sb.append(" with keyHandle ");
        sb.append(arrays);
        Logger.mo25412b(sb.toString(), new Object[0]);
        if (!str.equals("google.com")) {
            try {
                bqgg = bqga.m112775a(mo29644a(str, bArr));
            } catch (adbe e) {
                bqgg = bqga.m112777a((Throwable) e);
            }
        } else {
            bqgg = bqdx.m112673a(adbb.m50100a(this.f51966f.mo24701a((rpa) new inv(this.f51964c))), new xcr(this, str, bArr), bqfb.INSTANCE);
        }
        bqga.m112781a(bqgg, new xcs(this), bqfb.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f51963b.mo29955a(status, null);
    }
}
