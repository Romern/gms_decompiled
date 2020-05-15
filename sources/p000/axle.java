package p000;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.walletp2p.internal.zeroparty.Instrument;
import com.google.android.gms.walletp2p.internal.zeroparty.InstrumentCreationToken;
import java.util.List;

/* renamed from: axle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class axle extends abh {

    /* renamed from: a */
    private Instrument[] f96135a = new Instrument[0];

    /* renamed from: d */
    public Instrument f96136d;

    /* renamed from: e */
    private InstrumentCreationToken[] f96137e = new InstrumentCreationToken[0];

    public axle() {
        mo170a(true);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        Instrument[] instrumentArr = this.f96135a;
        int length = instrumentArr.length;
        if (i < length) {
            return (long) instrumentArr[i].hashCode();
        }
        return (long) this.f96137e[i - length].hashCode();
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f96135a.length + this.f96137e.length;
    }

    /* renamed from: a */
    public abstract void mo53197a(Instrument instrument);

    /* renamed from: a */
    public abstract void mo53198a(InstrumentCreationToken instrumentCreationToken);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new axld(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.walletp2p_instrument_row_layout, viewGroup, false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        int i2;
        axld axld = (axld) acm;
        int i3 = axld.f96129x;
        Context context = axld.f96132u.getContext();
        axld.f96131t.mo60205a("", axkz.m82688a(), false, true);
        axld.f96131t.setColorFilter((ColorFilter) null);
        Instrument[] instrumentArr = this.f96135a;
        if (i < instrumentArr.length) {
            Instrument instrument = instrumentArr[i];
            if (!chlq.m148935b()) {
                axld.f96131t.setDefaultImageResId(C0126R.C0127drawable.quantum_ic_credit_card_vd_theme_24);
                if (!stm.m36302d(instrument.f110824e)) {
                    axld.f96131t.mo60205a(instrument.f110824e, axkz.m82688a(), false, true);
                }
                axld.f96131t.setVisibility(0);
                axld.f96130s.setVisibility(8);
            } else {
                axld.f96130s.setVisibility(0);
                axld.f96131t.setVisibility(8);
            }
            int i4 = instrument.f110823d;
            if (i4 == 1 || i4 == 2) {
                i2 = azxe.m86324a(context, 16842806);
                axld.f96132u.setClickable(true);
                axld.f96132u.setOnClickListener(new axla(this, instrument));
                if (chlq.m148935b()) {
                    axld.f96130s.setClickable(true);
                    axld.f96130s.setOnClickListener(new axlb(this, instrument));
                    axld.f96130s.setEnabled(true);
                } else {
                    axld.f96131t.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                }
            } else {
                i2 = azxe.m86324a(context, 16842808);
                axld.f96132u.setClickable(false);
                axld.f96132u.setOnClickListener(null);
                if (chlq.m148935b()) {
                    axld.f96130s.setClickable(false);
                    axld.f96130s.setOnClickListener(null);
                    axld.f96130s.setEnabled(false);
                } else {
                    axld.f96131t.setColorFilter(C1133kh.m17843b(context, C0126R.color.walletp2p_instrument_icon_overlay), PorterDuff.Mode.SRC_ATOP);
                }
            }
            axld.f96134w.setText(instrument.f110821b);
            axld.f96134w.setTextColor(i2);
            if (!stm.m36302d(instrument.f110822c)) {
                axld.f96133v.setText(instrument.f110822c);
                axld.f96133v.setVisibility(0);
            } else {
                axld.f96133v.setVisibility(8);
            }
            if (!chlq.m148935b()) {
                return;
            }
            if (!instrument.f110820a.equals(this.f96136d.f110820a)) {
                axld.f96130s.setChecked(false);
            } else {
                axld.f96130s.setChecked(true);
            }
        } else {
            int a = azxe.m86324a(context, 16842806);
            InstrumentCreationToken instrumentCreationToken = this.f96137e[i - this.f96135a.length];
            axld.f96131t.setDefaultImageResId(C0126R.C0127drawable.quantum_ic_add_circle_outline_vd_theme_24);
            axld.f96131t.setVisibility(0);
            axld.f96131t.setColorFilter(a, PorterDuff.Mode.SRC_ATOP);
            axld.f96130s.setVisibility(8);
            axld.f96134w.setText(instrumentCreationToken.f110828b);
            axld.f96134w.setTextColor(a);
            axld.f96133v.setVisibility(8);
            axld.f96132u.setClickable(true);
            axld.f96132u.setOnClickListener(new axlc(this, instrumentCreationToken));
        }
    }

    /* renamed from: a */
    public final void mo53204a(List list, List list2) {
        this.f96135a = (Instrument[]) list.toArray(new Instrument[list.size()]);
        this.f96137e = (InstrumentCreationToken[]) list2.toArray(new InstrumentCreationToken[list2.size()]);
    }
}
