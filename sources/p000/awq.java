package p000;

import com.felicanetworks.mfc.Felica;
import java.util.SimpleTimeZone;

/* renamed from: awq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awq {
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        if (r2.mo2778b() == false) goto L_0x0254;
     */
    /* renamed from: a */
    public static awz m2280a(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (str == null || str.length() == 0) {
            throw new awn("Empty convert-string", 5);
        }
        awz awz = new awz();
        awv.m2288a((Object) str);
        awx awx = new awx(str);
        int i4 = 0;
        if (awx.mo2775a(0) != 'T') {
            if (awx.mo2776a() < 2 || awx.mo2775a(1) != ':') {
                if (awx.mo2776a() < 3) {
                    z = false;
                } else if (awx.mo2775a(2) != ':') {
                    z = false;
                }
            }
            z = true;
        } else {
            z = true;
        }
        if (z) {
            awz.mo2782a(1);
            awz.mo2783b(1);
        } else {
            if (awx.mo2775a(0) == '-') {
                awx.mo2780d();
            }
            int a = awx.mo2777a("Invalid year in date string", 9999);
            if (!awx.mo2778b() || awx.mo2779c() == '-') {
                if (awx.mo2775a(0) == '-') {
                    a = -a;
                }
                awz.f2461a = Math.min(Math.abs(a), 9999);
                if (awx.mo2778b()) {
                    awx.mo2780d();
                    int a2 = awx.mo2777a("Invalid month in date string", 12);
                    if (!awx.mo2778b() || awx.mo2779c() == '-') {
                        awz.mo2782a(a2);
                        if (awx.mo2778b()) {
                            awx.mo2780d();
                            int a3 = awx.mo2777a("Invalid day in date string", 31);
                            if (!awx.mo2778b() || awx.mo2779c() == 'T') {
                                awz.mo2783b(a3);
                            } else {
                                throw new awn("Invalid date string, after day", 5);
                            }
                        }
                    } else {
                        throw new awn("Invalid date string, after month", 5);
                    }
                }
                return awz;
            }
            throw new awn("Invalid date string, after year", 5);
        }
        if (awx.mo2779c() == 'T') {
            awx.mo2780d();
        } else if (!z) {
            throw new awn("Invalid date string, missing 'T' after date", 5);
        }
        int a4 = awx.mo2777a("Invalid hour in date string", 23);
        if (awx.mo2779c() == ':') {
            awz.f2464d = Math.min(Math.abs(a4), 23);
            awx.mo2780d();
            int a5 = awx.mo2777a("Invalid minute in date string", 59);
            if (!awx.mo2778b() || awx.mo2779c() == ':' || awx.mo2779c() == 'Z' || awx.mo2779c() == '+' || awx.mo2779c() == '-') {
                awz.f2465e = Math.min(Math.abs(a5), 59);
                if (awx.mo2779c() == ':') {
                    awx.mo2780d();
                    int a6 = awx.mo2777a("Invalid whole seconds in date string", 59);
                    if (!awx.mo2778b() || awx.mo2779c() == '.' || awx.mo2779c() == 'Z' || awx.mo2779c() == '+' || awx.mo2779c() == '-') {
                        awz.f2466f = Math.min(Math.abs(a6), 59);
                        if (awx.mo2779c() == '.') {
                            awx.mo2780d();
                            int i5 = awx.f2457a;
                            int a7 = awx.mo2777a("Invalid fractional seconds in date string", 999999999);
                            if (awx.mo2779c() == 'Z' || awx.mo2779c() == '+' || awx.mo2779c() == '-') {
                                int i6 = awx.f2457a - i5;
                                while (i6 > 9) {
                                    a7 /= 10;
                                    i6--;
                                }
                                while (i6 < 9) {
                                    a7 *= 10;
                                    i6++;
                                }
                                awz.f2468h = a7;
                            } else {
                                throw new awn("Invalid date string, after fractional second", 5);
                            }
                        }
                    } else {
                        throw new awn("Invalid date string, after whole seconds", 5);
                    }
                }
                if (awx.mo2779c() == 'Z') {
                    awx.mo2780d();
                    i2 = 0;
                    i = 0;
                } else if (!awx.mo2778b()) {
                    i2 = 0;
                    i = 0;
                } else {
                    if (awx.mo2779c() == '+') {
                        i3 = 1;
                    } else if (awx.mo2779c() == '-') {
                        i3 = -1;
                    } else {
                        throw new awn("Time zone must begin with 'Z', '+', or '-'", 5);
                    }
                    awx.mo2780d();
                    int a8 = awx.mo2777a("Invalid time zone hour in date string", 23);
                    if (awx.mo2779c() == ':') {
                        awx.mo2780d();
                        i = awx.mo2777a("Invalid time zone minute in date string", 59);
                        i2 = i3;
                        i4 = a8;
                    } else {
                        throw new awn("Invalid date string, after time zone hour", 5);
                    }
                }
                awz.f2467g = new SimpleTimeZone(((i4 * 3600000) + (i * Felica.MAX_TIMEOUT)) * i2, "");
                if (awx.mo2778b()) {
                    throw new awn("Invalid date string, extra chars at end", 5);
                }
                return awz;
            }
            throw new awn("Invalid date string, after minute", 5);
        }
        throw new awn("Invalid date string, after hour", 5);
    }
}
