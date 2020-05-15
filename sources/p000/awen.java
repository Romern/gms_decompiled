package p000;

import android.os.Bundle;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.wallet.analytics.events.OrchestrationApiEvent;
import com.google.android.gms.wallet.analytics.events.ReauthApiEvent;
import com.google.android.gms.wallet.buyflow.BuyFlowResult;
import com.google.android.gms.wallet.p088ui.common.PageDetails;
import com.google.android.gms.wallet.service.orchestration.FetchPaySeCardsResponse;
import com.google.android.gms.wallet.service.orchestration.SetUpBiometricAuthenticationKeysServiceResponse;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: awen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awen extends awpc {

    /* renamed from: a */
    final /* synthetic */ awer f94219a;

    public awen(awer awer) {
        this.f94219a = awer;
    }

    /* renamed from: a */
    public final void mo51894a() {
        Activity activity = this.f94219a.getActivity();
        awer awer = this.f94219a;
        byte[] bArr = awer.f94220a;
        OrchestrationApiEvent.m93817a(activity, 4, null, null, awer.f95359C);
        this.f94219a.mo52898h(21);
        awer awer2 = this.f94219a;
        awer2.f95398ak.f110468q = null;
        awer2.mo52874ag();
    }

    /* renamed from: b */
    public final void mo51897b() {
        Activity activity = this.f94219a.getActivity();
        awer awer = this.f94219a;
        byte[] bArr = awer.f94220a;
        OrchestrationApiEvent.m93817a(activity, 6, null, null, awer.f95359C);
        this.f94219a.mo52898h(20);
        awer awer2 = this.f94219a;
        awer2.f95398ak.f110468q = null;
        awer2.mo52897g(-1);
    }

    /* renamed from: c */
    public final void mo51898c() {
        Activity activity = this.f94219a.getActivity();
        awer awer = this.f94219a;
        byte[] bArr = awer.f94220a;
        OrchestrationApiEvent.m93817a(activity, 5, null, null, awer.f95359C);
        this.f94219a.mo52898h(22);
        awer awer2 = this.f94219a;
        awer2.f95398ak.f110468q = null;
        awer2.mo52897g(-1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0090  */
    /* renamed from: a */
    public final void mo52020a(blxx blxx, byaa byaa, int i) {
        blym blym;
        bmaq bmaq;
        bmav bmav;
        blym blym2;
        bwit bwit;
        bmag bmag;
        bmar bmar;
        bwgz a;
        bwgz bwgz;
        blxx blxx2 = blxx;
        awer awer = this.f94219a;
        awer.f94233f = byaa;
        bmar bmar2 = null;
        if ((blxx2.f128161a & 16) != 0) {
            blym = blxx2.f128166f;
            if (blym == null) {
                blym = blym.f128215R;
            }
        } else {
            blym = null;
        }
        awer.f95397aj = blym;
        awer awer2 = this.f94219a;
        if ((blxx2.f128161a & 2) != 0) {
            bmaq bmaq2 = blxx2.f128163c;
            bmaq = bmaq2 != null ? bmaq2 : bmaq.f128479l;
        } else {
            bmaq = null;
        }
        if ((blxx2.f128161a & 1) != 0) {
            bmav bmav2 = blxx2.f128162b;
            bmav = bmav2 != null ? bmav2 : bmav.f128500h;
        } else {
            bmav = null;
        }
        if ((blxx2.f128161a & 16) != 0) {
            blym blym3 = blxx2.f128166f;
            blym2 = blym3 != null ? blym3 : blym.f128215R;
        } else {
            blym2 = null;
        }
        if ((blxx2.f128161a & 64) != 0) {
            bwit bwit2 = blxx2.f128169i;
            bwit = bwit2 != null ? bwit2 : bwit.f159683d;
        } else {
            bwit = null;
        }
        bxwc bxwc = blxx2.f128167g;
        if ((blxx2.f128161a & 8) != 0) {
            bmag bmag2 = blxx2.f128165e;
            bmag = bmag2 != null ? bmag2 : bmag.f128442c;
        } else {
            bmag = null;
        }
        if ((blxx2.f128161a & 4) != 0) {
            bmar bmar3 = blxx2.f128164d;
            if (bmar3 != null) {
                bmar = bmar3;
                a = bwgz.m121952a(blxx2.f128168h);
                if (a == null) {
                    bwgz = a;
                } else {
                    bwgz = bwgz.UNKNOWN_FLOW_INSTRUCTION;
                }
                awer2.mo52051a(bmaq, bmav, blym2, null, null, bwit, bxwc, bmag, bmar, bwgz, BuyFlowResult.f110016a, true, i, "onInitializeResponse");
                awer awer3 = this.f94219a;
                byte[] bArr = awer.f94220a;
                awer3.mo52063c(false);
            }
            bmar2 = bmar.f128490c;
        }
        bmar = bmar2;
        a = bwgz.m121952a(blxx2.f128168h);
        if (a == null) {
        }
        awer2.mo52051a(bmaq, bmav, blym2, null, null, bwit, bxwc, bmag, bmar, bwgz, BuyFlowResult.f110016a, true, i, "onInitializeResponse");
        awer awer32 = this.f94219a;
        byte[] bArr2 = awer.f94220a;
        awer32.mo52063c(false);
    }

    /* renamed from: a */
    public final void mo52021a(blyp blyp, byaa byaa) {
        bwgz bwgz;
        bmaq bmaq;
        bmav bmav;
        blym blym;
        bmar bmar;
        blyp blyp2 = blyp;
        this.f94219a.f94233f = byaa;
        if ((blyp2.f128285a & 1) != 0) {
            bwgz = bwgz.HANDLE_UI_ERROR;
        } else {
            bwgz = bwgz.CONTINUE_FLOW_WITH_NEW_PAGE;
        }
        awer awer = this.f94219a;
        bmaq bmaq2 = blyp2.f128287c;
        if (bmaq2 != null) {
            bmaq = bmaq2;
        } else {
            bmaq = bmaq.f128479l;
        }
        if ((blyp2.f128285a & 1) != 0) {
            bmav = blyp2.f128286b;
            if (bmav == null) {
                bmav = bmav.f128500h;
            }
        } else {
            bmav = null;
        }
        if ((blyp2.f128285a & 8) != 0) {
            blym = blyp2.f128289e;
            if (blym == null) {
                blym = blym.f128215R;
            }
        } else {
            blym = null;
        }
        bngx e = bngx.m109376e();
        bmag bmag = this.f94219a.f95398ak.f110456e;
        if ((blyp2.f128285a & 4) != 0) {
            bmar bmar2 = blyp2.f128288d;
            if (bmar2 == null) {
                bmar = bmar.f128490c;
            } else {
                bmar = bmar2;
            }
        } else {
            bmar = null;
        }
        awer.mo52051a(bmaq, bmav, blym, null, null, null, e, bmag, bmar, bwgz, BuyFlowResult.f110016a, false, 1, "onRefreshResponse");
    }

    /* renamed from: a */
    public final void mo52022a(blyr blyr, byaa byaa) {
        if (chfq.f188568a.mo6606a().mo85200a()) {
            awer awer = this.f94219a;
            awgc a = awgc.m79888a(awer, "handleSubmitBuyflowResponse");
            byte[] bArr = awer.f94220a;
            awer.f94247t = a;
            Bundle bundle = this.f94219a.f94247t.f94286a;
            bjvp.m104736a(bundle, "submitBuyflowResponse", blyr);
            bjvp.m104736a(bundle, "buyflowStateToken", byaa);
            this.f94219a.f94247t.run();
            return;
        }
        awer awer2 = this.f94219a;
        byte[] bArr2 = awer.f94220a;
        awer2.mo52049a(blyr, byaa);
    }

    /* renamed from: a */
    public final void mo52023a(FetchPaySeCardsResponse fetchPaySeCardsResponse) {
        bmgn bmgn;
        SecureElementStoredValue[] secureElementStoredValueArr = fetchPaySeCardsResponse.f110385a;
        blym blym = (blym) this.f94219a.f95398ak.f110460i;
        if ((blym.f128235a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            bmgn = blym.f128252r;
            if (bmgn == null) {
                bmgn = bmgn.f129273o;
            }
        } else {
            bmgn = null;
        }
        if (secureElementStoredValueArr != null && bmgn != null) {
            C1225nr nrVar = new C1225nr(10);
            PageDetails pageDetails = this.f94219a.f95398ak;
            blym blym2 = (blym) pageDetails.f110460i;
            bxvd bxvd = (bxvd) blym2.mo74142c(5);
            bxvd.mo73625a((bxvk) blym2);
            blyj blyj = (blyj) bxvd;
            bmgn a = awfo.m79855a(bmgn, secureElementStoredValueArr, nrVar);
            if (blyj.f164950c) {
                blyj.mo74035c();
                blyj.f164950c = false;
            }
            blym blym3 = (blym) blyj.f164949b;
            bxvu bxvu = blym.f128214M;
            a.getClass();
            blym3.f128252r = a;
            blym3.f128235a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            pageDetails.f110460i = blyj.mo74062i();
            axbr axbr = (axbr) this.f94219a.mo52884b(13, axbr.class);
            if (axbr != null) {
                bmgn bmgn2 = ((blym) this.f94219a.f95398ak.f110460i).f128252r;
                if (bmgn2 == null) {
                    bmgn2 = bmgn.f129273o;
                }
                if (axbr.f95717p) {
                    int size = bmgn2.f129278d.size();
                    for (int i = 0; i < size; i++) {
                        bmgk bmgk = (bmgk) bmgn2.f129278d.get(i);
                        if (nrVar.contains(Long.valueOf(bmgk.f129248b))) {
                            View b = axbr.f95702a.mo72098b(bmgk.f129248b);
                            if (b instanceof axbm) {
                                axbm axbm = (axbm) b;
                                int a2 = bmgj.m108003a(bmgk.f129259m);
                                if (a2 != 0 && a2 == 6) {
                                    axbr.f95702a.removeView(axbm);
                                    axbr.f95715n.mo15539b(bmgk.f129248b);
                                } else {
                                    axbr.f95715n.mo15540b(bmgk.f129248b, bmgk);
                                    axbm.mo52987a(bmgk);
                                }
                            }
                        }
                    }
                    int size2 = bmgn2.f129279e.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bmgd bmgd = (bmgd) bmgn2.f129279e.get(i2);
                        if (nrVar.contains(Long.valueOf(bmgd.f129216b))) {
                            View b2 = axbr.f95702a.mo72098b(bmgd.f129216b);
                            if (b2 instanceof axbj) {
                                axbj axbj = (axbj) b2;
                                int a3 = bmgc.m107996a(bmgd.f129223i);
                                if (a3 != 0 && a3 == 2) {
                                    axbr.f95702a.removeView(axbj);
                                    axbr.f95715n.mo15539b(bmgd.f129216b);
                                } else {
                                    axbr.f95715n.mo15540b(bmgd.f129216b, bmgd);
                                    axbj.mo52983a(bmgd);
                                }
                            }
                        }
                    }
                    axbr.f95702a.mo72099h();
                    axbr.f124069w = bmgn2;
                    Bundle arguments = axbr.getArguments();
                    if (arguments != null) {
                        bjvp.m104736a(arguments, "formProtoLite", axbr.f124069w);
                    }
                    axbr.f95717p = false;
                    if (axbr.f95718q) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", true);
                        axbr.mo51905a(18, bundle);
                        axbr.f95718q = false;
                        axbr.mo52723B();
                        axbr.f95702a.f152205a.mo66025a(1);
                        axbr.mo51905a(9, Bundle.EMPTY);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo52024a(SetUpBiometricAuthenticationKeysServiceResponse setUpBiometricAuthenticationKeysServiceResponse) {
        awyq I = this.f94219a.mo52037I();
        byte[] bArr = setUpBiometricAuthenticationKeysServiceResponse.f110386a.f110167a;
        try {
            bmcc bmcc = I.f95323u;
            bxvd bxvd = (bxvd) bmcc.mo74142c(5);
            bxvd.mo73625a((bxvk) bmcc);
            bmcv bmcv = (bmcv) bxvk.m124016a(bmcv.f128750g, bArr, bxus.m123744c());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bmcc bmcc2 = (bmcc) bxvd.f164949b;
            bmcc bmcc3 = bmcc.f128656e;
            bmcv.getClass();
            bmcc2.f128661d = bmcv;
            bmcc2.f128658a |= 128;
            I.f95323u = (bmcc) bxvd.mo74062i();
            I.mo52788q();
        } catch (bxwf e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void mo52025a(ReauthProofTokenResponse reauthProofTokenResponse) {
        awer awer = this.f94219a;
        ReauthApiEvent.m93841a(awer.getActivity(), ReauthApiEvent.m93842b(reauthProofTokenResponse.f110398b), reauthProofTokenResponse.f110399c, awer.f94241n, awer.f95359C);
        int a = ReauthApiEvent.m93840a(reauthProofTokenResponse.f110398b);
        awer.mo52848a(a == 0 ? 2 : 5, a, null, null, 1);
        awer.f94241n++;
        bkjt d = awer.mo52833d((List) awer.f95385aC);
        if (d != null) {
            String str = reauthProofTokenResponse.f110397a;
            int i = reauthProofTokenResponse.f110398b;
            d.f124460m = true;
            d.f124461n = str;
            d.f124462o = i;
            d.f124451d.mo65799cM();
            if (d.mo52804a((List) null)) {
                awer.mo52054a(awer.f94240m, (List) null, (List) null);
            } else {
                awer.f95363G.mo66055n();
                awer.mo52808n(true);
            }
        }
        awer.f94240m = null;
    }
}
