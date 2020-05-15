package p000;

import android.content.Context;
import android.util.Pair;
import com.google.android.gms.fido.credentialstore.KeyData;
import java.security.KeyPair;
import java.util.Arrays;

/* renamed from: xce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xce {

    /* renamed from: a */
    public static final adcb f51913a = adca.m50151b(xcd.f51912a);

    /* renamed from: b */
    private static final Logger f51914b = new Logger("CredentialStore", new String[0]);

    /* renamed from: c */
    private final Context f51915c;

    /* renamed from: d */
    private final xmo f51916d;

    public xce(Context context) {
        this.f51916d = wzk.m42530d(context);
        this.f51915c = context;
    }

    /* renamed from: a */
    public final bmxv mo29627a(KeyData keyData) {
        Object obj;
        Object obj2;
        byte[] bArr;
        if (keyData == null) {
            return bmvz.f131120a;
        }
        byte[] bArr2 = keyData.f31688g;
        if (!(bArr2 == null || (bArr = keyData.f31689h) == null)) {
            new Pair(bArr2, bArr);
        }
        xmq xmq = xmq.KEYSTORE;
        int ordinal = keyData.f31682a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (!keyData.f31683b) {
                    obj2 = new xcj(this.f51916d, keyData.f31684c, new KeyPair(keyData.f31685d, keyData.f31686e), keyData.f31687f);
                } else {
                    obj2 = new xcg(this.f51915c, keyData.f31684c);
                }
                return bmxv.m108566b(obj2);
            } else if (ordinal != 2) {
                String valueOf = String.valueOf(keyData.f31682a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Unsupported key storage type: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        try {
            if (!keyData.f31683b) {
                obj = new xci(this.f51915c, keyData.f31684c, keyData.f31687f);
            } else {
                obj = new xcf(this.f51915c, keyData.f31684c);
            }
            return bmxv.m108566b(obj);
        } catch (adbe e) {
            throw e.mo33303c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final bqgg mo29628a(String str, xmq xmq) {
        sdo.m34969a(str, (Object) "rpId cannot be empty");
        Logger Logger = f51914b;
        int i = xmq.f52779d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
        sb.append("generateKey with rpId ");
        sb.append(str);
        sb.append(" with keyType ");
        sb.append(i);
        Logger.mo25412b(sb.toString(), new Object[0]);
        xmo xmo = this.f51916d;
        int i2 = xmq.f52779d;
        roz b = rpa.m34196b();
        b.f43472a = new xnd(str, i2);
        return bqdx.m112673a(adbb.m50100a(((rjx) xmo).mo24701a(b.mo24977a())), new xcb(this), bqfb.INSTANCE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final bqgg mo29629a(String str, byte[] bArr) {
        boolean z;
        sdo.m34969a(str, (Object) "rpId cannot be empty");
        sdo.checkIfNull(bArr, "keyHandle cannot be null");
        if (bArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "keyHandle cannot be empty");
        Logger Logger = f51914b;
        String arrays = Arrays.toString(bArr);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(arrays).length());
        sb.append("getKey with rpId ");
        sb.append(str);
        sb.append(" with keyHandle ");
        sb.append(arrays);
        Logger.mo25412b(sb.toString(), new Object[0]);
        xmo xmo = this.f51916d;
        roz b = rpa.m34196b();
        b.f43472a = new xne(str, bArr);
        return bqdx.m112673a(adbb.m50100a(((rjx) xmo).mo24701a(b.mo24977a())), new xcc(this), bqfb.INSTANCE);
    }
}
