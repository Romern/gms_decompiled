package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: atam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atam {

    /* renamed from: a */
    public int f89955a = 1;

    /* renamed from: b */
    private final Context f89956b;

    /* renamed from: c */
    private final String f89957c;

    /* renamed from: d */
    private final qws f89958d;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public atam(Context context, AccountInfo accountInfo) {
        String str;
        this.f89956b = context;
        if (accountInfo != null) {
            str = accountInfo.f108326b;
        } else {
            str = null;
        }
        this.f89957c = str;
        this.f89958d = new qws(context, "TAP_AND_PAY_GCORE", this.f89957c);
    }

    /* renamed from: a */
    public static int m75293a(btjx btjx) {
        if (btjx == null) {
            return 1;
        }
        btml btml = btml.UNKNOWN_SETUP_STEP_TYPE;
        btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
        btnv a = btnv.m116964a(btjx.f149197d);
        if (a == null) {
            a = btnv.UNRECOGNIZED;
        }
        switch (a.ordinal()) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 1;
        }
    }

    /* renamed from: f */
    public static int m75297f(int i) {
        int i2 = i - 2;
        btml btml = btml.UNKNOWN_SETUP_STEP_TYPE;
        btnv btnv = btnv.UNKNOWN_ACTIVATION_METHOD_TYPE;
        if (i == 0) {
            throw null;
        } else if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        } else {
            return 2;
        }
    }

    /* renamed from: b */
    public final bxvd mo49753b(int i, CardInfo cardInfo) {
        TokenReference tokenReference;
        String str;
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = i - 1;
        bpbx.f135655a |= 1;
        if (cardInfo != null) {
            bxvd da2 = boxq.f135276e.mo74144da();
            String str2 = cardInfo.f108340a;
            if (str2 != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boxq boxq = (boxq) da2.f164949b;
                str2.getClass();
                boxq.f135278a |= 1;
                boxq.f135279b = str2;
            }
            IssuerInfo issuerInfo = cardInfo.f108350k;
            int i2 = 4;
            if (!(issuerInfo == null || (str = issuerInfo.f108388a) == null)) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boxq boxq2 = (boxq) da2.f164949b;
                str.getClass();
                boxq2.f135278a |= 4;
                boxq2.f135281d = str;
            }
            TokenStatus tokenStatus = cardInfo.f108345f;
            if (tokenStatus != null && (tokenReference = tokenStatus.f108458a) != null) {
                switch (tokenReference.f108457b) {
                    case 1:
                        i2 = 12;
                        break;
                    case 2:
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    case 8:
                        i2 = 10;
                        break;
                    case 9:
                        i2 = 11;
                        break;
                    case 10:
                    case 11:
                    case 12:
                    default:
                        i2 = 1;
                        break;
                    case 13:
                        i2 = 14;
                        break;
                    case 14:
                        i2 = 15;
                        break;
                    case 15:
                        i2 = 16;
                        break;
                }
            } else {
                i2 = 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boxq boxq3 = (boxq) da2.f164949b;
            boxq3.f135280c = i2 - 1;
            boxq3.f135278a |= 2;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpbx bpbx2 = (bpbx) da.f164949b;
            boxq boxq4 = (boxq) da2.mo74062i();
            boxq4.getClass();
            bpbx2.f135668n = boxq4;
            bpbx2.f135655a |= 2048;
        }
        if (this.f89955a != 1) {
            bxvd da3 = bpaj.f135486c.mo74144da();
            int i3 = this.f89955a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpaj bpaj = (bpaj) da3.f164949b;
            int i4 = i3 - 1;
            if (i3 != 0) {
                bpaj.f135489b = i4;
                bpaj.f135488a |= 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpbx bpbx3 = (bpbx) da.f164949b;
                bpaj bpaj2 = (bpaj) da3.mo74062i();
                bpaj2.getClass();
                bpbx3.f135675u = bpaj2;
                bpbx3.f135655a |= 2097152;
            } else {
                throw null;
            }
        }
        return da;
    }

    /* renamed from: c */
    public final void mo49759c() {
        mo49741a(mo49734a(134));
    }

    /* renamed from: d */
    public final void mo49762d() {
        bxvd g = mo49765g(149);
        bxvd da = bpad.f135472e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpad bpad = (bpad) da.f164949b;
        bpad.f135475b = 2;
        int i = bpad.f135474a | 1;
        bpad.f135474a = i;
        bpad.f135476c = 1;
        bpad.f135474a = 2 | i;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpad bpad2 = (bpad) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpad2.getClass();
        bpbx.f135654R = bpad2;
        bpbx.f135656b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: e */
    public final void mo49764e(int i) {
        bxvd g = mo49765g(117);
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        bpbx.f135638B = i - 1;
        bpbx.f135655a |= 536870912;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: g */
    public final bxvd mo49765g(int i) {
        return mo49753b(i, null);
    }

    /* renamed from: c */
    public final void mo49760c(int i) {
        bxvd g = mo49765g(44);
        bxvd da = bpas.f135532c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpas bpas = (bpas) da.f164949b;
        bpas.f135535b = i - 1;
        bpas.f135534a |= 1;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpas bpas2 = (bpas) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpas2.getClass();
        bpbx.f135673s = bpas2;
        bpbx.f135655a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        mo49741a((bpbx) g.mo74062i());
    }

    public atam(Context context, String str, qws qws) {
        this.f89956b = context;
        this.f89957c = str;
        this.f89958d = qws;
    }

    /* renamed from: a */
    public static atam m75294a(Context context, AccountInfo accountInfo) {
        return new atam(context, accountInfo);
    }

    public atam(askf askf) {
        this.f89956b = askf.f89126d;
        this.f89957c = askf.f89124b;
        this.f89958d = new qws(askf.f89126d, "TAP_AND_PAY_GCORE", askf.f89124b);
    }

    /* renamed from: a */
    public static atam m75295a(Context context, String str) {
        return new atam(context, str, new qws(context, "TAP_AND_PAY_GCORE", str));
    }

    /* renamed from: a */
    public static bpaq m75296a(btjx btjx, Boolean bool, Boolean bool2) {
        btka btka;
        btka btka2;
        int i;
        bxvd da = bpaq.f135525e.mo74144da();
        int a = m75293a(btjx);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpaq bpaq = (bpaq) da.f164949b;
        bpaq.f135528b = a - 1;
        bpaq.f135527a |= 1;
        int i2 = 3;
        if (btjx.f149194a == 5) {
            bxvd da2 = boxg.f135244e.mo74144da();
            if (btjx.f149194a == 5) {
                btka = (btka) btjx.f149195b;
            } else {
                btka = btka.f149211f;
            }
            String str = btka.f149214b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boxg boxg = (boxg) da2.f164949b;
            str.getClass();
            boxg.f135246a |= 2;
            boxg.f135248c = str;
            if (btjx.f149194a == 5) {
                btka2 = (btka) btjx.f149195b;
            } else {
                btka2 = btka.f149211f;
            }
            String str2 = btka2.f149213a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boxg boxg2 = (boxg) da2.f164949b;
            str2.getClass();
            boxg2.f135246a |= 1;
            boxg2.f135247b = str2;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    i = 3;
                } else {
                    i = 2;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                boxg boxg3 = (boxg) da2.f164949b;
                boxg3.f135249d = i - 1;
                boxg3.f135246a |= 4;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpaq bpaq2 = (bpaq) da.f164949b;
            boxg boxg4 = (boxg) da2.mo74062i();
            boxg4.getClass();
            bpaq2.f135529c = boxg4;
            bpaq2.f135527a |= 2;
        }
        if (bool2 != null) {
            if (bool2.booleanValue()) {
                i2 = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpaq bpaq3 = (bpaq) da.f164949b;
            bpaq3.f135530d = i2 - 1;
            bpaq3.f135527a |= 4;
        }
        return (bpaq) da.mo74062i();
    }

    /* renamed from: c */
    public final void mo49761c(bpan bpan) {
        bxvd g = mo49765g(78);
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        bpbx.f135680z = bpan.f135522y;
        bpbx.f135655a |= 134217728;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: d */
    public final void mo49763d(int i) {
        mo49741a(mo49734a(i));
    }

    /* renamed from: b */
    public final void mo49754b() {
        mo49741a(mo49734a(133));
    }

    /* renamed from: b */
    public final void mo49755b(int i) {
        bxvd g = mo49765g(41);
        bxvd da = boxd.f135227c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxd boxd = (boxd) da.f164949b;
        boxd.f135230b = i - 1;
        boxd.f135229a |= 1;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        boxd boxd2 = (boxd) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boxd2.getClass();
        bpbx.f135672r = boxd2;
        bpbx.f135655a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final bpbx mo49734a(int i) {
        return (bpbx) mo49753b(i, null).mo74062i();
    }

    /* renamed from: a */
    public final bpbx mo49735a(int i, CardInfo cardInfo) {
        return (bpbx) mo49753b(i, cardInfo).mo74062i();
    }

    /* renamed from: a */
    public final void mo49736a() {
        mo49741a(mo49734a(45));
    }

    /* renamed from: a */
    public final void mo49737a(int i, int i2) {
        bxvd g = mo49765g(149);
        bxvd da = bpad.f135472e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpad bpad = (bpad) da.f164949b;
        bpad.f135475b = i - 1;
        int i3 = bpad.f135474a | 1;
        bpad.f135474a = i3;
        bpad.f135476c = 2;
        int i4 = i3 | 2;
        bpad.f135474a = i4;
        bpad.f135477d = i2 - 1;
        bpad.f135474a = i4 | 4;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpad bpad2 = (bpad) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpad2.getClass();
        bpbx.f135654R = bpad2;
        bpbx.f135656b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: b */
    public final void mo49756b(bpan bpan) {
        bxvd g = mo49765g(77);
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        bpbx.f135680z = bpan.f135522y;
        bpbx.f135655a |= 134217728;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: b */
    public final void mo49757b(CardInfo cardInfo, String str, boolean z) {
        bxvd b = mo49753b(27, cardInfo);
        bxvd da = bpat.f135536c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpat bpat = (bpat) da.f164949b;
        bpat.f135538a |= 1;
        bpat.f135539b = z;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        bpat bpat2 = (bpat) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpat2.getClass();
        bpbx.f135666l = bpat2;
        bpbx.f135655a |= 512;
        mo49742a((bpbx) b.mo74062i(), str);
    }

    /* renamed from: a */
    public final void mo49738a(bpan bpan) {
        bxvd g = mo49765g(76);
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        bpbx.f135680z = bpan.f135522y;
        bpbx.f135655a |= 134217728;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: b */
    public final void mo49758b(String str) {
        mo49742a(mo49735a(8, (CardInfo) null), str);
    }

    /* renamed from: a */
    public final void mo49739a(bpbr bpbr, bpbj bpbj) {
        bxvd g = mo49765g(148);
        bxvd da = bpbu.f135624e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbu bpbu = (bpbu) da.f164949b;
        bpbr.getClass();
        bpbu.f135627b = bpbr;
        int i = bpbu.f135626a | 1;
        bpbu.f135626a = i;
        bpbj.getClass();
        bpbu.f135628c = bpbj;
        bpbu.f135626a = i | 2;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbu bpbu2 = (bpbu) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpbu2.getClass();
        bpbx.f135653Q = bpbu2;
        bpbx.f135656b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final void mo49740a(bpbr bpbr, bpbq bpbq) {
        bxvd g = mo49765g(148);
        bxvd da = bpbu.f135624e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbu bpbu = (bpbu) da.f164949b;
        bpbr.getClass();
        bpbu.f135627b = bpbr;
        int i = bpbu.f135626a | 1;
        bpbu.f135626a = i;
        bpbq.getClass();
        bpbu.f135629d = bpbq;
        bpbu.f135626a = i | 4;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbu bpbu2 = (bpbu) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpbu2.getClass();
        bpbx.f135653Q = bpbu2;
        bpbx.f135656b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final void mo49741a(bpbx bpbx) {
        mo49742a(bpbx, (String) null);
    }

    /* renamed from: a */
    public final void mo49742a(bpbx bpbx, String str) {
        long j;
        if (askc.m74272b().equals("PROD") && !spn.m35859a()) {
            qws qws = this.f89958d;
            bpbx.getClass();
            qwo a = qws.mo24334a(new atal(bpbx));
            a.mo24329b(this.f89956b.getPackageName());
            int a2 = boyl.m111667a(bpbx.f135657c);
            if (a2 == 0) {
                a2 = 1;
            }
            a.mo24328b(a2 - 1);
            if (str != null) {
                j = (long) str.hashCode();
            } else {
                j = 0;
            }
            a.mo24323a(j);
            a.mo24330c(this.f89957c);
            a.mo24327b();
        }
        ((Boolean) askd.f89118j.mo58455c()).booleanValue();
    }

    /* renamed from: a */
    public final void mo49743a(CardInfo cardInfo) {
        mo49741a(mo49735a(120, cardInfo));
    }

    /* renamed from: a */
    public final void mo49744a(CardInfo cardInfo, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        bxvd b = mo49753b(31, cardInfo);
        bxvd da = bpau.f135540g.mo74144da();
        bxvd da2 = boxg.f135244e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boxg boxg = (boxg) da2.f164949b;
        str2.getClass();
        int i2 = boxg.f135246a | 2;
        boxg.f135246a = i2;
        boxg.f135248c = str2;
        str3.getClass();
        boxg.f135246a = i2 | 1;
        boxg.f135247b = str3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpau bpau = (bpau) da.f164949b;
        boxg boxg2 = (boxg) da2.mo74062i();
        boxg2.getClass();
        bpau.f135543b = boxg2;
        bpau.f135542a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpau bpau2 = (bpau) da.f164949b;
        int i3 = bpau2.f135542a | 2;
        bpau2.f135542a = i3;
        bpau2.f135544c = i;
        str4.getClass();
        int i4 = i3 | 4;
        bpau2.f135542a = i4;
        bpau2.f135545d = str4;
        str5.getClass();
        int i5 = i4 | 8;
        bpau2.f135542a = i5;
        bpau2.f135546e = str5;
        str6.getClass();
        bpau2.f135542a = i5 | 16;
        bpau2.f135547f = str6;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        bpau bpau3 = (bpau) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpau3.getClass();
        bpbx.f135667m = bpau3;
        bpbx.f135655a |= 1024;
        mo49742a((bpbx) b.mo74062i(), str);
    }

    /* renamed from: a */
    public final void mo49745a(CardInfo cardInfo, String str, boolean z) {
        bxvd b = mo49753b(12, cardInfo);
        bxvd da = bowy.f135207c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bowy bowy = (bowy) da.f164949b;
        bowy.f135209a |= 1;
        bowy.f135210b = z;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        bowy bowy2 = (bowy) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bowy2.getClass();
        bpbx.f135662h = bowy2;
        bpbx.f135655a |= 32;
        mo49742a((bpbx) b.mo74062i(), str);
    }

    /* renamed from: a */
    public final void mo49746a(CardInfo cardInfo, String str, boolean z, boolean z2) {
        bxvd b = mo49753b(9, cardInfo);
        bxvd da = boxh.f135250d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxh boxh = (boxh) da.f164949b;
        int i = boxh.f135252a | 1;
        boxh.f135252a = i;
        boxh.f135253b = z;
        boxh.f135252a = i | 2;
        boxh.f135254c = z2;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        boxh boxh2 = (boxh) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boxh2.getClass();
        bpbx.f135660f = boxh2;
        bpbx.f135655a |= 8;
        mo49742a((bpbx) b.mo74062i(), str);
    }

    /* renamed from: a */
    public final void mo49747a(CardInfo cardInfo, boolean z, int i, long j) {
        bxvd b = mo49753b(25, cardInfo);
        bxvd da = boxb.f135220e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxb boxb = (boxb) da.f164949b;
        int i2 = boxb.f135222a | 1;
        boxb.f135222a = i2;
        boxb.f135223b = z;
        int i3 = i2 | 2;
        boxb.f135222a = i3;
        boxb.f135224c = i;
        boxb.f135222a = i3 | 4;
        boxb.f135225d = j;
        boxb boxb2 = (boxb) da.mo74062i();
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        boxb2.getClass();
        bpbx.f135643G = boxb2;
        bpbx.f135656b |= 8;
        mo49741a((bpbx) b.mo74062i());
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo49748a(String str) {
        char c;
        switch (str.hashCode()) {
            case -2084671704:
                if (str.equals("com.google.android.gms.tapandpay.ui.ShowSecurityPromptActivity")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -2072786452:
                if (str.equals("com.google.android.gms.tapandpay.wear.dialog.WearSecureKeyguardDialogActivity")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case -1949376377:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.NameResolutionActivity")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1628861047:
                if (str.equals("com.google.android.gms.tapandpay.keyguard.KeyguardSecurityInfoActivity")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1615732918:
                if (str.equals("com.google.android.gms.tapandpay.settings.SelectUntokenizedCardActivity")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1525064117:
                if (str.equals("com.google.android.gms.tapandpay.tap.TapKeyguardActivity")) {
                    c = 12;
                    break;
                }
                c = 65535;
                break;
            case -1415260739:
                if (str.equals("com.google.android.gms.tapandpay.settings.TapAndPaySettingsActivity")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -856877375:
                if (str.equals("com.google.android.gms.tapandpay.issuer.RequestDeleteTokenActivity")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -792630668:
                if (str.equals("com.google.android.gms.tapandpay.ui.WarmWelcomeActivity")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -751902019:
                if (str.equals("com.google.android.gms.tapandpay.account.SelectAccountActivity")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -750182220:
                if (str.equals("com.google.android.gms.tapandpay.ui.SecureDeviceActivity")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -707476949:
                if (str.equals("com.google.android.gms.tapandpay.admin.DeviceAdminPromptActivity")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -679397773:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.UnsupportedCardActivity")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -370095175:
                if (str.equals("com.google.android.gms.tapandpay.tap.TapUiActivity")) {
                    c = 13;
                    break;
                }
                c = 65535;
                break;
            case -261722828:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.SummaryActivity")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case -41759536:
                if (str.equals("com.google.android.gms.tapandpay.ui.PromptSetupActivity")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 20084614:
                if (str.equals("com.google.android.gms.tapandpay.settings.NotificationSettingsActivity")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 164199646:
                if (str.equals("com.google.android.gms.tapandpay.transaction.WalletTransactionDetailsActivity")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 295573246:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.AcceptTosActivity")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 318067112:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.SelectVerificationMethodActivity")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 508924688:
                if (str.equals("com.google.android.gms.tapandpay.issuer.RequestSelectTokenActivity")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 646775030:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.EnableNfcActivity")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 781451687:
                if (str.equals("com.google.android.gms.tapandpay.ui.EnableSecureKeyguardActivity")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 898417555:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.AddNewCardForTokenizationActivity")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 914329393:
                if (str.equals("com.google.android.gms.tapandpay.wear.WearProxyActivity")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 967223022:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.EnterVerificationCodeActivity")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1393634195:
                if (str.equals("com.google.android.gms.tapandpay.wear.dialog.WearTapAndPayDialogActivity")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 1423455119:
                if (str.equals("com.google.android.gms.tapandpay.ui.TokenizationSuccessActivity")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1483692121:
                if (str.equals("com.google.android.gms.tapandpay.wear.WearProxyCompanionActivity")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1857244144:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.TokenizePanActivity")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 1878357222:
                if (str.equals("com.google.android.gms.tapandpay.issuer.RequestTokenizeActivity")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1880906274:
                if (str.equals("com.google.android.gms.tapandpay.tokenization.AddNewCardThroughBrowserActivity")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2031107915:
                if (str.equals("com.google.android.gms.tapandpay.settings.SelectOtherPaymentMethodActivity")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                mo49763d(57);
                return;
            case 1:
                mo49763d(73);
                return;
            case 2:
                mo49763d(83);
                return;
            case 3:
                mo49763d(84);
                return;
            case 4:
                mo49763d(85);
                return;
            case 5:
                mo49763d(86);
                return;
            case 6:
                mo49763d(87);
                return;
            case 7:
                mo49763d(88);
                return;
            case 8:
                mo49763d(89);
                return;
            case 9:
                mo49763d(90);
                return;
            case 10:
                mo49763d(91);
                return;
            case 11:
                mo49763d(92);
                return;
            case 12:
                mo49763d(93);
                return;
            case 13:
                mo49763d(94);
                return;
            case 14:
                mo49763d(95);
                return;
            case 15:
                mo49763d(96);
                return;
            case 16:
                mo49763d(97);
                return;
            case 17:
                mo49763d(98);
                return;
            case 18:
                mo49763d(100);
                return;
            case 19:
                mo49763d(101);
                return;
            case 20:
                mo49763d(102);
                return;
            case 21:
                mo49763d(ErrorInfo.TYPE_SDU_MEMORY_FULL);
                return;
            case 22:
                mo49763d(106);
                return;
            case 23:
                mo49763d(108);
                return;
            case 24:
                mo49763d(109);
                return;
            case 25:
                mo49763d(110);
                return;
            case 26:
                mo49763d(111);
                return;
            case 27:
                mo49763d(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                return;
            case 28:
                mo49763d(113);
                return;
            case 29:
                mo49763d(114);
                return;
            case 30:
                mo49763d(115);
                return;
            case 31:
                mo49763d(119);
                return;
            case ' ':
                mo49763d(124);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo49749a(String str, int i, int i2) {
        bxvd g = mo49765g(30);
        bxvd da = bpbb.f135578e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbb bpbb = (bpbb) da.f164949b;
        str.getClass();
        int i3 = bpbb.f135580a | 1;
        bpbb.f135580a = i3;
        bpbb.f135581b = str;
        bpbb.f135582c = i - 1;
        int i4 = i3 | 2;
        bpbb.f135580a = i4;
        bpbb.f135583d = i2 - 1;
        bpbb.f135580a = i4 | 4;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        bpbb bpbb2 = (bpbb) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        bpbb2.getClass();
        bpbx.f135670p = bpbb2;
        bpbx.f135655a |= 8192;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final void mo49750a(String str, int i, int i2, int i3, String str2) {
        bxvd g = mo49765g(37);
        bxvd da = boxn.f135262g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxn boxn = (boxn) da.f164949b;
        str.getClass();
        boxn.f135264a |= 1;
        boxn.f135265b = str;
        boxn.m111642a(boxn);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxn boxn2 = (boxn) da.f164949b;
        int i4 = i - 1;
        if (i != 0) {
            boxn2.f135268e = i4;
            boxn2.f135264a |= 16;
            int f = m75297f(i2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boxn boxn3 = (boxn) da.f164949b;
            boxn3.f135269f = f - 1;
            int i5 = boxn3.f135264a | 32;
            boxn3.f135264a = i5;
            boxn3.f135266c = i3 - 1;
            int i6 = i5 | 4;
            boxn3.f135264a = i6;
            str2.getClass();
            boxn3.f135264a = i6 | 8;
            boxn3.f135267d = str2;
            if (g.f164950c) {
                g.mo74035c();
                g.f164950c = false;
            }
            bpbx bpbx = (bpbx) g.f164949b;
            boxn boxn4 = (boxn) da.mo74062i();
            bpbx bpbx2 = bpbx.f135635S;
            boxn4.getClass();
            bpbx.f135671q = boxn4;
            bpbx.f135655a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            mo49741a((bpbx) g.mo74062i());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo49751a(String str, String str2) {
        bxvd g = mo49765g(139);
        bxvd da = boyt.f135341h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boyt boyt = (boyt) da.f164949b;
        boyt.f135344b = 7;
        int i = boyt.f135343a | 1;
        boyt.f135343a = i;
        boyt.f135345c = 6;
        int i2 = i | 2;
        boyt.f135343a = i2;
        boyt.f135348f = 1;
        int i3 = i2 | 64;
        boyt.f135343a = i3;
        str.getClass();
        int i4 = i3 | 32;
        boyt.f135343a = i4;
        boyt.f135347e = str;
        str2.getClass();
        int i5 = i4 | 16;
        boyt.f135343a = i5;
        boyt.f135346d = str2;
        boyt.f135349g = 1;
        boyt.f135343a = i5 | 128;
        if (g.f164950c) {
            g.mo74035c();
            g.f164950c = false;
        }
        bpbx bpbx = (bpbx) g.f164949b;
        boyt boyt2 = (boyt) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boyt2.getClass();
        bpbx.f135645I = boyt2;
        bpbx.f135656b |= 32;
        mo49741a((bpbx) g.mo74062i());
    }

    /* renamed from: a */
    public final void mo49752a(String str, boolean z, String str2) {
        bxvd b = mo49753b(35, null);
        bxvd da = boxh.f135250d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boxh boxh = (boxh) da.f164949b;
        boxh.f135252a |= 1;
        boxh.f135253b = z;
        if (b.f164950c) {
            b.mo74035c();
            b.f164950c = false;
        }
        bpbx bpbx = (bpbx) b.f164949b;
        boxh boxh2 = (boxh) da.mo74062i();
        bpbx bpbx2 = bpbx.f135635S;
        boxh2.getClass();
        bpbx.f135660f = boxh2;
        bpbx.f135655a |= 8;
        if (str2 != null) {
            bxvd da2 = boxo.f135271c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            boxo boxo = (boxo) da2.f164949b;
            str2.getClass();
            boxo.f135273a |= 1;
            boxo.f135274b = str2;
            if (b.f164950c) {
                b.mo74035c();
                b.f164950c = false;
            }
            bpbx bpbx3 = (bpbx) b.f164949b;
            boxo boxo2 = (boxo) da2.mo74062i();
            boxo2.getClass();
            bpbx3.f135676v = boxo2;
            bpbx3.f135655a |= 4194304;
        }
        mo49742a((bpbx) b.mo74062i(), str);
    }
}
