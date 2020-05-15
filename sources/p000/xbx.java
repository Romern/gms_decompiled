package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.fido.authenticator.autoenroll.FidoEnrollmentIntentOperation;
import com.google.android.gms.fido.authenticator.autoenroll.FidoKeyValidityCheckIntentOperation;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;

/* renamed from: xbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbx {

    /* renamed from: c */
    public static final Logger f51896c = new Logger(new String[]{"FidoEnrollmentUtils"}, (short[]) null);

    /* renamed from: a */
    public final Context f51897a;

    /* renamed from: b */
    public final xbo f51898b;

    /* renamed from: d */
    private final xdx f51899d;

    /* renamed from: e */
    private final xbi f51900e;

    /* renamed from: f */
    private final MessageDigest f51901f;

    public xbx(Context context) {
        xdx xdx = new xdx();
        xbo xbo = (xbo) xbo.f51879a.mo33309a();
        xbi xbi = new xbi();
        MessageDigest a = xid.m42997a();
        srb srb = srb.f45012a;
        bmxy.m108581a(context);
        this.f51897a = context;
        bmxy.m108581a(xdx);
        this.f51899d = xdx;
        bmxy.m108581a(xbo);
        this.f51898b = xbo;
        bmxy.m108581a(xbi);
        this.f51900e = xbi;
        bmxy.m108581a(a);
        this.f51901f = a;
        bmxy.m108581a(srb);
    }

    /* renamed from: a */
    public static void m42627a(Context context, String str) {
        if (((Boolean) xmn.f52757g.mo58455c()).booleanValue()) {
            f51896c.mo25412b("Set up the alarm manager for FIDO enrollment", new Object[0]);
            FidoEnrollmentIntentOperation.m23414a(context, str);
        }
        if (((Boolean) xmn.f52762l.mo58455c()).booleanValue()) {
            f51896c.mo25412b("Set up the alarm manager for FIDO key validity check", new Object[0]);
            FidoKeyValidityCheckIntentOperation.m23419a(context, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo29621a() {
        HashSet a = bnpf.m110047a();
        try {
            Account[] d = gie.m13199d(this.f51897a, "com.google");
            if (d != null) {
                int length = d.length;
                if (length != 0) {
                    for (Account account : d) {
                        a.add(account.name);
                    }
                    return a;
                }
            }
            f51896c.mo25412b("No account is signed in", new Object[0]);
            return bnpf.m110047a();
        } catch (RemoteException | rfv | rfw e) {
            f51896c.mo25417e("Error while fetching Google accounts", e, new Object[0]);
            return bnpf.m110047a();
        }
    }

    /* renamed from: a */
    public final void mo29622a(String str, xka xka, xbw xbw) {
        String str2;
        String str3;
        xbw xbw2 = xbw;
        f51896c.mo25412b("Execute registerForCustomKey API", new Object[0]);
        try {
            xdw a = this.f51899d.mo29671a("google.com", xka, true);
            byte[] c = a.f52030a.mo29857c();
            try {
                byte[] b = a.mo29669a().mo29931b();
                xlu xlu = a.f52032c;
                xka xka2 = xka.ANDROID_KEYSTORE;
                int ordinal = xka.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        str3 = "fido:software_optional_uv";
                    } else if (ordinal != 2) {
                        Logger Logger = f51896c;
                        String valueOf = String.valueOf(xka);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                        sb.append("Don't know how to auto-enroll key type: ");
                        sb.append(valueOf);
                        Logger.mo25418e(sb.toString(), new Object[0]);
                        xjz xjz = a.f52031b;
                        String valueOf2 = String.valueOf(xka);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                        sb2.append("Unknown key type: ");
                        sb2.append(valueOf2);
                        mo29623a(xbw2, xjz, new xma(sb2.toString()));
                        return;
                    } else {
                        str3 = "fido:strongbox_protected_up";
                    }
                    str2 = str3;
                } else {
                    str2 = "fido:hardware_protected_uv";
                }
                ios a2 = inl.m15759a(this.f51897a);
                Account account = new Account(str, "com.google");
                String a3 = this.f51900e.mo29608a(this.f51897a.getPackageName());
                this.f51901f.update("google.com".getBytes(StandardCharsets.UTF_8));
                byte[] digest = this.f51901f.digest();
                bxvd da = xwu.f53308e.mo74144da();
                ByteString a4 = ByteString.m123261a(digest);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                xwu xwu = (xwu) da.f164949b;
                a4.getClass();
                xwu.f53310a = a4;
                ios ios = a2;
                xwu.f53311b = 1;
                a3.getClass();
                xwu.f53312c = a3;
                try {
                    ByteString a5 = ByteString.m123261a(xlu.mo29922a().mo74444c());
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    a5.getClass();
                    ((xwu) da.f164949b).f53313d = a5;
                } catch (bypr e) {
                    f51896c.mo25417e("Unable to encode CableCredentialData to CBOR bytestring", e, new Object[0]);
                }
                aucb b2 = ios.mo24732b(new ins(str2, account, ((xwu) da.mo74062i()).serializeToBytes(), c, b));
                b2.mo50373a(new xbs(this, b2, str, a, xbw));
                b2.mo50372a(new xbt(this, xbw2, a));
            } catch (IOException e2) {
                f51896c.mo25417e("Error converting credential public key into COSE bytes", e2, new Object[0]);
                mo29623a(xbw2, a.f52031b, e2);
            }
        } catch (Exception e3) {
            f51896c.mo25417e("Error creating a new FIDO credential", e3, new Object[0]);
            xbw2.mo29620a(e3);
        }
    }

    /* renamed from: a */
    public final void mo29623a(xbw xbw, xjx xjx, Exception exc) {
        try {
            this.f51899d.mo29672a(xjx);
        } catch (xma e) {
            f51896c.mo25418e("Error deleting KeyStore credential", new Object[0]);
        }
        xbw.mo29620a(exc);
    }
}
