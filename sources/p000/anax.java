package p000;

import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: anax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anax {
    /* renamed from: a */
    public static amng m63874a(amvr amvr) {
        int i;
        String l = amvr.mo41406l();
        bxvd da = amng.f75455p.mo74144da();
        boolean e = amvr.mo41397e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng = (amng) da.f164949b;
        amng.f75457a |= 8;
        amng.f75461e = e;
        if (l != null) {
            i = l.length();
        } else {
            i = 0;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng2 = (amng) da.f164949b;
        amng2.f75457a |= 32;
        amng2.f75463g = i;
        boolean f = amvr.mo41399f();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng3 = (amng) da.f164949b;
        amng3.f75457a |= 128;
        amng3.f75465i = f;
        boolean b = amvr.mo41394b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng4 = (amng) da.f164949b;
        amng4.f75457a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        amng4.f75466j = b;
        boolean d = amvr.mo41396d();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng5 = (amng) da.f164949b;
        amng5.f75457a |= 1024;
        amng5.f75467k = d;
        boolean a = amvr.mo41393a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng6 = (amng) da.f164949b;
        amng6.f75457a |= 2048;
        amng6.f75468l = a;
        boolean c = amvr.mo41395c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        amng amng7 = (amng) da.f164949b;
        amng7.f75457a |= 4096;
        amng7.f75469m = c;
        if (amvr.mo41400g() != null) {
            int longValue = (int) amvr.mo41400g().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng8 = (amng) da.f164949b;
            amng8.f75457a |= 1;
            amng8.f75458b = longValue;
        }
        if (amvr.mo41404j() != null) {
            String j = amvr.mo41404j();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng9 = (amng) da.f164949b;
            j.getClass();
            amng9.f75457a |= 2;
            amng9.f75459c = j;
        }
        if (amvr.mo41403i() != null) {
            String l2 = Long.toString(amvr.mo41403i().longValue());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng10 = (amng) da.f164949b;
            l2.getClass();
            amng10.f75457a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            amng10.f75471o = l2;
        }
        if (amvr.mo41407m() != null) {
            String m = amvr.mo41407m();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng11 = (amng) da.f164949b;
            m.getClass();
            amng11.f75457a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            amng11.f75470n = m;
        }
        if (amvr.mo41401h() != null) {
            int longValue2 = (int) amvr.mo41401h().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng12 = (amng) da.f164949b;
            amng12.f75457a |= 4;
            amng12.f75460d = longValue2;
        }
        if (amvr.mo41405k() == null) {
            String j2 = amvr.mo41404j();
            if (!TextUtils.isEmpty(j2)) {
                try {
                    long parseLong = Long.parseLong(j2, 16);
                    if (parseLong >= 0) {
                        if (parseLong < 10000 && !TextUtils.isEmpty(amvr.mo41406l())) {
                            String l3 = amvr.mo41406l();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            amng amng13 = (amng) da.f164949b;
                            l3.getClass();
                            amng13.f75457a |= 16;
                            amng13.f75462f = l3;
                        }
                    }
                } catch (NumberFormatException e2) {
                    if (!TextUtils.isEmpty(amvr.mo41406l())) {
                        String l4 = amvr.mo41406l();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        amng amng14 = (amng) da.f164949b;
                        l4.getClass();
                        amng14.f75457a |= 16;
                        amng14.f75462f = l4;
                    }
                }
            }
        } else {
            String k = amvr.mo41405k();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng15 = (amng) da.f164949b;
            k.getClass();
            amng15.f75457a |= 64;
            amng15.f75464h = k;
            if (!TextUtils.isEmpty(amvr.mo41406l())) {
                String l5 = amvr.mo41406l();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                amng amng16 = (amng) da.f164949b;
                l5.getClass();
                amng16.f75457a |= 16;
                amng16.f75462f = l5;
            }
        }
        if ("Starred in Android".equals(amvr.mo41406l())) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amng amng17 = (amng) da.f164949b;
            "Starred in Android".getClass();
            amng17.f75457a = 16 | amng17.f75457a;
            amng17.f75462f = "Starred in Android";
        }
        return (amng) da.mo74062i();
    }
}
