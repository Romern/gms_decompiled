package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: fcv */
final /* synthetic */ class fcv implements epg {
    /* renamed from: a */
    public final Object mo10390a(Object obj, Object obj2) {
        bsxf bsxf;
        bsye bsye;
        bsvd bsvd;
        bsvd bsvd2;
        bsvo bsvo;
        bnic bnic = (bnic) obj2;
        ArrayList arrayList = new ArrayList();
        for (bsxk bsxk : (List) obj) {
            bsxn bsxn = bsxk.f147583d;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            if (bsxn.f147589b != 0) {
                int i = bsxk.f147581b;
                if (i == 1000) {
                    break;
                } else if (i == 8) {
                    bsvd bsvd3 = (bsvd) bsxk.f147582c;
                    if (bsvd3.f147232a != 2) {
                        if (bsvd3.f147232a == 1) {
                            bsye = (bsye) bsvd3.f147233b;
                        } else {
                            bsye = bsye.f147660e;
                        }
                        if (bsye.f147664c.size() == 0) {
                            if (bsxk.f147581b == 8) {
                                bsvd2 = (bsvd) bsxk.f147582c;
                            } else {
                                bsvd2 = bsvd.f147230c;
                            }
                            if (bsvd2.f147232a == 3) {
                                bsvo = (bsvo) bsvd2.f147233b;
                            } else {
                                bsvo = bsvo.f147314b;
                            }
                            if (bsvo.f147316a.size() == 0) {
                            }
                        }
                        if (bsxk.f147581b == 8) {
                            bsvd = (bsvd) bsxk.f147582c;
                        } else {
                            bsvd = bsvd.f147230c;
                        }
                        arrayList.add(bsvd);
                    } else {
                        if (bsvd3.f147232a == 2) {
                            bsxf = (bsxf) bsvd3.f147233b;
                        } else {
                            bsxf = bsxf.f147542b;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        bxwc bxwc = bsxf.f147544a;
                        int size = bxwc.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            bsxh bsxh = (bsxh) bxwc.get(i2);
                            if (!bnic.contains(Long.valueOf(bsxh.f147554b))) {
                                arrayList2.add(bsxh);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            bxvd da = bsxf.f147542b.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bsxf bsxf2 = (bsxf) da.f164949b;
                            bsxf2.mo70718a();
                            bxsy.m123078a(arrayList2, bsxf2.f147544a);
                            bsxf bsxf3 = (bsxf) da.mo74062i();
                            bxvd da2 = bsvd.f147230c.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bsvd bsvd4 = (bsvd) da2.f164949b;
                            bsxf3.getClass();
                            bsvd4.f147233b = bsxf3;
                            bsvd4.f147232a = 2;
                            arrayList.add((bsvd) da2.mo74062i());
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
