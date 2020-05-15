package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import java.net.URISyntaxException;

/* renamed from: tft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tft implements C0038ax {

    /* renamed from: a */
    public boolean f45878a;

    /* renamed from: b */
    public final CardButton f45879b;

    /* renamed from: c */
    public final tim f45880c;

    /* renamed from: d */
    public final ExpandableLinearLayout f45881d;

    /* renamed from: e */
    public final View f45882e;

    /* renamed from: f */
    private final int f45883f;

    /* renamed from: g */
    private int f45884g;

    /* renamed from: h */
    private final tie f45885h;

    /* renamed from: i */
    private final TextView f45886i;

    public tft(View view, int i, tie tie, tim tim) {
        this.f45882e = view;
        this.f45883f = i;
        this.f45885h = tie;
        this.f45880c = tim;
        this.f45881d = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.entries);
        this.f45886i = (TextView) view.findViewById(C0126R.C0129id.title);
        CardButton cardButton = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45879b = cardButton;
        cardButton.setOnClickListener(new tfn(this));
        view.setVisibility(8);
    }

    /* renamed from: a */
    private final bmxv m36917a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                if (parseUri.resolveActivity(this.f45882e.getContext().getPackageManager()) != null) {
                    return bmxv.m108566b(parseUri);
                }
            } catch (URISyntaxException e) {
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo26475a() {
        this.f45878a = false;
        this.f45879b.mo17998a();
        this.f45881d.mo18006a(3);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        int i;
        RelativeLayout relativeLayout;
        this.f45884g = this.f45883f;
        this.f45882e.setVisibility(8);
        this.f45881d.removeAllViews();
        if (bmxv.mo66813a() && ((bzia) bmxv.mo66814b()).f170142b.size() != 0) {
            bzia bzia = (bzia) bmxv.mo66814b();
            if (!bzia.f170141a.isEmpty()) {
                if (!bzia.f170143c.isEmpty()) {
                    this.f45886i.setContentDescription(bzia.f170143c);
                }
                this.f45886i.setText(bzia.f170141a);
                this.f45886i.setVisibility(0);
                i = 0;
            } else {
                this.f45886i.setVisibility(8);
                i = 0;
            }
            while (i < bzia.f170142b.size() && i < 20) {
                bzib bzib = (bzib) bzia.f170142b.get(i);
                if (!bzib.f170148b.isEmpty() || !bzib.f170149c.isEmpty()) {
                    ExpandableLinearLayout expandableLinearLayout = this.f45881d;
                    if (!cgne.m146261c()) {
                        relativeLayout = LayoutInflater.from(this.f45882e.getContext()).inflate((int) C0126R.C0128layout.gm_card_entry, (ViewGroup) this.f45881d, false);
                    } else if (cgnh.m146280b()) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) LayoutInflater.from(this.f45882e.getContext()).inflate((int) C0126R.C0128layout.gm_card_entry_bugfix, (ViewGroup) this.f45881d, false);
                        int dimensionPixelSize = relativeLayout2.getResources().getDimensionPixelSize(C0126R.dimen.gm_card_entry_padding);
                        relativeLayout2.getChildAt(1).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
                        relativeLayout = relativeLayout2;
                    } else {
                        relativeLayout = LayoutInflater.from(this.f45882e.getContext()).inflate((int) C0126R.C0128layout.gm_card_entry_bugfix, (ViewGroup) this.f45881d, false);
                    }
                    thb a = thb.m36953a();
                    if (!bzib.f170148b.isEmpty()) {
                        a.f45998a = bzib.f170148b;
                    }
                    if (!bzib.f170149c.isEmpty()) {
                        a.f45999b = bzib.f170149c;
                    }
                    bmxv a2 = m36917a(bzib.f170150d);
                    if (a2.mo66813a() && ((Intent) a2.mo66814b()).resolveActivity(this.f45882e.getContext().getPackageManager()) != null) {
                        a.f46006i = new tfo(this, a2);
                        a.f46007j = new tfp(this, a2);
                    }
                    bmxv a3 = m36917a(bzib.f170152f);
                    if (a3.mo66813a() && ((Intent) a3.mo66814b()).resolveActivity(this.f45882e.getContext().getPackageManager()) != null) {
                        a.f46008k = new tfq(this, a3);
                    }
                    if (!bzib.f170153g.isEmpty()) {
                        String str = bzib.f170153g;
                        a.f46004g = str;
                        a.f46003f = str;
                    }
                    if (!bzib.f170154h.isEmpty()) {
                        a.f46005h = bzib.f170154h;
                    }
                    int dimensionPixelSize2 = relativeLayout.getContext().getResources().getDimensionPixelSize(C0126R.dimen.gm_card_entry_icon_size);
                    if (!bzib.f170147a.isEmpty()) {
                        tie tie = this.f45885h;
                        String str2 = bzib.f170147a;
                        int i2 = this.f45884g;
                        this.f45884g = i2 + 1;
                        tie.mo26557a(str2, i2, new tfr(relativeLayout, dimensionPixelSize2));
                    }
                    if (!bzib.f170151e.isEmpty()) {
                        tie tie2 = this.f45885h;
                        String str3 = bzib.f170151e;
                        int i3 = this.f45884g;
                        this.f45884g = i3 + 1;
                        tie2.mo26557a(str3, i3, new tfs(relativeLayout, dimensionPixelSize2));
                    }
                    if (bzib.f170148b.isEmpty() && bzib.f170147a.isEmpty() && bzib.f170151e.isEmpty()) {
                        TextView textView = (TextView) relativeLayout.findViewById(C0126R.C0129id.subtext);
                        Context context = this.f45882e.getContext();
                        TypedValue typedValue = new TypedValue();
                        if (context.getTheme().resolveAttribute(C0126R.attr.textAppearanceBody2, typedValue, true) && typedValue.resourceId != 0) {
                            C1334rs.m20104a(textView, 2132018414);
                        }
                        textView.setTextColor(thh.m36965a(relativeLayout.getContext(), 16842806));
                    }
                    a.mo26506a(relativeLayout);
                    expandableLinearLayout.addView(relativeLayout);
                }
                i++;
            }
            if (this.f45881d.getChildCount() > 3) {
                this.f45879b.setVisibility(0);
                mo26475a();
            } else {
                this.f45879b.setVisibility(8);
            }
            if (this.f45881d.getChildCount() != 0) {
                this.f45882e.setVisibility(0);
            }
        }
    }
}
