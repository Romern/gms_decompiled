package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.contextmanager.producer.module.indooroutdoor.WifiFeatureGroupGenerator;
import java.util.ArrayList;

/* renamed from: ebv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebv {

    /* renamed from: a */
    public final ebx f14627a;

    /* renamed from: b */
    public final WifiFeatureGroupGenerator f14628b;

    /* renamed from: c */
    public final ebt f14629c;

    /* renamed from: d */
    public final ebr f14630d;

    /* renamed from: e */
    public volatile boolean f14631e;

    /* renamed from: f */
    private final ebl f14632f;

    /* renamed from: g */
    private final dzg f14633g;

    public ebv(Context context, dzg dzg, Looper looper) {
        ebu ebu = new ebu(this);
        this.f14627a = new ebx(context, looper);
        this.f14628b = new WifiFeatureGroupGenerator(context, ebu, this.f14627a, looper);
        this.f14629c = new ebt(context);
        this.f14630d = new ebr(context, ebu, looper);
        this.f14633g = dzg;
        this.f14632f = new ebl(new eca(ebl.m10073a(context, ebz.FULL), ebl.m10073a(context, ebz.NO_GPS), ebl.m10073a(context, ebz.NO_WIFI)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        if (r4 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (p000.ebz.f14647c.equals(r5) != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
        r3.addAll(r1.f14644b.f14662b);
        r3.add(java.lang.Float.valueOf((float) r1.f14644b.f14663c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r4 = new float[r3.size()];
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if (r8 >= r3.size()) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b2, code lost:
        r4[r8] = ((java.lang.Float) r3.get(r8)).floatValue();
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (r2.f112576a.length == 2) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        r3 = new java.util.HashMap();
        r9 = r2.mo61171a();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d2, code lost:
        if (r10 >= r9) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d4, code lost:
        p000.beuy.m95928a(r3, r2.f112577b.mo61170a(r10, r4).f112566a, 1.0f);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r3 = new java.util.HashMap();
        r9 = r2.mo61171a();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
        if (r10 >= r9) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        r11 = r2.mo61172a(r10, r4);
        r12 = r11.f112566a;
        r11 = r11.f112567b;
        r13 = r2.f112576a;
        r14 = r13[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        if (r12 != r14) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        r14 = r13[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        p000.beuy.m95928a(r3, r12, r11);
        p000.beuy.m95928a(r3, r14, 1.0f - r11);
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010d, code lost:
        r2 = r2.mo61171a();
        r4 = new java.util.ArrayList();
        r3 = r3.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0122, code lost:
        if (r3.hasNext() == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0124, code lost:
        r8 = (java.util.Map.Entry) r3.next();
        r4.add(new p000.beuw((java.lang.Comparable) r8.getKey(), ((java.lang.Float) r8.getValue()).floatValue() / ((float) r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        java.util.Collections.sort(r4);
        r2 = r4.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014d, code lost:
        if (r3 >= r2) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014f, code lost:
        r8 = (p000.beuw) r4.get(r3);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x015b, code lost:
        if (r8.f112566a != p000.ecd.f14666a) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x015d, code lost:
        r2 = r8.f112567b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0160, code lost:
        r2 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0161, code lost:
        r3 = r0.f14633g;
        r8 = android.os.SystemClock.elapsedRealtime();
        r10 = r8 - r3.f14472a;
        r4 = r3.f14473b;
        r4.f14609b.add(new p000.ebm(r8, (double) r2));
        r12 = r4.f14609b.iterator();
        r13 = 0.0d;
        r15 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0185, code lost:
        if (r12.hasNext() == false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0187, code lost:
        r7 = (p000.ebm) r12.next();
        r5 = (double) (r8 - r7.f14606a);
        r0 = r4.f14608a;
        java.lang.Double.isNaN(r5);
        r0 = java.lang.Math.pow(0.5d, r5 / r0);
        r15 = r15 + r0;
        r13 = r13 + (r0 * r7.f14607b);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b0, code lost:
        r18 = r1;
        r13 = r13 / r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b7, code lost:
        if (r10 >= p000.dzh.f14475b) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b9, code lost:
        r0 = new java.lang.Object[]{java.lang.Float.valueOf(r2), java.lang.Long.valueOf(r10)};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ca, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01cb, code lost:
        r3.f14472a = r8;
        r0 = (float) r13;
        r1 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r2 = r18.mo9934a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r2 == null) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r2 = r2.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01da, code lost:
        if (r2 == 0) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01dd, code lost:
        if (r2 == 1) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e0, code lost:
        if (r2 == 2) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e2, code lost:
        r4 = 0;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e7, code lost:
        r2 = r18;
        r4 = r2.f14644b.f14661a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ee, code lost:
        r2 = r18;
        r4 = r2.f14643a.f14673a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01f5, code lost:
        r2 = r18;
        r4 = java.lang.Math.max(r2.f14644b.f14661a, r2.f14643a.f14673a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0203, code lost:
        r4 = r1.toMillis(r4);
        r1 = p000.bxkr.f163786e.mo74144da();
        r6 = java.lang.Math.round(100.0f * r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0217, code lost:
        if (r1.f164950c == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0219, code lost:
        r1.mo74035c();
        r1.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021f, code lost:
        r7 = (p000.bxkr) r1.f164949b;
        r7.f163789a |= 1;
        r7.f163790b = r6;
        r6 = r2.mo9934a();
        r7 = r6.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0235, code lost:
        if (r7 == 0) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0237, code lost:
        if (r7 == 1) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023a, code lost:
        if (r7 != 2) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x023c, code lost:
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023e, code lost:
        r1 = java.lang.String.valueOf(r6);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 14);
        r3.append("Unknown model ");
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0262, code lost:
        throw new java.lang.IllegalArgumentException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0263, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0265, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0268, code lost:
        if (r1.f164950c != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x026b, code lost:
        r1.mo74035c();
        r1.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0271, code lost:
        r7 = (p000.bxkr) r1.f164949b;
        r7.f163791c = r6 - 1;
        r7.f163789a |= 2;
        r2 = r2.mo9935b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0285, code lost:
        if (r1.f164950c != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0288, code lost:
        r1.mo74035c();
        r1.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x028e, code lost:
        r6 = (p000.bxkr) r1.f164949b;
        r2.getClass();
        r6.f163789a |= 4;
        r6.f163792d = r2;
        r1 = (p000.bxkr) r1.mo74062i();
        r2 = new java.lang.Object[]{java.lang.Float.valueOf(r0), r1, java.lang.Long.valueOf(r4)};
        r0 = new p000.tip(3, 57, 2);
        r0.mo26574a(p000.tka.m37117a(r4));
        r0.mo26572a(p000.bxkr.f163787f, r1);
        r3.f14474c.mo9856c(r0.mo26570a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d9, code lost:
        throw new java.lang.IllegalStateException("getNanos() undefined");
     */
    /* renamed from: a */
    public final void mo9930a() {
        beuy beuy;
        if (this.f14631e) {
            eby eby = new eby(this.f14628b.f7718d, this.f14630d.f14616c);
            if (eby.mo9934a() != null) {
                eca eca = this.f14632f.f14605a;
                ebz a = eby.mo9934a();
                if (a != null) {
                    int ordinal = a.ordinal();
                    if (ordinal == 0) {
                        beuy = eca.f14658a;
                    } else if (ordinal == 1) {
                        beuy = eca.f14659b;
                    } else if (ordinal == 2) {
                        beuy = eca.f14660c;
                    } else {
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                        sb.append("Unhandled model type ");
                        sb.append(valueOf);
                        throw new AssertionError(sb.toString());
                    }
                    ArrayList arrayList = new ArrayList();
                    ebz a2 = eby.mo9934a();
                    if (a2 != null) {
                        boolean equals = ebz.FULL.equals(a2);
                        if (equals || ebz.NO_GPS.equals(a2)) {
                            arrayList.addAll(eby.f14643a.f14674b);
                            arrayList.addAll(eby.f14643a.f14676d);
                        }
                    } else {
                        String b = eby.mo9935b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 88);
                        sb2.append("No model available for ");
                        sb2.append(b);
                        sb2.append(". You must check getBestModel() before calling getFeatureValues()");
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    String b2 = eby.mo9935b();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b2).length() + 83);
                    sb3.append("No model available for ");
                    sb3.append(b2);
                    sb3.append(". You must check isValid() before calling getFeatureValues()");
                    throw new IllegalArgumentException(sb3.toString());
                }
            } else {
                String valueOf2 = String.valueOf(eby);
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 79);
                sb4.append("Invalid instance: ");
                sb4.append(valueOf2);
                sb4.append(". Did WiFi or GPS generator incorrectly provide a null group?");
                throw new AssertionError(sb4.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo9931a(boolean z) {
        ebx ebx = this.f14627a;
        ebx.f14638d = z;
        ebx.mo9933a();
    }
}
