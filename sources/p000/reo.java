package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: reo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class reo {

    /* renamed from: a */
    static String f42814a = null;

    /* renamed from: b */
    private static final Object f42815b = new Object();

    /* renamed from: c */
    private final Context f42816c;

    /* renamed from: d */
    private final rdp f42817d;

    /* renamed from: e */
    private final rbp f42818e;

    /* renamed from: f */
    private final rai f42819f;

    /* renamed from: g */
    private final rec f42820g;

    /* renamed from: h */
    private final ModuleManager f42821h;

    /* renamed from: i */
    private final ren f42822i;

    public reo(Context context, rdp rdp, rec rec, rbp rbp, rai rai, ModuleManager moduleManager, ren ren) {
        sdo.m34959a(context);
        this.f42816c = context;
        sdo.m34959a(rdp);
        this.f42817d = rdp;
        this.f42820g = rec;
        this.f42818e = rbp;
        this.f42819f = rai;
        this.f42821h = moduleManager;
        this.f42822i = ren;
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0374 A[EDGE_INSN: B:174:0x0374->B:153:0x0374 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    private final cagn m33469a(caik caik, List list, String str) {
        cafx cafx;
        char c;
        int i;
        bxvd da;
        Iterator it;
        bxvd da2;
        Integer num;
        String str2;
        caik caik2 = caik;
        String str3 = str;
        bxvf bxvf = (bxvf) cagn.f174467q.mo74144da();
        int i2 = Build.VERSION.SDK_INT;
        if (cdej.f180585a.mo6606a().mo77358y()) {
            try {
                long millis = SystemClock.currentGnssTimeClock().millis();
                if (millis != 0) {
                    bxvd da3 = cagf.f173089e.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cagf cagf = (cagf) da3.f164949b;
                    cagf.f173091a |= 1;
                    cagf.f173092b = millis;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000000;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    cagf cagf2 = (cagf) da3.f164949b;
                    int i3 = cagf2.f173091a | 2;
                    cagf2.f173091a = i3;
                    cagf2.f173093c = elapsedRealtimeNanos;
                    "GNSS".getClass();
                    cagf2.f173091a = i3 | 4;
                    cagf2.f173094d = "GNSS";
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    cagn cagn = (cagn) bxvf.f164949b;
                    cagf cagf3 = (cagf) da3.mo74062i();
                    cagf3.getClass();
                    cagn.f174481n = cagf3;
                    cagn.f174469a |= 1024;
                }
            } catch (Exception e) {
                if (!(e instanceof DateTimeException)) {
                    throw e;
                }
            }
        }
        bxvd da4 = cagb.f173068e.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cagb cagb = (cagb) da4.f164949b;
        cagb.f173071b = 4;
        cagb.f173070a |= 1;
        if ((caik2.f174713a & 2048) != 0) {
            cafx = caik2.f174724l;
            if (cafx == null) {
                cafx = cafx.f173026C;
            }
        } else {
            Integer valueOf = Integer.valueOf(spn.m35881e(this.f42816c));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            } else {
                num = null;
            }
            Context context = this.f42816c;
            boolean z = caik2.f174719g;
            if ((caik2.f174713a & 32) != 0) {
                str2 = caik2.f174718f;
            } else {
                str2 = null;
            }
            cafx = spn.m35846a(context, z, str2, caik2.f174715c, num, sqq.m35991a(this.f42821h), soy.m35781a(this.f42816c));
        }
        bxvd bxvd = (bxvd) cafx.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) cafx);
        bxvf bxvf2 = (bxvf) bxvd;
        if (((cafx) bxvf2.f164949b).f173032b == 0 && caik2.f174719g) {
            long a = spn.getAndroidId(this.f42816c);
            if (bxvf2.f164950c) {
                bxvf2.mo74035c();
                bxvf2.f164950c = false;
            }
            cafx cafx2 = (cafx) bxvf2.f164949b;
            cafx cafx3 = cafx.f173026C;
            cafx2.f173031a |= 1;
            cafx2.f173032b = a;
        }
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cagb cagb2 = (cagb) da4.f164949b;
        cafx cafx4 = (cafx) bxvf2.mo74062i();
        cafx4.getClass();
        cagb2.f173072c = cafx4;
        cagb2.f173070a |= 8;
        long j = caik2.f174725m;
        if (j != 0) {
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            cagb cagb3 = (cagb) da4.f164949b;
            cagb3.f173070a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            cagb3.f173073d = j;
        }
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        cagn cagn2 = (cagn) bxvf.f164949b;
        cagb cagb4 = (cagb) da4.mo74062i();
        cagb4.getClass();
        cagn2.f174472d = cagb4;
        cagn2.f174469a |= 4;
        cagl a2 = cagl.m126606a(caik2.f174716d);
        if (!(a2 == null || a2 == cagl.UNKNOWN)) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagn cagn3 = (cagn) bxvf.f164949b;
            cagn3.f174473e = a2.f174465yP;
            cagn3.f174469a |= 8;
        }
        if (!caik2.f174721i.isEmpty()) {
            String str4 = caik2.f174721i;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagn cagn4 = (cagn) bxvf.f164949b;
            str4.getClass();
            cagn4.f174469a |= 16;
            cagn4.f174474f = str4;
        }
        if ((caik2.f174713a & 128) != 0) {
            String str5 = caik2.f174720h;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagn cagn5 = (cagn) bxvf.f164949b;
            str5.getClass();
            cagn5.f174469a |= 32;
            cagn5.f174475g = str5;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ByteString bxtx = ((rdf) list.get(i4)).f42721b;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagn cagn6 = (cagn) bxvf.f164949b;
            bxtx.getClass();
            if (!cagn6.f174477i.mo73666a()) {
                cagn6.f174477i = GeneratedMessageLite.m124021a(cagn6.f174477i);
            }
            cagn6.f174477i.add(bxtx);
        }
        cagz a3 = cagz.m126622a(caik2.f174723k);
        if (a3 != null) {
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            cagn cagn7 = (cagn) bxvf.f164949b;
            cagn7.f174478j = a3.f174516f;
            cagn7.f174469a |= 128;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1146690621) {
            if (hashCode != 760599219) {
                if (hashCode == 1595348501 && str3.equals("qos_unmetered_periodic")) {
                    c = 2;
                    if (c == 0) {
                        i = c != 1 ? c != 2 ? 1 : 6 : 5;
                    } else {
                        i = 4;
                    }
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    cagn cagn8 = (cagn) bxvf.f164949b;
                    cagn8.f174479k = i - 1;
                    cagn8.f174469a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    da = cage.f173082f.mo74144da();
                    boolean a4 = rep.m33475a(this.f42816c);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cage cage = (cage) da.f164949b;
                    cage.f173084a |= 1;
                    cage.f173085b = a4;
                    boolean b = rep.m33476b(this.f42816c);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cage cage2 = (cage) da.f164949b;
                    cage2.f173084a |= 2;
                    cage2.f173086c = b;
                    int i5 = rep.m33477c(this.f42816c) ? 2 : 3;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cage cage3 = (cage) da.f164949b;
                    cage3.f173087d = i5 - 1;
                    cage3.f173084a |= 4;
                    Context context2 = this.f42816c;
                    String packageName = context2.getPackageName();
                    List emptyList = Collections.emptyList();
                    emptyList = soz.m35801d(context2, packageName);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cage cage4 = (cage) da.f164949b;
                    cage4.f173084a |= 8;
                    cage4.f173088e = false;
                    it = emptyList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Account account = (Account) it.next();
                        if (account.name != null && account.name.toLowerCase().endsWith("@google.com")) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            cage cage5 = (cage) da.f164949b;
                            cage5.f173084a |= 8;
                            cage5.f173088e = true;
                        }
                    }
                    cage cage6 = (cage) da.mo74062i();
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    cagn cagn9 = (cagn) bxvf.f164949b;
                    cage6.getClass();
                    cagn9.f174480l = cage6;
                    cagn9.f174469a |= 512;
                    CollectForDebugParcelable b2 = qxw.m33077b(this.f42816c);
                    da2 = cagc.f173075e.mo74144da();
                    long j2 = b2.f30028b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cagc cagc = (cagc) da2.f164949b;
                    int i6 = 1 | cagc.f173077a;
                    cagc.f173077a = i6;
                    cagc.f173078b = j2;
                    long j3 = b2.f30029c;
                    int i7 = 2 | i6;
                    cagc.f173077a = i7;
                    cagc.f173079c = j3;
                    boolean z2 = b2.f30027a;
                    cagc.f173077a = i7 | 4;
                    cagc.f173080d = z2;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    cagn cagn10 = (cagn) bxvf.f164949b;
                    cagc cagc2 = (cagc) da2.mo74062i();
                    cagc2.getClass();
                    cagn10.f174482o = cagc2;
                    cagn10.f174469a |= 2048;
                    if ((caik2.f174713a & 8192) != 0) {
                        int i8 = caik2.f174726n;
                        if (bxvf.f164950c) {
                            bxvf.mo74035c();
                            bxvf.f164950c = false;
                        }
                        cagn cagn11 = (cagn) bxvf.f164949b;
                        cagn11.f174469a |= 4096;
                        cagn11.f174483p = i8;
                    }
                    return (cagn) bxvf.mo74062i();
                }
            } else if (str3.equals("qos_oneoff")) {
                c = 0;
                if (c == 0) {
                }
                if (bxvf.f164950c) {
                }
                cagn cagn82 = (cagn) bxvf.f164949b;
                cagn82.f174479k = i - 1;
                cagn82.f174469a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                da = cage.f173082f.mo74144da();
                boolean a42 = rep.m33475a(this.f42816c);
                if (da.f164950c) {
                }
                cage cage7 = (cage) da.f164949b;
                cage7.f173084a |= 1;
                cage7.f173085b = a42;
                boolean b3 = rep.m33476b(this.f42816c);
                if (da.f164950c) {
                }
                cage cage22 = (cage) da.f164949b;
                cage22.f173084a |= 2;
                cage22.f173086c = b3;
                if (rep.m33477c(this.f42816c)) {
                }
                if (da.f164950c) {
                }
                cage cage32 = (cage) da.f164949b;
                cage32.f173087d = i5 - 1;
                cage32.f173084a |= 4;
                Context context22 = this.f42816c;
                String packageName2 = context22.getPackageName();
                List emptyList2 = Collections.emptyList();
                emptyList2 = soz.m35801d(context22, packageName2);
                if (da.f164950c) {
                }
                cage cage42 = (cage) da.f164949b;
                cage42.f173084a |= 8;
                cage42.f173088e = false;
                it = emptyList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                cage cage62 = (cage) da.mo74062i();
                if (bxvf.f164950c) {
                }
                cagn cagn92 = (cagn) bxvf.f164949b;
                cage62.getClass();
                cagn92.f174480l = cage62;
                cagn92.f174469a |= 512;
                CollectForDebugParcelable b22 = qxw.m33077b(this.f42816c);
                da2 = cagc.f173075e.mo74144da();
                long j22 = b22.f30028b;
                if (da2.f164950c) {
                }
                cagc cagc3 = (cagc) da2.f164949b;
                int i62 = 1 | cagc3.f173077a;
                cagc3.f173077a = i62;
                cagc3.f173078b = j22;
                long j32 = b22.f30029c;
                int i72 = 2 | i62;
                cagc3.f173077a = i72;
                cagc3.f173079c = j32;
                boolean z22 = b22.f30027a;
                cagc3.f173077a = i72 | 4;
                cagc3.f173080d = z22;
                if (bxvf.f164950c) {
                }
                cagn cagn102 = (cagn) bxvf.f164949b;
                cagc cagc22 = (cagc) da2.mo74062i();
                cagc22.getClass();
                cagn102.f174482o = cagc22;
                cagn102.f174469a |= 2048;
                if ((caik2.f174713a & 8192) != 0) {
                }
                return (cagn) bxvf.mo74062i();
            }
        } else if (str3.equals("qos_default_periodic")) {
            c = 1;
            if (c == 0) {
            }
            if (bxvf.f164950c) {
            }
            cagn cagn822 = (cagn) bxvf.f164949b;
            cagn822.f174479k = i - 1;
            cagn822.f174469a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            da = cage.f173082f.mo74144da();
            boolean a422 = rep.m33475a(this.f42816c);
            if (da.f164950c) {
            }
            cage cage72 = (cage) da.f164949b;
            cage72.f173084a |= 1;
            cage72.f173085b = a422;
            boolean b32 = rep.m33476b(this.f42816c);
            if (da.f164950c) {
            }
            cage cage222 = (cage) da.f164949b;
            cage222.f173084a |= 2;
            cage222.f173086c = b32;
            if (rep.m33477c(this.f42816c)) {
            }
            if (da.f164950c) {
            }
            cage cage322 = (cage) da.f164949b;
            cage322.f173087d = i5 - 1;
            cage322.f173084a |= 4;
            Context context222 = this.f42816c;
            String packageName22 = context222.getPackageName();
            List emptyList22 = Collections.emptyList();
            emptyList22 = soz.m35801d(context222, packageName22);
            if (da.f164950c) {
            }
            cage cage422 = (cage) da.f164949b;
            cage422.f173084a |= 8;
            cage422.f173088e = false;
            it = emptyList22.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            cage cage622 = (cage) da.mo74062i();
            if (bxvf.f164950c) {
            }
            cagn cagn922 = (cagn) bxvf.f164949b;
            cage622.getClass();
            cagn922.f174480l = cage622;
            cagn922.f174469a |= 512;
            CollectForDebugParcelable b222 = qxw.m33077b(this.f42816c);
            da2 = cagc.f173075e.mo74144da();
            long j222 = b222.f30028b;
            if (da2.f164950c) {
            }
            cagc cagc32 = (cagc) da2.f164949b;
            int i622 = 1 | cagc32.f173077a;
            cagc32.f173077a = i622;
            cagc32.f173078b = j222;
            long j322 = b222.f30029c;
            int i722 = 2 | i622;
            cagc32.f173077a = i722;
            cagc32.f173079c = j322;
            boolean z222 = b222.f30027a;
            cagc32.f173077a = i722 | 4;
            cagc32.f173080d = z222;
            if (bxvf.f164950c) {
            }
            cagn cagn1022 = (cagn) bxvf.f164949b;
            cagc cagc222 = (cagc) da2.mo74062i();
            cagc222.getClass();
            cagn1022.f174482o = cagc222;
            cagn1022.f174469a |= 2048;
            if ((caik2.f174713a & 8192) != 0) {
            }
            return (cagn) bxvf.mo74062i();
        }
        c = 65535;
        if (c == 0) {
        }
        if (bxvf.f164950c) {
        }
        cagn cagn8222 = (cagn) bxvf.f164949b;
        cagn8222.f174479k = i - 1;
        cagn8222.f174469a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        da = cage.f173082f.mo74144da();
        boolean a4222 = rep.m33475a(this.f42816c);
        if (da.f164950c) {
        }
        cage cage722 = (cage) da.f164949b;
        cage722.f173084a |= 1;
        cage722.f173085b = a4222;
        boolean b322 = rep.m33476b(this.f42816c);
        if (da.f164950c) {
        }
        cage cage2222 = (cage) da.f164949b;
        cage2222.f173084a |= 2;
        cage2222.f173086c = b322;
        if (rep.m33477c(this.f42816c)) {
        }
        if (da.f164950c) {
        }
        cage cage3222 = (cage) da.f164949b;
        cage3222.f173087d = i5 - 1;
        cage3222.f173084a |= 4;
        Context context2222 = this.f42816c;
        String packageName222 = context2222.getPackageName();
        List emptyList222 = Collections.emptyList();
        try {
            emptyList222 = soz.m35801d(context2222, packageName222);
        } catch (SecurityException e2) {
            Log.w("Uploader", "Failed to get accounts.", e2);
        }
        if (da.f164950c) {
        }
        cage cage4222 = (cage) da.f164949b;
        cage4222.f173084a |= 8;
        cage4222.f173088e = false;
        it = emptyList222.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        cage cage6222 = (cage) da.mo74062i();
        if (bxvf.f164950c) {
        }
        cagn cagn9222 = (cagn) bxvf.f164949b;
        cage6222.getClass();
        cagn9222.f174480l = cage6222;
        cagn9222.f174469a |= 512;
        CollectForDebugParcelable b2222 = qxw.m33077b(this.f42816c);
        da2 = cagc.f173075e.mo74144da();
        long j2222 = b2222.f30028b;
        if (da2.f164950c) {
        }
        cagc cagc322 = (cagc) da2.f164949b;
        int i6222 = 1 | cagc322.f173077a;
        cagc322.f173077a = i6222;
        cagc322.f173078b = j2222;
        long j3222 = b2222.f30029c;
        int i7222 = 2 | i6222;
        cagc322.f173077a = i7222;
        cagc322.f173079c = j3222;
        boolean z2222 = b2222.f30027a;
        cagc322.f173077a = i7222 | 4;
        cagc322.f173080d = z2222;
        if (bxvf.f164950c) {
        }
        cagn cagn10222 = (cagn) bxvf.f164949b;
        cagc cagc2222 = (cagc) da2.mo74062i();
        cagc2222.getClass();
        cagn10222.f174482o = cagc2222;
        cagn10222.f174469a |= 2048;
        if ((caik2.f174713a & 8192) != 0) {
        }
        return (cagn) bxvf.mo74062i();
    }

    /* renamed from: a */
    private static final String m33470a() {
        String o = cdej.f180585a.mo6606a().mo77348o();
        if (o.isEmpty()) {
            return cdej.f180585a.mo6606a().mo77335b();
        }
        String valueOf = String.valueOf(o);
        return valueOf.length() == 0 ? new String("oauth2:") : "oauth2:".concat(valueOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* renamed from: a */
    public static reo m33471a(rdp rdp, rbp rbp) {
        char c;
        int i;
        int i2;
        rdz rdz;
        rpr b = rpr.m34216b();
        sdo.m34959a(b);
        String l = cdej.f180585a.mo6606a().mo77345l();
        int hashCode = l.hashCode();
        if (hashCode != -2106708891) {
            if (hashCode != 1445949657) {
                if (hashCode == 1996312509 && l.equals("CRONET")) {
                    c = 2;
                    if (c != 0) {
                        i = 1;
                    } else if (c == 1) {
                        i = 2;
                    } else if (c == 2) {
                        i = 3;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    i2 = i - 1;
                    if (i2 != 1) {
                        rdz = new rek(b, cdej.m132796b(), rbp);
                    } else if (i2 != 2) {
                        rdz = new rdz(b, cdej.m132796b(), rbp);
                    } else {
                        rdz = new reg(b, cdej.m132796b(), rbp);
                    }
                    return new reo(b, rdp, rdz, rbp, rae.f42460a, ModuleManager.get(b), new ren(b));
                }
            } else if (l.equals("APACHE_HTTP")) {
                c = 0;
                if (c != 0) {
                }
                i2 = i - 1;
                if (i2 != 1) {
                }
                return new reo(b, rdp, rdz, rbp, rae.f42460a, ModuleManager.get(b), new ren(b));
            }
        } else if (l.equals("HTTP_URL_CONNECTION")) {
            c = 1;
            if (c != 0) {
            }
            i2 = i - 1;
            if (i2 != 1) {
            }
            return new reo(b, rdp, rdz, rbp, rae.f42460a, ModuleManager.get(b), new ren(b));
        }
        c = 65535;
        if (c != 0) {
        }
        i2 = i - 1;
        if (i2 != 1) {
        }
        return new reo(b, rdp, rdz, rbp, rae.f42460a, ModuleManager.get(b), new ren(b));
    }

    /* renamed from: a */
    private final void m33472a(List list, rag rag) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rdg rdg = (rdg) list.get(i);
            String a = rer.m33480a(rdg.f42724b);
            if (cddx.m132740d()) {
                rai rai = this.f42819f;
                bnre i2 = rdg.f42725c.listIterator();
                int i3 = 0;
                while (i2.hasNext()) {
                    i3 += ((rdf) i2.next()).f42722c;
                }
                rai.mo24409b(a, rag, i3);
            } else {
                this.f42819f.mo24409b(a, rag, rdg.f42725c.size());
            }
        }
    }

    /* renamed from: a */
    private final void m33473a(rea rea) {
        int b = rea.mo24541b();
        StringBuilder sb = new StringBuilder(34);
        sb.append("Deleting ");
        sb.append(b);
        sb.append(" LogEventSets.");
        sb.toString();
        this.f42817d.mo24485a(rea.f42781c);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0443, code lost:
        if (r8.getLong("qos_tier_fingerprint", Long.MIN_VALUE) == r3.f174525b) goto L_0x0463;
     */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x060a A[LOOP:3: B:43:0x0128->B:251:0x060a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0608 A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo24562a(String str, bngx bngx) {
        rdi rdi;
        Iterator it;
        boolean z;
        ArrayList arrayList;
        Map.Entry entry;
        int i;
        boolean z2;
        reb reb;
        int i2;
        cago cago;
        rag rag;
        byte[] bArr;
        String str2;
        String str3;
        cafq c;
        int i3;
        String str4 = str;
        rdi h = this.f42817d.mo24504h();
        Iterator it2 = this.f42817d.mo24481a(bngx).entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Collection collection = (Collection) entry2.getValue();
            if (collection == null) {
                str4 = str;
            } else if (!collection.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                long g = cdej.m132801g();
                long c2 = cdes.m132868c();
                rea rea = new rea(this.f42816c);
                Iterator it3 = collection.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        rdi = h;
                        it = it2;
                        break;
                    }
                    rdt rdt = (rdt) it3.next();
                    try {
                        rdg a = h.mo24476a(g, rdt);
                        if (!a.f42725c.isEmpty() || !a.f42726d.isEmpty()) {
                            rea.f42780b.add(m33469a(a.f42724b, a.f42725c, str4));
                            rea.f42779a.add(a);
                            rea.f42781c.add(a);
                            c2--;
                            bnre i4 = a.f42725c.listIterator();
                            long j = 0;
                            while (i4.hasNext()) {
                                j += (long) ((rdf) i4.next()).f42721b.mo73744a();
                                h = h;
                                it3 = it3;
                                it2 = it2;
                            }
                            Iterator it4 = it3;
                            rdi = h;
                            it = it2;
                            g -= j;
                            if (g <= 0) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            if (g <= 0 || c2 <= 0) {
                                if (!cdes.f180618a.mo6606a().mo77364a()) {
                                    break;
                                }
                                this.f42818e.mo24444a(rdt.f42762a, i3);
                                if (!rea.mo24540a()) {
                                    rea.mo24545f();
                                    arrayList2.add(rea);
                                }
                                rea rea2 = new rea(this.f42816c);
                                long g2 = cdej.m132801g();
                                rea = rea2;
                                c2 = cdes.m132868c();
                                g = g2;
                            }
                            h = rdi;
                            it3 = it4;
                            it2 = it;
                        }
                    } catch (IOException e) {
                        rdi = h;
                        it = it2;
                        Log.w("Uploader", "Could not read logs", e);
                    }
                }
                if (!rea.mo24540a()) {
                    rea.mo24545f();
                    arrayList2.add(rea);
                }
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    rea rea3 = (rea) arrayList2.get(i5);
                    String str5 = null;
                    if (!cddp.m132711c() || rea3.mo24540a() || (c = this.f42819f.mo24410c()) == null) {
                        z = false;
                    } else {
                        try {
                            Context context = this.f42816c;
                            rbz a2 = rca.m33323a(context, new qws(context, "CLEARCUT_FUNNEL", null).mo24335a(c.serializeToBytes()).mo24321a());
                            rdf rdf = new rdf(null, a2.f42608b, 1);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(rdf);
                            rdg rdg = new rdg(a2.f42607a, arrayList3);
                            if (!this.f42819f.mo24407a(rdg.f42724b.f174720h)) {
                                this.f42819f.mo24411d();
                                z = false;
                            } else {
                                rea3.f42780b.add(m33469a(rdg.f42724b, rdg.f42725c, str4));
                                rea3.f42779a.add(rdg);
                                z = true;
                            }
                        } catch (IOException e2) {
                            Log.e("Uploader", "failed to serialize funnel event", e2);
                            this.f42819f.mo24411d();
                            z = false;
                        }
                    }
                    caik caik = (caik) entry2.getKey();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    boolean c3 = cddp.m132711c();
                    String str6 = caik.f174717e;
                    if (!str6.isEmpty()) {
                        if (soz.m35791a(this.f42816c, new Account(str6, "com.google"))) {
                            try {
                                str3 = gie.m13194b(this.f42816c, new Account(str6, "com.google"), m33470a());
                            } catch (gid | IOException | SecurityException e3) {
                                this.f42818e.mo24441a(2, (String) null);
                                String valueOf = String.valueOf(e3.getClass());
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                                sb.append("Failed to get auth token due to ");
                                sb.append(valueOf);
                                Log.i("Uploader", sb.toString());
                                str3 = null;
                            }
                        } else {
                            this.f42818e.mo24441a(1, (String) null);
                            for (String str7 : rea3.mo24543d()) {
                                this.f42818e.mo24441a(1, str7);
                            }
                            String valueOf2 = String.valueOf(rea3.mo24543d());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 92);
                            sb2.append("Failed to get auth token for log sources [");
                            sb2.append(valueOf2);
                            sb2.append("] because the account doesn't exist on the device.");
                            Log.i("Uploader", sb2.toString());
                            str3 = null;
                        }
                        if (str3 != null) {
                            this.f42818e.mo24441a(0, (String) null);
                        }
                        if (str3 != null) {
                            str5 = str3;
                        } else {
                            i = size;
                            entry = entry2;
                            arrayList = arrayList2;
                            z2 = true;
                            i5++;
                            if (!z2) {
                                return false;
                            }
                            str4 = str;
                            size = i;
                            entry2 = entry;
                            arrayList2 = arrayList;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    try {
                        shr.m35316b(17195007);
                        rec rec = this.f42820g;
                        if (str5 != null) {
                            String a3 = m33470a();
                            if (a3 != null) {
                                if (a3.startsWith("oauth2:")) {
                                    str2 = str5.length() == 0 ? new String("Bearer ") : "Bearer ".concat(str5);
                                }
                            }
                            str2 = str5.length() == 0 ? new String("GoogleLogin auth=") : "GoogleLogin auth=".concat(str5);
                        } else {
                            str2 = null;
                        }
                        reb = rec.mo24537a(caik, rea3, str2, (String) qxu.f42402a.mo58455c());
                        shr.m35312a();
                    } catch (IOException e4) {
                        Log.e("Uploader", String.format("Clearcut transport failed to make network request. Use %d milliseconds.", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime2)), e4);
                        shr.m35312a();
                        reb = null;
                    } catch (Throwable th) {
                        shr.m35312a();
                        throw th;
                    }
                    if (reb != null) {
                        int i6 = reb.f42784b;
                        int i7 = 3;
                        if (i6 == 207) {
                            i7 = 6;
                        } else if (i6 >= 200 && i6 < 300) {
                            i7 = 4;
                        } else if (i6 == 400) {
                            Log.e("Uploader", "Server returned 400... deleting local malformed logs");
                            i7 = !cddp.f180539a.mo6606a().mo77298b() ? 4 : 7;
                        } else if (i6 == 401) {
                            Log.w("Uploader", "Server returned 401... invalidating auth token");
                            gie.m13192a(this.f42816c, str5);
                        } else if (i6 == 500) {
                            Log.w("Uploader", "Server returned 500... server crashed");
                        } else if (i6 == 501) {
                            Log.w("Uploader", "Server returned 501... service doesn't seem to exist");
                        } else if (i6 == 502) {
                            Log.w("Uploader", "Server returned 502... servers are down");
                        } else if (i6 == 503) {
                            Log.w("Uploader", "Server returned 503... service is unavailable");
                        } else if (i6 == 504) {
                            Log.w("Uploader", "Server returned 504... timeout");
                        } else if (i6 != 507) {
                            String str8 = reb.f42785c;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 51);
                            sb3.append("Unexpected error received from server: ");
                            sb3.append(i6);
                            sb3.append(" ");
                            sb3.append(str8);
                            Log.e("Uploader", sb3.toString());
                        } else {
                            Log.w("Uploader", "Server returned 507... downstream dependency error");
                            i7 = 5;
                        }
                        if (cdej.f180585a.mo6606a().mo77342i() || (bArr = reb.f42783a) == null) {
                            i = size;
                            entry = entry2;
                            arrayList = arrayList2;
                            i2 = i7;
                            cago = null;
                        } else {
                            try {
                                cago cago2 = (cago) GeneratedMessageLite.m124016a(cago.f174485f, bArr, bxus.m123744c());
                                long j2 = cago2.f174488b;
                                if (j2 >= 0) {
                                    StringBuilder sb4 = new StringBuilder(55);
                                    sb4.append("LogResponse: wait time in millis = ");
                                    sb4.append(j2);
                                    sb4.toString();
                                    i = size;
                                    SharedPreferences.Editor edit = this.f42822i.f42813a.getSharedPreferences("timing_control_pref", 0).edit();
                                    edit.putLong("server_suggested_interval_millis", j2);
                                    edit.apply();
                                } else {
                                    i = size;
                                }
                                if ((cago2.f174487a & 4) != 0) {
                                    Context context2 = this.f42816c;
                                    cahb cahb = cago2.f174489c;
                                    if (cahb == null) {
                                        cahb = cahb.f174522c;
                                    }
                                    SharedPreferences sharedPreferences = context2.getSharedPreferences("QosTierPref", 0);
                                    if (sharedPreferences.contains("qos_tier_fingerprint")) {
                                        entry = entry2;
                                        arrayList = arrayList2;
                                    } else {
                                        entry = entry2;
                                        arrayList = arrayList2;
                                    }
                                    rem.m33466a(sharedPreferences, cahb);
                                    aytw.m84814b();
                                    rem.m33466a(context2.createDeviceProtectedStorageContext().getSharedPreferences("QosTierPref", 0), cahb);
                                } else {
                                    entry = entry2;
                                    arrayList = arrayList2;
                                }
                                if ((cago2.f174487a & 8) != 0) {
                                    cags cags = cago2.f174490d;
                                    if (cags == null) {
                                        cags = cags.f174499b;
                                    }
                                    String join = TextUtils.join(",", cags.f174501a);
                                    synchronized (f42815b) {
                                        if (f42814a != null) {
                                            if (!join.equals(f42814a)) {
                                            }
                                        }
                                        SharedPreferences.Editor edit2 = this.f42816c.getSharedPreferences("LogStoreUtil", 0).edit();
                                        edit2.putString("log_source_batching_blacklist", join);
                                        edit2.apply();
                                        String valueOf3 = String.valueOf(join);
                                        if (valueOf3.length() == 0) {
                                            new String("Set log source batching blacklist - ");
                                        } else {
                                            "Set log source batching blacklist - ".concat(valueOf3);
                                        }
                                        f42814a = join;
                                    }
                                }
                                cago = cago2;
                            } catch (bxwf e5) {
                                i = size;
                                entry = entry2;
                                arrayList = arrayList2;
                                this.f42818e.mo24442a(reb.f42784b, reb.f42783a);
                                Log.e("Uploader", "Error parsing log response content.", e5);
                                cago = null;
                            }
                            i2 = i7;
                        }
                    } else {
                        i = size;
                        entry = entry2;
                        arrayList = arrayList2;
                        cago = null;
                        i2 = 2;
                    }
                    this.f42818e.mo24449b(caik, i2);
                    int i8 = i2 - 1;
                    if (i8 == 1 || i8 == 2) {
                        z2 = false;
                        i5++;
                        if (!z2) {
                        }
                    } else {
                        if (i8 == 4) {
                            z2 = true;
                        } else if (i8 != 5) {
                            this.f42818e.mo24453c(caik, rea3.mo24542c() - elapsedRealtime);
                            m33473a(rea3);
                            if (!c3) {
                                z2 = true;
                            } else {
                                if (z) {
                                    this.f42819f.mo24411d();
                                }
                                if (i2 == 7) {
                                    rag = rag.DROPS_BY_BAD_REQUEST;
                                } else {
                                    rag = rag.EVENTS_UPLOADED;
                                }
                                m33472a(rea3.f42781c, rag);
                                z2 = true;
                            }
                        } else {
                            this.f42818e.mo24453c(caik, rea3.mo24542c() - elapsedRealtime);
                            if (cago == null || cago.f174491e.size() <= 0) {
                                m33473a(rea3);
                                if (c3) {
                                    m33472a(rea3.f42781c, rag.DROPS_BY_PARTIAL_FAILURE_WITHOUT_STATUS);
                                }
                                z2 = true;
                            } else {
                                bnia bnia = new bnia();
                                bxwc bxwc = cago.f174491e;
                                int size2 = bxwc.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    cagr cagr = (cagr) bxwc.get(i9);
                                    if (cagr.f174496a >= 0) {
                                        int a4 = cagq.m126613a(cagr.f174497b);
                                        if (a4 != 0 && a4 == 2) {
                                            bnia.mo67629b(Integer.valueOf(cagr.f174496a));
                                        }
                                    }
                                }
                                bnic a5 = bnia.mo67751a();
                                ArrayList arrayList4 = new ArrayList();
                                for (int i10 = 0; i10 < rea3.mo24541b(); i10++) {
                                    if (!a5.contains(Integer.valueOf(i10))) {
                                        if (!c3 || !rea3.mo24538a(i10).f42724b.f174721i.equals("CLEARCUT_FUNNEL")) {
                                            arrayList4.add(rea3.mo24538a(i10));
                                        } else {
                                            this.f42819f.mo24411d();
                                        }
                                    }
                                }
                                int size3 = arrayList4.size();
                                int b = rea3.mo24541b();
                                int size4 = arrayList4.size();
                                StringBuilder sb5 = new StringBuilder(110);
                                sb5.append("After partial failure (207), deleting ");
                                sb5.append(size3);
                                sb5.append(" LogEventSets, and will later retry ");
                                sb5.append(b - size4);
                                sb5.append(" LogEventSets.");
                                sb5.toString();
                                this.f42817d.mo24485a(arrayList4);
                                if (c3) {
                                    m33472a(arrayList4, rag.EVENTS_UPLOADED);
                                }
                                z2 = true;
                            }
                        }
                        i5++;
                        if (!z2) {
                        }
                    }
                }
                str4 = str;
                h = rdi;
                it2 = it;
            } else {
                str4 = str;
            }
        }
        return true;
    }
}
