package p000;

import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: xdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdx {

    /* renamed from: d */
    public static final Logger f52034d = new Logger(new String[]{"LegacyCredentialStore"}, (short[]) null);

    /* renamed from: a */
    public final xdl f52035a = ((xdl) xdl.f51999a.mo33309a());

    /* renamed from: b */
    public final sqv f52036b = srb.f45012a;

    /* renamed from: c */
    public final Map f52037c;

    /* renamed from: e */
    private final Map f52038e;

    public xdx() {
        new xde(rpr.m34216b());
        xdg xdg = new xdg(rpr.m34216b());
        this.f52037c = bnhe.m109410a(xka.ANDROID_KEYSTORE, xdg, xka.SOFTWARE_KEY, new xef(), xka.STRONGBOX_KEY, xdg);
        this.f52038e = new HashMap();
    }

    /* renamed from: a */
    public final Signature mo29670a(xjx xjx, boolean z) {
        byte[] bArr;
        if (!this.f52038e.containsKey(xjx)) {
            try {
                if (xjx.getClass() == xjz.class) {
                    bArr = this.f52035a.mo29657b(xjx);
                } else {
                    bArr = null;
                }
                Signature c = ((xdm) this.f52037c.get(xjx.mo29847a())).mo29653c(xjx, bArr);
                if (z) {
                    this.f52038e.put(xjx, c);
                }
                return c;
            } catch (xdk e) {
                throw new xma("Credential metadata does not exist", e);
            }
        } else if (!z) {
            return (Signature) this.f52038e.remove(xjx);
        } else {
            return (Signature) this.f52038e.get(xjx);
        }
    }

    /* renamed from: b */
    public final long mo29675b(String str, xkb xkb) {
        xjx xjx;
        if (xkb.mo29857c().length == 32) {
            xjx = xjy.m43070a(xkb);
        } else {
            xjx = xjz.m43074a(str, xkb);
        }
        Logger Logger = f52034d;
        String valueOf = String.valueOf(xjx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("Increment and get counter for credential ");
        sb.append(valueOf);
        Logger.mo25412b(sb.toString(), new Object[0]);
        bmxy.m108582a(xjx, "identifier cannot be null");
        try {
            if (xjx.getClass() != xjy.class) {
                if (!mo29674a(xkb, str)) {
                    return this.f52035a.mo29658c(xjx);
                }
            }
            return ((Long) adbb.m50100a(inl.m15759a(rpr.m34216b()).mo13185a(xkb.mo29855a())).get()).longValue();
        } catch (InterruptedException | ExecutionException | xdk e) {
            Logger logger2 = f52034d;
            String valueOf2 = String.valueOf(xjx);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 42);
            sb2.append("Error incrementing counter for credential ");
            sb2.append(valueOf2);
            logger2.mo25418e(sb2.toString(), new Object[0]);
            String valueOf3 = String.valueOf(xjx);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 42);
            sb3.append("Error incrementing counter for credential ");
            sb3.append(valueOf3);
            throw new xma(sb3.toString(), e);
        }
    }

    /* renamed from: a */
    public final xdw mo29671a(String str, xka xka, boolean z) {
        Logger Logger = f52034d;
        String valueOf = String.valueOf(str);
        boolean z2 = false;
        Logger.mo25412b(valueOf.length() == 0 ? new String("createCredential with appId ") : "createCredential with appId ".concat(valueOf), new Object[0]);
        bmxy.m108582a(str, "appId cannot be null");
        bmxy.m108589a(!str.trim().isEmpty(), "appId cannot be empty");
        bmxy.m108589a(this.f52037c.containsKey(xka), "Credential type is not supported");
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        xjz a = xjz.m43075a(xka, str, bArr);
        xdm xdm = (xdm) this.f52037c.get(xka);
        byte[] a2 = xdm.mo29651a(a, z);
        PublicKey b = xdm.mo29652b(a, a2);
        xlu a3 = xdm.mo29648a(a2);
        try {
            this.f52035a.mo29655a(a, new Date(System.currentTimeMillis()), a2);
            byte[] bArr2 = a.f52483b;
            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
            bmxy.m108582a(xka, "type cannot be null");
            bmxy.m108582a(str, "appId cannot be null");
            bmxy.m108582a(copyOf, "keyId cannot be null");
            int length = copyOf.length;
            if (length == 32) {
                z2 = true;
            }
            StringBuilder sb = new StringBuilder(49);
            sb.append("keyId length is not 32. Actual length:");
            sb.append(length);
            bmxy.m108589a(z2, sb.toString());
            bmxy.m108582a(b, "publicKey cannot be null");
            return new xdw(b, new xkb(xkb.m43079a(xka.f52489d, copyOf, str, b)), a, a3);
        } catch (xdk e) {
            f52034d.mo25418e("Error creating a key", new Object[0]);
            throw new xma("Error creating key", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: xdx.a(xjx, boolean):java.security.Signature
     arg types: [xjx, int]
     candidates:
      xdx.a(java.lang.String, xkb):boolean
      xdx.a(xkb, java.lang.String):boolean
      xdx.a(xjx, boolean):java.security.Signature */
    /* renamed from: b */
    public final boolean mo29676b(xjx xjx) {
        if (!this.f52037c.containsKey(xjx.mo29847a())) {
            Logger Logger = f52034d;
            byte b = xjx.mo29847a().f52489d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unsupported key type: ");
            sb.append((int) b);
            Logger.mo25418e(sb.toString(), new Object[0]);
            return false;
        }
        try {
            Signature a = mo29670a(xjx, false);
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            a.update(bArr);
            a.sign();
            return true;
        } catch (SignatureException | xma e) {
            f52034d.mo25417e("Signature error when validating credential", e, new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo29672a(xjx xjx) {
        bmxy.m108581a(xjx);
        Logger Logger = f52034d;
        String valueOf = String.valueOf(xjx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("Delete credential ");
        sb.append(valueOf);
        Logger.mo25412b(sb.toString(), new Object[0]);
        if (this.f52037c.containsKey(xjx.mo29847a())) {
            try {
                ((xdm) this.f52037c.get(xjx.mo29847a())).mo29649a(xjx);
                this.f52035a.mo29659d(xjx);
            } catch (xdk e) {
                Logger logger2 = f52034d;
                String valueOf2 = String.valueOf(xjx);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("Error deleting credential ");
                sb2.append(valueOf2);
                logger2.mo25418e(sb2.toString(), new Object[0]);
                String valueOf3 = String.valueOf(xjx);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 42);
                sb3.append("Error deleting credential with identifier ");
                sb3.append(valueOf3);
                throw new xma(sb3.toString(), e);
            }
        } else {
            byte b = xjx.mo29847a().f52489d;
            StringBuilder sb4 = new StringBuilder(26);
            sb4.append("Unsupported key type: ");
            sb4.append((int) b);
            throw new xma(sb4.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo29673a(String str, xkb xkb) {
        bmxy.m108581a(str);
        bmxy.m108581a(xkb);
        try {
            xjz a = xjz.m43074a(str, xkb);
            try {
                if (this.f52035a.mo29656a(a)) {
                    byte[] b = this.f52035a.mo29657b(a);
                    if (this.f52037c.containsKey(a.f52482a)) {
                        return ((xdm) this.f52037c.get(a.f52482a)).mo29650a(a, b);
                    }
                }
                return false;
            } catch (xdk e) {
                return false;
            }
        } catch (xma e2) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo29674a(xkb xkb, String str) {
        return xkb.mo29856b().equals(xka.SOFTWARE_KEY) && str.equals("google.com") && !this.f52035a.mo29656a(xjz.m43074a(str, xkb));
    }
}
