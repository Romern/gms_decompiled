package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bhrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhrt implements bhro, bhsp {

    /* renamed from: e */
    private static final List f119401e = Collections.emptyList();

    /* renamed from: a */
    public final bhrw f119402a;

    /* renamed from: b */
    public long f119403b = -1;

    /* renamed from: c */
    public long f119404c = -1;

    /* renamed from: d */
    public final bidf f119405d;

    /* renamed from: f */
    private final String f119406f;

    /* renamed from: g */
    private final bhrm f119407g;

    /* renamed from: h */
    private final bhsq f119408h;

    /* renamed from: i */
    private final Executor f119409i;

    /* renamed from: j */
    private final Executor f119410j;

    /* renamed from: k */
    private final bhry f119411k;

    /* renamed from: l */
    private final bhuk f119412l;

    /* renamed from: m */
    private final bhws f119413m;

    /* renamed from: n */
    private bhsh f119414n;

    /* renamed from: o */
    private final bicy f119415o;

    public bhrt(bhrm bhrm, bhwv bhwv, bhsq bhsq, String str, List list, bhws bhws) {
        this.f119408h = bhsq;
        this.f119406f = str;
        this.f119413m = bhws;
        this.f119407g = bhrm;
        bict bict = (bict) bhrm;
        this.f119415o = bict.f120245h;
        this.f119410j = bict.f120239b;
        this.f119409i = bict.f120240c;
        this.f119405d = bict.f120238a;
        this.f119412l = bict.f120241d;
        this.f119402a = new bhrw(str, new bhrv(bict.f120245h, bhwv, cggg.f186820a.mo6606a().mo83697o()), list);
        bicy bicy = bict.f120245h;
        if (!cggg.f186820a.mo6606a().mo83695m()) {
            this.f119411k = new bhse(this.f119415o);
        } else {
            this.f119411k = new bhrx();
        }
    }

    /* renamed from: a */
    public static List m101405a(bhva bhva) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bhvb());
        arrayList.add(new bhvj());
        arrayList.add(new bhvl());
        arrayList.add(new bhvk(bhva));
        arrayList.add(new bhuz());
        arrayList.add(new bhvg());
        arrayList.add(new bhvf());
        arrayList.add(new bhvh(bhva));
        return arrayList;
    }

    /* renamed from: c */
    private final void m101407c(bhqi bhqi) {
        bhsh bhsh = this.f119414n;
        if (bhsh == null) {
            bhuj.m101555a().mo64361c(mo64203a("Callback is missing, unable to deliver inferences"));
        } else {
            bhsh.mo64217a(bhqi);
        }
    }

    /* renamed from: b */
    public final void mo64195b() {
        int i;
        bhuk bhuk = this.f119412l;
        if (this.f119406f != null) {
            i = 4;
        } else {
            i = 3;
        }
        bhuk.mo64317a(i, 3, 4);
        bhuj.m101555a();
        mo64203a("PlaceInferenceEngine stop");
        this.f119408h.mo64199a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(float[], float):void}
     arg types: [float[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void} */
    /* renamed from: a */
    private final void m101406a(bhqi bhqi, boolean z, int i) {
        long j;
        boolean z2;
        bhqi bhqi2 = bhqi;
        List list = bhqi2.f119318b;
        int size = list != null ? list.size() : 0;
        int[] iArr = new int[3];
        Arrays.fill(iArr, 0);
        float[] fArr = new float[3];
        Arrays.fill(fArr, -1.0f);
        float f = 0.0f;
        if (bhqi2.f119322f == 0) {
            int i2 = 0;
            for (bhqh bhqh : bhqi2.f119318b) {
                if (bhqh.f119312f != -1.0f) {
                    i2++;
                    f = Math.max(f, bhqh.f119311e);
                }
                int i3 = -bhqh.f119314h;
                if (i3 >= 0 && i3 < 3) {
                    iArr[i3] = iArr[i3] + 1;
                    fArr[i3] = Math.max(fArr[i3], bhqh.f119312f);
                }
            }
            size = i2;
        }
        long j2 = this.f119404c;
        if (j2 >= 0) {
            j = j2 / 1000;
        } else {
            j = -1;
        }
        if (this.f119406f != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = bhqi2.f119327k;
        int i5 = i4 - 1;
        if (i4 != 0) {
            int a = bpnr.m112100a(i5);
            bhuk bhuk = this.f119412l;
            int i6 = (int) j;
            int i7 = bhqi2.f119319c;
            bxvd da = bpof.f138495k.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpof bpof = (bpof) da.f164949b;
            int i8 = bpof.f138497a | 1;
            bpof.f138497a = i8;
            bpof.f138498b = size;
            int i9 = i8 | 2;
            bpof.f138497a = i9;
            double d = (double) f;
            Double.isNaN(d);
            bpof.f138499c = (int) (d * 10000.0d);
            int i10 = i9 | 4;
            bpof.f138497a = i10;
            bpof.f138500d = i6;
            int i11 = i10 | 8;
            bpof.f138497a = i11;
            bpof.f138501e = z;
            int i12 = i11 | 16;
            bpof.f138497a = i12;
            bpof.f138502f = z2;
            int i13 = a - 1;
            if (a != 0) {
                bpof.f138505i = i13;
                int i14 = i12 | 512;
                bpof.f138497a = i14;
                int i15 = i14 | 1024;
                bpof.f138497a = i15;
                bpof.f138506j = i7;
                bpof.f138497a = i15 | 64;
                bpof.f138503g = i;
                for (int i16 = 0; i16 < 3; i16++) {
                    if (iArr[i16] > 0) {
                        bxvd da2 = bpoe.f138489e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpoe bpoe = (bpoe) da2.f164949b;
                        int i17 = bpoe.f138491a | 1;
                        bpoe.f138491a = i17;
                        bpoe.f138492b = i16;
                        int i18 = iArr[i16];
                        int i19 = i17 | 2;
                        bpoe.f138491a = i19;
                        bpoe.f138493c = i18;
                        float f2 = fArr[i16];
                        bpoe.f138491a = i19 | 4;
                        double d2 = (double) f2;
                        Double.isNaN(d2);
                        bpoe.f138494d = (int) (d2 * 10000.0d);
                        bpoe bpoe2 = (bpoe) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpof bpof2 = (bpof) da.f164949b;
                        bpoe2.getClass();
                        if (!bpof2.f138504h.mo73666a()) {
                            bpof2.f138504h = bxvk.m124021a(bpof2.f138504h);
                        }
                        bpof2.f138504h.add(bpoe2);
                    }
                }
                bpof bpof3 = (bpof) da.mo74062i();
                bicx bicx = (bicx) bhuk;
                bpoh a2 = bicx.mo64530a();
                bxvd bxvd = (bxvd) a2.mo74142c(5);
                bxvd.mo73625a((bxvk) a2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bpoh bpoh = (bpoh) bxvd.f164949b;
                bpoh bpoh2 = bpoh.f138508s;
                bpoh.f138512c = 2;
                int i20 = bpoh.f138510a | 2;
                bpoh.f138510a = i20;
                if (bpof3 != null) {
                    bpof3.getClass();
                    bpoh.f138518i = bpof3;
                    bpoh.f138510a = i20 | 128;
                }
                bicx.mo64534a((bpoh) bxvd.mo74062i());
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bhrt.a(bhqi, boolean, int):void
     arg types: [bhqi, int, int]
     candidates:
      bhrt.a(long, java.lang.String, bhub):void
      bhro.a(long, java.lang.String, bhub):void
      bhrt.a(bhqi, boolean, int):void */
    /* renamed from: b */
    public final void mo64205b(bhqi bhqi) {
        this.f119411k.mo64209a(bhqi);
        if (this.f119411k.mo64211a()) {
            m101407c(bhqi);
            m101406a(bhqi, true, bhqi.f119322f);
        } else if (this.f119411k.mo64213c()) {
            int i = bhqi.f119322f;
            bhuj.m101555a();
            StringBuilder sb = new StringBuilder(54);
            sb.append("Force trigger a place update, status code: ");
            sb.append(i);
            mo64203a(sb.toString());
            m101407c(bhqi);
            m101406a(bhqi, true, i);
        } else {
            bhuj.m101555a();
            StringBuilder sb2 = new StringBuilder(71);
            sb2.append("Decided not to trigger a new inference result, status code: 2");
            mo64203a(sb2.toString());
            boolean z = bhqi.f119323g;
            boolean z2 = bhqi.f119325i;
            bhub bhub = bhqi.f119326j;
            if (this.f119414n == null) {
                bhuj.m101555a().mo64361c(mo64203a("Callback is missing, unable to deliver no inferences"));
            } else {
                this.f119414n.mo64217a(bhqi.m101332a(f119401e, SystemClock.elapsedRealtime(), this.f119406f, 2, z, z2, 1, 0, bhub));
            }
            m101406a(bhqi, false, bhqi.f119322f);
        }
        this.f119411k.mo64210a(false);
    }

    /* renamed from: c */
    public final void mo64196c() {
        int a;
        int a2;
        bhws bhws = this.f119413m;
        if (bhws != null) {
            bhwu bhwu = bhws.f119750a;
            if (bhwu.f119754a != null) {
                bhtm bhtm = bhwu.f119755b;
                HashSet hashSet = new HashSet();
                int i = 0;
                while (true) {
                    C1245ok okVar = bhtm.f119562b;
                    if (i >= okVar.f26809h) {
                        bhwu.f119754a.mo64272a(hashSet, new bhwt(new HashSet(), bhws));
                        return;
                    }
                    bvnw bvnw = (bvnw) okVar.mo15621c(i);
                    if ((bvnw.f156973a & 4) != 0) {
                        bxwc bxwc = bvnw.f156975c;
                        int size = bxwc.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            bvnv bvnv = (bvnv) bxwc.get(i2);
                            int a3 = bvns.m121298a(bvnv.f156969b);
                            if (a3 != 0 && a3 == 3 && (((a = bvnu.m121300a(bvnv.f156968a)) != 0 && a == 2) || ((a2 = bvnu.m121300a(bvnv.f156968a)) != 0 && a2 == 3))) {
                                hashSet.add(Long.valueOf(bvnw.f156974b));
                            }
                        }
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64206b(bhtx bhtx, List list) {
        if (!list.isEmpty()) {
            bhuj.m101555a();
            int size = list.size();
            StringBuilder sb = new StringBuilder(30);
            sb.append("Scoring ");
            sb.append(size);
            sb.append(" candidates");
            mo64203a(sb.toString());
            this.f119409i.execute(new bhrq(this, bhtx, list, this.f119407g.mo64188a().mo64149d()));
            return;
        }
        bhqi a = bhqi.m101332a(f119401e, SystemClock.elapsedRealtime(), this.f119406f, 0, bhtx.f119585f, false, 1, 0, null);
        bhuj.m101555a();
        mo64203a("No candidates, generating empty PlaceInference list.");
        mo64204a(a);
    }

    /* renamed from: a */
    public final bhqi mo64189a() {
        bhqi b = this.f119411k.mo64212b();
        long c = (long) ((int) cggm.f186849a.mo6606a().mo83724c());
        if (b == null || c <= 0 || SystemClock.elapsedRealtime() - b.f119320d <= c * 1000) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    public final String mo64203a(String str) {
        String str2 = this.f119406f;
        if (str2 == null) {
            String valueOf = String.valueOf(str);
            return valueOf.length() == 0 ? new String("[anon] ") : "[anon] ".concat(valueOf);
        }
        int hashCode = str2.hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("[account#");
        sb.append(hashCode);
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo64190a(int i) {
        this.f119411k.mo64210a(true);
        if (i == 1 || i == 0) {
            bhwp a = bhuj.m101555a();
            StringBuilder sb = new StringBuilder(35);
            sb.append("Changed inference mode: ");
            sb.append(i);
            a.mo64358a(mo64203a(sb.toString()));
            return;
        }
        bhwp a2 = bhuj.m101555a();
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Unexpected mode, ignored: -1");
        a2.mo64360b(mo64203a(sb2.toString()));
    }

    /* renamed from: a */
    public final void mo64191a(long j, String str, bhub bhub) {
        long j2 = j;
        this.f119408h.mo64200a(j2, str, bhub);
        if (cggg.f186820a.mo6606a().mo83699q()) {
            long millis = TimeUnit.MICROSECONDS.toMillis(j2) - this.f119405d.f120292a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bhqi b = this.f119411k.mo64212b();
            if (millis > elapsedRealtime || (b != null && millis < b.f119320d)) {
                millis = elapsedRealtime;
            }
            mo64204a(bhqi.m101332a(Arrays.asList(new bhqh(str, 0, null, bhqh.f119307a, 0, 1.0f, 1.0f, null, false)), millis, this.f119406f, 0, false, true, 1, 0, bhub));
        }
    }

    /* renamed from: a */
    public final void mo64204a(bhqi bhqi) {
        this.f119410j.execute(new bhrr(this, bhqi));
    }

    /* renamed from: a */
    public final void mo64192a(bhsh bhsh) {
        int i;
        if (bhsh != null) {
            bhuk bhuk = this.f119412l;
            if (this.f119406f == null) {
                i = 3;
            } else {
                i = 4;
            }
            bhuk.mo64317a(i, 2, 4);
            bhuj.m101555a();
            mo64203a("PlaceInferenceEngine start");
            this.f119414n = bhsh;
            this.f119408h.mo64201a(this);
            return;
        }
        throw new NullPointerException("callback can not be null");
    }

    /* renamed from: a */
    public final void mo64193a(bhtx bhtx, List list) {
        bhuj.m101555a();
        int size = list.size();
        StringBuilder sb = new StringBuilder(58);
        sb.append("New signals available and ");
        sb.append(size);
        sb.append(" anonymous candidates");
        mo64203a(sb.toString());
        this.f119408h.mo64202a(bhtx, list);
    }

    /* renamed from: a */
    public final void mo64194a(boolean z) {
        bhuj.m101555a();
        StringBuilder sb = new StringBuilder(50);
        sb.append("Failed to get candidates, status code: ");
        sb.append(18);
        mo64203a(sb.toString());
        mo64205b(bhqi.m101332a(f119401e, SystemClock.elapsedRealtime(), this.f119406f, 18, z, false, 1, 0, null));
    }
}
