package p000;

import android.accounts.Account;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.setupservices.GoogleServicesChimeraActivity;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableItem;
import com.google.android.gms.setupservices.item.GoogleServicesExpandableSwitchItem;
import com.google.android.gms.setupservices.item.GoogleServicesTextItem;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupdesign.items.AbstractItem;
import com.google.android.setupdesign.items.ItemGroup;
import com.google.android.setupdesign.items.SwitchItem;
import com.google.android.setupdesign.view.NavigationBar;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aqha */
public final /* synthetic */ class aqha implements aubg {

    /* renamed from: a */
    private final GoogleServicesChimeraActivity f86096a;

    /* renamed from: b */
    private final aucb f86097b;

    /* renamed from: c */
    private final aucb f86098c;

    /* renamed from: d */
    private final aucb f86099d;

    /* renamed from: e */
    private final aucb f86100e;

    /* renamed from: f */
    private final aucb f86101f;

    public aqha(GoogleServicesChimeraActivity googleServicesChimeraActivity, aucb aucb, aucb aucb2, aucb aucb3, aucb aucb4, aucb aucb5) {
        this.f86096a = googleServicesChimeraActivity;
        this.f86097b = aucb;
        this.f86098c = aucb2;
        this.f86099d = aucb3;
        this.f86100e = aucb4;
        this.f86101f = aucb5;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        int i;
        aqje aqje;
        aqiz aqiz;
        boolean z;
        int i2;
        GoogleServicesChimeraActivity googleServicesChimeraActivity = this.f86096a;
        aucb aucb2 = this.f86097b;
        aucb aucb3 = this.f86098c;
        aucb aucb4 = this.f86099d;
        aucb aucb5 = this.f86100e;
        aucb aucb6 = this.f86101f;
        aqje aqje2 = (aqje) aucb2.mo50386d();
        aqje aqje3 = (aqje) aucb3.mo50386d();
        aqje aqje4 = (aqje) aucb4.mo50386d();
        aqje aqje5 = (aqje) aucb5.mo50386d();
        aqje aqje6 = (aqje) aucb6.mo50386d();
        if (!rrn.m34301a(googleServicesChimeraActivity.f43541a.f43552a)) {
            i = C0126R.C0128layout.setupservices_google_services_activity;
        } else {
            i = C0126R.C0128layout.setupservices_google_services_glif_activity;
        }
        googleServicesChimeraActivity.f107631i = rrr.m34310a(googleServicesChimeraActivity, i);
        ViewGroup a = googleServicesChimeraActivity.f107631i.mo25046a();
        googleServicesChimeraActivity.setContentView(a);
        TemplateLayout templateLayout = (TemplateLayout) a;
        ((bjad) templateLayout.mo71342a(bjad.class)).mo64937a(googleServicesChimeraActivity.getTitle());
        googleServicesChimeraActivity.f107632j = (bizp) new bizw(googleServicesChimeraActivity).mo64929a((int) C0126R.xml.setupservices_item_google_services);
        boolean z2 = false;
        bizv bizv = new bizv(googleServicesChimeraActivity.f107632j, false);
        bizv.f122397e = new aqhc(googleServicesChimeraActivity);
        ((bjaj) templateLayout.mo71342a(bjaj.class)).mo64954a(bizv);
        AccessibilityManager accessibilityManager = (AccessibilityManager) googleServicesChimeraActivity.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            ((bjaj) templateLayout.mo71342a(bjaj.class)).f122420a.setItemAnimator(null);
        }
        bjah bjah = (bjah) templateLayout.mo71342a(bjah.class);
        if (bjah != null) {
            bjah.mo64947a().mo71422a((bjbh) googleServicesChimeraActivity);
            Button button = bjah.mo64947a().f151534b;
            if (!googleServicesChimeraActivity.mo58957g().getBoolean("is_setup_wizard", false)) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            button.setVisibility(i2);
            bjah.mo64947a().f151533a.setText((int) C0126R.string.setupservices_google_services_next_button_label);
            bjas bjas = (bjas) templateLayout.mo71342a(bjas.class);
            NavigationBar a2 = bjah.mo64947a();
            bjas.f122441c = new bjan(a2);
            a2.f151535c.setOnClickListener(bjas.mo64961a((View.OnClickListener) null));
            bjas.mo64962a();
        }
        biyn biyn = (biyn) templateLayout.mo71342a(biyn.class);
        if (biyn != null) {
            biyo biyo = new biyo(googleServicesChimeraActivity);
            biyo.mo64883a(C0126R.string.setupservices_google_services_next_button_label);
            biyo.f122328c = 5;
            biyo.f122329d = 2132018229;
            biyp a3 = biyo.mo64882a();
            biyn.mo52733a(a3);
            bjas bjas2 = (bjas) templateLayout.mo71342a(bjas.class);
            aqhd aqhd = new aqhd(googleServicesChimeraActivity);
            CharSequence text = googleServicesChimeraActivity.getText(C0126R.string.sud_more_button_label);
            CharSequence charSequence = a3.f122332b;
            a3.f122336f = bjas2.mo64961a(aqhd);
            bjas2.f122441c = new bjao(a3, text, charSequence);
            bjas2.mo64962a();
        }
        rrn.m34299a(googleServicesChimeraActivity.f107631i.mo25046a());
        boolean z3 = false;
        for (aqiv aqiv : googleServicesChimeraActivity.f107630h) {
            bizp bizp = googleServicesChimeraActivity.f107632j;
            if (aqiv.mo47891b()) {
                aqiv.f86182g = aqiv.mo47893d();
                sdo.m34959a(aqiv.f86182g);
                ((ItemGroup) bizp.mo64921b(aqiv.f86182g.mo47903a())).mo58966a((bizp) aqiv.f86182g);
                aqiz = aqiv.f86182g;
                if (aqiz instanceof AbstractItem) {
                    ((AbstractItem) aqiz).f151489c = aqiv.f86181f;
                }
            } else {
                aqiz = null;
            }
            if (aqiz != null) {
                z = true;
            } else {
                z = false;
            }
            bxvd e = googleServicesChimeraActivity.mo47884e();
            int a4 = aqiv.mo47896a(e);
            bofd bofd = ((boct) e.f164949b).f132626q;
            if (bofd == null) {
                bofd = bofd.f132880b;
            }
            bofc bofc = (bofc) bofd.f132882a.get(a4);
            bxvd bxvd = (bxvd) bofc.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bofc);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = z2;
            }
            bofc bofc2 = (bofc) bxvd.f164949b;
            bofc bofc3 = bofc.f132873f;
            bofc2.f132875a |= 2;
            bofc2.f132877c = z;
            bofd bofd2 = ((boct) e.f164949b).f132626q;
            if (bofd2 == null) {
                bofd2 = bofd.f132880b;
            }
            bxvd bxvd2 = (bxvd) bofd2.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bofd2);
            boez boez = (boez) bxvd2;
            boez.mo68904a(a4, (bofc) bxvd.mo74062i());
            bofd bofd3 = (bofd) boez.mo74062i();
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            boct boct = (boct) e.f164949b;
            boct boct2 = boct.f132600I;
            bofd3.getClass();
            boct.f132626q = bofd3;
            boct.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            z2 = false;
            if (z) {
                z3 = true;
            }
        }
        GoogleServicesTextItem googleServicesTextItem = (GoogleServicesTextItem) googleServicesChimeraActivity.f107632j.mo64921b((int) C0126R.C0129id.google_services_description);
        GoogleServicesTextItem googleServicesTextItem2 = (GoogleServicesTextItem) googleServicesChimeraActivity.f107632j.mo64921b((int) C0126R.C0129id.google_services_tos);
        if (!z3) {
            googleServicesTextItem.mo71399d(false);
            googleServicesTextItem2.mo71399d(false);
            googleServicesChimeraActivity.mo58954a(-1);
            return null;
        }
        if (aqje2 == null) {
            aqjj aqjj = new aqjj(googleServicesChimeraActivity, googleServicesChimeraActivity.f107626d, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.mo58959k());
            aqje a5 = aqkg.m71752a(aqjj.f86210a, C0126R.array.setupservices_google_services_description, aqjj.f86212c);
            aqje[] aqjeArr = new aqje[1];
            aqjeArr[0] = aqje.m71717a(aqjj.f86210a, !aqjj.f86211b.mo47929a("KR") ? C0126R.string.setupservices_google_services_data_policy : C0126R.string.setupservices_google_services_data_policy_korea);
            aqje a6 = a5.mo47911a(aqjeArr);
            if (aqjj.f86212c != aqkf.AUTOMOTIVE) {
                Account account = aqjj.f86213d;
                if (account != null) {
                    aqje = new aqje(account.name, new bsrz[0]);
                    if (aqjj.f86212c == aqkf.KIDS) {
                        aqje = aqje.m71717a(aqjj.f86210a, (int) C0126R.string.setupservices_kids_google_services_kids_account_label).mo47911a(aqje);
                    }
                } else {
                    aqje = null;
                }
                if (aqje != null) {
                    aqje2 = aqje.mo47910a("\n", a6);
                }
            }
            aqje2 = a6;
        }
        googleServicesTextItem.f107653a = aqje2;
        aqji aqji = new aqji(googleServicesChimeraActivity, googleServicesChimeraActivity.f107627e, googleServicesChimeraActivity.f107626d, googleServicesChimeraActivity.f107628f);
        if (aqji.f86209d) {
            googleServicesChimeraActivity.f107634l = new GoogleServicesExpandableItem(googleServicesChimeraActivity, null);
            GoogleServicesExpandableItem googleServicesExpandableItem = googleServicesChimeraActivity.f107634l;
            googleServicesExpandableItem.f151489c = C0126R.C0129id.google_services_agreement;
            googleServicesExpandableItem.mo71398d((int) C0126R.C0128layout.setupservices_items_expandable_switch_tinted);
            googleServicesChimeraActivity.f107634l.mo71394a(aqji.f86206a.getResources().getDrawable(C0126R.C0127drawable.quantum_ic_get_app_vd_theme_24));
            GoogleServicesExpandableItem googleServicesExpandableItem2 = googleServicesChimeraActivity.f107634l;
            if (aqje5 == null) {
                aqje5 = aqkg.m71752a(aqji.f86206a, C0126R.array.setupservices_google_services_agreement, aqji.f86207b);
                if (aqji.f86208c.mo47929a("KR")) {
                    aqje5 = aqje5.mo47910a("\n", aqje.m71717a(aqji.f86206a, (int) C0126R.string.setupservices_google_services_agreement_korea));
                }
            }
            googleServicesExpandableItem2.mo58961b(aqje5);
            GoogleServicesExpandableItem googleServicesExpandableItem3 = googleServicesChimeraActivity.f107634l;
            if (aqje4 == null) {
                aqje4 = aqkg.m71752a(aqji.f86206a, C0126R.array.setupservices_google_services_agreement_title, aqji.f86207b);
            }
            ((GoogleServicesExpandableSwitchItem) googleServicesExpandableItem3).f107646a = aqje4;
            GoogleServicesExpandableItem googleServicesExpandableItem4 = googleServicesChimeraActivity.f107634l;
            if (aqje6 == null) {
                if (aqji.f86207b != aqkf.AUTOMOTIVE) {
                    aqje6 = aqje.m71717a(aqji.f86206a, (int) C0126R.string.setupservices_google_services_agreement_details);
                } else {
                    aqje6 = null;
                }
            }
            googleServicesExpandableItem4.mo58960a(aqje6);
            ItemGroup itemGroup = (ItemGroup) googleServicesChimeraActivity.f107632j.mo64921b((int) C0126R.C0129id.section_device_maintenance);
            sdo.checkIfNull(itemGroup, "Device maintenance section must not be null");
            itemGroup.mo58966a(googleServicesChimeraActivity.f107634l);
        }
        if (aqje3 == null) {
            aqjq aqjq = new aqjq(googleServicesChimeraActivity, googleServicesChimeraActivity.f107628f, googleServicesChimeraActivity.mo58959k(), googleServicesChimeraActivity.getIntent().getExtras().getBoolean("tosAlreadyShown", false));
            if (aqjq.f86231e == aqkf.AUTOMOTIVE) {
                aqje3 = aqje.m71717a(aqjq.f86227a, (int) C0126R.string.setupservices_auto_google_services_tos);
            } else {
                boolean z4 = aqjq.f86228b;
                int i3 = C0126R.string.setupservices_google_services_tos_account;
                if (z4 && aqjq.f86229c == null) {
                    i3 = !aqjq.f86230d ? C0126R.string.setupservices_google_services_tos_no_account : C0126R.string.setupservices_google_services_tos_no_account_policy_only;
                }
                aqje3 = aqje.m71717a(aqjq.f86227a, i3);
            }
        }
        googleServicesTextItem2.f107653a = aqje3;
        aqiw h = googleServicesChimeraActivity.mo58958h();
        byte[] b = h.mo47902b();
        if (b != null) {
            googleServicesChimeraActivity.f107633k = b;
        }
        for (aqiv aqiv2 : googleServicesChimeraActivity.f107630h) {
            aqiz aqiz2 = aqiv2.f86182g;
            if (aqiz2 != null) {
                if (aqiz2.mo47907bK()) {
                    boolean b2 = h.mo47901b(aqiv2.mo47897e(), aqiz2.mo47908c());
                    aqiz2.mo47905a(b2);
                    bxvd e2 = googleServicesChimeraActivity.mo47884e();
                    int a7 = aqiv2.mo47896a(e2);
                    bofd bofd4 = ((boct) e2.f164949b).f132626q;
                    if (bofd4 == null) {
                        bofd4 = bofd.f132880b;
                    }
                    bofc bofc4 = (bofc) bofd4.f132882a.get(a7);
                    bxvd bxvd3 = (bxvd) bofc4.mo74142c(5);
                    bxvd3.mo73625a((GeneratedMessageLite) bofc4);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bofc bofc5 = (bofc) bxvd3.f164949b;
                    bofc bofc6 = bofc.f132873f;
                    bofc5.f132875a |= 8;
                    bofc5.f132879e = b2;
                    bofd bofd5 = ((boct) e2.f164949b).f132626q;
                    if (bofd5 == null) {
                        bofd5 = bofd.f132880b;
                    }
                    bxvd bxvd4 = (bxvd) bofd5.mo74142c(5);
                    bxvd4.mo73625a((GeneratedMessageLite) bofd5);
                    boez boez2 = (boez) bxvd4;
                    boez2.mo68904a(a7, (bofc) bxvd3.mo74062i());
                    bofd bofd6 = (bofd) boez2.mo74062i();
                    if (e2.f164950c) {
                        e2.mo74035c();
                        e2.f164950c = false;
                    }
                    boct boct3 = (boct) e2.f164949b;
                    boct boct4 = boct.f132600I;
                    bofd6.getClass();
                    boct3.f132626q = bofd6;
                    boct3.f132610a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    bizy c = aqiv2.mo47892c();
                    if (c != null) {
                        SwitchItem switchItem = (SwitchItem) aqiz2;
                        c.mo47887a(aqiz2.mo47908c());
                        aqiz2.mo47904a(c);
                    }
                }
            }
        }
        return null;
    }
}
