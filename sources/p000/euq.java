package p000;

import android.animation.LayoutTransition;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: euq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class euq extends ewo {

    /* renamed from: s */
    public final HorizontalScrollView f15776s;

    /* renamed from: t */
    public final LinearLayout f15777t;

    /* renamed from: u */
    public final Resources f15778u;

    /* renamed from: v */
    final /* synthetic */ euz f15779v;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: euz.a(android.view.View, int):void
     arg types: [android.widget.HorizontalScrollView, int]
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
    public euq(euz euz, View view) {
        super(view);
        this.f15779v = euz;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) view.findViewById(C0126R.C0129id.prompt_scroll_view);
        this.f15776s = horizontalScrollView;
        this.f15777t = (LinearLayout) horizontalScrollView.findViewById(C0126R.C0129id.prompt_carousel);
        this.f15778u = euz.f15937i.getResources();
        euz.m11156a((View) this.f15776s, 1);
    }

    /* renamed from: a */
    public static final void m11145a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: euz.a(android.view.View, int):void
     arg types: [android.widget.HorizontalScrollView, int]
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
        bzrt bzrt;
        boolean z;
        if (ewj.mo10503a() == 4) {
            if (mo323d() == this.f15779v.mo161a() - 1) {
                euz.m11156a((View) this.f15776s, 2);
            }
            bsvd bsvd = ((eul) ewj).f15759a;
            if (bsvd.f147232a == 2) {
                ArrayList arrayList = new ArrayList(((bsxf) bsvd.f147233b).f147544a);
                HashSet hashSet = new HashSet();
                this.f15777t.removeAllViews();
                m11145a(this.f15777t, -2);
                evi.m11172a();
                for (int i = 0; i < arrayList.size(); i++) {
                    bsxh bsxh = (bsxh) arrayList.get(i);
                    eum eum = new eum(this, hashSet, bsxh);
                    LinearLayout linearLayout = this.f15777t;
                    euz euz = this.f15779v;
                    etj etj = new etj(bsxh, linearLayout, euz.f15935g, eum, euz.f15938j);
                    adyg.m51402a(etj.f15670c, 3, eot.f15436a);
                    LinearLayout linearLayout2 = (LinearLayout) etj.f15670c.findViewById(C0126R.C0129id.prompt_item_summary);
                    MaterialButton materialButton = (MaterialButton) etj.f15670c.findViewById(C0126R.C0129id.prompt_item_button);
                    ImageView imageView = (ImageView) etj.f15670c.findViewById(C0126R.C0129id.prompt_remove_image);
                    Space space = (Space) etj.f15670c.findViewById(C0126R.C0129id.prompt_item_space);
                    evi.m11180a((TextView) etj.f15670c.findViewById(C0126R.C0129id.prompt_item_title), ((bsxh) etj.f15668a).f147555c);
                    bsxe bsxe = ((bsxh) etj.f15668a).f147556d;
                    if (bsxe == null) {
                        bsxe = bsxe.f147538c;
                    }
                    linearLayout2.removeAllViews();
                    int i2 = bsxe.f147540a;
                    View view = null;
                    if (i2 == 1) {
                        etf etf = new etf((bsxg) bsxe.f147541b, linearLayout2, etj.f15673f);
                        FadeInImageView fadeInImageView = (FadeInImageView) etf.f15670c.findViewById(C0126R.C0129id.prompt_summary_image);
                        int i3 = fadeInImageView.getLayoutParams().width;
                        fgt fgt = etf.f15673f;
                        bsxg bsxg = (bsxg) etf.f15668a;
                        int i4 = bsxg.f147547a & 1;
                        bswh bswh = bsxg.f147548b;
                        if (bswh == null) {
                            bswh = bswh.f147430g;
                        }
                        if (i4 == 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        evi.m11185a(fgt, fadeInImageView, z, bswh, i3);
                        evi.m11180a((TextView) etf.f15670c.findViewById(C0126R.C0129id.prompt_summary_caption), ((bsxg) etf.f15668a).f147549c);
                        evi.m11180a((TextView) etf.f15670c.findViewById(C0126R.C0129id.prompt_summary_description), ((bsxg) etf.f15668a).f147550d);
                        view = etf.f15670c;
                    } else if (i2 == 2) {
                        etg etg = new etg((bsxi) bsxe.f147541b, linearLayout2, etj.f15673f);
                        evi.m11180a((TextView) etg.f15670c.findViewById(C0126R.C0129id.prompt_info_lower), ((bsxi) etg.f15668a).f147564d);
                        evi.m11180a((TextView) etg.f15670c.findViewById(C0126R.C0129id.prompt_info_higher), ((bsxi) etg.f15668a).f147565e);
                        ProgressBar progressBar = (ProgressBar) etg.f15670c.findViewById(C0126R.C0129id.prompt_progress);
                        progressBar.setProgress((int) (((bsxi) etg.f15668a).f147562b * 100.0f));
                        bsxi bsxi = (bsxi) etg.f15668a;
                        if ((bsxi.f147561a & 2) != 0) {
                            bzrt = bsxi.f147563c;
                            if (bzrt == null) {
                                bzrt = bzrt.f171195e;
                            }
                        } else {
                            bzrt = null;
                        }
                        evi.m11177a(progressBar, bzrt, (bzrt) null);
                        view = etg.f15670c;
                    }
                    if (view != null) {
                        linearLayout2.addView(view);
                    }
                    if ((((bsxh) etj.f15668a).f147553a & 8) == 0 || etj.f15671d == null) {
                        space.setVisibility(8);
                        materialButton.setVisibility(8);
                    } else {
                        space.setVisibility(0);
                        materialButton.setVisibility(0);
                        materialButton.setText(((bsxh) etj.f15668a).f147557e);
                        bsxn bsxn = ((bsxh) etj.f15668a).f147558f;
                        if (bsxn == null) {
                            bsxn = bsxn.f147586d;
                        }
                        evi.m11174a(materialButton, bsxn, etj.f15671d);
                    }
                    bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
                    if (bsxl.f164950c) {
                        bsxl.mo74035c();
                        bsxl.f164950c = false;
                    }
                    bsxn bsxn2 = (bsxn) bsxl.f164949b;
                    bsxn2.f147588a |= 1;
                    bsxn2.f147589b = 90000;
                    evi.m11175a(imageView, (bsxn) bsxl.mo74062i(), new eth(etj), adyg.m51399a(etj.f15672e, (int) C0126R.attr.asCarouselRoundedRipple, (int) C0126R.C0127drawable.as_card_rounded_ripple_light));
                    View findViewById = etj.f15670c.findViewById(C0126R.C0129id.prompt_item_content);
                    bsxn bsxn3 = ((bsxh) etj.f15668a).f147558f;
                    if (bsxn3 == null) {
                        bsxn3 = bsxn.f147586d;
                    }
                    evi.m11175a(findViewById, bsxn3, etj.f15671d, adyg.m51399a(etj.f15672e, (int) C0126R.attr.asCarouselRoundedRipple, (int) C0126R.C0127drawable.as_card_rounded_ripple_light));
                    View view2 = etj.f15670c;
                    this.f15777t.addView(view2);
                    hashSet.add(view2);
                }
                this.f15776s.addOnLayoutChangeListener(new eup(this, this.f15779v.f15937i.getResources().getDimensionPixelOffset(C0126R.dimen.as_card_deck_outer_padding), this.f15779v.f15937i.getResources().getDimensionPixelSize(C0126R.dimen.as_card_max_width), hashSet));
                this.f15777t.setLayoutTransition(new LayoutTransition());
                evi.m11176a(this.f15777t, this.f15778u.getDimensionPixelSize(C0126R.dimen.as_carousel_children_spacing));
            }
        }
    }
}
