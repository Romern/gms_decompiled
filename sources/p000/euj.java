package p000;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.accountsettings.p007mg.poc.p008ui.common.FadeInImageView;

/* renamed from: euj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class euj extends ewo {

    /* renamed from: s */
    final /* synthetic */ euz f15755s;

    /* renamed from: t */
    private final CardView f15756t;

    /* renamed from: u */
    private final LinearLayout f15757u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public euj(euz euz, View view) {
        super(view);
        this.f15755s = euz;
        this.f15756t = (CardView) view.findViewById(C0126R.C0129id.card_view);
        this.f15757u = (LinearLayout) view.findViewById(C0126R.C0129id.dynamic_content);
    }

    /* renamed from: a */
    public final void mo10506a(ewj ewj) {
        View view;
        bsvs bsvs;
        bsvp bsvp;
        boolean z;
        bsvt bsvt;
        bswh bswh;
        int i = 8;
        if (ewj.mo10503a() == 8) {
            bsvd bsvd = ((euk) ewj).f15758a;
            this.f15757u.removeAllViews();
            if (bsvd.f147232a == 3) {
                bsvo bsvo = (bsvo) bsvd.f147233b;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                this.f15756t.setClipToOutline(false);
                int i3 = 0;
                while (i3 < bsvo.f147316a.size()) {
                    bsut bsut = (bsut) bsvo.f147316a.get(i3);
                    int i4 = bsut.f147190b;
                    int i5 = C0126R.C0129id.image;
                    int i6 = C0126R.C0129id.title;
                    int i7 = 1;
                    if (i4 == 14) {
                        LinearLayout linearLayout = this.f15757u;
                        euz euz = this.f15755s;
                        etd etd = new etd(bsut, linearLayout, euz.f15935g, euz.f15938j);
                        bsut bsut2 = (bsut) etd.f15668a;
                        if (bsut2.f147190b == 14) {
                            bsvt = (bsvt) bsut2.f147191c;
                        } else {
                            bsvt = bsvt.f147332e;
                        }
                        FadeInImageView fadeInImageView = (FadeInImageView) etd.f15670c.findViewById(C0126R.C0129id.image);
                        if ((1 & bsvt.f147334a) == 0) {
                            fadeInImageView.setVisibility(i);
                            LinearLayout linearLayout2 = (LinearLayout) etd.f15670c.findViewById(C0126R.C0129id.content);
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                            int dimensionPixelSize = etd.f15670c.getResources().getDimensionPixelSize(C0126R.dimen.as_clp_block_margin_start);
                            if (evi.m11187a(etd.f15672e)) {
                                layoutParams.rightMargin = dimensionPixelSize;
                            } else {
                                layoutParams.leftMargin = dimensionPixelSize;
                            }
                            linearLayout2.setLayoutParams(layoutParams);
                        } else {
                            fgt fgt = etd.f15673f;
                            bswh bswh2 = bsvt.f147335b;
                            if (bswh2 == null) {
                                bswh = bswh.f147430g;
                            } else {
                                bswh = bswh2;
                            }
                            evi.m11186a(fgt, fadeInImageView, true, bswh, -1, etd.f15670c.getResources().getDimension(C0126R.dimen.as_clp_list_item_block_image_padding));
                            evd.m11165a(fadeInImageView, adyg.m51405b(etd.f15672e, C0126R.attr.colorOnSurfaceVariant, C0126R.color.google_grey700));
                        }
                        evi.m11180a((TextView) etd.f15670c.findViewById(C0126R.C0129id.title), bsvt.f147336c);
                        evi.m11180a((TextView) etd.f15670c.findViewById(C0126R.C0129id.description), bsvt.f147337d);
                        if ((bsvt.f147334a & 4) == 0) {
                            View findViewById = etd.f15670c.findViewById(C0126R.C0129id.list_item);
                            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                            layoutParams2.height = etd.f15670c.getResources().getDimensionPixelSize(C0126R.dimen.as_clp_list_item_block_one_line_height);
                            findViewById.setLayoutParams(layoutParams2);
                        }
                        view = etd.f15670c;
                    } else if (i4 == 15) {
                        LinearLayout linearLayout3 = this.f15757u;
                        euz euz2 = this.f15755s;
                        eta eta = new eta(bsut, linearLayout3, euz2.f15935g, euz2.f15938j);
                        bsut bsut3 = (bsut) eta.f15668a;
                        if (bsut3.f147190b == 15) {
                            bsvp = (bsvp) bsut3.f147191c;
                        } else {
                            bsvp = bsvp.f147317b;
                        }
                        LinearLayout linearLayout4 = (LinearLayout) eta.f15670c.findViewById(C0126R.C0129id.carousel);
                        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) eta.f15670c.findViewById(C0126R.C0129id.carouselScrollView);
                        int i8 = Build.VERSION.SDK_INT;
                        evi.m11172a();
                        int i9 = 0;
                        while (i9 < bsvp.f147319a.size()) {
                            bsvq bsvq = (bsvq) bsvp.f147319a.get(i9);
                            View inflate = LayoutInflater.from(eta.f15672e).inflate((int) C0126R.C0128layout.as_card_clp_carousel_item, linearLayout4, z2);
                            FadeInImageView fadeInImageView2 = (FadeInImageView) inflate.findViewById(i5);
                            fgt fgt2 = eta.f15673f;
                            int i10 = bsvq.f147322a & i7;
                            bswh bswh3 = bsvq.f147323b;
                            if (bswh3 == null) {
                                bswh3 = bswh.f147430g;
                            }
                            if (i10 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            evi.m11184a(fgt2, fadeInImageView2, z, bswh3);
                            ((TextView) inflate.findViewById(i6)).setText(bsvq.f147324c);
                            inflate.setBackgroundDrawable(adyg.m51401a(eta.f15672e, (int) C0126R.attr.asCardBorder));
                            View findViewById2 = inflate.findViewById(C0126R.C0129id.tappable_view);
                            bsxn bsxn = bsvq.f147325d;
                            if (bsxn == null) {
                                bsxn = bsxn.f147586d;
                            }
                            evi.m11175a(findViewById2, bsxn, eta.f15671d, adyg.m51399a(eta.f15672e, (int) C0126R.attr.asClpCarouselRoundedRipple, (int) C0126R.C0127drawable.as_clp_carousel_rounded_ripple_light));
                            linearLayout4.addView(inflate);
                            i9++;
                            z2 = false;
                            i5 = C0126R.C0129id.image;
                            i6 = C0126R.C0129id.title;
                            i7 = 1;
                        }
                        evi.m11176a(linearLayout4, eta.f15672e.getResources().getDimensionPixelSize(C0126R.dimen.as_carousel_children_spacing));
                        horizontalScrollView.addOnLayoutChangeListener(new esz(eta, horizontalScrollView, linearLayout4));
                        view = eta.f15670c;
                    } else if (i4 == 17) {
                        LinearLayout linearLayout5 = this.f15757u;
                        euz euz3 = this.f15755s;
                        etc etc = new etc(bsut, linearLayout5, euz3.f15935g, euz3.f15938j);
                        TextView textView = (TextView) etc.f15670c.findViewById(C0126R.C0129id.title);
                        bsut bsut4 = (bsut) etc.f15668a;
                        if (bsut4.f147190b == 17) {
                            bsvs = (bsvs) bsut4.f147191c;
                        } else {
                            bsvs = bsvs.f147328c;
                        }
                        evi.m11180a(textView, bsvs.f147331b);
                        view = etc.f15670c;
                    } else if (i4 == 19) {
                        LinearLayout linearLayout6 = this.f15757u;
                        euz euz4 = this.f15755s;
                        view = new etb(bsut, linearLayout6, euz4.f15935g, euz4.f15938j).f15670c;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        this.f15757u.addView(view);
                        bsxn bsxn2 = bsut.f147192d;
                        if (bsxn2 == null) {
                            bsxn2 = bsxn.f147586d;
                        }
                        euz euz5 = this.f15755s;
                        evi.m11175a(view, bsxn2, euz5.f15935g, adyg.m51399a(euz5.f15937i, (int) C0126R.attr.asRipple, (int) C0126R.C0127drawable.as_ripple_light));
                    }
                    i3++;
                    i = 8;
                    z2 = false;
                }
            }
        }
    }
}
