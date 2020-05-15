package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: atso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atso extends alic implements C0038ax {

    /* renamed from: b */
    public static final srn f90776b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: c */
    public LottieAnimationView f90777c;

    /* renamed from: d */
    String f90778d;

    /* renamed from: e */
    Account f90779e;

    /* renamed from: f */
    atsh f90780f;

    /* renamed from: g */
    atru f90781g;

    /* renamed from: h */
    rjx f90782h;

    /* renamed from: i */
    private bztz f90783i;

    /* renamed from: j */
    private GlifLayout f90784j;

    /* renamed from: k */
    private TextView f90785k;

    /* renamed from: l */
    private View f90786l;

    /* renamed from: m */
    private boolean f90787m;

    /* renamed from: a */
    public final void mo50155a(int i, Intent intent) {
        Activity activity = getActivity();
        if (activity != null) {
            if (i == -1) {
                int i2 = 0;
                if (intent != null && intent.getIntExtra("tokenization_result_code", 0) == 12) {
                    i2 = 1;
                }
                Settings.Secure.putInt(getContext().getContentResolver(), "com.google.android.gms.tapandpay.oobe.OOBE_RESULT_STATUS", i2);
            }
            activity.setResult(i);
            activity.finish();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (i != 1300) {
            if (i == 1301) {
                activity.setResult(i2, intent);
                activity.finish();
            }
        } else if (i2 == -1) {
            mo50155a(-1, intent);
        } else if (i2 == 0) {
            int intExtra = intent.getIntExtra("tokenization_result_code", 0);
            if (intExtra == 0 || intExtra == 2) {
                mo50155a(0, intent);
            } else {
                mo50155a(-1, intent);
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        bjbb bjbb = new bjbb();
        bjbb.f122457a = 2132018265;
        bjbb.f122458b = true;
        activity.setTheme(bjbb.mo64964a().mo64967a(activity.getIntent().getStringExtra("theme"), false));
        this.f90787m = activity.getIntent().getBooleanExtra("firstRun", true);
        if (this.f90781g == null) {
            atrt atrt = new atrt();
            alif alif = this.f73529a;
            cazf.m127594a(alif);
            atrt.f90740c = alif;
            asiz asiz = new asiz(activity);
            cazf.m127594a(asiz);
            atrt.f90738a = asiz;
            cazf.m127595a(atrt.f90738a, asiz.class);
            if (atrt.f90739b == null) {
                atrt.f90739b = new atsp();
            }
            cazf.m127595a(atrt.f90740c, alif.class);
            this.f90781g = new atru(atrt.f90738a, atrt.f90740c);
        }
        atru atru = this.f90781g;
        String b = atru.f90741a.mo40364b();
        cazf.m127593a(b, "Cannot return null from a non-@Nullable component method");
        this.f90778d = b;
        Account c = atru.f90741a.mo40365c();
        cazf.m127593a(c, "Cannot return null from a non-@Nullable component method");
        this.f90779e = c;
        Context b2 = alii.m60897b();
        Context b3 = alii.m60897b();
        awbt awbt = new awbt();
        awbt.mo51835a(1);
        awkh awkh = new awkh(b3, awbt.mo51834a());
        cazf.m127593a(awkh, "Cannot return null from a non-@Nullable @Provides method");
        String b4 = atru.f90741a.mo40364b();
        cazf.m127593a(b4, "Cannot return null from a non-@Nullable component method");
        String a = atru.f90741a.mo40363a();
        cazf.m127593a(a, "Cannot return null from a non-@Nullable component method");
        this.f90780f = new atsh(b2, awkh, b4, a);
        this.f90782h = aton.m76233a(asja.m74205a(atru.f90742b));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (!this.f90787m) {
            this.f90782h.mo24742e(this.f90779e).mo50371a(new atsm(this));
        } else {
            this.f90780f.mo2445a(this, this);
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.tp_oobe_splash, viewGroup, false);
        this.f90784j = glifLayout;
        glifLayout.mo71362a(C1133kh.m17836a(viewGroup.getContext(), (int) C0126R.C0127drawable.tp_gpay_logo_setting));
        this.f90785k = (TextView) this.f90784j.findViewById(C0126R.C0129id.OobeResultSubTitle);
        this.f90777c = (LottieAnimationView) this.f90784j.findViewById(C0126R.C0129id.Animation);
        this.f90786l = this.f90784j.findViewById(C0126R.C0129id.ProgressBar);
        return this.f90784j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo50156a(aucb aucb) {
        if (!aucb.mo50384b()) {
            bnsl bnsl = (bnsl) f90776b.mo68388c();
            bnsl.mo68437a(aucb.mo50387e());
            bnsl.mo68432a("atso", "a", 315, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not get all cards.");
            mo50155a(1, null);
        }
        bngx a = bngx.m109370a((Object[]) ((GetAllCardsResponse) aucb.mo50386d()).f108369a);
        bnsl bnsl2 = (bnsl) f90776b.mo68388c();
        bnsl2.mo68432a("atso", "a", 321, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68409a("There are %d cards", a.size());
        bnre i = a.listIterator();
        while (i.hasNext()) {
            CardInfo cardInfo = (CardInfo) i.next();
            bnsl bnsl3 = (bnsl) f90776b.mo68388c();
            bnsl3.mo68432a("atso", "a", 323, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68425a("Card: %s state %d token type %d", cardInfo.f108340a, Integer.valueOf(cardInfo.f108345f.f108459b), Integer.valueOf(cardInfo.f108357r));
        }
        CardInfo cardInfo2 = (CardInfo) bnjd.m109589b(bnjd.m109586b((Iterable) a, atsn.f90775a), (Object) null);
        if (cardInfo2 == null) {
            bnsl bnsl4 = (bnsl) f90776b.mo68388c();
            bnsl4.mo68432a("atso", "a", 339, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Could not get a matching card, so we'll just say skip us.");
            mo50155a(1, null);
            return;
        }
        Activity activity = getActivity();
        if (activity != null) {
            String stringExtra = activity.getIntent().getStringExtra("theme");
            asxx asxx = new asxx();
            asxx.mo49651b(false);
            asxx.mo49646a();
            asxx.mo49650b(stringExtra);
            asxx.mo49647a(cardInfo2.f108340a);
            this.f90782h.mo24717a(getActivity().getContainerActivity(), 1300, asxx);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2511a(Object obj) {
        int i;
        String str;
        bzub bzub;
        bztz bztz = (bztz) obj;
        if (this.f90783i == null) {
            this.f90783i = bztz;
        }
        if (this.f90783i != null) {
            this.f90786l.setVisibility(8);
            bztz bztz2 = this.f90783i;
            int i2 = bztz2.f171389a;
            int i3 = 2;
            if (i2 != 0) {
                i = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : 6 : 5 : 4 : 3;
            } else {
                i = 2;
            }
            if (i == 0) {
                i = 1;
            }
            int i4 = i - 2;
            if (i4 == 2) {
                startActivityForResult(new Intent("com.google.android.gms.wallet.setupwizard.ACTION_SETUP_PAYMENTS").setPackage("com.google.android.gms"), 1301);
            } else if (i4 == 3 || i4 == 4) {
                bzua bzua = bztz2.f171390b;
                if (bzua == null) {
                    bzua = bzua.f171391g;
                }
                ((bjad) this.f90784j.mo71342a(bjad.class)).mo64937a(bzua.f171395c);
                this.f90785k.setText(bzua.f171396d);
                this.f90785k.setVisibility(0);
                biyn biyn = (biyn) this.f90784j.mo71342a(biyn.class);
                this.f90777c.setVisibility(0);
                int i5 = bzua.f171393a;
                if (i5 == 0) {
                    i3 = 3;
                } else if (i5 == 3) {
                    i3 = 1;
                } else if (i5 != 4) {
                    i3 = 0;
                }
                int i6 = i3 - 1;
                if (i3 != 0) {
                    if (i6 == 0) {
                        Context applicationContext = this.f90777c.getContext().getApplicationContext();
                        if (bzua.f171393a == 3) {
                            str = (String) bzua.f171394b;
                        } else {
                            str = "";
                        }
                        ayx a = aye.m2428a(applicationContext, str);
                        a.mo2916b(new atsi(this));
                        a.mo2912a((ayq) new atsj(this, bzua));
                    } else if (i6 == 1) {
                        LottieAnimationView lottieAnimationView = this.f90777c;
                        if (i5 == 4) {
                            bzub = (bzub) bzua.f171394b;
                        } else {
                            bzub = bzub.f171399d;
                        }
                        asjs asjs = new asjs(this.f90777c.getContext(), this.f90778d);
                        bepr bepr = new bepr(this.f90777c.getContext());
                        bepr.mo60915a(bzub.f171402b);
                        bepr.setAlpha(85);
                        new asjv(bepr).executeOnExecutor(snp.m35704b(9), asjs.mo49202a(bzub.f171401a));
                        lottieAnimationView.setImageDrawable(bepr);
                    }
                    biyo biyo = new biyo(this.f90784j.getContext());
                    biyo.f122328c = 5;
                    biyo.f122326a = bzua.f171397e;
                    biyo.f122327b = new atsk(this, bzua);
                    biyn.mo52733a(biyo.mo64882a());
                    biyo biyo2 = new biyo(this.f90784j.getContext());
                    biyo2.f122328c = 7;
                    biyo2.f122326a = bzua.f171398f;
                    biyo2.f122327b = new atsl(this);
                    biyn.mo52735b(biyo2.mo64882a());
                    return;
                }
                throw null;
            } else {
                mo50155a(5, null);
            }
        }
    }
}
