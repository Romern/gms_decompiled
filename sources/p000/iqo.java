package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

/* renamed from: iqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqo {

    /* renamed from: a */
    private static final sek f21574a = new sek(new String[]{"ShareGroupPrivateKeyController"}, (byte[]) null);

    /* renamed from: b */
    private final isq f21575b;

    /* renamed from: c */
    private final iqb f21576c;

    /* renamed from: d */
    private final ehw f21577d;

    /* renamed from: e */
    private final iql f21578e;

    /* renamed from: f */
    private final iqc f21579f;

    /* renamed from: g */
    private final isx f21580g;

    public iqo(isq isq, iqb iqb, ehw ehw, iql iql, iqc iqc, isx isx) {
        this.f21575b = isq;
        this.f21576c = iqb;
        this.f21577d = ehw;
        this.f21578e = iql;
        this.f21579f = iqc;
        this.f21580g = isx;
    }

    /* renamed from: a */
    private final void m15903a(int i, int i2) {
        isq isq = this.f21575b;
        iso iso = new iso(4, i);
        iso.f21616b = i2;
        isq.mo13320a(iso.mo13318a());
    }

    /* renamed from: a */
    public final void mo13263a(Account account, String str, List list, int i) {
        chtv chtv;
        bmxy.m108600b(!this.f21576c.mo13255b());
        if (!list.isEmpty()) {
            try {
                bxvd da = bqlr.f141155c.mo74144da();
                bqlq bqlq = bqlq.SERVER_INITIATED;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqlr) da.f164949b).f141157a = bqlq.mo3214a();
                bqli a = this.f21578e.mo13262a(str, (bqlr) da.mo74062i());
                ehx a2 = this.f21577d.mo10153a(str, account.name);
                if (a2 == null || a2.f15027d == null) {
                    m15903a(7, i);
                    String valueOf = String.valueOf(str);
                    throw new iqp(valueOf.length() == 0 ? new String("Missing group key for ") : "Missing group key for ".concat(valueOf));
                }
                long d = bnzi.m110902d().mo68722a(ehv.m10472b(a2.f15026c)).mo68742d();
                String a3 = this.f21579f.mo13256a();
                bxvd da2 = bqlj.f141104c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a.getClass();
                ((bqlj) da2.f164949b).f141106a = a;
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    bqld bqld = (bqld) list.get(i2);
                    try {
                        SignCryptedBlob a4 = this.f21580g.mo13326a(ehv.m10473c(bqld.f141086d.mo73780k()), ehv.m10464a(a2.f15027d));
                        bxvd da3 = bqlh.f141092e.mo74144da();
                        bxtx a5 = bxtx.m123261a(a4.f10555c);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bqlh bqlh = (bqlh) da3.f164949b;
                        a5.getClass();
                        bqlh.f141096c = a5;
                        bqlh.f141097d = d;
                        a3.getClass();
                        bqlh.f141095b = a3;
                        String str2 = bqld.f141083a;
                        str2.getClass();
                        bqlh.f141094a = str2;
                        bqlh bqlh2 = (bqlh) da3.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bqlj bqlj = (bqlj) da2.f164949b;
                        bqlh2.getClass();
                        if (!bqlj.f141107b.mo73666a()) {
                            bqlj.f141107b = bxvk.m124021a(bqlj.f141107b);
                        }
                        bqlj.f141107b.add(bqlh2);
                        i2++;
                    } catch (iqs | InvalidKeySpecException e) {
                        m15903a(15, i);
                        throw new iqp("Couldn't encrypt group key", e);
                    }
                }
                try {
                    iqb iqb = this.f21576c;
                    bqlj bqlj2 = (bqlj) da2.mo74062i();
                    try {
                        bqlf c = iqb.f21543a.mo13266c();
                        try {
                            chqp chqp = c.f190402a;
                            chtv chtv2 = bqlg.f141089b;
                            if (chtv2 == null) {
                                synchronized (bqlg.class) {
                                    chtv = bqlg.f141089b;
                                    if (chtv == null) {
                                        chts a6 = chtv.m149565a();
                                        a6.f189140c = chtu.UNARY;
                                        a6.f189141d = chtv.m149567a("google.cryptauth.devicesync.v1.DeviceSync", "ShareGroupPrivateKey");
                                        a6.mo85659b();
                                        a6.f189138a = ciie.m150370a(bqlj.f141104c);
                                        a6.f189139b = ciie.m150370a(bqlk.f141108a);
                                        chtv = a6.mo85658a();
                                        bqlg.f141089b = chtv;
                                    }
                                }
                                chtv2 = chtv;
                            }
                            bqlk bqlk = (bqlk) ciiq.m150394a(chqp, chtv2, c.f190403b, bqlj2);
                            m15903a(2, i);
                        } catch (chux e2) {
                            throw new egw("Failed to make ShareGroupPrivateKeyRequest", e2, iqb.m15887a(e2.f189238a.f189233s));
                        }
                    } catch (gid e3) {
                        e = e3;
                        throw new egw("failed to create stub", e, 5);
                    } catch (IOException e4) {
                        e = e4;
                        throw new egw("failed to create stub", e, 5);
                    }
                } catch (egw e5) {
                    m15903a(e5.f14892a, i);
                    throw new iqp("Failed to share group key", e5);
                }
            } catch (iqr e6) {
                m15903a(11, i);
                throw new iqp("Failed to create request context", e6);
            }
        } else {
            f21574a.mo25416d("Sharing group private key with empty recipient list!", new Object[0]);
        }
    }
}
