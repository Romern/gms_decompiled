package p000;

import android.content.res.Resources;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: euy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class euy extends ewo {

    /* renamed from: A */
    private final int f15794A;

    /* renamed from: B */
    private final int f15795B;

    /* renamed from: C */
    private final int f15796C;

    /* renamed from: s */
    public final FrameLayout f15797s;

    /* renamed from: t */
    public final LinearLayout f15798t;

    /* renamed from: u */
    public final int f15799u;

    /* renamed from: v */
    final /* synthetic */ euz f15800v;

    /* renamed from: w */
    private final CardView f15801w;

    /* renamed from: x */
    private final View f15802x;

    /* renamed from: y */
    private final int f15803y;

    /* renamed from: z */
    private final int f15804z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: euz.a(android.view.View, int):void
     arg types: [androidx.cardview.widget.CardView, int]
     candidates:
      euz.a(bsxp, java.util.List):java.util.List
      euz.a(android.view.ViewGroup, int):acm
      ewn.a(android.view.ViewGroup, int):acm
      ewn.a(acm, int):void
      ewn.a(evk, evm):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      euz.a(android.view.View, int):void */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public euy(euz euz, View view) {
        super(view);
        this.f15800v = euz;
        this.f15801w = (CardView) view.findViewById(C0126R.C0129id.card_view);
        this.f15797s = (FrameLayout) view.findViewById(C0126R.C0129id.summary_card);
        this.f15798t = (LinearLayout) view.findViewById(C0126R.C0129id.dynamic_content);
        this.f15802x = view.findViewById(C0126R.C0129id.background);
        Resources resources = euz.f15937i.getResources();
        this.f15803y = resources.getDimensionPixelSize(C0126R.dimen.as_card_horizontal_spacing);
        this.f15804z = resources.getDimensionPixelSize(C0126R.dimen.as_card_block_vertical_padding);
        this.f15794A = resources.getDimensionPixelSize(C0126R.dimen.as_card_borderless_block_vertical_padding);
        this.f15795B = resources.getDimensionPixelSize(C0126R.dimen.as_card_deck_outer_padding);
        this.f15799u = resources.getDimensionPixelSize(C0126R.dimen.as_card_max_width);
        this.f15796C = resources.getDimensionPixelSize(C0126R.dimen.as_tappable_item_min_height);
        euz.m11156a((View) this.f15801w, 1);
    }

    /* renamed from: a */
    private final int m11150a(int i, List list) {
        if (list.size() == 1) {
            return adyg.m51399a(this.f15800v.f15937i, (int) C0126R.attr.asCardRoundedRipple, (int) C0126R.C0127drawable.as_card_rounded_ripple_light);
        }
        if (i == 0) {
            return adyg.m51399a(this.f15800v.f15937i, (int) C0126R.attr.asRippleRoundedTop, (int) C0126R.C0127drawable.as_ripple_rounded_top_light);
        }
        if (i == list.size() - 1) {
            return adyg.m51399a(this.f15800v.f15937i, (int) C0126R.attr.asRippleRoundedBottom, (int) C0126R.C0127drawable.as_ripple_rounded_bottom_light);
        }
        return adyg.m51399a(this.f15800v.f15937i, (int) C0126R.attr.asRipple, (int) C0126R.C0127drawable.as_ripple_light);
    }

    /* renamed from: a */
    private final View m11151a(View view) {
        LinearLayout linearLayout = new LinearLayout(this.f15800v.f15937i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = -this.f15795B;
        layoutParams.setMargins(i, 0, i, 0);
        linearLayout.setLayoutParams(layoutParams);
        int i2 = this.f15795B;
        linearLayout.setPadding(i2, 0, i2, 0);
        linearLayout.addView(view);
        return linearLayout;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, androidx.cardview.widget.CardView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: evi.a(fgt, com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView, boolean, bswh):void
     arg types: [fgt, com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView, int, bswh]
     candidates:
      evi.a(android.view.View, bsxn, evl, int):void
      evi.a(android.widget.TextView, java.lang.String, bsxn, evl):void
      evi.a(fgt, com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView, boolean, bswh):void */
    /* renamed from: a */
    private final View m11152a(bsut bsut) {
        bsvi bsvi;
        bsvi bsvi2;
        int i;
        bsvi bsvi3;
        bsvi bsvi4;
        bsvi bsvi5;
        bsvi bsvi6;
        int i2;
        CardView cardView;
        LinearLayout linearLayout;
        int i3;
        int i4;
        bsvi bsvi7;
        bzrt bzrt;
        boolean z;
        bzrt bzrt2;
        bswm bswm;
        boolean z2;
        bsxd bsxd;
        bzrt bzrt3;
        bzrt bzrt4;
        bsxb bsxb;
        bsuk bsuk;
        bsuj bsuj;
        abh abh;
        bswo bswo;
        bzrt bzrt5;
        bswi bswi;
        bswi bswi2;
        bsvu bsvu;
        euy euy = this;
        bsut bsut2 = bsut;
        int i5 = bsut2.f147190b;
        boolean z3 = true;
        boolean z4 = false;
        if (i5 == 1) {
            LinearLayout linearLayout2 = euy.f15798t;
            euz euz = euy.f15800v;
            eub eub = new eub(bsut2, linearLayout2, euz.f15935g, euz.f15938j);
            bsut bsut3 = (bsut) eub.f15668a;
            if (bsut3.f147190b == 1) {
                bsvu = (bsvu) bsut3.f147191c;
            } else {
                bsvu = bsvu.f147338g;
            }
            TextView textView = (TextView) eub.f15670c.findViewById(C0126R.C0129id.title);
            TextView textView2 = (TextView) eub.f15670c.findViewById(C0126R.C0129id.description);
            evi.m11180a(textView, bsvu.f147341b);
            evi.m11180a(textView2, bsvu.f147342c);
            if ((bsvu.f147340a & 1) == 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView2.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, 0);
                textView2.setLayoutParams(layoutParams);
            }
            String str = bsvu.f147344e;
            bsxn bsxn = bsvu.f147345f;
            if (bsxn == null) {
                bsxn = bsxn.f147586d;
            }
            evi.m11181a(textView2, str, bsxn, eub.f15671d);
            fgt fgt = eub.f15673f;
            FadeInImageView fadeInImageView = (FadeInImageView) eub.f15670c.findViewById(C0126R.C0129id.image);
            if ((bsvu.f147340a & 4) != 0) {
                z4 = true;
            }
            bswh bswh = bsvu.f147343d;
            if (bswh == null) {
                bswh = bswh.f147430g;
            }
            evi.m11184a(fgt, fadeInImageView, z4, bswh);
            eub.f15670c.setFocusable(true);
            C1334rs.m20104a(textView, C0126R.style.AsT5);
            return eub.f15670c;
        } else if (i5 == 2) {
            View inflate = LayoutInflater.from(euy.f15800v.f15937i).inflate((int) C0126R.C0128layout.as_card_image_block, (ViewGroup) euy.f15801w, false);
            fgt fgt2 = euy.f15800v.f15938j;
            FadeInImageView fadeInImageView2 = (FadeInImageView) inflate.findViewById(C0126R.C0129id.image);
            if (bsut2.f147190b == 2) {
                bswi = (bswi) bsut2.f147191c;
            } else {
                bswi = bswi.f147438c;
            }
            int i6 = bswi.f147440a & 1;
            if (bsut2.f147190b == 2) {
                bswi2 = (bswi) bsut2.f147191c;
            } else {
                bswi2 = bswi.f147438c;
            }
            bswh bswh2 = bswi2.f147441b;
            if (bswh2 == null) {
                bswh2 = bswh.f147430g;
            }
            if (i6 == 0) {
                z3 = false;
            }
            evi.m11184a(fgt2, fadeInImageView2, z3, bswh2);
            return inflate;
        } else if (i5 != 3) {
            int i7 = 8;
            if (i5 == 5) {
                LinearLayout linearLayout3 = euy.f15798t;
                euz euz2 = euy.f15800v;
                eud eud = new eud(bsut2, linearLayout3, euz2.f15935g, euz2.f15938j);
                bsut bsut4 = (bsut) eud.f15668a;
                if (bsut4.f147190b == 5) {
                    bswo = (bswo) bsut4.f147191c;
                } else {
                    bswo = bswo.f147460k;
                }
                FadeInImageView fadeInImageView3 = (FadeInImageView) eud.f15670c.findViewById(C0126R.C0129id.icon);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) fadeInImageView3.getLayoutParams();
                if (bswo.f147470i == 1) {
                    layoutParams2.gravity = 48;
                } else {
                    layoutParams2.gravity = 17;
                }
                fadeInImageView3.setLayoutParams(layoutParams2);
                fgt fgt3 = eud.f15673f;
                boolean z5 = (bswo.f147462a & 8) != 0;
                bswh bswh3 = bswo.f147468g;
                if (bswh3 == null) {
                    bswh3 = bswh.f147430g;
                }
                evi.m11184a(fgt3, fadeInImageView3, z5, bswh3);
                FadeInImageView fadeInImageView4 = (FadeInImageView) eud.f15670c.findViewById(C0126R.C0129id.secondary_icon);
                fadeInImageView4.setLayoutParams(layoutParams2);
                fadeInImageView4.setVisibility(0);
                fgt fgt4 = eud.f15673f;
                boolean z6 = (bswo.f147462a & 16) != 0;
                bswh bswh4 = bswo.f147469h;
                if (bswh4 == null) {
                    bswh4 = bswh.f147430g;
                }
                evi.m11184a(fgt4, fadeInImageView4, z6, bswh4);
                fgt fgt5 = eud.f15673f;
                FadeInImageView fadeInImageView5 = (FadeInImageView) eud.f15670c.findViewById(C0126R.C0129id.image);
                int i8 = bswo.f147462a & 1;
                bswh bswh5 = bswo.f147463b;
                if (bswh5 == null) {
                    bswh5 = bswh.f147430g;
                }
                evi.m11184a(fgt5, fadeInImageView5, i8 != 0, bswh5);
                LinearLayout linearLayout4 = (LinearLayout) eud.f15670c.findViewById(C0126R.C0129id.content);
                if (bswo.f147471j.size() <= 0) {
                    if ((bswo.f147462a & 2) != 0) {
                        TextView textView3 = new TextView(eud.f15672e);
                        textView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        evi.m11178a(textView3, 2);
                        evi.m11180a(textView3, bswo.f147464c);
                        linearLayout4.addView(textView3);
                    }
                    if (bswo.f147465d.size() > 0) {
                        LinearLayout linearLayout5 = new LinearLayout(eud.f15672e);
                        linearLayout5.setOrientation(1);
                        bxwc bxwc = bswo.f147465d;
                        int size = bxwc.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            TextView textView4 = new TextView(eud.f15672e);
                            textView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            evi.m11178a(textView4, 3);
                            evi.m11180a(textView4, (String) bxwc.get(i9));
                            linearLayout5.addView(textView4);
                        }
                        linearLayout4.addView(linearLayout5);
                    }
                    if (bswo.f147466e.size() > 0) {
                        LinearLayout linearLayout6 = new LinearLayout(eud.f15672e);
                        linearLayout6.setOrientation(1);
                        bxwc bxwc2 = bswo.f147466e;
                        int size2 = bxwc2.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            TextView textView5 = new TextView(eud.f15672e);
                            textView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            evi.m11178a(textView5, 4);
                            evi.m11180a(textView5, (String) bxwc2.get(i10));
                            linearLayout6.addView(textView5);
                        }
                        linearLayout4.addView(linearLayout6);
                    }
                    if ((bswo.f147462a & 4) != 0) {
                        View inflate2 = LayoutInflater.from(eud.f15672e).inflate((int) C0126R.C0128layout.as_card_special_desc, (ViewGroup) eud.f15669b, false);
                        bsxz bsxz = bswo.f147467f;
                        if (bsxz == null) {
                            bsxz = bsxz.f147641e;
                        }
                        TextView textView6 = (TextView) inflate2.findViewById(C0126R.C0129id.text);
                        String str2 = bsxz.f147644b;
                        if ((bsxz.f147643a & 4) != 0) {
                            bzrt5 = bsxz.f147646d;
                            if (bzrt5 == null) {
                                bzrt5 = bzrt.f171195e;
                            }
                        } else {
                            bzrt5 = null;
                        }
                        evi.m11182a(textView6, str2, bzrt5);
                        fgt fgt6 = eud.f15673f;
                        FadeInImageView fadeInImageView6 = (FadeInImageView) inflate2.findViewById(C0126R.C0129id.image);
                        if ((bsxz.f147643a & 2) != 0) {
                            z4 = true;
                        }
                        bswh bswh6 = bsxz.f147645c;
                        if (bswh6 == null) {
                            bswh6 = bswh.f147430g;
                        }
                        evi.m11184a(fgt6, fadeInImageView6, z4, bswh6);
                        linearLayout4.addView(inflate2);
                    }
                    evi.m11188b(linearLayout4, eud.f15672e.getResources().getDimensionPixelOffset(C0126R.dimen.as_styled_text_entry_vertical_margin));
                } else {
                    evi.m11183a(eud.f15673f, linearLayout4, bswo.f147471j);
                }
                eud.f15670c.setFocusable(true);
                return eud.f15670c;
            }
            int i11 = 6;
            if (i5 == 6) {
                bsvi = (bsvi) bsut2.f147191c;
            } else {
                bsvi = bsvi.f147268h;
            }
            if (bsvi.f147271b.size() == 0) {
                int i12 = bsut2.f147190b;
                if (i12 == 9) {
                    LinearLayout linearLayout7 = euy.f15798t;
                    euz euz3 = euy.f15800v;
                    etk etk = new etk(bsut2, linearLayout7, euz3.f15935g, euz3.f15938j);
                    bsut bsut5 = (bsut) etk.f15668a;
                    if (bsut5.f147190b == 9) {
                        bsuj = (bsuj) bsut5.f147191c;
                    } else {
                        bsuj = bsuj.f147134b;
                    }
                    if (!cbro.f178167a.mo6606a().mo75293m()) {
                        abh = new ett(etk.f15672e, bsuj.f147136a, etk.f15671d, etk.f15669b, etk.f15673f);
                    } else {
                        abh = new etu(etk.f15672e, bsuj.f147136a, etk.f15671d, etk.f15669b, etk.f15673f);
                    }
                    RecyclerView recyclerView = (RecyclerView) etk.f15670c.findViewById(C0126R.C0129id.horizontal_list);
                    aah aah = new aah(0);
                    recyclerView.addItemDecoration(new ewp(etk.f15672e.getResources().getDimensionPixelSize(C0126R.dimen.as_action_chip_carousel_padding)));
                    recyclerView.setNestedScrollingEnabled(false);
                    recyclerView.setLayoutManager(aah);
                    recyclerView.swapAdapter(abh, true);
                    return euy.m11151a(etk.f15670c);
                } else if (i12 == 8) {
                    LinearLayout linearLayout8 = euy.f15798t;
                    euz euz4 = euy.f15800v;
                    etv etv = new etv(bsut2, linearLayout8, euz4.f15935g, euz4.f15938j);
                    bsut bsut6 = (bsut) etv.f15668a;
                    if (bsut6.f147190b == 8) {
                        bsuk = (bsuk) bsut6.f147191c;
                    } else {
                        bsuk = bsuk.f147137d;
                    }
                    evi.m11180a((TextView) etv.f15670c.findViewById(C0126R.C0129id.link_text), bsuk.f147140b);
                    fgt fgt7 = etv.f15673f;
                    FadeInImageView fadeInImageView7 = (FadeInImageView) etv.f15670c.findViewById(C0126R.C0129id.icon);
                    if ((bsuk.f147139a & 2) == 0) {
                        z3 = false;
                    }
                    bswh bswh7 = bsuk.f147141c;
                    if (bswh7 == null) {
                        bswh7 = bswh.f147430g;
                    }
                    evi.m11184a(fgt7, fadeInImageView7, z3, bswh7);
                    return etv.f15670c;
                } else if (i12 == 10) {
                    LinearLayout linearLayout9 = euy.f15798t;
                    euz euz5 = euy.f15800v;
                    eue eue = new eue(bsut, linearLayout9, euz5.f15935g, euz5.f15938j, euz5.f15806d, euz5.f15807e);
                    bsut bsut7 = (bsut) eue.f15668a;
                    if (bsut7.f147190b == 10) {
                        bsxb = (bsxb) bsut7.f147191c;
                    } else {
                        bsxb = bsxb.f147517g;
                    }
                    LinearLayout linearLayout10 = (LinearLayout) eue.f15670c.findViewById(C0126R.C0129id.text_content);
                    if (bsxb.f147524f.size() <= 0) {
                        if (!bsxb.f147520b.isEmpty()) {
                            TextView textView7 = new TextView(eue.f15672e);
                            textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            evi.m11178a(textView7, 2);
                            evi.m11180a(textView7, bsxb.f147520b);
                            linearLayout10.addView(textView7);
                        }
                        if (!bsxb.f147521c.isEmpty()) {
                            TextView textView8 = new TextView(eue.f15672e);
                            textView8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            evi.m11178a(textView8, 3);
                            evi.m11180a(textView8, bsxb.f147521c);
                            linearLayout10.addView(textView8);
                        }
                        if (!bsxb.f147522d.isEmpty()) {
                            TextView textView9 = new TextView(eue.f15672e);
                            textView9.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            evi.m11178a(textView9, 4);
                            evi.m11180a(textView9, bsxb.f147522d);
                            linearLayout10.addView(textView9);
                        }
                        evi.m11188b(linearLayout10, eue.f15672e.getResources().getDimensionPixelOffset(C0126R.dimen.as_styled_text_entry_vertical_margin));
                    } else {
                        evi.m11183a(eue.f15673f, linearLayout10, bsxb.f147524f);
                    }
                    AccountParticleDisc accountParticleDisc = (AccountParticleDisc) eue.f15670c.findViewById(C0126R.C0129id.avatar_particle_disc);
                    new eva(accountParticleDisc, eue.f15751g).mo10524a(bmxv.m108567c(eue.f15752h));
                    if ((bsxb.f147519a & 8) != 0) {
                        accountParticleDisc.setClickable(true);
                        accountParticleDisc.setFocusable(true);
                        accountParticleDisc.setContentDescription(eue.f15672e.getResources().getString(C0126R.string.common_edit));
                    }
                    bsxn bsxn2 = bsxb.f147523e;
                    if (bsxn2 == null) {
                        bsxn2 = bsxn.f147586d;
                    }
                    evi.m11174a(accountParticleDisc, bsxn2, eue.f15671d);
                    return eue.f15670c;
                } else if (i12 == 12) {
                    LinearLayout linearLayout11 = euy.f15798t;
                    euz euz6 = euy.f15800v;
                    euf euf = new euf(bsut2, linearLayout11, euz6.f15935g, euz6.f15938j);
                    bsut bsut8 = (bsut) euf.f15668a;
                    if (bsut8.f147190b == 12) {
                        bsxd = (bsxd) bsut8.f147191c;
                    } else {
                        bsxd = bsxd.f147533c;
                    }
                    evi.m11183a(euf.f15673f, (LinearLayout) euf.f15670c.findViewById(C0126R.C0129id.text_entries), bsxd.f147535a);
                    TextView textView10 = (TextView) euf.f15670c.findViewById(C0126R.C0129id.label_lower);
                    bsxc bsxc = bsxd.f147536b;
                    if (bsxc == null) {
                        bsxc = bsxc.f147525g;
                    }
                    evi.m11180a(textView10, bsxc.f147531e);
                    TextView textView11 = (TextView) euf.f15670c.findViewById(C0126R.C0129id.label_higher);
                    bsxc bsxc2 = bsxd.f147536b;
                    if (bsxc2 == null) {
                        bsxc2 = bsxc.f147525g;
                    }
                    evi.m11180a(textView11, bsxc2.f147532f);
                    ProgressBar progressBar = (ProgressBar) euf.f15670c.findViewById(C0126R.C0129id.progress_bar);
                    bsxc bsxc3 = bsxd.f147536b;
                    if (bsxc3 == null) {
                        bsxc3 = bsxc.f147525g;
                    }
                    progressBar.setProgress((int) (bsxc3.f147528b * 100.0f));
                    bsxc bsxc4 = bsxd.f147536b;
                    if (bsxc4 == null) {
                        bsxc4 = bsxc.f147525g;
                    }
                    if ((bsxc4.f147527a & 2) != 0) {
                        bsxc bsxc5 = bsxd.f147536b;
                        if (bsxc5 == null) {
                            bsxc5 = bsxc.f147525g;
                        }
                        bzrt3 = bsxc5.f147529c;
                        if (bzrt3 == null) {
                            bzrt3 = bzrt.f171195e;
                        }
                    } else {
                        bzrt3 = null;
                    }
                    bsxc bsxc6 = bsxd.f147536b;
                    if (bsxc6 == null) {
                        bsxc6 = bsxc.f147525g;
                    }
                    if ((bsxc6.f147527a & 4) != 0) {
                        bsxc bsxc7 = bsxd.f147536b;
                        if (bsxc7 == null) {
                            bsxc7 = bsxc.f147525g;
                        }
                        bzrt4 = bsxc7.f147530d;
                        if (bzrt4 == null) {
                            bzrt4 = bzrt.f171195e;
                        }
                    } else {
                        bzrt4 = null;
                    }
                    evi.m11177a(progressBar, bzrt3, bzrt4);
                    return euf.f15670c;
                } else if (i12 != 16) {
                    return null;
                } else {
                    euy.f15802x.setBackgroundDrawable(adyg.m51401a(euy.f15800v.f15937i, (int) C0126R.attr.asCardLegendBackground));
                    LinearLayout linearLayout12 = euy.f15798t;
                    euz euz7 = euy.f15800v;
                    euc euc = new euc(bsut2, linearLayout12, euz7.f15935g, euz7.f15938j);
                    bsut bsut9 = (bsut) euc.f15668a;
                    if (bsut9.f147190b == 16) {
                        bswm = (bswm) bsut9.f147191c;
                    } else {
                        bswm = bswm.f147452b;
                    }
                    LinearLayout linearLayout13 = (LinearLayout) euc.f15670c.findViewById(C0126R.C0129id.content);
                    if (bswm.f147454a.size() > 0) {
                        bxwc bxwc3 = bswm.f147454a;
                        int size3 = bxwc3.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            bswn bswn = (bswn) bxwc3.get(i13);
                            View inflate3 = LayoutInflater.from(euc.f15672e).inflate((int) C0126R.C0128layout.as_card_legend_item, (ViewGroup) euc.f15669b, false);
                            fgt fgt8 = euc.f15673f;
                            FadeInImageView fadeInImageView8 = (FadeInImageView) inflate3.findViewById(C0126R.C0129id.image);
                            int i14 = bswn.f147457a & 1;
                            bswh bswh8 = bswn.f147458b;
                            if (bswh8 == null) {
                                bswh8 = bswh.f147430g;
                            }
                            if (i14 == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            evi.m11184a(fgt8, fadeInImageView8, z2, bswh8);
                            evi.m11178a((TextView) inflate3.findViewById(C0126R.C0129id.label), 6);
                            evi.m11180a((TextView) inflate3.findViewById(C0126R.C0129id.label), bswn.f147459c);
                            linearLayout13.addView(inflate3);
                        }
                    }
                    return euc.f15670c;
                }
            } else {
                LinearLayout linearLayout14 = euy.f15798t;
                euz euz8 = euy.f15800v;
                eua eua = new eua(bsut2, linearLayout14, euz8.f15935g, euz8.f15938j);
                bsut bsut10 = (bsut) eua.f15668a;
                if (bsut10.f147190b == 6) {
                    bsvi2 = (bsvi) bsut10.f147191c;
                } else {
                    bsvi2 = bsvi.f147268h;
                }
                if (bsvi2.f147272c == 2) {
                    i = C0126R.C0128layout.as_card_horizontal_carousel_item;
                } else {
                    i = C0126R.C0128layout.as_card_carousel_item;
                }
                int dimensionPixelSize = eua.f15672e.getResources().getDimensionPixelSize(C0126R.dimen.as_vertical_carousel_item_min_width);
                int dimensionPixelSize2 = eua.f15672e.getResources().getDimensionPixelSize(C0126R.dimen.as_carousel_item_padding);
                bxwc bxwc4 = bsvi2.f147271b;
                int size4 = bxwc4.size();
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (i17 < size4) {
                    bsvi bsvi8 = bsvi2;
                    int i18 = i;
                    int i19 = dimensionPixelSize;
                    bsvj bsvj = (bsvj) bxwc4.get(i17);
                    if ((bsvj.f147279a & 1) != 0) {
                        bswh bswh9 = bsvj.f147280b;
                        if (bswh9 == null) {
                            bswh9 = bswh.f147430g;
                        }
                        i16 = Math.max(i16, bswh9.f147436e);
                        bswh bswh10 = bsvj.f147280b;
                        if (bswh10 == null) {
                            bswh10 = bswh.f147430g;
                        }
                        i15 = Math.max(i15, bswh10.f147435d);
                    }
                    i17++;
                    euy = this;
                    bsut2 = bsut;
                    bsvi2 = bsvi8;
                    i = i18;
                    dimensionPixelSize = i19;
                    z4 = false;
                    i11 = 6;
                    i7 = 8;
                }
                int a = evi.m11170a(i15, eua.f15672e);
                int a2 = evi.m11170a(i16, eua.f15672e);
                LinearLayout linearLayout15 = (LinearLayout) eua.f15670c.findViewById(C0126R.C0129id.carousel);
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) eua.f15670c.findViewById(C0126R.C0129id.carouselScrollView);
                int i20 = Build.VERSION.SDK_INT;
                evi.m11172a();
                int i21 = 0;
                while (i21 < bsvi2.f147271b.size()) {
                    bsvj bsvj2 = (bsvj) bsvi2.f147271b.get(i21);
                    View inflate4 = LayoutInflater.from(eua.f15672e).inflate(i, linearLayout15, z4);
                    CardView cardView2 = (CardView) inflate4.findViewById(C0126R.C0129id.card_view);
                    if (bsvj2.f147286h) {
                        cardView2.mo1865a(4.0f);
                        adyg.m51402a(cardView2, 3, eot.f15436a);
                    } else {
                        cardView2.mo1865a(0.0f);
                        adyg.m51402a(cardView2, 1, eot.f15436a);
                    }
                    bsut bsut11 = (bsut) eua.f15668a;
                    bsvi bsvi9 = bsvi2;
                    if (bsut11.f147190b == 6) {
                        bsvi4 = (bsvi) bsut11.f147191c;
                    } else {
                        bsvi4 = bsvi.f147268h;
                    }
                    int i22 = bsvi4.f147272c;
                    bsut bsut12 = (bsut) eua.f15668a;
                    int i23 = i;
                    if (bsut12.f147190b == 6) {
                        bsvi5 = (bsvi) bsut12.f147191c;
                    } else {
                        bsvi5 = bsvi.f147268h;
                    }
                    int a3 = evi.m11170a(bsvi5.f147274e, eua.f15672e);
                    if (a3 > 0 && i22 == 1) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) cardView2.getLayoutParams();
                        layoutParams3.width = a3;
                        cardView2.setLayoutParams(layoutParams3);
                    } else {
                        a3 = dimensionPixelSize;
                    }
                    bsut bsut13 = (bsut) eua.f15668a;
                    int i24 = dimensionPixelSize;
                    if (bsut13.f147190b == 6) {
                        bsvi6 = (bsvi) bsut13.f147191c;
                    } else {
                        bsvi6 = bsvi.f147268h;
                    }
                    int i25 = bsvi6.f147273d;
                    boolean z7 = i25 == 2;
                    LinearLayout linearLayout16 = (LinearLayout) inflate4.findViewById(C0126R.C0129id.content);
                    HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
                    linearLayout16.setHorizontalGravity(i25 == 2 ? 17 : 8388611);
                    if (bsvj2.f147288j.size() > 0) {
                        i2 = i22;
                        cardView = cardView2;
                        linearLayout = linearLayout15;
                        i3 = i21;
                        evi.m11183a(eua.f15673f, linearLayout16, bsvj2.f147288j);
                        for (int i26 = 0; i26 < linearLayout16.getChildCount(); i26++) {
                            eua.m11133a((TextView) linearLayout16.getChildAt(i26).findViewById(C0126R.C0129id.text), z7);
                        }
                    } else if (eua.m11134a(bsvj2)) {
                        linearLayout16.setVisibility(8);
                        i2 = i22;
                        cardView = cardView2;
                        linearLayout = linearLayout15;
                        i3 = i21;
                    } else {
                        bsut bsut14 = (bsut) eua.f15668a;
                        if (bsut14.f147190b == 6) {
                            bsvi7 = (bsvi) bsut14.f147191c;
                        } else {
                            bsvi7 = bsvi.f147268h;
                        }
                        boolean z8 = bsvi7.f147273d == 2;
                        if ((bsvj2.f147279a & 2) != 0) {
                            TextView textView12 = new TextView(eua.f15672e);
                            i3 = i21;
                            textView12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                            evi.m11178a(textView12, 2);
                            evi.m11180a(textView12, bsvj2.f147281c);
                            linearLayout16.addView(textView12);
                            eua.m11133a(textView12, z8);
                        } else {
                            i3 = i21;
                        }
                        if (bsvj2.f147282d.size() > 0) {
                            LinearLayout linearLayout17 = new LinearLayout(eua.f15672e);
                            linearLayout17.setOrientation(1);
                            bxwc bxwc5 = bsvj2.f147282d;
                            int size5 = bxwc5.size();
                            int i27 = 0;
                            while (i27 < size5) {
                                TextView textView13 = new TextView(eua.f15672e);
                                C1334rs.m20104a(textView13, C0126R.style.AsStyledTextAppearanceTitle);
                                textView13.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                eua.m11133a(textView13, z8);
                                evi.m11180a(textView13, (String) bxwc5.get(i27));
                                linearLayout17.addView(textView13);
                                i27++;
                                size5 = size5;
                                bxwc5 = bxwc5;
                                linearLayout15 = linearLayout15;
                                cardView2 = cardView2;
                                i22 = i22;
                            }
                            i2 = i22;
                            cardView = cardView2;
                            linearLayout = linearLayout15;
                            linearLayout16.addView(linearLayout17);
                        } else {
                            i2 = i22;
                            cardView = cardView2;
                            linearLayout = linearLayout15;
                        }
                        if (bsvj2.f147283e.size() > 0) {
                            LinearLayout linearLayout18 = new LinearLayout(eua.f15672e);
                            linearLayout18.setOrientation(1);
                            bxwc bxwc6 = bsvj2.f147283e;
                            int size6 = bxwc6.size();
                            int i28 = 0;
                            while (i28 < size6) {
                                String str3 = (String) bxwc6.get(i28);
                                TextView textView14 = new TextView(eua.f15672e);
                                C1334rs.m20104a(textView14, C0126R.style.AsStyledTextAppearanceDescription);
                                bxwc bxwc7 = bxwc6;
                                int i29 = size6;
                                textView14.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                                eua.m11133a(textView14, z8);
                                if ((bsvj2.f147279a & 8) != 0) {
                                    bzrt2 = bsvj2.f147285g;
                                    if (bzrt2 == null) {
                                        bzrt2 = bzrt.f171195e;
                                    }
                                } else {
                                    bzrt2 = null;
                                }
                                evi.m11182a(textView14, str3, bzrt2);
                                linearLayout18.addView(textView14);
                                i28++;
                                size6 = i29;
                                bxwc6 = bxwc7;
                            }
                            linearLayout16.addView(linearLayout18);
                        }
                        if ((bsvj2.f147279a & 4) != 0) {
                            View inflate5 = LayoutInflater.from(eua.f15672e).inflate((int) C0126R.C0128layout.as_card_special_desc, (ViewGroup) linearLayout16, false);
                            bsxz bsxz2 = bsvj2.f147284f;
                            if (bsxz2 == null) {
                                bsxz2 = bsxz.f147641e;
                            }
                            TextView textView15 = (TextView) inflate5.findViewById(C0126R.C0129id.text);
                            String str4 = bsxz2.f147644b;
                            if ((bsxz2.f147643a & 4) != 0) {
                                bzrt = bsxz2.f147646d;
                                if (bzrt == null) {
                                    bzrt = bzrt.f171195e;
                                }
                            } else {
                                bzrt = null;
                            }
                            evi.m11182a(textView15, str4, bzrt);
                            fgt fgt9 = eua.f15673f;
                            FadeInImageView fadeInImageView9 = (FadeInImageView) inflate5.findViewById(C0126R.C0129id.image);
                            if ((bsxz2.f147643a & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bswh bswh11 = bsxz2.f147645c;
                            if (bswh11 == null) {
                                bswh11 = bswh.f147430g;
                            }
                            evi.m11184a(fgt9, fadeInImageView9, z, bswh11);
                            LinearLayout linearLayout19 = (LinearLayout) inflate5.findViewById(C0126R.C0129id.special_desc);
                            if (z8) {
                                linearLayout19.setGravity(17);
                            } else {
                                linearLayout19.setGravity(8388611);
                            }
                            linearLayout16.addView(inflate5);
                        }
                        evi.m11188b(linearLayout16, eua.f15672e.getResources().getDimensionPixelSize(C0126R.dimen.as_styled_text_entry_vertical_margin));
                    }
                    FrameLayout frameLayout = (FrameLayout) inflate4.findViewById(C0126R.C0129id.image_frame);
                    if ((bsvj2.f147279a & 1) != 0) {
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                        int i30 = a3 - (dimensionPixelSize2 + dimensionPixelSize2);
                        layoutParams4.width = Math.min(a, i30);
                        layoutParams4.height = (int) (((float) a2) * (((float) layoutParams4.width) / ((float) a)));
                        if (eua.m11134a(bsvj2)) {
                            i4 = 0;
                            layoutParams4.setMargins(0, 0, 0, 0);
                        } else {
                            i4 = 0;
                        }
                        frameLayout.post(new etw(frameLayout, layoutParams4));
                        frameLayout.setVisibility(i4);
                        if (i2 == 1) {
                            fgt fgt10 = eua.f15673f;
                            FadeInImageView fadeInImageView10 = (FadeInImageView) inflate4.findViewById(C0126R.C0129id.image);
                            bswh bswh12 = bsvj2.f147280b;
                            if (bswh12 == null) {
                                bswh12 = bswh.f147430g;
                            }
                            evi.m11185a(fgt10, fadeInImageView10, true, bswh12, i30);
                        } else {
                            fgt fgt11 = eua.f15673f;
                            FadeInImageView fadeInImageView11 = (FadeInImageView) inflate4.findViewById(C0126R.C0129id.image);
                            bswh bswh13 = bsvj2.f147280b;
                            if (bswh13 == null) {
                                bswh13 = bswh.f147430g;
                            }
                            evi.m11184a(fgt11, fadeInImageView11, true, bswh13);
                        }
                    } else {
                        frameLayout.setVisibility(8);
                    }
                    CardView cardView3 = cardView;
                    View findViewById = cardView3.findViewById(C0126R.C0129id.tappable_view);
                    bsxn bsxn3 = bsvj2.f147287i;
                    if (bsxn3 == null) {
                        bsxn3 = bsxn.f147586d;
                    }
                    evi.m11175a(findViewById, bsxn3, eua.f15671d, adyg.m51399a(eua.f15672e, (int) C0126R.attr.asCarouselRoundedRipple, (int) C0126R.C0127drawable.as_carousel_rounded_ripple_light));
                    if ((bsvj2.f147279a & 32) == 0) {
                        cardView3.setClickable(false);
                        cardView3.setOnClickListener(new etx(eua));
                    }
                    linearLayout.addView(inflate4);
                    linearLayout15 = linearLayout;
                    i21 = i3 + 1;
                    horizontalScrollView = horizontalScrollView2;
                    bsvi2 = bsvi9;
                    i = i23;
                    dimensionPixelSize = i24;
                    z4 = false;
                    i11 = 6;
                    i7 = 8;
                    euy = this;
                    bsut2 = bsut;
                }
                if ((bsvi2.f147270a & i7) != 0) {
                    View inflate6 = LayoutInflater.from(eua.f15672e).inflate((int) C0126R.C0128layout.as_card_carousel_view_all, linearLayout15, z4);
                    TextView textView16 = (TextView) inflate6.findViewById(C0126R.C0129id.text);
                    evi.m11180a(textView16, bsvi2.f147276g);
                    View findViewById2 = inflate6.findViewById(C0126R.C0129id.button);
                    bsxn bsxn4 = bsvi2.f147275f;
                    if (bsxn4 == null) {
                        bsxn4 = bsxn.f147586d;
                    }
                    evi.m11174a(findViewById2, bsxn4, eua.f15671d);
                    C1280ps.m19906b((View) textView16, 2);
                    findViewById2.setContentDescription(bsvi2.f147276g);
                    if (cbro.f178167a.mo6606a().mo75300t() && adyf.m51386a(eot.f15436a)) {
                        findViewById2.setBackgroundTintList(adyg.m51400a(C1165lm.m19351a(adyg.m51404b(3), adyg.m51405b(eua.f15672e, 16842801, C0126R.color.google_white))));
                    }
                    linearLayout15.addView(inflate6);
                }
                evi.m11176a(linearLayout15, eua.f15672e.getResources().getDimensionPixelSize(C0126R.dimen.as_carousel_children_spacing));
                horizontalScrollView.addOnLayoutChangeListener(new etz(eua, horizontalScrollView, linearLayout15));
                View view = eua.f15670c;
                if (bsut2.f147190b == i11) {
                    bsvi3 = (bsvi) bsut2.f147191c;
                } else {
                    bsvi3 = bsvi.f147268h;
                }
                if (!((bsvj) bsvi3.f147271b.get(z4 ? 1 : 0)).f147286h) {
                    return euy.m11151a(view);
                }
                return view;
            }
        } else {
            ImageView imageView = new ImageView(this.f15800v.f15937i);
            imageView.setImageResource(adyg.m51399a(this.f15800v.f15937i, (int) C0126R.attr.asDivider, (int) C0126R.C0127drawable.as_divider_light));
            int i31 = this.f15803y;
            imageView.setPadding(i31, 0, i31, 0);
            return imageView;
        }
    }

    /* renamed from: a */
    private final void m11153a(View view, int i, bsye bsye) {
        int i2;
        int i3 = 0;
        if (i != bsye.f147664c.size() - 1) {
            i2 = ((bsut) bsye.f147664c.get(i + 1)).f147190b == 3 ? this.f15804z : 0;
        } else {
            i2 = !bsye.f147665d ? this.f15804z : this.f15794A;
        }
        if (i == 0) {
            i3 = !bsye.f147665d ? this.f15804z : this.f15794A;
        } else if (((bsut) bsye.f147664c.get(i - 1)).f147190b == 3) {
            i3 = this.f15804z;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + i3, view.getPaddingRight(), view.getPaddingBottom() + i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: euz.a(android.view.View, int):void
     arg types: [androidx.cardview.widget.CardView, int]
     candidates:
      euz.a(bsxp, java.util.List):java.util.List
      euz.a(android.view.ViewGroup, int):acm
      ewn.a(android.view.ViewGroup, int):acm
      ewn.a(acm, int):void
      ewn.a(evk, evm):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      euz.a(android.view.View, int):void */
    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        int i;
        int i2;
        if (ewj.mo10503a() == 3) {
            if (mo323d() == this.f15800v.mo161a() - 1) {
                euz.m11156a((View) this.f15801w, 2);
            }
            bsvd bsvd = ((euv) ewj).f15790a;
            this.f15798t.removeAllViews();
            if (bsvd.f147232a == 1) {
                bsye bsye = (bsye) bsvd.f147233b;
                int i3 = Build.VERSION.SDK_INT;
                this.f15801w.setClipToOutline(false);
                if (bsye.f147665d) {
                    this.f15802x.setBackgroundColor(adyg.m51405b(this.f15800v.f15937i, 16842801, C0126R.color.google_white));
                    i = 0;
                } else {
                    this.f15802x.setBackgroundDrawable(adyg.m51401a(this.f15800v.f15937i, (int) C0126R.attr.asCardBorder));
                    i = 0;
                }
                while (i < bsye.f147664c.size()) {
                    bsut bsut = (bsut) bsye.f147664c.get(i);
                    View a = m11152a(bsut);
                    if (a != null) {
                        if ((bsut.f147189a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) != 0) {
                            a.setMinimumHeight(this.f15796C);
                        }
                        m11153a(a, i, bsye);
                        if (!((bsut.f147189a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0 || (i2 = i + 1) >= bsye.f147664c.size() || (((bsut) bsye.f147664c.get(i2)).f147189a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0)) {
                            bsxn bsxn = bsut.f147192d;
                            if (bsxn == null) {
                                bsxn = bsxn.f147586d;
                            }
                            bsxn bsxn2 = ((bsut) bsye.f147664c.get(i2)).f147192d;
                            if (bsxn2 == null) {
                                bsxn2 = bsxn.f147586d;
                            }
                            if (bsxn.equals(bsxn2)) {
                                LinearLayout linearLayout = new LinearLayout(this.f15800v.f15937i);
                                linearLayout.setOrientation(1);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                linearLayout.setClipToPadding(false);
                                linearLayout.setClipChildren(false);
                                linearLayout.setLayoutParams(layoutParams);
                                linearLayout.addView(a);
                                bsxn bsxn3 = bsut.f147192d;
                                if (bsxn3 == null) {
                                    bsxn3 = bsxn.f147586d;
                                }
                                evi.m11175a(linearLayout, bsxn3, this.f15800v.f15935g, m11150a(i, bsye.f147664c));
                                while (true) {
                                    int i4 = i + 1;
                                    if (i4 >= bsye.f147664c.size() || (((bsut) bsye.f147664c.get(i4)).f147189a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE) == 0) {
                                        break;
                                    }
                                    bsxn bsxn4 = bsut.f147192d;
                                    if (bsxn4 == null) {
                                        bsxn4 = bsxn.f147586d;
                                    }
                                    bsxn bsxn5 = ((bsut) bsye.f147664c.get(i4)).f147192d;
                                    if (bsxn5 == null) {
                                        bsxn5 = bsxn.f147586d;
                                    }
                                    if (!bsxn4.equals(bsxn5)) {
                                        break;
                                    }
                                    View a2 = m11152a((bsut) bsye.f147664c.get(i4));
                                    if (a2 != null) {
                                        m11153a(a2, i4, bsye);
                                        linearLayout.addView(a2);
                                    }
                                    i = i4;
                                }
                                this.f15798t.addView(linearLayout);
                            }
                        }
                        bsxn bsxn6 = bsut.f147192d;
                        if (bsxn6 == null) {
                            bsxn6 = bsxn.f147586d;
                        }
                        evi.m11175a(a, bsxn6, this.f15800v.f15935g, m11150a(i, bsye.f147664c));
                        this.f15798t.addView(a);
                    }
                    i++;
                }
                LinearLayout linearLayout2 = this.f15798t;
                bsxn bsxn7 = bsye.f147663b;
                if (bsxn7 == null) {
                    bsxn7 = bsxn.f147586d;
                }
                euz euz = this.f15800v;
                evi.m11175a(linearLayout2, bsxn7, euz.f15935g, adyg.m51399a(euz.f15937i, (int) C0126R.attr.asCardRoundedRipple, (int) C0126R.C0127drawable.as_card_rounded_ripple_light));
                this.f15797s.addOnLayoutChangeListener(new eux(this));
            }
        }
    }
}
