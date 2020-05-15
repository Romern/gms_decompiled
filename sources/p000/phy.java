package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.analytics.CastAnalytics$1;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: phy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phy {

    /* renamed from: e */
    public static final boolean f39152e = ccxv.f180201a.mo6606a().mo77016b();

    /* renamed from: g */
    private static final qav f39153g = new qav("CastAnalytics");

    /* renamed from: n */
    private static String f39154n;

    /* renamed from: o */
    private static final boolean f39155o = ccxv.f180201a.mo6606a().mo77033s();

    /* renamed from: p */
    private static final boolean f39156p = ccxv.f180201a.mo6606a().mo77026l();

    /* renamed from: a */
    public final qat f39157a;

    /* renamed from: b */
    public final String f39158b;

    /* renamed from: c */
    final ArrayList f39159c;

    /* renamed from: d */
    final BroadcastReceiver f39160d;

    /* renamed from: f */
    public pic f39161f;

    /* renamed from: h */
    private final Context f39162h;

    /* renamed from: i */
    private final qws f39163i;

    /* renamed from: j */
    private final phw f39164j;

    /* renamed from: k */
    private final Map f39165k = new HashMap();

    /* renamed from: l */
    private final Map f39166l = new HashMap();

    /* renamed from: m */
    private final boolean f39167m = ccxv.f180201a.mo6606a().mo77029o();

    /* renamed from: q */
    private pia f39168q;

    public phy(Context context, qat qat) {
        this.f39162h = context;
        this.f39157a = qat;
        SharedPreferences b = qay.m31785b(context);
        String string = b.getString("PREF_CAST_SENDER_ID", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            b.edit().putString("PREF_CAST_SENDER_ID", string).apply();
        }
        this.f39158b = string;
        if (ccyq.m132226b()) {
            this.f39163i = new qws(context, "CAST_SENDER_SDK", null);
        } else {
            this.f39163i = qws.m33019a(context, "CAST_SENDER_SDK");
        }
        this.f39164j = new phw(context);
        this.f39159c = new ArrayList();
        mo23107a(context);
        CastAnalytics$1 castAnalytics$1 = new CastAnalytics$1(this, "cast");
        this.f39160d = castAnalytics$1;
        context.registerReceiver(castAnalytics$1, new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
    }

    /* renamed from: a */
    static long m30354a(String str) {
        MessageDigest b = spn.m35868b("SHA-1");
        if (b == null) {
            try {
                f39153g.mo23675c("No Sha1 digest", new Object[0]);
                return 0;
            } catch (UnsupportedEncodingException e) {
                f39153g.mo23674b(e, "Unable to compute the hash of the key(%s)", str);
                return 0;
            }
        } else {
            byte[] digest = b.digest(str.getBytes("UTF-8"));
            int length = digest.length;
            if (length != 20) {
                f39153g.mo23670a("Hash length is incorrect. Expected: %d Actual: %d", 20, Integer.valueOf(length));
                return 0;
            }
            long j = 0;
            for (int i = 0; i < 8; i++) {
                j = (j << 8) + ((long) (digest[i] & 255));
            }
            return j;
        }
    }

    /* renamed from: a */
    private static Enum m30363a(Enum enumR, Enum enumR2) {
        return enumR != null ? enumR : enumR2;
    }

    /* renamed from: b */
    public static bpes m30367b(int i) {
        switch (i) {
            case 1:
                return bpes.ERROR_DEVICE_AUTH_ERROR_RECEIVED;
            case 2:
                return bpes.ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_MALFORMED;
            case 3:
                return bpes.ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_X509;
            case 4:
                return bpes.ERROR_DEVICE_AUTH_CLIENT_AUTH_CERT_NOT_TRUSTED;
            case 5:
                return bpes.ERROR_DEVICE_AUTH_SSL_CERT_NOT_TRUSTED;
            case 6:
                return bpes.ERROR_DEVICE_AUTH_RESPONSE_MALFORMED;
            case 7:
            default:
                return bpes.ERROR_DEVICE_AUTH;
            case 8:
                return bpes.ERROR_CRL_INVALID;
            case 9:
                return bpes.ERROR_CRL_REVOCATION_CHECK_FAILED;
        }
    }

    /* renamed from: c */
    static int m30371c(int i) {
        if (i == 15) {
            return 6;
        }
        switch (i) {
            case 2001:
                return 7;
            case 2002:
                return 5;
            case 2003:
                return 4;
            case 2004:
                return 2;
            case 2005:
                return 3;
            default:
                return 1;
        }
    }

    /* renamed from: k */
    private final synchronized pia m30373k() {
        phx j = mo23146j();
        Integer num = null;
        if (j == null) {
            return null;
        }
        boolean a = mo23135a(j);
        Integer d = this.f39157a.mo23852d();
        if (d != null) {
            num = Integer.valueOf((((d.intValue() >> 16) & 255) << 8) + ((d.intValue() >> 24) & 255));
        }
        return new pia(j, a, num);
    }

    /* renamed from: d */
    public final synchronized void mo23140d() {
        if (f39152e && f39156p && m30372c(this.f39168q)) {
            mo23110a((bpsz) m30368b(this.f39168q).mo74062i(), (int) BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE);
        }
    }

    /* renamed from: e */
    public final synchronized void mo23141e() {
        if (f39152e && f39156p && m30372c(this.f39168q)) {
            mo23110a((bpsz) m30368b(this.f39168q).mo74062i(), (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD);
        }
    }

    /* renamed from: f */
    public final synchronized void mo23142f() {
        if (f39152e && m30372c(this.f39168q)) {
            mo23110a((bpsz) m30368b(this.f39168q).mo74062i(), 204);
        }
    }

    /* renamed from: g */
    public final synchronized pia mo23143g() {
        return this.f39168q;
    }

    /* renamed from: h */
    public final synchronized void mo23144h() {
        if (f39152e) {
            bpsy i = mo23145i();
            if (i.f164950c) {
                i.mo74035c();
                i.f164950c = false;
            }
            bpsz bpsz = bpsz.f139036I;
            ((bpsz) i.f164949b).f139059m = bxvk.m124030de();
            synchronized (this.f39159c) {
                ArrayList arrayList = this.f39159c;
                if (i.f164950c) {
                    i.mo74035c();
                    i.f164950c = false;
                }
                bpsz bpsz2 = (bpsz) i.f164949b;
                bpsz2.mo68983a();
                bxsy.m123078a(arrayList, bpsz2.f139059m);
            }
            mo23110a((bpsz) i.mo74062i(), 161);
        }
    }

    /* renamed from: i */
    public final bpsy mo23145i() {
        return m30356a(0, (int[]) null, (String) null, (phx) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0140 A[SYNTHETIC, Splitter:B:106:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0156 A[SYNTHETIC, Splitter:B:116:0x0156] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0178 A[Catch:{ OutOfMemoryError -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0187 A[Catch:{ OutOfMemoryError -> 0x0167 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0204 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac A[SYNTHETIC, Splitter:B:51:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2 A[SYNTHETIC, Splitter:B:61:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4 A[Catch:{ OutOfMemoryError -> 0x0167 }] */
    /* renamed from: j */
    public final synchronized phx mo23146j() {
        String str;
        String str2;
        String str3;
        BufferedReader bufferedReader;
        IOException e;
        BufferedReader bufferedReader2;
        IOException e2;
        String b = this.f39157a.mo23850b();
        byte[] bArr = null;
        if (!TextUtils.isEmpty(b) && b.endsWith("_nomap")) {
            return null;
        }
        boolean z = true;
        try {
            if (ccxd.m131982b()) {
                try {
                    bufferedReader2 = new BufferedReader(new FileReader("/proc/net/route"));
                    boolean z2 = true;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                str3 = null;
                                break;
                            } else if (!z2) {
                                String[] split = readLine.split("\\s+");
                                if (split != null && split.length >= 3 && split[1].equals("00000000") && split[2].length() == 8) {
                                    StringBuilder sb = new StringBuilder();
                                    String str4 = split[2];
                                    for (int length = str4.length() - 2; length >= 0; length -= 2) {
                                        sb.append(Integer.parseInt(str4.substring(length, length + 2), 16));
                                        if (length > 0) {
                                            sb.append(".");
                                        }
                                    }
                                    str3 = sb.toString();
                                }
                            } else {
                                z2 = false;
                            }
                        } catch (IOException e3) {
                            e2 = e3;
                            try {
                                qat.f40827a.mo23676c(e2, "Error reading route table.", new Object[0]);
                                if (bufferedReader2 == null) {
                                    try {
                                        bufferedReader2.close();
                                        str3 = null;
                                    } catch (IOException e4) {
                                        qat.f40827a.mo23676c(e4, "Error closing route table.", new Object[0]);
                                        str3 = null;
                                    }
                                } else {
                                    str3 = null;
                                }
                                if (str3 != null) {
                                }
                                str = null;
                                if (TextUtils.isEmpty(str)) {
                                }
                                if (!TextUtils.isEmpty(str)) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (bufferedReader2 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e5) {
                                    qat.f40827a.mo23676c(e5, "Error closing route table.", new Object[0]);
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException e6) {
                        qat.f40827a.mo23676c(e6, "Error closing route table.", new Object[0]);
                    }
                } catch (IOException e7) {
                    e2 = e7;
                    bufferedReader2 = null;
                    qat.f40827a.mo23676c(e2, "Error reading route table.", new Object[0]);
                    if (bufferedReader2 == null) {
                    }
                    if (str3 != null) {
                    }
                    str = null;
                    if (TextUtils.isEmpty(str)) {
                    }
                    if (!TextUtils.isEmpty(str)) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = null;
                    if (bufferedReader2 != null) {
                    }
                    throw th;
                }
            } else {
                str3 = null;
            }
            if (str3 != null || !ccxd.m131982b()) {
                str = null;
                if (TextUtils.isEmpty(str)) {
                    str = this.f39157a.mo23848a();
                    z = false;
                }
                if (!TextUtils.isEmpty(str)) {
                    return null;
                }
                Context context = this.f39162h;
                synchronized (phy.class) {
                    if (TextUtils.isEmpty(f39154n)) {
                        SharedPreferences b2 = qay.m31785b(context);
                        String string = b2.getString("PREF_CAST_SECRET", null);
                        f39154n = string;
                        if (TextUtils.isEmpty(string)) {
                            f39154n = UUID.randomUUID().toString();
                            b2.edit().putString("PREF_CAST_SECRET", f39154n).apply();
                        }
                    }
                    str2 = f39154n;
                }
                if (str2 != null) {
                    bArr = str2.getBytes(ptw.f40213a);
                }
                byte[] bytes = str.getBytes(ptw.f40213a);
                MessageDigest b3 = spn.m35868b("SHA-256");
                long j = 0;
                if (b3 != null) {
                    if (bArr != null) {
                        b3.update(bArr);
                    }
                    if (bytes != null) {
                        b3.update(bytes);
                    }
                    byte[] digest = b3.digest();
                    for (int i = 0; i < 8; i++) {
                        j = ((long) (digest[i] & 255)) | (j << 8);
                    }
                }
                return new phx(j, z);
            }
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/net/arp"));
                boolean z3 = true;
                while (true) {
                    try {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 == null) {
                            str = null;
                            break;
                        } else if (!z3) {
                            String[] split2 = readLine2.split("\\s+");
                            if (split2 != null && split2.length >= 4 && split2[0].equals(str3)) {
                                str = split2[3].toUpperCase();
                                String[] split3 = str.split(":");
                                if (split3 == null || split3.length != 6) {
                                    str = null;
                                }
                            }
                        } else {
                            z3 = false;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        try {
                            qat.f40827a.mo23676c(e, "Error reading ARP table.", new Object[0]);
                            if (bufferedReader == null) {
                                try {
                                    bufferedReader.close();
                                    str = null;
                                } catch (IOException e9) {
                                    qat.f40827a.mo23676c(e9, "Error closing ARP table.", new Object[0]);
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                            }
                            if (!TextUtils.isEmpty(str)) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (bufferedReader != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e10) {
                                qat.f40827a.mo23676c(e10, "Error closing ARP table.", new Object[0]);
                            }
                        }
                        throw th;
                    }
                }
                try {
                    bufferedReader.close();
                } catch (IOException e11) {
                    qat.f40827a.mo23676c(e11, "Error closing ARP table.", new Object[0]);
                }
            } catch (IOException e12) {
                e = e12;
                bufferedReader = null;
                qat.f40827a.mo23676c(e, "Error reading ARP table.", new Object[0]);
                if (bufferedReader == null) {
                }
                if (TextUtils.isEmpty(str)) {
                }
                if (!TextUtils.isEmpty(str)) {
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
                if (bufferedReader != null) {
                }
                throw th;
            }
            if (TextUtils.isEmpty(str)) {
            }
            if (!TextUtils.isEmpty(str)) {
            }
        } catch (OutOfMemoryError e13) {
            f39153g.mo23670a("Hit OOM when trying to get the default gateway LAN address. Will treat as empty.", new Object[0]);
            str = null;
        }
    }

    /* renamed from: c */
    private static boolean m30372c(pia pia) {
        return pia != null && pia.mo23149b();
    }

    /* renamed from: c */
    public final synchronized void mo23139c() {
        if (f39152e) {
            mo23110a((bpsz) mo23145i().mo74062i(), 52);
        }
    }

    /* renamed from: a */
    public static bpes m30355a(int i) {
        if (i == 1) {
            return bpes.ERROR_PEER_DISCONNECTED;
        }
        if (i == 2) {
            return bpes.ERROR_IO;
        }
        if (i == 3) {
            return bpes.ERROR_TIMEOUT;
        }
        if (i == 4) {
            return bpes.ERROR_SSL;
        }
        if (i != 5) {
            return bpes.ERROR_UNKNOWN;
        }
        return bpes.ERROR_RELAY;
    }

    /* renamed from: b */
    private final bpsy m30368b(pia pia) {
        bpsy a = m30356a(pia.f39173a, pia.f39175c, (String) null, pia.f39174b, pia.mo23147a());
        bpsz bpsz = (bpsz) a.f164949b;
        if ((bpsz.f139047a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0 && bpsz.f139057k.size() == 0) {
            m30365a(a);
        }
        return a;
    }

    /* renamed from: a */
    private final bpsy m30356a(long j, int[] iArr, String str, phx phx, int i) {
        bptk bptk;
        bpsy bpsy = (bpsy) bpsz.f139036I.mo74144da();
        String str2 = this.f39158b;
        if (bpsy.f164950c) {
            bpsy.mo74035c();
            bpsy.f164950c = false;
        }
        bpsz bpsz = (bpsz) bpsy.f164949b;
        str2.getClass();
        int i2 = bpsz.f139047a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bpsz.f139047a = i2;
        bpsz.f139054h = str2;
        bpsz.f139047a = i2 | 2;
        bpsz.f139049c = j;
        if (phx != null) {
            bxvd da = bptk.f139133d.mo74144da();
            if (!phx.f39151b) {
                long j2 = phx.f39150a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptk bptk2 = (bptk) da.f164949b;
                if (!bptk2.f139137c.mo73666a()) {
                    bptk2.f139137c = bxvk.m124020a(bptk2.f139137c);
                }
                bptk2.f139137c.mo74161a(j2);
            } else {
                long j3 = phx.f39150a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptk bptk3 = (bptk) da.f164949b;
                bptk3.f139135a |= 1;
                bptk3.f139136b = j3;
            }
            bptk = (bptk) da.mo74062i();
        } else {
            bptk = null;
        }
        if (bptk != null) {
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz2 = (bpsz) bpsy.f164949b;
            bptk.getClass();
            bpsz2.f139055i = bptk;
            bpsz2.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        }
        if (iArr != null) {
            List b = bqcn.m112586b(iArr);
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz3 = (bpsz) bpsy.f164949b;
            if (!bpsz3.f139057k.mo73666a()) {
                bpsz3.f139057k = bxvk.m124019a(bpsz3.f139057k);
            }
            bxsy.m123078a(b, bpsz3.f139057k);
        }
        if (!TextUtils.isEmpty(str)) {
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz4 = (bpsz) bpsy.f164949b;
            str.getClass();
            bpsz4.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bpsz4.f139056j = str;
        }
        if (bpsy.f164950c) {
            bpsy.mo74035c();
            bpsy.f164950c = false;
        }
        bpsz bpsz5 = (bpsz) bpsy.f164949b;
        bpsz5.f139047a |= 268435456;
        bpsz5.f139070x = i;
        return bpsy;
    }

    /* renamed from: b */
    private static final bxvd m30369b(String str) {
        return m30362a(1, str, -1);
    }

    /* renamed from: b */
    private static List m30370b(Set set) {
        ArrayList arrayList = new ArrayList();
        if (set != null && !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(m30360a((String) it.next(), ""));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized void mo23136b() {
        if (f39152e) {
            mo23110a((bpsz) mo23145i().mo74062i(), 51);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return;
     */
    /* renamed from: b */
    public final synchronized void mo23137b(CastDevice castDevice, long j, phx phx, String str, int i) {
        bpsy a;
        if (f39152e && castDevice != null && (a = m30357a(castDevice, j, phx, str)) != null) {
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsz.f139040C = i - 1;
            bpsz.f139048b |= 8;
            mo23110a((bpsz) a.mo74062i(), 185);
        }
    }

    /* renamed from: b */
    public final synchronized void mo23138b(boolean z) {
        int i;
        if (f39152e) {
            bpsz bpsz = (bpsz) mo23145i().mo74062i();
            if (!z) {
                i = 183;
            } else {
                i = 182;
            }
            mo23110a(bpsz, i);
        }
    }

    /* renamed from: a */
    private final bpsy m30357a(CastDevice castDevice, long j, phx phx, String str) {
        if (!f39152e) {
            return null;
        }
        bpsy a = mo23102a(j, castDevice.f29723k, phx);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bpsz bpsz = (bpsz) a.f164949b;
        bpsz bpsz2 = bpsz.f139036I;
        bpsz.f139050d = 5;
        bpsz.f139047a |= 4;
        if (!TextUtils.isEmpty(str)) {
            bxvd da = bptc.f139085d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptc bptc = (bptc) da.f164949b;
            str.getClass();
            bptc.f139087a |= 1;
            bptc.f139088b = str;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz3 = (bpsz) a.f164949b;
            bptc bptc2 = (bptc) da.mo74062i();
            bptc2.getClass();
            bpsz3.f139063q = bptc2;
            bpsz3.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }
        return a;
    }

    /* renamed from: a */
    static bpta m30358a(bdyx bdyx) {
        return m30359a(bdyx.mo58453b(), bdyx.mo58455c());
    }

    /* renamed from: a */
    private static bpta m30359a(String str, Object obj) {
        bxvd da = bpta.f139073e.mo74144da();
        long a = m30354a(str);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpta bpta = (bpta) da.f164949b;
        bpta.f139075a |= 1;
        bpta.f139078d = a;
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpta bpta2 = (bpta) da.f164949b;
            bpta2.f139076b = 2;
            bpta2.f139077c = Boolean.valueOf(booleanValue);
        } else if (obj instanceof String) {
            long a2 = m30354a((String) obj);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpta bpta3 = (bpta) da.f164949b;
            bpta3.f139076b = 4;
            bpta3.f139077c = Long.valueOf(a2);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpta bpta4 = (bpta) da.f164949b;
            bpta4.f139076b = 3;
            bpta4.f139077c = Long.valueOf(longValue);
        } else if (obj instanceof Integer) {
            long intValue = (long) ((Integer) obj).intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpta bpta5 = (bpta) da.f164949b;
            bpta5.f139076b = 3;
            bpta5.f139077c = Long.valueOf(intValue);
        } else {
            f39153g.mo23675c("Unknown value type for key (%s)", str);
        }
        return (bpta) da.mo74062i();
    }

    /* renamed from: a */
    private static bptc m30360a(String str, String str2) {
        bxvd da = bptc.f139085d.mo74144da();
        if (str.startsWith("%")) {
            String valueOf = String.valueOf(str.substring(12));
            String str3 = valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptc bptc = (bptc) da.f164949b;
            str3.getClass();
            bptc.f139087a |= 2;
            bptc.f139089c = str3;
        } else {
            String valueOf2 = String.valueOf(str);
            String str4 = valueOf2.length() == 0 ? new String(str2) : str2.concat(valueOf2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptc bptc2 = (bptc) da.f164949b;
            str4.getClass();
            bptc2.f139087a |= 1;
            bptc2.f139088b = str4;
        }
        return (bptc) da.mo74062i();
    }

    /* renamed from: a */
    private static final bxvd m30361a(int i, String str) {
        return m30362a(i, str, -1);
    }

    /* renamed from: a */
    private static final bxvd m30362a(int i, String str, long j) {
        int i2;
        bxvd da = bptj.f139124h.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = (int) Long.parseLong(str, 16);
            } catch (NumberFormatException e) {
                f39153g.mo23679f("Unable to convert app id to integer: %s", str);
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptj bptj = (bptj) da.f164949b;
        int i3 = 1 | bptj.f139126a;
        bptj.f139126a = i3;
        bptj.f139127b = i2;
        bptj.f139128c = i - 1;
        int i4 = i3 | 2;
        bptj.f139126a = i4;
        if (j != -1) {
            bptj.f139126a = i4 | 32;
            bptj.f139132g = (int) j;
        }
        return da;
    }

    /* renamed from: a */
    private final String m30364a(CastDevice castDevice, long j) {
        if (!TextUtils.isEmpty(castDevice.f29723k)) {
            return castDevice.f29723k;
        }
        String a = castDevice.mo17494a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 21);
        sb.append(a);
        sb.append(":");
        sb.append(j);
        String sb2 = sb.toString();
        if (castDevice.mo17500e()) {
            String str = (String) this.f39165k.get(sb2);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String a2 = qay.m31779a(castDevice.mo17494a(), j, "U:");
            this.f39165k.put(sb2, a2);
            return a2;
        }
        String str2 = (String) this.f39166l.get(sb2);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String a3 = qay.m31779a(castDevice.mo17494a(), j, "G:");
        this.f39166l.put(sb2, a3);
        return a3;
    }

    /* renamed from: a */
    private final void m30365a(bpsy bpsy) {
        int i;
        try {
            List<pmv> f = this.f39157a.mo23854f();
            if (!f.isEmpty()) {
                if (bpsy.f164950c) {
                    bpsy.mo74035c();
                    bpsy.f164950c = false;
                }
                bpsz bpsz = bpsz.f139036I;
                ((bpsz) bpsy.f164949b).f139059m = bxvk.m124030de();
                bxvd da = bpta.f139073e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpta bpta = (bpta) da.f164949b;
                bpta.f139076b = 3;
                bpta.f139077c = 0L;
                bpsy.mo68980a((bpta) da.mo74062i());
                for (pmv pmv : f) {
                    if (pmv != null) {
                        try {
                            i = !pmv.mo23445b() ? !pmv.mo23446c() ? !pmv.mo23447d() ? pmv.mo23444a() ? pmv.mo23448e() ? !this.f39157a.mo23849a(pmv) ? 7 : 0 : 6 : 5 : 4 : 3 : 2;
                        } catch (IOException e) {
                            bxvd da2 = bpta.f139073e.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpta bpta2 = (bpta) da2.f164949b;
                            bpta2.f139076b = 2;
                            bpta2.f139077c = true;
                            bpsy.mo68980a((bpta) da2.mo74062i());
                        }
                    } else {
                        i = 1;
                    }
                    bxvd da3 = bpta.f139073e.mo74144da();
                    long j = (long) i;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bpta bpta3 = (bpta) da3.f164949b;
                    bpta3.f139076b = 3;
                    bpta3.f139077c = Long.valueOf(j);
                    bpsy.mo68980a((bpta) da3.mo74062i());
                }
                return;
            }
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz2 = bpsz.f139036I;
            ((bpsz) bpsy.f164949b).f139059m = bxvk.m124030de();
            bxvd da4 = bpta.f139073e.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bpta bpta4 = (bpta) da4.f164949b;
            bpta4.f139076b = 3;
            bpta4.f139077c = 0L;
            bpsy.mo68980a((bpta) da4.mo74062i());
        } catch (IOException e2) {
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz3 = bpsz.f139036I;
            ((bpsz) bpsy.f164949b).f139059m = bxvk.m124030de();
            bxvd da5 = bpta.f139073e.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bpta bpta5 = (bpta) da5.f164949b;
            bpta5.f139076b = 2;
            bpta5.f139077c = true;
            bpsy.mo68980a((bpta) da5.mo74062i());
        }
    }

    /* renamed from: a */
    static final void m30366a(bpsy bpsy, CastDevice castDevice) {
        if (cczq.m132285d() && !TextUtils.isEmpty(castDevice.f29727o) && ppz.f40045d != null) {
            if (ppz.f40045d.mo23547b(castDevice.f29727o)) {
                if (bpsy.f164950c) {
                    bpsy.mo74035c();
                    bpsy.f164950c = false;
                }
                bpsz bpsz = (bpsz) bpsy.f164949b;
                bpsz bpsz2 = bpsz.f139036I;
                bpsz.f139043F = 2;
                bpsz.f139048b |= 128;
                return;
            }
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz3 = (bpsz) bpsy.f164949b;
            bpsz bpsz4 = bpsz.f139036I;
            bpsz3.f139043F = 1;
            bpsz3.f139048b |= 128;
        }
    }

    /* renamed from: a */
    public final bpsy mo23102a(long j, String str, phx phx) {
        bpsy a = m30356a(j, (int[]) null, str, phx, 0);
        bpsz bpsz = (bpsz) a.f164949b;
        if ((bpsz.f139047a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0 && bpsz.f139057k.size() == 0) {
            m30365a(a);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bpsy mo23103a(pia pia, CastDevice castDevice) {
        return m30356a(pia.f39173a, pia.f39175c, m30364a(castDevice, pia.f39173a), pia.f39174b, pia.mo23147a());
    }

    /* renamed from: a */
    public final synchronized void mo23104a() {
        if (f39152e) {
            mo23110a((bpsz) mo23145i().mo74062i(), 53);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23105a(int i, int i2) {
        if (f39152e && i > 0 && i2 > 0 && m30372c(this.f39168q) && i2 != 2) {
            bxvd da = bptl.f139138d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptl bptl = (bptl) da.f164949b;
            int i3 = 1;
            int i4 = bptl.f139140a | 1;
            bptl.f139140a = i4;
            bptl.f139141b = i;
            switch (i2) {
                case 1:
                    i3 = 2;
                    break;
                case 2:
                    i3 = 3;
                    break;
                case 3:
                    i3 = 4;
                    break;
                case 4:
                    i3 = 5;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 7;
                    break;
                case 7:
                    i3 = 8;
                    break;
                case 8:
                    i3 = 9;
                    break;
                case 9:
                    i3 = 10;
                    break;
                case 10:
                    i3 = 11;
                    break;
                case 11:
                    i3 = 12;
                    break;
                case 12:
                    i3 = 13;
                    break;
            }
            bptl.f139142c = i3 - 1;
            bptl.f139140a = i4 | 2;
            bptl bptl2 = (bptl) da.mo74062i();
            bpsy b = m30368b(this.f39168q);
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz = (bpsz) b.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptl2.getClass();
            bpsz.f139051e = bptl2;
            bpsz.f139047a |= 16;
            mo23110a((bpsz) b.mo74062i(), (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23106a(int i, Integer num, int i2) {
        if (f39152e) {
            bxvd da = bpth.f139111e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpth bpth = (bpth) da.f164949b;
            bpth.f139114b = i - 1;
            bpth.f139113a |= 1;
            if (num != null) {
                int intValue = num.intValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpth bpth2 = (bpth) da.f164949b;
                bpth2.f139113a |= 2;
                bpth2.f139115c = intValue;
            }
            if (i2 != 0) {
                bpth bpth3 = (bpth) da.f164949b;
                bpth3.f139116d = i2 - 1;
                bpth3.f139113a |= 4;
            }
            bpth bpth4 = (bpth) da.mo74062i();
            int a = bpey.m111853a(bpth4.f139114b);
            int i3 = 251;
            if (a != 0) {
                if (a != 1) {
                    i3 = 252;
                }
            }
            bpsy bpsy = (bpsy) bpsz.f139036I.mo74144da();
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz = (bpsz) bpsy.f164949b;
            bpth4.getClass();
            bpsz.f139072z = bpth4;
            bpsz.f139048b |= 1;
            qwo a2 = this.f39163i.mo24335a(((bpsz) bpsy.mo74062i()).mo73642k());
            a2.mo24328b(i3 - 1);
            a2.mo24327b();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: phy.a(java.lang.String, java.lang.Object):bpta
     arg types: [java.lang.String, java.lang.String]
     candidates:
      phy.a(java.lang.String, java.lang.String):bptc
      phy.a(int, java.lang.String):bxvd
      phy.a(java.lang.Enum, java.lang.Enum):java.lang.Enum
      phy.a(com.google.android.gms.cast.CastDevice, long):java.lang.String
      phy.a(bpsy, com.google.android.gms.cast.CastDevice):void
      phy.a(pia, com.google.android.gms.cast.CastDevice):bpsy
      phy.a(int, int):void
      phy.a(bpsz, int):void
      phy.a(com.google.android.gms.cast.CastDevice, java.lang.String):void
      phy.a(java.net.InetSocketAddress, bpes):void
      phy.a(java.util.Set, bpew):void
      phy.a(java.lang.String, java.lang.Object):bpta */
    /* renamed from: a */
    public final void mo23107a(Context context) {
        synchronized (this.f39159c) {
            this.f39159c.clear();
            this.f39159c.add(m30358a(ccze.f180295a));
            this.f39159c.add(m30358a(cdau.f180392b));
            this.f39159c.add(m30358a(ccxx.f180225w));
            this.f39159c.add(m30358a(ccxx.f180224v));
            this.f39159c.add(m30358a(ccxx.f180212j));
            this.f39159c.add(m30358a(ccxx.f180213k));
            this.f39159c.add(m30358a(ccxu.f180184e));
            this.f39159c.add(m30358a(ccxu.f180181b));
            this.f39159c.add(m30358a(ccxx.f180203a));
            this.f39159c.add(m30358a(ccxx.f180204b));
            this.f39159c.add(m30358a(ccxx.f180221s));
            this.f39159c.add(m30358a(ccxx.f180214l));
            this.f39159c.add(m30358a(ccxx.f180205c));
            this.f39159c.add(m30358a(ccxx.f180206d));
            this.f39159c.add(m30358a(ccxx.f180207e));
            this.f39159c.add(m30358a(ccxx.f180210h));
            this.f39159c.add(m30358a(ccxx.f180216n));
            this.f39159c.add(m30358a(cdbg.f180418a));
            this.f39159c.add(m30358a(cdbg.f180419b));
            this.f39159c.add(m30358a(ccxu.f180195p));
            this.f39159c.add(m30358a(ccxu.f180197r));
            this.f39159c.add(m30358a(ccxu.f180196q));
            this.f39159c.add(m30358a(ccxu.f180199t));
            this.f39159c.add(m30358a(ccxu.f180198s));
            this.f39159c.add(m30358a(ccxu.f180187h));
            this.f39159c.add(m30358a(ccxu.f180190k));
            this.f39159c.add(m30358a(ccxu.f180189j));
            this.f39159c.add(m30358a(ccxu.f180193n));
            this.f39159c.add(m30358a(ccxu.f180185f));
            this.f39159c.add(m30358a(ccxu.f180194o));
            this.f39159c.add(m30358a(ccxu.f180186g));
            this.f39159c.add(m30358a(ccxu.f180191l));
            this.f39159c.add(m30358a(ccxu.f180192m));
            this.f39159c.add(m30358a(cdbp.f180429a));
            this.f39159c.add(m30358a(cdbp.f180430b));
            this.f39159c.add(m30358a(cdac.f180365b));
            this.f39159c.add(m30358a(cdac.f180371h));
            this.f39159c.add(m30358a(cdac.f180369f));
            this.f39159c.add(m30358a(cdac.f180366c));
            this.f39159c.add(m30358a(cdac.f180367d));
            this.f39159c.add(m30358a(cdac.f180364a));
            this.f39159c.add(m30358a(cdac.f180370g));
            this.f39159c.add(m30358a(cczz.f180357e));
            this.f39159c.add(m30358a(cczz.f180360h));
            this.f39159c.add(m30358a(cczz.f180354b));
            this.f39159c.add(m30358a(cczz.f180356d));
            this.f39159c.add(m30358a(cczz.f180359g));
            this.f39159c.add(m30358a(ccxc.f180144a));
            this.f39159c.add(m30358a(ccxi.f180160e));
            this.f39159c.add(m30358a(ccxi.f180157b));
            this.f39159c.add(m30358a(ccxi.f180156a));
            this.f39159c.add(m30358a(ccxi.f180162g));
            this.f39159c.add(m30358a(ccxi.f180161f));
            this.f39159c.add(m30358a(ccxi.f180159d));
            this.f39159c.add(m30358a(ccxi.f180163h));
            this.f39159c.add(m30358a(ccya.f180235h));
            this.f39159c.add(m30358a(ccya.f180242o));
            this.f39159c.add(m30358a(ccya.f180243p));
            this.f39159c.add(m30358a(ccya.f180245r));
            this.f39159c.add(m30358a(ccya.f180237j));
            this.f39159c.add(m30358a(ccya.f180236i));
            this.f39159c.add(m30358a(ccya.f180228a));
            this.f39159c.add(m30358a(ccya.f180234g));
            this.f39159c.add(m30358a(ccya.f180229b));
            this.f39159c.add(m30358a(ccya.f180246s));
            this.f39159c.add(m30358a(ccya.f180239l));
            this.f39159c.add(m30358a(ccya.f180241n));
            this.f39159c.add(m30358a(ccya.f180240m));
            this.f39159c.add(m30358a(ccya.f180238k));
            this.f39159c.add(m30358a(ccya.f180232e));
            this.f39159c.add(m30358a(ccyy.f180287a));
            this.f39159c.add(m30358a(ccyy.f180288b));
            this.f39159c.add(m30358a(cczt.f180324j));
            this.f39159c.add(m30358a(ccyg.f180260c));
            this.f39159c.add(m30358a(cdba.f180407h));
            this.f39159c.add(m30358a(cdba.f180408i));
            this.f39159c.add(m30358a(cdba.f180401b));
            this.f39159c.add(m30358a(cdba.f180410k));
            this.f39159c.add(m30358a(cdba.f180405f));
            this.f39159c.add(m30358a(cczl.f180307b));
            this.f39159c.add(m30358a(ccxo.f180171c));
            this.f39159c.add(m30358a(cdax.f180397a));
            this.f39159c.add(m30358a(cdal.f180382b));
            try {
                ModuleManager.ConfigInfo currentConfig = ModuleManager.get(context).getCurrentConfig();
                f39153g.mo23670a("# of module sets: %d", Integer.valueOf(currentConfig.moduleSets.size()));
                for (ModuleManager.ModuleSetInfo moduleSetInfo : currentConfig.moduleSets) {
                    f39153g.mo23670a("moduleSetInfo.moduleSetId %s", moduleSetInfo.moduleSetId);
                    f39153g.mo23670a("Policy set version: %d", Integer.valueOf(moduleSetInfo.moduleSetVariant));
                    if (moduleSetInfo.moduleSetId.toLowerCase().contains("cast-dogfood")) {
                        this.f39159c.add(m30359a("Module Set ID", (Object) moduleSetInfo.moduleSetId));
                        this.f39159c.add(m30359a("Module Variant", Integer.valueOf(moduleSetInfo.moduleSetVariant)));
                    }
                }
            } catch (InvalidConfigException e) {
                f39153g.mo23674b(e, "Invalid configuration", new Object[0]);
            }
            this.f39159c.add(m30358a(ccyj.f180264b));
            this.f39159c.add(m30358a(cczi.f180299a));
            this.f39159c.add(m30358a(cczi.f180300b));
            this.f39159c.add(m30358a(cdaf.f180374a));
            this.f39159c.add(m30358a(cdao.f180385a));
            this.f39159c.add(m30358a(cdbv.f180437a));
            this.f39159c.add(m30358a(cdbd.f180415a));
        }
    }

    /* renamed from: a */
    public final synchronized void mo23108a(bpen bpen) {
        if (f39152e) {
            bxvd da = bpsx.f139032c.mo74144da();
            bpen bpen2 = (bpen) m30363a(bpen, bpen.RESULT_UNKNOWN);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsx bpsx = (bpsx) da.f164949b;
            bpsx.f139035b = bpen2.f137304f;
            bpsx.f139034a |= 1;
            bpsx bpsx2 = (bpsx) da.mo74062i();
            bpsy i = mo23145i();
            if (i.f164950c) {
                i.mo74035c();
                i.f164950c = false;
            }
            bpsz bpsz = (bpsz) i.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsx2.getClass();
            bpsz.f139053g = bpsx2;
            bpsz.f139047a |= 128;
            mo23110a((bpsz) i.mo74062i(), 54);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23109a(bpfa bpfa, Long l, int i) {
        if (f39152e) {
            bxvd da = bpti.f139118e.mo74144da();
            bpfa bpfa2 = (bpfa) m30363a(bpfa, bpfa.KEY_EXCHANGE_UNKNOWN);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpti bpti = (bpti) da.f164949b;
            bpti.f139121b = bpfa2.f137372d;
            bpti.f139120a |= 1;
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpti bpti2 = (bpti) da.f164949b;
            int i2 = bpti2.f139120a | 2;
            bpti2.f139120a = i2;
            bpti2.f139122c = longValue;
            if (i != 0) {
                bpti2.f139123d = i - 1;
                bpti2.f139120a = i2 | 4;
            }
            bpsy bpsy = (bpsy) bpsz.f139036I.mo74144da();
            if (bpsy.f164950c) {
                bpsy.mo74035c();
                bpsy.f164950c = false;
            }
            bpsz bpsz = (bpsz) bpsy.f164949b;
            bpti bpti3 = (bpti) da.mo74062i();
            bpti3.getClass();
            bpsz.f139038A = bpti3;
            bpsz.f139048b |= 4;
            mo23110a((bpsz) bpsy.mo74062i(), 262);
        }
    }

    /* renamed from: a */
    public final void mo23110a(bpsz bpsz, int i) {
        qwo a = this.f39163i.mo24335a(bpsz.mo73642k());
        a.mo24328b(i - 1);
        a.mo24327b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23111a(CastDevice castDevice) {
        if (f39152e && f39156p && castDevice != null && m30372c(this.f39168q)) {
            pic pic = this.f39161f;
            if (pic != null) {
                pic.mo23156a(castDevice);
            }
            mo23110a((bpsz) mo23103a(this.f39168q, castDevice).mo74062i(), 205);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0086, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23112a(CastDevice castDevice, long j, int i, String str, phx phx, String str2) {
        if (f39152e && castDevice != null) {
            bxvd da = bptd.f139090g.mo74144da();
            int c = m30371c(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptd.f139095d = c - 1;
            bptd.f139092a |= 8;
            bxvd b = m30369b(str2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd2 = (bptd) da.f164949b;
            bptj bptj = (bptj) b.mo74062i();
            bptj.getClass();
            bptd2.f139096e = bptj;
            bptd2.f139092a |= 16;
            bptd bptd3 = (bptd) da.mo74062i();
            bpsy a = mo23102a(j, str, phx);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd3.getClass();
            bpsz.f139052f = bptd3;
            int i2 = bpsz.f139047a | 64;
            bpsz.f139047a = i2;
            bpsz.f139050d = 2;
            bpsz.f139047a = i2 | 4;
            mo23110a((bpsz) a.mo74062i(), 44);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23113a(CastDevice castDevice, long j, int i, String str, phx phx, String str2, String str3) {
        if (f39152e && castDevice != null) {
            bxvd b = m30369b(str2);
            boolean z = !TextUtils.isEmpty(str3);
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bptj bptj = (bptj) b.f164949b;
            bptj bptj2 = bptj.f139124h;
            bptj.f139126a |= 8;
            bptj.f139130e = z;
            bptj bptj3 = (bptj) b.mo74062i();
            bxvd da = bptd.f139090g.mo74144da();
            int c = m30371c(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptd.f139095d = c - 1;
            int i2 = bptd.f139092a | 8;
            bptd.f139092a = i2;
            bptj3.getClass();
            bptd.f139096e = bptj3;
            bptd.f139092a = i2 | 16;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a = mo23102a(j, str, phx);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i3 = bpsz.f139047a | 64;
            bpsz.f139047a = i3;
            bpsz.f139050d = 2;
            bpsz.f139047a = i3 | 4;
            mo23110a((bpsz) a.mo74062i(), 42);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23114a(CastDevice castDevice, long j, String str, String str2, phx phx, long j2) {
        if (f39152e && castDevice != null && str != null) {
            bptj bptj = (bptj) m30362a(1, str, j2).mo74062i();
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptj.getClass();
            bptd.f139096e = bptj;
            bptd.f139092a |= 16;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a = mo23102a(j, str2, phx);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i = bpsz.f139047a | 64;
            bpsz.f139047a = i;
            bpsz.f139050d = 2;
            bpsz.f139047a = i | 4;
            mo23110a((bpsz) a.mo74062i(), 43);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23115a(CastDevice castDevice, long j, String str, boolean z, String str2, phx phx) {
        if (f39152e && castDevice != null && str != null) {
            bxvd a = m30361a(3, str);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bptj bptj = (bptj) a.f164949b;
            bptj bptj2 = bptj.f139124h;
            bptj.f139126a |= 4;
            bptj.f139129d = z;
            bptj bptj3 = (bptj) a.mo74062i();
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptj3.getClass();
            bptd.f139096e = bptj3;
            bptd.f139092a |= 16;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a2 = mo23102a(j, str2, phx);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            bpsz bpsz = (bpsz) a2.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i = bpsz.f139047a | 64;
            bpsz.f139047a = i;
            bpsz.f139050d = 2;
            bpsz.f139047a = i | 4;
            mo23110a((bpsz) a2.mo74062i(), 41);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0095, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23116a(CastDevice castDevice, long j, String str, boolean z, String str2, phx phx, int i) {
        int i2;
        if (f39152e && castDevice != null && str != null) {
            bxvd a = m30361a(2, str);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bptj bptj = (bptj) a.f164949b;
            bptj bptj2 = bptj.f139124h;
            int i3 = bptj.f139126a | 8;
            bptj.f139126a = i3;
            bptj.f139130e = z;
            if (i != 0) {
                i2 = i != 2 ? 1 : 3;
            } else {
                i2 = 2;
            }
            bptj.f139131f = i2 - 1;
            bptj.f139126a = i3 | 16;
            bptj bptj3 = (bptj) a.mo74062i();
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptj3.getClass();
            bptd.f139096e = bptj3;
            bptd.f139092a |= 16;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a2 = mo23102a(j, str2, phx);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            bpsz bpsz = (bpsz) a2.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i4 = bpsz.f139047a | 64;
            bpsz.f139047a = i4;
            bpsz.f139050d = 2;
            bpsz.f139047a = i4 | 4;
            mo23110a((bpsz) a2.mo74062i(), 41);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23117a(CastDevice castDevice, long j, String str, boolean z, String str2, phx phx, long j2) {
        if (f39152e && castDevice != null && str != null) {
            bxvd a = m30362a(3, str, j2);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bptj bptj = (bptj) a.f164949b;
            bptj bptj2 = bptj.f139124h;
            bptj.f139126a |= 4;
            bptj.f139129d = z;
            bptj bptj3 = (bptj) a.mo74062i();
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptj3.getClass();
            bptd.f139096e = bptj3;
            bptd.f139092a |= 16;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a2 = mo23102a(j, str2, phx);
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            bpsz bpsz = (bpsz) a2.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i = bpsz.f139047a | 64;
            bpsz.f139047a = i;
            bpsz.f139050d = 2;
            bpsz.f139047a = i | 4;
            mo23110a((bpsz) a2.mo74062i(), 45);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23118a(CastDevice castDevice, long j, phx phx, int i, String str) {
        bpsy a;
        if (!(!f39152e || castDevice == null || (a = m30357a(castDevice, j, phx, str)) == null)) {
            mo23110a((bpsz) a.mo74062i(), i);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23119a(CastDevice castDevice, long j, phx phx, String str, int i) {
        bpsy a;
        if (!(!f39152e || castDevice == null || (a = m30357a(castDevice, j, phx, str)) == null)) {
            bpfi bpfi = bpfi.REMOTE_CONTROL_NOTIFICATION_FAILED_TO_CONNECT;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsz.f139061o = bpfi.f137403h;
            int i2 = bpsz.f139047a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            bpsz.f139047a = i2;
            bpsz.f139047a = i2 | 1048576;
            bpsz.f139064r = i;
            mo23110a((bpsz) a.mo74062i(), 171);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23120a(CastDevice castDevice, long j, phx phx, String str, bpfe bpfe) {
        bpsy a;
        if (!(!f39152e || castDevice == null || (a = m30357a(castDevice, j, phx, str)) == null)) {
            bpfe bpfe2 = (bpfe) m30363a(bpfe, bpfe.REMOTE_CONTROL_NOTIFICATION_CANCEL_REASON_UNKNOWN);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsz.f139062p = bpfe2.f137392p;
            bpsz.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            mo23110a((bpsz) a.mo74062i(), 184);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23121a(CastDevice castDevice, long j, phx phx, String str, bpfi bpfi) {
        bpsy a;
        if (!(!f39152e || castDevice == null || (a = m30357a(castDevice, j, phx, str)) == null)) {
            bpfi bpfi2 = (bpfi) m30363a(bpfi, bpfi.REMOTE_CONTROL_NOTIFICATION_FAILURE_UNKNOWN);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsz.f139061o = bpfi2.f137403h;
            bpsz.f139047a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            mo23110a((bpsz) a.mo74062i(), 171);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23122a(CastDevice castDevice, long j, boolean z, bpes bpes, String str, phx phx) {
        if (f39152e && castDevice != null) {
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptd.f139092a |= 1;
            bptd.f139093b = z;
            bpes bpes2 = (bpes) m30363a(bpes, bpes.ERROR_UNKNOWN);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd2 = (bptd) da.f164949b;
            bptd2.f139094c = bpes2.f137353L;
            bptd2.f139092a |= 2;
            bptd bptd3 = (bptd) da.mo74062i();
            bpsy a = mo23102a(j, str, phx);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd3.getClass();
            bpsz.f139052f = bptd3;
            int i = bpsz.f139047a | 64;
            bpsz.f139047a = i;
            bpsz.f139050d = 1;
            bpsz.f139047a = i | 4;
            m30366a(a, castDevice);
            mo23110a((bpsz) a.mo74062i(), 32);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23123a(CastDevice castDevice, long j, boolean z, String str, phx phx) {
        if (f39152e && castDevice != null) {
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            bptd.f139092a |= 1;
            bptd.f139093b = z;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a = mo23102a(j, str, phx);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i = bpsz.f139047a | 64;
            bpsz.f139047a = i;
            bpsz.f139050d = 1;
            bpsz.f139047a = i | 4;
            boolean c = castDevice.mo17498c();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz3 = (bpsz) a.f164949b;
            bpsz3.f139048b |= 64;
            bpsz3.f139042E = c;
            m30366a(a, castDevice);
            mo23110a((bpsz) a.mo74062i(), 33);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23124a(CastDevice castDevice, long j, boolean z, String str, phx phx, int i) {
        if (f39152e && castDevice != null) {
            bxvd da = bptd.f139090g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptd bptd = (bptd) da.f164949b;
            int i2 = bptd.f139092a | 1;
            bptd.f139092a = i2;
            bptd.f139093b = z;
            bptd.f139097f = i - 1;
            bptd.f139092a = i2 | 32;
            bptd bptd2 = (bptd) da.mo74062i();
            bpsy a = mo23102a(j, str, phx);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptd2.getClass();
            bpsz.f139052f = bptd2;
            int i3 = bpsz.f139047a | 64;
            bpsz.f139047a = i3;
            bpsz.f139050d = 1;
            bpsz.f139047a = i3 | 4;
            m30366a(a, castDevice);
            mo23110a((bpsz) a.mo74062i(), 31);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23125a(CastDevice castDevice, bpfn bpfn, bpes bpes) {
        if (f39152e && f39156p && m30372c(this.f39168q)) {
            bxvd da = bptr.f139165g.mo74144da();
            bpfn bpfn2 = (bpfn) m30363a(bpfn, bpfn.TCP_PROBER_UNKNOWN);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptr bptr = (bptr) da.f164949b;
            bptr.f139168b = bpfn2.f137425j;
            int i = bptr.f139167a | 1;
            bptr.f139167a = i;
            bptr.f139169c = 2;
            bptr.f139167a = i | 2;
            bpes bpes2 = (bpes) m30363a(bpes, bpes.ERROR_UNKNOWN);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptr bptr2 = (bptr) da.f164949b;
            bptr2.f139172f = bpes2.f137353L;
            bptr2.f139167a |= 4;
            bptr bptr3 = (bptr) da.mo74062i();
            bpsy a = mo23103a(this.f39168q, castDevice);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bptr3.getClass();
            bpsz.f139071y = bptr3;
            bpsz.f139047a |= 536870912;
            mo23110a((bpsz) a.mo74062i(), (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f5, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23126a(CastDevice castDevice, bpfn bpfn, Set set, Set set2) {
        if (f39152e && f39156p && m30372c(this.f39168q)) {
            pic pic = this.f39161f;
            if (pic != null) {
                pic.mo23160b(castDevice);
            }
            bxvd da = bptr.f139165g.mo74144da();
            bpfn bpfn2 = (bpfn) m30363a(bpfn, bpfn.TCP_PROBER_UNKNOWN);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bptr bptr = (bptr) da.f164949b;
            bptr.f139168b = bpfn2.f137425j;
            int i = bptr.f139167a | 1;
            bptr.f139167a = i;
            bptr.f139169c = 1;
            bptr.f139167a = i | 2;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bptc a = m30360a((String) it.next(), "");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptr bptr2 = (bptr) da.f164949b;
                a.getClass();
                if (!bptr2.f139170d.mo73666a()) {
                    bptr2.f139170d = bxvk.m124021a(bptr2.f139170d);
                }
                bptr2.f139170d.add(a);
            }
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                bptc a2 = m30360a((String) it2.next(), "");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bptr bptr3 = (bptr) da.f164949b;
                a2.getClass();
                if (!bptr3.f139171e.mo73666a()) {
                    bptr3.f139171e = bxvk.m124021a(bptr3.f139171e);
                }
                bptr3.f139171e.add(a2);
            }
            bpsy a3 = mo23103a(this.f39168q, castDevice);
            if (a3.f164950c) {
                a3.mo74035c();
                a3.f164950c = false;
            }
            bpsz bpsz = (bpsz) a3.f164949b;
            bptr bptr4 = (bptr) da.mo74062i();
            bpsz bpsz2 = bpsz.f139036I;
            bptr4.getClass();
            bpsz.f139071y = bptr4;
            bpsz.f139047a |= 536870912;
            mo23110a((bpsz) a3.mo74062i(), (int) BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23127a(CastDevice castDevice, String str) {
        if (f39152e && f39155o && castDevice != null && !TextUtils.isEmpty(str) && m30372c(this.f39168q)) {
            pic pic = this.f39161f;
            if (pic != null) {
                pic.mo23156a(castDevice);
            }
            bpsy a = mo23103a(this.f39168q, castDevice);
            bptc a2 = m30360a(str, "");
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bpsz bpsz = (bpsz) a.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            a2.getClass();
            bpsz.f139066t = a2;
            bpsz.f139047a |= 4194304;
            mo23110a((bpsz) a.mo74062i(), (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR);
        }
    }

    /* renamed from: a */
    public final synchronized void mo23128a(InetSocketAddress inetSocketAddress, bpes bpes) {
        pic pic = this.f39161f;
        if (pic != null) {
            pic.mo23158a(inetSocketAddress, bpes);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0110, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23129a(List list) {
        pia pia;
        int i;
        int i2;
        if (f39152e && !list.isEmpty() && (pia = this.f39168q) != null) {
            mo23132a(pia);
            bpsy b = m30368b(this.f39168q);
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                pnt pnt = (pnt) list.get(i3);
                CastDevice castDevice = pnt.f39878a;
                Set<String> set = pnt.f39880c;
                Set<String> set2 = pnt.f39881d;
                long j = this.f39168q.f39173a;
                boolean a = pnt.mo23510a();
                bptn bptn = (bptn) bpto.f139149e.mo74144da();
                String a2 = m30364a(castDevice, j);
                if (bptn.f164950c) {
                    bptn.mo74035c();
                    bptn.f164950c = false;
                }
                bpto bpto = (bpto) bptn.f164949b;
                a2.getClass();
                int i4 = bpto.f139151a | 1;
                bpto.f139151a = i4;
                bpto.f139152b = a2;
                bpto.f139151a = i4 | 2;
                bpto.f139154d = a;
                if (set != null) {
                    i = set.size();
                } else {
                    i = 0;
                }
                if (set2 != null) {
                    i2 = set2.size();
                } else {
                    i2 = 0;
                }
                if (i + i2 > 0) {
                    if (set != null && !set.isEmpty()) {
                        for (String str : set) {
                            bptn.mo68984a(m30360a(str, ""));
                        }
                    }
                    if (set2 != null && !set2.isEmpty()) {
                        for (String str2 : set2) {
                            bptn.mo68984a(m30360a(str2, "R:"));
                        }
                    }
                }
                arrayList.add((bpto) bptn.mo74062i());
            }
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz = bpsz.f139036I;
            ((bpsz) b.f164949b).f139060n = bxvk.m124030de();
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz2 = (bpsz) b.f164949b;
            if (!bpsz2.f139060n.mo73666a()) {
                bpsz2.f139060n = bxvk.m124021a(bpsz2.f139060n);
            }
            bxsy.m123078a(arrayList, bpsz2.f139060n);
            mo23110a((bpsz) b.mo74062i(), (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23130a(Set set) {
        f39153g.mo23861b("logDiscoveryStart was invoked");
        this.f39168q = m30373k();
        if (cczj.f180304a.mo6606a().mo77101a()) {
            mo23132a(this.f39168q);
        }
        this.f39165k.clear();
        this.f39166l.clear();
        if (f39152e && m30372c(this.f39168q)) {
            pic pic = this.f39161f;
            if (pic != null) {
                pic.mo23155a();
            }
            bpsy b = m30368b(this.f39168q);
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz = bpsz.f139036I;
            ((bpsz) b.f164949b).f139065s = bxvk.m124030de();
            b.mo68982a(m30370b(set));
            boolean g = this.f39157a.mo23855g();
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz2 = (bpsz) b.f164949b;
            bpsz2.f139048b |= 32;
            bpsz2.f139041D = g;
            mo23110a((bpsz) b.mo74062i(), 202);
            qav qav = f39153g;
            bpsz bpsz3 = (bpsz) b.f164949b;
            qav.mo23857a("DISCOVERY_START event was logged [%s]-[%d]", bpsz3.f139054h, Long.valueOf(bpsz3.f139049c));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23131a(Set set, bpew bpew) {
        bptf bptf;
        if (f39152e && m30372c(this.f39168q)) {
            pic pic = this.f39161f;
            if (pic != null) {
                bptf = pic.mo23159b();
            } else {
                bptf = null;
            }
            bpsy b = m30368b(this.f39168q);
            bpew bpew2 = (bpew) m30363a(bpew, bpew.DISCOVERY_STOP_UNKNOWN);
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz = (bpsz) b.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsz.f139067u = bpew2.f137365h;
            bpsz.f139047a |= 16777216;
            int e = this.f39168q.mo23152e();
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz3 = (bpsz) b.f164949b;
            bpsz3.f139047a |= 67108864;
            bpsz3.f139068v = e;
            bpsz3.f139065s = bxvk.m124030de();
            b.mo68982a(m30370b(set));
            if (bptf != null) {
                if (b.f164950c) {
                    b.mo74035c();
                    b.f164950c = false;
                }
                bpsz bpsz4 = (bpsz) b.f164949b;
                bptf.getClass();
                bpsz4.f139045H = bptf;
                bpsz4.f139048b |= 1024;
            }
            mo23110a((bpsz) b.mo74062i(), 203);
            if (!this.f39167m) {
                this.f39168q = null;
                this.f39165k.clear();
                this.f39166l.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23132a(pia pia) {
        if (pia != null) {
            if (!pia.mo23149b() || !pia.mo23150c()) {
                pia.mo23151d();
                phw phw = this.f39164j;
                phx phx = pia.f39174b;
                synchronized (phw.class) {
                    SharedPreferences b = qay.m31785b(phw.f39145a);
                    String hexString = Long.toHexString(phx.f39150a);
                    boolean contains = b.contains(hexString);
                    b.edit().putLong(hexString, System.currentTimeMillis()).apply();
                    int i = phw.f39147c;
                    if (i == 0) {
                        phw.mo23098a();
                    } else if (!contains) {
                        phw.f39147c = i + 1;
                        phw.mo23098a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo23133a(boolean z) {
        int i;
        if (f39152e) {
            bpsz bpsz = (bpsz) mo23145i().mo74062i();
            if (!z) {
                i = 179;
            } else {
                i = 180;
            }
            mo23110a(bpsz, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo23134a(byte[] bArr) {
        if (f39152e && f39156p && m30372c(this.f39168q)) {
            bpsy b = m30368b(this.f39168q);
            int i = (bArr[0] << 8) + bArr[1];
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpsz bpsz = (bpsz) b.f164949b;
            bpsz bpsz2 = bpsz.f139036I;
            bpsz.f139047a |= 134217728;
            bpsz.f139069w = i;
            mo23110a((bpsz) b.mo74062i(), 208);
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo23135a(phx phx) {
        boolean z;
        phw phw = this.f39164j;
        z = false;
        if (phx != null) {
            synchronized (phw.class) {
                SharedPreferences b = qay.m31785b(phw.f39145a);
                String hexString = Long.toHexString(phx.f39150a);
                long j = b.getLong(hexString, 0);
                if (j != 0) {
                    if (System.currentTimeMillis() - j >= phw.f39146b) {
                        b.edit().remove(hexString).apply();
                        int i = phw.f39147c;
                        if (i > 0) {
                            phw.f39147c = i - 1;
                        }
                    } else {
                        z = true;
                    }
                }
            }
        }
        return z;
    }
}
