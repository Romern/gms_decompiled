package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.ConsentFlowConfig;
import com.google.android.gms.udc.p077ui.UdcConsentChimeraActivity;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: avht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avht implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ UdcConsentChimeraActivity f93189a;

    public avht(UdcConsentChimeraActivity udcConsentChimeraActivity) {
        this.f93189a = udcConsentChimeraActivity;
    }

    /* renamed from: a */
    private final void m78522a(bxru bxru) {
        Fragment fragment;
        bsph bsph;
        int i;
        bxru bxru2 = bxru;
        UdcConsentChimeraActivity udcConsentChimeraActivity = this.f93189a;
        srn srn = UdcConsentChimeraActivity.f109402a;
        udcConsentChimeraActivity.f109406e = bxru2;
        udcConsentChimeraActivity.f109411j.clear();
        bxwc bxwc = bxru2.f164620i;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = this.f93189a.f109411j;
            bxsi bxsi = ((bxsj) bxwc.get(i2)).f164690b;
            if (bxsi == null) {
                bxsi = bxsi.f164681e;
            }
            arrayList.add(Integer.valueOf(bxsi.f164684b));
        }
        UdcConsentChimeraActivity udcConsentChimeraActivity2 = this.f93189a;
        if (udcConsentChimeraActivity2.f109413l == null) {
            bnsl bnsl = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
            bnsl.mo68432a("avht", "a", 490, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("UdcClearcutLogger is null.");
        } else if (!udcConsentChimeraActivity2.f109415n) {
            udcConsentChimeraActivity2.f109415n = true;
            udcConsentChimeraActivity2.f109416o = udcConsentChimeraActivity2.getResources().getConfiguration().orientation;
            UdcConsentChimeraActivity udcConsentChimeraActivity3 = this.f93189a;
            avjn avjn = udcConsentChimeraActivity3.f109413l;
            int i3 = udcConsentChimeraActivity3.f109414m;
            bxrt bxrt = udcConsentChimeraActivity3.f109405d;
            bxru bxru3 = udcConsentChimeraActivity3.f109406e;
            ConsentFlowConfig consentFlowConfig = udcConsentChimeraActivity3.f109404c;
            int i4 = udcConsentChimeraActivity3.f109416o;
            srn srn2 = avgr.f93153a;
            bxvd da = bsph.f146490m.mo74144da();
            int[] iArr = null;
            if (bxrt != null) {
                if ((bxrt.f164601a & 16) != 0) {
                    bxss bxss = bxrt.f164607g;
                    if (bxss == null) {
                        bxss = bxss.f164728i;
                    }
                    int i5 = bxss.f164732c;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph2 = (bsph) da.f164949b;
                    bsph2.f146492a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bsph2.f146499h = i5;
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
                        bsph bsph3 = (bsph) da.f164949b;
                        str.getClass();
                        bsph3.f146492a |= 512;
                        bsph3.f146500i = str;
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
                        bsph bsph4 = (bsph) da.f164949b;
                        str2.getClass();
                        bsph4.f146492a |= 2048;
                        bsph4.f146502k = str2;
                    }
                }
                boolean a = avgr.m78484a(bxrt.f164603c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsph bsph5 = (bsph) da.f164949b;
                bsph5.f146492a |= 1024;
                bsph5.f146501j = a;
                bxrs bxrs = bxrs.UNKNOWN;
                bxrs a2 = bxrs.m123045a(bxrt.f164606f);
                if (a2 == null) {
                    a2 = bxrs.UNKNOWN;
                }
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph6 = (bsph) da.f164949b;
                    bsph6.f146493b = 4;
                    bsph6.f146492a |= 1;
                    bsoj bsoj = (bsoj) bsok.f146389h.mo74144da();
                    if (bxrt.f164604d.size() != 0) {
                        bsoj.mo70695a(bxrt.f164604d);
                    }
                    if (!(bxru3 == null || bxru3.f164620i.size() == 0)) {
                        int[] iArr2 = new int[bxru3.f164620i.size()];
                        bxwc bxwc2 = bxru3.f164620i;
                        int size2 = bxwc2.size();
                        int i6 = 0;
                        for (int i7 = 0; i7 < size2; i7++) {
                            bxsi bxsi2 = ((bxsj) bxwc2.get(i7)).f164690b;
                            if (bxsi2 == null) {
                                bxsi2 = bxsi.f164681e;
                            }
                            iArr2[i6] = bxsi2.f164684b;
                            i6++;
                        }
                        iArr = iArr2;
                    }
                    if (iArr != null) {
                        bsoj.mo70696b(bqcn.m112586b(iArr));
                    }
                    int i8 = consentFlowConfig.f109334d;
                    if (i8 != 0) {
                        i = i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 5 ? i8 != 6 ? 1 : 7 : 6 : 5 : 3 : 4;
                    } else {
                        i = 2;
                    }
                    if (bsoj.f164950c) {
                        bsoj.mo74035c();
                        bsoj.f164950c = false;
                    }
                    bsok bsok = (bsok) bsoj.f164949b;
                    bsok.f146394d = i - 1;
                    int i9 = bsok.f146391a | 1;
                    bsok.f146391a = i9;
                    boolean z = consentFlowConfig.f109333c;
                    int i10 = i9 | 2;
                    bsok.f146391a = i10;
                    bsok.f146395e = z;
                    boolean z2 = consentFlowConfig.f109332b;
                    int i11 = i10 | 4;
                    bsok.f146391a = i11;
                    bsok.f146396f = z2;
                    boolean z3 = consentFlowConfig.f109331a;
                    bsok.f146391a = i11 | 8;
                    bsok.f146397g = z3;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph7 = (bsph) da.f164949b;
                    bsok bsok2 = (bsok) bsoj.mo74062i();
                    bsok2.getClass();
                    bsph7.f146496e = bsok2;
                    bsph7.f146492a |= 32;
                } else if (ordinal != 2) {
                    bnsl bnsl2 = (bnsl) avgr.f93153a.mo68388c();
                    bnsl2.mo68432a("avgr", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bxrs a3 = bxrs.m123045a(bxrt.f164606f);
                    if (a3 == null) {
                        a3 = bxrs.UNKNOWN;
                    }
                    bnsl2.mo68420a("Invalid ViewType: %s", a3);
                    bsph = null;
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph8 = (bsph) da.f164949b;
                    bsph8.f146493b = 3;
                    bsph8.f146492a |= 1;
                    bxvd da2 = bson.f146405d.mo74144da();
                    int a4 = bxsn.m123069a(bxrt.f164605e);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i12 = a4 - 1;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bson bson = (bson) da2.f164949b;
                    bson.f146407a |= 2;
                    bson.f146409c = i12;
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
                    bsph bsph9 = (bsph) da.f164949b;
                    bson bson3 = (bson) da2.mo74062i();
                    bson3.getClass();
                    bsph9.f146495d = bson3;
                    bsph9.f146492a |= 16;
                }
                int a5 = avgr.m78482a(i4);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsph bsph10 = (bsph) da.f164949b;
                bsph10.f146494c = a5 - 1;
                bsph10.f146492a |= 2;
                bsph = (bsph) da.mo74062i();
            } else {
                bsph = (bsph) da.mo74062i();
            }
            avjn.mo51293a(i3, bsph);
        }
        UdcConsentChimeraActivity udcConsentChimeraActivity4 = this.f93189a;
        avii avii = udcConsentChimeraActivity4.f109409h;
        String str3 = udcConsentChimeraActivity4.f109403b;
        ConsentFlowConfig consentFlowConfig2 = udcConsentChimeraActivity4.f109404c;
        bxrs a6 = bxrs.m123045a(udcConsentChimeraActivity4.f109405d.f164606f);
        if (a6 == null) {
            a6 = bxrs.UNKNOWN;
        }
        Integer valueOf = Integer.valueOf(a6.f164598d);
        UdcConsentChimeraActivity udcConsentChimeraActivity5 = this.f93189a;
        ArrayList arrayList2 = udcConsentChimeraActivity5.f109410i;
        int i13 = udcConsentChimeraActivity5.f109414m;
        Bundle bundle = new Bundle(1);
        avih.m78574a(bundle, "UdcConsentConfig", bxru2);
        bundle.putString("UdcAccountName", str3);
        bundle.putParcelable("UdcConsentFlowConfig", consentFlowConfig2);
        bundle.putInt("UdcConsentViewType", valueOf.intValue());
        bundle.putIntegerArrayList("UdcConsentZippyStates", arrayList2);
        bundle.putInt("UdcClearcutEventFlowId", i13);
        int i14 = consentFlowConfig2.f109334d;
        if (i14 == 1 || i14 == 2) {
            fragment = new avia();
        } else if (i14 == 4 || i14 == 5) {
            fragment = new avib();
        } else if (i14 != 6) {
            fragment = new avid();
        } else {
            fragment = new avie();
        }
        fragment.setArguments(bundle);
        avii.mo51269a(fragment);
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        this.f93189a.f109409h.mo51269a(new avif().mo51240b());
        UdcConsentChimeraActivity udcConsentChimeraActivity = this.f93189a;
        srn srn = UdcConsentChimeraActivity.f109402a;
        String str = udcConsentChimeraActivity.f109403b;
        avei avei = new avei(udcConsentChimeraActivity, new Account(str, "com.google"), udcConsentChimeraActivity.f109405d);
        avei.mo51183a(chbe.f188233a.mo6606a().mo84909e(), TimeUnit.MILLISECONDS);
        return avei;
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03f2  */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        boolean z;
        UdcConsentChimeraActivity udcConsentChimeraActivity;
        bsph bsph;
        Fragment fragment;
        bsph bsph2;
        int i;
        avac avac = (avac) obj;
        if (avac.mo7183bo().mo17710c()) {
            bxru bxru = (bxru) avac.mo51105b();
            UdcConsentChimeraActivity udcConsentChimeraActivity2 = this.f93189a;
            srn srn = UdcConsentChimeraActivity.f109402a;
            udcConsentChimeraActivity2.f109406e = bxru;
            udcConsentChimeraActivity2.f109411j.clear();
            bxwc bxwc = bxru.f164620i;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList arrayList = this.f93189a.f109411j;
                bxsi bxsi = ((bxsj) bxwc.get(i2)).f164690b;
                if (bxsi == null) {
                    bxsi = bxsi.f164681e;
                }
                arrayList.add(Integer.valueOf(bxsi.f164684b));
            }
            UdcConsentChimeraActivity udcConsentChimeraActivity3 = this.f93189a;
            if (udcConsentChimeraActivity3.f109413l == null) {
                bnsl bnsl = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                bnsl.mo68432a("avht", "a", 490, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("UdcClearcutLogger is null.");
            } else if (!udcConsentChimeraActivity3.f109415n) {
                udcConsentChimeraActivity3.f109415n = true;
                udcConsentChimeraActivity3.f109416o = udcConsentChimeraActivity3.getResources().getConfiguration().orientation;
                UdcConsentChimeraActivity udcConsentChimeraActivity4 = this.f93189a;
                avjn avjn = udcConsentChimeraActivity4.f109413l;
                int i3 = udcConsentChimeraActivity4.f109414m;
                bxrt bxrt = udcConsentChimeraActivity4.f109405d;
                bxru bxru2 = udcConsentChimeraActivity4.f109406e;
                ConsentFlowConfig consentFlowConfig = udcConsentChimeraActivity4.f109404c;
                int i4 = udcConsentChimeraActivity4.f109416o;
                srn srn2 = avgr.f93153a;
                bxvd da = bsph.f146490m.mo74144da();
                int[] iArr = null;
                if (bxrt == null) {
                    bsph2 = (bsph) da.mo74062i();
                } else {
                    if ((bxrt.f164601a & 16) != 0) {
                        bxss bxss = bxrt.f164607g;
                        if (bxss == null) {
                            bxss = bxss.f164728i;
                        }
                        int i5 = bxss.f164732c;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph3 = (bsph) da.f164949b;
                        bsph3.f146492a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bsph3.f146499h = i5;
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
                            bsph bsph4 = (bsph) da.f164949b;
                            str.getClass();
                            bsph4.f146492a |= 512;
                            bsph4.f146500i = str;
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
                            bsph bsph5 = (bsph) da.f164949b;
                            str2.getClass();
                            bsph5.f146492a |= 2048;
                            bsph5.f146502k = str2;
                        }
                    }
                    boolean a = avgr.m78484a(bxrt.f164603c);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph6 = (bsph) da.f164949b;
                    bsph6.f146492a |= 1024;
                    bsph6.f146501j = a;
                    bxrs bxrs = bxrs.UNKNOWN;
                    bxrs a2 = bxrs.m123045a(bxrt.f164606f);
                    if (a2 == null) {
                        a2 = bxrs.UNKNOWN;
                    }
                    int ordinal = a2.ordinal();
                    if (ordinal == 1) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph7 = (bsph) da.f164949b;
                        bsph7.f146493b = 4;
                        bsph7.f146492a |= 1;
                        bsoj bsoj = (bsoj) bsok.f146389h.mo74144da();
                        if (bxrt.f164604d.size() != 0) {
                            bsoj.mo70695a(bxrt.f164604d);
                        }
                        if (!(bxru2 == null || bxru2.f164620i.size() == 0)) {
                            int[] iArr2 = new int[bxru2.f164620i.size()];
                            bxwc bxwc2 = bxru2.f164620i;
                            int size2 = bxwc2.size();
                            int i6 = 0;
                            for (int i7 = 0; i7 < size2; i7++) {
                                bxsi bxsi2 = ((bxsj) bxwc2.get(i7)).f164690b;
                                if (bxsi2 == null) {
                                    bxsi2 = bxsi.f164681e;
                                }
                                iArr2[i6] = bxsi2.f164684b;
                                i6++;
                            }
                            iArr = iArr2;
                        }
                        if (iArr != null) {
                            bsoj.mo70696b(bqcn.m112586b(iArr));
                        }
                        int i8 = consentFlowConfig.f109334d;
                        if (i8 != 0) {
                            i = i8 != 1 ? i8 != 2 ? i8 != 4 ? i8 != 5 ? i8 != 6 ? 1 : 7 : 6 : 5 : 3 : 4;
                        } else {
                            i = 2;
                        }
                        if (bsoj.f164950c) {
                            bsoj.mo74035c();
                            bsoj.f164950c = false;
                        }
                        bsok bsok = (bsok) bsoj.f164949b;
                        bsok.f146394d = i - 1;
                        int i9 = bsok.f146391a | 1;
                        bsok.f146391a = i9;
                        boolean z2 = consentFlowConfig.f109333c;
                        int i10 = i9 | 2;
                        bsok.f146391a = i10;
                        bsok.f146395e = z2;
                        boolean z3 = consentFlowConfig.f109332b;
                        int i11 = i10 | 4;
                        bsok.f146391a = i11;
                        bsok.f146396f = z3;
                        boolean z4 = consentFlowConfig.f109331a;
                        bsok.f146391a = i11 | 8;
                        bsok.f146397g = z4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph8 = (bsph) da.f164949b;
                        bsok bsok2 = (bsok) bsoj.mo74062i();
                        bsok2.getClass();
                        bsph8.f146496e = bsok2;
                        bsph8.f146492a |= 32;
                    } else if (ordinal != 2) {
                        bnsl bnsl2 = (bnsl) avgr.f93153a.mo68388c();
                        bnsl2.mo68432a("avgr", "a", 127, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bxrs a3 = bxrs.m123045a(bxrt.f164606f);
                        if (a3 == null) {
                            a3 = bxrs.UNKNOWN;
                        }
                        bnsl2.mo68420a("Invalid ViewType: %s", a3);
                        bsph2 = null;
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph9 = (bsph) da.f164949b;
                        bsph9.f146493b = 3;
                        bsph9.f146492a |= 1;
                        bxvd da2 = bson.f146405d.mo74144da();
                        int a4 = bxsn.m123069a(bxrt.f164605e);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        int i12 = a4 - 1;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bson bson = (bson) da2.f164949b;
                        bson.f146407a |= 2;
                        bson.f146409c = i12;
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
                        bsph bsph10 = (bsph) da.f164949b;
                        bson bson3 = (bson) da2.mo74062i();
                        bson3.getClass();
                        bsph10.f146495d = bson3;
                        bsph10.f146492a |= 16;
                    }
                    int a5 = avgr.m78482a(i4);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bsph bsph11 = (bsph) da.f164949b;
                    bsph11.f146494c = a5 - 1;
                    bsph11.f146492a |= 2;
                    bsph2 = (bsph) da.mo74062i();
                }
                avjn.mo51293a(i3, bsph2);
            }
            UdcConsentChimeraActivity udcConsentChimeraActivity5 = this.f93189a;
            avii avii = udcConsentChimeraActivity5.f109409h;
            String str3 = udcConsentChimeraActivity5.f109403b;
            ConsentFlowConfig consentFlowConfig2 = udcConsentChimeraActivity5.f109404c;
            bxrs a6 = bxrs.m123045a(udcConsentChimeraActivity5.f109405d.f164606f);
            if (a6 == null) {
                a6 = bxrs.UNKNOWN;
            }
            Integer valueOf = Integer.valueOf(a6.f164598d);
            UdcConsentChimeraActivity udcConsentChimeraActivity6 = this.f93189a;
            ArrayList arrayList2 = udcConsentChimeraActivity6.f109410i;
            int i13 = udcConsentChimeraActivity6.f109414m;
            Bundle bundle = new Bundle(1);
            avih.m78574a(bundle, "UdcConsentConfig", bxru);
            bundle.putString("UdcAccountName", str3);
            bundle.putParcelable("UdcConsentFlowConfig", consentFlowConfig2);
            bundle.putInt("UdcConsentViewType", valueOf.intValue());
            bundle.putIntegerArrayList("UdcConsentZippyStates", arrayList2);
            bundle.putInt("UdcClearcutEventFlowId", i13);
            int i14 = consentFlowConfig2.f109334d;
            if (i14 == 1 || i14 == 2) {
                fragment = new avia();
            } else if (i14 == 4 || i14 == 5) {
                fragment = new avib();
            } else if (i14 != 6) {
                fragment = new avid();
            } else {
                fragment = new avie();
            }
            fragment.setArguments(bundle);
            avii.mo51269a(fragment);
            return;
        }
        Status bo = avac.mo7183bo();
        bnsl bnsl3 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
        bnsl3.mo68432a("avht", "a", 515, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl3.mo68424a("Error (%s) reading the config data: %s", avak.m78140a(bo.f30115i), bo.f30116j);
        int i15 = bo.f30115i;
        int i16 = C0126R.string.udc_generic_error;
        if (i15 != 7) {
            if (!(i15 == 8 || i15 == 15)) {
                switch (i15) {
                    case 4502:
                        break;
                    case 4503:
                        z = false;
                        break;
                    case 4504:
                        i16 = C0126R.string.udc_auth_error;
                        z = true;
                        break;
                    case 4505:
                        break;
                    default:
                        bnsl bnsl4 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                        bnsl4.mo68432a("avht", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68409a("Unknown statuscode: %d", bo.f30115i);
                        z = false;
                        break;
                }
                udcConsentChimeraActivity = this.f93189a;
                if (udcConsentChimeraActivity.f109413l == null) {
                    bnsl bnsl5 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                    bnsl5.mo68432a("avht", "a", 546, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("UdcClearcutLogger is null.");
                } else {
                    udcConsentChimeraActivity.f109416o = udcConsentChimeraActivity.getResources().getConfiguration().orientation;
                    UdcConsentChimeraActivity udcConsentChimeraActivity7 = this.f93189a;
                    avjn avjn2 = udcConsentChimeraActivity7.f109413l;
                    int i17 = udcConsentChimeraActivity7.f109414m;
                    bxrt bxrt2 = udcConsentChimeraActivity7.f109405d;
                    int i18 = udcConsentChimeraActivity7.f109416o;
                    srn srn3 = avgr.f93153a;
                    bxvd da3 = bsph.f146490m.mo74144da();
                    if (bxrt2 == null) {
                        bsph = (bsph) da3.mo74062i();
                    } else {
                        if ((bxrt2.f164601a & 16) != 0) {
                            bxss bxss6 = bxrt2.f164607g;
                            if (bxss6 == null) {
                                bxss6 = bxss.f164728i;
                            }
                            int i19 = bxss6.f164732c;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bsph bsph12 = (bsph) da3.f164949b;
                            bsph12.f146492a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bsph12.f146499h = i19;
                            bxss bxss7 = bxrt2.f164607g;
                            if (bxss7 == null) {
                                bxss7 = bxss.f164728i;
                            }
                            if ((bxss7.f164730a & 8) != 0) {
                                bxss bxss8 = bxrt2.f164607g;
                                if (bxss8 == null) {
                                    bxss8 = bxss.f164728i;
                                }
                                String str4 = bxss8.f164733d;
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bsph bsph13 = (bsph) da3.f164949b;
                                str4.getClass();
                                bsph13.f146492a |= 512;
                                bsph13.f146500i = str4;
                            }
                            bxss bxss9 = bxrt2.f164607g;
                            if (bxss9 == null) {
                                bxss9 = bxss.f164728i;
                            }
                            if ((bxss9.f164730a & 1) != 0) {
                                bxss bxss10 = bxrt2.f164607g;
                                if (bxss10 == null) {
                                    bxss10 = bxss.f164728i;
                                }
                                String str5 = bxss10.f164731b;
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bsph bsph14 = (bsph) da3.f164949b;
                                str5.getClass();
                                bsph14.f146492a |= 2048;
                                bsph14.f146502k = str5;
                            }
                        }
                        boolean a7 = avgr.m78484a(bxrt2.f164603c);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bsph bsph15 = (bsph) da3.f164949b;
                        int i20 = bsph15.f146492a | 1024;
                        bsph15.f146492a = i20;
                        bsph15.f146501j = a7;
                        bsph15.f146493b = 5;
                        bsph15.f146492a = i20 | 1;
                        int a8 = avgr.m78482a(i18);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bsph bsph16 = (bsph) da3.f164949b;
                        bsph16.f146494c = a8 - 1;
                        bsph16.f146492a |= 2;
                        bsol bsol = (bsol) bsom.f146398f.mo74144da();
                        if (bxrt2.f164604d.size() != 0) {
                            bsol.mo70697a(bxrt2.f164604d);
                        }
                        bxrs a9 = bxrs.m123045a(bxrt2.f164606f);
                        if (a9 == null) {
                            a9 = bxrs.UNKNOWN;
                        }
                        int i21 = a9.f164598d;
                        if (bsol.f164950c) {
                            bsol.mo74035c();
                            bsol.f164950c = false;
                        }
                        bsom bsom = (bsom) bsol.f164949b;
                        bsom.f146400a |= 1;
                        bsom.f146402c = i21;
                        int b2 = avgr.m78485b(i16);
                        if (bsol.f164950c) {
                            bsol.mo74035c();
                            bsol.f164950c = false;
                        }
                        bsom bsom2 = (bsom) bsol.f164949b;
                        bsom2.f146404e = b2 - 1;
                        bsom2.f146400a |= 4;
                        bxrs a10 = bxrs.m123045a(bxrt2.f164606f);
                        if (a10 == null) {
                            a10 = bxrs.UNKNOWN;
                        }
                        if (a10 == bxrs.PROMPT) {
                            int a11 = bxsn.m123069a(bxrt2.f164605e);
                            int i22 = (a11 != 0 ? a11 : 1) - 1;
                            if (bsol.f164950c) {
                                bsol.mo74035c();
                                bsol.f164950c = false;
                            }
                            bsom bsom3 = (bsom) bsol.f164949b;
                            bsom3.f146400a |= 2;
                            bsom3.f146403d = i22;
                        }
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bsph bsph17 = (bsph) da3.f164949b;
                        bsom bsom4 = (bsom) bsol.mo74062i();
                        bsom4.getClass();
                        bsph17.f146497f = bsom4;
                        bsph17.f146492a |= 64;
                        bsph = (bsph) da3.mo74062i();
                    }
                    avjn2.mo51293a(i17, bsph);
                }
                avii avii2 = this.f93189a.f109409h;
                avhk avhk = new avhk();
                avhk.f93184a.putCharSequence("UdcDialogTitle", this.f93189a.getString(C0126R.string.udc_error_loading_data));
                avhk.mo51233a(this.f93189a.getString(i16));
                avhk.f93184a.putBoolean("UdcDialogShowRetry", z);
                avii2.mo51269a(avhk.mo51240b());
            }
            i16 = C0126R.string.udc_server_error;
            z = true;
            udcConsentChimeraActivity = this.f93189a;
            if (udcConsentChimeraActivity.f109413l == null) {
            }
            avii avii22 = this.f93189a.f109409h;
            avhk avhk2 = new avhk();
            avhk2.f93184a.putCharSequence("UdcDialogTitle", this.f93189a.getString(C0126R.string.udc_error_loading_data));
            avhk2.mo51233a(this.f93189a.getString(i16));
            avhk2.f93184a.putBoolean("UdcDialogShowRetry", z);
            avii22.mo51269a(avhk2.mo51240b());
        }
        i16 = C0126R.string.udc_network_error;
        z = true;
        udcConsentChimeraActivity = this.f93189a;
        if (udcConsentChimeraActivity.f109413l == null) {
        }
        avii avii222 = this.f93189a.f109409h;
        avhk avhk22 = new avhk();
        avhk22.f93184a.putCharSequence("UdcDialogTitle", this.f93189a.getString(C0126R.string.udc_error_loading_data));
        avhk22.mo51233a(this.f93189a.getString(i16));
        avhk22.f93184a.putBoolean("UdcDialogShowRetry", z);
        avii222.mo51269a(avhk22.mo51240b());
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
    /* renamed from: a */
    private final void m78523a(Status status) {
        boolean z;
        UdcConsentChimeraActivity udcConsentChimeraActivity;
        bsph bsph;
        bnsl bnsl = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
        bnsl.mo68432a("avht", "a", 515, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Error (%s) reading the config data: %s", avak.m78140a(status.f30115i), status.f30116j);
        int i = status.f30115i;
        int i2 = C0126R.string.udc_generic_error;
        int i3 = 1;
        if (i != 7) {
            if (!(i == 8 || i == 15)) {
                switch (i) {
                    case 4502:
                        break;
                    case 4503:
                        z = false;
                        break;
                    case 4504:
                        i2 = C0126R.string.udc_auth_error;
                        z = true;
                        break;
                    case 4505:
                        break;
                    default:
                        bnsl bnsl2 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                        bnsl2.mo68432a("avht", "a", 540, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68409a("Unknown statuscode: %d", status.f30115i);
                        z = false;
                        break;
                }
                udcConsentChimeraActivity = this.f93189a;
                if (udcConsentChimeraActivity.f109413l == null) {
                    bnsl bnsl3 = (bnsl) UdcConsentChimeraActivity.f109402a.mo68387b();
                    bnsl3.mo68432a("avht", "a", 546, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("UdcClearcutLogger is null.");
                } else {
                    udcConsentChimeraActivity.f109416o = udcConsentChimeraActivity.getResources().getConfiguration().orientation;
                    UdcConsentChimeraActivity udcConsentChimeraActivity2 = this.f93189a;
                    avjn avjn = udcConsentChimeraActivity2.f109413l;
                    int i4 = udcConsentChimeraActivity2.f109414m;
                    bxrt bxrt = udcConsentChimeraActivity2.f109405d;
                    int i5 = udcConsentChimeraActivity2.f109416o;
                    srn srn = avgr.f93153a;
                    bxvd da = bsph.f146490m.mo74144da();
                    if (bxrt == null) {
                        bsph = (bsph) da.mo74062i();
                    } else {
                        if ((bxrt.f164601a & 16) != 0) {
                            bxss bxss = bxrt.f164607g;
                            if (bxss == null) {
                                bxss = bxss.f164728i;
                            }
                            int i6 = bxss.f164732c;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsph bsph2 = (bsph) da.f164949b;
                            bsph2.f146492a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bsph2.f146499h = i6;
                            bxss bxss2 = bxrt.f164607g;
                            if (bxss2 == null) {
                                bxss2 = bxss.f164728i;
                            }
                            if ((8 & bxss2.f164730a) != 0) {
                                bxss bxss3 = bxrt.f164607g;
                                if (bxss3 == null) {
                                    bxss3 = bxss.f164728i;
                                }
                                String str = bxss3.f164733d;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bsph bsph3 = (bsph) da.f164949b;
                                str.getClass();
                                bsph3.f146492a |= 512;
                                bsph3.f146500i = str;
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
                                bsph bsph4 = (bsph) da.f164949b;
                                str2.getClass();
                                bsph4.f146492a |= 2048;
                                bsph4.f146502k = str2;
                            }
                        }
                        boolean a = avgr.m78484a(bxrt.f164603c);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph5 = (bsph) da.f164949b;
                        int i7 = bsph5.f146492a | 1024;
                        bsph5.f146492a = i7;
                        bsph5.f146501j = a;
                        bsph5.f146493b = 5;
                        bsph5.f146492a = i7 | 1;
                        int a2 = avgr.m78482a(i5);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph6 = (bsph) da.f164949b;
                        bsph6.f146494c = a2 - 1;
                        bsph6.f146492a |= 2;
                        bsol bsol = (bsol) bsom.f146398f.mo74144da();
                        if (bxrt.f164604d.size() != 0) {
                            bsol.mo70697a(bxrt.f164604d);
                        }
                        bxrs a3 = bxrs.m123045a(bxrt.f164606f);
                        if (a3 == null) {
                            a3 = bxrs.UNKNOWN;
                        }
                        int i8 = a3.f164598d;
                        if (bsol.f164950c) {
                            bsol.mo74035c();
                            bsol.f164950c = false;
                        }
                        bsom bsom = (bsom) bsol.f164949b;
                        bsom.f146400a |= 1;
                        bsom.f146402c = i8;
                        int b = avgr.m78485b(i2);
                        if (bsol.f164950c) {
                            bsol.mo74035c();
                            bsol.f164950c = false;
                        }
                        bsom bsom2 = (bsom) bsol.f164949b;
                        bsom2.f146404e = b - 1;
                        bsom2.f146400a |= 4;
                        bxrs a4 = bxrs.m123045a(bxrt.f164606f);
                        if (a4 == null) {
                            a4 = bxrs.UNKNOWN;
                        }
                        if (a4 == bxrs.PROMPT) {
                            int a5 = bxsn.m123069a(bxrt.f164605e);
                            if (a5 != 0) {
                                i3 = a5;
                            }
                            int i9 = i3 - 1;
                            if (bsol.f164950c) {
                                bsol.mo74035c();
                                bsol.f164950c = false;
                            }
                            bsom bsom3 = (bsom) bsol.f164949b;
                            bsom3.f146400a |= 2;
                            bsom3.f146403d = i9;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsph bsph7 = (bsph) da.f164949b;
                        bsom bsom4 = (bsom) bsol.mo74062i();
                        bsom4.getClass();
                        bsph7.f146497f = bsom4;
                        bsph7.f146492a |= 64;
                        bsph = (bsph) da.mo74062i();
                    }
                    avjn.mo51293a(i4, bsph);
                }
                avii avii = this.f93189a.f109409h;
                avhk avhk = new avhk();
                avhk.f93184a.putCharSequence("UdcDialogTitle", this.f93189a.getString(C0126R.string.udc_error_loading_data));
                avhk.mo51233a(this.f93189a.getString(i2));
                avhk.f93184a.putBoolean("UdcDialogShowRetry", z);
                avii.mo51269a(avhk.mo51240b());
            }
            i2 = C0126R.string.udc_server_error;
            z = true;
            udcConsentChimeraActivity = this.f93189a;
            if (udcConsentChimeraActivity.f109413l == null) {
            }
            avii avii2 = this.f93189a.f109409h;
            avhk avhk2 = new avhk();
            avhk2.f93184a.putCharSequence("UdcDialogTitle", this.f93189a.getString(C0126R.string.udc_error_loading_data));
            avhk2.mo51233a(this.f93189a.getString(i2));
            avhk2.f93184a.putBoolean("UdcDialogShowRetry", z);
            avii2.mo51269a(avhk2.mo51240b());
        }
        i2 = C0126R.string.udc_network_error;
        z = true;
        udcConsentChimeraActivity = this.f93189a;
        if (udcConsentChimeraActivity.f109413l == null) {
        }
        avii avii22 = this.f93189a.f109409h;
        avhk avhk22 = new avhk();
        avhk22.f93184a.putCharSequence("UdcDialogTitle", this.f93189a.getString(C0126R.string.udc_error_loading_data));
        avhk22.mo51233a(this.f93189a.getString(i2));
        avhk22.f93184a.putBoolean("UdcDialogShowRetry", z);
        avii22.mo51269a(avhk22.mo51240b());
    }
}
