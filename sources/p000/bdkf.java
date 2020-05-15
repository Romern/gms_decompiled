package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bdkf */
final /* synthetic */ class bdkf implements Runnable {

    /* renamed from: a */
    private final bdkg f105788a;

    /* renamed from: b */
    private final cios f105789b;

    /* renamed from: c */
    private final boolean f105790c;

    /* renamed from: d */
    private final String f105791d;

    /* renamed from: e */
    private final cimz f105792e;

    /* renamed from: f */
    private final String f105793f;

    public bdkf(bdkg bdkg, cios cios, boolean z, String str, cimz cimz, String str2) {
        this.f105788a = bdkg;
        this.f105789b = cios;
        this.f105790c = z;
        this.f105791d = str;
        this.f105792e = cimz;
        this.f105793f = str2;
    }

    public final void run() {
        String str;
        bdkg bdkg = this.f105788a;
        cios cios = this.f105789b;
        boolean z = this.f105790c;
        String str2 = this.f105791d;
        cimz cimz = this.f105792e;
        String str3 = this.f105793f;
        bdgf bdgf = (bdgf) bdkg.f105796c.mo6445a();
        bxvd bxvd = (bxvd) cios.mo74142c(5);
        bxvd.mo73625a((bxvk) cios);
        bxvd da = cioe.f191045g.mo74144da();
        int i = bdgf.f105582i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cioe cioe = (cioe) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            cioe.f191050d = i2;
            int i3 = cioe.f191047a | 4;
            cioe.f191047a = i3;
            String str4 = bdgf.f105575b;
            if (str4 != null) {
                str4.getClass();
                cioe.f191047a = i3 | 1;
                cioe.f191048b = str4;
            }
            Long l = bdgf.f105580g;
            if (l != null) {
                long longValue = l.longValue();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cioe cioe2 = (cioe) da.f164949b;
                cioe2.f191047a |= 8;
                cioe2.f191051e = longValue;
            }
            String str5 = bdgf.f105577d;
            if (str5 != null) {
                cioe cioe3 = (cioe) da.f164949b;
                str5.getClass();
                cioe3.f191047a |= 2;
                cioe3.f191049c = str5;
            }
            String str6 = bdgf.f105576c;
            if (str6 != null) {
                cioe cioe4 = (cioe) da.f164949b;
                str6.getClass();
                cioe4.f191047a |= 16;
                cioe4.f191052f = str6;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cios cios2 = (cios) bxvd.f164949b;
            cioe cioe5 = (cioe) da.mo74062i();
            cioe5.getClass();
            cios2.f191120f = cioe5;
            cios2.f191115a |= 16;
            bxvd da2 = ciog.f191055d.mo74144da();
            long freeSpace = bdgf.f105578e.mo54435a().getFreeSpace() / 1024;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ciog ciog = (ciog) da2.f164949b;
            int i4 = ciog.f191057a | 1;
            ciog.f191057a = i4;
            ciog.f191058b = freeSpace;
            long j = bdgf.f105579f;
            ciog.f191057a = i4 | 2;
            ciog.f191059c = j;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cios cios3 = (cios) bxvd.f164949b;
            ciog ciog2 = (ciog) da2.mo74062i();
            ciog2.getClass();
            cios3.f191131q = ciog2;
            cios3.f191115a |= 4194304;
            bmzi bmzi = bdgf.f105581h;
            if (bmzi != null) {
                str = ((bdgg) bmzi.mo6606a()).f105583a;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                cioc cioc = cios.f191130p;
                if (cioc == null) {
                    cioc = cioc.f191040c;
                }
                bxvd bxvd2 = (bxvd) cioc.mo74142c(5);
                bxvd2.mo73625a((bxvk) cioc);
                if (!((cioc) bxvd2.f164949b).f191043b.isEmpty()) {
                    String str7 = str + "::" + ((cioc) bxvd2.f164949b).f191043b;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cioc cioc2 = (cioc) bxvd2.f164949b;
                    str7.getClass();
                    cioc2.f191042a |= 1;
                    cioc2.f191043b = str7;
                } else {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cioc cioc3 = (cioc) bxvd2.f164949b;
                    str.getClass();
                    cioc3.f191042a |= 1;
                    cioc3.f191043b = str;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                cios cios4 = (cios) bxvd.f164949b;
                cioc cioc4 = (cioc) bxvd2.mo74062i();
                cioc4.getClass();
                cios4.f191130p = cioc4;
                cios4.f191115a |= 1048576;
            }
            cios cios5 = (cios) bxvd.mo74062i();
            bxvd bxvd3 = (bxvd) cios5.mo74142c(5);
            bxvd3.mo73625a((bxvk) cios5);
            if (!z) {
                if (str2 == null) {
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    cios cios6 = (cios) bxvd3.f164949b;
                    cios6.f191115a &= -5;
                    cios6.f191118d = cios.f191113s.f191118d;
                } else {
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    cios cios7 = (cios) bxvd3.f164949b;
                    str2.getClass();
                    cios7.f191115a |= 4;
                    cios7.f191118d = str2;
                }
            } else if (str2 == null) {
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cios cios8 = (cios) bxvd3.f164949b;
                cios8.f191115a &= -65537;
                cios8.f191128n = cios.f191113s.f191128n;
            } else {
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cios cios9 = (cios) bxvd3.f164949b;
                str2.getClass();
                cios9.f191115a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                cios9.f191128n = str2;
            }
            if (cimz != null) {
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cios cios10 = (cios) bxvd3.f164949b;
                cimz.getClass();
                cios10.f191126l = cimz;
                cios10.f191115a |= 8192;
            }
            if (str3 != null) {
                bxvd da3 = cioc.f191040c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cioc cioc5 = (cioc) da3.f164949b;
                str3.getClass();
                cioc5.f191042a |= 1;
                cioc5.f191043b = str3;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                cios cios11 = (cios) bxvd3.f164949b;
                cioc cioc6 = (cioc) da3.mo74062i();
                cioc6.getClass();
                cios11.f191130p = cioc6;
                cios11.f191115a |= 1048576;
            }
            ((bdqj) bdkg.f105795b.mo6445a()).mo58298a((cios) bxvd3.mo74062i());
            bdpz bdpz = bdkg.f105794a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (bdpz.f106242a) {
                bdpz.f106243b++;
                if (elapsedRealtime - bdpz.f106244c > 1000) {
                    bdpz.f106243b = 0;
                    bdpz.f106244c = elapsedRealtime;
                }
            }
            return;
        }
        throw null;
    }
}
