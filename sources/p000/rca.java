package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: rca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rca extends aaab {

    /* renamed from: a */
    static final Integer f42609a = 2;

    /* renamed from: b */
    static final Integer f42610b = 3;

    /* renamed from: c */
    private static final byte[][] f42611c = new byte[0][];

    /* renamed from: d */
    private static final String[] f42612d = new String[0];

    /* renamed from: e */
    private static final ExperimentTokens f42613e;

    /* renamed from: f */
    private static final Integer f42614f = 0;

    /* renamed from: g */
    private static final Integer f42615g = 1;

    /* renamed from: h */
    private static final Map f42616h;

    /* renamed from: i */
    private static final bmyx f42617i = bmyx.m108640a(',');

    /* renamed from: j */
    private static final bmyx f42618j = bmyx.m108640a(':');

    /* renamed from: k */
    private static String f42619k = "";

    /* renamed from: l */
    private static Map f42620l = Collections.emptyMap();

    /* renamed from: o */
    private final rbg f42621o;

    /* renamed from: p */
    private final LogEventParcelable f42622p;

    /* renamed from: q */
    private final rdq f42623q;

    /* renamed from: r */
    private final ModuleManager f42624r;

    /* renamed from: s */
    private final String f42625s;

    /* renamed from: t */
    private final rbu f42626t;

    /* renamed from: u */
    private final qwp f42627u;

    static {
        byte[][] bArr = f42611c;
        f42613e = new ExperimentTokens("", null, bArr, bArr, bArr, bArr, new int[]{14900290}, null, null);
        Integer num = f42614f;
        Integer num2 = f42615g;
        Integer num3 = f42609a;
        Map b = sqw.m36043b(4, false);
        b.put("NONE", num);
        b.put("NO_IDS", num2);
        b.put("NO_USER_IDS", num3);
        b.put("ALL_ON", 3);
        f42616h = Collections.unmodifiableMap(b);
    }

    public rca(rbg rbg, LogEventParcelable logEventParcelable, rdq rdq, ModuleManager moduleManager, String str, rbu rbu, qwp qwp) {
        super(40, "LogOperation");
        this.f42621o = rbg;
        this.f42622p = logEventParcelable;
        this.f42623q = rdq;
        this.f42624r = moduleManager;
        this.f42625s = str;
        this.f42626t = rbu;
        this.f42627u = qwp;
    }

    /* renamed from: a */
    public static rbz m33323a(Context context, LogEventParcelable logEventParcelable) {
        Context context2 = context;
        LogEventParcelable logEventParcelable2 = logEventParcelable;
        cagi cagi = logEventParcelable2.f30039j;
        int c = bxuk.m123643c(cagi);
        long c2 = cddx.m132739c();
        if (((long) c) <= c2) {
            byte[] bArr = new byte[c];
            bxuk a = bxuk.m123637a(bArr);
            a.mo73839a(cagi);
            if (a.mo73827a() == 0) {
                logEventParcelable2.f30031b = bArr;
                rca rca = new rca(null, logEventParcelable, null, ModuleManager.get(context), context.getPackageName(), new rbu(context2), null);
                anfg a2 = anfg.m64152a(context);
                caik a3 = rca.mo24456a(context2, logEventParcelable2.f30030a, a2);
                String[] strArr = logEventParcelable2.f30033d;
                int[] iArr = logEventParcelable2.f30034e;
                byte[][] bArr2 = logEventParcelable2.f30035f;
                ExperimentTokens[] experimentTokensArr = logEventParcelable2.f30036g;
                boolean z = logEventParcelable2.f30037h;
                String a4 = rer.m33481a(logEventParcelable2.f30030a);
                PlayLoggerContext playLoggerContext = logEventParcelable2.f30030a;
                return new rbz(a3, rca.mo24455a(context, logEventParcelable2.f30031b, new int[0], new int[0], strArr, iArr, bArr2, experimentTokensArr, z, a4, playLoggerContext.f30049h, playLoggerContext.f30045d, null, a2));
            }
            int a5 = a.mo73827a();
            StringBuilder sb = new StringBuilder(53);
            sb.append("Could not serialize proto: spaceLeft=");
            sb.append(a5);
            sb.append(" != 0");
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("Log entry exceeds size limits: ");
        sb2.append(c);
        sb2.append(" > ");
        sb2.append(c2);
        throw new IOException(sb2.toString());
    }

    /* renamed from: a */
    static final void m33324a(Context context, bxvd bxvd, anfg anfg) {
        long j;
        if (cdds.m132722b()) {
            try {
                j = ((Long) aucu.m76783a(anef.m64089a(context).mo41757a(), cddj.m132688b(), TimeUnit.MILLISECONDS)).longValue();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.e("LogOperation", "Failed to get heterodyne serving version.", e);
                j = 0;
            }
        } else {
            j = anfh.m64155a(anfg);
        }
        if (j != 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            caik caik = (caik) bxvd.f164949b;
            caik caik2 = caik.f174711o;
            caik.f174713a |= 4096;
            caik.f174725m = j;
        }
    }

    /* renamed from: a */
    private static void m33325a(rdp rdp, String str, rdm rdm) {
        try {
            rdp.mo24484a(str, rdm, 1);
        } catch (SQLiteException | IOException e) {
            String valueOf = String.valueOf(rdm);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(valueOf).length());
            sb.append("Failed to record log drop for source: ");
            sb.append(str);
            sb.append(" and reason: ");
            sb.append(valueOf);
            Log.e("LogOperation", sb.toString());
        }
    }

    /* renamed from: a */
    static int[] m33326a(int[] iArr, int[] iArr2) {
        int length;
        int length2;
        if (iArr == null || (length = iArr.length) == 0) {
            return iArr2;
        }
        if (iArr2 == null || (length2 = iArr2.length) == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x023a  */
    /* renamed from: a */
    public final bxtx mo24455a(Context context, byte[] bArr, int[] iArr, int[] iArr2, String[] strArr, int[] iArr3, byte[][] bArr2, ExperimentTokens[] experimentTokensArr, boolean z, String str, boolean z2, String str2, String str3, anfg anfg) {
        ArrayList arrayList;
        List list;
        ExperimentTokens experimentTokens;
        String[] strArr2;
        ArrayList arrayList2;
        int length;
        int i;
        int i2;
        int i3;
        ArrayList arrayList3;
        byte[][] bArr3 = bArr2;
        ExperimentTokens[] experimentTokensArr2 = experimentTokensArr;
        String str4 = str;
        String str5 = str3;
        bxvf bxvf = (bxvf) cagi.f173096t.mo74144da();
        cagx cagx = (cagx) this.f42626t.f42596c.mo6606a();
        boolean z3 = false;
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagi cagi = (cagi) bxvf.f164949b;
        cagx.getClass();
        cagi.f173114r = cagx;
        cagi.f173098a |= 4194304;
        Integer a = qxs.m33071a(context);
        if (a != null) {
            long intValue = (long) a.intValue();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi2 = (cagi) bxvf.f164949b;
            cagi2.f173098a |= 2097152;
            cagi2.f173113q = intValue;
        }
        if (iArr != null) {
            List b = bqcn.m112586b(iArr);
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagi cagi3 = (cagi) bxvf.f164949b;
            if (!cagi3.f173111o.mo73666a()) {
                cagi3.f173111o = bxvk.m124019a(cagi3.f173111o);
            }
            bxsy.m123078a(b, cagi3.f173111o);
        }
        if (str5 != null) {
            bxvd da = cagj.f173117d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cagj cagj = (cagj) da.f164949b;
            "application_id_3p".getClass();
            int i4 = cagj.f173119a | 1;
            cagj.f173119a = i4;
            cagj.f173120b = "application_id_3p";
            str3.getClass();
            cagj.f173119a = i4 | 2;
            cagj.f173121c = str5;
            bxvf.mo74128a((cagj) da.mo74062i());
        }
        if (!z2) {
            int[] iArr4 = null;
            if (experimentTokensArr2 != null) {
                arrayList = new ArrayList(experimentTokensArr2.length);
                Collections.addAll(arrayList, experimentTokensArr2);
            } else {
                arrayList = null;
            }
            if (bArr3 == null) {
                list = arrayList;
            } else {
                if (arrayList == null) {
                    arrayList = new ArrayList(bArr3.length);
                }
                for (byte[] bArr4 : bArr3) {
                    try {
                        arrayList.add(ExperimentTokens.m68218a(new String(bArr4, StandardCharsets.UTF_8)));
                    } catch (RuntimeException e) {
                        Log.e("LogOperation", String.format("Could not deserialize %s to valid experiment token.", new String(bArr4, StandardCharsets.UTF_8)), e);
                    }
                }
                list = arrayList;
            }
            if (str4 == null || !cdds.f180545a.mo6606a().mo77303b().f165797a.contains(str4)) {
                if (str4 != null) {
                    ExperimentTokens a2 = mo24457a(context, str, null, str2, anfg);
                    if (z) {
                        experimentTokens = a2;
                    } else if (a2 != null) {
                        experimentTokens = new ExperimentTokens(a2.f82088b, null, a2.f82090d, a2.f82091e, a2.f82092f, a2.f82093g, null, null, a2.f82096j);
                    }
                    strArr2 = strArr != null ? f42612d : strArr;
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    if (!list.isEmpty() || strArr2.length != 0) {
                        length = strArr2.length;
                        arrayList2 = new ArrayList(length + 1);
                        if (experimentTokens == null) {
                            arrayList2.add(experimentTokens);
                            i = 0;
                        } else {
                            i = 0;
                        }
                        while (i < length) {
                            String str6 = strArr2[i];
                            if (str6 == null) {
                                i2 = i;
                                i3 = length;
                                arrayList3 = arrayList2;
                            } else {
                                i2 = i;
                                i3 = length;
                                arrayList3 = arrayList2;
                                ExperimentTokens a3 = mo24457a(context, null, str6, str2, anfg);
                                if (a3 != null) {
                                    arrayList3.add(a3);
                                }
                            }
                            i = i2 + 1;
                            arrayList2 = arrayList3;
                            length = i3;
                            z3 = false;
                        }
                        arrayList2.addAll(list);
                        if (arrayList2.isEmpty()) {
                            ExperimentTokens a4 = ExperimentTokens.m68219a(arrayList2);
                            if (a4 == null) {
                                String a5 = bmxr.m108544a(", ").mo66874a((Iterable) arrayList2);
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(a5).length());
                                sb.append("bad merge: ");
                                sb.append(str4);
                                sb.append("mendel packaged: ");
                                sb.append(a5);
                                Log.e("LogOperation", sb.toString());
                            } else {
                                experimentTokens = a4;
                            }
                        } else {
                            experimentTokens = null;
                        }
                    }
                }
                experimentTokens = null;
                if (strArr != null) {
                }
                if (list == null) {
                }
                length = strArr2.length;
                arrayList2 = new ArrayList(length + 1);
                if (experimentTokens == null) {
                }
                while (i < length) {
                }
                arrayList2.addAll(list);
                if (arrayList2.isEmpty()) {
                }
            } else {
                experimentTokens = null;
            }
            bqyq a6 = req.m33478a(experimentTokens, iArr3, true);
            if (a6 != null) {
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = z3;
                }
                cagi cagi4 = (cagi) bxvf.f164949b;
                a6.getClass();
                cagi4.f173108k = a6;
                cagi4.f173098a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            }
            if (experimentTokens != null) {
                iArr4 = experimentTokens.f82096j;
            }
            int[] a7 = m33326a(iArr2, iArr4);
            if (a7 != null) {
                List b2 = bqcn.m112586b(a7);
                if (bxvf.f164950c) {
                    bxvf.mo74035c();
                    bxvf.f164950c = z3;
                }
                cagi cagi5 = (cagi) bxvf.f164949b;
                if (!cagi5.f173112p.mo73666a()) {
                    cagi5.f173112p = bxvk.m124019a(cagi5.f173112p);
                }
                bxsy.m123078a(b2, cagi5.f173112p);
            }
        }
        return bxtx.m123261a(bArr).mo73770a(((cagi) bxvf.mo74062i()).mo73639aL());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final caik mo24456a(Context context, PlayLoggerContext playLoggerContext, anfg anfg) {
        PseudonymousIdToken b;
        String str;
        Context context2 = context;
        PlayLoggerContext playLoggerContext2 = playLoggerContext;
        bxvd da = caik.f174711o.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caik.m126667a((caik) da.f164949b);
        int i = playLoggerContext2.f30043b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caik caik = (caik) da.f164949b;
        int i2 = caik.f174713a | 4;
        caik.f174713a = i2;
        caik.f174715c = i;
        int i3 = playLoggerContext2.f30044c;
        int i4 = i2 | 8;
        caik.f174713a = i4;
        caik.f174716d = i3;
        boolean z = playLoggerContext2.f30047f;
        int i5 = i4 | 64;
        caik.f174713a = i5;
        caik.f174719g = z;
        String str2 = "";
        str2.getClass();
        int i6 = i5 | 128;
        caik.f174713a = i6;
        caik.f174720h = str2;
        boolean z2 = playLoggerContext2.f30049h;
        int i7 = i6 | 512;
        caik.f174713a = i7;
        caik.f174722j = z2;
        int i8 = playLoggerContext2.f30050i;
        int i9 = i7 | 1024;
        caik.f174713a = i9;
        caik.f174723k = i8;
        String str3 = playLoggerContext2.f30048g;
        if (str3 != null) {
            str3.getClass();
            i9 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            caik.f174713a = i9;
            caik.f174721i = str3;
        }
        String str4 = playLoggerContext2.f30042a;
        if (str4 != null) {
            str4.getClass();
            i9 |= 2;
            caik.f174713a = i9;
            caik.f174714b = str4;
        }
        String str5 = playLoggerContext2.f30045d;
        if (str5 != null) {
            str5.getClass();
            i9 |= 16;
            caik.f174713a = i9;
            caik.f174717e = str5;
        }
        String str6 = playLoggerContext2.f30046e;
        if (str6 != null) {
            str6.getClass();
            caik.f174713a = i9 | 32;
            caik.f174718f = str6;
        }
        Integer num = playLoggerContext2.f30051j;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caik caik2 = (caik) da.f164949b;
            caik2.f174713a |= 8192;
            caik2.f174726n = intValue;
        }
        caik caik3 = (caik) da.mo74062i();
        bxvd bxvd = (bxvd) caik3.mo74142c(5);
        bxvd.mo73625a((bxvk) caik3);
        if (!aytw.m84813a(context) && !((caik) bxvd.f164949b).f174722j && (b = aooo.m66219b(context)) != null && (str = b.f83468a) != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            caik caik4 = (caik) bxvd.f164949b;
            str.getClass();
            caik4.f174713a |= 128;
            caik4.f174720h = str;
        }
        Integer valueOf = Integer.valueOf(spn.m35881e(context));
        Integer num2 = null;
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        rbu rbu = this.f42626t;
        caik caik5 = (caik) bxvd.f164949b;
        boolean z3 = caik5.f174719g;
        String str7 = (caik5.f174713a & 32) != 0 ? caik5.f174718f : null;
        int i10 = caik5.f174715c;
        sqp a = sqq.m35991a(this.f42624r);
        boci a2 = soy.m35781a(context);
        cafx cafx = (cafx) rbu.f42595b.mo6606a();
        bxvd bxvd2 = (bxvd) cafx.mo74142c(5);
        bxvd2.mo73625a((bxvk) cafx);
        bxvf bxvf = (bxvf) bxvd2;
        if (!z3) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx2 = (cafx) bxvf.f164949b;
            cafx cafx3 = cafx.f173026C;
            cafx2.f173031a &= -2;
            cafx2.f173032b = 0;
        }
        if (str7 != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx4 = (cafx) bxvf.f164949b;
            cafx cafx5 = cafx.f173026C;
            str7.getClass();
            cafx4.f173031a |= 2;
            cafx4.f173033c = str7;
        }
        String num3 = Integer.toString(i10);
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cafx cafx6 = (cafx) bxvf.f164949b;
        cafx cafx7 = cafx.f173026C;
        num3.getClass();
        cafx6.f173031a |= 512;
        cafx6.f173040j = num3;
        if (valueOf != null) {
            int intValue2 = valueOf.intValue();
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx8 = (cafx) bxvf.f164949b;
            cafx8.f173031a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
            cafx8.f173049t = intValue2;
        }
        bxvf.mo74125a(cafk.f172920b, a.f44990a);
        if (a2 != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cafx cafx9 = (cafx) bxvf.f164949b;
            a2.getClass();
            cafx9.f173054y = a2;
            cafx9.f173031a |= 16777216;
        }
        cafx cafx10 = (cafx) bxvf.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        caik caik6 = (caik) bxvd.f164949b;
        cafx10.getClass();
        caik6.f174724l = cafx10;
        caik6.f174713a |= 2048;
        m33324a(context2, bxvd, anfg);
        if (((caik) bxvd.f164949b).f174721i.isEmpty()) {
            caik caik7 = (caik) bxvd.f164949b;
            if ((caik7.f174713a & 8) != 0) {
                str2 = Integer.toString(caik7.f174716d);
            }
        } else {
            str2 = ((caik) bxvd.f164949b).f174721i;
        }
        Integer a3 = rem.m33464a(context2, str2);
        if (a3 != null) {
            Object[] objArr = new Object[3];
            objArr[0] = str2;
            caik caik8 = (caik) bxvd.f164949b;
            if ((caik8.f174713a & 1024) != 0) {
                num2 = Integer.valueOf(caik8.f174723k);
            }
            objArr[1] = num2;
            objArr[2] = a3;
            int intValue3 = a3.intValue();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            caik caik9 = (caik) bxvd.f164949b;
            caik9.f174713a |= 1024;
            caik9.f174723k = intValue3;
        } else if ((((caik) bxvd.f164949b).f174713a & 1024) == 0) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            caik caik10 = (caik) bxvd.f164949b;
            caik10.f174713a |= 1024;
            caik10.f174723k = 0;
        }
        return (caik) bxvd.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ExperimentTokens mo24457a(Context context, String str, String str2, String str3, anfg anfg) {
        if (!cdds.m132722b()) {
            try {
                return new anhj(str2, str, this.f42625s).mo41835a(anfg);
            } catch (Exception e) {
                return f42613e;
            }
        } else {
            aney a = anef.m64089a(context);
            if (str == null) {
                try {
                    return (ExperimentTokens) aucu.m76783a(a.mo41764c(str2, str3, this.f42625s), cddj.m132688b(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    String valueOf = String.valueOf(str2);
                    Log.e("LogOperation", valueOf.length() == 0 ? new String("Failed to get experiment ids for mendel package ") : "Failed to get experiment ids for mendel package ".concat(valueOf), e2);
                    return f42613e;
                }
            } else {
                try {
                    String str4 = this.f42625s;
                    roz b = rpa.m34196b();
                    b.f43472a = new anei(str, str3, str4);
                    b.f43473b = new Feature[]{andy.f76703c};
                    b.mo24979b();
                    return (ExperimentTokens) aucu.m76783a(a.mo24701a(b.mo24977a()), cddj.m132688b(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                    Log.e("LogOperation", str.length() == 0 ? new String("Failed to get experiment ids for log source ") : "Failed to get experiment ids for log source ".concat(str), e3);
                    return f42613e;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x06bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x06be, code lost:
        android.util.Log.e("LogOperation", "Failed to get accumulated test codes.", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x079c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        r3 = android.os.Build.VERSION.SDK_INT;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07ab, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0815, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0818, code lost:
        r1 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x081d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0821, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0824, code lost:
        r1 = r29;
        r2 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x082b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x082d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x082e, code lost:
        r1 = r13;
        r2 = r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06cc A[Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x06d2 A[Catch:{ IOException -> 0x082d, SQLiteException -> 0x082b }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x06e0 A[SYNTHETIC, Splitter:B:246:0x06e0] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0734 A[Catch:{ SQLiteException | IOException -> 0x0815, all -> 0x081d }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x081d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:255:0x0721] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x082b A[ExcHandler: SQLiteException (e android.database.sqlite.SQLiteException), Splitter:B:230:0x0693] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x082d A[ExcHandler: IOException (e java.io.IOException), Splitter:B:230:0x0693] */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        rdp rdp;
        caik a;
        byte[] bArr;
        int[] iArr;
        GenericDimension[] genericDimensionArr;
        int[] iArr2;
        int[] iArr3;
        rdp rdp2;
        bxtx a2;
        Map map;
        boolean z;
        FileOutputStream fileOutputStream;
        Throwable th;
        Context context2 = context;
        if (cddm.f180532a.mo6606a().mo77291a()) {
            this.f42621o.mo24340a(new Status(31002, "Logging is disabled"));
            return;
        }
        String a3 = rer.m33481a(this.f42622p.f30030a);
        rai.m33153a(a3, rag.EVENTS_SERVICE_EXECUTED);
        int i = 2;
        int i2 = 0;
        if (cddm.m132697b()) {
            LogEventParcelable logEventParcelable = this.f42622p;
            String str2 = this.f42625s;
            cain cain = (cain) caip.f174755b.mo74144da();
            bxvd da = caio.f174748e.mo74144da();
            bxvd da2 = cail.f174729d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cail cail = (cail) da2.f164949b;
            str2.getClass();
            cail.f174731a |= 2;
            cail.f174733c = str2;
            PlayLoggerContext playLoggerContext = logEventParcelable.f30030a;
            bxvd da3 = caim.f174735k.mo74144da();
            bxvd da4 = caik.f174711o.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            caik.m126667a((caik) da4.f164949b);
            String b = bmxx.m108578b(playLoggerContext.f30042a);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            caik caik = (caik) da4.f164949b;
            b.getClass();
            int i3 = caik.f174713a | 2;
            caik.f174713a = i3;
            caik.f174714b = b;
            int i4 = playLoggerContext.f30043b;
            int i5 = i3 | 4;
            caik.f174713a = i5;
            caik.f174715c = i4;
            int i6 = playLoggerContext.f30044c;
            caik.f174713a = i5 | 8;
            caik.f174716d = i6;
            String b2 = bmxx.m108578b(playLoggerContext.f30045d);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            caik caik2 = (caik) da4.f164949b;
            b2.getClass();
            caik2.f174713a |= 16;
            caik2.f174717e = b2;
            String b3 = bmxx.m108578b(playLoggerContext.f30046e);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            caik caik3 = (caik) da4.f164949b;
            b3.getClass();
            int i7 = caik3.f174713a | 32;
            caik3.f174713a = i7;
            caik3.f174718f = b3;
            boolean z2 = playLoggerContext.f30047f;
            int i8 = i7 | 64;
            caik3.f174713a = i8;
            caik3.f174719g = z2;
            "".getClass();
            caik3.f174713a = i8 | 128;
            caik3.f174720h = "";
            String b4 = bmxx.m108578b(playLoggerContext.f30048g);
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            caik caik4 = (caik) da4.f164949b;
            b4.getClass();
            int i9 = caik4.f174713a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            caik4.f174713a = i9;
            caik4.f174721i = b4;
            boolean z3 = playLoggerContext.f30049h;
            int i10 = i9 | 512;
            caik4.f174713a = i10;
            caik4.f174722j = z3;
            int i11 = playLoggerContext.f30050i;
            caik4.f174713a = i10 | 1024;
            caik4.f174723k = i11;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            caim caim = (caim) da3.f164949b;
            caik caik5 = (caik) da4.mo74062i();
            caik5.getClass();
            caim.f174738b = caik5;
            caim.f174737a |= 1;
            byte[] bArr2 = logEventParcelable.f30031b;
            if (bArr2 != null) {
                bxtx a4 = bxtx.m123261a(bArr2);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim2 = (caim) da3.f164949b;
                a4.getClass();
                caim2.f174737a |= 2;
                caim2.f174739c = a4;
            }
            String[] strArr = logEventParcelable.f30033d;
            if (strArr != null) {
                List asList = Arrays.asList(strArr);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim3 = (caim) da3.f164949b;
                if (!caim3.f174741e.mo73666a()) {
                    caim3.f174741e = bxvk.m124021a(caim3.f174741e);
                }
                bxsy.m123078a(asList, caim3.f174741e);
            }
            int[] iArr4 = logEventParcelable.f30032c;
            if (iArr4 != null) {
                List b5 = bqcn.m112586b(iArr4);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim4 = (caim) da3.f164949b;
                if (!caim4.f174740d.mo73666a()) {
                    caim4.f174740d = bxvk.m124019a(caim4.f174740d);
                }
                bxsy.m123078a(b5, caim4.f174740d);
            }
            int[] iArr5 = logEventParcelable.f30034e;
            if (iArr5 != null) {
                List b6 = bqcn.m112586b(iArr5);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim5 = (caim) da3.f164949b;
                if (!caim5.f174742f.mo73666a()) {
                    caim5.f174742f = bxvk.m124019a(caim5.f174742f);
                }
                bxsy.m123078a(b6, caim5.f174742f);
            }
            byte[][] bArr3 = logEventParcelable.f30035f;
            if (bArr3 != null) {
                Iterable a5 = bnjd.m109575a((Iterable) Arrays.asList(bArr3), qww.f42352a);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim6 = (caim) da3.f164949b;
                if (!caim6.f174743g.mo73666a()) {
                    caim6.f174743g = bxvk.m124021a(caim6.f174743g);
                }
                bxsy.m123078a(a5, caim6.f174743g);
            }
            boolean z4 = logEventParcelable.f30037h;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            caim caim7 = (caim) da3.f164949b;
            caim7.f174737a |= 4;
            caim7.f174744h = z4;
            ExperimentTokens[] experimentTokensArr = logEventParcelable.f30036g;
            if (experimentTokensArr != null) {
                Iterable a6 = bnjd.m109575a((Iterable) Arrays.asList(experimentTokensArr), qwx.f42353a);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim8 = (caim) da3.f164949b;
                if (!caim8.f174745i.mo73666a()) {
                    caim8.f174745i = bxvk.m124021a(caim8.f174745i);
                }
                bxsy.m123078a(a6, caim8.f174745i);
            }
            GenericDimension[] genericDimensionArr2 = logEventParcelable.f30038i;
            if (genericDimensionArr2 != null) {
                List b7 = bqcn.m112586b(GenericDimension.m68244a(genericDimensionArr2));
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                caim caim9 = (caim) da3.f164949b;
                if (!caim9.f174746j.mo73666a()) {
                    caim9.f174746j = bxvk.m124019a(caim9.f174746j);
                }
                bxsy.m123078a(b7, caim9.f174746j);
            }
            caim caim10 = (caim) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cail cail2 = (cail) da2.f164949b;
            caim10.getClass();
            cail2.f174732b = caim10;
            cail2.f174731a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caio caio = (caio) da.f164949b;
            cail cail3 = (cail) da2.mo74062i();
            cail3.getClass();
            caio.f174752c = cail3;
            caio.f174750a |= 2;
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caio caio2 = (caio) da.f164949b;
            caio2.f174750a |= 1;
            caio2.f174751b = currentTimeMillis;
            cain.mo74652a(da);
            caip caip = (caip) cain.mo74062i();
            try {
                fileOutputStream = new FileOutputStream(new File(rpr.m34216b().getFilesDir(), "clearcut_simulation_log_events.pb"), true);
                caip.mo73638a(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Failed to write simulation log events to file.", e);
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        LogEventParcelable logEventParcelable2 = this.f42622p;
        PlayLoggerContext playLoggerContext2 = logEventParcelable2.f30030a;
        if (sre.m36080a(context)) {
            String str3 = playLoggerContext2.f30048g;
            String c = cdee.f180578a.mo6606a().mo77331c();
            synchronized (f42616h) {
                if (!c.equals(f42619k)) {
                    f42619k = c;
                    HashMap hashMap = new HashMap();
                    for (String str4 : f42617i.mo66918a((CharSequence) c)) {
                        List c2 = f42618j.mo66925c((CharSequence) str4.trim());
                        if (c2.size() != i) {
                            String valueOf = String.valueOf(c);
                            Log.e("LogOperation", valueOf.length() == 0 ? new String("Failed to parse a pair in sidewinderPermissions: ") : "Failed to parse a pair in sidewinderPermissions: ".concat(valueOf));
                            i = 2;
                        } else {
                            Integer num = (Integer) f42616h.get(c2.get(1));
                            if (num == null) {
                                String valueOf2 = String.valueOf(c);
                                Log.e("LogOperation", valueOf2.length() == 0 ? new String("Bad permission in sidewinderPermissions: ") : "Bad permission in sidewinderPermissions: ".concat(valueOf2));
                                i = 2;
                            } else {
                                hashMap.put((String) c2.get(0), num);
                                i = 2;
                            }
                        }
                    }
                    f42620l = hashMap;
                }
                String obj = f42620l.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 36 + String.valueOf(obj).length());
                sb.append("permissions=");
                sb.append(c);
                sb.append(",sSidewinderPermissions=");
                sb.append(obj);
                sb.toString();
                map = f42620l;
            }
            Integer num2 = (Integer) map.get(str3);
            String valueOf3 = String.valueOf(num2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 38 + String.valueOf(valueOf3).length());
            sb2.append("logSourceName=");
            sb2.append(str3);
            sb2.append(", sidewinder permission=");
            sb2.append(valueOf3);
            sb2.toString();
            if (num2 == null) {
                String valueOf4 = String.valueOf(str3);
                if (valueOf4.length() == 0) {
                    new String("Default skipping log for Sidewinder: ");
                } else {
                    "Default skipping log for Sidewinder: ".concat(valueOf4);
                }
                playLoggerContext2 = null;
            } else if (num2.equals(f42614f)) {
                String valueOf5 = String.valueOf(str3);
                if (valueOf5.length() == 0) {
                    new String("Explicit skipping log for Sidewinder: ");
                } else {
                    "Explicit skipping log for Sidewinder: ".concat(valueOf5);
                }
                playLoggerContext2 = null;
            } else if (!num2.equals(f42610b)) {
                boolean z5 = playLoggerContext2.f30049h;
                if (num2.equals(f42615g)) {
                    String valueOf6 = String.valueOf(str3);
                    if (valueOf6.length() == 0) {
                        new String("Switching log to anonymous for Sidewinder: ");
                    } else {
                        "Switching log to anonymous for Sidewinder: ".concat(valueOf6);
                    }
                    z = true;
                } else if (num2.equals(f42609a)) {
                    String valueOf7 = String.valueOf(str3);
                    if (valueOf7.length() == 0) {
                        new String("Removing user ids from log for Sidewinder: ");
                    } else {
                        "Removing user ids from log for Sidewinder: ".concat(valueOf7);
                    }
                    z = z5;
                } else {
                    String valueOf8 = String.valueOf(num2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf8).length() + 39);
                    sb3.append("Unknown Sidewinder logging permission: ");
                    sb3.append(valueOf8);
                    sb3.toString();
                    playLoggerContext2 = null;
                }
                playLoggerContext2 = new PlayLoggerContext(playLoggerContext2.f30042a, playLoggerContext2.f30043b, playLoggerContext2.f30044c, null, playLoggerContext2.f30046e, false, playLoggerContext2.f30048g, z, playLoggerContext2.f30050i, playLoggerContext2.f30051j);
            }
        }
        logEventParcelable2.f30030a = playLoggerContext2;
        if (this.f42622p.f30030a == null) {
            rai.m33153a(a3, rag.DROPS_BY_SIDEWINDER);
            this.f42621o.mo24340a(new Status(31002, "Log dropped from Sidewinder."));
            return;
        }
        rai.m33153a(a3, rag.EVENTS_AFTER_SIDEWINDER);
        LogEventParcelable logEventParcelable3 = this.f42622p;
        PlayLoggerContext playLoggerContext3 = logEventParcelable3.f30030a;
        String str5 = playLoggerContext3.f30048g;
        int i12 = playLoggerContext3.f30044c;
        cagi cagi = logEventParcelable3.f30039j;
        if (cagi != null) {
            i2 = cagi.f173102e;
        }
        if (!this.f42627u.mo24332a(str5, i12, i2)) {
            String valueOf9 = String.valueOf(logEventParcelable3.f30030a);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf9).length() + 25);
            sb4.append("log skipped by sampling: ");
            sb4.append(valueOf9);
            sb4.toString();
            rai.m33153a(a3, rag.DROPS_BY_SERVICE_SAMPLING);
            this.f42621o.mo24340a(new Status(31002, "Log dropped from sampling."));
            return;
        }
        rai.m33153a(a3, rag.EVENTS_SERVICE_SAMPLED);
        PlayLoggerContext playLoggerContext4 = this.f42622p.f30030a;
        int i13 = playLoggerContext4.f30050i;
        Integer a7 = rem.m33464a(context2, rer.m33481a(playLoggerContext4));
        if (a7 != null) {
            i13 = a7.intValue();
        }
        if (i13 == 4) {
            String valueOf10 = String.valueOf(playLoggerContext4);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf10).length() + 30);
            sb5.append("log dropped by NEVER qos tier:");
            sb5.append(valueOf10);
            sb5.toString();
            rai.m33153a(a3, rag.DROPS_BY_QOS_TIER_OVERRIDE);
            this.f42621o.mo24340a(new Status(31002, "Log dropped from Qos Tier."));
            return;
        }
        rel.m33456a();
        String str6 = (!cdds.f180545a.mo6606a().mo77304c() || rfz.m33557a(context).mo24610b(this.f42625s)) ? null : this.f42625s;
        rdp a8 = this.f42623q.mo24518a();
        int i14 = Build.VERSION.SDK_INT;
        StringBuilder sb6 = new StringBuilder(String.valueOf(a3).length() + 32);
        sb6.append("Clearcut LogOperation overall (");
        sb6.append(a3);
        sb6.append(")");
        Trace.beginSection(sb6.toString());
        try {
            if (cddx.f180554a.mo6606a().mo77310c()) {
                long b8 = a8.mo24491b(a3);
                cahl e2 = cddx.f180554a.mo6606a().mo77312e();
                long j = e2.f174558a;
                Iterator it = e2.f174559b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    cahk cahk = (cahk) it.next();
                    if (cahk.f174553a.equals(a3)) {
                        j = cahk.f174554b;
                        break;
                    }
                }
                if (b8 > j) {
                    if (!e2.f174560c) {
                        m33325a(a8, a3, rdl.EXCEED_LOG_SOURCE_LOG_CAP);
                        this.f42621o.mo24340a(new Status(31003, "Log dropped because of log cap for this log source exceeded."));
                        int i15 = Build.VERSION.SDK_INT;
                        Trace.endSection();
                        return;
                    }
                    m33325a(a8, a3, rdl.EXCEED_LOG_SOURCE_LOG_CAP_DRY_RUN);
                }
            }
            if (a8.mo24498d()) {
                m33325a(a8, a3, rdl.OVERFLOW);
                this.f42621o.mo24340a(new Status(31003, "Log dropped because of storage quota exceeded."));
            } else {
                try {
                    anfg a9 = anfg.m64152a(context);
                    try {
                        a = mo24456a(context2, this.f42622p.f30030a, a9);
                        LogEventParcelable logEventParcelable4 = this.f42622p;
                        bArr = logEventParcelable4.f30031b;
                        int[] iArr6 = logEventParcelable4.f30032c;
                        if (cgcn.m144758b().f165797a.contains(a3)) {
                            iArr = m33326a(iArr6, this.f42623q.mo24518a().mo24499d(a3));
                            genericDimensionArr = this.f42622p.f30038i;
                            if (genericDimensionArr == null) {
                                iArr2 = GenericDimension.m68244a(genericDimensionArr);
                            } else {
                                iArr2 = null;
                            }
                            if (cgcn.m144758b().f165797a.contains(a3)) {
                                iArr3 = m33326a(this.f42623q.mo24518a().mo24501e(a3), iArr2);
                                LogEventParcelable logEventParcelable5 = this.f42622p;
                                String[] strArr2 = logEventParcelable5.f30033d;
                                int[] iArr7 = logEventParcelable5.f30034e;
                                byte[][] bArr4 = logEventParcelable5.f30035f;
                                ExperimentTokens[] experimentTokensArr2 = logEventParcelable5.f30036g;
                                boolean z6 = logEventParcelable5.f30037h;
                                PlayLoggerContext playLoggerContext5 = logEventParcelable5.f30030a;
                                caik caik6 = a;
                                rdp2 = a8;
                                String str7 = a3;
                                a2 = mo24455a(context, bArr, iArr, iArr3, strArr2, iArr7, bArr4, experimentTokensArr2, z6, a3, playLoggerContext5.f30049h, playLoggerContext5.f30045d, str6, a9);
                                str = str7;
                                rai.m33153a(str, rag.EVENTS_SERVICE_SERIALIZED);
                                if (a2.mo73744a() <= 1048576) {
                                    if (!cddm.f180532a.mo6606a().mo77293c()) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 30);
                                        sb7.append("Clearcut writeLogEventProto (");
                                        sb7.append(str);
                                        sb7.append(")");
                                        Trace.beginSection(sb7.toString());
                                        caik caik7 = caik6;
                                        rdp = rdp2;
                                        try {
                                            if (rdp.mo24488a(caik7, a2)) {
                                                rai.m33153a(str, rag.EVENTS_WRITTEN);
                                                if (caik7.f174723k == 3) {
                                                    rel a10 = rel.m33456a();
                                                    synchronized (a10.f42811b) {
                                                        if (!a10.f42810a) {
                                                            a10.mo24557a(0);
                                                        }
                                                    }
                                                }
                                            } else {
                                                rai.m33153a(str, rag.DROPS_BY_WRITE_FAILURE);
                                            }
                                            int i17 = Build.VERSION.SDK_INT;
                                            Trace.endSection();
                                        } catch (Exception e3) {
                                            rai.m33153a(str, rag.DROPS_BY_WRITE_EXCEPTION);
                                            throw e3;
                                        }
                                    } else {
                                        rdp = rdp2;
                                    }
                                    try {
                                        int[] iArr8 = this.f42622p.f30032c;
                                        if (iArr8 != null) {
                                            if (iArr8.length > 0) {
                                                rdp.mo24486a(iArr8, str, cgcn.m144758b().f165797a);
                                            }
                                        }
                                        GenericDimension[] genericDimensionArr3 = this.f42622p.f30038i;
                                        if (genericDimensionArr3 != null) {
                                            if (genericDimensionArr3.length > 0) {
                                                rdp.mo24493b(GenericDimension.m68244a(genericDimensionArr3), str, cgcn.m144758b().f165797a);
                                            }
                                        }
                                        int i18 = Build.VERSION.SDK_INT;
                                        Trace.endSection();
                                        rai.m33153a(str, rag.EVENTS_SERVICE_LOGGED);
                                        this.f42621o.mo24340a(Status.f30107a);
                                        return;
                                    } catch (SQLiteException | IOException e4) {
                                        e = e4;
                                    }
                                } else {
                                    rdp = rdp2;
                                    m33325a(rdp, str, rdl.SINGLE_LOG_TOO_BIG);
                                    this.f42621o.mo24340a(new Status(31004, "Log dropped because event exceeds maximum size"));
                                }
                            }
                            iArr3 = iArr2;
                            LogEventParcelable logEventParcelable52 = this.f42622p;
                            String[] strArr22 = logEventParcelable52.f30033d;
                            int[] iArr72 = logEventParcelable52.f30034e;
                            byte[][] bArr42 = logEventParcelable52.f30035f;
                            ExperimentTokens[] experimentTokensArr22 = logEventParcelable52.f30036g;
                            boolean z62 = logEventParcelable52.f30037h;
                            PlayLoggerContext playLoggerContext52 = logEventParcelable52.f30030a;
                            caik caik62 = a;
                            rdp2 = a8;
                            String str72 = a3;
                            a2 = mo24455a(context, bArr, iArr, iArr3, strArr22, iArr72, bArr42, experimentTokensArr22, z62, a3, playLoggerContext52.f30049h, playLoggerContext52.f30045d, str6, a9);
                            str = str72;
                            rai.m33153a(str, rag.EVENTS_SERVICE_SERIALIZED);
                            if (a2.mo73744a() <= 1048576) {
                            }
                        }
                        iArr = iArr6;
                        genericDimensionArr = this.f42622p.f30038i;
                        if (genericDimensionArr == null) {
                        }
                        if (cgcn.m144758b().f165797a.contains(a3)) {
                        }
                    } catch (IOException e5) {
                        Log.e("LogOperation", "Failed to get accumulated generic dimensions.", e5);
                    } catch (SQLiteException e6) {
                    }
                    iArr3 = iArr2;
                    LogEventParcelable logEventParcelable522 = this.f42622p;
                    String[] strArr222 = logEventParcelable522.f30033d;
                    int[] iArr722 = logEventParcelable522.f30034e;
                    byte[][] bArr422 = logEventParcelable522.f30035f;
                    ExperimentTokens[] experimentTokensArr222 = logEventParcelable522.f30036g;
                    boolean z622 = logEventParcelable522.f30037h;
                    PlayLoggerContext playLoggerContext522 = logEventParcelable522.f30030a;
                    caik caik622 = a;
                    rdp2 = a8;
                    String str722 = a3;
                    try {
                        a2 = mo24455a(context, bArr, iArr, iArr3, strArr222, iArr722, bArr422, experimentTokensArr222, z622, a3, playLoggerContext522.f30049h, playLoggerContext522.f30045d, str6, a9);
                        str = str722;
                        rai.m33153a(str, rag.EVENTS_SERVICE_SERIALIZED);
                        if (a2.mo73744a() <= 1048576) {
                        }
                    } catch (SQLiteException | IOException e7) {
                        e = e7;
                        rdp = rdp2;
                    } catch (Throwable th3) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    int i19 = Build.VERSION.SDK_INT;
                    Trace.endSection();
                    throw th;
                }
            }
            int i152 = Build.VERSION.SDK_INT;
            Trace.endSection();
            return;
        } catch (IOException e8) {
            e = e8;
            m33325a(a8, a3, new rdk(e.getClass().getSimpleName(), rag.DROPS_BY_STORAGE_SIZE_EXCEPTION));
            throw new aaaj(31005, "Error checking storage size", null, e);
        } catch (SQLiteException e9) {
            e = e9;
            m33325a(a8, a3, new rdk(e.getClass().getSimpleName(), rag.DROPS_BY_STORAGE_SIZE_EXCEPTION));
            throw new aaaj(31005, "Error checking storage size", null, e);
        }
        throw th;
        m33325a(rdp, str, new rdk(rdr.m33428a(e.getClass().getSimpleName(), e), rag.WRITE_EXCEPTIONS));
        throw new aaaj(31005, "Error writing log", null, e);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f42621o.mo24340a(status);
    }
}
