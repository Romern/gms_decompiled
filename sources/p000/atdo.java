package p000;

import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: atdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atdo implements atcv {

    /* renamed from: b */
    private static final srn f90133b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    private static final long f90134c = TimeUnit.HOURS.toMillis(6);

    /* renamed from: a */
    final bydd f90135a;

    /* renamed from: d */
    private final atcl f90136d;

    public atdo(bydf bydf, atcl atcl) {
        bxvd bxvd = (bxvd) bydf.mo74142c(5);
        bxvd.mo73625a((bxvk) bydf);
        this.f90135a = (bydd) bxvd;
        this.f90136d = atcl;
    }

    /* renamed from: a */
    private static final long m75644a(bmth bmth) {
        Calendar instance = Calendar.getInstance();
        instance.set(bmth.f130843b, bmth.f130842a - 1, 1);
        instance.set(5, instance.getActualMaximum(5));
        instance.set(11, instance.getActualMaximum(11));
        instance.set(12, instance.getActualMaximum(12));
        instance.set(13, instance.getActualMaximum(13));
        instance.set(14, instance.getActualMaximum(14));
        return instance.getTimeInMillis();
    }

    /* renamed from: b */
    public final btjw mo49800b() {
        bxvd da = btjw.f149188c.mo74144da();
        bxvd da2 = btjv.f149184c.mo74144da();
        String c = mo49836c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        c.getClass();
        ((btjv) da2.f164949b).f149186a = c;
        int i = mo49839i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((btjv) da2.f164949b).f149187b = i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btjw btjw = (btjw) da.f164949b;
        btjv btjv = (btjv) da2.mo74062i();
        btjv.getClass();
        btjw.f149191b = btjv;
        btjw.f149190a = 1;
        return (btjw) da.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo49836c() {
        bmts bmts = ((bydf) this.f90135a.f164949b).f165772b;
        if (bmts == null) {
            bmts = bmts.f130908c;
        }
        bmtp bmtp = bmts.f130910a;
        if (bmtp == null) {
            bmtp = bmtp.f130893f;
        }
        bmti bmti = bmtp.f130898d;
        if (bmti == null) {
            bmti = bmti.f130844c;
        }
        bmtg bmtg = bmti.f130846a;
        if (bmtg == null) {
            bmtg = bmtg.f130832g;
        }
        return bmtg.f130834a;
    }

    /* renamed from: d */
    public final atcs mo49802d() {
        long j = ((bydf) this.f90135a.f164949b).f165778h;
        if (j == 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            bmts bmts = ((bydf) this.f90135a.f164949b).f165772b;
            if (bmts == null) {
                bmts = bmts.f130908c;
            }
            bmtp bmtp = bmts.f130910a;
            if (bmtp == null) {
                bmtp = bmtp.f130893f;
            }
            bmti bmti = bmtp.f130898d;
            if (bmti == null) {
                bmti = bmti.f130844c;
            }
            bmtg bmtg = bmti.f130846a;
            if (bmtg == null) {
                bmtg = bmtg.f130832g;
            }
            j = timeUnit.toMillis(bmtg.f130838e);
        }
        return new atcs(j, f90134c + j);
    }

    /* renamed from: e */
    public final boolean mo49803e() {
        bydf bydf = (bydf) this.f90135a.f164949b;
        if (bydf.f165773c >= 65535) {
            return true;
        }
        int i = bydf.f165775e;
        bmts bmts = bydf.f165772b;
        if (bmts == null) {
            bmts = bmts.f130908c;
        }
        bmtp bmtp = bmts.f130910a;
        if (bmtp == null) {
            bmtp = bmtp.f130893f;
        }
        bmti bmti = bmtp.f130898d;
        if (bmti == null) {
            bmti = bmti.f130844c;
        }
        bmtg bmtg = bmti.f130846a;
        if (bmtg == null) {
            bmtg = bmtg.f130832g;
        }
        if (i < bmtg.f130837d) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atdo) {
            return ((bydf) this.f90135a.mo74062i()).equals(((atdo) obj).f90135a.mo74062i());
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo49804f() {
        return false;
    }

    /* renamed from: g */
    public final int mo49805g() {
        bmts bmts = ((bydf) this.f90135a.f164949b).f165772b;
        if (bmts == null) {
            bmts = bmts.f130908c;
        }
        bmtp bmtp = bmts.f130910a;
        if (bmtp == null) {
            bmtp = bmtp.f130893f;
        }
        bmti bmti = bmtp.f130898d;
        if (bmti == null) {
            bmti = bmti.f130844c;
        }
        bmto bmto = bmti.f130847b;
        if (bmto == null) {
            bmto = bmto.f130881k;
        }
        bmtm bmtm = bmto.f130891i;
        if (bmtm == null) {
            bmtm = bmtm.f130866j;
        }
        return (int) asuv.m74875a(asti.m74762a(bmtm.f130874g));
    }

    /* renamed from: h */
    public final byte[] mo49806h() {
        return ((bydf) this.f90135a.mo74062i()).mo73642k();
    }

    public final int hashCode() {
        return Arrays.hashCode(((bydf) this.f90135a.mo74062i()).mo73642k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo49839i() {
        bmts bmts = ((bydf) this.f90135a.f164949b).f165772b;
        if (bmts == null) {
            bmts = bmts.f130908c;
        }
        bmtp bmtp = bmts.f130910a;
        if (bmtp == null) {
            bmtp = bmtp.f130893f;
        }
        bmti bmti = bmtp.f130898d;
        if (bmti == null) {
            bmti = bmti.f130844c;
        }
        bmtg bmtg = bmti.f130846a;
        if (bmtg == null) {
            bmtg = bmtg.f130832g;
        }
        return bmtg.f130835b;
    }

    /* renamed from: a */
    private final void m75645a(asqs asqs, boolean z) {
        String str;
        if (!(asqs instanceof assl)) {
            bnsl bnsl = (bnsl) f90133b.mo68388c();
            bnsl.mo68432a("atdo", "a", 245, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected applet type: %s. Doing nothing.", asqs.getClass());
            return;
        }
        assl assl = (assl) asqs;
        if (assl.f89590g || z) {
            bydf bydf = assl.f89587d;
            if (bydf.f165773c != ((bydf) this.f90135a.f164949b).f165773c || !Arrays.equals(bydf.f165776f.mo73780k(), ((bydf) this.f90135a.f164949b).f165776f.mo73780k())) {
                bnsl bnsl2 = (bnsl) f90133b.mo68388c();
                bnsl2.mo68432a("atdo", "a", 253, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("updateAfterTap atc or luk mismatch!");
                return;
            }
            bydd bydd = this.f90135a;
            int i = ((bydf) bydd.f164949b).f165773c + 1;
            if (bydd.f164950c) {
                bydd.mo74035c();
                bydd.f164950c = false;
            }
            bydf bydf2 = (bydf) bydd.f164949b;
            bydf bydf3 = bydf.f165769j;
            bydf2.f165771a |= 2;
            bydf2.f165773c = i;
            bydd bydd2 = this.f90135a;
            int i2 = ((bydf) bydd2.f164949b).f165775e + 1;
            if (bydd2.f164950c) {
                bydd2.mo74035c();
                bydd2.f164950c = false;
            }
            bydf bydf4 = (bydf) bydd2.f164949b;
            bydf4.f165771a |= 4;
            bydf4.f165775e = i2;
            bydd bydd3 = this.f90135a;
            byte[] bArr = assl.f89589f;
            if (bArr != null) {
                str = asti.m74763b(bArr);
            } else {
                str = "";
            }
            String str2 = assl.f89588e;
            if (str2 == null) {
                ((bnsl) assl.f89577a.mo68388c()).mo68405a("Missing transaction type");
                str2 = "M";
            }
            m75646a(bydd3, str, str2, assl.f89587d.f165773c);
        }
    }

    /* renamed from: a */
    private static final void m75646a(bydd bydd, String str, String str2, int i) {
        String format = String.format(null, "%d|%s|%d|%s", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())), str, Integer.valueOf(i), str2);
        int min = Math.min(((bydf) bydd.f164949b).f165774d.size(), 99);
        String[] strArr = new String[(min + 1)];
        System.arraycopy(Collections.unmodifiableList(((bydf) bydd.f164949b).f165774d).toArray(new String[0]), ((bydf) bydd.f164949b).f165774d.size() - min, strArr, 0, min);
        strArr[min] = format;
        if (bydd.f164950c) {
            bydd.mo74035c();
            bydd.f164950c = false;
        }
        bydf bydf = bydf.f165769j;
        ((bydf) bydd.f164949b).f165774d = bxvk.m124030de();
        bydd.mo74347a(Arrays.asList(strArr));
    }

    /* renamed from: a */
    public final asqs mo49793a(askf askf, asqq asqq, String str) {
        assl assl = new assl(askf.f89126d, (bydf) this.f90135a.mo74062i(), asqq, str);
        bydd bydd = this.f90135a;
        int i = ((bydf) bydd.f164949b).f165775e + 1;
        if (bydd.f164950c) {
            bydd.mo74035c();
            bydd.f164950c = false;
        }
        bydf bydf = (bydf) bydd.f164949b;
        bydf bydf2 = bydf.f165769j;
        bydf.f165771a |= 4;
        bydf.f165775e = i;
        bydd bydd2 = this.f90135a;
        int i2 = ((bydf) bydd2.f164949b).f165773c + 1;
        if (bydd2.f164950c) {
            bydd2.mo74035c();
            bydd2.f164950c = false;
        }
        bydf bydf3 = (bydf) bydd2.f164949b;
        bydf3.f165771a |= 2;
        bydf3.f165773c = i2;
        return assl;
    }

    /* renamed from: a */
    public final atcq mo49795a(atcp atcp, askf askf, btiy btiy) {
        CryptoParameters b = atdq.m75661b();
        bmts bmts = ((bydf) this.f90135a.f164949b).f165772b;
        if (bmts == null) {
            bmts = bmts.f130908c;
        }
        bmtp bmtp = bmts.f130910a;
        if (bmtp == null) {
            bmtp = bmtp.f130893f;
        }
        atcl atcl = this.f90136d;
        String str = ((bydf) this.f90135a.f164949b).f165777g;
        bmth bmth = bmtp.f130896b;
        if (bmth == null) {
            bmth = bmth.f130840c;
        }
        int i = bmth.f130842a;
        bmth bmth2 = bmtp.f130896b;
        if (bmth2 == null) {
            bmth2 = bmth.f130840c;
        }
        atdn atdn = new atdn(askf, atcl, b, btiy, str, i, bmth2.f130843b, ((bydf) this.f90135a.f164949b).f165773c, atcp);
        bydd bydd = this.f90135a;
        m75646a(bydd, "", "I", ((bydf) bydd.f164949b).f165773c);
        bydd bydd2 = this.f90135a;
        int i2 = ((bydf) bydd2.f164949b).f165775e + 1;
        if (bydd2.f164950c) {
            bydd2.mo74035c();
            bydd2.f164950c = false;
        }
        bydf bydf = (bydf) bydd2.f164949b;
        bydf bydf2 = bydf.f165769j;
        bydf.f165771a |= 4;
        bydf.f165775e = i2;
        bydd bydd3 = this.f90135a;
        int i3 = ((bydf) bydd3.f164949b).f165773c + 1;
        if (bydd3.f164950c) {
            bydd3.mo74035c();
            bydd3.f164950c = false;
        }
        bydf bydf3 = (bydf) bydd3.f164949b;
        bydf3.f165771a |= 2;
        bydf3.f165773c = i3;
        return atdn;
    }

    /* renamed from: a */
    public final btmd mo49796a() {
        String str;
        bxvd da = btmc.f149465g.mo74144da();
        try {
            if (((bydf) this.f90135a.f164949b).f165774d.size() > 0) {
                bydd bydd = this.f90135a;
                str = (String) ((bydf) bydd.f164949b).f165774d.get(((bydf) bydd.f164949b).f165774d.size() - 1);
            } else {
                str = "";
            }
            String c = mo49836c();
            int i = mo49839i();
            byte[] k = ((bydf) this.f90135a.f164949b).f165776f.mo73780k();
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 11 + String.valueOf(str).length());
            sb.append(c);
            sb.append(i);
            sb.append(str);
            String a = asti.m74760a(assm.m74694a(sb.toString().getBytes(StandardCharsets.UTF_8), k));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((btmc) da.f164949b).f149467a = a;
            String c2 = mo49836c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            c2.getClass();
            ((btmc) da.f164949b).f149468b = c2;
            int i2 = mo49839i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btmc) da.f164949b).f149469c = i2;
            List unmodifiableList = Collections.unmodifiableList(((bydf) this.f90135a.f164949b).f165774d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btmc btmc = (btmc) da.f164949b;
            if (!btmc.f149470d.mo73666a()) {
                btmc.f149470d = bxvk.m124021a(btmc.f149470d);
            }
            bxsy.m123078a(unmodifiableList, btmc.f149470d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btmc) da.f164949b).f149472f = true;
            bmts bmts = ((bydf) this.f90135a.f164949b).f165772b;
            if (bmts == null) {
                bmts = bmts.f130908c;
            }
            if (bmts.f130911b != null) {
                bmts bmts2 = ((bydf) this.f90135a.f164949b).f165772b;
                if (bmts2 == null) {
                    bmts2 = bmts.f130908c;
                }
                bmtk bmtk = bmts2.f130911b;
                if (bmtk == null) {
                    bmtk = bmtk.f130852g;
                }
                bmtl bmtl = bmtk.f130858e;
                if (bmtl == null) {
                    bmtl = bmtl.f130860e;
                }
                bmth bmth = bmtl.f130865d;
                if (bmth == null) {
                    bmth = bmth.f130840c;
                }
                long a2 = m75644a(bmth);
                bmts bmts3 = ((bydf) this.f90135a.f164949b).f165772b;
                if (bmts3 == null) {
                    bmts3 = bmts.f130908c;
                }
                bmtk bmtk2 = bmts3.f130911b;
                if (bmtk2 == null) {
                    bmtk2 = bmtk.f130852g;
                }
                bmtl bmtl2 = bmtk2.f130859f;
                if (bmtl2 == null) {
                    bmtl2 = bmtl.f130860e;
                }
                bmth bmth2 = bmtl2.f130865d;
                if (bmth2 == null) {
                    bmth2 = bmth.f130840c;
                }
                long min = Math.min(a2, m75644a(bmth2));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btmc) da.f164949b).f149471e = min;
            }
            bxvd da2 = btmd.f149473c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            btmd btmd = (btmd) da2.f164949b;
            btmc btmc2 = (btmc) da.mo74062i();
            btmc2.getClass();
            btmd.f149476b = btmc2;
            btmd.f149475a = 2;
            return (btmd) da2.mo74062i();
        } catch (GeneralSecurityException e) {
            bnsl bnsl = (bnsl) f90133b.mo68388c();
            bnsl.mo68432a("atdo", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to generate MAC");
            throw new RuntimeException(e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdo.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atdo.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdo.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49797a(asqs asqs) {
        m75645a(asqs, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atdo.a(asqs, boolean):void
     arg types: [asqs, int]
     candidates:
      atdo.a(asqs, askf):void
      atcv.a(asqs, askf):void
      atdo.a(asqs, boolean):void */
    /* renamed from: a */
    public final void mo49798a(asqs asqs, askf askf) {
        m75645a(asqs, false);
    }
}
