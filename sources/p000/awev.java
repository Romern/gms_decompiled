package p000;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.intentoperation.orchestration.BuyFlowInitializationIntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: awev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awev {

    /* renamed from: a */
    public static final /* synthetic */ int f94249a = 0;

    /* renamed from: b */
    private static final String[] f94250b = {"{{TITLE}}", "{{TOTAL_AMOUNT}}", "{{DESCRIPTION}}", "{{HERO_IMAGE_URI}}"};

    /* renamed from: a */
    public static int m79813a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static blyn m79814a(blym blym) {
        bmog bmog;
        bmgo bmgo;
        bmgf bmgf;
        bmif bmif;
        bxvd bxvd;
        String str;
        bmeo bmeo;
        bmer bmer;
        bmkv bmkv;
        int i;
        if (blym == null) {
            return null;
        }
        bxvd da = blyn.f128261o.mo74144da();
        if ((blym.f128235a & 1024) != 0) {
            bmeq bmeq = blym.f128248n;
            if (bmeq == null) {
                bmeq = bmeq.f128990h;
            }
            if (bmeq != null) {
                bxvd da2 = bmer.f129000g.mo74144da();
                if ((bmeq.f128992a & 8) != 0) {
                    bmfu bmfu = bmeq.f128996e;
                    if (bmfu == null) {
                        bmfu = bmfu.f129167j;
                    }
                    bmfv a = bjvh.m104698a(bmfu);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmer bmer2 = (bmer) da2.f164949b;
                    a.getClass();
                    bmer2.f129003b = a;
                    bmer2.f129002a |= 1;
                }
                if ((bmeq.f128992a & 4) != 0) {
                    bmbr bmbr = bmeq.f128995d;
                    if (bmbr == null) {
                        bmbr = bmbr.f128572L;
                    }
                    bmbs a2 = bjvh.m104693a(bmbr);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmer bmer3 = (bmer) da2.f164949b;
                    a2.getClass();
                    bmer3.f129004c = a2;
                    bmer3.f129002a |= 2;
                }
                bmbt bmbt = bmeq.f128994c;
                if (bmbt == null) {
                    bmbt = bmbt.f128620d;
                }
                String str2 = bmbt.f128624c;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bmer bmer4 = (bmer) da2.f164949b;
                str2.getClass();
                bmer4.f129002a |= 8;
                bmer4.f129006e = str2;
                bmjh bmjh = bmeq.f128997f;
                if (bmjh == null) {
                    bmjh = bmjh.f129700e;
                }
                String a3 = bjvh.m104700a(bmjh, ((bmer) da2.f164949b).f129006e);
                if (a3 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmer bmer5 = (bmer) da2.f164949b;
                    a3.getClass();
                    bmer5.f129002a |= 4;
                    bmer5.f129005d = a3;
                }
                if (bmeq.f128998g.size() == 1) {
                    bmkt bmkt = (bmkt) bmeq.f128998g.get(0);
                    if (bmkt != null) {
                        int size = bmkt.f129889e.size();
                        bmku bmku = (bmku) bmkv.f129891f.mo74144da();
                        if ((bmkt.f129885a & 2) == 0) {
                            String str3 = bmkt.f129886b;
                            if (bmku.f164950c) {
                                bmku.mo74035c();
                                bmku.f164950c = false;
                            }
                            bmkv bmkv2 = (bmkv) bmku.f164949b;
                            str3.getClass();
                            bmkv2.f129893a |= 1;
                            bmkv2.f129894b = str3;
                            i = 0;
                        } else {
                            bmdn bmdn = bmkt.f129887c;
                            if (bmdn == null) {
                                bmdn = bmdn.f128831k;
                            }
                            String str4 = bmdn.f128834b;
                            if (bmku.f164950c) {
                                bmku.mo74035c();
                                bmku.f164950c = false;
                            }
                            bmkv bmkv3 = (bmkv) bmku.f164949b;
                            str4.getClass();
                            bmkv3.f129893a |= 1;
                            bmkv3.f129894b = str4;
                            bmdn bmdn2 = bmkt.f129887c;
                            if (bmdn2 == null) {
                                bmdn2 = bmdn.f128831k;
                            }
                            long j = bmdn2.f128835c;
                            if (bmku.f164950c) {
                                bmku.mo74035c();
                                bmku.f164950c = false;
                            }
                            bmkv bmkv4 = (bmkv) bmku.f164949b;
                            bmkv4.f129893a |= 2;
                            bmkv4.f129895c = j;
                            bmdn bmdn3 = bmkt.f129887c;
                            if (bmdn3 == null) {
                                bmdn3 = bmdn.f128831k;
                            }
                            bxtx bxtx = bmdn3.f128836d;
                            if (bmku.f164950c) {
                                bmku.mo74035c();
                                bmku.f164950c = false;
                            }
                            bmkv bmkv5 = (bmkv) bmku.f164949b;
                            bxtx.getClass();
                            bmkv5.f129893a |= 4;
                            bmkv5.f129896d = bxtx;
                            i = 0;
                        }
                        while (i < size) {
                            bmku.mo66800a(bjvh.m104699a((bmqf) bmkt.f129889e.get(i)));
                            i++;
                        }
                        bmkv = (bmkv) bmku.mo74062i();
                    } else {
                        bmkv = null;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bmer bmer6 = (bmer) da2.f164949b;
                    bmkv.getClass();
                    bmer6.f129007f = bmkv;
                    bmer6.f129002a |= 16;
                }
                bmer = (bmer) da2.mo74062i();
            } else {
                bmer = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn = (blyn) da.f164949b;
            bmer.getClass();
            blyn.f128264b = bmer;
            blyn.f128263a |= 1;
        }
        if ((blym.f128235a & 2048) != 0) {
            bmen bmen = blym.f128249o;
            if (bmen == null) {
                bmen = bmen.f128969c;
            }
            if (bmen != null) {
                bxvd da3 = bmeo.f128974c.mo74144da();
                bmqf bmqf = bmen.f128972b;
                if (bmqf == null) {
                    bmqf = bmqf.f130370r;
                }
                bmqk a4 = bjvh.m104699a(bmqf);
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bmeo bmeo2 = (bmeo) da3.f164949b;
                a4.getClass();
                bmeo2.f128977b = a4;
                bmeo2.f128976a |= 1;
                bmeo = (bmeo) da3.mo74062i();
            } else {
                bmeo = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn2 = (blyn) da.f164949b;
            bmeo.getClass();
            blyn2.f128265c = bmeo;
            blyn2.f128263a |= 2;
        }
        if ((blym.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            bmgn bmgn = blym.f128252r;
            if (bmgn == null) {
                bmgn = bmgn.f129273o;
            }
            if (bmgn != null) {
                bxvd da4 = bmgo.f129290e.mo74144da();
                Object a5 = m79818a(bmgn);
                if (a5 instanceof bmgk) {
                    bmgk bmgk = (bmgk) a5;
                    bxvd da5 = bmgl.f129265g.mo74144da();
                    String str5 = bmgk.f129249c;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bmgl bmgl = (bmgl) da5.f164949b;
                    str5.getClass();
                    bmgl.f129267a |= 1;
                    bmgl.f129268b = str5;
                    if (bmgk.f129250d.mo73744a() > 0) {
                        bxtx bxtx2 = bmgk.f129250d;
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bmgl bmgl2 = (bmgl) da5.f164949b;
                        bxtx2.getClass();
                        bmgl2.f129267a |= 2;
                        bmgl2.f129269c = bxtx2;
                    }
                    if (awia.m79998b(bmgk)) {
                        bmge bmge = bmgk.f129260n;
                        if (bmge == null) {
                            bmge = bmge.f129225f;
                        }
                        if (bmge != null) {
                            bxvd da6 = bmgf.f129233e.mo74144da();
                            if ((bmge.f129227a & 16) != 0) {
                                bmfu bmfu2 = bmge.f129231e;
                                if (bmfu2 == null) {
                                    bmfu2 = bmfu.f129167j;
                                }
                                bmfv a6 = bjvh.m104698a(bmfu2);
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmgf bmgf2 = (bmgf) da6.f164949b;
                                a6.getClass();
                                bmgf2.f129238d = a6;
                                bmgf2.f129235a |= 4;
                            }
                            if ((bmge.f129227a & 8) != 0) {
                                bmie bmie = bmge.f129230d;
                                if (bmie == null) {
                                    bmie = bmie.f129546r;
                                }
                                if (bmie != null) {
                                    if ((bmie.f129548a & 8192) != 0) {
                                        bmif bmif2 = bmie.f129561n;
                                        if (bmif2 == null) {
                                            bmif2 = bmif.f129564j;
                                        }
                                        bxvd = (bxvd) bmif2.mo74142c(5);
                                        bxvd.mo73625a((bxvk) bmif2);
                                    } else {
                                        bxvd = bmif.f129564j.mo74144da();
                                    }
                                    if ((bmie.f129548a & 4096) != 0) {
                                        bmbr bmbr2 = bmie.f129560m;
                                        if (bmbr2 == null) {
                                            bmbr2 = bmbr.f128572L;
                                        }
                                        bmbs a7 = bjvh.m104693a(bmbr2);
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bmif bmif3 = (bmif) bxvd.f164949b;
                                        a7.getClass();
                                        bmif3.f129572g = a7;
                                        bmif3.f129566a |= 32;
                                    }
                                    if ((bmie.f129548a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
                                        bmif bmif4 = (bmif) bxvd.f164949b;
                                        if ((bmif4.f129566a & 32) != 0) {
                                            bmbs bmbs = bmif4.f129572g;
                                            if (bmbs == null) {
                                                bmbs = bmbs.f128609j;
                                            }
                                            btwp btwp = bmbs.f128615e;
                                            if (btwp == null) {
                                                btwp = btwp.f152728s;
                                            }
                                            str = btwp.f152731b;
                                        } else {
                                            str = null;
                                        }
                                        bmjh bmjh2 = bmie.f129563q;
                                        if (bmjh2 == null) {
                                            bmjh2 = bmjh.f129700e;
                                        }
                                        String a8 = bjvh.m104700a(bmjh2, str);
                                        if (bxvd.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd.f164950c = false;
                                        }
                                        bmif bmif5 = (bmif) bxvd.f164949b;
                                        a8.getClass();
                                        bmif5.f129566a |= 128;
                                        bmif5.f129574i = a8;
                                    }
                                    bmif = (bmif) bxvd.mo74062i();
                                } else {
                                    bmif = null;
                                }
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmgf bmgf3 = (bmgf) da6.f164949b;
                                bmif.getClass();
                                bmgf3.f129237c = bmif;
                                bmgf3.f129235a |= 2;
                            }
                            bmbr bmbr3 = bmge.f129229c;
                            if (bmbr3 == null) {
                                bmbr3 = bmbr.f128572L;
                            }
                            bmbs a9 = bjvh.m104693a(bmbr3);
                            if (a9 != null) {
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bmgf bmgf4 = (bmgf) da6.f164949b;
                                a9.getClass();
                                bmgf4.f129236b = a9;
                                bmgf4.f129235a |= 1;
                            }
                            bmgf = (bmgf) da6.mo74062i();
                        } else {
                            bmgf = null;
                        }
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bmgl bmgl3 = (bmgl) da5.f164949b;
                        bmgf.getClass();
                        bmgl3.f129270d = bmgf;
                        bmgl3.f129267a |= 4;
                    }
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bmgo bmgo2 = (bmgo) da4.f164949b;
                    bmgl bmgl4 = (bmgl) da5.mo74062i();
                    bmgl4.getClass();
                    bmgo2.f129293b = bmgl4;
                    bmgo2.f129292a = 1;
                } else if (a5 instanceof bmgd) {
                    bmfu bmfu3 = ((bmgd) a5).f129219e;
                    if (bmfu3 == null) {
                        bmfu3 = bmfu.f129167j;
                    }
                    bmfv a10 = bjvh.m104698a(bmfu3);
                    if (a10 != null) {
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bmgo bmgo3 = (bmgo) da4.f164949b;
                        a10.getClass();
                        bmgo3.f129293b = a10;
                        bmgo3.f129292a = 2;
                    }
                }
                bmgo = (bmgo) da4.mo74062i();
            } else {
                bmgo = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn3 = (blyn) da.f164949b;
            bmgo.getClass();
            blyn3.f128270h = bmgo;
            blyn3.f128263a |= 32;
        }
        if ((blym.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
            bmof bmof = blym.f128254t;
            if (bmof == null) {
                bmof = bmof.f130215h;
            }
            if (bmof != null) {
                bxvd da7 = bmog.f130225e.mo74144da();
                String str6 = bmof.f130217a;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bmog bmog2 = (bmog) da7.f164949b;
                str6.getClass();
                bmog2.f130227a = 1 | bmog2.f130227a;
                bmog2.f130228b = str6;
                int i2 = bmof.f130221e;
                if (i2 >= 0 && i2 < bmof.f130220d.size()) {
                    bmqk a11 = bjvh.m104699a((bmqf) bmof.f130220d.get(i2));
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bmog bmog3 = (bmog) da7.f164949b;
                    a11.getClass();
                    bmog3.f130229c = a11;
                    bmog3.f130227a |= 2;
                }
                bmog = (bmog) da7.mo74062i();
            } else {
                bmog = null;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn4 = (blyn) da.f164949b;
            bmog.getClass();
            blyn4.f128266d = bmog;
            blyn4.f128263a |= 8;
        }
        bmjh bmjh3 = blym.f128256v;
        if (bmjh3 == null) {
            bmjh3 = bmjh.f129700e;
        }
        if (bjvh.m104700a(bmjh3, (String) null) != null) {
            bmjh bmjh4 = blym.f128256v;
            if (bmjh4 == null) {
                bmjh4 = bmjh.f129700e;
            }
            String a12 = bjvh.m104700a(bmjh4, (String) null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn5 = (blyn) da.f164949b;
            a12.getClass();
            blyn5.mo66772a();
            blyn5.f128268f.add(a12);
        }
        int size2 = blym.f128224H.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bmed a13 = bjvh.m104696a((bmeb) blym.f128224H.get(i3));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn6 = (blyn) da.f164949b;
            a13.getClass();
            blyn6.mo66773b();
            blyn6.f128273k.add(a13);
        }
        if ((blym.f128235a & 4) != 0) {
            bxtx bxtx3 = blym.f128238d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blyn blyn7 = (blyn) da.f164949b;
            bxtx3.getClass();
            blyn7.f128263a |= 16;
            blyn7.f128269g = bxtx3;
        }
        return (blyn) da.mo74062i();
    }

    /* renamed from: a */
    public static bmbr m79815a(bmbr bmbr, blzf blzf) {
        bwdx bwdx;
        int a;
        bmbz bmbz;
        int a2;
        sdo.m34974b(m79824a(blzf));
        int a3 = bmbk.m107867a(bmbr.f128599p);
        if (a3 == 0) {
            a3 = 1;
        }
        sdo.m34974b(a3 == 3);
        if ((blzf.f128339a & 16) != 0) {
            bwdx = blzf.f128344f;
            if (bwdx == null) {
                bwdx = bwdx.f158952b;
            }
        } else {
            bwdx = null;
        }
        bxvd bxvd = (bxvd) bmbr.mo74142c(5);
        bxvd.mo73625a((bxvk) bmbr);
        bmbn bmbn = (bmbn) bxvd;
        int size = ((bmbr) bmbn.f164949b).f128592i.size();
        bmbz[] bmbzArr = (bmbz[]) Collections.unmodifiableList(((bmbr) bmbn.f164949b).f128592i).toArray(new bmbz[0]);
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            bmbs bmbs = bmbzArr[i2].f128638c;
            if (bmbs == null) {
                bmbs = bmbs.f128609j;
            }
            btwp btwp = bmbs.f128615e;
            if (btwp == null) {
                btwp = btwp.f152728s;
            }
            String str = btwp.f152731b;
            int a4 = bmby.m107883a(bmbzArr[i2].f128639d);
            if ((a4 == 0 || a4 != 2) && !m79825a(bwdx, bngx.m109356a(str))) {
                bmbz bmbz2 = bmbzArr[i2];
                bxvd bxvd2 = (bxvd) bmbz2.mo74142c(5);
                bxvd2.mo73625a((bxvk) bmbz2);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bmbz bmbz3 = (bmbz) bxvd2.f164949b;
                bmbz bmbz4 = bmbz.f128634i;
                bmbz3.f128639d = 1;
                int i3 = bmbz3.f128636a | 4;
                bmbz3.f128636a = i3;
                String str2 = ((bmbr) bmbn.f164949b).f128602s;
                str2.getClass();
                bmbz3.f128636a = i3 | 8;
                bmbz3.f128640e = str2;
                bmbzArr[i2] = (bmbz) bxvd2.mo74062i();
            }
            int a5 = bmby.m107883a(bmbzArr[i2].f128639d);
            if ((a5 == 0 || a5 != 2) && i == -1) {
                i = i2;
            }
        }
        if (bmbn.f164950c) {
            bmbn.mo74035c();
            bmbn.f164950c = false;
        }
        bxvu bxvu = bmbr.f128574y;
        ((bmbr) bmbn.f164949b).f128592i = bxvk.m124030de();
        List asList = Arrays.asList(bmbzArr);
        if (bmbn.f164950c) {
            bmbn.mo74035c();
            bmbn.f164950c = false;
        }
        bmbr bmbr2 = (bmbr) bmbn.f164949b;
        if (!bmbr2.f128592i.mo73666a()) {
            bmbr2.f128592i = bxvk.m124021a(bmbr2.f128592i);
        }
        bxsy.m123078a(asList, bmbr2.f128592i);
        boolean a6 = awia.m79988a((bmbr) bmbn.mo74062i());
        if (i == -1 && a6) {
            return null;
        }
        if (i != -1) {
            bmbr bmbr3 = (bmbr) bmbn.f164949b;
            if (bmbr3.f128596m != 0) {
                List unmodifiableList = Collections.unmodifiableList(bmbr3.f128592i);
                long j = ((bmbr) bmbn.f164949b).f128596m;
                Iterator it = unmodifiableList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bmbz = null;
                        break;
                    }
                    bmbz = (bmbz) it.next();
                    if (bmbz.f128637b == j) {
                        break;
                    }
                }
                if (!(bmbz == null || (a2 = bmby.m107883a(bmbz.f128639d)) == 0 || a2 != 2)) {
                    if (bmbn.f164950c) {
                        bmbn.mo74035c();
                        bmbn.f164950c = false;
                    }
                    bmbr bmbr4 = (bmbr) bmbn.f164949b;
                    bmbr4.f128584a |= 512;
                    bmbr4.f128595l = i;
                    long j2 = bmbn.mo66781a(i).f128637b;
                    if (bmbn.f164950c) {
                        bmbn.mo74035c();
                        bmbn.f164950c = false;
                    }
                    bmbr bmbr5 = (bmbr) bmbn.f164949b;
                    bmbr5.f128584a |= 1024;
                    bmbr5.f128596m = j2;
                }
            } else {
                int i4 = bmbr3.f128595l;
                if (i4 >= 0 && (a = bmby.m107883a(bmbn.mo66781a(i4).f128639d)) != 0 && a == 2) {
                    if (bmbn.f164950c) {
                        bmbn.mo74035c();
                        bmbn.f164950c = false;
                    }
                    bmbr bmbr6 = (bmbr) bmbn.f164949b;
                    bmbr6.f128584a |= 512;
                    bmbr6.f128595l = i;
                }
            }
        } else {
            long j3 = ((bmbr) bmbn.f164949b).f128598o;
            if (bmbn.f164950c) {
                bmbn.mo74035c();
                bmbn.f164950c = false;
            }
            bmbr bmbr7 = (bmbr) bmbn.f164949b;
            int i5 = bmbr7.f128584a | 1024;
            bmbr7.f128584a = i5;
            bmbr7.f128596m = j3;
            bmbr7.f128584a = i5 | 512;
            bmbr7.f128595l = -1;
        }
        if (!a6) {
            bmbr bmbr8 = (bmbr) bmbn.f164949b;
            if ((bmbr8.f128584a & 32) != 0) {
                bmbs bmbs2 = bmbr8.f128590g;
                if (bmbs2 == null) {
                    bmbs2 = bmbs.f128609j;
                }
                if ((bmbs2.f128611a & 8) != 0) {
                    bmbs bmbs3 = ((bmbr) bmbn.f164949b).f128590g;
                    if (bmbs3 == null) {
                        bmbs3 = bmbs.f128609j;
                    }
                    btwp btwp2 = bmbs3.f128615e;
                    if (btwp2 == null) {
                        btwp2 = btwp.f152728s;
                    }
                    if (!m79825a(bwdx, bngx.m109356a(btwp2.f152731b))) {
                        return null;
                    }
                }
            }
            List unmodifiableList2 = Collections.unmodifiableList(((bmbr) bmbn.f164949b).f128601r);
            if (bwdx != null) {
                int size2 = bwdx.f158954a.size();
                ArrayList arrayList = new ArrayList(size2);
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList.add(((bwdw) bwdx.f158954a.get(i6)).f158951b);
                }
                ArrayList arrayList2 = new ArrayList();
                int size3 = unmodifiableList2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    if (arrayList.contains(unmodifiableList2.get(i7))) {
                        arrayList2.add((String) unmodifiableList2.get(i7));
                    }
                }
                unmodifiableList2 = arrayList2;
            }
            if (unmodifiableList2.isEmpty()) {
                return null;
            }
            if (bmbn.f164950c) {
                bmbn.mo74035c();
                bmbn.f164950c = false;
            }
            ((bmbr) bmbn.f164949b).f128601r = bxvk.m124030de();
            if (bmbn.f164950c) {
                bmbn.mo74035c();
                bmbn.f164950c = false;
            }
            bmbr bmbr9 = (bmbr) bmbn.f164949b;
            if (!bmbr9.f128601r.mo73666a()) {
                bmbr9.f128601r = bxvk.m124021a(bmbr9.f128601r);
            }
            bxsy.m123078a(unmodifiableList2, bmbr9.f128601r);
        }
        return (bmbr) bmbn.mo74062i();
    }

    /* renamed from: a */
    public static bmjy m79816a(bmjy bmjy, blzf blzf) {
        bxvd bxvd = (bxvd) bmjy.mo74142c(5);
        bxvd.mo73625a((bxvk) bmjy);
        if ((bmjy.f129760a & 8) != 0) {
            bmno bmno = bmjy.f129766g;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            bxvd bxvd2 = (bxvd) bmno.mo74142c(5);
            bxvd2.mo73625a((bxvk) bmno);
            bmno bmno2 = ((bmjy) bxvd.f164949b).f129766g;
            if (bmno2 == null) {
                bmno2 = bmno.f130138m;
            }
            if ((bmno2.f130140a & 2) != 0) {
                bmno bmno3 = bmjy.f129766g;
                if (bmno3 == null) {
                    bmno3 = bmno.f130138m;
                }
                String a = m79819a(bmno3.f130142c, blzf);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bmno bmno4 = (bmno) bxvd2.f164949b;
                a.getClass();
                bmno4.f130140a |= 2;
                bmno4.f130142c = a;
            }
            bmno bmno5 = ((bmjy) bxvd.f164949b).f129766g;
            if (bmno5 == null) {
                bmno5 = bmno.f130138m;
            }
            if ((bmno5.f130140a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                bmno bmno6 = bmjy.f129766g;
                if (bmno6 == null) {
                    bmno6 = bmno.f130138m;
                }
                String a2 = m79819a(bmno6.f130149j, blzf);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bmno bmno7 = (bmno) bxvd2.f164949b;
                a2.getClass();
                bmno7.f130140a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bmno7.f130149j = a2;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmjy bmjy2 = (bmjy) bxvd.f164949b;
            bmno bmno8 = (bmno) bxvd2.mo74062i();
            bmjy bmjy3 = bmjy.f129758i;
            bmno8.getClass();
            bmjy2.f129766g = bmno8;
            bmjy2.f129760a |= 8;
        }
        String a3 = m79819a(bmjy.f129761b, blzf);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmjy bmjy4 = (bmjy) bxvd.f164949b;
        bmjy bmjy5 = bmjy.f129758i;
        a3.getClass();
        bmjy4.f129760a |= 1;
        bmjy4.f129761b = a3;
        String a4 = m79819a(bmjy.f129762c, blzf);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmjy bmjy6 = (bmjy) bxvd.f164949b;
        a4.getClass();
        bmjy6.f129760a |= 2;
        bmjy6.f129762c = a4;
        if (bmjy.f129763d.size() != 0) {
            int size = bmjy.f129763d.size();
            for (int i = 0; i < size; i++) {
                String a5 = m79819a((String) bmjy.f129763d.get(i), blzf);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmjy bmjy7 = (bmjy) bxvd.f164949b;
                a5.getClass();
                if (!bmjy7.f129763d.mo73666a()) {
                    bmjy7.f129763d = bxvk.m124021a(bmjy7.f129763d);
                }
                bmjy7.f129763d.set(i, a5);
            }
        }
        if (bmjy.f129764e.size() != 0) {
            int size2 = bmjy.f129764e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bmnr bmnr = (bmnr) bmjy.f129764e.get(i2);
                bxvd bxvd3 = (bxvd) bmnr.mo74142c(5);
                bxvd3.mo73625a((bxvk) bmnr);
                if ((bmnr.f130155a & 8) != 0) {
                    String a6 = m79819a(bmnr.f130160f, blzf);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bmnr bmnr2 = (bmnr) bxvd3.f164949b;
                    bmnr bmnr3 = bmnr.f130153o;
                    a6.getClass();
                    bmnr2.f130155a |= 8;
                    bmnr2.f130160f = a6;
                }
                if ((bmnr.f130155a & 4) != 0) {
                    String a7 = m79819a(bmnr.f130159e, blzf);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bmnr bmnr4 = (bmnr) bxvd3.f164949b;
                    bmnr bmnr5 = bmnr.f130153o;
                    a7.getClass();
                    bmnr4.f130155a |= 4;
                    bmnr4.f130159e = a7;
                }
                if ((bmnr.f130155a & 16) != 0) {
                    String a8 = m79819a(bmnr.f130161g, blzf);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bmnr bmnr6 = (bmnr) bxvd3.f164949b;
                    bmnr bmnr7 = bmnr.f130153o;
                    a8.getClass();
                    bmnr6.f130155a |= 16;
                    bmnr6.f130161g = a8;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmjy bmjy8 = (bmjy) bxvd.f164949b;
                bmnr bmnr8 = (bmnr) bxvd3.mo74062i();
                bmnr8.getClass();
                if (!bmjy8.f129764e.mo73666a()) {
                    bmjy8.f129764e = bxvk.m124021a(bmjy8.f129764e);
                }
                bmjy8.f129764e.set(i2, bmnr8);
            }
        }
        return (bmjy) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bxvd m79817a(bmgd bmgd, bmfk[] bmfkArr) {
        bxvd bxvd = (bxvd) bmgd.mo74142c(5);
        bxvd.mo73625a((bxvk) bmgd);
        bmgd bmgd2 = (bmgd) bxvd.f164949b;
        if ((bmgd2.f129215a & 16) != 0) {
            bmfu bmfu = bmgd2.f129219e;
            if (bmfu == null) {
                bmfu = bmfu.f129167j;
            }
            if ((bmfu.f129169a & 1) != 0) {
                bmfu bmfu2 = ((bmgd) bxvd.f164949b).f129219e;
                if (bmfu2 == null) {
                    bmfu2 = bmfu.f129167j;
                }
                bmhy bmhy = bmfu2.f129170b;
                if (bmhy == null) {
                    bmhy = bmhy.f129503u;
                }
                ArrayList arrayList = new ArrayList();
                bxwc bxwc = bmhy.f129507c;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    bmhu bmhu = (bmhu) bxwc.get(i);
                    if (!m79826a(new bxvv(bmhu.f129499i, bmhu.f129488j), bmfkArr)) {
                        arrayList.add(bmhu);
                    }
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                bmfu bmfu3 = ((bmgd) bxvd.f164949b).f129219e;
                if (bmfu3 == null) {
                    bmfu3 = bmfu.f129167j;
                }
                bxvd bxvd2 = (bxvd) bmfu3.mo74142c(5);
                bxvd2.mo73625a((bxvk) bmfu3);
                bxvd bxvd3 = (bxvd) bmhy.mo74142c(5);
                bxvd3.mo73625a((bxvk) bmhy);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                ((bmhy) bxvd3.f164949b).f129507c = bxvk.m124030de();
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bmhy bmhy2 = (bmhy) bxvd3.f164949b;
                if (!bmhy2.f129507c.mo73666a()) {
                    bmhy2.f129507c = bxvk.m124021a(bmhy2.f129507c);
                }
                bxsy.m123078a(arrayList, bmhy2.f129507c);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bmfu bmfu4 = (bmfu) bxvd2.f164949b;
                bmhy bmhy3 = (bmhy) bxvd3.mo74062i();
                bmhy3.getClass();
                bmfu4.f129170b = bmhy3;
                bmfu4.f129169a |= 1;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmgd bmgd3 = (bmgd) bxvd.f164949b;
                bmfu bmfu5 = (bmfu) bxvd2.mo74062i();
                bmgd bmgd4 = bmgd.f129213j;
                bmfu5.getClass();
                bmgd3.f129219e = bmfu5;
                bmgd3.f129215a |= 16;
            }
        }
        bmgd bmgd5 = (bmgd) bxvd.f164949b;
        if ((bmgd5.f129215a & 16) != 0) {
            bmfu bmfu6 = bmgd5.f129219e;
            if (bmfu6 == null) {
                bmfu6 = bmfu.f129167j;
            }
            if ((bmfu6.f129169a & 32) != 0) {
                bmfu bmfu7 = ((bmgd) bxvd.f164949b).f129219e;
                if (bmfu7 == null) {
                    bmfu7 = bmfu.f129167j;
                }
                bmhi bmhi = bmfu7.f129175g;
                if (bmhi == null) {
                    bmhi = bmhi.f129409r;
                }
                ArrayList arrayList2 = new ArrayList();
                bxwc bxwc2 = bmhi.f129421m;
                int size2 = bxwc2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bmhq bmhq = (bmhq) bxwc2.get(i2);
                    if (!m79826a(new bxvv(bmhq.f129472m, bmhq.f129457n), bmfkArr)) {
                        arrayList2.add(bmhq);
                    }
                }
                if (arrayList2.size() == 0) {
                    return null;
                }
                bmfu bmfu8 = ((bmgd) bxvd.f164949b).f129219e;
                if (bmfu8 == null) {
                    bmfu8 = bmfu.f129167j;
                }
                bxvd bxvd4 = (bxvd) bmfu8.mo74142c(5);
                bxvd4.mo73625a((bxvk) bmfu8);
                bxvd bxvd5 = (bxvd) bmhi.mo74142c(5);
                bxvd5.mo73625a((bxvk) bmhi);
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                ((bmhi) bxvd5.f164949b).f129421m = bxvk.m124030de();
                if (bxvd5.f164950c) {
                    bxvd5.mo74035c();
                    bxvd5.f164950c = false;
                }
                bmhi bmhi2 = (bmhi) bxvd5.f164949b;
                if (!bmhi2.f129421m.mo73666a()) {
                    bmhi2.f129421m = bxvk.m124021a(bmhi2.f129421m);
                }
                bxsy.m123078a(arrayList2, bmhi2.f129421m);
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bmfu bmfu9 = (bmfu) bxvd4.f164949b;
                bmhi bmhi3 = (bmhi) bxvd5.mo74062i();
                bmhi3.getClass();
                bmfu9.f129175g = bmhi3;
                bmfu9.f129169a |= 32;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmgd bmgd6 = (bmgd) bxvd.f164949b;
                bmfu bmfu10 = (bmfu) bxvd4.mo74062i();
                bmgd bmgd7 = bmgd.f129213j;
                bmfu10.getClass();
                bmgd6.f129219e = bmfu10;
                bmgd6.f129215a |= 16;
            }
        }
        return bxvd;
    }

    /* renamed from: a */
    public static Object m79818a(bmgn bmgn) {
        if (bmgn == null) {
            return null;
        }
        long j = bmgn.f129284j;
        if (j == 0) {
            int i = bmgn.f129281g;
            if (i >= 0) {
                return (bmgk) bmgn.f129278d.get(i);
            }
            int i2 = bmgn.f129282h;
            if (i2 >= 0) {
                return (bmgd) bmgn.f129279e.get(i2);
            }
            return null;
        } else if (bmgn.f129286l == j) {
            return null;
        } else {
            bxwc bxwc = bmgn.f129278d;
            int size = bxwc.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                bmgk bmgk = (bmgk) bxwc.get(i4);
                i4++;
                if (bmgk.f129248b == bmgn.f129284j) {
                    return bmgk;
                }
            }
            bxwc bxwc2 = bmgn.f129279e;
            int size2 = bxwc2.size();
            while (i3 < size2) {
                bmgd bmgd = (bmgd) bxwc2.get(i3);
                i3++;
                if (bmgd.f129216b == bmgn.f129284j) {
                    return bmgd;
                }
            }
            throw new IllegalArgumentException("Invalid uiReference for preselected option");
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    static String m79819a(String str, blzf blzf) {
        char c;
        String str2;
        if (!TextUtils.isEmpty(str) && blzf.f128342d.size() != 0) {
            sdo.m34974b(m79824a(blzf));
            blxf blxf = (blxf) blzf.f128342d.get(0);
            blxg blxg = (blxg) blxf.f128050b.get(0);
            String[] strArr = f94250b;
            for (String str3 : strArr) {
                switch (str3.hashCode()) {
                    case -1918989028:
                        if (str3.equals("{{DESCRIPTION}}")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -127565693:
                        if (str3.equals("{{HERO_IMAGE_URI}}")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -112010221:
                        if (str3.equals("{{TOTAL_AMOUNT}}")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 49442936:
                        if (str3.equals("{{TITLE}}")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                String str4 = "";
                if (c == 0) {
                    str2 = blxf.f128049a;
                } else if (c == 1) {
                    str2 = blxg.f128056c;
                } else if (c == 2) {
                    str2 = blxg.f128055b;
                } else if (c != 3) {
                    String valueOf = String.valueOf(str3);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown token: ") : "Unknown token: ".concat(valueOf));
                } else if ((blzf.f128339a & 1) == 0) {
                    str2 = str4;
                } else {
                    bwdt bwdt = blzf.f128340b;
                    if (bwdt == null) {
                        bwdt = bwdt.f158931d;
                    }
                    str2 = bwdt.f158933a;
                }
                if (str2 != null) {
                    str4 = str2;
                }
                str = str.replace(str3, str4);
            }
        }
        return str;
    }

    /* renamed from: a */
    public static List m79820a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(((blyl) list.get(i)).f128213e));
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static void m79821a(Context context, BuyFlowConfig buyFlowConfig) {
        Intent startIntent = IntentOperation.getStartIntent(context, BuyFlowInitializationIntentOperation.class, "com.google.android.gms.wallet.buyflow.ACTION_INITIALIZE_BUYFLOW");
        sef.m35071a(buyFlowConfig, startIntent, "BuyFlowInitializationIntentOperation.buyflowConfig");
        startIntent.putExtra("BuyFlowInitializationIntentOperation.refreshBuyflowRequests", true);
        context.startService(startIntent);
    }

    /* renamed from: a */
    public static void m79822a(bxvd bxvd, String str, String str2) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmgk bmgk = (bmgk) bxvd.f164949b;
        bmgk bmgk2 = bmgk.f129245r;
        bmgk.f129259m = 1;
        int i = bmgk.f129247a | 1024;
        bmgk.f129247a = i;
        bmgk.f129247a = i | 512;
        bmgk.f129258l = false;
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmgk bmgk3 = (bmgk) bxvd.f164949b;
        str.getClass();
        bmgk3.f129247a |= 16;
        bmgk3.f129253g = str;
    }

    /* renamed from: a */
    public static boolean m79823a(Context context) {
        if (((Boolean) awii.f94452a.mo58455c()).booleanValue() || !((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m79824a(blzf blzf) {
        return blzf != null && blzf.f128341c.mo73744a() > 0;
    }

    /* renamed from: a */
    public static boolean m79825a(bwdx bwdx, List list) {
        if (bwdx != null) {
            int size = bwdx.f158954a.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(((bwdw) bwdx.f158954a.get(i)).f158951b);
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!arrayList.contains(list.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m79826a(List list, bmfk[] bmfkArr) {
        for (bmfk bmfk : bmfkArr) {
            if (list.contains(bmfk)) {
                return true;
            }
        }
        return false;
    }
}
