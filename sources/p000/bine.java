package p000;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: bine */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bine extends Fragment {

    /* renamed from: a */
    public bimv f120970a;

    /* renamed from: b */
    public String f120971b;

    /* renamed from: c */
    public boolean f120972c = true;

    /* renamed from: d */
    public Integer f120973d;

    /* renamed from: e */
    public Integer f120974e;

    /* renamed from: f */
    public String f120975f;

    /* renamed from: g */
    public boolean f120976g;

    /* renamed from: h */
    public int f120977h;

    /* renamed from: i */
    public int f120978i;

    /* renamed from: j */
    public int f120979j;

    /* renamed from: k */
    private bind f120980k;

    /* renamed from: l */
    private bimo f120981l;

    /* renamed from: m */
    private bime f120982m;

    /* renamed from: n */
    private bilq f120983n;

    /* renamed from: o */
    private binb f120984o;

    /* renamed from: p */
    private bilv f120985p;

    /* renamed from: q */
    private ViewGroup f120986q;

    /* renamed from: r */
    private bilr f120987r;

    /* renamed from: s */
    private final ArrayDeque f120988s;

    /* renamed from: t */
    private bimy f120989t;

    /* renamed from: u */
    private bilk f120990u;

    /* renamed from: v */
    private bils f120991v;

    /* renamed from: w */
    private binc f120992w;

    public bine() {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f120988s = arrayDeque;
        arrayDeque.push(1);
    }

    /* renamed from: a */
    private final void m102595a(int i) {
        ViewGroup d = m102597d();
        if (i == 1) {
            d.addView(this.f120981l);
            d.addView(this.f120982m);
        } else if (i != 2) {
            if (i == 3) {
                bilq bilq = new bilq(getActivity(), this.f120990u);
                this.f120983n = bilq;
                d.addView(bilq);
                Iterator it = this.f120988s.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue != 3) {
                        m102596b(intValue);
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Tried to setup unknown state ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (!this.f120984o.isAdded() && ((Integer) this.f120988s.peekFirst()).intValue() == 2) {
            getActivity().getSupportFragmentManager().beginTransaction().add(C0126R.C0129id.container, this.f120984o, "search_fragment").commit();
        }
    }

    /* renamed from: b */
    private final void m102596b(int i) {
        ViewGroup d = m102597d();
        if (i == 1) {
            d.removeView(this.f120982m);
            d.removeView(this.f120981l);
        } else if (i != 2) {
            if (i == 3) {
                Iterator it = this.f120988s.iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue != 3) {
                        m102595a(intValue);
                    }
                }
                d.removeView(this.f120983n);
                return;
            }
            StringBuilder sb = new StringBuilder(43);
            sb.append("Tried to teardown unknown state ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (this.f120984o.isAdded()) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this.f120984o).commit();
        }
    }

    /* renamed from: d */
    private final ViewGroup m102597d() {
        if (this.f120986q == null) {
            this.f120986q = (ViewGroup) getActivity().findViewById(C0126R.C0129id.container);
        }
        return this.f120986q;
    }

    /* renamed from: c */
    public final void mo64792c() {
        Integer num;
        binb binb = this.f120984o;
        if (binb != null) {
            Integer num2 = this.f120973d;
            Integer num3 = this.f120974e;
            binb.f120961e = num2;
            binb.f120962f = num3;
        }
        bime bime = this.f120982m;
        if (bime != null && (num = this.f120973d) != null && Color.alpha(num.intValue()) >= 255) {
            bime.f120888d.setBackgroundColor(num.intValue());
            int color = bime.getResources().getColor(C0126R.color.text_white_alpha_87);
            int a = biha.m102383a(num.intValue(), color, bime.getResources().getColor(C0126R.color.text_black_alpha_87));
            ((TextView) bime.f120889e.findViewById(C0126R.C0129id.toolbar_title)).setTextColor(a);
            ImageButton imageButton = (ImageButton) bime.f120889e.findViewById(C0126R.C0129id.back_button);
            ImageButton imageButton2 = (ImageButton) bime.f120889e.findViewById(C0126R.C0129id.search_button);
            BitmapDrawable bitmapDrawable = (BitmapDrawable) bime.getResources().getDrawable(C0126R.C0127drawable.ic_arrow_back_white_24dp);
            if (a == color) {
                imageButton.setImageDrawable(bitmapDrawable);
                imageButton2.setImageDrawable(bime.getResources().getDrawable(C0126R.C0127drawable.ic_search_white_24dp));
                return;
            }
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
            imageButton.setImageDrawable(bitmapDrawable);
            imageButton2.setImageDrawable(bime.getResources().getDrawable(C0126R.C0127drawable.ic_search));
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        BitmapDrawable a;
        super.onActivityCreated(bundle);
        if (this.f120991v == null) {
            this.f120991v = this.f120980k.mo64784e();
        }
        bils bils = this.f120991v;
        bils.f120860d++;
        bils.f120857a.mo24801e();
        bils.f120859c.mo24801e();
        bils.f120858b.mo24801e();
        if (this.f120992w == null) {
            this.f120992w = this.f120980k.mo64785g();
        }
        if (this.f120987r == null) {
            this.f120987r = this.f120980k.mo64786h();
        }
        if (this.f120989t == null) {
            this.f120989t = new bimy(this, this.f120991v, this.f120992w, (LatLngBounds) sef.m35067a(getActivity().getIntent(), "latlng_bounds", LatLngBounds.CREATOR), aeie.f63413c, aema.f63505e, this.f120972c);
        }
        this.f120989t.f120940g = this.f120970a;
        if (this.f120990u == null) {
            this.f120990u = new bilk(this, this.f120991v, this.f120992w);
        }
        bilv bilv = (bilv) getChildFragmentManager().findFragmentByTag("map_view_lifecycle_fragment");
        if (bilv == null) {
            bilv = new bilv();
        }
        this.f120985p = bilv;
        this.f120981l = new bimo(getActivity(), this.f120989t, this.f120985p);
        this.f120982m = new bime(getActivity(), this.f120989t, this.f120972c);
        binb binb = (binb) getActivity().getSupportFragmentManager().findFragmentByTag("search_fragment");
        if (binb == null) {
            binb = new binb();
        }
        binb.f120957a = this;
        binb.f120958b = this.f120992w;
        binb.f120959c = this.f120971b;
        this.f120984o = binb;
        this.f120989t.f120941h = binb;
        mo64792c();
        if (!this.f120985p.isAdded()) {
            getChildFragmentManager().beginTransaction().add(this.f120985p, "map_view_lifecycle_fragment").commit();
            getChildFragmentManager().executePendingTransactions();
        }
        Iterator descendingIterator = this.f120988s.descendingIterator();
        while (descendingIterator.hasNext()) {
            m102595a(((Integer) descendingIterator.next()).intValue());
        }
        if (this.f120976g && (a = this.f120987r.mo64747a(this.f120975f, this.f120977h)) != null) {
            bimo bimo = this.f120981l;
            int i = this.f120978i;
            int i2 = this.f120979j;
            if (a.getBitmap() != null) {
                bimo.f120918g = i;
                bimo.f120919h = i2;
                bimo.f120917f = afgw.m53067a(a.getBitmap());
                afhb afhb = bimo.f120916e;
                if (afhb != null) {
                    afhb.mo34841a();
                    bimo.f120916e = null;
                }
            }
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof bind) {
            this.f120980k = (bind) activity;
        }
    }

    public final void onDetach() {
        super.onDetach();
        if (this.f120980k instanceof Activity) {
            this.f120980k = null;
        }
        bils bils = this.f120991v;
        if (bils != null) {
            int i = bils.f120860d - 1;
            bils.f120860d = i;
            if (i <= 0) {
                bils.f120857a.mo24803g();
                bils.f120859c.mo24803g();
                bils.f120858b.mo24803g();
            }
            if (bils.f120860d < 0) {
                throw new IllegalStateException("Received more disconnections than connects");
            }
        }
        this.f120985p.mo64749a(null);
        this.f120981l = null;
        this.f120982m = null;
        this.f120983n = null;
        this.f120984o = null;
        this.f120985p = null;
        this.f120986q = null;
        this.f120987r = null;
        this.f120989t.mo64774a((bimu) null);
        this.f120989t.mo64775a((bimx) null);
        bimy bimy = this.f120989t;
        bimy.f120940g = null;
        bimy.f120941h = null;
        this.f120990u.mo64738a((bilh) null);
    }

    public final void onPause() {
        super.onPause();
        bimy bimy = this.f120989t;
        if (bimy.f120936c.mo24805i()) {
            rkb rkb = bimy.f120936c;
            rkb.mo24795b(new aejk(rkb, bimy.f120948o));
        }
    }

    public final void onResume() {
        super.onResume();
        this.f120989t.mo64772a();
    }

    /* renamed from: a */
    public final void mo64787a() {
        this.f120988s.addFirst(2);
        m102595a(2);
    }

    /* renamed from: b */
    public final void mo64790b() {
        m102596b(((Integer) this.f120988s.removeFirst()).intValue());
        if (this.f120988s.isEmpty()) {
            binc binc = this.f120992w;
            binc.mo64782a();
            bxvd bxvd = binc.f120966a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bppw bppw = (bppw) bxvd.f164949b;
            bppw bppw2 = bppw.f138664f;
            bppw.f138668c = 0;
            bppw.f138666a |= 64;
            this.f120992w.mo64783a(getActivity());
            getActivity().supportFinishAfterTransition();
        }
    }

    /* renamed from: a */
    public final void mo64788a(aelh aelh) {
        bilk bilk = this.f120990u;
        bilk.mo64740b();
        aelh aelh2 = bilk.f120836g;
        if (aelh2 != null && !aelh2.equals(aelh)) {
            bilk.f120839j = null;
        }
        bilk.f120836g = aelh;
        bilk.f120837h = null;
        bilk.f120838i = null;
        bilk.mo64737a();
        this.f120988s.addFirst(3);
        m102595a(3);
    }

    /* renamed from: a */
    public final void mo64789a(LatLng latLng) {
        bilk bilk = this.f120990u;
        bilk.mo64740b();
        bilk.f120836g = null;
        bilk.f120837h = latLng;
        bilk.f120838i = null;
        bilk.mo64737a();
        String a = awm.m2271a(latLng.f79894a, latLng.f79895b);
        binc binc = bilk.f120833d;
        binc.mo64782a();
        bxvd bxvd = binc.f120966a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bppw bppw = (bppw) bxvd.f164949b;
        bppw bppw2 = bppw.f138664f;
        bppw.f138668c = 1;
        bppw.f138666a |= 64;
        bilk.mo64739a(a, 5);
        this.f120988s.addFirst(3);
        m102595a(3);
    }

    /* renamed from: b */
    public final void mo64791b(aelh aelh) {
        Intent intent = new Intent();
        sef.m35071a(aelh.mo8022o(), intent, "selected_place");
        if (aelh.mo8017j() != null) {
            intent.putExtra("third_party_attributions", aelh.mo8017j());
        }
        LatLngBounds latLngBounds = this.f120989t.f120943j;
        if (latLngBounds != null) {
            sef.m35071a(latLngBounds, intent, "final_latlng_bounds");
        }
        Activity activity = getActivity();
        this.f120992w.mo64783a(activity);
        activity.setResult(-1, intent);
        activity.finish();
    }
}
