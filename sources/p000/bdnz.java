package p000;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: bdnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdnz implements bdkj, bdez {

    /* renamed from: a */
    private static final bnrt f106115a = bnrt.m110178a("bdnz");

    /* renamed from: b */
    private final bdfd f106116b;

    /* renamed from: c */
    private final cijl f106117c;

    /* renamed from: d */
    private final cijl f106118d;

    /* renamed from: e */
    private final cijl f106119e;

    public bdnz(bdfd bdfd, cijl cijl, cijl cijl2, cijl cijl3) {
        this.f106116b = bdfd;
        this.f106117c = cijl;
        this.f106118d = cijl2;
        this.f106119e = cijl3;
    }

    /* renamed from: a */
    private static long m91159a(Long l, long j) {
        return l != null ? Math.min(l.longValue(), j) : j;
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f106116b.mo57956b(this);
    }

    /* renamed from: c */
    public final void mo58086c() {
        this.f106116b.mo57955a(this);
    }

    /* renamed from: a */
    private static ciny m91160a(bdnt bdnt) {
        bxvd da = ciny.f191008f.mo74144da();
        if (bdnt.f106091a != null) {
            String str = bdnt.f106091a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ciny ciny = (ciny) da.f164949b;
            str.getClass();
            ciny.f191010a |= 1;
            ciny.f191011b = str;
        }
        if (bdnt.f106092b != null) {
            long longValue = bdnt.f106092b.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ciny ciny2 = (ciny) da.f164949b;
            ciny2.f191010a |= 2;
            ciny2.f191012c = longValue;
        }
        if (bdnt.f106093c != null) {
            long longValue2 = bdnt.f106093c.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ciny ciny3 = (ciny) da.f164949b;
            ciny3.f191010a |= 4;
            ciny3.f191013d = longValue2;
        }
        if (bdnt.f106094d != null) {
            long longValue3 = bdnt.f106094d.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ciny ciny4 = (ciny) da.f164949b;
            ciny4.f191010a |= 8;
            ciny4.f191014e = longValue3;
        }
        return (ciny) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x025a  */
    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        long j;
        Long l;
        bmvz bmvz;
        bmxv bmxv;
        FileInputStream fileInputStream;
        Throwable th;
        int i;
        boolean z;
        this.f106116b.mo57956b(this);
        bdny bdny = bdny.f106105a;
        if (bdny.f106110f > 0) {
            if (bdny.f106106b) {
                j = bdny.f106107c;
            } else {
                long j2 = bdny.f106109e;
                j = 0;
            }
            if (j > 0 && bdny.f106110f >= j) {
                bxvd da = cinz.f191015m.mo74144da();
                boolean z2 = bdny.f106106b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cinz cinz = (cinz) da.f164949b;
                cinz.f191017a |= 512;
                cinz.f191026j = z2;
                bdnx bdnx = bdny.f106112h;
                if (bdnx.f106100a) {
                    long j3 = bdny.f106107c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinz cinz2 = (cinz) da.f164949b;
                    cinz2.f191017a |= 16;
                    cinz2.f191021e = j3;
                    l = Long.valueOf(m91159a(null, j3));
                } else {
                    l = null;
                }
                byte b = 32;
                if (bdnx.f106101b) {
                    long j4 = bdny.f106108d;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinz cinz3 = (cinz) da.f164949b;
                    cinz3.f191017a |= 32;
                    cinz3.f191022f = j4;
                    l = Long.valueOf(m91159a(l, j4));
                }
                boolean z3 = bdnx.f106102c;
                if (bdnx.f106103d) {
                    long j5 = bdny.f106110f;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinz cinz4 = (cinz) da.f164949b;
                    cinz4.f191017a |= 128;
                    cinz4.f191024h = j5;
                    l = Long.valueOf(m91159a(l, j5));
                }
                boolean z4 = bdnx.f106104e;
                if (bdny.f106113i.f106092b != null) {
                    ciny a = m91160a(bdny.f106113i);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinz cinz5 = (cinz) da.f164949b;
                    a.getClass();
                    cinz5.f191027k = a;
                    cinz5.f191017a |= 1024;
                    if ((a.f191010a & 2) != 0) {
                        l = Long.valueOf(m91159a(l, a.f191012c));
                    }
                    if ((a.f191010a & 4) != 0) {
                        l = Long.valueOf(m91159a(l, a.f191013d));
                    }
                    if ((a.f191010a & 8) != 0) {
                        l = Long.valueOf(m91159a(l, a.f191014e));
                    }
                }
                if (bdny.f106114j.f106092b != null) {
                    ciny a2 = m91160a(bdny.f106114j);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinz cinz6 = (cinz) da.f164949b;
                    a2.getClass();
                    cinz6.f191028l = a2;
                    cinz6.f191017a |= 2048;
                    if ((a2.f191010a & 2) != 0) {
                        l = Long.valueOf(m91159a(l, a2.f191012c));
                    }
                    if ((a2.f191010a & 4) != 0) {
                        l = Long.valueOf(m91159a(l, a2.f191013d));
                    }
                    if ((a2.f191010a & 8) != 0) {
                        l = Long.valueOf(m91159a(l, a2.f191014e));
                    }
                }
                bmxv bmxv2 = bdod.f106128a;
                if (bmxv2 == null) {
                    int i2 = Build.VERSION.SDK_INT;
                    long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                    if (sysconf > 0) {
                        bmvz = bmxv.m108566b(Long.valueOf(sysconf));
                    } else {
                        bmvz = bmvz.f131120a;
                    }
                    if (bmvz.mo66813a()) {
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        byte[] bArr = new byte[440];
                        try {
                            fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                            int read = fileInputStream.read(bArr);
                            fileInputStream.close();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            int i3 = 0;
                            while (true) {
                                if (i3 < read) {
                                    if (bArr[i3] == 40) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    i3 = 0;
                                    break;
                                }
                            }
                            if (i3 != 0 && (i = i3 + 16) < read) {
                                while (true) {
                                    if (i > i3) {
                                        if (bArr[i] == 41) {
                                            i3 = i;
                                            z = true;
                                            break;
                                        }
                                        i--;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (!z) {
                                    bmxv = bmvz.f131120a;
                                } else {
                                    long j6 = 0;
                                    int i4 = 1;
                                    while (true) {
                                        if (i3 >= read) {
                                            break;
                                        }
                                        byte b2 = bArr[i3];
                                        if (b2 == b) {
                                            int i5 = i4 + 1;
                                            if (i4 != 21) {
                                                i4 = i5;
                                            } else if (j6 > 0) {
                                                bmxv = bmxv.m108566b(Long.valueOf(j6));
                                            }
                                        } else if (i4 == 21) {
                                            if (j6 > 922337203685477580L) {
                                                break;
                                            }
                                            long j7 = j6 * 10;
                                            if (b2 < 48 || b2 > 57) {
                                                break;
                                            }
                                            j6 = j7 + ((long) (b2 - 48));
                                            i4 = i4;
                                        }
                                        i3++;
                                        b = 32;
                                    }
                                    bmxv = bmvz.f131120a;
                                }
                                if (!bmxv.mo66813a()) {
                                    bmxv2 = bmxv.m108566b(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) bmxv.mo66814b()).longValue()) / ((Long) bmvz.mo66814b()).longValue()));
                                } else {
                                    bmxv2 = bmvz.f131120a;
                                }
                            } else {
                                bmxv = bmvz.f131120a;
                                if (!bmxv.mo66813a()) {
                                }
                            }
                        } catch (IOException e) {
                            try {
                                bmxv = bmvz.f131120a;
                            } finally {
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                        } catch (Throwable th2) {
                            bqye.m113761a(th, th2);
                        }
                    } else {
                        bmxv2 = bmvz.f131120a;
                    }
                    bdod.f106128a = bmxv2;
                }
                if (bmxv2.mo66813a()) {
                    Long l2 = (Long) bmxv2.mo66814b();
                    long longValue = l2.longValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cinz cinz7 = (cinz) da.f164949b;
                    cinz7.f191017a |= 2;
                    cinz7.f191019c = longValue;
                    l = Long.valueOf(m91159a(l, l2.longValue()));
                }
                int i6 = Build.VERSION.SDK_INT;
                long startElapsedRealtime = Process.getStartElapsedRealtime();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cinz cinz8 = (cinz) da.f164949b;
                cinz8.f191017a |= 4;
                cinz8.f191020d = startElapsedRealtime;
                Long valueOf = Long.valueOf(m91159a(l, startElapsedRealtime));
                if (((Boolean) this.f106118d.mo6445a()).booleanValue()) {
                    long longValue2 = valueOf.longValue();
                    boolean booleanValue = ((Boolean) this.f106119e.mo6445a()).booleanValue();
                    if (longValue2 != 0) {
                        if (!booleanValue) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz9 = (cinz) da.f164949b;
                            cinz9.f191017a |= 1;
                            cinz9.f191018b = longValue2;
                        }
                        cinz cinz10 = (cinz) da.f164949b;
                        if ((cinz10.f191017a & 16) != 0) {
                            long j8 = cinz10.f191021e - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz11 = (cinz) da.f164949b;
                            cinz11.f191017a |= 16;
                            cinz11.f191021e = j8;
                        }
                        cinz cinz12 = (cinz) da.f164949b;
                        if ((cinz12.f191017a & 32) != 0) {
                            long j9 = cinz12.f191022f - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz13 = (cinz) da.f164949b;
                            cinz13.f191017a |= 32;
                            cinz13.f191022f = j9;
                        }
                        cinz cinz14 = (cinz) da.f164949b;
                        if ((cinz14.f191017a & 64) != 0) {
                            long j10 = cinz14.f191023g - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz15 = (cinz) da.f164949b;
                            cinz15.f191017a |= 64;
                            cinz15.f191023g = j10;
                        }
                        cinz cinz16 = (cinz) da.f164949b;
                        if ((cinz16.f191017a & 128) != 0) {
                            long j11 = cinz16.f191024h - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz17 = (cinz) da.f164949b;
                            cinz17.f191017a |= 128;
                            cinz17.f191024h = j11;
                        }
                        cinz cinz18 = (cinz) da.f164949b;
                        if ((cinz18.f191017a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            long j12 = cinz18.f191025i - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz19 = (cinz) da.f164949b;
                            cinz19.f191017a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            cinz19.f191025i = j12;
                        }
                        cinz cinz20 = (cinz) da.f164949b;
                        if ((cinz20.f191017a & 1024) != 0) {
                            ciny ciny = cinz20.f191027k;
                            if (ciny == null) {
                                ciny = ciny.f191008f;
                            }
                            bxvd bxvd = (bxvd) ciny.mo74142c(5);
                            bxvd.mo73625a((bxvk) ciny);
                            ciny ciny2 = (ciny) bxvd.f164949b;
                            if ((ciny2.f191010a & 2) != 0) {
                                long j13 = ciny2.f191012c - longValue2;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                ciny ciny3 = (ciny) bxvd.f164949b;
                                ciny3.f191010a |= 2;
                                ciny3.f191012c = j13;
                            }
                            ciny ciny4 = (ciny) bxvd.f164949b;
                            if ((ciny4.f191010a & 4) != 0) {
                                long j14 = ciny4.f191013d - longValue2;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                ciny ciny5 = (ciny) bxvd.f164949b;
                                ciny5.f191010a |= 4;
                                ciny5.f191013d = j14;
                            }
                            ciny ciny6 = (ciny) bxvd.f164949b;
                            if ((ciny6.f191010a & 8) != 0) {
                                long j15 = ciny6.f191014e - longValue2;
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                ciny ciny7 = (ciny) bxvd.f164949b;
                                ciny7.f191010a |= 8;
                                ciny7.f191014e = j15;
                            }
                            ciny ciny8 = (ciny) bxvd.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz21 = (cinz) da.f164949b;
                            ciny8.getClass();
                            cinz21.f191027k = ciny8;
                            cinz21.f191017a |= 1024;
                        }
                        cinz cinz22 = (cinz) da.f164949b;
                        if ((cinz22.f191017a & 2048) != 0) {
                            ciny ciny9 = cinz22.f191028l;
                            if (ciny9 == null) {
                                ciny9 = ciny.f191008f;
                            }
                            bxvd bxvd2 = (bxvd) ciny9.mo74142c(5);
                            bxvd2.mo73625a((bxvk) ciny9);
                            ciny ciny10 = (ciny) bxvd2.f164949b;
                            if ((ciny10.f191010a & 2) != 0) {
                                long j16 = ciny10.f191012c - longValue2;
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ciny ciny11 = (ciny) bxvd2.f164949b;
                                ciny11.f191010a |= 2;
                                ciny11.f191012c = j16;
                            }
                            ciny ciny12 = (ciny) bxvd2.f164949b;
                            if ((ciny12.f191010a & 4) != 0) {
                                long j17 = ciny12.f191013d - longValue2;
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ciny ciny13 = (ciny) bxvd2.f164949b;
                                ciny13.f191010a |= 4;
                                ciny13.f191013d = j17;
                            }
                            ciny ciny14 = (ciny) bxvd2.f164949b;
                            if ((ciny14.f191010a & 8) != 0) {
                                long j18 = ciny14.f191014e - longValue2;
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ciny ciny15 = (ciny) bxvd2.f164949b;
                                ciny15.f191010a |= 8;
                                ciny15.f191014e = j18;
                            }
                            ciny ciny16 = (ciny) bxvd2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz23 = (cinz) da.f164949b;
                            ciny16.getClass();
                            cinz23.f191028l = ciny16;
                            cinz23.f191017a |= 2048;
                        }
                        cinz cinz24 = (cinz) da.f164949b;
                        if ((cinz24.f191017a & 4) != 0) {
                            long j19 = cinz24.f191020d - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz25 = (cinz) da.f164949b;
                            cinz25.f191017a |= 4;
                            cinz25.f191020d = j19;
                        }
                        cinz cinz26 = (cinz) da.f164949b;
                        if ((cinz26.f191017a & 2) != 0) {
                            long j20 = cinz26.f191019c - longValue2;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cinz cinz27 = (cinz) da.f164949b;
                            cinz27.f191017a |= 2;
                            cinz27.f191019c = j20;
                        }
                    }
                }
                bxvd da2 = cinu.f190982h.mo74144da();
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinu cinu = (cinu) da2.f164949b;
                int i7 = cinu.f190984a | 1;
                cinu.f190984a = i7;
                cinu.f190985b = leastSignificantBits;
                cinu.f190986c = 2;
                cinu.f190984a = 2 | i7;
                cinz cinz28 = (cinz) da.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cinu cinu2 = (cinu) da2.f164949b;
                cinz28.getClass();
                cinu2.f190990g = cinz28;
                cinu2.f190984a |= 16;
                cinu cinu3 = (cinu) da2.mo74062i();
                bdob bdob = (bdob) this.f106117c.mo6445a();
                bdgg bdgg = bdny.f106111g;
                String a3 = bdgg.m90735a((bdgg) null);
                bxvd da3 = cios.f191113s.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cios cios = (cios) da3.f164949b;
                cinu3.getClass();
                cios.f191127m = cinu3;
                cios.f191115a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                cios cios2 = (cios) da3.mo74062i();
                if ((cinu3.f190984a & 1) != 0) {
                    long j21 = cinu3.f190985b;
                }
                if (cinu3.f190987d.size() > 0) {
                    String str = ((cinx) cinu3.f190987d.get(0)).f190996b;
                }
                bdob.f106124a.mo58104b(null, true, cios2, null, a3);
                return;
            }
            return;
        }
        bnrq bnrq = (bnrq) f106115a.mo68390d();
        bnrq.mo68432a("bdnz", "b", 245, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnrq.mo68405a("missing firstDraw timestamp");
        return;
        throw th;
    }
}
