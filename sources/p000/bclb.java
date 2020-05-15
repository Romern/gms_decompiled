package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bclb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bclb {
    /* renamed from: a */
    public static int m89214a(int i) {
        bcon bcon = bcon.UNKNOWN;
        switch (bcon.m89494a(i).ordinal()) {
            case 1:
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 9:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* renamed from: a */
    public static bmxv m89215a(Context context, cbdj cbdj, bmxv bmxv, bmxv bmxv2) {
        cbee cbee;
        cbed cbed;
        cbed cbed2;
        cbed cbed3;
        cbdg cbdg;
        cbeg cbeg;
        cbeb cbeb;
        bmxv bmxv3;
        cbdf cbdf;
        cbee cbee2;
        bcoo j = bcov.m89535j();
        m89220a(j, cbdj, bmxv, bmxv2);
        bcon bcon = bcon.UNKNOWN;
        int b = cbeh.m127771b(cbdj.f176749h);
        if (b == 0) {
            b = 1;
        }
        switch (b - 2) {
            case 1:
                bcot c = bcou.m89529c();
                if (cbdj.f176742a == 101) {
                    cbed = (cbed) cbdj.f176743b;
                } else {
                    cbed = cbed.f176829d;
                }
                c.mo57111b(cbed.f176831a);
                if (cbdj.f176742a == 101) {
                    cbed2 = (cbed) cbdj.f176743b;
                } else {
                    cbed2 = cbed.f176829d;
                }
                c.mo57110a(cbed2.f176833c);
                bcou a = c.mo57109a();
                if (cbdj.f176742a == 101) {
                    cbed3 = (cbed) cbdj.f176743b;
                } else {
                    cbed3 = cbed.f176829d;
                }
                if (cbed3.f176832b) {
                    j.mo57089a(a);
                    break;
                } else {
                    j.mo57092b(a);
                    break;
                }
            case 2:
                if (cbdj.f176742a == 102) {
                    cbdg = (cbdg) cbdj.f176743b;
                } else {
                    cbdg = cbdg.f176729b;
                }
                j.mo57093b(cbdg.f176731a);
                break;
            case 3:
                if (cbdj.f176742a == 103) {
                    cbeg = (cbeg) cbdj.f176743b;
                } else {
                    cbeg = cbeg.f176841b;
                }
                j.mo57100h(cbeg.f176843a);
                break;
            case 4:
                if (cbdj.f176742a == 104) {
                    cbeb = (cbeb) cbdj.f176743b;
                } else {
                    cbeb = cbeb.f176817c;
                }
                bcor c2 = bcos.m89522c();
                cbec cbec = cbeb.f176819a;
                if (cbec != null) {
                    bmxv a2 = m89216a(cbec);
                    if (!a2.mo66813a()) {
                        bmxv3 = bmvz.f131120a;
                        if (!bmxv3.mo66813a()) {
                            return bmvz.f131120a;
                        }
                        j.mo57088a((bcos) bmxv3.mo66814b());
                        return bmxv.m108566b(j.mo57085a());
                    }
                    c2.mo57106a((bctn) a2.mo66814b());
                }
                if (cbeb.f176820b != null) {
                    bcsw c3 = bcsx.m89862c();
                    cbdh cbdh = cbeb.f176820b;
                    if (cbdh == null) {
                        cbdh = cbdh.f176732c;
                    }
                    c3.mo57486a(cbdh.f176735b);
                    cbdh cbdh2 = cbeb.f176820b;
                    if (cbdh2 == null) {
                        cbdh2 = cbdh.f176732c;
                    }
                    cbec cbec2 = cbdh2.f176734a;
                    if (cbec2 == null) {
                        cbec2 = cbec.f176821g;
                    }
                    bmxv a3 = m89216a(cbec2);
                    if (a3.mo66813a()) {
                        c3.mo57485a((bctn) a3.mo66814b());
                        c2.mo57105a(c3.mo57484a());
                    } else {
                        bmxv3 = bmvz.f131120a;
                        if (!bmxv3.mo66813a()) {
                        }
                    }
                }
                bmxv3 = bmxv.m108566b(c2.mo57104a());
                if (!bmxv3.mo66813a()) {
                }
            case 5:
                j.mo57094c();
                break;
            case 6:
                if (cbdj.f176742a == 105) {
                    cbdf = (cbdf) cbdj.f176743b;
                } else {
                    cbdf = cbdf.f176726b;
                }
                j.mo57090a(cbdf.f176728a);
                break;
            case 7:
                if (bbqe.m88387a(context).mo56363g()) {
                    if (cbdj.f176742a == 106) {
                        cbee2 = (cbee) cbdj.f176743b;
                    } else {
                        cbee2 = cbee.f176834b;
                    }
                    j.mo57098f(cbee2.f176836a);
                    break;
                } else {
                    return bmvz.f131120a;
                }
            default:
                return bmvz.f131120a;
        }
        if (((Boolean) bbqt.m88417a(context).f103128aW.mo58455c()).booleanValue()) {
            int i = cbdj.f176750i;
            int i2 = i != 0 ? i != 1 ? 0 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            if (i2 - 2 != 1) {
                j.mo57091b();
            } else if (bbqe.m88387a(context).mo56363g()) {
                if (cbdj.f176744c == 201) {
                    cbee = (cbee) cbdj.f176745d;
                } else {
                    cbee = cbee.f176834b;
                }
                j.mo57095c(cbee.f176836a);
            }
        }
        return bmxv.m108566b(j.mo57085a());
    }

    /* renamed from: a */
    private static bmxv m89216a(cbec cbec) {
        cbdj cbdj = cbec.f176823a;
        if (cbdj == null) {
            cbdj = cbdj.f176740j;
        }
        int b = cbeh.m127771b(cbdj.f176749h);
        if (b == 0 || b != 7) {
            return bmvz.f131120a;
        }
        bcoo j = bcov.m89535j();
        cbdj cbdj2 = cbec.f176823a;
        if (cbdj2 == null) {
            cbdj2 = cbdj.f176740j;
        }
        m89220a(j, cbdj2, bmvz.f131120a, bmvz.f131120a);
        j.mo57094c();
        bctm h = bctn.m89940h();
        h.mo57530a(cbec.f176825c);
        h.mo57529a(cbec.f176824b);
        h.mo57532c(cbec.f176826d);
        h.mo57527a(j.mo57085a());
        cbdr cbdr = cbec.f176827e;
        if (cbdr == null) {
            cbdr = cbdr.f176775f;
        }
        h.mo57528a(bclj.m89242a(cbdr));
        h.mo57531b(cbec.f176828f);
        return bmxv.m108566b(h.mo57525a());
    }

    /* renamed from: a */
    public static cbdj m89217a(bcov bcov) {
        bxvd da = cbdj.f176740j.mo74144da();
        m89221a(bcov, da);
        bcon bcon = bcon.UNKNOWN;
        switch (bcov.mo57120f().ordinal()) {
            case 0:
                throw new IllegalArgumentException("Got unknown action type integer.");
            case 1:
                bxvd da2 = cbed.f176829d.mo74144da();
                String a = bcov.mo57121g().mo57077b().mo57112a();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                a.getClass();
                ((cbed) da2.f164949b).f176831a = a;
                String b = bcov.mo57121g().mo57077b().mo57113b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                cbed cbed = (cbed) da2.f164949b;
                b.getClass();
                cbed.f176833c = b;
                cbed.f176832b = false;
                cbed cbed2 = (cbed) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj = (cbdj) da.f164949b;
                cbed2.getClass();
                cbdj.f176743b = cbed2;
                cbdj.f176742a = 101;
                break;
            case 2:
                bxvd da3 = cbed.f176829d.mo74144da();
                String a2 = bcov.mo57121g().mo57078c().mo57112a();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                a2.getClass();
                ((cbed) da3.f164949b).f176831a = a2;
                String b2 = bcov.mo57121g().mo57078c().mo57113b();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cbed cbed3 = (cbed) da3.f164949b;
                b2.getClass();
                cbed3.f176833c = b2;
                cbed3.f176832b = true;
                cbed cbed4 = (cbed) da3.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj2 = (cbdj) da.f164949b;
                cbed4.getClass();
                cbdj2.f176743b = cbed4;
                cbdj2.f176742a = 101;
                break;
            case 3:
                bxvd da4 = cbdg.f176729b.mo74144da();
                String d = bcov.mo57121g().mo57079d();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                d.getClass();
                ((cbdg) da4.f164949b).f176731a = d;
                cbdg cbdg = (cbdg) da4.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj3 = (cbdj) da.f164949b;
                cbdg.getClass();
                cbdj3.f176743b = cbdg;
                cbdj3.f176742a = 102;
                break;
            case 4:
                bxvd da5 = cbeg.f176841b.mo74144da();
                String e = bcov.mo57121g().mo57080e();
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                e.getClass();
                ((cbeg) da5.f164949b).f176843a = e;
                cbeg cbeg = (cbeg) da5.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj4 = (cbdj) da.f164949b;
                cbeg.getClass();
                cbdj4.f176743b = cbeg;
                cbdj4.f176742a = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                break;
            case 5:
                bcor c = bcos.m89522c();
                c.mo57106a(bcov.mo57121g().mo57082g());
                cbeb a3 = m89218a(c.mo57104a());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj5 = (cbdj) da.f164949b;
                a3.getClass();
                cbdj5.f176743b = a3;
                cbdj5.f176742a = ErrorInfo.TYPE_SDU_FAILED;
                break;
            case 7:
                bxvd da6 = cbdf.f176726b.mo74144da();
                String h = bcov.mo57121g().mo57083h();
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                h.getClass();
                ((cbdf) da6.f164949b).f176728a = h;
                cbdf cbdf = (cbdf) da6.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj6 = (cbdj) da.f164949b;
                cbdf.getClass();
                cbdj6.f176743b = cbdf;
                cbdj6.f176742a = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                break;
            case 8:
                bxvd da7 = cbee.f176834b.mo74144da();
                String i = bcov.mo57121g().mo57084i();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                i.getClass();
                ((cbee) da7.f164949b).f176836a = i;
                cbee cbee = (cbee) da7.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj7 = (cbdj) da.f164949b;
                cbee.getClass();
                cbdj7.f176743b = cbee;
                cbdj7.f176742a = 106;
                break;
            case 9:
                cbeb a4 = m89218a(bcov.mo57121g().mo57081f());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj8 = (cbdj) da.f164949b;
                a4.getClass();
                cbdj8.f176743b = a4;
                cbdj8.f176742a = ErrorInfo.TYPE_SDU_FAILED;
                break;
        }
        int ordinal = bcov.mo57122h().ordinal();
        if (ordinal != 6) {
            if (ordinal == 8) {
                bxvd da8 = cbee.f176834b.mo74144da();
                String i2 = bcov.mo57123i().mo57084i();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                i2.getClass();
                ((cbee) da8.f164949b).f176836a = i2;
                cbee cbee2 = (cbee) da8.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cbdj cbdj9 = (cbdj) da.f164949b;
                cbee2.getClass();
                cbdj9.f176745d = cbee2;
                cbdj9.f176744c = ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
            } else {
                int i3 = bcov.mo57122h().f104636k;
                StringBuilder sb = new StringBuilder(61);
                sb.append("Got unknown callback failure action type integer: ");
                sb.append(i3);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (cbdj) da.mo74062i();
    }

    /* renamed from: a */
    private static cbeb m89218a(bcos bcos) {
        bxvd da = cbeb.f176817c.mo74144da();
        if (bcos.mo57107a().mo66813a()) {
            cbec a = m89219a((bctn) bcos.mo57107a().mo66814b());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((cbeb) da.f164949b).f176819a = a;
        }
        if (bcos.mo57108b().mo66813a()) {
            bcsx bcsx = (bcsx) bcos.mo57108b().mo66814b();
            bxvd da2 = cbdh.f176732c.mo74144da();
            String b = bcsx.mo57336b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((cbdh) da2.f164949b).f176735b = b;
            cbec a2 = m89219a(bcsx.mo57335a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a2.getClass();
            ((cbdh) da2.f164949b).f176734a = a2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbdh cbdh = (cbdh) da2.mo74062i();
            cbdh.getClass();
            ((cbeb) da.f164949b).f176820b = cbdh;
        }
        return (cbeb) da.mo74062i();
    }

    /* renamed from: a */
    private static cbec m89219a(bctn bctn) {
        bxvd da = cbdj.f176740j.mo74144da();
        if (bctn.mo57384a().mo66813a()) {
            m89221a((bcov) bctn.mo57384a().mo66814b(), da);
        }
        bxvd da2 = cbec.f176821g.mo74144da();
        int g = bctn.mo57391g();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbec) da2.f164949b).f176828f = g;
        if (bctn.mo57385b().mo66813a()) {
            bxtx bxtx = (bxtx) bctn.mo57385b().mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxtx.getClass();
            ((cbec) da2.f164949b).f176824b = bxtx;
        }
        if (bctn.mo57387d().mo66813a()) {
            String str = (String) bctn.mo57387d().mo66814b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((cbec) da2.f164949b).f176825c = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbdj) da.f164949b).f176749h = cbeh.m127770a(7);
        cbdj cbdj = (cbdj) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbdj.getClass();
        ((cbec) da2.f164949b).f176823a = cbdj;
        int e = bctn.mo57388e();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbec) da2.f164949b).f176826d = e;
        int g2 = bctn.mo57391g();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbec) da2.f164949b).f176828f = g2;
        return (cbec) da2.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    private static void m89220a(bcoo bcoo, cbdj cbdj, bmxv bmxv, bmxv bmxv2) {
        bmxv bmxv3;
        bcoo.mo57086a(cbdj.f176748g);
        if (!cbdj.f176746e.isEmpty()) {
            bcoo.mo57096d(cbdj.f176746e);
        }
        cbds cbds = cbdj.f176747f;
        if (cbds == null) {
            cbds = cbds.f176782e;
        }
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int b = cbel.m127777b(cbds.f176784a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (!(i == 1 || i == 2 || i == 3)) {
            if (i == 4) {
                bcsr c = ConversationId.GroupId.m94847c();
                c.mo57478b(cbds.f176785b);
                c.mo57477a(cbds.f176787d);
                bmxv3 = bmxv.m108566b(bcpo.m89593a(c.mo57476a()));
            } else if (i != 5) {
                bmxv3 = bmvz.f131120a;
            }
            if (bmxv3.mo66813a()) {
                bcoo.mo57087a((bcop) bmxv3.mo66814b());
            }
            if (bmxv.mo66813a()) {
                bcoo.mo57099g((String) bmxv.mo66814b());
            }
            if (!bmxv2.mo66813a()) {
                bcoo.mo57097e((String) bmxv2.mo66814b());
                return;
            }
            return;
        }
        bmxv3 = bmxv.m108566b(bcpo.m89592a(bclk.m89246a(cbds)));
        if (bmxv3.mo66813a()) {
        }
        if (bmxv.mo66813a()) {
        }
        if (!bmxv2.mo66813a()) {
        }
    }

    /* renamed from: a */
    private static void m89221a(bcov bcov, bxvd bxvd) {
        int i;
        long e = bcov.mo57119e();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cbdj cbdj = cbdj.f176740j;
        ((cbdj) bxvd.f164949b).f176748g = e;
        if (bcov.mo57117c().mo66813a()) {
            String str = (String) bcov.mo57117c().mo66814b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            str.getClass();
            ((cbdj) bxvd.f164949b).f176746e = str;
        }
        if (bcov.mo57118d().mo66813a()) {
            cbds a = bclk.m89244a((bcop) bcov.mo57118d().mo66814b());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            a.getClass();
            ((cbdj) bxvd.f164949b).f176747f = a;
        }
        int a2 = m89214a(bcov.mo57120f().f104636k);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((cbdj) bxvd.f164949b).f176749h = cbeh.m127770a(a2);
        int i2 = bcov.mo57122h().f104636k;
        bcon bcon = bcon.UNKNOWN;
        int ordinal = bcon.m89494a(i2).ordinal();
        if (ordinal != 6) {
            i = ordinal != 8 ? 1 : 3;
        } else {
            i = 2;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cbdj cbdj2 = (cbdj) bxvd.f164949b;
        if (i != 1) {
            cbdj2.f176750i = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
