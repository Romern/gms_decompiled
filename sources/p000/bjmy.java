package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.wallet.bender3.framework.client.GoogleAccountStateSnapshot;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import com.google.android.wallet.bender3.framework.client.WidgetResult;
import java.util.List;

/* renamed from: bjmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmy extends bjhy implements bjhe, bjhd {

    /* renamed from: p */
    private bwqt f122991p;

    /* renamed from: q */
    private boolean f122992q;

    public bjmy(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: b */
    private final boolean m103997b(List list) {
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            z = this.f122639a.f122693b.mo65130a(((Long) list.get(i)).longValue()).mo65125k() && z;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo65221a() {
        mo65105a(bwqw.f160728c, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65115c() {
        bxvj bxvj = bwqw.f160728c;
        if (this.f122644f.mo15645e(bxvj.mo73900a()) && ((bjhg) this.f122644f.mo15646f(bxvj.mo73900a())).mo65223a(1)) {
            ((bjhm) this.f122639a.f122692a.f122731h).f122742h.add(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: cC */
    public final void mo65201cC() {
        this.f122639a.f122692a.f122731h.mo65225a(this);
        ((bjgw) this.f122639a.f122696e).f122703f.remove(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo65119d() {
        this.f122639a.f122692a.f122731h.mo65225a(this);
        this.f122992q = false;
    }

    /* renamed from: f */
    public final void mo65204f() {
        mo65105a(bwqw.f160728c, 3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("hasTriggeredInitialResultingActions", this.f122992q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmz bjmz = (bjmz) ((bjhy) this).f122754m;
        return bjmz == null ? new bjmz() : bjmz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: cG */
    public final void mo65086cG() {
        super.mo65257t();
        if (!this.f122992q) {
            bxwc bxwc = this.f122991p.f160724a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                mo65103a((bwoq) bxwc.get(i));
            }
            this.f122992q = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        mo65097a(new bjna(this.f122639a));
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122992q = bundle.getBoolean("hasTriggeredInitialResultingActions");
        }
        ((bjgw) this.f122639a.f122696e).f122703f.add(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwqt.f160722c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122991p = (bwqt) b;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0385 A[RETURN] */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        bwrk bwrk;
        int size;
        C1230nw nwVar;
        bxvd da;
        bxvd da2;
        int b;
        int i;
        bwxl bwxl;
        bwmj bwmj;
        bwmj bwmj2;
        boolean contains;
        int i2;
        boolean z;
        bwrc bwrc;
        byte[] bArr;
        byte[] bArr2;
        bxtx bxtx;
        bxtx bxtx2;
        bxtx bxtx3;
        bwrg bwrg;
        bwqz bwqz;
        bxtx bxtx4;
        bwqy bwqy;
        bwrm bwrm;
        bwoq bwoq2 = bwoq;
        bxvj bxvj = bwrf.f160755f;
        bwoq2.mo74135a(bxvj);
        if (bwoq2.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwrf.f160755f;
            bwoq2.mo74135a(bxvj2);
            Object b2 = bwoq2.f164952m.mo73913b(bxvj2.f164958d);
            if (b2 == null) {
                b2 = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b2);
            }
            bwrf bwrf = (bwrf) b2;
            int a = bwre.m122231a(bwrf.f160760d);
            if (a == 0) {
                a = 1;
            }
            bxtx bxtx5 = null;
            int i3 = 3;
            switch (a - 1) {
                case 0:
                    break;
                case 1:
                    if (bwrf.f160758b == 2) {
                        bwrk = (bwrk) bwrf.f160759c;
                    } else {
                        bwrk = bwrk.f160769f;
                    }
                    int a2 = bwrj.m122236a(bwrk.f160774d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i4 = a2 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                z = m103997b(bwrk.f160775e);
                                if (!z) {
                                    return;
                                }
                            }
                        }
                        mo65253p();
                        if ((bwrk.f160771a & 2) != 0) {
                            bxtx5 = bwrk.f160773c;
                        }
                        ((bjmz) ((bjhy) this).f122754m).f122993d = bxtx5;
                        size = bwrk.f160772b.size();
                        if (size != 0) {
                            bjge bjge = this.f122639a.f122693b;
                            int b3 = bjge.f122651a.mo15537b();
                            nwVar = new C1230nw(b3);
                            for (int i5 = 0; i5 < b3; i5++) {
                                bwog bwog = ((bwny) bjge.f122651a.mo15538b(i5)).f160417b;
                                if (bwog == null) {
                                    bwog = bwog.f160437f;
                                }
                                long j = bwog.f160440b;
                                bjgd bjgd = (bjgd) bjge.mo65291d(j);
                                if (bjgd != null) {
                                    bwog = (bwog) bjgd.mo65111b(true).mo74062i();
                                }
                                nwVar.mo15540b(j, bwog);
                            }
                        } else {
                            nwVar = new C1230nw(size);
                            mo65108a(nwVar);
                            bxvw bxvw = bwrk.f160772b;
                            int size2 = bxvw.size();
                            for (int i6 = 0; i6 < size2; i6++) {
                                this.f122639a.f122693b.mo65130a(((Long) bxvw.get(i6)).longValue()).mo65108a(nwVar);
                            }
                        }
                        mo65105a(bwqw.f160728c, 2);
                        bjgu bjgu = this.f122639a.f122696e;
                        da = bwzg.f161599e.mo74144da();
                        da2 = bwmg.f160254n.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bwmg bwmg = (bwmg) da2.f164949b;
                        bwmg.f160261f = 2;
                        bwmg.f160256a |= 32;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwzg bwzg = (bwzg) da.f164949b;
                        bwmg bwmg2 = (bwmg) da2.mo74062i();
                        bwmg2.getClass();
                        bwzg.f161602b = bwmg2;
                        bwzg.f161601a |= 1;
                        b = nwVar.mo15537b();
                        for (i = 0; i < b; i++) {
                            bwog bwog2 = (bwog) nwVar.mo15538b(i);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwzg bwzg2 = (bwzg) da.f164949b;
                            bwog2.getClass();
                            if (!bwzg2.f161603c.mo73666a()) {
                                bwzg2.f161603c = bxvk.m124021a(bwzg2.f161603c);
                            }
                            bwzg2.f161603c.add(bwog2);
                        }
                        bjgw bjgw = (bjgw) bjgu;
                        bwxl = bjgw.f122699b.f161564b;
                        if (bwxl == null) {
                            bwxl = bwxl.f161383i;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwzg bwzg3 = (bwzg) da.f164949b;
                        bwxl.getClass();
                        bwzg3.f161604d = bwxl;
                        bwzg3.f161601a |= 2;
                        bjhm bjhm = (bjhm) bjgw.f122698a.f122692a.f122731h;
                        bjfh bjfh = bjhm.f122740f;
                        WidgetConfig widgetConfig = bjhm.f122735a.f122724a;
                        byte[] k = ((bwzg) da.mo74062i()).mo73642k();
                        bwmj = bjhm.f122738d.f160272a;
                        if (bwmj != null) {
                            bwmj2 = bwmj.f160280a;
                        } else {
                            bwmj2 = bwmj;
                        }
                        bwmi bwmi = bjhm.f122739e;
                        long j2 = bjhm.f122735a.f122725b;
                        contains = bjhm.f122743i.contains(bpsg.EVENT_TYPE_API_REQUEST_START);
                        GoogleAccountStateSnapshot googleAccountStateSnapshot = bjhm.f122741g;
                        String d = bjje.m103647d(widgetConfig.f151762c);
                        if (contains) {
                            i2 = 1;
                        } else {
                            i2 = 3;
                        }
                        bjfh.mo65084a(100, bjjf.m103648a(1, widgetConfig, d, k, bwmj2, bwmi, j2, i2, googleAccountStateSnapshot));
                        return;
                    }
                    if (bwrk.f160772b.size() <= 0) {
                        bjge bjge2 = this.f122639a.f122693b;
                        int b4 = bjge2.f122651a.mo15537b();
                        boolean z2 = true;
                        for (int i7 = 0; i7 < b4; i7++) {
                            bwog bwog3 = ((bwny) bjge2.f122651a.mo15538b(i7)).f160417b;
                            if (bwog3 == null) {
                                bwog3 = bwog.f160437f;
                            }
                            z2 = bjge2.mo65130a(bwog3.f160440b).mo65125k() && z2;
                        }
                        z = z2;
                    } else {
                        z = m103997b(bwrk.f160772b);
                    }
                    if (!z) {
                    }
                    mo65253p();
                    if ((bwrk.f160771a & 2) != 0) {
                    }
                    ((bjmz) ((bjhy) this).f122754m).f122993d = bxtx5;
                    size = bwrk.f160772b.size();
                    if (size != 0) {
                    }
                    mo65105a(bwqw.f160728c, 2);
                    bjgu bjgu2 = this.f122639a.f122696e;
                    da = bwzg.f161599e.mo74144da();
                    da2 = bwmg.f160254n.mo74144da();
                    if (da2.f164950c) {
                    }
                    bwmg bwmg3 = (bwmg) da2.f164949b;
                    bwmg3.f160261f = 2;
                    bwmg3.f160256a |= 32;
                    if (da.f164950c) {
                    }
                    bwzg bwzg4 = (bwzg) da.f164949b;
                    bwmg bwmg22 = (bwmg) da2.mo74062i();
                    bwmg22.getClass();
                    bwzg4.f161602b = bwmg22;
                    bwzg4.f161601a |= 1;
                    b = nwVar.mo15537b();
                    while (i < b) {
                    }
                    bjgw bjgw2 = (bjgw) bjgu2;
                    bwxl = bjgw2.f122699b.f161564b;
                    if (bwxl == null) {
                    }
                    if (da.f164950c) {
                    }
                    bwzg bwzg32 = (bwzg) da.f164949b;
                    bwxl.getClass();
                    bwzg32.f161604d = bwxl;
                    bwzg32.f161601a |= 2;
                    bjhm bjhm2 = (bjhm) bjgw2.f122698a.f122692a.f122731h;
                    bjfh bjfh2 = bjhm2.f122740f;
                    WidgetConfig widgetConfig2 = bjhm2.f122735a.f122724a;
                    byte[] k2 = ((bwzg) da.mo74062i()).mo73642k();
                    bwmj = bjhm2.f122738d.f160272a;
                    if (bwmj != null) {
                    }
                    bwmi bwmi2 = bjhm2.f122739e;
                    long j22 = bjhm2.f122735a.f122725b;
                    contains = bjhm2.f122743i.contains(bpsg.EVENT_TYPE_API_REQUEST_START);
                    GoogleAccountStateSnapshot googleAccountStateSnapshot2 = bjhm2.f122741g;
                    String d2 = bjje.m103647d(widgetConfig2.f151762c);
                    if (contains) {
                    }
                    bjfh2.mo65084a(100, bjjf.m103648a(1, widgetConfig2, d2, k2, bwmj2, bwmi2, j22, i2, googleAccountStateSnapshot2));
                    return;
                case 2:
                    bjhh bjhh = this.f122639a.f122692a.f122731h;
                    if (bwrf.f160758b == 3) {
                        bwrc = (bwrc) bwrf.f160759c;
                    } else {
                        bwrc = bwrc.f160746e;
                    }
                    int a3 = bwrb.m122228a(bwrc.f160749b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i8 = a3 - 1;
                    if (i8 == 1) {
                        WidgetResult widgetResult = new WidgetResult();
                        bwmd bwmd = bwrc.f160750c;
                        if (bwmd == null) {
                            bwmd = bwmd.f160244c;
                        }
                        int i9 = bwmd.f160246a;
                        int i10 = i9 != 0 ? i9 != 1 ? i9 != 2 ? 0 : 2 : 1 : 3;
                        int i11 = i10 - 1;
                        if (i10 != 0) {
                            if (i11 == 0) {
                                if (i9 == 1) {
                                    bxtx2 = (bxtx) bwmd.f160247b;
                                } else {
                                    bxtx2 = bxtx.f164797b;
                                }
                                bArr = bxtx2.mo73780k();
                            } else if (i11 != 1) {
                                bArr = new byte[0];
                            } else {
                                if (i9 == 2) {
                                    bxtx3 = (bxtx) bwmd.f160247b;
                                } else {
                                    bxtx3 = bxtx.f164797b;
                                }
                                bArr = bxtx3.mo73780k();
                            }
                            widgetResult.f151770a = bArr;
                            bwmc bwmc = bwrc.f160751d;
                            if (bwmc == null) {
                                bwmc = bwmc.f160239c;
                            }
                            int i12 = bwmc.f160241a;
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    i3 = i12 != 3 ? 0 : 2;
                                } else {
                                    i3 = 1;
                                }
                            }
                            int i13 = i3 - 1;
                            if (i3 != 0) {
                                if (i13 != 0) {
                                    bArr2 = new byte[0];
                                } else {
                                    if (i12 == 1) {
                                        bxtx = (bxtx) bwmc.f160242b;
                                    } else {
                                        bxtx = bxtx.f164797b;
                                    }
                                    bArr2 = bxtx.mo73780k();
                                }
                                widgetResult.f151771b = bArr2;
                                bjhm bjhm3 = (bjhm) bjhh;
                                ((awef) bjhm3.f122736b).f94205f.mo52009a(widgetResult);
                                bjhm3.mo65235b(2);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    } else if (i8 != 2) {
                        bjhm bjhm4 = (bjhm) bjhh;
                        awef awef = (awef) bjhm4.f122736b;
                        awef.f94201b.setResult(1);
                        awef.f94201b.finish();
                        bjhm4.mo65235b(5);
                        return;
                    } else {
                        ((bjhm) bjhh).mo65237d();
                        return;
                    }
                case 3:
                    if (bwrf.f160758b == 4) {
                        bwrg = (bwrg) bwrf.f160759c;
                    } else {
                        bwrg = bwrg.f160762b;
                    }
                    boae boae = bwrg.f160764a;
                    if (boae == null) {
                        boae = boae.f132446b;
                    }
                    this.f122639a.f122692a.f122731h.mo65226a(boaf.m110964a(boae).f132445a);
                    return;
                case 4:
                    mo65114b("Unsupported infrastructure resulting action type");
                    mo65114b("Unsupported infrastructure resulting action type reinitialize");
                    break;
                case 5:
                    bjhh bjhh2 = this.f122639a.f122692a.f122731h;
                    if (bwrf.f160758b == 6) {
                        bwqz = (bwqz) bwrf.f160759c;
                    } else {
                        bwqz = bwqz.f160741c;
                    }
                    int i14 = bwqz.f160743a;
                    if (i14 != 1) {
                        bjhl bjhl = ((bjhm) bjhh2).f122736b;
                        if (i14 == 2) {
                            bxtx4 = (bxtx) bwqz.f160744b;
                        } else {
                            bxtx4 = bxtx.f164797b;
                        }
                        byte[] k3 = bxtx4.mo73780k();
                        Intent intent = new Intent();
                        intent.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", k3);
                        ((awef) bjhl).mo52012a(intent);
                        return;
                    }
                    bjhl bjhl2 = ((bjhm) bjhh2).f122736b;
                    byte[] k4 = ((bxtx) bwqz.f160744b).mo73780k();
                    Intent intent2 = new Intent();
                    intent2.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", k4);
                    ((awef) bjhl2).mo52012a(intent2);
                    return;
                case 6:
                    bjgu bjgu3 = this.f122639a.f122696e;
                    if (bwrf.f160758b == 7) {
                        bwqy = (bwqy) bwrf.f160759c;
                    } else {
                        bwqy = bwqy.f160737b;
                    }
                    bjho.m103508a(((bjgw) bjgu3).f122698a.f122692a.f122732i, bwqy.f160739a);
                    return;
                case 7:
                    if (bwrf.f160758b == 8) {
                        bwrm = (bwrm) bwrf.f160759c;
                    } else {
                        bwrm = bwrm.f160778b;
                    }
                    bwpd bwpd = bwrm.f160780a;
                    if (bwpd == null) {
                        bwpd = bwpd.f160521d;
                    }
                    mo65104a(bwpd);
                    return;
                default:
                    mo65114b("Unsupported infrastructure resulting action type reinitialize");
                    break;
            }
            mo65114b("Unknown infrastructure resulting action type");
            return;
        }
        super.mo65103a(bwoq);
    }
}
