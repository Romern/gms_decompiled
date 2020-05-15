package p000;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: egr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class egr extends dwm {

    /* renamed from: a */
    public final egv f14872a = new egv();

    /* renamed from: b */
    public final Set f14873b = new LinkedHashSet();

    /* renamed from: c */
    private final egq f14874c = new egq(this);

    /* renamed from: a */
    public static void m10366a(PrintWriter printWriter, tnt tnt) {
        long j = tnt.f46357c - tnt.f46356b;
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        long j5 = j3 - (60000 * j4);
        long j6 = j5 / 1000;
        String format = String.format("%02d:%02d:%02d.%03d", Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j6), Long.valueOf(j5 - (j6 * 1000)));
        String a = egc.m10349a(tnt.f46356b);
        String a2 = egc.m10349a(tnt.f46357c);
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 30 + String.valueOf(a).length() + String.valueOf(a2).length());
        sb.append("[Interval duration ");
        sb.append(format);
        sb.append(" from ");
        sb.append(a);
        sb.append(" to ");
        sb.append(a2);
        sb.append("]");
        printWriter.println(sb.toString());
        bxwc bxwc = tnt.f46358d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            tns tns = (tns) bxwc.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  \"");
            sb2.append(tns.f46343b);
            sb2.append("\" (");
            sb2.append(tns.f46344c.mo74151b(0));
            sb2.append("): mean=");
            sb2.append(tns.f46349h);
            sb2.append("/");
            sb2.append(tns.f46345d);
            sb2.append("ms, stdev=");
            sb2.append(tns.f46350i);
            sb2.append("/");
            sb2.append(tns.f46346e);
            sb2.append("ms, min=");
            sb2.append(tns.f46351j);
            sb2.append("/");
            sb2.append(tns.f46347f);
            sb2.append("ms, max=");
            sb2.append(tns.f46352k);
            sb2.append("/");
            sb2.append(tns.f46348g);
            sb2.append("ms");
            for (int i2 = 1; i2 < tns.f46344c.size(); i2++) {
                if (tns.f46344c.mo74151b(i2) > 0) {
                    sb2.append(", errorCode(");
                    sb2.append(i2);
                    sb2.append(")=");
                    sb2.append(tns.f46344c.mo74151b(i2));
                    sb2.append(" count");
                }
            }
            printWriter.println(sb2.toString());
        }
        if (tnt.f46359e.size() > 0) {
            printWriter.println("    write counts:");
            bxwc bxwc2 = tnt.f46359e;
            int size2 = bxwc2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tnr tnr = (tnr) bxwc2.get(i3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("      [");
                sb3.append(tnr.f46339g);
                sb3.append("] ");
                bxco a3 = bxco.m122577a(tnr.f46334b);
                if (a3 == null) {
                    a3 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                sb3.append(Integer.toString(a3.f162973bD));
                sb3.append(" :");
                if (tnr.f46335c != 0) {
                    sb3.append(" write(");
                    sb3.append(tnr.f46335c);
                    sb3.append(")");
                }
                if (tnr.f46336d != 0) {
                    sb3.append(" inject(");
                    sb3.append(tnr.f46336d);
                    sb3.append(")");
                }
                if (tnr.f46337e != 0) {
                    sb3.append(" accessDenied(");
                    sb3.append(tnr.f46337e);
                    sb3.append(")");
                }
                if (tnr.f46338f != 0) {
                    sb3.append(" error(");
                    sb3.append(tnr.f46338f);
                    sb3.append(")");
                }
                printWriter.println(sb3.toString());
            }
        }
        if (tnt.f46360f.size() > 0 && cdhc.m133430b()) {
            printWriter.println("    Fence event details:");
            bxwc bxwc3 = tnt.f46360f;
            int size3 = bxwc3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                tnm tnm = (tnm) bxwc3.get(i4);
                long j7 = tnm.f46301b - tnt.f46356b;
                String str = (tnm.f46300a & 2) != 0 ? tnm.f46302c : "   //   ";
                int a4 = tnl.m37270a(tnm.f46303d);
                if (a4 == 0) {
                    a4 = 1;
                }
                String num = Integer.toString(a4 - 1);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(num).length());
                sb4.append(" ");
                sb4.append(j7);
                sb4.append(" - ");
                sb4.append(str);
                sb4.append(": ");
                sb4.append(num);
                printWriter.println(sb4.toString());
            }
            printWriter.println();
        }
    }

    /* renamed from: b */
    public final void mo10108b(dqx dqx) {
        synchronized (this.f14873b) {
            if (!this.f14873b.remove(dqx)) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("egr", "b", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[WorkManager] Ongoing task not found: %s", dqx.f13840a);
            }
        }
        mo10109c(dqx);
    }

    /* renamed from: c */
    public final void mo10109c(dqx dqx) {
        if (dqx.mo9465d() > 1000) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("egr", "c", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[WorkManager] Long workInfo: %s", dqx);
        }
        synchronized (this.f14872a) {
            egv egv = this.f14872a;
            String str = dqx.f13840a;
            egu egu = (egu) egv.f14887a.get(str);
            if (egu == null) {
                egu = new egu(str);
                egv.f14887a.put(str, egu);
            }
            if (!TextUtils.equals(dqx.f13840a, egu.f14881a)) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("egv", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[WorkInfoSummary] Could not add work info: %s", dqx);
            } else {
                int[] iArr = egu.f14882b;
                int i = dqx.f13845f;
                iArr[i] = iArr[i] + 1;
                if (i == 0) {
                    egu.mo10111a(dqx.mo9465d(), 0);
                    egu.mo10111a(dqx.mo9466e(), 1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10103a() {
        dwq.m9667k().mo9434a(this.f14874c, 3600000, dqy.m9123a("WorkManagerSave"));
    }

    /* renamed from: a */
    public final void mo10104a(long j, String str, int i) {
        if (cdhc.m133430b()) {
            synchronized (this.f14872a) {
                egv egv = this.f14872a;
                bxvd da = tnm.f46298e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                tnm tnm = (tnm) da.f164949b;
                int i2 = tnm.f46300a | 1;
                tnm.f46300a = i2;
                tnm.f46301b = j;
                int i3 = i - 1;
                if (i != 0) {
                    tnm.f46303d = i3;
                    tnm.f46300a = i2 | 4;
                    if (!str.equals(egv.f14890d)) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        tnm tnm2 = (tnm) da.f164949b;
                        str.getClass();
                        tnm2.f46300a |= 2;
                        tnm2.f46302c = str;
                        egv.f14890d = str;
                    }
                    egv.f14889c.add((tnm) da.mo74062i());
                } else {
                    throw null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10105a(ContextManagerClientInfo contextManagerClientInfo, bxco bxco, int i) {
        synchronized (this.f14872a) {
            egv egv = this.f14872a;
            egt egt = (egt) egv.f14888b.get(bxco.f162973bD);
            if (egt == null) {
                egt = new egt(bxco);
                egv.f14888b.put(bxco.f162973bD, egt);
            }
            String str = contextManagerClientInfo.f30677a;
            egs egs = (egs) egt.f14880b.get(str);
            if (egs == null) {
                egs = new egs();
                egt.f14880b.put(str, egs);
            }
            if (i == 0) {
                egs.f14875a++;
            } else if (i == 1) {
                egs.f14876b++;
            } else if (i != 2) {
                egs.f14878d++;
            } else {
                egs.f14877c++;
            }
        }
    }

    /* renamed from: a */
    public final void mo10106a(dqx dqx) {
        synchronized (this.f14873b) {
            dqx.mo9462a();
            this.f14873b.add(dqx);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r1 = p000.dwq.m9665i().mo20506b();
        r14.println("[Ongoing tasks]");
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        if (r0.hasNext() == false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        r3 = (p000.dqx) r0.next();
        r4 = r3.mo9466e();
        r6 = r1 - r3.f13842c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c0, code lost:
        if (r4 >= 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        r4 = r6;
        r6 = -1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ca, code lost:
        r3 = r3.f13840a;
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 49);
        r9.append("  \"");
        r9.append(r3);
        r9.append("\": ");
        r9.append(r4);
        r9.append("/");
        r9.append(r6 - r4);
        r9.append("ms");
        r14.println(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0101, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo10107a(PrintWriter printWriter) {
        tnt tnt = null;
        tjr tjr = new tjr(null);
        tkb tkb = new tkb();
        tkb.mo26624b();
        tjr.mo26596a(5, tkb.mo26620a());
        ArrayList a = dwq.m9673q().mo10052a(tjr.mo26595a());
        printWriter.println();
        printWriter.println(">>> WorkManager <<<");
        int size = a.size();
        for (int i = 0; i < size; i++) {
            try {
                m10366a(printWriter, (tnt) GeneratedMessageLite.m124016a(tnt.f46353g, ((tjq) a.get(i)).mo26593c(), bxus.m123744c()));
            } catch (bxwf e) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("egr", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[WorkManager] Could not parse work stats");
            }
        }
        synchronized (this.f14872a) {
            if (!this.f14872a.mo10117b()) {
                tnt = this.f14872a.mo10118c();
            }
        }
        if (tnt != null) {
            m10366a(printWriter, tnt);
        }
        synchronized (this.f14873b) {
            if (!this.f14873b.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f14873b);
            }
        }
    }
}
