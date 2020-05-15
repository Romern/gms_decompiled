package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Debug;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: assl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class assl implements asqs {

    /* renamed from: a */
    public static final srn f89577a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    static boolean f89578b;

    /* renamed from: c */
    static final asrd f89579c;

    /* renamed from: h */
    private static final astf f89580h = astf.m74754a(27904);

    /* renamed from: i */
    private static final astf f89581i = astf.m74754a(25219);

    /* renamed from: j */
    private static final astf f89582j = astf.m74754a(27013);

    /* renamed from: k */
    private static final astf f89583k = astf.m74754a(27266);

    /* renamed from: l */
    private static final astf f89584l = astf.m74754a(27265);

    /* renamed from: m */
    private static volatile int[] f89585m;

    /* renamed from: A */
    private ExecutorService f89586A;

    /* renamed from: d */
    public final bydf f89587d;

    /* renamed from: e */
    public String f89588e;

    /* renamed from: f */
    public byte[] f89589f;

    /* renamed from: g */
    public boolean f89590g;

    /* renamed from: n */
    private final ConnectivityManager f89591n;

    /* renamed from: o */
    private final asqq f89592o;

    /* renamed from: p */
    private final String f89593p;

    /* renamed from: q */
    private final boolean f89594q;

    /* renamed from: r */
    private bmtf f89595r;

    /* renamed from: s */
    private byte[] f89596s;

    /* renamed from: t */
    private byte[] f89597t;

    /* renamed from: u */
    private byte[] f89598u;

    /* renamed from: v */
    private int f89599v = 12;

    /* renamed from: w */
    private final asqu f89600w;

    /* renamed from: x */
    private int f89601x;

    /* renamed from: y */
    private Future f89602y;

    /* renamed from: z */
    private final SecureRandom f89603z;

    static {
        asrd asrd = new asrd();
        String i = cgxi.f187963a.mo6606a().mo84678i();
        try {
            asrd.mo49401a(40806, 4);
            asrd.mo49401a(40706, 6);
            asrd.mo49401a(40707, 6);
            asrd.mo49401a(40730, 2);
            asrd.mo49401a(149, 5);
            asrd.mo49401a(24362, 2);
            asrd.mo49401a(MfiClientException.TYPE_MFICLIENT_NOT_STARTED, 3);
            asrd.mo49401a(MfiClientException.TYPE_NO_ACCOUNT_INFO, 1);
            asrd.mo49401a(40759, 4);
            f89577a.mo26019b(aske.m74275a()).mo68420a("Overriding default PDOL tags with g services flag: %s", i);
            try {
                for (Map.Entry entry : asrd.m74511a(asti.m74762a(i)).entrySet()) {
                    asrd.mo49401a(((Integer) entry.getKey()).intValue(), ((Integer) entry.getValue()).intValue());
                }
            } catch (assw | assx | IllegalArgumentException e) {
                bnsl bnsl = (bnsl) f89577a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Could not decode gservices flag for adding additional PDOL");
            }
            f89579c = asrd;
        } catch (assw | assx e2) {
            throw new RuntimeException("Cannot generate default PDOL", e2);
        }
    }

    public assl(Context context, bydf bydf, asqq asqq, String str) {
        SecureRandom a = asmc.m74369a();
        boolean z = false;
        this.f89590g = false;
        m74675i();
        this.f89587d = bydf;
        this.f89603z = a;
        this.f89592o = asqq;
        this.f89591n = (ConnectivityManager) context.getSystemService("connectivity");
        this.f89593p = str;
        this.f89600w = new asqu();
        this.f89601x = 1;
        bmtm bmtm = m74676l().f130891i;
        this.f89594q = Arrays.binarySearch(f89585m, Integer.parseInt((bmtm == null ? bmtm.f130866j : bmtm).f130874g)) >= 0 ? true : z;
    }

    /* renamed from: a */
    private final void m74664a(int i) {
        int i2 = this.f89599v;
        if (i2 == 12 || i2 == -1 || i2 == 11 || i2 == 0) {
            this.f89599v = i;
        }
        this.f89601x = 2;
    }

    /* renamed from: a */
    private static boolean m74668a(byte b) {
        return (b & 8) != 0;
    }

    /* renamed from: a */
    private static boolean m74669a(byte b, int i) {
        return (b & (1 << (i + -1))) != 0;
    }

    /* renamed from: b */
    private static byte m74671b(byte b, int i) {
        return (byte) (b | (1 << (i - 1)));
    }

    /* renamed from: c */
    private static byte m74673c(byte b, int i) {
        return (byte) (b & ((1 << (i - 1)) ^ -1));
    }

    /* renamed from: i */
    public static synchronized void m74675i() {
        synchronized (assl.class) {
            if (!f89578b) {
                f89578b = true;
                List<String> c = bmyx.m108640a(',').mo66925c((CharSequence) cgxi.f187963a.mo6606a().mo84670a());
                f89585m = new int[c.size()];
                try {
                    int i = 0;
                    for (String str : c) {
                        int i2 = i + 1;
                        f89585m[i] = Integer.parseInt(str);
                        i = i2;
                    }
                } catch (NumberFormatException e) {
                    bnsl bnsl = (bnsl) f89577a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Country code for France wrong");
                    f89585m = new int[]{250};
                }
                Arrays.sort(f89585m);
            }
        }
    }

    /* renamed from: l */
    private final bmto m74676l() {
        bmts bmts = this.f89587d.f165772b;
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
        return bmto == null ? bmto.f130881k : bmto;
    }

    /* renamed from: m */
    private final bmtp m74677m() {
        bmts bmts = this.f89587d.f165772b;
        if (bmts == null) {
            bmts = bmts.f130908c;
        }
        bmtp bmtp = bmts.f130910a;
        return bmtp == null ? bmtp.f130893f : bmtp;
    }

    /* renamed from: n */
    private final astf m74678n() {
        try {
            byte[] p = m74680p();
            this.f89599v = -1;
            return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, asta.m74733a(87, p), asta.m74735b(24352, m74676l().f130885c.getBytes(StandardCharsets.UTF_8)))), 36864);
        } catch (GeneralSecurityException e) {
            bnsl a = f89577a.mo26019b(aske.m74275a());
            a.mo68437a(e);
            a.mo68405a("Security Exception");
            m74665a("Security Exception constructing Track2Data", new Object[0]);
            astf astf = f89583k;
            m74664a(15);
            return astf;
        }
    }

    /* renamed from: o */
    private final astf m74679o() {
        f89577a.mo26019b(aske.m74275a()).mo68405a("Processing read command for emv with token");
        this.f89599v = -1;
        Future future = this.f89602y;
        if (future != null) {
            try {
                return (astf) future.get(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException e) {
                bnsl a = f89577a.mo26019b(aske.m74275a());
                a.mo68437a(e);
                a.mo68405a("read command for emv with token future didn't finish");
            } catch (TimeoutException e2) {
                this.f89602y.cancel(true);
            }
        }
        return mo49434k();
    }

    /* renamed from: p */
    private final byte[] m74680p() {
        String str;
        String format = String.format(Locale.US, "%04d", Integer.valueOf(this.f89587d.f165773c));
        String substring = format.substring(format.length() - 4);
        byte[] k = this.f89587d.f165776f.mo73780k();
        String format2 = String.format("%s%s", substring, "000000000001");
        SecretKeySpec secretKeySpec = new SecretKeySpec(k, "DESede");
        Cipher instance = Cipher.getInstance("DESede/CBC/NoPadding");
        instance.init(1, secretKeySpec, new IvParameterSpec(assm.f89604a));
        String a = asti.m74760a(instance.doFinal(asti.m74762a(format2)));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = a.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else if (Character.isAlphabetic(c)) {
                sb2.append(Character.digit(c, 16) - 10);
            }
        }
        String sb3 = sb.toString();
        String valueOf = String.valueOf(sb2);
        StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + String.valueOf(valueOf).length());
        sb4.append(sb3);
        sb4.append(valueOf);
        String substring2 = sb4.toString().substring(0, 3);
        bmti bmti = m74677m().f130898d;
        if (bmti == null) {
            bmti = bmti.f130844c;
        }
        bmtg bmtg = bmti.f130846a;
        if (bmtg == null) {
            bmtg = bmtg.f130832g;
        }
        String str2 = bmtg.f130834a;
        Object[] objArr = new Object[7];
        objArr[0] = this.f89587d.f165777g;
        Locale locale = null;
        Object[] objArr2 = new Object[1];
        bmth bmth = m74677m().f130896b;
        if (bmth == null) {
            bmth = bmth.f130840c;
        }
        objArr2[0] = Integer.valueOf(bmth.f130843b % 100);
        objArr[1] = String.format(locale, "%02d", objArr2);
        Object[] objArr3 = new Object[1];
        bmth bmth2 = m74677m().f130896b;
        if (bmth2 == null) {
            bmth2 = bmth.f130840c;
        }
        objArr3[0] = Integer.valueOf(bmth2.f130842a);
        objArr[2] = String.format(locale, "%02d", objArr3);
        if (m74676l().f130890h != null) {
            bmtr bmtr = m74676l().f130890h;
            if (bmtr == null) {
                bmtr = bmtr.f130903d;
            }
            str = bmtr.f130905a;
        } else {
            bmtq bmtq = m74676l().f130889g;
            if (bmtq == null) {
                bmtq = bmtq.f130900b;
            }
            str = bmtq.f130902a;
        }
        objArr[3] = str;
        objArr[4] = str2.substring(str2.length() - 6);
        objArr[5] = substring;
        objArr[6] = substring2;
        return m74670a(String.format("%sD%s%s%s%s%s%sF", objArr));
    }

    /* renamed from: b */
    public final asqu mo49387b() {
        return this.f89600w;
    }

    /* renamed from: d */
    public final List mo49389d() {
        bmto l = m74676l();
        char c = 1;
        if (l.f130883a.size() != 1) {
            ArrayList arrayList = new ArrayList(l.f130883a.size());
            bxwc bxwc = l.f130883a;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                bmtf bmtf = (bmtf) bxwc.get(i);
                assu[] assuArr = new assu[7];
                assuArr[0] = asta.m74733a(79, asti.m74762a(bmtf.f130827b));
                assuArr[c] = asta.m74733a(80, asti.m74762a(bmtf.f130826a));
                assuArr[2] = asta.m74732a(135, (byte) (Integer.parseInt(bmtf.f130828c, 16) & 255));
                assuArr[3] = asta.m74733a(40746, asti.m74762a(l.f130884b));
                assuArr[4] = asta.m74733a(24405, asti.m74762a(l.f130886d));
                assuArr[5] = asta.m74733a(66, asti.m74762a(l.f130887e));
                assuArr[6] = m74672b(asti.m74762a(bmtf.f130831f));
                arrayList.add(asta.m74731a(97, assuArr));
                i++;
                c = 1;
            }
            return bngx.m109368a((Collection) arrayList);
        }
        bmtf bmtf2 = (bmtf) l.f130883a.get(0);
        return bngx.m109356a(asta.m74731a(97, asta.m74733a(79, asti.m74762a(bmtf2.f130827b)), asta.m74733a(80, asti.m74762a(bmtf2.f130826a)), m74672b(asti.m74762a(bmtf2.f130831f))));
    }

    /* renamed from: e */
    public final int mo49390e() {
        return this.f89599v;
    }

    /* renamed from: f */
    public final asqq mo49391f() {
        return this.f89592o;
    }

    /* renamed from: g */
    public final String mo49392g() {
        return this.f89593p;
    }

    /* renamed from: h */
    public final int mo49393h() {
        return 0;
    }

    /* renamed from: j */
    public final byte[] mo49433j() {
        Calendar instance = Calendar.getInstance();
        bmth bmth = m74677m().f130896b;
        if (bmth == null) {
            bmth = bmth.f130840c;
        }
        instance.set(bmth.f130843b, bmth.f130842a - 1, 1);
        instance.set(5, instance.getActualMaximum(5));
        return asuv.m74876a(new SimpleDateFormat("yyMMdd").format(instance.getTime()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, bmyd]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* renamed from: k */
    public final astf mo49434k() {
        byte[] bArr = new byte[4];
        this.f89603z.nextBytes(bArr);
        byte[] array = ByteBuffer.allocate(7).put((byte) 1).put(bArr).put(this.f89596s).array();
        String str = "0";
        if (cgwn.m147258h()) {
            assu[] assuArr = new assu[7];
            assuArr[0] = asta.m74733a(24356, mo49433j());
            assuArr[1] = asta.m74733a(90, asuv.m74876a(this.f89587d.f165777g));
            bmtm bmtm = m74676l().f130891i;
            if (bmtm == null) {
                bmtm = bmtm.f130866j;
            }
            assuArr[2] = asta.m74733a(40711, bqct.m112602a((short) ((char) Integer.parseInt(bmtm.f130871d, 16))));
            assuArr[3] = asta.m74733a(40809, array);
            bmtm bmtm2 = m74676l().f130891i;
            if (bmtm2 == null) {
                bmtm2 = bmtm.f130866j;
            }
            assuArr[4] = asta.m74733a(24360, bqct.m112602a((short) ((char) Integer.parseInt(bmtm2.f130874g, 16))));
            assuArr[5] = asta.m74733a(40779, m74674c(array));
            if (m74677m().f130899e.length() % 2 == 0) {
                str = "";
            }
            String valueOf = String.valueOf(m74677m().f130899e);
            assuArr[6] = asta.m74733a(40729, asti.m74762a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf)));
            ArrayList a = bnkn.m109665a(assuArr);
            m74667a(a);
            bnjd.m109580a((Iterable) a, (bmxz) bmyd.IS_NULL);
            return astf.m74756a(asta.m74734a(asta.m74730a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, a)), 36864);
        }
        assu[] assuArr2 = new assu[7];
        assuArr2[0] = asta.m74733a(24356, mo49433j());
        assuArr2[1] = asta.m74733a(90, asuv.m74876a(this.f89587d.f165777g));
        bmtm bmtm3 = m74676l().f130891i;
        if (bmtm3 == null) {
            bmtm3 = bmtm.f130866j;
        }
        assuArr2[2] = asta.m74733a(40711, bqct.m112602a((short) ((char) Integer.parseInt(bmtm3.f130871d, 16))));
        assuArr2[3] = asta.m74733a(40809, array);
        bmtm bmtm4 = m74676l().f130891i;
        if (bmtm4 == null) {
            bmtm4 = bmtm.f130866j;
        }
        assuArr2[4] = asta.m74733a(24360, bqct.m112602a((short) ((char) Integer.parseInt(bmtm4.f130874g, 16))));
        assuArr2[5] = asta.m74733a(40779, m74674c(array));
        if (m74677m().f130899e.length() % 2 == 0) {
            str = "";
        }
        String valueOf2 = String.valueOf(m74677m().f130899e);
        assuArr2[6] = asta.m74733a(40729, asti.m74762a(valueOf2.length() == 0 ? new String(str) : str.concat(valueOf2)));
        return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, assuArr2)), 36864);
    }

    /* renamed from: a */
    private final astf m74662a(asrb asrb, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        String str;
        try {
            if (m74676l().f130890h != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f89587d.f165777g);
                sb.append("D");
                Locale locale = null;
                Object[] objArr = new Object[1];
                bmth bmth = m74677m().f130896b;
                if (bmth == null) {
                    bmth = bmth.f130840c;
                }
                objArr[0] = Integer.valueOf(bmth.f130843b % 100);
                sb.append(String.format(locale, "%02d", objArr));
                Object[] objArr2 = new Object[1];
                bmth bmth2 = m74677m().f130896b;
                if (bmth2 == null) {
                    bmth2 = bmth.f130840c;
                }
                objArr2[0] = Integer.valueOf(bmth2.f130842a);
                sb.append(String.format(locale, "%02d", objArr2));
                if (m74676l().f130890h != null) {
                    bmtr bmtr = m74676l().f130890h;
                    if (bmtr == null) {
                        bmtr = bmtr.f130903d;
                    }
                    str = bmtr.f130905a;
                } else {
                    bmtq bmtq = m74676l().f130889g;
                    if (bmtq == null) {
                        bmtq = bmtq.f130900b;
                    }
                    str = bmtq.f130902a;
                }
                sb.append(str);
                bmtr bmtr2 = m74676l().f130890h;
                if (bmtr2 == null) {
                    bmtr2 = bmtr.f130903d;
                }
                sb.append(bmtr2.f130906b);
                bmtr bmtr3 = m74676l().f130890h;
                if (bmtr3 == null) {
                    bmtr3 = bmtr.f130903d;
                }
                sb.append(bmtr3.f130907c);
                if (sb.length() % 2 != 0) {
                    sb.append("F");
                }
                bArr4 = m74670a(sb.toString());
            } else {
                bArr4 = m74680p();
            }
            this.f89589f = asrb.mo49400a(40759);
            this.f89597t = asrb.mo49400a(40706);
            this.f89598u = asrb.mo49400a(24362);
            assu[] assuArr = new assu[10];
            assuArr[0] = asta.m74733a(40742, assm.m74694a(ByteBuffer.allocate(65).put(this.f89597t).put(asrb.mo49400a(40707)).put(asrb.mo49400a(40730)).put(asrb.mo49400a(149)).put(this.f89598u).put(asrb.mo49400a(MfiClientException.TYPE_MFICLIENT_NOT_STARTED)).put(asrb.mo49400a(MfiClientException.TYPE_NO_ACCOUNT_INFO)).put(this.f89589f).put(bArr2).put(bqct.m112602a((short) this.f89587d.f165773c)).put(bArr).array(), this.f89587d.f165776f.mo73780k()));
            assuArr[1] = asta.m74733a(130, bArr2);
            assuArr[2] = asta.m74733a(148, bArr3);
            bmtm bmtm = m74676l().f130891i;
            if (bmtm == null) {
                bmtm = bmtm.f130866j;
            }
            assuArr[3] = asta.m74732a(24372, (byte) ((short) ((char) Integer.parseInt(bmtm.f130872e, 16))));
            assuArr[4] = asta.m74733a(40758, bqct.m112602a((short) this.f89587d.f165773c));
            assuArr[5] = asta.m74733a(40812, this.f89596s);
            bmtm bmtm2 = m74676l().f130891i;
            if (bmtm2 == null) {
                bmtm2 = bmtm.f130866j;
            }
            assuArr[6] = asta.m74733a(40814, asti.m74762a(bmtm2.f130870c));
            assuArr[7] = asta.m74733a(40720, bArr);
            assuArr[8] = asta.m74733a(87, bArr4);
            bmtm bmtm3 = m74676l().f130891i;
            if (bmtm3 == null) {
                bmtm3 = bmtm.f130866j;
            }
            assuArr[9] = asta.m74733a(40743, asti.m74762a(bmtm3.f130875h));
            return astf.m74756a(asta.m74734a(asta.m74731a(119, assuArr)), 36864);
        } catch (GeneralSecurityException e) {
            bnsl a = f89577a.mo26019b(aske.m74275a());
            a.mo68437a(e);
            a.mo68405a("Security Exception");
            this.f89599v = 15;
            return f89582j;
        }
    }

    /* renamed from: b */
    private static assu m74672b(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            return assu.m74713a(bArr);
        } catch (assv e) {
            bnsl bnsl = (bnsl) f89577a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failed to parse tag 9f0a tlv");
            return null;
        }
    }

    /* renamed from: c */
    private final byte[] m74674c(byte[] bArr) {
        int i;
        byte[] array = ByteBuffer.allocate(3).put((byte) 2).put(bqct.m112602a((short) this.f89587d.f165773c)).array();
        byte[] array2 = ByteBuffer.allocate(19).put(this.f89589f).put(this.f89597t).put(this.f89598u).put(bArr).array();
        byde byde = this.f89587d.f165779i;
        if (byde == null) {
            byde = byde.f165759i;
        }
        int i2 = 0;
        if ((byde.f165761a & 1) != 0) {
            byde byde2 = this.f89587d.f165779i;
            if (byde2 == null) {
                byde2 = byde.f165759i;
            }
            i = (byde2.f165762b.mo73744a() - array.length) - 25;
        } else {
            i = 0;
        }
        if (i >= 0) {
            i2 = i;
        }
        int length = array.length;
        byte b = (byte) length;
        ByteBuffer put = ByteBuffer.allocate(length + 3 + i2 + array2.length).put((byte) -107).put((byte) 1).put(b).put(array);
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            Arrays.fill(bArr2, (byte) -69);
            put.put(bArr2);
        }
        put.put(array2);
        byte[] a = assm.m74692a(put.array());
        ByteBuffer put2 = ByteBuffer.allocate(length + 5 + i2 + a.length).put((byte) 106).put((byte) -107).put((byte) 1).put(b).put(array);
        if (i2 > 0) {
            byte[] bArr3 = new byte[i2];
            Arrays.fill(bArr3, (byte) -69);
            put2.put(bArr3);
        }
        put2.put(a);
        put2.put((byte) -68);
        return assm.m74693a(put2.array(), this.f89587d);
    }

    /* renamed from: c */
    public final void mo49388c() {
        ExecutorService executorService = this.f89586A;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015b, code lost:
        if (r17 > r3.toMillis(r12.f130838e)) goto L_0x0163;
     */
    /* renamed from: a */
    private final astf m74663a(aste aste) {
        int i;
        boolean z;
        byte b;
        astf astf;
        byte[] bArr;
        byte[] bArr2;
        aste aste2 = aste;
        try {
            if (aste2.f89649c == 0) {
                if (aste2.f89650d == 0) {
                    assu a = assu.m74713a(aste.mo49457b());
                    if (a.f89619b != 131) {
                        m74665a("Invalid lc or pdol field", new Object[0]);
                        astf astf2 = f89582j;
                        m74664a(25);
                        return astf2;
                    }
                    asrb a2 = asrb.m74509a(f89579c, a.mo49442h());
                    asqu asqu = this.f89600w;
                    asqu.f89412h = true;
                    int a3 = asqu.m74485a(a2.mo49400a(40706));
                    asqu.f89406b = asti.m74760a(a2.mo49400a(40713));
                    int a4 = asqu.m74485a(a2.mo49400a(40725));
                    asqu.f89407c = (short) asqu.m74485a(a2.mo49400a(MfiClientException.TYPE_NO_ACCOUNT_INFO));
                    asqu.f89411g = asqu.m74486a((short) a4) && ((long) a3) <= cgxi.m147450c();
                    if (aste.mo49456a() != 0) {
                        m74665a("Invalid le field", new Object[0]);
                        astf astf3 = f89581i;
                        m74664a(25);
                        return astf3;
                    } else if (this.f89601x == 2) {
                        byte[] a5 = a2.mo49400a(40806);
                        boolean a6 = m74669a(a5[0], 8);
                        boolean a7 = m74669a(a5[0], 6);
                        if (this.f89587d.f165773c < 65535) {
                            bmti bmti = m74677m().f130898d;
                            if (bmti == null) {
                                bmti = bmti.f130844c;
                            }
                            bmtg bmtg = bmti.f130846a;
                            if (bmtg == null) {
                                bmtg = bmtg.f130832g;
                            }
                            if (bmtg.f130835b < 65535) {
                                bmtm bmtm = m74676l().f130891i;
                                if (bmtm == null) {
                                    bmtm = bmtm.f130866j;
                                }
                                byte[] a8 = asti.m74762a(bmtm.f130868a);
                                this.f89596s = a8;
                                byte[] bArr3 = new byte[6];
                                a8[0] = m74673c(m74673c(a8[0], 7), 8);
                                a8[1] = m74673c(a8[1], 8);
                                bArr3[0] = 0;
                                if (!this.f89594q) {
                                    i = 32;
                                } else {
                                    i = 164;
                                }
                                bArr3[1] = (byte) i;
                                bydf bydf = this.f89587d;
                                if (bydf.f165773c < 65535) {
                                    bmts bmts = bydf.f165772b;
                                    if (bmts == null) {
                                        bmts = bmts.f130908c;
                                    }
                                    bmtp bmtp = bmts.f130910a;
                                    if (bmtp == null) {
                                        bmtp = bmtp.f130893f;
                                    }
                                    bmti bmti2 = bmtp.f130898d;
                                    if (bmti2 == null) {
                                        bmti2 = bmti.f130844c;
                                    }
                                    bmtg bmtg2 = bmti2.f130846a;
                                    if (bmtg2 == null) {
                                        bmtg2 = bmtg.f130832g;
                                    }
                                    if (bmtg2.f130835b < 65535) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        TimeUnit timeUnit = TimeUnit.SECONDS;
                                        bmts bmts2 = this.f89587d.f165772b;
                                        if (bmts2 == null) {
                                            bmts2 = bmts.f130908c;
                                        }
                                        bmtp bmtp2 = bmts2.f130910a;
                                        if (bmtp2 == null) {
                                            bmtp2 = bmtp.f130893f;
                                        }
                                        bmti bmti3 = bmtp2.f130898d;
                                        if (bmti3 == null) {
                                            bmti3 = bmti.f130844c;
                                        }
                                        bmtg bmtg3 = bmti3.f130846a;
                                        if (bmtg3 == null) {
                                            bmtg3 = bmtg.f130832g;
                                        }
                                        z = a7;
                                    } else {
                                        z = a7;
                                    }
                                } else {
                                    z = a7;
                                }
                                bArr3[2] = m74671b((byte) 0, 6);
                                if (Debug.isDebuggerConnected()) {
                                    b = m74671b((byte) 0, 8);
                                    ((bnsl) f89577a.mo68388c()).mo68405a("Debugger connected");
                                } else {
                                    b = 0;
                                }
                                ConnectivityManager connectivityManager = this.f89591n;
                                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() == null) {
                                    b = m74671b(b, 4);
                                    ((bnsl) f89577a.mo68388c()).mo68405a("Connectivity disabled by user");
                                }
                                bArr3[4] = b;
                                byte b2 = asti.m74762a(this.f89595r.f130829d)[2];
                                boolean a9 = m74669a(a5[1], 7);
                                if (cgwn.f187872a.mo6606a().mo84621b() && m74668a(b2) && this.f89592o.mo49383b() && !a9) {
                                    bArr3[0] = 81;
                                    a8[1] = m74671b(a8[1], 8);
                                    asqu asqu2 = this.f89600w;
                                    asqu2.f89409e = false;
                                    asqu2.f89410f = asqv.CDCVM;
                                } else if (!this.f89595r.f130830e && !a9) {
                                    a8[1] = m74671b(a8[1], 8);
                                    asqu asqu3 = this.f89600w;
                                    asqu3.f89409e = false;
                                    asqu3.f89410f = asqv.NO_CVM;
                                } else {
                                    this.f89600w.f89409e = a9;
                                    if (!m74669a(a5[0], 3) || (b2 & -64) == 0) {
                                        if (m74669a(a5[2], 7) && m74668a(b2)) {
                                            this.f89600w.f89410f = asqv.CDCVM;
                                            if (this.f89592o.mo49383b()) {
                                                a8[1] = m74671b(a8[1], 8);
                                                bArr3[0] = 81;
                                            }
                                        } else if (m74669a(a5[0], 2) && (b2 & 16) != 0) {
                                            a8[0] = m74671b(a8[0], 7);
                                            bArr3[0] = 109;
                                            this.f89600w.f89410f = asqv.SIGNATURE;
                                        } else {
                                            this.f89600w.f89410f = asqv.CDCVM;
                                            if (this.f89592o.mo49383b()) {
                                                a8[1] = m74671b(a8[1], 8);
                                            }
                                        }
                                        astf a10 = astf.m74754a(27014);
                                        m74664a(19);
                                        return a10;
                                    }
                                    a8[0] = m74671b(a8[0], 8);
                                    bArr3[0] = 110;
                                    this.f89600w.f89410f = asqv.ONLINE_PIN;
                                }
                                bmts bmts3 = this.f89587d.f165772b;
                                if (bmts3 == null) {
                                    bmts3 = bmts.f130908c;
                                }
                                bmtk bmtk = bmts3.f130911b;
                                if (bmtk == null) {
                                    bmtk = bmtk.f130852g;
                                }
                                boolean z2 = z && m74669a(a5[0], 1) && (asti.m74762a(this.f89595r.f130829d)[1] & 32) == 0 && !bmtk.f130855b.isEmpty() && !bmtk.f130854a.isEmpty();
                                asqu asqu4 = this.f89600w;
                                asqu4.f89411g = z2 && asqu4.f89411g;
                                asqu4.f89413i = z2;
                                if (!this.f89592o.mo49382a() && !this.f89600w.f89411g) {
                                    astf a11 = astf.m74754a(27014);
                                    m74664a(21);
                                    return a11;
                                }
                                ByteBuffer put = ByteBuffer.allocate(32).put((byte) 31).put((byte) 67);
                                bmti bmti4 = m74677m().f130898d;
                                if (bmti4 == null) {
                                    bmti4 = bmti.f130844c;
                                }
                                bmtg bmtg4 = bmti4.f130846a;
                                if (bmtg4 == null) {
                                    bmtg4 = bmtg.f130832g;
                                }
                                ByteBuffer put2 = put.put((byte) ((short) ((char) Integer.parseInt(bmtg4.f130839f, 16)))).put(bArr3);
                                bmtm bmtm2 = m74676l().f130891i;
                                if (bmtm2 == null) {
                                    bmtm2 = bmtm.f130866j;
                                }
                                ByteBuffer put3 = put2.put(asti.m74762a(bmtm2.f130873f));
                                bmts bmts4 = this.f89587d.f165772b;
                                if (bmts4 == null) {
                                    bmts4 = bmts.f130908c;
                                }
                                bmtp bmtp3 = bmts4.f130910a;
                                if (bmtp3 == null) {
                                    bmtp3 = bmtp.f130893f;
                                }
                                bmti bmti5 = bmtp3.f130898d;
                                if (bmti5 == null) {
                                    bmti5 = bmti.f130844c;
                                }
                                bmtg bmtg5 = bmti5.f130846a;
                                if (bmtg5 == null) {
                                    bmtg5 = bmtg.f130832g;
                                }
                                byte[] array = put3.put(asti.m74762a(bmtg5.f130834a)).array();
                                if (z) {
                                    this.f89588e = "Q";
                                    this.f89600w.f89416l = bozu.VISA_QVSDC;
                                    if (z2) {
                                        bArr = asti.m74762a(bmtk.f130854a);
                                    } else {
                                        bmtm bmtm3 = m74676l().f130891i;
                                        if (bmtm3 == null) {
                                            bmtm3 = bmtm.f130866j;
                                        }
                                        bmtn bmtn = bmtm3.f130876i;
                                        if (bmtn == null) {
                                            bmtn = bmtn.f130877c;
                                        }
                                        bArr = asti.m74762a(bmtn.f130879a);
                                    }
                                    if (z2) {
                                        bArr2 = asti.m74762a(bmtk.f130855b);
                                    } else {
                                        bmtm bmtm4 = m74676l().f130891i;
                                        if (bmtm4 == null) {
                                            bmtm4 = bmtm.f130866j;
                                        }
                                        bmtn bmtn2 = bmtm4.f130876i;
                                        if (bmtn2 == null) {
                                            bmtn2 = bmtn.f130877c;
                                        }
                                        bArr2 = asti.m74762a(bmtn2.f130880b);
                                    }
                                    astf = m74662a(a2, array, bArr2, bArr);
                                    if (z2) {
                                        this.f89586A = adzl.f62962b.mo25879b(2);
                                        Future future = this.f89602y;
                                        if (future != null) {
                                            future.cancel(true);
                                        }
                                        this.f89602y = this.f89586A.submit(new assk(this));
                                    }
                                } else if (a6) {
                                    this.f89588e = "M";
                                    this.f89600w.f89416l = bozu.VISA_MSD;
                                    bmtj bmtj = m74676l().f130888f;
                                    if (bmtj == null) {
                                        bmtj = bmtj.f130848c;
                                    }
                                    if (m74676l().f130888f != null && !bmtj.f130851b.isEmpty() && !bmtj.f130850a.isEmpty()) {
                                        byte[] a12 = asti.m74762a(bmtj.f130850a);
                                        byte[] a13 = asti.m74762a(bmtj.f130851b);
                                        astf = astf.m74756a(asta.m74734a(asta.m74733a(128, ByteBuffer.allocate(a12.length + a13.length).put(a12).put(a13).array())), 36864);
                                    } else {
                                        this.f89599v = 28;
                                        astf = f89582j;
                                    }
                                } else {
                                    m74665a("Invalid ttq mode", new Object[0]);
                                    astf = f89582j;
                                    this.f89599v = 26;
                                }
                                if (astf.f89655a == 36864) {
                                    this.f89590g = true;
                                    this.f89601x = 3;
                                }
                                return astf;
                            }
                        }
                        m74665a("Counters exceeded", new Object[0]);
                        astf astf4 = f89582j;
                        m74664a(1);
                        return astf4;
                    } else {
                        m74665a("Invalid state", new Object[0]);
                        astf astf5 = f89582j;
                        m74664a(26);
                        return astf5;
                    }
                }
            }
            m74665a("Invalid p1 or p2 field", new Object[0]);
            return f89584l;
        } catch (ArrayIndexOutOfBoundsException e) {
            m74666a(e, "Wrong GPO command");
            astf astf6 = f89581i;
            m74664a(25);
            return astf6;
        } catch (assv e2) {
            m74666a(e2, "Invalid lc or pdol field");
            astf astf7 = f89582j;
            m74664a(26);
            return astf7;
        }
    }

    /* renamed from: a */
    private final void m74665a(String str, Object... objArr) {
        ((bnsl) f89577a.mo68388c()).mo68436a(str, objArr);
        this.f89600w.f89405a = String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    private final void m74666a(Throwable th, String str) {
        bnsl bnsl = (bnsl) f89577a.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68405a(str);
        this.f89600w.f89405a = str;
    }

    /* renamed from: a */
    private final void m74667a(ArrayList arrayList) {
        bmts bmts = this.f89587d.f165772b;
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
        String str = bmto.f130892j;
        if (!str.isEmpty()) {
            try {
                arrayList.add(asta.m74733a(40740, str.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException e) {
                m74666a(e, "PAR string from bundle could not be encoded as bytes");
            }
        }
    }

    /* renamed from: a */
    private static byte[] m74670a(String str) {
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) | Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, bmyd]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        asss asss;
        try {
            aste a = aste.m74751a(bArr);
            try {
                byte b = a.f89647a;
                if (b == Byte.MIN_VALUE) {
                    byte b2 = a.f89648b;
                    if (b2 == -88) {
                        return m74663a(a);
                    }
                    m74665a("Unsupported Instruction: %02X ", Byte.valueOf(b2));
                    astf astf = f89581i;
                    m74664a(26);
                    return astf;
                } else if (b != 0) {
                    m74665a("Unsupported Command: %02X ", Byte.valueOf(b));
                    astf astf2 = f89580h;
                    m74664a(26);
                    return astf2;
                } else {
                    byte b3 = a.f89648b;
                    if (b3 == -92) {
                        if (a.f89649c == 4) {
                            if (a.f89650d == 0) {
                                astc a2 = astc.m74747a(a.mo49457b());
                                this.f89600w.f89408d = a2.toString();
                                Iterator it = m74676l().f130883a.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    bmtf bmtf = (bmtf) it.next();
                                    if (astc.m74747a(asti.m74762a(bmtf.f130827b)).equals(a2)) {
                                        this.f89595r = bmtf;
                                        break;
                                    }
                                }
                                if (this.f89595r == null) {
                                    m74665a("Unsupported AID", new Object[0]);
                                    astf astf3 = f89581i;
                                    m74664a(26);
                                    return astf3;
                                } else if (a.mo49456a() == 0) {
                                    this.f89601x = 2;
                                    this.f89599v = 11;
                                    assu[] assuArr = new assu[2];
                                    assuArr[0] = asta.m74733a(132, a2.f89685k);
                                    assu[] assuArr2 = new assu[5];
                                    assuArr2[0] = asta.m74733a(80, asti.m74762a(this.f89595r.f130826a));
                                    assuArr2[1] = asta.m74732a(135, (byte) Integer.parseInt(this.f89595r.f130828c, 16));
                                    asrd asrd = f89579c;
                                    ByteBuffer allocate = ByteBuffer.allocate(asrd.f89483b);
                                    for (Map.Entry entry : asrd.f89482a.entrySet()) {
                                        int intValue = ((Integer) entry.getKey()).intValue();
                                        int c = assu.m74717c(intValue);
                                        allocate.put(bqcn.m112583a(intValue), 4 - c, c);
                                        allocate.put(((asrc) entry.getValue()).f89479b);
                                    }
                                    assuArr2[2] = asta.m74733a(40760, allocate.array());
                                    assuArr2[3] = asta.m74733a(24365, Locale.getDefault().getLanguage().getBytes(StandardCharsets.US_ASCII));
                                    assu[] assuArr3 = new assu[4];
                                    if (this.f89594q) {
                                        asss = asta.m74733a(57120, new byte[]{0, 0, 0, 17});
                                    } else {
                                        asss = null;
                                    }
                                    assuArr3[0] = asss;
                                    assuArr3[1] = asta.m74733a(40794, asti.m74762a(m74677m().f130897c));
                                    assuArr3[2] = asta.m74731a(48995, asta.m74732a(57120, Byte.MIN_VALUE));
                                    assuArr3[3] = m74672b(asti.m74762a(this.f89595r.f130831f));
                                    assuArr2[4] = asta.m74731a(48908, assuArr3);
                                    assuArr[1] = asta.m74731a(165, assuArr2);
                                    return astf.m74756a(asta.m74734a(asta.m74731a(111, assuArr)), 36864);
                                } else {
                                    m74665a("Invalid le field", new Object[0]);
                                    astf astf4 = f89581i;
                                    m74664a(25);
                                    return astf4;
                                }
                            }
                        }
                        m74665a("Invalid p1 or p2 field", new Object[0]);
                        astf astf5 = f89581i;
                        m74664a(26);
                        return astf5;
                    } else if (b3 != -78) {
                        m74665a("Unsupported Instruction: %02X ", Byte.valueOf(b3));
                        astf astf6 = f89581i;
                        m74664a(26);
                        return astf6;
                    } else {
                        byte b4 = a.f89649c;
                        byte b5 = a.f89650d;
                        if (b4 != 0) {
                            if ((b5 & 7) == 4) {
                                int i = this.f89601x;
                                if (i != 3) {
                                    if (i != 4) {
                                        m74665a("Invalid state", new Object[0]);
                                        astf astf7 = f89582j;
                                        m74664a(26);
                                        return astf7;
                                    }
                                }
                                this.f89601x = 4;
                                int i2 = b5 >> 3;
                                if (b4 == 1) {
                                    if (i2 == 1) {
                                        return m74678n();
                                    }
                                }
                                if (b4 == 3 && i2 == 1) {
                                    this.f89599v = -1;
                                    if (cgwn.m147258h()) {
                                        assu[] assuArr4 = new assu[5];
                                        bmtm bmtm = m74676l().f130891i;
                                        if (bmtm == null) {
                                            bmtm = bmtm.f130866j;
                                        }
                                        assuArr4[0] = asta.m74733a(40711, bqct.m112602a((short) ((char) Integer.parseInt(bmtm.f130871d, 16))));
                                        assuArr4[1] = asta.m74735b(24352, m74676l().f130885c.getBytes(StandardCharsets.UTF_8));
                                        bmtm bmtm2 = m74676l().f130891i;
                                        if (bmtm2 == null) {
                                            bmtm2 = bmtm.f130866j;
                                        }
                                        assuArr4[2] = asta.m74735b(40828, asti.m74762a(bmtm2.f130869b));
                                        bmtm bmtm3 = m74676l().f130891i;
                                        if (bmtm3 == null) {
                                            bmtm3 = bmtm.f130866j;
                                        }
                                        assuArr4[3] = asta.m74733a(24360, bqct.m112602a((short) ((char) Integer.parseInt(bmtm3.f130874g, 16))));
                                        String str = m74677m().f130899e.length() % 2 != 0 ? "0" : "";
                                        String valueOf = String.valueOf(m74677m().f130899e);
                                        assuArr4[4] = asta.m74733a(40729, asti.m74762a(valueOf.length() == 0 ? new String(str) : str.concat(valueOf)));
                                        ArrayList a3 = bnkn.m109665a(assuArr4);
                                        m74667a(a3);
                                        bnjd.m109580a((Iterable) a3, (bmxz) bmyd.IS_NULL);
                                        return astf.m74756a(asta.m74734a(asta.m74730a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, a3)), 36864);
                                    }
                                    assu[] assuArr5 = new assu[5];
                                    bmtm bmtm4 = m74676l().f130891i;
                                    if (bmtm4 == null) {
                                        bmtm4 = bmtm.f130866j;
                                    }
                                    assuArr5[0] = asta.m74733a(40711, bqct.m112602a((short) ((char) Integer.parseInt(bmtm4.f130871d, 16))));
                                    assuArr5[1] = asta.m74735b(24352, m74676l().f130885c.getBytes(StandardCharsets.UTF_8));
                                    bmtm bmtm5 = m74676l().f130891i;
                                    if (bmtm5 == null) {
                                        bmtm5 = bmtm.f130866j;
                                    }
                                    assuArr5[2] = asta.m74735b(40828, asti.m74762a(bmtm5.f130869b));
                                    bmtm bmtm6 = m74676l().f130891i;
                                    if (bmtm6 == null) {
                                        bmtm6 = bmtm.f130866j;
                                    }
                                    assuArr5[3] = asta.m74733a(24360, bqct.m112602a((short) ((char) Integer.parseInt(bmtm6.f130874g, 16))));
                                    String str2 = m74677m().f130899e.length() % 2 != 0 ? "0" : "";
                                    String valueOf2 = String.valueOf(m74677m().f130899e);
                                    assuArr5[4] = asta.m74733a(40729, asti.m74762a(valueOf2.length() == 0 ? new String(str2) : str2.concat(valueOf2)));
                                    return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, assuArr5)), 36864);
                                } else if (b4 == 2 && i2 == 2) {
                                    f89577a.mo26019b(aske.m74275a()).mo68405a("Processing read command for emv with ipk");
                                    bmts bmts = this.f89587d.f165772b;
                                    if (bmts == null) {
                                        bmts = bmts.f130908c;
                                    }
                                    bmtk bmtk = bmts.f130911b;
                                    if (bmtk == null) {
                                        bmtk = bmtk.f130852g;
                                    }
                                    boan boan = boan.f132470d;
                                    bmtl bmtl = bmtk.f130859f;
                                    if (bmtl == null) {
                                        bmtl = bmtl.f130860e;
                                    }
                                    byte[] b6 = boan.mo68796b(bmtl.f130864c);
                                    if (b6.length <= 0) {
                                        assu[] assuArr6 = new assu[3];
                                        assuArr6[0] = asta.m74733a(143, bqct.m112602a(bqcw.m112605a(bmtk.f130856c)));
                                        boan boan2 = boan.f132470d;
                                        bmtl bmtl2 = bmtk.f130859f;
                                        if (bmtl2 == null) {
                                            bmtl2 = bmtl.f130860e;
                                        }
                                        assuArr6[1] = asta.m74733a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, boan2.mo68796b(bmtl2.f130862a));
                                        bmtl bmtl3 = bmtk.f130859f;
                                        if (bmtl3 == null) {
                                            bmtl3 = bmtl.f130860e;
                                        }
                                        assuArr6[2] = asta.m74733a(40754, asti.m74762a(bmtl3.f130863b));
                                        return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, assuArr6)), 36864);
                                    }
                                    assu[] assuArr7 = new assu[4];
                                    assuArr7[0] = asta.m74732a(143, bqcw.m112605a(bmtk.f130856c));
                                    boan boan3 = boan.f132470d;
                                    bmtl bmtl4 = bmtk.f130859f;
                                    if (bmtl4 == null) {
                                        bmtl4 = bmtl.f130860e;
                                    }
                                    assuArr7[1] = asta.m74733a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, boan3.mo68796b(bmtl4.f130862a));
                                    bmtl bmtl5 = bmtk.f130859f;
                                    if (bmtl5 == null) {
                                        bmtl5 = bmtl.f130860e;
                                    }
                                    assuArr7[2] = asta.m74733a(40754, asti.m74762a(bmtl5.f130863b));
                                    assuArr7[3] = asta.m74733a(146, b6);
                                    return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, assuArr7)), 36864);
                                } else if (b4 == 3 && i2 == 2) {
                                    f89577a.mo26019b(aske.m74275a()).mo68405a("Processing read command for emv with icc");
                                    bmts bmts2 = this.f89587d.f165772b;
                                    if (bmts2 == null) {
                                        bmts2 = bmts.f130908c;
                                    }
                                    bmtk bmtk2 = bmts2.f130911b;
                                    if (bmtk2 == null) {
                                        bmtk2 = bmtk.f130852g;
                                    }
                                    boan boan4 = boan.f132470d;
                                    bmtl bmtl6 = bmtk2.f130858e;
                                    if (bmtl6 == null) {
                                        bmtl6 = bmtl.f130860e;
                                    }
                                    byte[] b7 = boan4.mo68796b(bmtl6.f130864c);
                                    if (b7.length > 0) {
                                        assu[] assuArr8 = new assu[3];
                                        boan boan5 = boan.f132470d;
                                        bmtl bmtl7 = bmtk2.f130858e;
                                        if (bmtl7 == null) {
                                            bmtl7 = bmtl.f130860e;
                                        }
                                        assuArr8[0] = asta.m74733a(40774, boan5.mo68796b(bmtl7.f130862a));
                                        bmtl bmtl8 = bmtk2.f130858e;
                                        if (bmtl8 == null) {
                                            bmtl8 = bmtl.f130860e;
                                        }
                                        assuArr8[1] = asta.m74733a(40775, asti.m74762a(bmtl8.f130863b));
                                        assuArr8[2] = asta.m74733a(40776, b7);
                                        return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, assuArr8)), 36864);
                                    }
                                    assu[] assuArr9 = new assu[2];
                                    boan boan6 = boan.f132470d;
                                    bmtl bmtl9 = bmtk2.f130858e;
                                    if (bmtl9 == null) {
                                        bmtl9 = bmtl.f130860e;
                                    }
                                    assuArr9[0] = asta.m74733a(40774, boan6.mo68796b(bmtl9.f130862a));
                                    bmtl bmtl10 = bmtk2.f130858e;
                                    if (bmtl10 == null) {
                                        bmtl10 = bmtl.f130860e;
                                    }
                                    assuArr9[1] = asta.m74733a(40775, asti.m74762a(bmtl10.f130863b));
                                    return astf.m74756a(asta.m74734a(asta.m74731a((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, assuArr9)), 36864);
                                } else {
                                    if (b4 == 4) {
                                        if (i2 == 2) {
                                            return m74679o();
                                        }
                                    }
                                    m74665a("Invalid sfi field", new Object[0]);
                                    astf astf8 = f89583k;
                                    m74664a(26);
                                    return astf8;
                                }
                            }
                        }
                        m74665a("Invalid p1 or p2 field", new Object[0]);
                        this.f89599v = 26;
                        return f89583k;
                    }
                }
            } catch (assx e) {
                throw new RuntimeException("keys should be validated already", e);
            } catch (RuntimeException e2) {
                m74666a(e2, "Error processing request");
                this.f89599v = 26;
                return astf.m74754a(27012);
            }
        } catch (RuntimeException e3) {
            this.f89599v = 25;
            return astf.m74754a(27012);
        }
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        astc[] astcArr = new astc[m74676l().f130883a.size()];
        for (int i = 0; i < m74676l().f130883a.size(); i++) {
            astcArr[i] = astc.m74747a(asti.m74762a(((bmtf) m74676l().f130883a.get(i)).f130827b));
        }
        return astcArr;
    }
}
