package p000;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: epv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epv {
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01df A[SYNTHETIC] */
    /* renamed from: a */
    public static bsxk m10946a(bsxk bsxk) {
        bsxr bsxr;
        bsxr bsxr2;
        bsul bsul;
        bsul bsul2;
        boolean z;
        int parseInt;
        if (bsxk.f147581b != 3) {
            return bsxk;
        }
        bxvd bxvd = (bxvd) bsxk.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bsxk);
        bsxk bsxk2 = (bsxk) bxvd.f164949b;
        if (bsxk2.f147581b != 3) {
            bsxr = bsxr.f147603b;
        } else {
            bsxr = (bsxr) bsxk2.f147582c;
        }
        bxvd bxvd2 = (bxvd) bsxr.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) bsxr);
        bsxq bsxq = (bsxq) bxvd2;
        if (bsxq.f164950c) {
            bsxq.mo74035c();
            bsxq.f164950c = false;
        }
        bsxr bsxr3 = bsxr.f147603b;
        ((bsxr) bsxq.f164949b).f147605a = GeneratedMessageLite.m124030de();
        bsxk bsxk3 = (bsxk) bxvd.f164949b;
        if (bsxk3.f147581b == 3) {
            bsxr2 = (bsxr) bsxk3.f147582c;
        } else {
            bsxr2 = bsxr.f147603b;
        }
        bxwc bxwc = bsxr2.f147605a;
        int size = bxwc.size();
        int i = 0;
        while (true) {
            int i2 = 8;
            if (i >= size) {
                bxvd da = bsul.f147142j.mo74144da();
                bxvd da2 = bswq.f147475c.mo74144da();
                String string = rpr.m34216b().getString(C0126R.string.common_something_went_wrong);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bswq bswq = (bswq) da2.f164949b;
                string.getClass();
                bswq.f147477a = 1 | bswq.f147477a;
                bswq.f147478b = string;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsul bsul3 = (bsul) da.f164949b;
                bswq bswq2 = (bswq) da2.mo74062i();
                bswq2.getClass();
                bsul3.f147147d = bswq2;
                bsul3.f147144a |= 8;
                bsul = (bsul) da.mo74062i();
            } else {
                bsul2 = (bsul) bxwc.get(i);
                if ((bsul2.f147144a & 4) != 0) {
                    bsvb bsvb = bsul2.f147146c;
                    if (bsvb == null) {
                        bsvb = bsvb.f147222d;
                    }
                    if (!stm.m36302d(bsvb.f147225b)) {
                    }
                }
                if ((bsul2.f147144a & 8) != 0) {
                    bswq bswq3 = bsul2.f147147d;
                    if (bswq3 == null) {
                        bswq3 = bswq.f147475c;
                    }
                    if (!stm.m36302d(bswq3.f147478b)) {
                    }
                }
                if ((bsul2.f147144a & 2) != 0) {
                    bswr bswr = bsul2.f147145b;
                    if (bswr == null) {
                        bswr = bswr.f147479e;
                    }
                    switch (bswr.f147482b) {
                        case 0:
                            i2 = 1;
                            break;
                        case 1:
                            i2 = 2;
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 5;
                            break;
                        case 5:
                            i2 = 6;
                            break;
                        case 6:
                            i2 = 7;
                            break;
                        case 7:
                            break;
                        case 8:
                            i2 = 9;
                            break;
                        case 9:
                            i2 = 10;
                            break;
                        case 10:
                            i2 = 11;
                            break;
                        case 11:
                            i2 = 12;
                            break;
                        case 12:
                            i2 = 13;
                            break;
                        case 13:
                        default:
                            i2 = 0;
                            break;
                        case 14:
                            i2 = 15;
                            break;
                        case 15:
                            i2 = 16;
                            break;
                    }
                    if (i2 != 0) {
                        switch (i2 - 1) {
                            case 2:
                                z = ewf.m11221a(ewf.m11222b("asm"));
                                if (z) {
                                    break;
                                }
                                break;
                            case 3:
                                z = ewf.m11221a(ewf.m11220a("asm"));
                                if (z) {
                                }
                                break;
                            case 4:
                                try {
                                    String a = spn.m35848a(rpr.m34216b(), "com.google.android.apps.maps");
                                    if (!stm.m36302d(a)) {
                                        String[] split = a.split("\\.");
                                        if (split.length >= 2 && ((parseInt = Integer.parseInt(split[0])) != 9 ? parseInt > 9 : Integer.parseInt(split[1]) >= 20) && ewf.m11221a(ewf.m11224c("asm"))) {
                                            break;
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException | NumberFormatException e) {
                                    break;
                                }
                                break;
                            case 5:
                                z = ewf.m11221a(ewf.m11225d("asm"));
                                if (z) {
                                }
                                break;
                            case 10:
                                ewf.m11223b();
                                break;
                        }
                    }
                }
                if ((bsul2.f147144a & 16) != 0) {
                    bsyq bsyq = bsul2.f147148e;
                    if (bsyq == null) {
                        bsyq = bsyq.f147699c;
                    }
                    if (cbri.m128134d()) {
                        int i3 = Build.VERSION.SDK_INT;
                        if (!stm.m36302d(bsyq.f147702b)) {
                        }
                    }
                }
                int i4 = bsul2.f147144a;
                if ((i4 & 32) == 0 && (i4 & 64) == 0) {
                    if ((i4 & 128) != 0) {
                        bsup bsup = bsul2.f147151h;
                        if (bsup == null) {
                            bsup = bsup.f147165d;
                        }
                        Intent a2 = evu.m11204a(bsup);
                        if (a2 != null && spn.m35860a(rpr.m34216b().getApplicationContext(), a2)) {
                        }
                    }
                    i++;
                    if ((bsul2.f147144a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    }
                }
            }
        }
        bsul = bsul2;
        bsxq.mo70722a(bsul);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsxk bsxk4 = (bsxk) bxvd.f164949b;
        bsxr bsxr4 = (bsxr) bsxq.mo74062i();
        bsxk bsxk5 = bsxk.f147578f;
        bsxr4.getClass();
        bsxk4.f147582c = bsxr4;
        bsxk4.f147581b = 3;
        return (bsxk) bxvd.mo74062i();
    }
}
