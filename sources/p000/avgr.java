package p000;

import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: avgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avgr {

    /* renamed from: a */
    public static final srn f93153a = srn.m36124a();

    /* renamed from: a */
    public static int m78482a(int i) {
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: b */
    public static int m78485b(int i) {
        if (i == C0126R.string.udc_auth_error) {
            return 3;
        }
        if (i == C0126R.string.udc_generic_error) {
            return 2;
        }
        if (i == C0126R.string.udc_network_error) {
            return 4;
        }
        if (i == C0126R.string.udc_server_error) {
            return 5;
        }
        if (i != C0126R.string.udc_network_error_write) {
            return i == C0126R.string.udc_setting_write_error ? 6 : 1;
        }
        return 7;
    }

    /* renamed from: a */
    public static bsph m78483a(bxrt bxrt, bxru bxru, ConsentFlowConfig consentFlowConfig, int i) {
        bxvd da = bsph.f146490m.mo74144da();
        if (bxrt == null) {
            return (bsph) da.mo74062i();
        }
        if ((bxrt.f164601a & 16) != 0) {
            bxss bxss = bxrt.f164607g;
            if (bxss == null) {
                bxss = bxss.f164728i;
            }
            int i2 = bxss.f164732c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsph bsph = (bsph) da.f164949b;
            bsph.f146492a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bsph.f146499h = i2;
            bxss bxss2 = bxrt.f164607g;
            if (bxss2 == null) {
                bxss2 = bxss.f164728i;
            }
            if ((bxss2.f164730a & 8) != 0) {
                bxss bxss3 = bxrt.f164607g;
                if (bxss3 == null) {
                    bxss3 = bxss.f164728i;
                }
                String str = bxss3.f164733d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsph bsph2 = (bsph) da.f164949b;
                str.getClass();
                bsph2.f146492a |= 512;
                bsph2.f146500i = str;
            }
            bxss bxss4 = bxrt.f164607g;
            if (bxss4 == null) {
                bxss4 = bxss.f164728i;
            }
            if ((bxss4.f164730a & 1) != 0) {
                bxss bxss5 = bxrt.f164607g;
                if (bxss5 == null) {
                    bxss5 = bxss.f164728i;
                }
                String str2 = bxss5.f164731b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsph bsph3 = (bsph) da.f164949b;
                str2.getClass();
                bsph3.f146492a |= 2048;
                bsph3.f146502k = str2;
            }
        }
        boolean a = m78484a(bxrt.f164603c);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsph bsph4 = (bsph) da.f164949b;
        bsph4.f146492a |= 1024;
        bsph4.f146501j = a;
        bxrs bxrs = bxrs.UNKNOWN;
        bxrs a2 = bxrs.m123045a(bxrt.f164606f);
        if (a2 == null) {
            a2 = bxrs.UNKNOWN;
        }
        int ordinal = a2.ordinal();
        int i3 = 3;
        int[] iArr = null;
        if (ordinal == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsph bsph5 = (bsph) da.f164949b;
            bsph5.f146493b = 4;
            bsph5.f146492a |= 1;
            bsoj bsoj = (bsoj) bsok.f146389h.mo74144da();
            if (bxrt.f164604d.size() != 0) {
                bsoj.mo70695a(bxrt.f164604d);
            }
            if (!(bxru == null || bxru.f164620i.size() == 0)) {
                iArr = new int[bxru.f164620i.size()];
                bxwc bxwc = bxru.f164620i;
                int size = bxwc.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    bxsi bxsi = ((bxsj) bxwc.get(i5)).f164690b;
                    if (bxsi == null) {
                        bxsi = bxsi.f164681e;
                    }
                    iArr[i4] = bxsi.f164684b;
                    i4++;
                }
            }
            if (iArr != null) {
                bsoj.mo70696b(bqcn.m112586b(iArr));
            }
            int i6 = consentFlowConfig.f109334d;
            if (i6 == 0) {
                i3 = 2;
            } else if (i6 == 1) {
                i3 = 4;
            } else if (i6 != 2) {
                i3 = i6 != 4 ? i6 != 5 ? i6 != 6 ? 1 : 7 : 6 : 5;
            }
            if (bsoj.f164950c) {
                bsoj.mo74035c();
                bsoj.f164950c = false;
            }
            bsok bsok = (bsok) bsoj.f164949b;
            bsok.f146394d = i3 - 1;
            int i7 = bsok.f146391a | 1;
            bsok.f146391a = i7;
            boolean z = consentFlowConfig.f109333c;
            int i8 = i7 | 2;
            bsok.f146391a = i8;
            bsok.f146395e = z;
            boolean z2 = consentFlowConfig.f109332b;
            int i9 = i8 | 4;
            bsok.f146391a = i9;
            bsok.f146396f = z2;
            boolean z3 = consentFlowConfig.f109331a;
            bsok.f146391a = i9 | 8;
            bsok.f146397g = z3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsph bsph6 = (bsph) da.f164949b;
            bsok bsok2 = (bsok) bsoj.mo74062i();
            bsok2.getClass();
            bsph6.f146496e = bsok2;
            bsph6.f146492a |= 32;
        } else if (ordinal != 2) {
            bnsl bnsl = (bnsl) f93153a.mo68388c();
            bnsl.mo68432a("avgr", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bxrs a3 = bxrs.m123045a(bxrt.f164606f);
            if (a3 == null) {
                a3 = bxrs.UNKNOWN;
            }
            bnsl.mo68420a("Invalid ViewType: %s", a3);
            return null;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsph bsph7 = (bsph) da.f164949b;
            bsph7.f146493b = 3;
            bsph7.f146492a |= 1;
            bxvd da2 = bson.f146405d.mo74144da();
            int a4 = bxsn.m123069a(bxrt.f164605e);
            if (a4 == 0) {
                a4 = 1;
            }
            int i10 = a4 - 1;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bson bson = (bson) da2.f164949b;
            bson.f146407a |= 2;
            bson.f146409c = i10;
            if (bxrt.f164604d.size() > 0) {
                int b = bxrt.f164604d.mo74151b(0);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bson bson2 = (bson) da2.f164949b;
                bson2.f146407a |= 1;
                bson2.f146408b = b;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsph bsph8 = (bsph) da.f164949b;
            bson bson3 = (bson) da2.mo74062i();
            bson3.getClass();
            bsph8.f146495d = bson3;
            bsph8.f146492a |= 16;
        }
        int a5 = m78482a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsph bsph9 = (bsph) da.f164949b;
        bsph9.f146494c = a5 - 1;
        bsph9.f146492a |= 2;
        return (bsph) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m78484a(String str) {
        return str != null && !str.isEmpty() && !str.equalsIgnoreCase("me");
    }
}
