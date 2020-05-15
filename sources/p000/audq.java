package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: audq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audq {
    static {
        audg.m76790a("EventLoggerHelper");
    }

    /* renamed from: a */
    public static int m76830a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 3;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private static int m76835b(int i) {
        if (i != 0) {
            return i != 1 ? 4 : 3;
        }
        return 2;
    }

    /* renamed from: c */
    private static int m76836c(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 1 : 3;
        }
        return 2;
    }

    /* renamed from: a */
    private static bolj m76831a(Context context, String str) {
        bxvd da = bolj.f133546h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bolj bolj = (bolj) da.f164949b;
        str.getClass();
        bolj.f133548a |= 4;
        bolj.f133551d = str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String b = bmxx.m108578b(telephonyManager.getSimCountryIso());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bolj bolj2 = (bolj) da.f164949b;
        b.getClass();
        bolj2.f133548a |= 1;
        bolj2.f133549b = b;
        String b2 = bmxx.m108578b(telephonyManager.getNetworkCountryIso());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bolj bolj3 = (bolj) da.f164949b;
        b2.getClass();
        bolj3.f133548a |= 2;
        bolj3.f133550c = b2;
        return (bolj) da.mo74062i();
    }

    /* renamed from: a */
    public static void m76832a(Context context, int i, bowt bowt, long j, int i2, long j2) {
        int i3;
        int i4;
        bowt bowt2 = bowt;
        long j3 = j;
        long j4 = j2;
        bxvd da = bolt.f133572i.mo74144da();
        int c = m76836c(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bolt bolt = (bolt) da.f164949b;
        bolt.f133575b = c - 1;
        int i5 = 1;
        bolt.f133574a |= 1;
        int a = bowq.m111617a(bowt2.f135178d);
        if (a != 0 && a == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bolt bolt2 = (bolt) da.f164949b;
            bolt2.f133576c = 2;
            bolt2.f133574a |= 2;
        } else {
            int a2 = bowq.m111617a(bowt2.f135178d);
            if (a2 != 0 && a2 == 3) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bolt bolt3 = (bolt) da.f164949b;
                bolt3.f133576c = 1;
                bolt3.f133574a |= 2;
            }
        }
        if (!bowt2.f135188n) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bolt bolt4 = (bolt) da.f164949b;
        bolt4.f133577d = i3 - 1;
        int i6 = bolt4.f133574a | 4;
        bolt4.f133574a = i6;
        if (bowt2.f135187m) {
            bolt4.f133578e = 2;
            i4 = i6 | 8;
            bolt4.f133574a = i4;
        } else {
            if (bowt2.f135189o) {
                bolt4.f133578e = 3;
            } else {
                bolt4.f133578e = 1;
            }
            i4 = i6 | 8;
            bolt4.f133574a = i4;
        }
        if (j3 != 0) {
            int i7 = i4 | 16;
            bolt4.f133574a = i7;
            bolt4.f133579f = j3;
            int i8 = i2 - 1;
            if (i8 == 0) {
                i5 = 2;
            } else if (i8 == 1) {
                i5 = 3;
            } else if (i8 == 2) {
                i5 = 4;
            } else if (i8 == 3) {
                i5 = 5;
            } else if (i8 == 4) {
                i5 = 7;
            } else if (i8 == 5) {
                i5 = 8;
            }
            bolt4.f133580g = i5 - 1;
            i4 = i7 | 32;
            bolt4.f133574a = i4;
        }
        if (j4 != 0) {
            bolt4.f133574a = i4 | 64;
            bolt4.f133581h = j4;
        }
        bolj a3 = m76831a(context, bowt2.f135192r);
        bxvd bxvd = (bxvd) a3.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a3);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bolj bolj = (bolj) bxvd.f164949b;
        bolt bolt5 = (bolt) da.mo74062i();
        bolj bolj2 = bolj.f133546h;
        bolt5.getClass();
        bolj.f133554g = bolt5;
        bolj.f133548a |= 32;
        String valueOf = String.valueOf(bxvd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("logging user report event: ");
        sb.append(valueOf);
        sb.toString();
        audp.m76829a((bolj) bxvd.mo74062i());
    }

    /* renamed from: a */
    public static void m76833a(Context context, bolp bolp) {
        bolj a = m76831a(context, "");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bolj bolj = (bolj) bxvd.f164949b;
        bolj bolj2 = bolj.f133546h;
        bolp.getClass();
        bolj.f133552e = bolp;
        bolj.f133548a |= 8;
        String valueOf = String.valueOf(bxvd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("logging syncer event: ");
        sb.append(valueOf);
        sb.toString();
        audp.m76829a((bolj) bxvd.mo74062i());
    }

    /* renamed from: a */
    public static void m76834a(Context context, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        int i8;
        int i9;
        int i10 = i5;
        int i11 = 2;
        if (i - 1 != 1) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        bxvd da = boli.f133531n.mo74144da();
        int c = m76836c(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boli boli = (boli) da.f164949b;
        boli.f133534b = c - 1;
        boli.f133533a |= 1;
        int b = m76835b(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boli boli2 = (boli) da.f164949b;
        boli2.f133535c = b - 1;
        boli2.f133533a |= 2;
        int b2 = m76835b(i3);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boli boli3 = (boli) da.f164949b;
        boli3.f133536d = b2 - 1;
        int i12 = 4;
        boli3.f133533a |= 4;
        String l = Long.toString(audi.m76797a(context, i8));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boli boli4 = (boli) da.f164949b;
        l.getClass();
        boli4.f133533a |= 16;
        boli4.f133538f = l;
        String l2 = Long.toString(audi.m76803b(context, i8));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boli boli5 = (boli) da.f164949b;
        l2.getClass();
        boli5.f133533a |= 8;
        boli5.f133537e = l2;
        long c2 = audi.m76804c(context, i8);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boli boli6 = (boli) da.f164949b;
        int i13 = boli6.f133533a | 32;
        boli6.f133533a = i13;
        boli6.f133539g = c2;
        int i14 = 3;
        switch (i4) {
            case 1:
                i12 = 2;
                break;
            case 2:
                i12 = 3;
                break;
            case 3:
                break;
            case 4:
                i12 = 5;
                break;
            case 5:
                i12 = 6;
                break;
            case 6:
                i12 = 7;
                break;
            default:
                i12 = 1;
                break;
        }
        boli6.f133540h = i12 - 1;
        int i15 = i13 | 64;
        boli6.f133533a = i15;
        if (i10 != 1) {
            i9 = i10 != 2 ? 1 : 3;
        } else {
            i9 = 2;
        }
        boli6.f133541i = i9 - 1;
        int i16 = i15 | 128;
        boli6.f133533a = i16;
        int i17 = i6 - 2;
        if (i17 == -1 || i17 == 0) {
            i14 = 1;
        } else if (i17 != 1) {
            i14 = 2;
        }
        boli6.f133542j = i14 - 1;
        int i18 = i16 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        boli6.f133533a = i18;
        if (i7 - 2 != 1) {
            i11 = 1;
        }
        boli6.f133543k = i11 - 1;
        int i19 = i18 | 512;
        boli6.f133533a = i19;
        int i20 = i19 | 1024;
        boli6.f133533a = i20;
        boli6.f133544l = z;
        boli6.f133533a = i20 | 2048;
        boli6.f133545m = z2;
        boli boli7 = (boli) da.mo74062i();
        bolj a = m76831a(context, str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bolj bolj = (bolj) bxvd.f164949b;
        bolj bolj2 = bolj.f133546h;
        boli7.getClass();
        bolj.f133553f = boli7;
        bolj.f133548a |= 16;
        String valueOf = String.valueOf(bxvd);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("logging phone number lookup event: ");
        sb.append(valueOf);
        sb.toString();
        audp.m76829a((bolj) bxvd.mo74062i());
    }
}
