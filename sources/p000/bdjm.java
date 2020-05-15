package p000;

import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: bdjm */
final /* synthetic */ class bdjm implements Callable {

    /* renamed from: a */
    private final bdjn f105744a;

    /* renamed from: b */
    private final cimj f105745b;

    public bdjm(bdjn bdjn, cimj cimj) {
        this.f105744a = bdjn;
        this.f105745b = cimj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02fe, code lost:
        if ((r5 / r7) > 3.472222222222222E-5d) goto L_0x0584;
     */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0587  */
    public final Object call() {
        boolean z;
        bxxc bxxc;
        bdjz bdjz;
        HealthStats healthStats;
        boolean commit;
        cios cios;
        Long l;
        cimv cimv;
        cimj cimj;
        cimv cimv2;
        Long l2;
        Boolean bool;
        cimz cimz;
        int length;
        bdjn bdjn = this.f105744a;
        cimj cimj2 = this.f105745b;
        beel.m91856c();
        synchronized (bdjn.f105749c) {
            bdpv bdpv = bdjn.f105749c.f105781a;
            bxxk bxxk = (bxxk) bdqt.f106281k.mo74142c(7);
            z = false;
            byte[] decode = Base64.decode(bdpv.f106239b.getString("primes.battery.snapshot", ""), 0);
            if (decode == null || (length = decode.length) == 0) {
                bxxc = null;
            } else if (decode[0] != 1) {
                bnrq bnrq = (bnrq) bdpv.f106238a.mo68388c();
                bnrq.mo68432a("bdpv", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("wrong header");
                bxxc = null;
            } else {
                try {
                    bxxc = (bxxc) bxxk.mo73658a(decode, 1, length - 1);
                } catch (bxwf e) {
                    bnrq bnrq2 = (bnrq) bdpv.f106238a.mo68388c();
                    bnrq2.mo68437a(e);
                    bnrq2.mo68432a("bdpv", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq2.mo68405a("failure reading proto");
                    bxxc = null;
                }
            }
            bdqt bdqt = (bdqt) bxxc;
            if (bdqt != null) {
                if ((bdqt.f106283a & 32) != 0) {
                    cimj a = cimj.m150575a(bdqt.f106289g);
                    cimj = a != null ? a : cimj.UNKNOWN;
                } else {
                    cimj = null;
                }
                cimv cimv3 = bdqt.f106284b;
                if (cimv3 != null) {
                    cimv2 = cimv3;
                } else {
                    cimv2 = cimv.f190788ar;
                }
                if ((bdqt.f106283a & 2) != 0) {
                    l2 = Long.valueOf(bdqt.f106285c);
                } else {
                    l2 = null;
                }
                Long valueOf = (bdqt.f106283a & 4) != 0 ? Long.valueOf(bdqt.f106286d) : null;
                Long valueOf2 = (bdqt.f106283a & 8) != 0 ? Long.valueOf(bdqt.f106287e) : null;
                Long valueOf3 = (bdqt.f106283a & 16) != 0 ? Long.valueOf(bdqt.f106288f) : null;
                int i = bdqt.f106283a;
                String str = (i & 64) != 0 ? bdqt.f106290h : null;
                if ((i & 128) != 0) {
                    bool = Boolean.valueOf(bdqt.f106291i);
                } else {
                    bool = null;
                }
                if ((bdqt.f106283a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    cimz cimz2 = bdqt.f106292j;
                    if (cimz2 == null) {
                        cimz = cimz.f190878c;
                    } else {
                        cimz = cimz2;
                    }
                } else {
                    cimz = null;
                }
                bdjz = new bdjz(cimv2, l2, valueOf, valueOf2, valueOf3, cimj, str, bool, cimz);
            } else {
                bdjz = null;
            }
        }
        bdjf bdjf = bdjn.f105750d;
        ayte ayte = bdjf.f105733b;
        Long valueOf4 = Long.valueOf(SystemClock.elapsedRealtime());
        ayte ayte2 = bdjf.f105733b;
        Long valueOf5 = Long.valueOf(System.currentTimeMillis());
        SystemHealthManager systemHealthManager = (SystemHealthManager) bdjf.f105732a.f105783a.getSystemService("systemhealth");
        if (systemHealthManager != null) {
            healthStats = systemHealthManager.takeMyUidSnapshot();
        } else {
            healthStats = null;
        }
        bdjh bdjh = bdjf.f105735d;
        bdjz a2 = new bdje(bdjf, valueOf4, valueOf5, healthStats, cimj2, true).mo58083a();
        synchronized (bdjn.f105749c) {
            bdka bdka = bdjn.f105749c;
            bxvd da = bdqt.f106281k.mo74144da();
            cimv cimv4 = a2.f105772a;
            if (cimv4 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt2 = (bdqt) da.f164949b;
                cimv4.getClass();
                bdqt2.f106284b = cimv4;
                bdqt2.f106283a |= 1;
            }
            Long l3 = a2.f105773b;
            if (l3 != null) {
                long longValue = l3.longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt3 = (bdqt) da.f164949b;
                bdqt3.f106283a |= 2;
                bdqt3.f106285c = longValue;
            }
            Long l4 = a2.f105774c;
            if (l4 != null) {
                long longValue2 = l4.longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt4 = (bdqt) da.f164949b;
                bdqt4.f106283a |= 4;
                bdqt4.f106286d = longValue2;
            }
            Long l5 = a2.f105775d;
            if (l5 != null) {
                long longValue3 = l5.longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt5 = (bdqt) da.f164949b;
                bdqt5.f106283a |= 8;
                bdqt5.f106287e = longValue3;
            }
            Long l6 = a2.f105776e;
            if (l6 != null) {
                long longValue4 = l6.longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt6 = (bdqt) da.f164949b;
                bdqt6.f106283a |= 16;
                bdqt6.f106288f = longValue4;
            }
            cimj cimj3 = a2.f105777f;
            if (cimj3 != null) {
                int i2 = cimj3.f190729h;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt7 = (bdqt) da.f164949b;
                bdqt7.f106283a |= 32;
                bdqt7.f106289g = i2;
            }
            String str2 = a2.f105778g;
            if (str2 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt8 = (bdqt) da.f164949b;
                str2.getClass();
                bdqt8.f106283a |= 64;
                bdqt8.f106290h = str2;
            }
            Boolean bool2 = a2.f105779h;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt9 = (bdqt) da.f164949b;
                bdqt9.f106283a |= 128;
                bdqt9.f106291i = booleanValue;
            }
            cimz cimz3 = a2.f105780i;
            if (cimz3 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bdqt bdqt10 = (bdqt) da.f164949b;
                cimz3.getClass();
                bdqt10.f106292j = cimz3;
                bdqt10.f106283a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            bdpv bdpv2 = bdka.f105781a;
            bdqt bdqt11 = (bdqt) da.mo74062i();
            bmxy.m108581a(bdqt11);
            byte[] k = bdqt11.mo73642k();
            int length2 = k.length;
            byte[] bArr = new byte[(length2 + 1)];
            bArr[0] = 1;
            System.arraycopy(k, 0, bArr, 1, length2);
            commit = bdpv2.f106239b.edit().putString("primes.battery.snapshot", Base64.encodeToString(bArr, 0)).commit();
        }
        if (commit) {
            bdjf bdjf2 = bdjn.f105750d;
            if (!(bdjz == null || !Objects.equals(bdjz.f105775d, a2.f105775d) || !Objects.equals(bdjz.f105776e, a2.f105776e) || bdjz.f105773b == null || bdjz.f105774c == null || (l = a2.f105773b) == null || a2.f105774c == null)) {
                bmxy.m108581a(l);
                long longValue5 = l.longValue();
                Long l7 = bdjz.f105773b;
                bmxy.m108581a(l7);
                long longValue6 = longValue5 - l7.longValue();
                Long l8 = a2.f105774c;
                bmxy.m108581a(l8);
                long longValue7 = l8.longValue();
                Long l9 = bdjz.f105774c;
                bmxy.m108581a(l9);
                long longValue8 = longValue7 - l9.longValue();
                if (longValue8 > 0) {
                    long abs = Math.abs(longValue6 - longValue8);
                    if (abs >= 25) {
                        double d = (double) abs;
                        double d2 = (double) longValue8;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                    }
                    bdkc bdkc = bdjf2.f105732a;
                    cimv a3 = bdjw.m90938a(a2.f105772a, bdjz.f105772a);
                    if (a3 != null) {
                        bxvd bxvd = (bxvd) a3.mo74142c(5);
                        bxvd.mo73625a((bxvk) a3);
                        cimu cimu = (cimu) bxvd;
                        bdjp bdjp = bdkc.f105784b;
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190835g);
                        for (int i3 = 0; i3 < ((cimv) cimu.f164949b).f190835g.size(); i3++) {
                            cimu.mo86247e(i3, bdjp.mo58089a(cimu.mo86235a(i3)));
                        }
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190836h);
                        for (int i4 = 0; i4 < ((cimv) cimu.f164949b).f190836h.size(); i4++) {
                            cimu.mo86249f(i4, bdjp.mo58089a(cimu.mo86240b(i4)));
                        }
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190837i);
                        for (int i5 = 0; i5 < ((cimv) cimu.f164949b).f190837i.size(); i5++) {
                            cimu.mo86251g(i5, bdjp.mo58089a(cimu.mo86230G(i5)));
                        }
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190838j);
                        for (int i6 = 0; i6 < ((cimv) cimu.f164949b).f190838j.size(); i6++) {
                            cimu.mo86245d(i6, bdjp.mo58089a(cimu.mo86231H(i6)));
                        }
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190839k);
                        for (int i7 = 0; i7 < ((cimv) cimu.f164949b).f190839k.size(); i7++) {
                            cimu.mo86243c(i7, bdjp.mo58089a(cimu.mo86232I(i7)));
                        }
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190840l);
                        for (int i8 = 0; i8 < ((cimv) cimu.f164949b).f190840l.size(); i8++) {
                            cimu.mo86236a(i8, bdjp.mo58089a(cimu.mo86233J(i8)));
                        }
                        Collections.unmodifiableList(((cimv) cimu.f164949b).f190842n);
                        for (int i9 = 0; i9 < ((cimv) cimu.f164949b).f190842n.size(); i9++) {
                            cimu.mo86241b(i9, bdjp.mo58089a(cimu.mo86234K(i9)));
                        }
                        cimv = (cimv) cimu.mo74062i();
                    } else {
                        cimv = null;
                    }
                    if (!(cimv == null || (cimv.f190816a & 1) == 0 || cimv.f190831c <= 0)) {
                        bxvd da2 = cimk.f190730k.mo74144da();
                        Long l10 = a2.f105773b;
                        bmxy.m108581a(l10);
                        long longValue9 = l10.longValue();
                        Long l11 = bdjz.f105773b;
                        bmxy.m108581a(l11);
                        long longValue10 = longValue9 - l11.longValue();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        cimk cimk = (cimk) da2.f164949b;
                        cimk.f190732a |= 64;
                        cimk.f190739h = longValue10;
                        cimj cimj4 = bdjz.f105777f;
                        if (cimj4 != null) {
                            bmxy.m108581a(cimj4);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cimk cimk2 = (cimk) da2.f164949b;
                            cimk2.f190733b = cimj4.f190729h;
                            cimk2.f190732a |= 1;
                        }
                        if (bdjz.f105778g != null) {
                            Boolean bool3 = bdjz.f105779h;
                            bmxy.m108581a(bool3);
                            if (bool3.booleanValue()) {
                                String str3 = bdjz.f105778g;
                                bmxy.m108581a(str3);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                cimk cimk3 = (cimk) da2.f164949b;
                                str3.getClass();
                                cimk3.f190732a |= 8;
                                cimk3.f190736e = str3;
                            } else {
                                String str4 = bdjz.f105778g;
                                bmxy.m108581a(str4);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                cimk cimk4 = (cimk) da2.f164949b;
                                str4.getClass();
                                cimk4.f190732a |= 4;
                                cimk4.f190735d = str4;
                            }
                        }
                        cimz cimz4 = bdjz.f105780i;
                        if (cimz4 != null) {
                            bmxy.m108581a(cimz4);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cimk cimk5 = (cimk) da2.f164949b;
                            cimz4.getClass();
                            cimk5.f190737f = cimz4;
                            cimk5.f190732a |= 16;
                        }
                        cimj cimj5 = a2.f105777f;
                        if (cimj5 != null) {
                            bmxy.m108581a(cimj5);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cimk cimk6 = (cimk) da2.f164949b;
                            cimk6.f190738g = cimj5.f190729h;
                            cimk6.f190732a |= 32;
                        }
                        Long l12 = a2.f105773b;
                        if (l12 != null) {
                            bmxy.m108581a(l12);
                            long longValue11 = l12.longValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            cimk cimk7 = (cimk) da2.f164949b;
                            cimk7.f190732a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            cimk7.f190741j = longValue11;
                        }
                        cimk cimk8 = (cimk) da2.f164949b;
                        cimv.getClass();
                        cimk8.f190740i = cimv;
                        cimk8.f190732a |= 128;
                        bxvd da3 = cios.f191113s.mo74144da();
                        bxvd da4 = ciml.f190743c.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        ciml ciml = (ciml) da4.f164949b;
                        cimk cimk9 = (cimk) da2.mo74062i();
                        cimk9.getClass();
                        ciml.f190746b = cimk9;
                        ciml.f190745a |= 1;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        cios cios2 = (cios) da3.f164949b;
                        ciml ciml2 = (ciml) da4.mo74062i();
                        ciml2.getClass();
                        cios2.f191124j = ciml2;
                        cios2.f191115a |= 512;
                        cios = (cios) da3.mo74062i();
                        if (cios != null) {
                            Boolean bool4 = a2.f105779h;
                            bdkg bdkg = bdjn.f105751e;
                            String str5 = a2.f105778g;
                            if (bool4 != null) {
                                z = bool4.booleanValue();
                            }
                            bdkg.mo58103a(str5, z, cios, a2.f105780i);
                        }
                        return null;
                    }
                }
            }
            cios = null;
            if (cios != null) {
            }
            return null;
        }
        bdjn.mo58031b();
        throw new IOException("Failure storing persistent snapshot and helper data");
    }
}
