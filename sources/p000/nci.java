package p000;

import android.content.Context;
import java.io.Closeable;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import javax.crypto.SecretKey;

/* renamed from: nci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nci implements Callable {

    /* renamed from: b */
    private static final lvn f35261b = new lvn("EncryptedFullBackupTask");

    /* renamed from: a */
    public final ncg f35262a;

    /* renamed from: c */
    private final nbd f35263c;

    /* renamed from: d */
    private final nbo f35264d;

    /* renamed from: e */
    private final InputStream f35265e;

    /* renamed from: f */
    private final String f35266f;

    /* renamed from: g */
    private final SecureRandom f35267g;

    /* renamed from: h */
    private final mbx f35268h;

    /* renamed from: i */
    private final bxvd f35269i;

    public nci(nbd nbd, nbo nbo, ncg ncg, InputStream inputStream, String str, bxvd bxvd, SecureRandom secureRandom, mbx mbx) {
        this.f35263c = nbd;
        this.f35264d = nbo;
        this.f35265e = inputStream;
        this.f35262a = ncg;
        this.f35266f = str;
        this.f35269i = bxvd;
        this.f35267g = secureRandom;
        bmxy.m108581a(mbx);
        this.f35268h = mbx;
    }

    /* renamed from: a */
    private final mcp m25936a(SecretKey secretKey, mde mde) {
        byte[] bArr = new byte[32];
        this.f35267g.nextBytes(bArr);
        return this.f35262a.mo20452a(this.f35269i, secretKey, mde, bArr);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mcp mcp;
        try {
            bmxv a = this.f35263c.mo20431a(this.f35266f);
            if (a.mo66813a()) {
                f35261b.mo25414c("Found previous chunk listing for %s", this.f35266f);
            }
            if (this.f35264d.mo20438c()) {
                f35261b.mo25414c("Key was rotated or newly generated for %s, so performing a full backup.", this.f35266f);
                a = bmvz.f131120a;
                this.f35263c.mo20434b(this.f35266f);
            }
            SecretKey a2 = this.f35264d.mo20436a();
            mde b = this.f35264d.mo20437b();
            lsz k = this.f35269i.mo74073k();
            bxvd bxvd = (bxvd) k.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) k);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lsz lsz = (lsz) bxvd.f164949b;
            lsz lsz2 = lsz.f32870k;
            lsz.f32881j = 1;
            lsz.f32872a |= 32;
            lsz lsz3 = (lsz) bxvd.mo74062i();
            bxvd bxvd2 = this.f35269i;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            lth lth = lth.f32914q;
            ((lth) bxvd2.f164949b).f32926k = GeneratedMessageLite.m124030de();
            bxvd2.mo74015a(lsz3);
            if (a.mo66813a()) {
                mcp mcp2 = (mcp) a.mo66814b();
                if (cclp.f179364a.mo6606a().mo76304g()) {
                    if ((mcp2.f33433a & 8) != 0) {
                        if (mcp2.f33438f.mo73744a() != 32) {
                        }
                    }
                    this.f35268h.mo19822a(29, 2);
                    mcp = m25936a(a2, b);
                }
                mcp = this.f35262a.mo20451a(this.f35269i, a2, b, mcp2);
            } else {
                mcp = m25936a(a2, b);
            }
            this.f35263c.mo20433a(this.f35266f, mcp);
            f35261b.logVerbose("Saved chunk listing for %s", this.f35266f);
            srz.m36171a((Closeable) this.f35265e);
            return null;
        } catch (mbj e) {
            f35261b.mo25418e("Permanent upload exception, wiping state", new Object[0]);
            this.f35263c.mo20434b(this.f35266f);
            throw e;
        } catch (Throwable th) {
            srz.m36171a((Closeable) this.f35265e);
            throw th;
        }
    }

    /* renamed from: a */
    public static nci m25937a(Context context, lwj lwj, SecureRandom secureRandom, lwp lwp, String str, bxvd bxvd, InputStream inputStream, mbx mbx) {
        ncg ncg = new ncg(lwj, secureRandom, new ncd(inputStream));
        return new nci(nbd.m25878a(context), new nbo(context, secureRandom, nbp.m25896a(context), lwp, str), ncg, inputStream, str, bxvd, new SecureRandom(), mbx);
    }
}
