package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: bcxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcxu {
    /* renamed from: a */
    static bczq m90216a(bcoh bcoh, Context context, cbfu cbfu, String str, bcnt bcnt) {
        int i;
        bczy bczy;
        cbfv cbfv;
        cbfz cbfz;
        bngs bngs = new bngs();
        bxwc bxwc = cbfu.f176975a;
        int size = bxwc.size();
        for (int i2 = 0; i2 < size; i2++) {
            cbfy cbfy = (cbfy) bxwc.get(i2);
            bdac bdac = bdac.RICH_TEXT;
            bczv bczv = bczv.STACK_COMPONENT;
            bczj bczj = bczj.STACK_CARD;
            int i3 = cbfy.f176992c;
            if (i3 != 0) {
                i = i3 != 1 ? i3 != 2 ? 0 : 4 : 3;
            } else {
                i = 2;
            }
            if (i == 0) {
                i = 1;
            }
            int i4 = i - 2;
            if (i4 == 1) {
                if (cbfy.f176990a == 101) {
                    cbfv = (cbfv) cbfy.f176991b;
                } else {
                    cbfv = cbfv.f176976b;
                }
                bngs bngs2 = new bngs();
                bxwc bxwc2 = cbfv.f176978a;
                int size2 = bxwc2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    bngs2.mo67668c(m90217a(bcoh, context, (cbfz) bxwc2.get(i5), str, bcnt));
                }
                bczw b = bczx.m90397b();
                b.mo57811a(bngs2.mo67664a());
                bczy = bcyd.m90237a(b.mo57810a());
            } else if (i4 == 2) {
                if (cbfy.f176990a == 102) {
                    cbfz = (cbfz) cbfy.f176991b;
                } else {
                    cbfz = cbfz.f176993h;
                }
                bczy = bcyd.m90238a(m90217a(bcoh, context, cbfz, str, bcnt));
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Got unknown UI component: ");
                sb.append(i3);
                throw new bcld(sb.toString(), 222);
            }
            bngs.mo67668c(bczy);
        }
        bczp b2 = bczq.m90376b();
        b2.mo57800a(bngs.mo67664a());
        return b2.mo57799a();
    }

    /* renamed from: a */
    static bdad m90217a(bcoh bcoh, Context context, cbfz cbfz, String str, bcnt bcnt) {
        cbgf cbgf;
        cbfx cbfx;
        cbfp cbfp;
        cbft cbft;
        cbfo cbfo;
        cbfn cbfn;
        bczz g = bdad.m90423g();
        g.mo57822c(cbfz.f176998d);
        g.mo57823d(cbfz.f176999e);
        g.mo57821b(cbfz.f177000f);
        g.mo57813a(cbfz.f177001g);
        bdac bdac = bdac.RICH_TEXT;
        bczv bczv = bczv.STACK_COMPONENT;
        bczj bczj = bczj.STACK_CARD;
        int b = cbep.m127783b(cbfz.f176997c);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 1:
                if (cbfz.f176995a == 101) {
                    cbgf = (cbgf) cbfz.f176996b;
                } else {
                    cbgf = cbgf.f177024b;
                }
                g.mo57814a(bcly.m89263a(bcoh, context, cbgf, str, bcnt));
                return g.mo57812a();
            case 2:
            default:
                int b2 = cbep.m127783b(cbfz.f176997c);
                if (b2 != 0) {
                    i = b2;
                }
                int a = cbep.m127782a(i);
                StringBuilder sb = new StringBuilder(35);
                sb.append("Got unknown UI element: ");
                sb.append(a);
                throw new bcld(sb.toString(), 223);
            case 3:
                if (cbfz.f176995a == 103) {
                    cbfx = (cbfx) cbfz.f176996b;
                } else {
                    cbfx = cbfx.f176983d;
                }
                bczt d = bczu.m90391d();
                d.mo57808a(cbfx.f176985a);
                bzrt bzrt = cbfx.f176986b;
                if (bzrt == null) {
                    bzrt = bzrt.f171195e;
                }
                d.mo57807a(bclc.m89223a(bzrt));
                bzrt bzrt2 = cbfx.f176987c;
                if (bzrt2 == null) {
                    bzrt2 = bzrt.f171195e;
                }
                d.mo57809b(bclc.m89223a(bzrt2));
                g.mo57819a(d.mo57806a());
                return g.mo57812a();
            case 4:
                if (cbfz.f176995a == 104) {
                    cbfp = (cbfp) cbfz.f176996b;
                } else {
                    cbfp = cbfp.f176947e;
                }
                if (cbfp.f176949a != null) {
                    bczg g2 = bczh.m90332g();
                    bcwo c = bcwp.m90173c();
                    cbey cbey = cbfp.f176949a;
                    if (cbey == null) {
                        cbey = cbey.f176867f;
                    }
                    cbmf cbmf = cbey.f176869a;
                    if (cbmf == null) {
                        cbmf = cbmf.f177611d;
                    }
                    c.mo57635a(cbmf.f177613a);
                    cbey cbey2 = cbfp.f176949a;
                    if (cbey2 == null) {
                        cbey2 = cbey.f176867f;
                    }
                    cbmf cbmf2 = cbey2.f176869a;
                    if (cbmf2 == null) {
                        cbmf2 = cbmf.f177611d;
                    }
                    bxvl bxvl = cbmf2.f177615c;
                    if (bxvl == null) {
                        bxvl = bxvl.f164962b;
                    }
                    c.mo57634a(bxvl.f164964a);
                    g2.mo57783a(c.mo57633a());
                    cbey cbey3 = cbfp.f176949a;
                    if (cbey3 == null) {
                        cbey3 = cbey.f176867f;
                    }
                    g2.mo57785a(cbey3.f176871c.mo73780k());
                    g2.mo57786b(cbfp.f176950b);
                    g2.mo57782a(cbfp.f176951c);
                    g2.mo57784a(cbfp.f176952d);
                    g.mo57817a(g2.mo57781a());
                    return g.mo57812a();
                }
                throw new bcld("Got invalid image proto.", 228);
            case 5:
                if (cbfz.f176995a == 105) {
                    cbft = (cbft) cbfz.f176996b;
                } else {
                    cbft = cbft.f176969c;
                }
                bczl c2 = bczo.m90370c();
                c2.mo57789a(cbft.f176972b);
                c2.mo57790a(bbow.m88303c(cbft.f176971a, new bcxp(context, str)));
                g.mo57818a(c2.mo57788a());
                return g.mo57812a();
            case 6:
                if (cbfz.f176995a == 106) {
                    cbfo = (cbfo) cbfz.f176996b;
                } else {
                    cbfo = cbfo.f176943c;
                }
                bcze c3 = bczf.m90322c();
                bzrt bzrt3 = cbfo.f176945a;
                if (bzrt3 == null) {
                    bzrt3 = bzrt.f171195e;
                }
                c3.mo57780a(bclc.m89223a(bzrt3));
                c3.mo57779a(cbfo.f176946b);
                g.mo57816a(c3.mo57778a());
                return g.mo57812a();
            case 7:
                if (cbfz.f176995a == 107) {
                    cbfn = (cbfn) cbfz.f176996b;
                } else {
                    cbfn = cbfn.f176940b;
                }
                bcza b3 = bczd.m90317b();
                b3.mo57772a(bbow.m88301a(cbfn.f176942a, new bcxq(context, str)));
                g.mo57815a(b3.mo57771a());
                return g.mo57812a();
            case 8:
                g.mo57820b();
                return g.mo57812a();
        }
    }

    /* renamed from: a */
    static cbfz m90218a(bdad bdad) {
        bxvd da = cbfz.f176993h.mo74144da();
        int b = bdad.mo57759b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbfz) da.f164949b).f176998d = b;
        int c = bdad.mo57760c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbfz) da.f164949b).f176999e = c;
        int d = bdad.mo57761d();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbfz) da.f164949b).f177000f = d;
        int e = bdad.mo57762e();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbfz) da.f164949b).f177001g = e;
        bdac bdac = bdac.RICH_TEXT;
        bczv bczv = bczv.STACK_COMPONENT;
        bczj bczj = bczj.STACK_CARD;
        int ordinal = bdad.mo57824f().ordinal();
        if (ordinal == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfz) da.f164949b).f176997c = cbep.m127782a(3);
            cbgf a = bcly.m89264a(bdad.mo57758a().mo57686f());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbfz cbfz = (cbfz) da.f164949b;
            a.getClass();
            cbfz.f176996b = a;
            cbfz.f176995a = 101;
            return (cbfz) da.mo74062i();
        } else if (ordinal == 7) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfz) da.f164949b).f176997c = cbep.m127782a(10);
            return (cbfz) da.mo74062i();
        } else if (ordinal == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfz) da.f164949b).f176997c = cbep.m127782a(5);
            bczu g = bdad.mo57758a().mo57690g();
            bxvd da2 = cbfx.f176983d.mo74144da();
            String a2 = g.mo57748a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a2.getClass();
            ((cbfx) da2.f164949b).f176985a = a2;
            bzrt a3 = bclc.m89224a(g.mo57749b());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a3.getClass();
            ((cbfx) da2.f164949b).f176986b = a3;
            bzrt a4 = bclc.m89224a(g.mo57750c());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a4.getClass();
            ((cbfx) da2.f164949b).f176987c = a4;
            cbfx cbfx = (cbfx) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbfz cbfz2 = (cbfz) da.f164949b;
            cbfx.getClass();
            cbfz2.f176996b = cbfx;
            cbfz2.f176995a = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            return (cbfz) da.mo74062i();
        } else if (ordinal == 3) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfz) da.f164949b).f176997c = cbep.m127782a(7);
            bczo e2 = bdad.mo57758a().mo57681e();
            bxvd da3 = cbft.f176969c.mo74144da();
            int b2 = e2.mo57725b();
            if (b2 == 1) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((cbft) da3.f164949b).f176972b = cben.m127780a(3);
            } else if (b2 == 2) {
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ((cbft) da3.f164949b).f176972b = cben.m127780a(4);
            } else {
                int b3 = e2.mo57725b();
                StringBuilder sb = new StringBuilder(53);
                sb.append("Got unknown buttons orientation integer: ");
                sb.append(b3);
                sb.append(".");
                throw new IllegalArgumentException(sb.toString());
            }
            bngx a5 = bbow.m88301a(e2.mo57724a(), bcxr.f105110a);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            cbft cbft = (cbft) da3.f164949b;
            if (!cbft.f176971a.mo73666a()) {
                cbft.f176971a = bxvk.m124021a(cbft.f176971a);
            }
            bxsy.m123078a(a5, cbft.f176971a);
            cbft cbft2 = (cbft) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbfz cbfz3 = (cbfz) da.f164949b;
            cbft2.getClass();
            cbfz3.f176996b = cbft2;
            cbfz3.f176995a = ErrorInfo.TYPE_SDU_MEMORY_FULL;
            return (cbfz) da.mo74062i();
        } else if (ordinal == 4) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfz) da.f164949b).f176997c = cbep.m127782a(8);
            bczf c2 = bdad.mo57758a().mo57673c();
            bxvd da4 = cbfo.f176943c.mo74144da();
            bzrt a6 = bclc.m89224a(c2.mo57710a());
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            a6.getClass();
            ((cbfo) da4.f164949b).f176945a = a6;
            float b4 = c2.mo57711b();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ((cbfo) da4.f164949b).f176946b = b4;
            cbfo cbfo = (cbfo) da4.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbfz cbfz4 = (cbfz) da.f164949b;
            cbfo.getClass();
            cbfz4.f176996b = cbfo;
            cbfz4.f176995a = 106;
            return (cbfz) da.mo74062i();
        } else if (ordinal == 5) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((cbfz) da.f164949b).f176997c = cbep.m127782a(9);
            bczd b5 = bdad.mo57758a().mo57669b();
            bxvd da5 = cbfn.f176940b.mo74144da();
            bngx a7 = bbow.m88301a(b5.mo57699a(), bcxt.f105112a);
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            cbfn cbfn = (cbfn) da5.f164949b;
            if (!cbfn.f176942a.mo73666a()) {
                cbfn.f176942a = bxvk.m124021a(cbfn.f176942a);
            }
            bxsy.m123078a(a7, cbfn.f176942a);
            cbfn cbfn2 = (cbfn) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbfz cbfz5 = (cbfz) da.f164949b;
            cbfn2.getClass();
            cbfz5.f176996b = cbfn2;
            cbfz5.f176995a = 107;
            return (cbfz) da.mo74062i();
        } else {
            String valueOf = String.valueOf(bdad.mo57824f());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb2.append("Got unknown ui element model type: ");
            sb2.append(valueOf);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
