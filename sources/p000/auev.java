package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.telephony.TelephonyManager;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.telephonyspam.SpamLookupResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: auev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auev extends aaab {

    /* renamed from: a */
    private final audg f91588a = audg.m76790a("GetSpamStatusOperation");

    /* renamed from: b */
    private final String f91589b;

    /* renamed from: c */
    private final String f91590c;

    /* renamed from: d */
    private final int f91591d;

    /* renamed from: e */
    private final String f91592e;

    /* renamed from: f */
    private final boolean f91593f;

    /* renamed from: g */
    private auem f91594g;

    /* renamed from: h */
    private int f91595h;

    /* renamed from: i */
    private int f91596i;

    /* renamed from: j */
    private int f91597j;

    /* renamed from: k */
    private int f91598k;

    /* renamed from: l */
    private int f91599l;

    /* renamed from: o */
    private int f91600o;

    /* renamed from: p */
    private final audm f91601p;

    public auev(audm audm, String str, String str2, int i, String str3, boolean z) {
        super(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, "GetSpamStatus");
        this.f91601p = audm;
        this.f91589b = str;
        this.f91590c = str2;
        this.f91591d = i;
        this.f91592e = str3;
        this.f91593f = z;
        this.f91598k = 0;
        this.f91597j = 0;
        this.f91600o = 0;
    }

    /* renamed from: a */
    private final boolean m76949a() {
        String str = this.f91592e;
        if (str == null) {
            return false;
        }
        auen auen = new auen(str);
        if (!auen.f91541a) {
            return false;
        }
        auel auel = new auel();
        Map map = auen.f91553m;
        if (map != null) {
            auel.f91526a = map;
            String str2 = auen.f91542b;
            if (str2 != null) {
                auel.f91527b = str2;
                auel.f91528c = Integer.valueOf(auen.f91543c);
                String str3 = "";
                auel.f91529d = str3;
                auel.f91530e = auen.f91544d;
                auel.f91531f = auen.f91545e;
                audx audx = auen.f91546f;
                if (audx != null) {
                    auel.f91532g = audx;
                    audz audz = auen.f91547g;
                    if (audz != null) {
                        auel.f91533h = audz;
                        auel.f91534i = auen.f91548h;
                        auep auep = auen.f91549i;
                        if (auep != null) {
                            auel.f91535j = auep;
                            auea auea = auen.f91550j;
                            if (auea != null) {
                                auel.f91536k = auea;
                                auel.f91537l = auen.f91551k;
                                auel.f91538m = auen.f91552l;
                                auel.f91539n = Boolean.valueOf(auen.f91541a);
                                if (auel.f91526a == null) {
                                    str3 = " headers";
                                }
                                if (auel.f91527b == null) {
                                    str3 = str3.concat(" method");
                                }
                                if (auel.f91528c == null) {
                                    str3 = String.valueOf(str3).concat(" size");
                                }
                                if (auel.f91529d == null) {
                                    str3 = String.valueOf(str3).concat(" body");
                                }
                                if (auel.f91532g == null) {
                                    str3 = String.valueOf(str3).concat(" callID");
                                }
                                if (auel.f91533h == null) {
                                    str3 = String.valueOf(str3).concat(" contact");
                                }
                                if (auel.f91535j == null) {
                                    str3 = String.valueOf(str3).concat(" toHeader");
                                }
                                if (auel.f91536k == null) {
                                    str3 = String.valueOf(str3).concat(" fromHeader");
                                }
                                if (auel.f91539n == null) {
                                    str3 = String.valueOf(str3).concat(" isRequest");
                                }
                                if (!str3.isEmpty()) {
                                    String valueOf = String.valueOf(str3);
                                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                                }
                                audw audw = new audw(auel.f91526a, auel.f91527b, auel.f91528c.intValue(), auel.f91529d, auel.f91530e, auel.f91531f, auel.f91532g, auel.f91533h, auel.f91534i, auel.f91535j, auel.f91536k, auel.f91537l, auel.f91538m, auel.f91539n.booleanValue());
                                this.f91594g = audw;
                                return audw.f91448b.equals("invite") && ((audw) this.f91594g).f91459m;
                            }
                            throw new NullPointerException("Null fromHeader");
                        }
                        throw new NullPointerException("Null toHeader");
                    }
                    throw new NullPointerException("Null contact");
                }
                throw new NullPointerException("Null callID");
            }
            throw new NullPointerException("Null method");
        }
        throw new NullPointerException("Null headers");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqhy mo50490a(Context context, audk audk, String str) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            bxvd da = bqhx.f140735h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((bqhx) da.f164949b).f140739c = str;
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            simCountryIso.getClass();
            ((bqhx) da.f164949b).f140737a = simCountryIso;
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            networkCountryIso.getClass();
            ((bqhx) da.f164949b).f140738b = networkCountryIso;
            if (this.f91591d != 2) {
                long h = cgyd.m147565h();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqhx) da.f164949b).f140740d = h;
                long v = cgyd.f188020a.mo6606a().mo84745v();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqhx) da.f164949b).f140742f = v;
                long u = cgyd.f188020a.mo6606a().mo84744u();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqhx bqhx = (bqhx) da.f164949b;
                bqhx.f140743g = u;
                bqhx.f140741e = bqig.m112865a(2);
            } else {
                long i = cgyd.m147566i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqhx bqhx2 = (bqhx) da.f164949b;
                bqhx2.f140740d = i;
                bqhx2.f140741e = bqig.m112865a(3);
            }
            bqhx bqhx3 = (bqhx) da.mo74062i();
            this.f91588a.mo50423b("Calling server for a Caller Id lookup");
            String valueOf = String.valueOf(bqhx3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Caller Id Lookup Request: ");
            sb.append(valueOf);
            sb.toString();
            ClientContext a = audk.m76813a(context);
            audl audl = audk.f91418a;
            if (audl.f91421d == null) {
                audl.f91421d = chtv.m149566a(chtu.UNARY, "scooby.SpamProtectionService/GetCallerInfo", ciie.m150370a(bqhx.f140735h), ciie.m150370a(bqhy.f140744f));
            }
            return (bqhy) audl.f91422a.mo25553a(audl.f91421d, a, bqhx3, 10000, TimeUnit.MILLISECONDS);
        } catch (chuw | gid e) {
            this.f91588a.mo50424b("Error doing caller id lookup", e);
            return bqhy.f140744f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        audk audk = new audk(context);
        if ((cgyd.m147562e() || cgyd.m147559b()) && this.f91593f) {
            bqhy a = mo50490a(context, audk, this.f91589b);
            audg audg = this.f91588a;
            boolean z = a.f140750e;
            StringBuilder sb = new StringBuilder(53);
            sb.append("Getting Caller Info Response,  spam_if_spoofed \n");
            sb.append(z);
            audg.mo50423b(sb.toString());
            mo50491a(context, a);
            return;
        }
        bxvd da = bqhy.f140744f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bqhy) da.f164949b).f140750e = false;
        mo50491a(context, (bqhy) da.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x040b, code lost:
        if (p000.cgyd.f188020a.mo6606a().mo84727d() == false) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0800, code lost:
        if (r0.isNetworkRoaming() != false) goto L_0x08d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0401 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x041d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0578  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05f2  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x06e8  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x06ee  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0705  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0714  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x079d  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x07b6  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x07b8  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x07ba  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x07ce  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x08db  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x08e6  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0911  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0917  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0922  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x092c  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x093e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x095a  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0963  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x09f9  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x09fb  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0a00  */
    /* renamed from: a */
    public final void mo50491a(Context context, bqhy bqhy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int a;
        boolean z5;
        boolean z6;
        int a2;
        int i;
        int i2;
        char c;
        audy audy;
        audv audv;
        bxvd da;
        auec auec;
        String str;
        int hashCode;
        char c2;
        bowk bowk;
        int i3;
        int i4;
        char c3;
        String str2;
        aueq aueq;
        Context context2 = context;
        bqhy bqhy2 = bqhy;
        String str3 = this.f91589b;
        if (str3 != null && !str3.isEmpty()) {
            boolean z7 = false;
            Object[] objArr = {this.f91589b, Integer.valueOf(this.f91591d)};
            audj a3 = audj.m76808a(context);
            String a4 = audh.m76796a((TelephonyManager) context2.getSystemService("phone"), this.f91589b);
            Object[] objArr2 = {this.f91589b, a4};
            this.f91595h = a3.mo50426a(a4, this.f91591d);
            this.f91596i = a3.mo50428b(a4, this.f91591d);
            audg audg = this.f91588a;
            int i5 = this.f91595h;
            StringBuilder sb = new StringBuilder(32);
            sb.append("Server Table Status: ");
            sb.append(i5);
            audg.mo50423b(sb.toString());
            audg audg2 = this.f91588a;
            int i6 = this.f91596i;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Client Table Status: ");
            sb2.append(i6);
            audg2.mo50423b(sb2.toString());
            int i7 = this.f91596i;
            if (i7 == 0) {
                if (this.f91595h == 1) {
                    z = true;
                    audg audg3 = this.f91588a;
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("Spam Lookup Result: ");
                    sb3.append(z);
                    audg3.mo50423b(sb3.toString());
                    if (!cgyd.m147562e()) {
                        z2 = z;
                        z7 = false;
                    } else if (this.f91594g == null && !m76949a()) {
                        z2 = z;
                    } else {
                        this.f91597j = 0;
                        String networkOperatorName = ((TelephonyManager) context2.getSystemService("phone")).getNetworkOperatorName();
                        this.f91588a.mo50422a("Network Operator: %s", networkOperatorName);
                        String a5 = aueg.m76885a(this.f91594g);
                        audk audk = new audk(context2);
                        if (!a5.isEmpty() && this.f91593f) {
                            audy = new audy(mo50490a(context2, audk, a5));
                        } else {
                            audy = new audy();
                        }
                        audg audg4 = this.f91588a;
                        String valueOf = String.valueOf(audy);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 18);
                        sb4.append("Caller Id Lookup: ");
                        sb4.append(valueOf);
                        audg4.mo50423b(sb4.toString());
                        aueg aueg = new aueg();
                        aueg.f91505p = this.f91594g;
                        auem auem = aueg.f91505p;
                        String str4 = "";
                        if (auem != null) {
                            try {
                                auek auek = ((audw) auem).f91452f.f91461a;
                                auek auek2 = ((audw) auem).f91455i.f91564a;
                                if (auek == null) {
                                    z2 = z;
                                } else {
                                    z2 = z;
                                    try {
                                        String valueOf2 = String.valueOf(auek.f91522a);
                                        if (valueOf2.length() == 0) {
                                            new String("Scifi preapre for ");
                                        } else {
                                            "Scifi preapre for ".concat(valueOf2);
                                        }
                                        aueg.f91491b = auek.f91522a;
                                    } catch (Exception e) {
                                        audv = null;
                                        da = bowk.f135143l.mo74144da();
                                        boolean z8 = aueg.f91494e;
                                        if (da.f164950c) {
                                        }
                                        bowk bowk2 = (bowk) da.f164949b;
                                        int i8 = bowk2.f135145a | 128;
                                        bowk2.f135145a = i8;
                                        bowk2.f135153i = z8;
                                        boolean z9 = aueg.f91495f;
                                        int i9 = i8 | 64;
                                        bowk2.f135145a = i9;
                                        bowk2.f135152h = z9;
                                        int i10 = aueg.f91497h;
                                        bowk2.f135145a = i9 | 512;
                                        bowk2.f135155k = i10;
                                        auec = ((audw) aueg.f91505p).f91454h;
                                        if (auec == null) {
                                        }
                                        if (da.f164950c) {
                                        }
                                        bowk bowk3 = (bowk) da.f164949b;
                                        str.getClass();
                                        int i11 = bowk3.f135145a | 1;
                                        bowk3.f135145a = i11;
                                        bowk3.f135146b = str;
                                        String str5 = aueg.f91491b;
                                        hashCode = str5.hashCode();
                                        if (hashCode != -334847909) {
                                        }
                                        c2 = 65535;
                                        if (c2 != 0) {
                                        }
                                        aueg.f91506q = bowk;
                                        if (audv != null) {
                                        }
                                        this.f91597j = i3;
                                        if (cgyd.f188020a.mo6606a().mo84735l()) {
                                        }
                                        this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                                        switch (this.f91597j) {
                                        }
                                        this.f91599l = i4;
                                        if (i4 != 2) {
                                        }
                                        if (cgyd.m147563f()) {
                                        }
                                        z3 = z2;
                                        if (cgyd.m147559b()) {
                                        }
                                        z4 = z7;
                                        if (!bqhy2.f140750e) {
                                        }
                                        String str6 = this.f91590c;
                                        int a6 = audq.m76830a(this.f91591d);
                                        int i12 = this.f91595h;
                                        int i13 = this.f91596i;
                                        int i14 = this.f91597j;
                                        int i15 = this.f91598k;
                                        a = bqih.m112867a(bqhy2.f140746a);
                                        if (a == 0) {
                                        }
                                        int a7 = bqii.m112868a(bqhy2.f140747b);
                                        audq.m76834a(context, str6, a6, i12, i13, i14, i15, a, a7 == 0 ? a7 : 1, r15, z4);
                                        audg audg5 = this.f91588a;
                                        StringBuilder sb5 = new StringBuilder(14);
                                        sb5.append("Is Spam: ");
                                        sb5.append(r15);
                                        audg5.mo50423b(sb5.toString());
                                        audg audg6 = this.f91588a;
                                        StringBuilder sb6 = new StringBuilder(15);
                                        sb6.append("Is Spoof: ");
                                        sb6.append(z4);
                                        audg6.mo50423b(sb6.toString());
                                        audg audg7 = this.f91588a;
                                        int i16 = this.f91598k;
                                        StringBuilder sb7 = new StringBuilder(31);
                                        sb7.append("Stir Shaken Result: ");
                                        sb7.append(i16);
                                        audg7.mo50423b(sb7.toString());
                                        audg audg8 = this.f91588a;
                                        int i17 = this.f91599l;
                                        StringBuilder sb8 = new StringBuilder(31);
                                        sb8.append("Final Scifi Result: ");
                                        sb8.append(i17);
                                        audg8.mo50423b(sb8.toString());
                                        audg audg9 = this.f91588a;
                                        int i18 = this.f91600o;
                                        StringBuilder sb9 = new StringBuilder(34);
                                        sb9.append("Final Patronus Status: ");
                                        sb9.append(i18);
                                        audg9.mo50423b(sb9.toString());
                                        this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(r15 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                                        return;
                                    }
                                }
                                if (aueg.f91491b.isEmpty()) {
                                    if (auek2 != null) {
                                        String a8 = auek2.mo50489a();
                                        if (a8.length() == 0) {
                                            new String("Scifi host from to: header ");
                                        } else {
                                            "Scifi host from to: header ".concat(a8);
                                        }
                                        String valueOf3 = String.valueOf(auek2.f91522a);
                                        if (valueOf3.length() == 0) {
                                            new String("carrier info from to: header ");
                                        } else {
                                            "carrier info from to: header ".concat(valueOf3);
                                        }
                                        aueg.f91491b = auek2.f91522a;
                                    }
                                }
                                if (aueg.f91491b.isEmpty()) {
                                    if (((audw) auem).f91458l != null && !networkOperatorName.equals("Fi") && !networkOperatorName.equals("Google Fi")) {
                                        aueg.f91491b = ((audw) auem).f91458l.f91481a;
                                        if (aueg.f91491b.isEmpty() && (aueq = ((audw) auem).f91457k) != null) {
                                            aueg.f91491b = aueq.f91567a;
                                        }
                                    }
                                }
                                if (!aueg.f91491b.isEmpty()) {
                                    aueg.f91504o = aueg.m76884a(aueg.f91491b, auem);
                                    auef auef = aueg.f91504o;
                                    if (auef != null && auef.mo50444a()) {
                                        aueg.f91499j = aueg.f91504o.mo50446c();
                                        audg audg10 = aueg.f91490a;
                                        String valueOf4 = String.valueOf(aueg.f91499j);
                                        audg10.mo50423b(valueOf4.length() == 0 ? new String("Scifi info detected carrier is : ") : "Scifi info detected carrier is : ".concat(valueOf4));
                                        aueg.f91492c = aueg.f91504o.mo50445b();
                                        aueg.f91495f = aueg.f91504o.mo50447d();
                                        aueg.f91500k = aueg.f91504o.mo50448e();
                                        if (((audw) auem).f91454h.f91476e) {
                                            aueg.f91497h = 4;
                                            StringBuilder sb10 = new StringBuilder(33);
                                            sb10.append("SciFi output: flag is ");
                                            sb10.append(4);
                                            sb10.toString();
                                        }
                                        if (!aueg.f91492c) {
                                            aueg.f91497h = 2;
                                            StringBuilder sb11 = new StringBuilder(33);
                                            sb11.append("SciFi output: flag is ");
                                            sb11.append(2);
                                            sb11.toString();
                                        } else if (aueg.f91495f) {
                                            aueg.f91497h = 5;
                                            aueg.f91500k = aueg.f91499j;
                                        } else if (aueg.f91500k.isEmpty()) {
                                            audy audy2 = new audy(bqhy2);
                                            if (audy2.f91466d) {
                                                if (audy2.f91463a) {
                                                    String str7 = audy2.f91464b;
                                                    aueg.f91500k = str7;
                                                    aueg.f91498i = audy2.f91465c;
                                                    if (str7.length() == 0) {
                                                        new String(" database carrier flag ");
                                                    } else {
                                                        " database carrier flag ".concat(str7);
                                                    }
                                                } else {
                                                    aueg.f91497h = 2;
                                                }
                                            }
                                        }
                                        aueg.f91507r = aueg.f91504o.mo50452i();
                                        if (aueg.f91507r.contains(aueg.f91500k)) {
                                            if (!aueg.f91499j.toLowerCase().equals(aueg.f91500k.toLowerCase())) {
                                                aueg.f91497h = 1;
                                            } else if (!aueg.f91495f) {
                                                aueg.f91497h = 6;
                                            }
                                        } else if (aueg.f91499j.toLowerCase().equals(aueg.f91500k.toLowerCase())) {
                                            aueg.f91497h = 6;
                                        }
                                        aueg.f91493d = aueg.f91504o.mo50450g();
                                        boolean h = aueg.f91504o.mo50451h();
                                        aueg.f91494e = h;
                                        if (h) {
                                            aueg.f91502m = aueg.f91504o.mo50449f();
                                            if (!aueg.f91502m.isEmpty()) {
                                                aueg.f91501l = audy.f91464b;
                                                aueg.f91496g = audy.f91465c;
                                                String str8 = aueg.f91502m;
                                                String str9 = aueg.f91501l;
                                                StringBuilder sb12 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                                                sb12.append("SciFi ");
                                                sb12.append(str8);
                                                sb12.append(" Call Forwarding carrier is ");
                                                sb12.append(str9);
                                                sb12.toString();
                                                if (!aueg.f91501l.equals("Verizon Wireless") && !aueg.f91501l.equals("AT&T") && aueg.f91497h == 1) {
                                                    aueg.f91497h = 0;
                                                }
                                            }
                                        }
                                        aueg.f91490a.mo50422a("SciFi output: owner is %s ", aueg.f91500k);
                                        Object[] objArr3 = {((audw) auem).f91454h.f91473b, aueg.f91499j, Boolean.valueOf(aueg.f91495f)};
                                        audg audg11 = aueg.f91490a;
                                        int i19 = aueg.f91497h;
                                        StringBuilder sb13 = new StringBuilder(33);
                                        sb13.append("SciFi output: flag is ");
                                        sb13.append(i19);
                                        audg11.mo50423b(sb13.toString());
                                        aueq aueq2 = ((audw) auem).f91457k;
                                        if (aueq2 != null) {
                                            aueg.f91503n = aueq2.toString();
                                        }
                                        String str10 = aueg.f91491b;
                                        int hashCode2 = str10.hashCode();
                                        if (hashCode2 != -334847909) {
                                            if (hashCode2 != 2018401) {
                                                if (hashCode2 == 624992363 && str10.equals("Verizon Wireless")) {
                                                    c3 = 2;
                                                    if (c3 == 0) {
                                                        if (c3 != 1) {
                                                            if (c3 == 2) {
                                                                if (!cgyd.f188020a.mo6606a().mo84729f()) {
                                                                }
                                                            }
                                                            aueh aueh = new aueh();
                                                            str2 = aueg.f91499j;
                                                            if (str2 == null) {
                                                                aueh.f91508a = str2;
                                                                String str11 = aueg.f91500k;
                                                                if (str11 != null) {
                                                                    aueh.f91510c = str11;
                                                                    String str12 = aueg.f91503n;
                                                                    if (str12 != null) {
                                                                        aueh.f91512e = str12;
                                                                        String str13 = aueg.f91501l;
                                                                        if (str13 != null) {
                                                                            aueh.f91516i = str13;
                                                                            String str14 = aueg.f91502m;
                                                                            if (str14 != null) {
                                                                                aueh.f91517j = str14;
                                                                                aueh.f91511d = Boolean.valueOf(aueg.f91493d);
                                                                                aueh.f91518k = Integer.valueOf(aueg.f91496g);
                                                                                aueh.f91513f = Integer.valueOf(aueg.f91498i);
                                                                                aueh.f91514g = Boolean.valueOf(aueg.f91494e);
                                                                                aueh.f91515h = false;
                                                                                aueh.f91509b = Integer.valueOf(aueg.f91497h);
                                                                                String str15 = aueh.f91508a == null ? " detectedCarrierName" : str4;
                                                                                if (aueh.f91509b == null) {
                                                                                    str15 = str15.concat(" resultType");
                                                                                }
                                                                                if (aueh.f91510c == null) {
                                                                                    str15 = String.valueOf(str15).concat(" phoneNumOwner");
                                                                                }
                                                                                if (aueh.f91511d == null) {
                                                                                    str15 = String.valueOf(str15).concat(" multiLine");
                                                                                }
                                                                                if (aueh.f91512e == null) {
                                                                                    str15 = String.valueOf(str15).concat(" userAgent");
                                                                                }
                                                                                if (aueh.f91513f == null) {
                                                                                    str15 = String.valueOf(str15).concat(" lineType");
                                                                                }
                                                                                if (aueh.f91514g == null) {
                                                                                    str15 = String.valueOf(str15).concat(" callForwarded");
                                                                                }
                                                                                if (aueh.f91515h == null) {
                                                                                    str15 = String.valueOf(str15).concat(" callForwardNumIsSpam");
                                                                                }
                                                                                if (aueh.f91516i == null) {
                                                                                    str15 = String.valueOf(str15).concat(" callForwardingCarrier");
                                                                                }
                                                                                if (aueh.f91517j == null) {
                                                                                    str15 = String.valueOf(str15).concat(" callForwardingNum");
                                                                                }
                                                                                if (aueh.f91518k == null) {
                                                                                    str15 = String.valueOf(str15).concat(" callForwardingLineType");
                                                                                }
                                                                                if (!str15.isEmpty()) {
                                                                                    String valueOf5 = String.valueOf(str15);
                                                                                    throw new IllegalStateException(valueOf5.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf5));
                                                                                }
                                                                                audv = new audv(aueh.f91508a, aueh.f91509b.intValue(), aueh.f91510c, aueh.f91511d.booleanValue(), aueh.f91512e, aueh.f91513f.intValue(), aueh.f91514g.booleanValue(), aueh.f91515h.booleanValue(), aueh.f91516i, aueh.f91517j, aueh.f91518k.intValue());
                                                                            } else {
                                                                                throw new NullPointerException("Null callForwardingNum");
                                                                            }
                                                                        } else {
                                                                            throw new NullPointerException("Null callForwardingCarrier");
                                                                        }
                                                                    } else {
                                                                        throw new NullPointerException("Null userAgent");
                                                                    }
                                                                } else {
                                                                    throw new NullPointerException("Null phoneNumOwner");
                                                                }
                                                            } else {
                                                                throw new NullPointerException("Null detectedCarrierName");
                                                            }
                                                        } else {
                                                            if (!cgyd.f188020a.mo6606a().mo84728e()) {
                                                            }
                                                            aueh aueh2 = new aueh();
                                                            str2 = aueg.f91499j;
                                                            if (str2 == null) {
                                                            }
                                                        }
                                                    }
                                                    aueg.f91491b = "Carrier Flag disabled";
                                                    audv = null;
                                                }
                                            } else if (str10.equals("AT&T")) {
                                                c3 = 0;
                                                if (c3 == 0) {
                                                }
                                                aueg.f91491b = "Carrier Flag disabled";
                                                audv = null;
                                            }
                                        } else if (str10.equals("T-Mobile")) {
                                            c3 = 1;
                                            if (c3 == 0) {
                                            }
                                            aueg.f91491b = "Carrier Flag disabled";
                                            audv = null;
                                        }
                                        c3 = 65535;
                                        if (c3 == 0) {
                                        }
                                        aueg.f91491b = "Carrier Flag disabled";
                                        audv = null;
                                    }
                                } else {
                                    aueg.f91491b = "UNSUPPORTED";
                                }
                                audv = null;
                            } catch (Exception e2) {
                                z2 = z;
                                audv = null;
                                da = bowk.f135143l.mo74144da();
                                boolean z82 = aueg.f91494e;
                                if (da.f164950c) {
                                }
                                bowk bowk22 = (bowk) da.f164949b;
                                int i82 = bowk22.f135145a | 128;
                                bowk22.f135145a = i82;
                                bowk22.f135153i = z82;
                                boolean z92 = aueg.f91495f;
                                int i92 = i82 | 64;
                                bowk22.f135145a = i92;
                                bowk22.f135152h = z92;
                                int i102 = aueg.f91497h;
                                bowk22.f135145a = i92 | 512;
                                bowk22.f135155k = i102;
                                auec = ((audw) aueg.f91505p).f91454h;
                                if (auec == null) {
                                }
                                if (da.f164950c) {
                                }
                                bowk bowk32 = (bowk) da.f164949b;
                                str.getClass();
                                int i112 = bowk32.f135145a | 1;
                                bowk32.f135145a = i112;
                                bowk32.f135146b = str;
                                String str52 = aueg.f91491b;
                                hashCode = str52.hashCode();
                                if (hashCode != -334847909) {
                                }
                                c2 = 65535;
                                if (c2 != 0) {
                                }
                                aueg.f91506q = bowk;
                                if (audv != null) {
                                }
                                this.f91597j = i3;
                                if (cgyd.f188020a.mo6606a().mo84735l()) {
                                }
                                this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                                switch (this.f91597j) {
                                }
                                this.f91599l = i4;
                                if (i4 != 2) {
                                }
                                if (cgyd.m147563f()) {
                                }
                                z3 = z2;
                                if (cgyd.m147559b()) {
                                }
                                z4 = z7;
                                if (!bqhy2.f140750e) {
                                }
                                String str62 = this.f91590c;
                                int a62 = audq.m76830a(this.f91591d);
                                int i122 = this.f91595h;
                                int i132 = this.f91596i;
                                int i142 = this.f91597j;
                                int i152 = this.f91598k;
                                a = bqih.m112867a(bqhy2.f140746a);
                                if (a == 0) {
                                }
                                int a72 = bqii.m112868a(bqhy2.f140747b);
                                audq.m76834a(context, str62, a62, i122, i132, i142, i152, a, a72 == 0 ? a72 : 1, r15, z4);
                                audg audg52 = this.f91588a;
                                StringBuilder sb52 = new StringBuilder(14);
                                sb52.append("Is Spam: ");
                                sb52.append(r15);
                                audg52.mo50423b(sb52.toString());
                                audg audg62 = this.f91588a;
                                StringBuilder sb62 = new StringBuilder(15);
                                sb62.append("Is Spoof: ");
                                sb62.append(z4);
                                audg62.mo50423b(sb62.toString());
                                audg audg72 = this.f91588a;
                                int i162 = this.f91598k;
                                StringBuilder sb72 = new StringBuilder(31);
                                sb72.append("Stir Shaken Result: ");
                                sb72.append(i162);
                                audg72.mo50423b(sb72.toString());
                                audg audg82 = this.f91588a;
                                int i172 = this.f91599l;
                                StringBuilder sb82 = new StringBuilder(31);
                                sb82.append("Final Scifi Result: ");
                                sb82.append(i172);
                                audg82.mo50423b(sb82.toString());
                                audg audg92 = this.f91588a;
                                int i182 = this.f91600o;
                                StringBuilder sb92 = new StringBuilder(34);
                                sb92.append("Final Patronus Status: ");
                                sb92.append(i182);
                                audg92.mo50423b(sb92.toString());
                                this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(r15 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                                return;
                            }
                        } else {
                            z2 = z;
                            audv = null;
                        }
                        da = bowk.f135143l.mo74144da();
                        boolean z822 = aueg.f91494e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bowk bowk222 = (bowk) da.f164949b;
                        int i822 = bowk222.f135145a | 128;
                        bowk222.f135145a = i822;
                        bowk222.f135153i = z822;
                        boolean z922 = aueg.f91495f;
                        int i922 = i822 | 64;
                        bowk222.f135145a = i922;
                        bowk222.f135152h = z922;
                        int i1022 = aueg.f91497h;
                        bowk222.f135145a = i922 | 512;
                        bowk222.f135155k = i1022;
                        auec = ((audw) aueg.f91505p).f91454h;
                        if (auec == null) {
                            str = str4;
                        } else {
                            str = auec.toString();
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bowk bowk322 = (bowk) da.f164949b;
                        str.getClass();
                        int i1122 = bowk322.f135145a | 1;
                        bowk322.f135145a = i1122;
                        bowk322.f135146b = str;
                        String str522 = aueg.f91491b;
                        hashCode = str522.hashCode();
                        if (hashCode != -334847909) {
                            if (hashCode != 0) {
                                if (hashCode != 2018401) {
                                    if (hashCode == 624992363 && str522.equals("Verizon Wireless")) {
                                        c2 = 1;
                                        if (c2 != 0) {
                                            if (c2 == 1) {
                                                "Verizon Wireless".getClass();
                                                int i20 = i1122 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                bowk322.f135145a = i20;
                                                bowk322.f135154j = "Verizon Wireless";
                                                audw audw = (audw) aueg.f91505p;
                                                String str16 = audw.f91455i.f91565b;
                                                str16.getClass();
                                                int i21 = i20 | 2;
                                                bowk322.f135145a = i21;
                                                bowk322.f135147c = str16;
                                                int i22 = audw.f91449c;
                                                bowk322.f135145a = i21 | 8;
                                                bowk322.f135149e = i22;
                                            } else if (c2 == 2) {
                                                "AT&T".getClass();
                                                int i23 = i1122 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                bowk322.f135145a = i23;
                                                bowk322.f135154j = "AT&T";
                                                audw audw2 = (audw) aueg.f91505p;
                                                String str17 = audw2.f91455i.f91565b;
                                                str17.getClass();
                                                int i24 = i23 | 2;
                                                bowk322.f135145a = i24;
                                                bowk322.f135147c = str17;
                                                int i25 = audw2.f91449c;
                                                bowk322.f135145a = i24 | 8;
                                                bowk322.f135149e = i25;
                                                int parseInt = Integer.parseInt((String) audw2.f91447a.get("max-forwards"));
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bowk bowk4 = (bowk) da.f164949b;
                                                bowk4.f135145a |= 16;
                                                bowk4.f135150f = parseInt;
                                            } else if (c2 == 3) {
                                                "T-Mobile".getClass();
                                                int i26 = i1122 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                                                bowk322.f135145a = i26;
                                                bowk322.f135154j = "T-Mobile";
                                                audw audw3 = (audw) aueg.f91505p;
                                                String str18 = audw3.f91455i.f91565b;
                                                str18.getClass();
                                                int i27 = i26 | 2;
                                                bowk322.f135145a = i27;
                                                bowk322.f135147c = str18;
                                                int i28 = audw3.f91449c;
                                                bowk322.f135145a = i27 | 8;
                                                bowk322.f135149e = i28;
                                                aueq aueq3 = audw3.f91457k;
                                                if (aueq3 != null) {
                                                    str4 = aueq3.toString();
                                                }
                                                if (da.f164950c) {
                                                    da.mo74035c();
                                                    da.f164950c = false;
                                                }
                                                bowk bowk5 = (bowk) da.f164949b;
                                                str4.getClass();
                                                bowk5.f135145a |= 32;
                                                bowk5.f135151g = str4;
                                            }
                                            bowk = (bowk) da.mo74062i();
                                        } else {
                                            bowk = bowk.f135143l;
                                        }
                                        aueg.f91506q = bowk;
                                        if (audv != null) {
                                            int i29 = audv.f91436a;
                                            StringBuilder sb14 = new StringBuilder(25);
                                            sb14.append(" Scifi result ");
                                            sb14.append(i29);
                                            sb14.toString();
                                            i3 = audv.f91436a;
                                        } else {
                                            i3 = 0;
                                        }
                                        this.f91597j = i3;
                                        if (cgyd.f188020a.mo6606a().mo84735l()) {
                                            audj.m76808a(context);
                                            String str19 = this.f91589b;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            bowk bowk6 = aueg.f91506q;
                                            try {
                                                SQLiteDatabase writableDatabase = audj.f91417a.getWritableDatabase();
                                                ContentValues contentValues = new ContentValues();
                                                contentValues.put("number", str19);
                                                contentValues.put("timestamp", Long.valueOf(currentTimeMillis));
                                                contentValues.put("result", Integer.valueOf(bowk6.f135155k));
                                                contentValues.put("p_asserted_identity", bowk6.f135146b);
                                                contentValues.put("to_hostname", bowk6.f135147c);
                                                contentValues.put("from_header", bowk6.f135148d);
                                                contentValues.put("content_length", Integer.valueOf(bowk6.f135149e));
                                                contentValues.put("max_forwards", Integer.valueOf(bowk6.f135150f));
                                                contentValues.put("user_agent", bowk6.f135151g);
                                                contentValues.put("is_ims", Boolean.valueOf(bowk6.f135152h));
                                                contentValues.put("is_forwarded", Boolean.valueOf(bowk6.f135153i));
                                                contentValues.put("carrier", bowk6.f135154j);
                                                writableDatabase.insertWithOnConflict("sip_header_table", null, contentValues, 5);
                                            } catch (SQLiteException e3) {
                                            }
                                        }
                                        this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                                        switch (this.f91597j) {
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 8:
                                                i4 = 2;
                                                break;
                                            case 4:
                                            default:
                                                i4 = 0;
                                                break;
                                            case 5:
                                            case 6:
                                            case 7:
                                                i4 = 1;
                                                break;
                                        }
                                        this.f91599l = i4;
                                        if (i4 != 2) {
                                            z7 = false;
                                        } else {
                                            z7 = true;
                                        }
                                    }
                                } else if (str522.equals("AT&T")) {
                                    c2 = 2;
                                    if (c2 != 0) {
                                    }
                                    aueg.f91506q = bowk;
                                    if (audv != null) {
                                    }
                                    this.f91597j = i3;
                                    if (cgyd.f188020a.mo6606a().mo84735l()) {
                                    }
                                    this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                                    switch (this.f91597j) {
                                    }
                                    this.f91599l = i4;
                                    if (i4 != 2) {
                                    }
                                }
                            } else if (str522.equals(str4)) {
                                c2 = 0;
                                if (c2 != 0) {
                                }
                                aueg.f91506q = bowk;
                                if (audv != null) {
                                }
                                this.f91597j = i3;
                                if (cgyd.f188020a.mo6606a().mo84735l()) {
                                }
                                this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                                switch (this.f91597j) {
                                }
                                this.f91599l = i4;
                                if (i4 != 2) {
                                }
                            }
                        } else if (str522.equals("T-Mobile")) {
                            c2 = 3;
                            if (c2 != 0) {
                            }
                            aueg.f91506q = bowk;
                            if (audv != null) {
                            }
                            this.f91597j = i3;
                            if (cgyd.f188020a.mo6606a().mo84735l()) {
                            }
                            this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                            switch (this.f91597j) {
                            }
                            this.f91599l = i4;
                            if (i4 != 2) {
                            }
                        }
                        c2 = 65535;
                        if (c2 != 0) {
                        }
                        aueg.f91506q = bowk;
                        if (audv != null) {
                        }
                        this.f91597j = i3;
                        if (cgyd.f188020a.mo6606a().mo84735l()) {
                        }
                        this.f91588a.mo50422a("ScifiCore result: %d", Integer.valueOf(this.f91597j));
                        switch (this.f91597j) {
                        }
                        this.f91599l = i4;
                        if (i4 != 2) {
                        }
                    }
                    if (cgyd.m147563f()) {
                        if (cgyd.f188020a.mo6606a().mo84725b()) {
                            TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                            audg audg12 = this.f91588a;
                            boolean isNetworkRoaming = telephonyManager.isNetworkRoaming();
                            StringBuilder sb15 = new StringBuilder(23);
                            sb15.append("isNetworkRoaming: ");
                            sb15.append(isNetworkRoaming);
                            audg12.mo50423b(sb15.toString());
                        }
                        if (!z2) {
                            String valueOf6 = String.valueOf(cgyd.m147564g());
                            if (valueOf6.length() == 0) {
                                new String("getStirShakenSipHeader flag: ");
                            } else {
                                "getStirShakenSipHeader flag: ".concat(valueOf6);
                            }
                            if (cgyd.m147564g().equals("TN-Validation-Passed")) {
                                this.f91598k = 1;
                                i2 = 1;
                            } else if (cgyd.m147564g().equals("TN-Validation-Failed")) {
                                this.f91598k = 2;
                                i2 = 2;
                            } else if (cgyd.m147564g().equals("No-TN-Validation")) {
                                this.f91598k = 0;
                                i2 = 0;
                            } else if (this.f91594g == null && !m76949a()) {
                                z3 = false;
                            } else {
                                new aueg();
                                audw audw4 = (audw) this.f91594g;
                                if (audw4.f91454h.mo50485a() == 2 || audw4.f91456j.mo50484a() == 2) {
                                    aueg.f91490a.mo50423b("STIR/Shaken verstat result: TN_VALIDATION_PASS");
                                    c = 1;
                                } else if (audw4.f91454h.mo50485a() == 3 || audw4.f91456j.mo50484a() == 3) {
                                    aueg.f91490a.mo50423b("STIR/Shaken verstat result: TN_VALIDATION_FAIL");
                                    c = 2;
                                } else {
                                    c = 0;
                                }
                                i2 = c != 1 ? c != 2 ? 0 : 2 : 1;
                                this.f91598k = i2;
                            }
                            audg audg13 = this.f91588a;
                            StringBuilder sb16 = new StringBuilder(54);
                            sb16.append("getStirShakenSipHeader Stir Shaken Result: ");
                            sb16.append(i2);
                            audg13.mo50423b(sb16.toString());
                            z3 = this.f91598k == 2;
                        } else {
                            z3 = true;
                        }
                        if (cgyd.m147559b() && this.f91593f) {
                            if (!z3) {
                                int a9 = bqih.m112867a(bqhy2.f140746a);
                                if (a9 == 0) {
                                    z5 = false;
                                } else if (a9 != 3) {
                                    z5 = false;
                                }
                                if (!z7) {
                                    int a10 = bqii.m112868a(bqhy2.f140747b);
                                    if (a10 == 0) {
                                        z6 = false;
                                    } else if (a10 != 3) {
                                        z6 = false;
                                    }
                                    a2 = bqih.m112867a(bqhy2.f140746a);
                                    if (a2 == 0) {
                                        a2 = 1;
                                    }
                                    i = a2 - 2;
                                    if (i != 1) {
                                        this.f91600o = 2;
                                    } else if (i != 2) {
                                        this.f91600o = 0;
                                    } else {
                                        this.f91600o = 1;
                                    }
                                    z3 = z5;
                                    z4 = z6;
                                }
                                z6 = true;
                                a2 = bqih.m112867a(bqhy2.f140746a);
                                if (a2 == 0) {
                                }
                                i = a2 - 2;
                                if (i != 1) {
                                }
                                z3 = z5;
                                z4 = z6;
                            }
                            z5 = true;
                            if (!z7) {
                            }
                            z6 = true;
                            a2 = bqih.m112867a(bqhy2.f140746a);
                            if (a2 == 0) {
                            }
                            i = a2 - 2;
                            if (i != 1) {
                            }
                            z3 = z5;
                            z4 = z6;
                        } else {
                            z4 = z7;
                        }
                        boolean z10 = (!bqhy2.f140750e || cgyd.f188020a.mo6606a().mo84737n()) ? z3 || z4 : z3;
                        String str622 = this.f91590c;
                        int a622 = audq.m76830a(this.f91591d);
                        int i1222 = this.f91595h;
                        int i1322 = this.f91596i;
                        int i1422 = this.f91597j;
                        int i1522 = this.f91598k;
                        a = bqih.m112867a(bqhy2.f140746a);
                        if (a == 0) {
                            a = 1;
                        }
                        int a722 = bqii.m112868a(bqhy2.f140747b);
                        audq.m76834a(context, str622, a622, i1222, i1322, i1422, i1522, a, a722 == 0 ? a722 : 1, z10, z4);
                        audg audg522 = this.f91588a;
                        StringBuilder sb522 = new StringBuilder(14);
                        sb522.append("Is Spam: ");
                        sb522.append(z10);
                        audg522.mo50423b(sb522.toString());
                        audg audg622 = this.f91588a;
                        StringBuilder sb622 = new StringBuilder(15);
                        sb622.append("Is Spoof: ");
                        sb622.append(z4);
                        audg622.mo50423b(sb622.toString());
                        audg audg722 = this.f91588a;
                        int i1622 = this.f91598k;
                        StringBuilder sb722 = new StringBuilder(31);
                        sb722.append("Stir Shaken Result: ");
                        sb722.append(i1622);
                        audg722.mo50423b(sb722.toString());
                        audg audg822 = this.f91588a;
                        int i1722 = this.f91599l;
                        StringBuilder sb822 = new StringBuilder(31);
                        sb822.append("Final Scifi Result: ");
                        sb822.append(i1722);
                        audg822.mo50423b(sb822.toString());
                        audg audg922 = this.f91588a;
                        int i1822 = this.f91600o;
                        StringBuilder sb922 = new StringBuilder(34);
                        sb922.append("Final Patronus Status: ");
                        sb922.append(i1822);
                        audg922.mo50423b(sb922.toString());
                        this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(z10 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                        return;
                    }
                    z3 = z2;
                    if (cgyd.m147559b()) {
                        if (!z3) {
                        }
                        z5 = true;
                        if (!z7) {
                        }
                        z6 = true;
                        a2 = bqih.m112867a(bqhy2.f140746a);
                        if (a2 == 0) {
                        }
                        i = a2 - 2;
                        if (i != 1) {
                        }
                        z3 = z5;
                        z4 = z6;
                        if (!bqhy2.f140750e) {
                        }
                        if (z3) {
                            String str6222 = this.f91590c;
                            int a6222 = audq.m76830a(this.f91591d);
                            int i12222 = this.f91595h;
                            int i13222 = this.f91596i;
                            int i14222 = this.f91597j;
                            int i15222 = this.f91598k;
                            a = bqih.m112867a(bqhy2.f140746a);
                            if (a == 0) {
                            }
                            int a7222 = bqii.m112868a(bqhy2.f140747b);
                            audq.m76834a(context, str6222, a6222, i12222, i13222, i14222, i15222, a, a7222 == 0 ? a7222 : 1, z10, z4);
                            audg audg5222 = this.f91588a;
                            StringBuilder sb5222 = new StringBuilder(14);
                            sb5222.append("Is Spam: ");
                            sb5222.append(z10);
                            audg5222.mo50423b(sb5222.toString());
                            audg audg6222 = this.f91588a;
                            StringBuilder sb6222 = new StringBuilder(15);
                            sb6222.append("Is Spoof: ");
                            sb6222.append(z4);
                            audg6222.mo50423b(sb6222.toString());
                            audg audg7222 = this.f91588a;
                            int i16222 = this.f91598k;
                            StringBuilder sb7222 = new StringBuilder(31);
                            sb7222.append("Stir Shaken Result: ");
                            sb7222.append(i16222);
                            audg7222.mo50423b(sb7222.toString());
                            audg audg8222 = this.f91588a;
                            int i17222 = this.f91599l;
                            StringBuilder sb8222 = new StringBuilder(31);
                            sb8222.append("Final Scifi Result: ");
                            sb8222.append(i17222);
                            audg8222.mo50423b(sb8222.toString());
                            audg audg9222 = this.f91588a;
                            int i18222 = this.f91600o;
                            StringBuilder sb9222 = new StringBuilder(34);
                            sb9222.append("Final Patronus Status: ");
                            sb9222.append(i18222);
                            audg9222.mo50423b(sb9222.toString());
                            this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(z10 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                            return;
                        }
                        String str62222 = this.f91590c;
                        int a62222 = audq.m76830a(this.f91591d);
                        int i122222 = this.f91595h;
                        int i132222 = this.f91596i;
                        int i142222 = this.f91597j;
                        int i152222 = this.f91598k;
                        a = bqih.m112867a(bqhy2.f140746a);
                        if (a == 0) {
                        }
                        int a72222 = bqii.m112868a(bqhy2.f140747b);
                        audq.m76834a(context, str62222, a62222, i122222, i132222, i142222, i152222, a, a72222 == 0 ? a72222 : 1, z10, z4);
                        audg audg52222 = this.f91588a;
                        StringBuilder sb52222 = new StringBuilder(14);
                        sb52222.append("Is Spam: ");
                        sb52222.append(z10);
                        audg52222.mo50423b(sb52222.toString());
                        audg audg62222 = this.f91588a;
                        StringBuilder sb62222 = new StringBuilder(15);
                        sb62222.append("Is Spoof: ");
                        sb62222.append(z4);
                        audg62222.mo50423b(sb62222.toString());
                        audg audg72222 = this.f91588a;
                        int i162222 = this.f91598k;
                        StringBuilder sb72222 = new StringBuilder(31);
                        sb72222.append("Stir Shaken Result: ");
                        sb72222.append(i162222);
                        audg72222.mo50423b(sb72222.toString());
                        audg audg82222 = this.f91588a;
                        int i172222 = this.f91599l;
                        StringBuilder sb82222 = new StringBuilder(31);
                        sb82222.append("Final Scifi Result: ");
                        sb82222.append(i172222);
                        audg82222.mo50423b(sb82222.toString());
                        audg audg92222 = this.f91588a;
                        int i182222 = this.f91600o;
                        StringBuilder sb92222 = new StringBuilder(34);
                        sb92222.append("Final Patronus Status: ");
                        sb92222.append(i182222);
                        audg92222.mo50423b(sb92222.toString());
                        this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(z10 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                        return;
                    }
                    z4 = z7;
                    if (!bqhy2.f140750e) {
                    }
                    String str622222 = this.f91590c;
                    int a622222 = audq.m76830a(this.f91591d);
                    int i1222222 = this.f91595h;
                    int i1322222 = this.f91596i;
                    int i1422222 = this.f91597j;
                    int i1522222 = this.f91598k;
                    a = bqih.m112867a(bqhy2.f140746a);
                    if (a == 0) {
                    }
                    int a722222 = bqii.m112868a(bqhy2.f140747b);
                    audq.m76834a(context, str622222, a622222, i1222222, i1322222, i1422222, i1522222, a, a722222 == 0 ? a722222 : 1, z10, z4);
                    audg audg522222 = this.f91588a;
                    StringBuilder sb522222 = new StringBuilder(14);
                    sb522222.append("Is Spam: ");
                    sb522222.append(z10);
                    audg522222.mo50423b(sb522222.toString());
                    audg audg622222 = this.f91588a;
                    StringBuilder sb622222 = new StringBuilder(15);
                    sb622222.append("Is Spoof: ");
                    sb622222.append(z4);
                    audg622222.mo50423b(sb622222.toString());
                    audg audg722222 = this.f91588a;
                    int i1622222 = this.f91598k;
                    StringBuilder sb722222 = new StringBuilder(31);
                    sb722222.append("Stir Shaken Result: ");
                    sb722222.append(i1622222);
                    audg722222.mo50423b(sb722222.toString());
                    audg audg822222 = this.f91588a;
                    int i1722222 = this.f91599l;
                    StringBuilder sb822222 = new StringBuilder(31);
                    sb822222.append("Final Scifi Result: ");
                    sb822222.append(i1722222);
                    audg822222.mo50423b(sb822222.toString());
                    audg audg922222 = this.f91588a;
                    int i1822222 = this.f91600o;
                    StringBuilder sb922222 = new StringBuilder(34);
                    sb922222.append("Final Patronus Status: ");
                    sb922222.append(i1822222);
                    audg922222.mo50423b(sb922222.toString());
                    this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(z10 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                    return;
                }
            } else if (i7 == 1) {
                z = true;
                audg audg32 = this.f91588a;
                StringBuilder sb32 = new StringBuilder(25);
                sb32.append("Spam Lookup Result: ");
                sb32.append(z);
                audg32.mo50423b(sb32.toString());
                if (!cgyd.m147562e()) {
                }
                if (cgyd.m147563f()) {
                }
                z3 = z2;
                if (cgyd.m147559b()) {
                }
                z4 = z7;
                if (!bqhy2.f140750e) {
                }
                String str6222222 = this.f91590c;
                int a6222222 = audq.m76830a(this.f91591d);
                int i12222222 = this.f91595h;
                int i13222222 = this.f91596i;
                int i14222222 = this.f91597j;
                int i15222222 = this.f91598k;
                a = bqih.m112867a(bqhy2.f140746a);
                if (a == 0) {
                }
                int a7222222 = bqii.m112868a(bqhy2.f140747b);
                audq.m76834a(context, str6222222, a6222222, i12222222, i13222222, i14222222, i15222222, a, a7222222 == 0 ? a7222222 : 1, z10, z4);
                audg audg5222222 = this.f91588a;
                StringBuilder sb5222222 = new StringBuilder(14);
                sb5222222.append("Is Spam: ");
                sb5222222.append(z10);
                audg5222222.mo50423b(sb5222222.toString());
                audg audg6222222 = this.f91588a;
                StringBuilder sb6222222 = new StringBuilder(15);
                sb6222222.append("Is Spoof: ");
                sb6222222.append(z4);
                audg6222222.mo50423b(sb6222222.toString());
                audg audg7222222 = this.f91588a;
                int i16222222 = this.f91598k;
                StringBuilder sb7222222 = new StringBuilder(31);
                sb7222222.append("Stir Shaken Result: ");
                sb7222222.append(i16222222);
                audg7222222.mo50423b(sb7222222.toString());
                audg audg8222222 = this.f91588a;
                int i17222222 = this.f91599l;
                StringBuilder sb8222222 = new StringBuilder(31);
                sb8222222.append("Final Scifi Result: ");
                sb8222222.append(i17222222);
                audg8222222.mo50423b(sb8222222.toString());
                audg audg9222222 = this.f91588a;
                int i18222222 = this.f91600o;
                StringBuilder sb9222222 = new StringBuilder(34);
                sb9222222.append("Final Patronus Status: ");
                sb9222222.append(i18222222);
                audg9222222.mo50423b(sb9222222.toString());
                this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(z10 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
                return;
            }
            z = false;
            audg audg322 = this.f91588a;
            StringBuilder sb322 = new StringBuilder(25);
            sb322.append("Spam Lookup Result: ");
            sb322.append(z);
            audg322.mo50423b(sb322.toString());
            if (!cgyd.m147562e()) {
            }
            if (cgyd.m147563f()) {
            }
            z3 = z2;
            if (cgyd.m147559b()) {
            }
            z4 = z7;
            if (!bqhy2.f140750e) {
            }
            String str62222222 = this.f91590c;
            int a62222222 = audq.m76830a(this.f91591d);
            int i122222222 = this.f91595h;
            int i132222222 = this.f91596i;
            int i142222222 = this.f91597j;
            int i152222222 = this.f91598k;
            a = bqih.m112867a(bqhy2.f140746a);
            if (a == 0) {
            }
            int a72222222 = bqii.m112868a(bqhy2.f140747b);
            audq.m76834a(context, str62222222, a62222222, i122222222, i132222222, i142222222, i152222222, a, a72222222 == 0 ? a72222222 : 1, z10, z4);
            audg audg52222222 = this.f91588a;
            StringBuilder sb52222222 = new StringBuilder(14);
            sb52222222.append("Is Spam: ");
            sb52222222.append(z10);
            audg52222222.mo50423b(sb52222222.toString());
            audg audg62222222 = this.f91588a;
            StringBuilder sb62222222 = new StringBuilder(15);
            sb62222222.append("Is Spoof: ");
            sb62222222.append(z4);
            audg62222222.mo50423b(sb62222222.toString());
            audg audg72222222 = this.f91588a;
            int i162222222 = this.f91598k;
            StringBuilder sb72222222 = new StringBuilder(31);
            sb72222222.append("Stir Shaken Result: ");
            sb72222222.append(i162222222);
            audg72222222.mo50423b(sb72222222.toString());
            audg audg82222222 = this.f91588a;
            int i172222222 = this.f91599l;
            StringBuilder sb82222222 = new StringBuilder(31);
            sb82222222.append("Final Scifi Result: ");
            sb82222222.append(i172222222);
            audg82222222.mo50423b(sb82222222.toString());
            audg audg92222222 = this.f91588a;
            int i182222222 = this.f91600o;
            StringBuilder sb92222222 = new StringBuilder(34);
            sb92222222.append("Final Patronus Status: ");
            sb92222222.append(i182222222);
            audg92222222.mo50423b(sb92222222.toString());
            this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(z10 ? 1 : 2, z4 ? 5 : 6, this.f91598k, this.f91599l, this.f91600o));
            return;
        }
        this.f91601p.mo50431a(Status.f30107a, new SpamLookupResult(this.f91598k, this.f91599l));
        this.f91588a.mo50423b("Phone number is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        audg audg = this.f91588a;
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("onFailure: status: ");
        sb.append(valueOf);
        audg.mo50425c(sb.toString());
        this.f91601p.mo50431a(status, new SpamLookupResult(this.f91598k, this.f91599l));
    }
}
