package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: bfrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfrh {

    /* renamed from: A */
    public long f114984A;

    /* renamed from: B */
    public long f114985B;

    /* renamed from: C */
    public int f114986C;

    /* renamed from: D */
    public boolean f114987D = false;

    /* renamed from: E */
    public long f114988E = Long.MIN_VALUE;

    /* renamed from: F */
    public long f114989F;

    /* renamed from: G */
    public long f114990G;

    /* renamed from: H */
    public int f114991H;

    /* renamed from: I */
    public ArrayList f114992I;

    /* renamed from: J */
    public ArrayList f114993J;

    /* renamed from: K */
    public bplm f114994K;

    /* renamed from: L */
    public Location f114995L;

    /* renamed from: M */
    public int f114996M = 1;

    /* renamed from: N */
    public int f114997N = 1;

    /* renamed from: O */
    private final Context f114998O;

    /* renamed from: P */
    private long f114999P;

    /* renamed from: Q */
    private boolean f115000Q = true;

    /* renamed from: R */
    private final bfpa f115001R;

    /* renamed from: a */
    public final bfre f115002a;

    /* renamed from: b */
    public final bfrn f115003b;

    /* renamed from: c */
    final bfrd f115004c;

    /* renamed from: d */
    public final bfpc f115005d;

    /* renamed from: e */
    public final sps f115006e;

    /* renamed from: f */
    public final bfkp f115007f;

    /* renamed from: g */
    public final Random f115008g;

    /* renamed from: h */
    public boolean f115009h;

    /* renamed from: i */
    public Location f115010i;

    /* renamed from: j */
    public long f115011j;

    /* renamed from: k */
    public long f115012k;

    /* renamed from: l */
    public long f115013l;

    /* renamed from: m */
    public long f115014m;

    /* renamed from: n */
    public long f115015n;

    /* renamed from: o */
    public Integer f115016o;

    /* renamed from: p */
    public Integer f115017p;

    /* renamed from: q */
    public int f115018q;

    /* renamed from: r */
    public int f115019r;

    /* renamed from: s */
    public int f115020s;

    /* renamed from: t */
    public int f115021t;

    /* renamed from: u */
    public int f115022u;

    /* renamed from: v */
    public int f115023v;

    /* renamed from: w */
    public int f115024w;

    /* renamed from: x */
    public int f115025x;

    /* renamed from: y */
    public long f115026y;

    /* renamed from: z */
    public long f115027z;

    public bfrh(bfpc bfpc, bfpa bfpa, Context context, bfrn bfrn, sps sps, bfkp bfkp) {
        this.f115005d = bfpc;
        this.f115001R = bfpa;
        this.f115003b = bfrn;
        this.f115008g = new Random();
        this.f115009h = false;
        this.f115002a = new bfre();
        this.f115004c = new bfrd(this);
        this.f114998O = context;
        this.f114999P = Long.MIN_VALUE;
        this.f115010i = null;
        this.f115011j = 0;
        this.f115012k = Long.MIN_VALUE;
        this.f115013l = Long.MIN_VALUE;
        this.f115015n = Long.MIN_VALUE;
        this.f115014m = Long.MIN_VALUE;
        this.f115006e = sps;
        this.f115007f = bfkp;
    }

    /* renamed from: a */
    public static long m97611a(Location location) {
        return ayvd.m84899a(ayvd.m84895a(location.getLatitude(), location.getLongitude()), 9);
    }

    /* renamed from: b */
    static int m97613b(Location location) {
        int j = aeim.m51906j(location);
        if (j == 1) {
            return 2;
        }
        if (j != 2) {
            return j != 3 ? 1 : 17;
        }
        return 33;
    }

    /* renamed from: e */
    private final void m97614e() {
        bfrd bfrd = this.f115004c;
        bfrd.f114967a = null;
        bfrd.f114968b = null;
        bfrd.f114969c = null;
        bfrd.f114970d = Long.MIN_VALUE;
        bfrd.f114971e = Long.MIN_VALUE;
        bfrd.f114975i = 0;
        bfrd.f114974h = 0;
        bfrd.f114973g = 0;
        bfrd.f114972f = 0;
        bfrd.f114976j = 0;
        this.f115010i = null;
        this.f115011j = 0;
        this.f114995L = null;
        this.f115009h = false;
        this.f115018q = 0;
        this.f115026y = 0;
        this.f115019r = 0;
        this.f115027z = 0;
        this.f115016o = 1;
        this.f115017p = 1;
        this.f115020s = 0;
        this.f115021t = 0;
        this.f115022u = 0;
        this.f115023v = 0;
        this.f115025x = 0;
        this.f114984A = 0;
        this.f114985B = 0;
        this.f114986C = 0;
        this.f115024w = 0;
    }

    /* renamed from: b */
    public final void mo62178b() {
        this.f114997N = 1;
        this.f114987D = false;
        this.f114988E = Long.MIN_VALUE;
        this.f114989F = 0;
        this.f114994K = null;
        this.f114991H = 0;
        this.f114992I = null;
        this.f114993J = null;
        this.f115000Q = true;
    }

    /* renamed from: c */
    public final boolean mo62179c() {
        return this.f114999P < 0 || SystemClock.elapsedRealtime() - this.f114999P > ceyp.m138440e();
    }

    /* renamed from: d */
    public final void mo62180d() {
        boolean z;
        bfre bfre;
        long j;
        boolean z2 = null;
        if (mo62176a()) {
            Location location = this.f115010i;
            if (location != null) {
                j = m97611a(location);
            } else {
                j = -1;
            }
            bxvd da = bpma.f138193p.mo74144da();
            if (ceyp.f183514a.mo6606a().disablePositiveNumberCheckForS2CellId() || j > 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpma bpma = (bpma) da.f164949b;
                bpma.f138195a |= 1;
                bpma.f138196b = j;
            }
            long j2 = this.f115004c.f114972f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpma bpma2 = (bpma) da.f164949b;
            int i = bpma2.f138195a | 4;
            bpma2.f138195a = i;
            bpma2.f138200f = j2;
            bfrd bfrd = this.f115004c;
            long j3 = bfrd.f114973g;
            int i2 = i | 8;
            bpma2.f138195a = i2;
            bpma2.f138201g = j3;
            long j4 = bfrd.f114976j;
            bpma2.f138195a = i2 | 1024;
            bpma2.f138208n = j4;
            if (!ceyp.f183514a.mo6606a().disableLoggingTtffInTheAggregateLog()) {
                long j5 = this.f115004c.f114970d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpma bpma3 = (bpma) da.f164949b;
                bpma3.f138195a |= 2;
                bpma3.f138199e = j5;
            }
            bfpa bfpa = this.f115001R;
            bxvd da2 = bplp.f138118i.mo74144da();
            List b = bqcr.m112598b(bfpa.f114746a.mo62075a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bplp bplp = (bplp) da2.f164949b;
            if (!bplp.f138121b.mo73666a()) {
                bplp.f138121b = bxvk.m124020a(bplp.f138121b);
            }
            bxsy.m123078a(b, bplp.f138121b);
            List b2 = bqcr.m112598b(bfpa.f114747b.mo62075a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bplp bplp2 = (bplp) da2.f164949b;
            if (!bplp2.f138122c.mo73666a()) {
                bplp2.f138122c = bxvk.m124020a(bplp2.f138122c);
            }
            bxsy.m123078a(b2, bplp2.f138122c);
            List b3 = bqcr.m112598b(bfpa.f114748c.mo62075a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bplp bplp3 = (bplp) da2.f164949b;
            if (!bplp3.f138123d.mo73666a()) {
                bplp3.f138123d = bxvk.m124020a(bplp3.f138123d);
            }
            bxsy.m123078a(b3, bplp3.f138123d);
            List b4 = bqcr.m112598b(bfpa.f114749d.mo62075a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bplp bplp4 = (bplp) da2.f164949b;
            if (!bplp4.f138124e.mo73666a()) {
                bplp4.f138124e = bxvk.m124020a(bplp4.f138124e);
            }
            bxsy.m123078a(b4, bplp4.f138124e);
            int i3 = bfpa.f114750e;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bplp bplp5 = (bplp) da2.f164949b;
            int i4 = bplp5.f138120a | 1;
            bplp5.f138120a = i4;
            bplp5.f138125f = i3;
            int i5 = bfpa.f114751f;
            int i6 = i5 - 1;
            if (i5 != 0) {
                bplp5.f138126g = i6;
                int i7 = i4 | 2;
                bplp5.f138120a = i7;
                int i8 = bfpa.f114752g;
                int i9 = i8 - 1;
                if (i8 != 0) {
                    bplp5.f138127h = i9;
                    bplp5.f138120a = i7 | 4;
                    bfpa.f114750e = 0;
                    bplp bplp6 = (bplp) da2.mo74062i();
                    if (bplp6 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpma bpma4 = (bpma) da.f164949b;
                        bplp6.getClass();
                        bpma4.f138209o = bplp6;
                        bpma4.f138195a |= 2048;
                    }
                    int i10 = this.f115004c.f114974h;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpma bpma5 = (bpma) da.f164949b;
                    int i11 = bpma5.f138195a | 16;
                    bpma5.f138195a = i11;
                    bpma5.f138202h = i10;
                    int i12 = this.f115004c.f114975i;
                    bpma5.f138195a = i11 | 32;
                    bpma5.f138203i = i12;
                    long minutes = TimeUnit.MILLISECONDS.toMinutes(this.f114984A);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpma bpma6 = (bpma) da.f164949b;
                    bpma6.f138195a |= 64;
                    bpma6.f138204j = minutes;
                    long minutes2 = TimeUnit.MILLISECONDS.toMinutes(this.f114985B);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpma bpma7 = (bpma) da.f164949b;
                    int i13 = bpma7.f138195a | 128;
                    bpma7.f138195a = i13;
                    bpma7.f138205k = minutes2;
                    int i14 = this.f114986C;
                    bpma7.f138195a = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bpma7.f138206l = i14;
                    long minutes3 = TimeUnit.MILLISECONDS.toMinutes(ceyp.m138440e());
                    if (minutes3 < 2147483647L) {
                        int i15 = (int) minutes3;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpma bpma8 = (bpma) da.f164949b;
                        bpma8.f138195a |= 512;
                        bpma8.f138207m = i15;
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpma bpma9 = (bpma) da.f164949b;
                        bpma9.f138195a |= 512;
                        bpma9.f138207m = Integer.MAX_VALUE;
                    }
                    SparseArray sparseArray = this.f115004c.f114967a;
                    if (sparseArray != null) {
                        int size = sparseArray.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            bfrf bfrf = (bfrf) this.f115004c.f114967a.valueAt(i16);
                            int keyAt = this.f115004c.f114967a.keyAt(i16);
                            long j6 = (long) bfrf.f114980a;
                            int i17 = bfrf.f114981b;
                            bxvd da3 = bpme.f138233e.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bpme bpme = (bpme) da3.f164949b;
                            int i18 = bpme.f138235a | 1;
                            bpme.f138235a = i18;
                            bpme.f138236b = keyAt;
                            int i19 = i18 | 2;
                            bpme.f138235a = i19;
                            bpme.f138237c = j6;
                            bpme.f138235a = i19 | 4;
                            bpme.f138238d = i17;
                            bpme bpme2 = (bpme) da3.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpma bpma10 = (bpma) da.f164949b;
                            bpme2.getClass();
                            if (!bpma10.f138197c.mo73666a()) {
                                bpma10.f138197c = bxvk.m124021a(bpma10.f138197c);
                            }
                            bpma10.f138197c.add(bpme2);
                        }
                    }
                    SparseArray sparseArray2 = this.f115004c.f114968b;
                    if (sparseArray2 != null) {
                        int size2 = sparseArray2.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            bfrg bfrg = (bfrg) this.f115004c.f114968b.valueAt(i20);
                            int keyAt2 = this.f115004c.f114968b.keyAt(i20);
                            int i21 = keyAt2 / 1000;
                            int i22 = keyAt2 % 1000;
                            long j7 = (long) bfrg.f114982a;
                            long j8 = (long) bfrg.f114983b;
                            bxvd da4 = bpmf.f138239f.mo74144da();
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bpmf bpmf = (bpmf) da4.f164949b;
                            int i23 = bpmf.f138241a | 1;
                            bpmf.f138241a = i23;
                            bpmf.f138242b = i21;
                            int i24 = i23 | 2;
                            bpmf.f138241a = i24;
                            bpmf.f138243c = i22;
                            int i25 = i24 | 4;
                            bpmf.f138241a = i25;
                            bpmf.f138244d = j7;
                            bpmf.f138241a = i25 | 8;
                            bpmf.f138245e = j8;
                            bpmf bpmf2 = (bpmf) da4.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpma bpma11 = (bpma) da.f164949b;
                            bpmf2.getClass();
                            if (!bpma11.f138198d.mo73666a()) {
                                bpma11.f138198d = bxvk.m124021a(bpma11.f138198d);
                            }
                            bpma11.f138198d.add(bpmf2);
                        }
                    }
                    bpma bpma12 = (bpma) da.mo74062i();
                    bfpc bfpc = this.f115005d;
                    ArrayList arrayList = this.f115004c.f114969c;
                    bpkr a = this.f115002a.mo62170a();
                    if (!(bpma12 == null && arrayList == null)) {
                        bxvd da5 = bpmc.f138211m.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bpmc bpmc = (bpmc) da5.f164949b;
                        bpmc.f138219g = 1;
                        int i26 = bpmc.f138213a | 16;
                        bpmc.f138213a = i26;
                        if (a != null) {
                            a.getClass();
                            bpmc.f138218f = a;
                            i26 |= 8;
                            bpmc.f138213a = i26;
                        }
                        if (bpma12 != null) {
                            bpma12.getClass();
                            bpmc.f138214b = bpma12;
                            bpmc.f138213a = i26 | 1;
                        }
                        if (arrayList != null && !arrayList.isEmpty()) {
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bpmc bpmc2 = (bpmc) da5.f164949b;
                            if (!bpmc2.f138215c.mo73666a()) {
                                bpmc2.f138215c = bxvk.m124021a(bpmc2.f138215c);
                            }
                            bxsy.m123078a(arrayList, bpmc2.f138215c);
                        }
                        bfpc.mo62082a((bpmc) da5.mo74062i());
                    }
                    m97614e();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        this.f114999P = SystemClock.elapsedRealtime();
        if (((double) this.f115008g.nextFloat()) < ceyp.f183514a.mo6606a().locationQualityFlpStatsSamplingRate()) {
            z = true;
        } else {
            z = false;
        }
        this.f115009h = z;
        this.f115009h = z & aeri.m52434a(this.f114998O);
        if (mo62176a()) {
            this.f115002a.f114978a = Integer.toString(2023);
            int a2 = bhcc.m100622a(this.f114998O);
            if (a2 == 0) {
                bfre = this.f115002a;
            } else if (a2 != 1) {
                this.f115002a.f114979b = true;
                return;
            } else {
                bfre = this.f115002a;
                z2 = false;
            }
            bfre.f114979b = z2;
        }
    }

    /* renamed from: a */
    public static long m97612a(Location location, Location location2) {
        int i = Build.VERSION.SDK_INT;
        return TimeUnit.NANOSECONDS.toMillis(location2.getElapsedRealtimeNanos() - location.getElapsedRealtimeNanos());
    }

    /* renamed from: a */
    public final bplm mo62171a(boolean z, boolean z2) {
        bxvd da = bplm.f138109f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bplm bplm = (bplm) da.f164949b;
        int i = bplm.f138111a | 1;
        bplm.f138111a = i;
        bplm.f138112b = z;
        bplm.f138111a = i | 2;
        bplm.f138113c = z2;
        Integer num = this.f115016o;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplm bplm2 = (bplm) da.f164949b;
            bplm2.f138111a |= 4;
            bplm2.f138114d = intValue;
        }
        Integer num2 = this.f115017p;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplm bplm3 = (bplm) da.f164949b;
            bplm3.f138111a |= 8;
            bplm3.f138115e = intValue2;
        }
        return (bplm) da.mo74062i();
    }

    /* renamed from: a */
    public final bplt mo62172a(Location location, boolean z, boolean z2, boolean z3, long j, long j2) {
        long j3 = j2;
        bxvd da = bplt.f138150p.mo74144da();
        long j4 = this.f115011j;
        if (j4 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt = (bplt) da.f164949b;
            bplt.f138152a |= 1;
            bplt.f138153b = j4;
        }
        if (location != null) {
            int b = m97613b(location) - 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt2 = (bplt) da.f164949b;
            int i = bplt2.f138152a | 1024;
            bplt2.f138152a = i;
            bplt2.f138161j = b;
            bplt2.f138152a = i | 512;
            bplt2.f138160i = false;
            if (z) {
                if (location.getAccuracy() > 0.0f) {
                    int accuracy = (int) location.getAccuracy();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bplt bplt3 = (bplt) da.f164949b;
                    bplt3.f138152a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                    bplt3.f138165n = accuracy;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (location.getVerticalAccuracyMeters() > 0.0f) {
                    int verticalAccuracyMeters = (int) location.getVerticalAccuracyMeters();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bplt bplt4 = (bplt) da.f164949b;
                    bplt4.f138152a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    bplt4.f138166o = verticalAccuracyMeters;
                }
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt5 = (bplt) da.f164949b;
            bplt5.f138152a |= 512;
            bplt5.f138160i = false;
            int i3 = Build.VERSION.SDK_INT;
            long elapsedRealtime = SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt6 = (bplt) da.f164949b;
            bplt6.f138152a |= 64;
            bplt6.f138158g = elapsedRealtime;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt7 = (bplt) da.f164949b;
            int i4 = bplt7.f138152a | 512;
            bplt7.f138152a = i4;
            bplt7.f138160i = true;
            bplt7.f138152a = i4 | 2048;
            bplt7.f138162k = j;
        }
        bplt bplt8 = (bplt) da.f164949b;
        int i5 = bplt8.f138152a | 4;
        bplt8.f138152a = i5;
        bplt8.f138154c = z2;
        bplt8.f138152a = i5 | 8;
        bplt8.f138155d = z3;
        Integer num = this.f115016o;
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt9 = (bplt) da.f164949b;
            bplt9.f138152a |= 4096;
            bplt9.f138163l = intValue;
        }
        Integer num2 = this.f115017p;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt10 = (bplt) da.f164949b;
            bplt10.f138152a |= 8192;
            bplt10.f138164m = intValue2;
        }
        if (j3 > 0) {
            bplt bplt11 = (bplt) da.f164949b;
            bplt11.f138152a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bplt11.f138159h = j3;
        }
        if (ceyp.f183514a.mo6606a().fixTimeSinceLocationEnabledForOldVersion()) {
            int i6 = Build.VERSION.SDK_INT;
        }
        if (this.f115015n > 0) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.f115015n;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt12 = (bplt) da.f164949b;
            bplt12.f138152a |= 16;
            bplt12.f138156e = elapsedRealtime2;
        } else if (this.f115014m > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f115014m;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt13 = (bplt) da.f164949b;
            bplt13.f138152a |= 16;
            bplt13.f138156e = currentTimeMillis;
        }
        if (this.f115013l > 0) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - this.f115013l;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bplt bplt14 = (bplt) da.f164949b;
            bplt14.f138152a |= 32;
            bplt14.f138157f = elapsedRealtime3;
        }
        return (bplt) da.mo74062i();
    }

    /* renamed from: a */
    public final String mo62173a(int i, String str) {
        bfrf bfrf;
        SparseArray sparseArray = this.f115004c.f114967a;
        if (sparseArray == null || (bfrf = (bfrf) sparseArray.get(i - 1)) == null) {
            StringBuilder sb = new StringBuilder(str.length() + 12);
            sb.append("0 ");
            sb.append(str);
            sb.append(" locations");
            return sb.toString();
        }
        int i2 = bfrf.f114980a;
        int i3 = bfrf.f114981b;
        StringBuilder sb2 = new StringBuilder(str.length() + 48);
        sb2.append(i2);
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" locations, avg accuracy ");
        sb2.append(i3);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo62174a(int i, Location location, long j, int i2, ArrayList arrayList, ArrayList arrayList2, bplm bplm) {
        int i3 = i;
        long j2 = j;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (j2 >= 0) {
            bxvd da = bpls.f138139j.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpls bpls = (bpls) da.f164949b;
            int i4 = i3 - 1;
            if (i3 != 0) {
                bpls.f138142b = i4;
                bpls.f138141a |= 1;
                if (location != null) {
                    long a = m97611a(location);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpls bpls2 = (bpls) da.f164949b;
                    bpls2.f138141a |= 2;
                    bpls2.f138143c = a;
                    int b = m97613b(location) - 1;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpls bpls3 = (bpls) da.f164949b;
                    bpls3.f138141a |= 32;
                    bpls3.f138149i = b;
                }
                bpls bpls4 = (bpls) da.f164949b;
                bplm.getClass();
                bpls4.f138144d = bplm;
                int i5 = bpls4.f138141a | 4;
                bpls4.f138141a = i5;
                if (j2 > 0) {
                    int i6 = i5 | 8;
                    bpls4.f138141a = i6;
                    bpls4.f138145e = j2;
                    if (this.f115000Q) {
                        bpls4.f138141a = i6 | 16;
                        bpls4.f138146f = i2;
                    }
                    if (arrayList3 != null) {
                        if (!bpls4.f138147g.mo73666a()) {
                            bpls4.f138147g = bxvk.m124019a(bpls4.f138147g);
                        }
                        bxsy.m123078a(arrayList3, bpls4.f138147g);
                    }
                    if (arrayList4 != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpls bpls5 = (bpls) da.f164949b;
                        if (!bpls5.f138148h.mo73666a()) {
                            bpls5.f138148h = bxvk.m124019a(bpls5.f138148h);
                        }
                        bxsy.m123078a(arrayList4, bpls5.f138148h);
                    }
                }
                bfpc bfpc = this.f115005d;
                bpls bpls6 = (bpls) da.mo74062i();
                bpkr a2 = this.f115002a.mo62170a();
                bxvd da2 = bpmc.f138211m.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpmc bpmc = (bpmc) da2.f164949b;
                bpmc.f138219g = 5;
                int i7 = bpmc.f138213a | 16;
                bpmc.f138213a = i7;
                if (bpls6 != null) {
                    bpls6.getClass();
                    bpmc.f138221i = bpls6;
                    i7 |= 64;
                    bpmc.f138213a = i7;
                }
                if (a2 != null) {
                    a2.getClass();
                    bpmc.f138218f = a2;
                    bpmc.f138213a = i7 | 8;
                }
                bfpc.mo62082a((bpmc) da2.mo74062i());
                if (i3 == 3) {
                    this.f115021t++;
                } else if (i3 == 2) {
                    this.f115022u++;
                } else {
                    this.f115023v++;
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo62175a(LocationAvailability locationAvailability) {
        long j;
        if (this.f114992I == null) {
            this.f114992I = new ArrayList();
        }
        this.f114992I.add(Integer.valueOf(locationAvailability.f79345b));
        if (this.f114993J == null) {
            this.f114993J = new ArrayList();
        }
        this.f114993J.add(Integer.valueOf(locationAvailability.f79344a));
        bfrn bfrn = this.f115003b;
        if (bfrn != null) {
            j = bfrn.f115038f;
        } else {
            j = 0;
        }
        if (j == 0) {
            this.f115000Q = false;
            this.f114991H = 0;
        }
        if (!this.f115000Q) {
            return;
        }
        if (this.f114990G > 0) {
            this.f114991H = (int) (((long) this.f114991H) + ((SystemClock.elapsedRealtime() - this.f114990G) / j));
        } else {
            this.f114991H = (int) (((long) this.f114991H) + ((SystemClock.elapsedRealtime() - this.f115013l) / j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62176a() {
        if (!aeri.m52434a(this.f114998O)) {
            m97614e();
            this.f115009h = false;
        }
        return this.f115009h;
    }

    /* renamed from: a */
    public final boolean mo62177a(String str, String str2) {
        return svr.m36484b(this.f114998O).mo26171a(str2, str) == 0;
    }
}
