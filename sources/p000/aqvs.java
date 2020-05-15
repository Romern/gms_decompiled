package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvs {

    /* renamed from: a */
    public final aqwv f86932a;

    /* renamed from: b */
    public final List f86933b = new ArrayList();

    /* renamed from: c */
    public aqqw f86934c;

    /* renamed from: d */
    private final aqvt f86935d;

    public aqvs(aqwv aqwv, aqvt aqvt) {
        this.f86932a = aqwv;
        this.f86935d = aqvt;
    }

    /* renamed from: a */
    public final void mo48196a() {
        this.f86932a.mo48201a(4, mo48198b(), new aqvq(this));
    }

    /* renamed from: b */
    public final bzid mo48198b() {
        bzic bzic = (bzic) bzid.f170156d.mo74144da();
        bxvd da = bzjv.f170351g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzjv bzjv = (bzjv) da.f164949b;
        bzjv.f170354b = 0;
        bzjv.f170353a |= 1;
        String str = this.f86935d.f86940e;
        if (ancm.m64021j(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv2 = (bzjv) da.f164949b;
            bzjv2.f170354b = 2;
            bzjv2.f170353a |= 1;
            String e = ancm.m64016e(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv3 = (bzjv) da.f164949b;
            e.getClass();
            bzjv3.f170353a |= 4;
            bzjv3.f170356d = e;
        } else if (ancm.m64020i(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv4 = (bzjv) da.f164949b;
            bzjv4.f170354b = 5;
            bzjv4.f170353a |= 1;
            String g = ancm.m64018g(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv5 = (bzjv) da.f164949b;
            g.getClass();
            bzjv5.f170353a |= 32;
            bzjv5.f170358f = g;
        } else if (alwy.m62041d(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv6 = (bzjv) da.f164949b;
            bzjv6.f170354b = 1;
            bzjv6.f170353a |= 1;
            long parseLong = Long.parseLong(alwy.m62043f(str), 16);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv7 = (bzjv) da.f164949b;
            bzjv7.f170353a |= 2;
            bzjv7.f170355c = parseLong;
        } else if (alwy.m62042e(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv8 = (bzjv) da.f164949b;
            bzjv8.f170354b = 4;
            bzjv8.f170353a |= 1;
            String h = alwy.m62045h(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzjv bzjv9 = (bzjv) da.f164949b;
            h.getClass();
            bzjv9.f170353a = 16 | bzjv9.f170353a;
            bzjv9.f170357e = h;
        }
        bxvd da2 = bziz.f170260c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bziz bziz = (bziz) da2.f164949b;
        bzjv bzjv10 = (bzjv) da.mo74062i();
        bzjv10.getClass();
        bziz.f170263b = bzjv10;
        bziz.f170262a |= 2;
        bzjv bzjv11 = ((bziz) da2.f164949b).f170263b;
        if (bzjv11 == null) {
            bzjv11 = bzjv.f170351g;
        }
        int a = bzjx.m125864a(bzjv11.f170354b);
        if (!(a == 0 || a == 1)) {
            if (bzic.f164950c) {
                bzic.mo74035c();
                bzic.f164950c = false;
            }
            bzid bzid = (bzid) bzic.f164949b;
            bziz bziz2 = (bziz) da2.mo74062i();
            bziz2.getClass();
            bzid.f170161c = bziz2;
            bzid.f170159a |= 4;
        }
        for (Integer num : this.f86935d.f86941f) {
            int intValue = num.intValue();
            bxvd da3 = bzhl.f170076m.mo74144da();
            bzhl bzhl = null;
            if (intValue == 0) {
                bzht bzht = bzht.f170120a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzhl bzhl2 = (bzhl) da3.f164949b;
                bzht.getClass();
                bzhl2.f170088k = bzht;
                bzhl2.f170078a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                bzhl = (bzhl) da3.mo74062i();
            } else if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        bxvd da4 = bzje.f170279c.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bzje bzje = (bzje) da4.f164949b;
                        bzje.f170281a |= 2;
                        bzje.f170282b = 20;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl3 = (bzhl) da3.f164949b;
                        bzje bzje2 = (bzje) da4.mo74062i();
                        bzje2.getClass();
                        bzhl3.f170080c = bzje2;
                        bzhl3.f170078a |= 2;
                        bzhl = (bzhl) da3.mo74062i();
                    } else if (intValue == 4) {
                        bzhf bzhf = bzhf.f170043a;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl4 = (bzhl) da3.f164949b;
                        bzhf.getClass();
                        bzhl4.f170082e = bzhf;
                        bzhl4.f170078a |= 8;
                        bzhl = (bzhl) da3.mo74062i();
                    } else if (intValue == 6) {
                        bxvd da5 = bzii.f170183c.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        bzii bzii = (bzii) da5.f164949b;
                        bzii.f170185a |= 2;
                        bzii.f170186b = 3;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl5 = (bzhl) da3.f164949b;
                        bzii bzii2 = (bzii) da5.mo74062i();
                        bzii2.getClass();
                        bzhl5.f170083f = bzii2;
                        bzhl5.f170078a |= 64;
                        bzhl = (bzhl) da3.mo74062i();
                    } else if (intValue == 8) {
                        bzju bzju = bzju.f170349a;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl6 = (bzhl) da3.f164949b;
                        bzju.getClass();
                        bzhl6.f170085h = bzju;
                        bzhl6.f170078a |= 512;
                        bzhl = (bzhl) da3.mo74062i();
                    } else if (intValue == 11) {
                        bxvd da6 = bzjr.f170330c.mo74144da();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bzjr bzjr = (bzjr) da6.f164949b;
                        bzjr.f170332a |= 2;
                        bzjr.f170333b = true;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl7 = (bzhl) da3.f164949b;
                        bzjr bzjr2 = (bzjr) da6.mo74062i();
                        bzjr2.getClass();
                        bzhl7.f170084g = bzjr2;
                        bzhl7.f170078a |= 128;
                        bzhl = (bzhl) da3.mo74062i();
                    } else if (intValue == 13) {
                        bxvd da7 = bziq.f170219f.mo74144da();
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bziq bziq = (bziq) da7.f164949b;
                        bziq.f170222b = 2;
                        bziq.f170221a |= 1;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl8 = (bzhl) da3.f164949b;
                        bziq bziq2 = (bziq) da7.mo74062i();
                        bziq2.getClass();
                        bzhl8.f170086i = bziq2;
                        bzhl8.f170078a |= 8192;
                        bzhl = (bzhl) da3.mo74062i();
                    } else if (intValue == 14) {
                        bzjp bzjp = bzjp.f170324a;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bzhl bzhl9 = (bzhl) da3.f164949b;
                        bzjp.getClass();
                        bzhl9.f170089l = bzjp;
                        bzhl9.f170078a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        bzhl = (bzhl) da3.mo74062i();
                    }
                } else if (!cgoi.m146341b()) {
                    bxvd da8 = bzjm.f170307c.mo74144da();
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    bzjm bzjm = (bzjm) da8.f164949b;
                    bzjm.f170309a |= 2;
                    bzjm.f170310b = 10;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bzhl bzhl10 = (bzhl) da3.f164949b;
                    bzjm bzjm2 = (bzjm) da8.mo74062i();
                    bzjm2.getClass();
                    bzhl10.f170079b = bzjm2;
                    bzhl10.f170078a |= 1;
                    bzhl = (bzhl) da3.mo74062i();
                }
            } else if (!cgof.m146336b()) {
                bxvd da9 = bzji.f170289c.mo74144da();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                bzji bzji = (bzji) da9.f164949b;
                bzji.f170291a |= 2;
                bzji.f170292b = 10;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzhl bzhl11 = (bzhl) da3.f164949b;
                bzji bzji2 = (bzji) da9.mo74062i();
                bzji2.getClass();
                bzhl11.f170081d = bzji2;
                bzhl11.f170078a |= 4;
                bzhl = (bzhl) da3.mo74062i();
            }
            if (bzhl != null) {
                if (bzic.f164950c) {
                    bzic.mo74035c();
                    bzic.f164950c = false;
                }
                bzid bzid2 = (bzid) bzic.f164949b;
                bzhl.getClass();
                bzid2.mo74548c();
                bzid2.f170160b.add(bzhl);
            }
        }
        bxvd da10 = bzhl.f170076m.mo74144da();
        bzik bzik = bzik.f170200a;
        if (da10.f164950c) {
            da10.mo74035c();
            da10.f164950c = false;
        }
        bzhl bzhl12 = (bzhl) da10.f164949b;
        bzik.getClass();
        bzhl12.f170087j = bzik;
        bzhl12.f170078a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        bzic.mo74547a(da10);
        return (bzid) bzic.mo74062i();
    }

    /* renamed from: a */
    public final void mo48197a(aqvr aqvr) {
        this.f86933b.add(aqvr);
        aqqw aqqw = this.f86934c;
        if (aqqw != null) {
            aqvr.mo48038a(aqqw);
        }
    }
}
