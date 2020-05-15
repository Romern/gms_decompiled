package p000;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.ocr.RecognitionScreen;

/* renamed from: bjmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjmm extends bjhy {

    /* renamed from: p */
    boolean f122972p;

    /* renamed from: q */
    private bwqc f122973q;

    public bjmm(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: a */
    public final void mo52014a(int i, bjfd bjfd) {
        if (i == 1002) {
            this.f122972p = false;
            int b = bjfv.m103325b(bjfd);
            if (b == -1) {
                bjmn bjmn = (bjmn) ((bjhy) this).f122754m;
                CreditCardOcrResult a = CreditCardOcrResult.m67675a(bjfv.m103323a(bjfd));
                bxvd da = bwqd.f160640f.mo74144da();
                if (a != null) {
                    int i2 = a.f81243p;
                    int i3 = i2 != 1 ? i2 != 2 ? 2 : 3 : 2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwqd bwqd = (bwqd) da.f164949b;
                    bwqd.f160644b = i3 - 1;
                    bwqd.f160643a |= 1;
                    if (!TextUtils.isEmpty(a.f81232e)) {
                        String trim = a.f81232e.trim();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwqd bwqd2 = (bwqd) da.f164949b;
                        trim.getClass();
                        bwqd2.f160643a |= 8;
                        bwqd2.f160647e = trim;
                    }
                    if (!TextUtils.isEmpty(a.f81228a)) {
                        String trim2 = a.f81228a.trim();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwqd bwqd3 = (bwqd) da.f164949b;
                        trim2.getClass();
                        bwqd3.f160643a |= 2;
                        bwqd3.f160645c = trim2;
                    }
                    if (a.mo44703a()) {
                        bxvd da2 = blxc.f128037e.mo74144da();
                        int i4 = a.f81230c;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        blxc blxc = (blxc) da2.f164949b;
                        int i5 = 1 | blxc.f128039a;
                        blxc.f128039a = i5;
                        blxc.f128040b = i4;
                        int i6 = a.f81229b;
                        blxc.f128039a = i5 | 2;
                        blxc.f128041c = i6;
                        blxc blxc2 = (blxc) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwqd bwqd4 = (bwqd) da.f164949b;
                        blxc2.getClass();
                        bwqd4.f160646d = blxc2;
                        bwqd4.f160643a |= 4;
                    }
                }
                bjmn.f122974d = (bwqd) da.mo74062i();
                bjmn.mo65244a((bjgf) null);
                mo65255r();
            } else if (b != 10007) {
                mo65256s();
            } else {
                mo65254q();
            }
        } else {
            super.mo52014a(i, bjfd);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjmn bjmn = (bjmn) ((bjhy) this).f122754m;
        return bjmn == null ? new bjmn() : bjmn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo65258u() {
        String str;
        if (!this.f122972p) {
            akoz akoz = new akoz(this.f122639a.f122692a.f122732i);
            bxwc bxwc = this.f122973q.f160639a;
            int size = bxwc.size();
            RecognitionScreen[] recognitionScreenArr = new RecognitionScreen[size];
            int i = 0;
            while (true) {
                int i2 = 1;
                if (i >= size) {
                    break;
                }
                bwpz bwpz = (bwpz) bxwc.get(i);
                akpk a = RecognitionScreen.m67680a();
                if ((bwpz.f160628a & 2) != 0) {
                    a.mo39661d(bwpz.f160630c);
                }
                if ((bwpz.f160628a & 4) != 0) {
                    a.mo39659b(bwpz.f160631d);
                }
                bwtd bwtd = bwpz.f160632e;
                if (bwtd == null) {
                    bwtd = bwtd.f160938d;
                }
                if (bwtd.f160940a == 5) {
                    bwtd bwtd2 = bwpz.f160632e;
                    if (bwtd2 == null) {
                        bwtd2 = bwtd.f160938d;
                    }
                    if (bwtd2.f160940a == 5) {
                        str = (String) bwtd2.f160941b;
                    } else {
                        str = "";
                    }
                    a.mo39660c(str);
                }
                if ((bwpz.f160628a & 16) != 0) {
                    a.mo39662e(bwpz.f160633f);
                }
                if ((bwpz.f160628a & 32) != 0) {
                    a.mo39658a(bwpz.f160634g);
                }
                if ((bwpz.f160628a & 1) != 0) {
                    int a2 = bwqb.m122202a(bwpz.f160629b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i3 = a2 - 1;
                    if (i3 == 0) {
                        i2 = 0;
                    } else if (i3 != 1) {
                        i2 = 2;
                    }
                    a.mo39657a(i2);
                }
                recognitionScreenArr[i] = a.mo39656a();
                i++;
            }
            akoz.mo39627a(recognitionScreenArr);
            Intent a3 = akoz.mo39623a();
            if (a3 != null) {
                this.f122972p = true;
                mo65128n().mo65084a(1002, bjfv.m103324a(a3, this.f122639a.f122692a.f122724a));
                return;
            }
            mo65256s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52015a(Bundle bundle) {
        super.mo52015a(bundle);
        bundle.putBoolean("hasLaunched", this.f122972p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65099a(bwny bwny, Bundle bundle) {
        super.mo65099a(bwny, bundle);
        if (bundle != null) {
            this.f122972p = bundle.getBoolean("hasLaunched", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        super.mo65100a(bwny, bwny2);
        bxvj bxvj = bwqc.f160637c;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f122973q = (bwqc) b;
    }
}
