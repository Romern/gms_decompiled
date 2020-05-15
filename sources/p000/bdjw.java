package p000;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import com.google.android.cast.JGCastService;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bdjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjw {
    /* renamed from: a */
    public static long m90934a(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0;
        }
        return healthStats.getMeasurement(i);
    }

    /* renamed from: a */
    static boolean m90940a(cimr cimr) {
        if (cimr != null) {
            return cimr.f190769b <= 0 && cimr.f190770c <= 0 && cimr.f190771d <= 0 && cimr.f190772e <= 0 && cimr.f190773f <= 0 && cimr.f190774g <= 0;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m90941a(cims cims) {
        return cims == null || (((long) cims.f190779b) <= 0 && ((long) cims.f190780c) <= 0);
    }

    /* renamed from: b */
    public static cimt m90943b(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return m90937a((String) null, healthStats.getTimer(i));
    }

    /* renamed from: c */
    public static List m90944c(HealthStats healthStats, int i) {
        if (healthStats != null && healthStats.hasTimers(i)) {
            return bdjv.f105766a.mo58094a(healthStats.getTimers(i));
        }
        return Collections.emptyList();
    }

    /* renamed from: d */
    public static Map m90945d(HealthStats healthStats, int i) {
        return (healthStats != null && healthStats.hasStats(i)) ? healthStats.getStats(i) : Collections.emptyMap();
    }

    /* renamed from: a */
    public static cimn m90935a(String str) {
        bxvd da = cimn.f190753d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimn cimn = (cimn) da.f164949b;
        str.getClass();
        cimn.f190755a |= 2;
        cimn.f190757c = str;
        return (cimn) da.mo74062i();
    }

    /* renamed from: a */
    static cimt m90936a(cimt cimt, cimt cimt2) {
        if (cimt == null || cimt2 == null) {
            return cimt;
        }
        int i = cimt.f190785b - cimt2.f190785b;
        long j = cimt.f190786c - cimt2.f190786c;
        if (i == 0 && j == 0) {
            return null;
        }
        bxvd da = cimt.f190782e.mo74144da();
        cimn cimn = cimt.f190787d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimt cimt3 = (cimt) da.f164949b;
        cimn.getClass();
        cimt3.f190787d = cimn;
        int i2 = cimt3.f190784a | 4;
        cimt3.f190784a = i2;
        int i3 = i2 | 1;
        cimt3.f190784a = i3;
        cimt3.f190785b = i;
        cimt3.f190784a = i3 | 2;
        cimt3.f190786c = j;
        return (cimt) da.mo74062i();
    }

    /* renamed from: a */
    public static cimt m90937a(String str, TimerStat timerStat) {
        bxvd da = cimt.f190782e.mo74144da();
        int count = timerStat.getCount();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimt cimt = (cimt) da.f164949b;
        cimt.f190784a |= 1;
        cimt.f190785b = count;
        long time = timerStat.getTime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimt cimt2 = (cimt) da.f164949b;
        int i = cimt2.f190784a | 2;
        cimt2.f190784a = i;
        cimt2.f190786c = time;
        if (cimt2.f190785b < 0) {
            cimt2.f190784a = i | 1;
            cimt2.f190785b = 0;
        }
        if (str != null) {
            cimn a = m90935a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimt cimt3 = (cimt) da.f164949b;
            a.getClass();
            cimt3.f190787d = a;
            cimt3.f190784a |= 4;
        }
        cimt cimt4 = (cimt) da.f164949b;
        if (cimt4.f190785b == 0 && cimt4.f190786c == 0) {
            return null;
        }
        return (cimt) da.mo74062i();
    }

    /* renamed from: a */
    static cimv m90938a(cimv cimv, cimv cimv2) {
        cimt cimt;
        cimt cimt2;
        cimt cimt3;
        cimt cimt4;
        cimt cimt5;
        cimt cimt6;
        cimt cimt7;
        cimt cimt8;
        cimt cimt9;
        cimt cimt10;
        cimt cimt11;
        cimt cimt12;
        cimt cimt13;
        cimt cimt14;
        cimt cimt15;
        cimt cimt16;
        cimt cimt17;
        cimt cimt18;
        cimt cimt19;
        cimt cimt20;
        cimt cimt21;
        cimt cimt22;
        cimt cimt23;
        cimt cimt24;
        cimt cimt25;
        cimt cimt26;
        cimt cimt27;
        cimt cimt28;
        cimt cimt29;
        cimt cimt30;
        cimt cimt31;
        cimt cimt32;
        if (cimv == null || cimv2 == null) {
            return cimv;
        }
        cimu cimu = (cimu) cimv.f190788ar.mo74144da();
        if ((cimv.f190816a & 1) != 0) {
            long j = cimv.f190831c - cimv2.f190831c;
            if (j != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv3 = (cimv) cimu.f164949b;
                cimv3.f190816a |= 1;
                cimv3.f190831c = j;
            }
        }
        if ((cimv.f190816a & 2) != 0) {
            long j2 = cimv.f190832d - cimv2.f190832d;
            if (j2 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv4 = (cimv) cimu.f164949b;
                cimv4.f190816a |= 2;
                cimv4.f190832d = j2;
            }
        }
        if ((cimv.f190816a & 4) != 0) {
            long j3 = cimv.f190833e - cimv2.f190833e;
            if (j3 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv5 = (cimv) cimu.f164949b;
                cimv5.f190816a |= 4;
                cimv5.f190833e = j3;
            }
        }
        if ((cimv.f190816a & 8) != 0) {
            long j4 = cimv.f190834f - cimv2.f190834f;
            if (j4 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv6 = (cimv) cimu.f164949b;
                cimv6.f190816a |= 8;
                cimv6.f190834f = j4;
            }
        }
        cimu.mo86252g(bdjv.f105766a.mo58093a(cimv.f190835g, cimv2.f190835g));
        cimu.mo86238ae(bdjv.f105766a.mo58093a(cimv.f190836h, cimv2.f190836h));
        cimu.mo86239af(bdjv.f105766a.mo58093a(cimv.f190837i, cimv2.f190837i));
        cimu.mo86250f(bdjv.f105766a.mo58093a(cimv.f190838j, cimv2.f190838j));
        cimu.mo86248e(bdjv.f105766a.mo58093a(cimv.f190839k, cimv2.f190839k));
        cimu.mo86237a(bdjv.f105766a.mo58093a(cimv.f190840l, cimv2.f190840l));
        if ((cimv.f190816a & 16) != 0) {
            cimt = cimv.f190841m;
            if (cimt == null) {
                cimt = cimt.f190782e;
            }
        } else {
            cimt = null;
        }
        if ((cimv2.f190816a & 16) != 0) {
            cimt2 = cimv2.f190841m;
            if (cimt2 == null) {
                cimt2 = cimt.f190782e;
            }
        } else {
            cimt2 = null;
        }
        cimt a = m90936a(cimt, cimt2);
        if (a != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv7 = (cimv) cimu.f164949b;
            a.getClass();
            cimv7.f190841m = a;
            cimv7.f190816a |= 16;
        }
        cimu.mo86242b(bdjv.f105766a.mo58093a(cimv.f190842n, cimv2.f190842n));
        cimu.mo86246d(bdjs.f105764a.mo58093a(cimv.f190844p, cimv2.f190844p));
        cimu.mo86244c(bdjr.f105763a.mo58093a(cimv.f190845q, cimv2.f190845q));
        if ((cimv.f190816a & 32) != 0) {
            long j5 = cimv.f190846r - cimv2.f190846r;
            if (j5 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv8 = (cimv) cimu.f164949b;
                cimv8.f190816a |= 32;
                cimv8.f190846r = j5;
            }
        }
        if ((cimv.f190816a & 64) != 0) {
            long j6 = cimv.f190847s - cimv2.f190847s;
            if (j6 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv9 = (cimv) cimu.f164949b;
                cimv9.f190816a |= 64;
                cimv9.f190847s = j6;
            }
        }
        if ((cimv.f190816a & 128) != 0) {
            long j7 = cimv.f190848t - cimv2.f190848t;
            if (j7 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv10 = (cimv) cimu.f164949b;
                cimv10.f190816a |= 128;
                cimv10.f190848t = j7;
            }
        }
        if ((cimv.f190816a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            long j8 = cimv.f190849u - cimv2.f190849u;
            if (j8 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv11 = (cimv) cimu.f164949b;
                cimv11.f190816a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                cimv11.f190849u = j8;
            }
        }
        if ((cimv.f190816a & 512) != 0) {
            long j9 = cimv.f190850v - cimv2.f190850v;
            if (j9 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv12 = (cimv) cimu.f164949b;
                cimv12.f190816a |= 512;
                cimv12.f190850v = j9;
            }
        }
        if ((cimv.f190816a & 1024) != 0) {
            long j10 = cimv.f190851w - cimv2.f190851w;
            if (j10 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv13 = (cimv) cimu.f164949b;
                cimv13.f190816a |= 1024;
                cimv13.f190851w = j10;
            }
        }
        if ((cimv.f190816a & 2048) != 0) {
            long j11 = cimv.f190852x - cimv2.f190852x;
            if (j11 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv14 = (cimv) cimu.f164949b;
                cimv14.f190816a |= 2048;
                cimv14.f190852x = j11;
            }
        }
        if ((cimv.f190816a & 4096) != 0) {
            long j12 = cimv.f190853y - cimv2.f190853y;
            if (j12 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv15 = (cimv) cimu.f164949b;
                cimv15.f190816a |= 4096;
                cimv15.f190853y = j12;
            }
        }
        if ((cimv.f190816a & 8192) != 0) {
            long j13 = cimv.f190854z - cimv2.f190854z;
            if (j13 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv16 = (cimv) cimu.f164949b;
                cimv16.f190816a |= 8192;
                cimv16.f190854z = j13;
            }
        }
        if ((cimv.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            long j14 = cimv.f190790A - cimv2.f190790A;
            if (j14 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv17 = (cimv) cimu.f164949b;
                cimv17.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                cimv17.f190790A = j14;
            }
        }
        if ((cimv.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
            long j15 = cimv.f190791B - cimv2.f190791B;
            if (j15 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv18 = (cimv) cimu.f164949b;
                cimv18.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                cimv18.f190791B = j15;
            }
        }
        if ((cimv.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            long j16 = cimv.f190792C - cimv2.f190792C;
            if (j16 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv19 = (cimv) cimu.f164949b;
                cimv19.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cimv19.f190792C = j16;
            }
        }
        if ((cimv.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
            long j17 = cimv.f190793D - cimv2.f190793D;
            if (j17 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv20 = (cimv) cimu.f164949b;
                cimv20.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                cimv20.f190793D = j17;
            }
        }
        if ((cimv.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
            long j18 = cimv.f190794E - cimv2.f190794E;
            if (j18 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv21 = (cimv) cimu.f164949b;
                cimv21.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                cimv21.f190794E = j18;
            }
        }
        if ((cimv.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            cimt3 = cimv.f190795F;
            if (cimt3 == null) {
                cimt3 = cimt.f190782e;
            }
        } else {
            cimt3 = null;
        }
        if ((cimv2.f190816a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            cimt4 = cimv2.f190795F;
            if (cimt4 == null) {
                cimt4 = cimt.f190782e;
            }
        } else {
            cimt4 = null;
        }
        cimt a2 = m90936a(cimt3, cimt4);
        if (a2 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv22 = (cimv) cimu.f164949b;
            a2.getClass();
            cimv22.f190795F = a2;
            cimv22.f190816a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
        }
        if ((cimv.f190816a & 1048576) != 0) {
            long j19 = cimv.f190796G - cimv2.f190796G;
            if (j19 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv23 = (cimv) cimu.f164949b;
                cimv23.f190816a |= 1048576;
                cimv23.f190796G = j19;
            }
        }
        if ((cimv.f190816a & 2097152) != 0) {
            cimt5 = cimv.f190797H;
            if (cimt5 == null) {
                cimt5 = cimt.f190782e;
            }
        } else {
            cimt5 = null;
        }
        if ((cimv2.f190816a & 2097152) != 0) {
            cimt6 = cimv2.f190797H;
            if (cimt6 == null) {
                cimt6 = cimt.f190782e;
            }
        } else {
            cimt6 = null;
        }
        cimt a3 = m90936a(cimt5, cimt6);
        if (a3 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv24 = (cimv) cimu.f164949b;
            a3.getClass();
            cimv24.f190797H = a3;
            cimv24.f190816a |= 2097152;
        }
        if ((cimv.f190816a & 4194304) != 0) {
            cimt7 = cimv.f190798I;
            if (cimt7 == null) {
                cimt7 = cimt.f190782e;
            }
        } else {
            cimt7 = null;
        }
        if ((cimv2.f190816a & 4194304) != 0) {
            cimt8 = cimv2.f190798I;
            if (cimt8 == null) {
                cimt8 = cimt.f190782e;
            }
        } else {
            cimt8 = null;
        }
        cimt a4 = m90936a(cimt7, cimt8);
        if (a4 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv25 = (cimv) cimu.f164949b;
            a4.getClass();
            cimv25.f190798I = a4;
            cimv25.f190816a |= 4194304;
        }
        if ((cimv.f190816a & 8388608) != 0) {
            cimt9 = cimv.f190799J;
            if (cimt9 == null) {
                cimt9 = cimt.f190782e;
            }
        } else {
            cimt9 = null;
        }
        if ((cimv2.f190816a & 8388608) != 0) {
            cimt10 = cimv2.f190799J;
            if (cimt10 == null) {
                cimt10 = cimt.f190782e;
            }
        } else {
            cimt10 = null;
        }
        cimt a5 = m90936a(cimt9, cimt10);
        if (a5 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv26 = (cimv) cimu.f164949b;
            a5.getClass();
            cimv26.f190799J = a5;
            cimv26.f190816a |= 8388608;
        }
        if ((cimv.f190816a & 16777216) != 0) {
            cimt11 = cimv.f190800K;
            if (cimt11 == null) {
                cimt11 = cimt.f190782e;
            }
        } else {
            cimt11 = null;
        }
        if ((cimv2.f190816a & 16777216) != 0) {
            cimt12 = cimv2.f190800K;
            if (cimt12 == null) {
                cimt12 = cimt.f190782e;
            }
        } else {
            cimt12 = null;
        }
        cimt a6 = m90936a(cimt11, cimt12);
        if (a6 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv27 = (cimv) cimu.f164949b;
            a6.getClass();
            cimv27.f190800K = a6;
            cimv27.f190816a |= 16777216;
        }
        if ((cimv.f190816a & 33554432) != 0) {
            cimt13 = cimv.f190801L;
            if (cimt13 == null) {
                cimt13 = cimt.f190782e;
            }
        } else {
            cimt13 = null;
        }
        if ((cimv2.f190816a & 33554432) != 0) {
            cimt14 = cimv2.f190801L;
            if (cimt14 == null) {
                cimt14 = cimt.f190782e;
            }
        } else {
            cimt14 = null;
        }
        cimt a7 = m90936a(cimt13, cimt14);
        if (a7 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv28 = (cimv) cimu.f164949b;
            a7.getClass();
            cimv28.f190801L = a7;
            cimv28.f190816a |= 33554432;
        }
        if ((cimv.f190816a & 67108864) != 0) {
            cimt15 = cimv.f190802M;
            if (cimt15 == null) {
                cimt15 = cimt.f190782e;
            }
        } else {
            cimt15 = null;
        }
        if ((cimv2.f190816a & 67108864) != 0) {
            cimt16 = cimv2.f190802M;
            if (cimt16 == null) {
                cimt16 = cimt.f190782e;
            }
        } else {
            cimt16 = null;
        }
        cimt a8 = m90936a(cimt15, cimt16);
        if (a8 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv29 = (cimv) cimu.f164949b;
            a8.getClass();
            cimv29.f190802M = a8;
            cimv29.f190816a |= 67108864;
        }
        if ((cimv.f190816a & 134217728) != 0) {
            cimt17 = cimv.f190803N;
            if (cimt17 == null) {
                cimt17 = cimt.f190782e;
            }
        } else {
            cimt17 = null;
        }
        if ((cimv2.f190816a & 134217728) != 0) {
            cimt18 = cimv2.f190803N;
            if (cimt18 == null) {
                cimt18 = cimt.f190782e;
            }
        } else {
            cimt18 = null;
        }
        cimt a9 = m90936a(cimt17, cimt18);
        if (a9 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv30 = (cimv) cimu.f164949b;
            a9.getClass();
            cimv30.f190803N = a9;
            cimv30.f190816a |= 134217728;
        }
        if ((cimv.f190816a & 268435456) != 0) {
            cimt19 = cimv.f190804O;
            if (cimt19 == null) {
                cimt19 = cimt.f190782e;
            }
        } else {
            cimt19 = null;
        }
        if ((cimv2.f190816a & 268435456) != 0) {
            cimt20 = cimv2.f190804O;
            if (cimt20 == null) {
                cimt20 = cimt.f190782e;
            }
        } else {
            cimt20 = null;
        }
        cimt a10 = m90936a(cimt19, cimt20);
        if (a10 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv31 = (cimv) cimu.f164949b;
            a10.getClass();
            cimv31.f190804O = a10;
            cimv31.f190816a |= 268435456;
        }
        if ((cimv.f190816a & 536870912) != 0) {
            cimt21 = cimv.f190805P;
            if (cimt21 == null) {
                cimt21 = cimt.f190782e;
            }
        } else {
            cimt21 = null;
        }
        if ((cimv2.f190816a & 536870912) != 0) {
            cimt22 = cimv2.f190805P;
            if (cimt22 == null) {
                cimt22 = cimt.f190782e;
            }
        } else {
            cimt22 = null;
        }
        cimt a11 = m90936a(cimt21, cimt22);
        if (a11 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv32 = (cimv) cimu.f164949b;
            a11.getClass();
            cimv32.f190805P = a11;
            cimv32.f190816a |= 536870912;
        }
        if ((cimv.f190816a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            cimt23 = cimv.f190806Q;
            if (cimt23 == null) {
                cimt23 = cimt.f190782e;
            }
        } else {
            cimt23 = null;
        }
        if ((cimv2.f190816a & JGCastService.FLAG_PRIVATE_DISPLAY) != 0) {
            cimt24 = cimv2.f190806Q;
            if (cimt24 == null) {
                cimt24 = cimt.f190782e;
            }
        } else {
            cimt24 = null;
        }
        cimt a12 = m90936a(cimt23, cimt24);
        if (a12 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv33 = (cimv) cimu.f164949b;
            a12.getClass();
            cimv33.f190806Q = a12;
            cimv33.f190816a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        }
        if ((cimv.f190816a & Integer.MIN_VALUE) != 0) {
            cimt25 = cimv.f190807R;
            if (cimt25 == null) {
                cimt25 = cimt.f190782e;
            }
        } else {
            cimt25 = null;
        }
        if ((cimv2.f190816a & Integer.MIN_VALUE) != 0) {
            cimt26 = cimv2.f190807R;
            if (cimt26 == null) {
                cimt26 = cimt.f190782e;
            }
        } else {
            cimt26 = null;
        }
        cimt a13 = m90936a(cimt25, cimt26);
        if (a13 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv34 = (cimv) cimu.f164949b;
            a13.getClass();
            cimv34.f190807R = a13;
            cimv34.f190816a |= Integer.MIN_VALUE;
        }
        if ((cimv.f190830b & 1) != 0) {
            cimt27 = cimv.f190808S;
            if (cimt27 == null) {
                cimt27 = cimt.f190782e;
            }
        } else {
            cimt27 = null;
        }
        if ((cimv2.f190830b & 1) != 0) {
            cimt28 = cimv2.f190808S;
            if (cimt28 == null) {
                cimt28 = cimt.f190782e;
            }
        } else {
            cimt28 = null;
        }
        cimt a14 = m90936a(cimt27, cimt28);
        if (a14 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv35 = (cimv) cimu.f164949b;
            a14.getClass();
            cimv35.f190808S = a14;
            cimv35.f190830b |= 1;
        }
        if ((cimv.f190830b & 2) != 0) {
            cimt29 = cimv.f190809T;
            if (cimt29 == null) {
                cimt29 = cimt.f190782e;
            }
        } else {
            cimt29 = null;
        }
        if ((cimv2.f190830b & 2) != 0) {
            cimt30 = cimv2.f190809T;
            if (cimt30 == null) {
                cimt30 = cimt.f190782e;
            }
        } else {
            cimt30 = null;
        }
        cimt a15 = m90936a(cimt29, cimt30);
        if (a15 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv36 = (cimv) cimu.f164949b;
            a15.getClass();
            cimv36.f190809T = a15;
            cimv36.f190830b |= 2;
        }
        if ((cimv.f190830b & 4) != 0) {
            long j20 = cimv.f190810U - cimv2.f190810U;
            if (j20 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv37 = (cimv) cimu.f164949b;
                cimv37.f190830b |= 4;
                cimv37.f190810U = j20;
            }
        }
        if ((cimv.f190830b & 8) != 0) {
            long j21 = cimv.f190811V - cimv2.f190811V;
            if (j21 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv38 = (cimv) cimu.f164949b;
                cimv38.f190830b |= 8;
                cimv38.f190811V = j21;
            }
        }
        if ((cimv.f190830b & 16) != 0) {
            long j22 = cimv.f190812W - cimv2.f190812W;
            if (j22 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv39 = (cimv) cimu.f164949b;
                cimv39.f190830b |= 16;
                cimv39.f190812W = j22;
            }
        }
        if ((cimv.f190830b & 32) != 0) {
            long j23 = cimv.f190813X - cimv2.f190813X;
            if (j23 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv40 = (cimv) cimu.f164949b;
                cimv40.f190830b |= 32;
                cimv40.f190813X = j23;
            }
        }
        if ((cimv.f190830b & 64) != 0) {
            long j24 = cimv.f190814Y - cimv2.f190814Y;
            if (j24 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv41 = (cimv) cimu.f164949b;
                cimv41.f190830b |= 64;
                cimv41.f190814Y = j24;
            }
        }
        if ((cimv.f190830b & 128) != 0) {
            long j25 = cimv.f190815Z - cimv2.f190815Z;
            if (j25 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv42 = (cimv) cimu.f164949b;
                cimv42.f190830b |= 128;
                cimv42.f190815Z = j25;
            }
        }
        if ((cimv.f190830b & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            long j26 = cimv.f190817aa - cimv2.f190817aa;
            if (j26 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv43 = (cimv) cimu.f164949b;
                cimv43.f190830b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                cimv43.f190817aa = j26;
            }
        }
        if ((cimv.f190830b & 512) != 0) {
            long j27 = cimv.f190818ab - cimv2.f190818ab;
            if (j27 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv44 = (cimv) cimu.f164949b;
                cimv44.f190830b |= 512;
                cimv44.f190818ab = j27;
            }
        }
        if ((cimv.f190830b & 1024) != 0) {
            long j28 = cimv.f190819ac - cimv2.f190819ac;
            if (j28 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv45 = (cimv) cimu.f164949b;
                cimv45.f190830b |= 1024;
                cimv45.f190819ac = j28;
            }
        }
        if ((cimv.f190830b & 2048) != 0) {
            long j29 = cimv.f190820ad - cimv2.f190820ad;
            if (j29 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv46 = (cimv) cimu.f164949b;
                cimv46.f190830b |= 2048;
                cimv46.f190820ad = j29;
            }
        }
        if ((cimv.f190830b & 4096) != 0) {
            long j30 = cimv.f190821ae - cimv2.f190821ae;
            if (j30 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv47 = (cimv) cimu.f164949b;
                cimv47.f190830b |= 4096;
                cimv47.f190821ae = j30;
            }
        }
        if ((cimv.f190830b & 8192) != 0) {
            long j31 = cimv.f190822af - cimv2.f190822af;
            if (j31 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv48 = (cimv) cimu.f164949b;
                cimv48.f190830b |= 8192;
                cimv48.f190822af = j31;
            }
        }
        if ((cimv.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            long j32 = cimv.f190823ak - cimv2.f190823ak;
            if (j32 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv49 = (cimv) cimu.f164949b;
                cimv49.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                cimv49.f190823ak = j32;
            }
        }
        if ((cimv.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
            long j33 = cimv.f190824al - cimv2.f190824al;
            if (j33 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv50 = (cimv) cimu.f164949b;
                cimv50.f190830b = 32768 | cimv50.f190830b;
                cimv50.f190824al = j33;
            }
        }
        if ((cimv.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != 0) {
            long j34 = cimv.f190825am - cimv2.f190825am;
            if (j34 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv51 = (cimv) cimu.f164949b;
                cimv51.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cimv51.f190825am = j34;
            }
        }
        if ((cimv.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
            cimt31 = cimv.f190826an;
            if (cimt31 == null) {
                cimt31 = cimt.f190782e;
            }
        } else {
            cimt31 = null;
        }
        if ((cimv2.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
            cimt32 = cimv2.f190826an;
            if (cimt32 == null) {
                cimt32 = cimt.f190782e;
            }
        } else {
            cimt32 = null;
        }
        cimt a16 = m90936a(cimt31, cimt32);
        if (a16 != null) {
            if (cimu.f164950c) {
                cimu.mo74035c();
                cimu.f164950c = false;
            }
            cimv cimv52 = (cimv) cimu.f164949b;
            a16.getClass();
            cimv52.f190826an = a16;
            cimv52.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        }
        if ((cimv.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
            long j35 = cimv.f190827ao - cimv2.f190827ao;
            if (j35 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv53 = (cimv) cimu.f164949b;
                cimv53.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                cimv53.f190827ao = j35;
            }
        }
        if ((cimv.f190830b & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
            long j36 = cimv.f190828ap - cimv2.f190828ap;
            if (j36 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv54 = (cimv) cimu.f164949b;
                cimv54.f190830b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                cimv54.f190828ap = j36;
            }
        }
        if ((cimv.f190830b & 1048576) != 0) {
            long j37 = cimv.f190829aq - cimv2.f190829aq;
            if (j37 != 0) {
                if (cimu.f164950c) {
                    cimu.mo74035c();
                    cimu.f164950c = false;
                }
                cimv cimv55 = (cimv) cimu.f164949b;
                cimv55.f190830b |= 1048576;
                cimv55.f190829aq = j37;
            }
        }
        cimv cimv56 = (cimv) cimu.mo74062i();
        if (m90942a(cimv56)) {
            return null;
        }
        return cimv56;
    }

    /* renamed from: a */
    static boolean m90939a(cimp cimp) {
        if (cimp == null || (cimp.f190761b.size() == 0 && cimp.f190762c.size() == 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static boolean m90942a(cimv cimv) {
        if (cimv != null) {
            return cimv.f190831c <= 0 && cimv.f190832d <= 0 && cimv.f190833e <= 0 && cimv.f190834f <= 0 && cimv.f190835g.size() == 0 && cimv.f190836h.size() == 0 && cimv.f190837i.size() == 0 && cimv.f190838j.size() == 0 && cimv.f190839k.size() == 0 && cimv.f190840l.size() == 0 && cimv.f190842n.size() == 0 && cimv.f190843o.size() == 0 && cimv.f190844p.size() == 0 && cimv.f190845q.size() == 0 && cimv.f190846r <= 0 && cimv.f190847s <= 0 && cimv.f190848t <= 0 && cimv.f190849u <= 0 && cimv.f190850v <= 0 && cimv.f190851w <= 0 && cimv.f190852x <= 0 && cimv.f190853y <= 0 && cimv.f190854z <= 0 && cimv.f190790A <= 0 && cimv.f190791B <= 0 && cimv.f190792C <= 0 && cimv.f190793D <= 0 && cimv.f190794E <= 0 && cimv.f190796G <= 0 && cimv.f190810U <= 0 && cimv.f190811V <= 0 && cimv.f190812W <= 0 && cimv.f190813X <= 0 && cimv.f190814Y <= 0 && cimv.f190815Z <= 0 && cimv.f190817aa <= 0 && cimv.f190818ab <= 0 && cimv.f190819ac <= 0 && cimv.f190820ad <= 0 && cimv.f190821ae <= 0 && cimv.f190822af <= 0 && cimv.f190823ak <= 0 && cimv.f190824al <= 0 && cimv.f190825am <= 0 && cimv.f190827ao <= 0 && cimv.f190828ap <= 0 && cimv.f190829aq <= 0;
        }
        return true;
    }
}
