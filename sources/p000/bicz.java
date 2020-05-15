package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bicz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bicz implements bhqx, bigv {

    /* renamed from: a */
    static final long f120268a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    public final bicx f120269b;

    /* renamed from: c */
    public final bigx f120270c;

    /* renamed from: d */
    public final bhqy f120271d;

    /* renamed from: e */
    public final Set f120272e;

    /* renamed from: f */
    public boolean f120273f = cggg.m145198b();

    /* renamed from: g */
    private final Context f120274g;

    /* renamed from: h */
    private int f120275h = -1;

    /* renamed from: i */
    private bhub f120276i = null;

    /* renamed from: j */
    private long f120277j = -1;

    /* renamed from: k */
    private bhtu f120278k = null;

    /* renamed from: l */
    private long f120279l = -1;

    /* renamed from: m */
    private aeat f120280m;

    public bicz(Context context, bigx bigx, bhqy bhqy, bicx bicx) {
        this.f120274g = context;
        this.f120270c = bigx;
        this.f120271d = bhqy;
        ((bhsi) bhqy).f119451f = this;
        this.f120269b = bicx;
        this.f120272e = new HashSet();
    }

    /* renamed from: b */
    private final void m101988b() {
        aeat aeat = this.f120280m;
        if (aeat != null) {
            aeat.mo33986a("Places.PlacesTaskChimeraService.PREFETCHING_TASK_TAG", "com.google.android.location.places.PlacesTaskService");
            this.f120280m = null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v26, types: [bhqy, bhsj], assign insn: 0x00a7: IGET  (r7v26 ? I:bhqy) = (r0v0 'this' bicz A[THIS]) bicz.d bhqy */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo64538a() {
        char c;
        int i;
        bhvs bhvs;
        int i2 = 0;
        if (this.f120272e.isEmpty()) {
            this.f120271d.mo64175a();
            this.f120275h = -1;
            m101988b();
        } else {
            HashSet<String> hashSet = new HashSet();
            int i3 = -1;
            for (bjdg bjdg : this.f120272e) {
                String str = bjdg.f122540c;
                if (str != null && cggg.m145198b()) {
                    hashSet.add(str);
                }
                int i4 = bjdg.f122541d;
                if (i4 == 1 || i4 == 2) {
                    i3 = 1;
                } else if (i4 == 0 && i3 != 1) {
                    i3 = 0;
                }
            }
            if (cggv.f186908a.mo6606a().mo83770e()) {
                if (hashSet.isEmpty()) {
                    m101988b();
                } else if (this.f120280m == null) {
                    aebi aebi = new aebi();
                    aebi.mo34004a(cggv.f186908a.mo6606a().mo83768c(), cggv.f186908a.mo6606a().mo83767b());
                    aebi.f63097i = "com.google.android.location.places.PlacesTaskService";
                    aebi.mo34023a(1);
                    aebi.f63099k = "Places.PlacesTaskChimeraService.PREFETCHING_TASK_TAG";
                    aebi.mo34024a(1, 1);
                    aebi.mo34027b(1);
                    aeat a = aeat.m51532a(this.f120274g);
                    this.f120280m = a;
                    a.mo33984a(aebi.mo33974b());
                }
            }
            ? r7 = this.f120271d;
            bhuj.m101555a();
            int size = hashSet.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("Start with mode: ");
            sb.append(i3);
            sb.append(" and ");
            sb.append(size);
            sb.append(" accounts");
            sb.toString();
            bhsi bhsi = (bhsi) r7;
            bhsi.f119454i = i3;
            if (!bhsi.f119449d) {
                bhsi.f119447b.mo64317a(2, 2, bhsi.m101448a(i3));
                bhsi.f119449d = true;
                bicw bicw = bhsi.f119460o;
                if (bicw.f120257f == null) {
                    byte[] bArr = new bide(new File(bicw.f120252a.getFilesDir(), "place_cache_keyfile")).f120288a;
                    bhsx bhsx = new bhsx(new SecretKeySpec(Arrays.copyOf(bArr, bArr.length), "AES"));
                    String valueOf = String.valueOf(bicw.f120252a.getCacheDir());
                    String str2 = File.separator;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(str2).length());
                    sb2.append(valueOf);
                    sb2.append(str2);
                    sb2.append("place_inference_data_index");
                    File file = new File(sb2.toString());
                    if (file.exists() && file.isDirectory()) {
                        file.renameTo(bicw.mo64528a());
                    }
                    File a2 = bicw.mo64528a();
                    bict bict = (bict) bicw.f120253b;
                    bidf bidf = bict.f120238a;
                    ExecutorService executorService = bicw.f120254c;
                    Executor executor = bict.f120239b;
                    bicy bicy = bicw.f120258g;
                    bicw.f120257f = new bhtl(a2, bhsx, executorService, executor, bicw.f120255d);
                }
                bhtp bhtp = bicw.f120257f;
                bict bict2 = (bict) bicw.f120253b;
                bidf bidf2 = bict2.f120238a;
                bhsi.f119461p = new bhsk(new bhso(new bhvu(bict2.f120244g, bict2.f120241d), bhtp, bicw.f120255d, bicw.f120258g), ((bict) bicw.f120253b).f120245h);
                bhsk bhsk = bhsi.f119461p;
                bhty bhty = bhsi.f119455j;
                bhsk.f119463a = r7;
                bhso bhso = bhsk.f119464b;
                Arrays.fill(bhso.f119482g, -bicy.m101983b());
                bhso.f119485j = bhsk;
                bhtl bhtl = (bhtl) bhso.f119477b;
                bhtl.f119558i = bhty;
                bhtl.f119556g.execute(new bhtc(bhtl));
                bhso.f119483h = bhty;
                bhvu bhvu = bhso.f119476a;
                bhvu.f119706c = bhso;
                bhvu.f119705b = bhty;
                bhsi.f119446a.mo64188a().mo64142a();
                bhsi.f119453h = new bhwv(((bict) bhsi.f119446a).f120245h);
                bhrp bhrp = bhsi.f119458m;
                bhwv bhwv = bhsi.f119453h;
                bhrm bhrm = bhrp.f119393a;
                bhrs bhrs = new bhrs();
                bict bict3 = (bict) bhrm;
                bidf bidf3 = bict3.f120238a;
                bhsi.f119450e = new bhrt(bhrm, bhwv, bhrs, null, bhrt.m101405a(bict3.f120242e), null);
                bhsi.f119450e.mo64192a(bhsi.f119459n);
            }
            bhsi.f119450e.mo64190a(bhsi.f119454i);
            HashSet<String> hashSet2 = new HashSet();
            for (String str3 : bhsi.f119448c.keySet()) {
                if (!hashSet.contains(str3)) {
                    hashSet2.add(str3);
                }
            }
            for (String str4 : hashSet2) {
                ((bhro) bhsi.f119448c.remove(str4)).mo64195b();
            }
            for (String str5 : hashSet) {
                bhro bhro = (bhro) bhsi.f119448c.get(str5);
                if (bhro == null) {
                    bicw bicw2 = bhsi.f119460o;
                    bhtm bhtm = new bhtm();
                    bicx bicx = ((bict) bicw2.f120253b).f120241d;
                    if (!cgfx.f186796a.mo6606a().mo83666e()) {
                        bhvs = new bhwa(bicw2.f120252a, bicw2.f120256e, str5, bicx);
                    } else {
                        Context context = bicw2.f120252a;
                        Handler handler = bicw2.f120256e;
                        bicy bicy2 = bicw2.f120258g;
                        baso a3 = bash.m87488a(context, handler, handler);
                        handler.getClass();
                        bhvs = new bhwb(a3, new bicv(handler), str5, bicx);
                    }
                    bhrn bhrn = new bhrn(new bhst(bicw2.f120257f, bhvs, bicw2.f120258g, bhtm), new bhwu(bicw2.f120257f, bhtm));
                    bhrp bhrp2 = bhsi.f119458m;
                    bhwv bhwv2 = bhsi.f119453h;
                    bhsq bhsq = bhrn.f119391a;
                    bhsk bhsk2 = bhsi.f119461p;
                    bhwu bhwu = bhrn.f119392b;
                    bhrm bhrm2 = bhrp2.f119393a;
                    bict bict4 = (bict) bhrm2;
                    bidf bidf4 = bict4.f120238a;
                    bhro bhrt = new bhrt(bhrm2, bhwv2, bhsq, str5, bhrt.m101405a(bict4.f120242e), new bhws(bhsk2, bhwu));
                    bhrt.mo64192a(bhsi.f119459n);
                    bhsi.f119448c.put(str5, bhrt);
                    bhro = bhrt;
                }
                bhro.mo64190a(bhsi.f119454i);
            }
            bhty bhty2 = bhsi.f119455j;
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = hashSet.size();
            int i5 = bhsi.f119454i;
            while (bhty2.f119599n.size() >= 10) {
                bhty2.f119599n.remove();
            }
            bhty2.f119599n.add(String.format(Locale.US, "Centralized place inference engine was started at: %d with %d active accounts and in mode: %d", Long.valueOf(currentTimeMillis), Integer.valueOf(size2), Integer.valueOf(i5)));
            this.f120275h = i3;
        }
        bicx bicx2 = this.f120269b;
        HashSet<Integer> hashSet3 = new HashSet();
        for (bjdg bjdg2 : this.f120272e) {
            String str6 = bjdg2.f122539b;
            switch (str6.hashCode()) {
                case -1958346218:
                    if (str6.equals("com.google.android.googlequicksearchbox")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 40719148:
                    if (str6.equals("com.google.android.apps.maps")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 325967270:
                    if (str6.equals("com.google.android.gms")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 348375004:
                    if (str6.equals("com.google.android.apps.walletnfcrel")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1246496707:
                    if (str6.equals("com.google.android.settings.intelligence")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1940970770:
                    if (str6.equals("com.google.android.apps.gmm")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                i = c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? str6.hashCode() : 6 : 5 : 4 : 3 : 2;
            } else {
                i = 1;
            }
            hashSet3.add(Integer.valueOf(i));
        }
        int[] iArr = new int[hashSet3.size()];
        for (Integer num : hashSet3) {
            iArr[i2] = num.intValue();
            i2++;
        }
        bicx2.f120259a = iArr;
    }

    /* renamed from: a */
    public final void mo64455a(aehl aehl) {
    }

    /* renamed from: a */
    public final void mo64457a(Location location, bhwr bhwr, boolean z, bhtr bhtr) {
        float f;
        String str;
        float f2;
        bhtu bhtu;
        bhtu bhtu2;
        boolean z2;
        long j;
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        bhxb bhxb;
        bhsi bhsi;
        bhsv bhsv;
        bhsi bhsi2;
        int i5;
        int i6 = this.f120275h;
        if (i6 != -1 && i6 != 0 && !cghb.m145407c()) {
            int i7 = Build.VERSION.SDK_INT;
            boolean isFromMockProvider = location.isFromMockProvider();
            long time = location.getTime();
            int latitude = (int) (location.getLatitude() * 1.0E7d);
            int longitude = (int) (location.getLongitude() * 1.0E7d);
            double accuracy = (double) location.getAccuracy();
            Double.isNaN(accuracy);
            int i8 = (int) (accuracy * 1000.0d);
            if (location.hasAltitude()) {
                f = (float) location.getAltitude();
            } else {
                f = Float.NaN;
            }
            Bundle extras = location.getExtras();
            if (extras == null) {
                str = "unknown";
            } else {
                int i9 = extras.getInt("locationType", 0);
                str = i9 != 1 ? i9 != 2 ? i9 != 3 ? "unknown" : "wifi" : "cell" : "gps";
            }
            if (location.hasSpeed()) {
                f2 = location.getSpeed();
            } else {
                f2 = -1.0f;
            }
            bhub bhub = new bhub(latitude, longitude, i8, f, str, time, f2);
            if (this.f120278k == null || this.f120279l + f120268a <= SystemClock.elapsedRealtime()) {
                this.f120278k = null;
                this.f120279l = -1;
                bhtu = null;
            } else {
                bhtu = this.f120278k;
            }
            float accuracy2 = location.getAccuracy();
            float speed = location.getSpeed();
            long time2 = location.getTime();
            bhub bhub2 = this.f120276i;
            if (bhub2 != null) {
                bhtu2 = bhtu;
                z2 = isFromMockProvider;
                f3 = (float) ayuo.m84843a(bhub2.f119605a, bhub2.f119606b, (int) (location.getLatitude() * 1.0E7d), (int) (location.getLongitude() * 1.0E7d));
                j = time2 - this.f120277j;
            } else {
                bhtu2 = bhtu;
                z2 = isFromMockProvider;
                f3 = -1.0f;
                j = -1;
            }
            if (bhwr != null) {
                i = bhwr.mo64366a();
            } else {
                i = -1;
            }
            bicx bicx = this.f120269b;
            bxvd da = bpnk.f138412g.mo74144da();
            int i10 = (int) (accuracy2 * 10.0f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpnk bpnk = (bpnk) da.f164949b;
            int i11 = bpnk.f138414a | 1;
            bpnk.f138414a = i11;
            bpnk.f138415b = i10;
            if (f3 != -1.0f) {
                i2 = (int) (f3 * 10.0f);
            } else {
                i2 = -1;
            }
            int i12 = i11 | 2;
            bpnk.f138414a = i12;
            bpnk.f138416c = i2;
            int i13 = i12 | 4;
            bpnk.f138414a = i13;
            bpnk.f138417d = (int) j;
            int i14 = i13 | 8;
            bpnk.f138414a = i14;
            bpnk.f138418e = (int) (speed * 10.0f);
            bpnk.f138414a = i14 | 16;
            bpnk.f138419f = i;
            bpnk bpnk2 = (bpnk) da.mo74062i();
            bpoh a = bicx.mo64530a();
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpoh bpoh = (bpoh) bxvd.f164949b;
            bpoh bpoh2 = bpoh.f138508s;
            bpoh.f138512c = 7;
            bpoh.f138510a |= 2;
            bxvd da2 = bpnf.f138397e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpnf bpnf = (bpnf) da2.f164949b;
            bpnf.f138400b = 1;
            int i15 = bpnf.f138399a | 1;
            bpnf.f138399a = i15;
            if (bpnk2 != null) {
                bpnk2.getClass();
                bpnf.f138401c = bpnk2;
                bpnf.f138399a = i15 | 2;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpoh bpoh3 = (bpoh) bxvd.f164949b;
            bpnf bpnf2 = (bpnf) da2.mo74062i();
            bpnf2.getClass();
            bpoh3.f138523n = bpnf2;
            bpoh3.f138510a |= 4096;
            bicx.mo64534a((bpoh) bxvd.mo74062i());
            this.f120276i = bhub;
            this.f120277j = time;
            bhtx bhtx = new bhtx(bhub, bhwr, bhtu2, bhtr, z, z2);
            bhsi bhsi3 = (bhsi) this.f120271d;
            if (bhsi3.f119449d) {
                int i16 = bhsi3.f119454i;
                if (i16 == -1 || i16 == 0) {
                    bhuj.m101555a();
                    return;
                }
                bhwr bhwr2 = bhtx.f119581b;
                if (bhwr2 != null) {
                    i3 = bhwr2.mo64366a();
                } else {
                    i3 = 0;
                }
                if (bhtx.f119582c != null) {
                    bhuj.m101555a();
                    Locale locale = Locale.US;
                    i4 = 3;
                    Object[] objArr = {"location", Integer.valueOf(i3), Integer.valueOf(bhtx.f119582c.f119573a.size())};
                } else {
                    i4 = 3;
                    bhuj.m101555a();
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {"location", Integer.valueOf(i3)};
                }
                bhxb b = bhsi3.f119456k.mo64376b(bhtx);
                bhuj.m101555a();
                int i17 = b.f119774a;
                String valueOf = String.valueOf(b.f119775b.f119765a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                sb.append("SegmenterResult{action=");
                sb.append(i17);
                sb.append(",currentSegmentType=");
                sb.append(valueOf);
                sb.append("}");
                sb.toString();
                bhsi3.f119452g = b.f119775b;
                if (b.f119775b.f119765a == bpol.IN_TRANSIT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bhsv bhsv2 = new bhsv(i4, z3);
                bhuj.m101555a();
                boolean z4 = bhsv2.f119503b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Transit decision inTransit=");
                sb2.append(z4);
                sb2.toString();
                bicy bicy = ((bict) bhsi3.f119446a).f120245h;
                if (cggm.f186849a.mo6606a().mo83719J()) {
                    boolean z5 = bhsi3.f119457l.mo64376b(bhtx).f119775b.f119765a == bpol.IN_TRANSIT;
                    bhuj.m101555a();
                    Object[] objArr3 = {Boolean.valueOf(bhsv2.f119503b), Boolean.valueOf(z5)};
                    bhsv2 = new bhsv(4, z5);
                }
                bicy bicy2 = ((bict) bhsi3.f119446a).f120245h;
                if (!cgfi.f186720a.mo6606a().mo83592b()) {
                    bhsi = bhsi3;
                    bhxb = b;
                    bhsv = bhsv2;
                } else if (b.f119775b.f119765a == bpol.AT_PLACE) {
                    bhts bhts = b.f119775b.f119768d;
                    bhub bhub3 = bhts.f119568b;
                    if (bhub3 != null) {
                        bhud bhud = bhts.f119567a;
                        if (bhud.f119617d != null) {
                            bhsi = bhsi3;
                            bhxb = b;
                            bhsv = bhsv2;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int i18 = 0;
                            while (true) {
                                C1245ok okVar = bhud.f119614a;
                                if (i18 >= okVar.f26809h) {
                                    break;
                                }
                                bhwq bhwq = (bhwq) okVar.mo15620b(i18);
                                arrayList.add(new bhwq(bhwq.f119744b, (int) ((Float) bhud.f119614a.mo15621c(i18)).floatValue(), bhwq.f119745c, bhwq.f119747e, bhwq.f119743a));
                                i18++;
                                bhsi3 = bhsi3;
                                b = b;
                                bhsv2 = bhsv2;
                            }
                            bhsi = bhsi3;
                            bhxb = b;
                            bhsv = bhsv2;
                            bhud.f119617d = new bhwr(bhud.f119616c, arrayList);
                        }
                        bhtx = new bhtx(bhub3, bhud.f119617d, bhts.f119569c, null, false, bhts.f119570d);
                    } else {
                        bhsi = bhsi3;
                        bhxb = b;
                        bhsv = bhsv2;
                        bhtx = null;
                    }
                } else {
                    bhsi = bhsi3;
                    bhxb = b;
                    bhsv = bhsv2;
                }
                bhxb bhxb2 = bhxb;
                if (bhxb2.f119774a == 0) {
                    bhsi2 = bhsi;
                    for (bhro bhro : bhsi2.f119448c.values()) {
                        bhro.mo64190a(bhsi2.f119454i);
                    }
                    bhsi2.f119450e.mo64190a(bhsi2.f119454i);
                } else {
                    bhsi2 = bhsi;
                }
                if (bhsi2.f119454i == 1) {
                    bicy bicy3 = ((bict) bhsi2.f119446a).f120245h;
                    if (!cggg.f186820a.mo6606a().mo83693k() || bhxb2.f119775b.f119765a == bpol.AT_PLACE) {
                        bhuj.m101555a();
                        bhsk bhsk = bhsi2.f119461p;
                        if (bhsk.f119463a != null) {
                            bhub bhub4 = bhtx.f119580a;
                            if (bhsk.f119465c.f120267a) {
                                i5 = (int) cggm.f186849a.mo6606a().mo83741t();
                            } else {
                                i5 = (int) cggm.f186849a.mo6606a().mo83740s();
                            }
                            List a2 = bhug.m101542a(bhtx.f119580a, i5);
                            bhso bhso = bhsk.f119464b;
                            bhso.f119480e = bhtx;
                            bhso.f119479d = a2;
                            bhso.f119481f = 0;
                            bhso.mo64223a(bhtx, a2, bhsv);
                        } else {
                            bhuj.m101555a();
                        }
                        bhsi2.f119446a.mo64188a().mo64147c();
                        return;
                    }
                    bhuj.m101555a();
                    bhsi2.mo64220a(bhsi2.mo64219a((String) null));
                    for (String str2 : bhsi2.f119448c.keySet()) {
                        bhsi2.mo64220a(bhsi2.mo64219a(str2));
                    }
                    return;
                }
                return;
            }
            bhuj.m101555a();
        }
    }

    /* renamed from: a */
    public final void mo64174a(bhqz bhqz) {
        if (bhqz.f119364f != null) {
            for (bjdg bjdg : this.f120272e) {
                String str = bjdg.f122540c;
                if (str != null && str.equals(bhqz.f119364f)) {
                    bjdg.mo64999a(bhqz);
                }
            }
        } else if (cggg.m145198b()) {
            for (bjdg bjdg2 : this.f120272e) {
                if (bjdg2.f122540c == null) {
                    bjdg2.mo64999a(bhqz);
                }
            }
        } else {
            for (bjdg bjdg3 : this.f120272e) {
                bjdg3.mo64999a(bhqz);
            }
        }
    }

    /* renamed from: a */
    public final void mo64458a(bhtu bhtu) {
        int i = this.f120275h;
        if (i != -1 && i != 0 && !cghb.m145407c()) {
            List list = bhtu.f119573a;
            bicx bicx = this.f120269b;
            int size = list.size();
            bxvd da = bpnb.f138382c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpnb bpnb = (bpnb) da.f164949b;
            bpnb.f138384a |= 1;
            bpnb.f138385b = size;
            bpnb bpnb2 = (bpnb) da.mo74062i();
            bpoh a = bicx.mo64530a();
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpoh bpoh = (bpoh) bxvd.f164949b;
            bpoh bpoh2 = bpoh.f138508s;
            bpoh.f138512c = 7;
            bpoh.f138510a |= 2;
            bxvd da2 = bpnf.f138397e.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpnf bpnf = (bpnf) da2.f164949b;
            bpnf.f138400b = 2;
            int i2 = bpnf.f138399a | 1;
            bpnf.f138399a = i2;
            if (bpnb2 != null) {
                bpnb2.getClass();
                bpnf.f138402d = bpnb2;
                bpnf.f138399a = i2 | 4;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpoh bpoh3 = (bpoh) bxvd.f164949b;
            bpnf bpnf2 = (bpnf) da2.mo74062i();
            bpnf2.getClass();
            bpoh3.f138523n = bpnf2;
            bpoh3.f138510a |= 4096;
            bicx.mo64534a((bpoh) bxvd.mo74062i());
            this.f120278k = bhtu;
            this.f120279l = SystemClock.elapsedRealtime();
        }
    }
}
