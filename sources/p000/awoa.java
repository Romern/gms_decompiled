package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.List;

/* renamed from: awoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awoa extends abh implements awob, bjxu {

    /* renamed from: a */
    public final List f94694a;

    /* renamed from: d */
    public awnz f94695d;

    /* renamed from: e */
    final RecyclerView f94696e;

    /* renamed from: f */
    public awny f94697f;

    /* renamed from: g */
    private final Context f94698g;

    /* renamed from: h */
    private final LayoutInflater f94699h;

    /* renamed from: i */
    private final bjxv f94700i;

    /* renamed from: j */
    private int f94701j;

    public awoa(Context context, List list, RecyclerView recyclerView, bjxv bjxv) {
        this.f94698g = context;
        this.f94694a = list;
        this.f94696e = recyclerView;
        this.f94700i = bjxv;
        this.f94699h = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f94694a.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new awny((CardView) LayoutInflater.from(this.f94698g).inflate((int) C0126R.C0128layout.wallet_view_instrument_details, viewGroup, false), this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.RelativeLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        bmno bmno;
        bmnr bmnr;
        boolean z;
        awny awny = (awny) acm;
        bmfq bmfq = (bmfq) this.f94694a.get(i);
        awny.f94684E = bmfq;
        int i2 = awny.f94679F;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) awny.f94686s.getLayoutParams();
        int i3 = 0;
        if (i == this.f94694a.size() - 1) {
            marginLayoutParams.bottomMargin = (int) this.f94698g.getResources().getDimension(C0126R.dimen.wallet_card_view_page_margin);
        } else {
            marginLayoutParams.bottomMargin = 0;
        }
        awny.f94688u.setText(bmfq.f129146d);
        int id = awny.f94688u.getId();
        int size = awny.f94689v.size();
        for (int i4 = 0; i4 < size; i4++) {
            awny.f94687t.removeView((View) awny.f94689v.get(i4));
        }
        awny.f94689v.clear();
        if (bmfq.f129147e.size() != 0) {
            bxwc bxwc = bmfq.f129147e;
            int size2 = bxwc.size();
            for (int i5 = 0; i5 < size2; i5++) {
                InfoMessageView infoMessageView = (InfoMessageView) this.f94699h.inflate((int) C0126R.C0128layout.wallet_view_instrument_description, (ViewGroup) awny.f94687t, false);
                infoMessageView.mo72003a((bmnr) bxwc.get(i5));
                infoMessageView.f152084h = this;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) infoMessageView.getLayoutParams();
                layoutParams.addRule(3, id);
                infoMessageView.setLayoutParams(layoutParams);
                id = this.f94700i.mo65614a();
                infoMessageView.setId(id);
                awny.f94687t.addView(infoMessageView);
                awny.f94689v.add(infoMessageView);
            }
        }
        int size3 = awny.f94690w.size();
        for (int i6 = 0; i6 < size3; i6++) {
            awny.f94687t.removeView((View) awny.f94690w.get(i6));
        }
        awny.f94690w.clear();
        bwhn bwhn = bmfq.f129150h;
        if (bwhn == null) {
            bwhn = bwhn.f159531f;
        }
        if (bwhn.f159534b.size() <= 0) {
            awny.f94691x.setVisibility(8);
        } else {
            Drawable mutate = awny.f94691x.getDrawable().mutate();
            int i7 = Build.VERSION.SDK_INT;
            C1173lt.m19601a(mutate, bkfr.m105606d(this.f94698g, (int) C0126R.attr.walletCardViewPageErrorColor));
            awny.f94691x.setImageDrawable(mutate);
            awny.f94691x.setVisibility(0);
            bwhn bwhn2 = bmfq.f129150h;
            if (bwhn2 == null) {
                bwhn2 = bwhn.f159531f;
            }
            bxwc bxwc2 = bwhn2.f159534b;
            int size4 = bxwc2.size();
            for (int i8 = 0; i8 < size4; i8++) {
                bwhs bwhs = (bwhs) bxwc2.get(i8);
                if ((bwhs.f159554a & 8) != 0) {
                    TextView textView = (TextView) this.f94699h.inflate((int) C0126R.C0128layout.wallet_view_instrument_alert, (ViewGroup) awny.f94687t, false);
                    bwht bwht = bwhs.f159556c;
                    if (bwht == null) {
                        bwht = bwht.f159561d;
                    }
                    textView.setText(bwht.f159565c);
                    textView.setTextColor(bkfr.m105606d(this.f94698g, (int) C0126R.attr.walletCardViewPageErrorColor));
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                    layoutParams2.addRule(3, id);
                    textView.setLayoutParams(layoutParams2);
                    id = this.f94700i.mo65614a();
                    textView.setId(id);
                    awny.f94687t.addView(textView);
                    awny.f94690w.add(textView);
                }
            }
        }
        if (this.f94701j == 0 && this.f94696e.getWidth() > 0) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) awny.f94687t.getLayoutParams();
            this.f94701j = (((this.f94696e.getWidth() - C1260oz.m19820a(marginLayoutParams)) - C1260oz.m19822b(marginLayoutParams)) - C1260oz.m19820a(layoutParams3)) - C1260oz.m19822b(layoutParams3);
        }
        ImageWithCaptionView imageWithCaptionView = awny.f94692y;
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) imageWithCaptionView.getLayoutParams();
        layoutParams4.width = this.f94701j;
        double d = (double) this.f94701j;
        Double.isNaN(d);
        layoutParams4.height = (int) (d * 0.625d);
        layoutParams4.addRule(3, id);
        imageWithCaptionView.setLayoutParams(layoutParams4);
        if ((bmfq.f129143a & 2) != 0) {
            bmno = bmfq.f129145c;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
        } else {
            bmno = null;
        }
        imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
        bmfp bmfp = bmfq.f129148f;
        if (bmfp == null) {
            bmfp = bmfp.f129133e;
        }
        if (bmfp.f129137c.size() == 0 && (bmfq.f129143a & 32) == 0) {
            awny.f94693z.setVisibility(8);
            awny.f94680A.setVisibility(8);
        } else {
            awny.f94693z.setVisibility(0);
            awny.f94680A.setVisibility(0);
        }
        bmfp bmfp2 = bmfq.f129148f;
        if (bmfp2 == null) {
            bmfp2 = bmfp.f129133e;
        }
        if (bmfp2.f129137c.size() == 0) {
            awny.f94681B.setVisibility(8);
        } else {
            awny.f94681B.removeAllViews();
            awny.f94681B.setVisibility(0);
            bmfp bmfp3 = bmfq.f129148f;
            if (bmfp3 == null) {
                bmfp3 = bmfp.f129133e;
            }
            bxwc bxwc3 = bmfp3.f129137c;
            int size5 = bxwc3.size();
            for (int i9 = 0; i9 < size5; i9++) {
                bmfl bmfl = (bmfl) bxwc3.get(i9);
                Button button = (Button) this.f94699h.inflate((int) C0126R.C0128layout.wallet_view_card_action_bar_button, awny.f94681B, false);
                if ((bmfl.f129118a & 128) != 0) {
                    bwhm bwhm = bmfl.f129124g;
                    if (bwhm == null) {
                        bwhm = bwhm.f159522h;
                    }
                    bmnr bmnr2 = bwhm.f159526c;
                    if (bmnr2 == null) {
                        bmnr2 = bmnr.f130153o;
                    }
                    button.setText(bmnr2.f130159e);
                } else {
                    button.setText(bmfl.f129119b);
                }
                button.setTextColor(bkfr.m105600c(this.f94698g));
                button.setOnClickListener(awny);
                button.setId(this.f94700i.mo65614a());
                bmfp bmfp4 = bmfq.f129148f;
                if (bmfp4 == null) {
                    bmfp4 = bmfp.f129133e;
                }
                if (bmfp4.f129138d || bmfl.f129125h) {
                    z = false;
                } else {
                    z = true;
                }
                button.setEnabled(z);
                awny.f94681B.addView(button);
            }
        }
        if ((bmfq.f129143a & 32) == 0) {
            awny.f94682C.setVisibility(8);
            awny.f94683D.setVisibility(8);
        } else {
            bmfp bmfp5 = bmfq.f129149g;
            if (bmfp5 == null) {
                bmfp5 = bmfp.f129133e;
            }
            if (bmfp5.f129137c.size() > 0) {
                bxwc bxwc4 = bmfp5.f129137c;
                int size6 = bxwc4.size();
                String[] strArr = new String[size6];
                for (int i10 = 0; i10 < size6; i10++) {
                    strArr[i10] = ((bmfl) bxwc4.get(i10)).f129119b;
                }
                ArrayAdapter arrayAdapter = new ArrayAdapter(this.f94698g, 17367048, strArr);
                arrayAdapter.setDropDownViewResource(C0126R.C0128layout.wallet_view_instrument_rank_spinner);
                awny.f94682C.setAdapter((SpinnerAdapter) arrayAdapter);
                awny.f94682C.f110306a = bmfp5.f129135a == 2 ? ((Integer) bmfp5.f129136b).intValue() : 0;
                awny.f94682C.setSelection(bmfp5.f129135a == 2 ? ((Integer) bmfp5.f129136b).intValue() : 0);
                awny.f94682C.setOnItemSelectedListener(awny);
                awny.f94682C.setVisibility(0);
                awny.f94682C.setEnabled(true ^ bmfp5.f129138d);
            } else {
                awny.f94682C.setVisibility(8);
            }
            InfoMessageView infoMessageView2 = awny.f94683D;
            if (bmfp5.f129135a == 3) {
                bmnr = (bmnr) bmfp5.f129136b;
            } else {
                bmnr = bmnr.f130153o;
            }
            infoMessageView2.mo72003a(bmnr);
            InfoMessageView infoMessageView3 = awny.f94683D;
            if (bmfp5.f129135a != 3) {
                i3 = 8;
            }
            infoMessageView3.setVisibility(i3);
        }
        awny.mo52350b(this.f94696e.isEnabled());
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        awnz awnz = this.f94695d;
        if (awnz != null) {
            Fragment fragment = (Fragment) awnz;
            if (fragment.getFragmentManager().findFragmentByTag("PaymentMethodsFragmentwebViewDialog") == null) {
                bkgf.m105678a(str, ((bkbr) awnz).f123961aF).show(fragment.getFragmentManager(), "PaymentMethodsFragmentwebViewDialog");
            }
        }
    }
}
