package p000;

import android.content.Intent;
import android.net.Uri;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.contactsheet.card.common.CardButton;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: tfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tfg implements ViewTreeObserver.OnPreDrawListener, C0038ax {

    /* renamed from: a */
    public boolean f45823a;

    /* renamed from: b */
    public final tim f45824b;

    /* renamed from: c */
    public final View f45825c;

    /* renamed from: d */
    public final TextView f45826d;

    /* renamed from: e */
    public final TextView f45827e;

    /* renamed from: f */
    public final TextView f45828f;

    /* renamed from: g */
    public final TextView f45829g;

    /* renamed from: h */
    public final TextView f45830h;

    /* renamed from: i */
    public final TextView f45831i;

    /* renamed from: j */
    public final TextView f45832j;

    /* renamed from: k */
    public final TextView f45833k;

    /* renamed from: l */
    public final ViewGroup f45834l;

    /* renamed from: m */
    public final ViewGroup f45835m;

    /* renamed from: n */
    public final ViewGroup f45836n;

    /* renamed from: o */
    public final ViewGroup f45837o;

    /* renamed from: p */
    public final ViewGroup f45838p;

    /* renamed from: q */
    public final ViewGroup f45839q;

    /* renamed from: r */
    public final ViewGroup f45840r;

    /* renamed from: s */
    public final ViewGroup f45841s;

    /* renamed from: t */
    public final ViewGroup f45842t;

    /* renamed from: u */
    public final ViewGroup f45843u;

    /* renamed from: v */
    public final CardButton f45844v;

    /* renamed from: w */
    private int f45845w;

    /* renamed from: x */
    private final tie f45846x;

    /* renamed from: y */
    private final TextView f45847y;

    /* renamed from: z */
    private final TextView f45848z;

    public tfg(View view, tie tie, tim tim) {
        this.f45846x = tie;
        this.f45824b = tim;
        this.f45825c = view;
        CardButton cardButton = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45844v = cardButton;
        cardButton.setOnClickListener(new tez(this));
        this.f45847y = (TextView) view.findViewById(C0126R.C0129id.introduction_title);
        this.f45834l = (ViewGroup) view.findViewById(C0126R.C0129id.introduction);
        this.f45826d = (TextView) view.findViewById(C0126R.C0129id.birthday_title);
        this.f45835m = (ViewGroup) view.findViewById(C0126R.C0129id.birthday);
        this.f45827e = (TextView) view.findViewById(C0126R.C0129id.gender_title);
        this.f45836n = (ViewGroup) view.findViewById(C0126R.C0129id.gender);
        this.f45828f = (TextView) view.findViewById(C0126R.C0129id.events_title);
        this.f45837o = (ViewGroup) view.findViewById(C0126R.C0129id.events);
        this.f45829g = (TextView) view.findViewById(C0126R.C0129id.links_title);
        this.f45838p = (ViewGroup) view.findViewById(C0126R.C0129id.links);
        this.f45830h = (TextView) view.findViewById(C0126R.C0129id.relations_title);
        this.f45839q = (ViewGroup) view.findViewById(C0126R.C0129id.relations);
        this.f45831i = (TextView) view.findViewById(C0126R.C0129id.instant_messaging_title);
        this.f45840r = (ViewGroup) view.findViewById(C0126R.C0129id.instant_messaging);
        this.f45832j = (TextView) view.findViewById(C0126R.C0129id.sip_address_title);
        this.f45841s = (ViewGroup) view.findViewById(C0126R.C0129id.sip_address);
        this.f45833k = (TextView) view.findViewById(C0126R.C0129id.user_defined_fields_title);
        this.f45842t = (ViewGroup) view.findViewById(C0126R.C0129id.user_defined_fields);
        this.f45848z = (TextView) view.findViewById(C0126R.C0129id.notes_title);
        this.f45843u = (ViewGroup) view.findViewById(C0126R.C0129id.notes);
        view.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [?, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: a */
    private final View m36900a(String str, ViewGroup viewGroup) {
        TextView textView = (TextView) LayoutInflater.from(this.f45825c.getContext()).inflate((int) C0126R.C0128layout.gm_about_card_entry_text_only, viewGroup, false);
        if (cgne.f187350a.mo6606a().mo84149c()) {
            TypedValue typedValue = new TypedValue();
            textView.getResources().getValue((int) C0126R.dimen.text_view_line_spacing, typedValue, true);
            textView.setLineSpacing(0.0f, typedValue.getFloat());
        }
        textView.setText(str);
        textView.setOnLongClickListener(new tfd(this, str));
        return textView;
    }

    /* renamed from: b */
    private final void m36905b(TextView textView) {
        if (textView != null && textView.getLineCount() > 5) {
            this.f45844v.setVisibility(0);
            mo26461a();
            textView.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    public final boolean onPreDraw() {
        if (!cgne.m146263e()) {
            return true;
        }
        m36905b((TextView) this.f45843u.findViewById(C0126R.C0129id.text));
        m36905b((TextView) this.f45834l.findViewById(C0126R.C0129id.text));
        return true;
    }

    /* renamed from: b */
    private static final void m36906b(TextView textView, ViewGroup viewGroup) {
        textView.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private final View m36901a(thy thy) {
        tff tff = new tff(this.f45825c.getContext());
        tff.mo26459a(thy.mo26549a());
        if (thy.mo26550b().mo66813a()) {
            tff.mo26460b((String) thy.mo26550b().mo66814b());
        }
        return tff;
    }

    /* renamed from: a */
    private final String m36902a(bzru bzru) {
        DateFormat dateFormat;
        if (bzru.f171203a == 0) {
            dateFormat = tew.m36880a(this.f45825c.getContext());
        } else {
            dateFormat = android.text.format.DateFormat.getLongDateFormat(this.f45825c.getContext());
        }
        Calendar instance = Calendar.getInstance();
        instance.set(bzru.f171203a, bzru.f171204b - 1, bzru.f171205c);
        dateFormat.setCalendar(instance);
        return dateFormat.format(instance.getTime());
    }

    /* renamed from: a */
    private final void m36903a(TextView textView) {
        textView.getViewTreeObserver().addOnPreDrawListener(this);
    }

    /* renamed from: a */
    public static final void m36904a(TextView textView, ViewGroup viewGroup) {
        textView.setVisibility(0);
        viewGroup.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo26461a() {
        this.f45823a = false;
        this.f45844v.mo17998a();
        if (this.f45834l.getChildCount() > 0) {
            ((TextView) this.f45834l.getChildAt(0).findViewById(C0126R.C0129id.text)).setMaxLines(5);
        }
        if (this.f45843u.getChildCount() > 0) {
            ((TextView) this.f45843u.getChildAt(0).findViewById(C0126R.C0129id.text)).setMaxLines(5);
        }
        m36906b(this.f45827e, this.f45836n);
        m36906b(this.f45828f, this.f45837o);
        m36906b(this.f45830h, this.f45839q);
        m36906b(this.f45831i, this.f45840r);
        m36906b(this.f45832j, this.f45841s);
        m36906b(this.f45833k, this.f45842t);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        boolean z;
        this.f45845w = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
        this.f45834l.removeAllViews();
        this.f45835m.removeAllViews();
        this.f45836n.removeAllViews();
        this.f45837o.removeAllViews();
        this.f45838p.removeAllViews();
        this.f45839q.removeAllViews();
        this.f45840r.removeAllViews();
        this.f45841s.removeAllViews();
        this.f45842t.removeAllViews();
        this.f45843u.removeAllViews();
        m36906b(this.f45826d, this.f45835m);
        m36906b(this.f45847y, this.f45834l);
        m36906b(this.f45827e, this.f45836n);
        m36906b(this.f45828f, this.f45837o);
        m36906b(this.f45829g, this.f45838p);
        m36906b(this.f45830h, this.f45839q);
        m36906b(this.f45831i, this.f45840r);
        m36906b(this.f45832j, this.f45841s);
        m36906b(this.f45833k, this.f45842t);
        m36906b(this.f45848z, this.f45843u);
        this.f45825c.setVisibility(8);
        if (bmxv.mo66813a()) {
            thi thi = (thi) bmxv.mo66814b();
            if (thi.mo26510a().mo66813a()) {
                this.f45834l.addView(m36900a(tey.m36889a((String) thi.mo26510a().mo66814b()).toString().trim(), this.f45834l));
                if (cgne.m146263e()) {
                    m36903a((TextView) this.f45834l.findViewById(C0126R.C0129id.text));
                }
                m36904a(this.f45847y, this.f45834l);
            }
            if (thi.mo26511b().mo66813a()) {
                this.f45835m.addView(m36900a(m36902a((bzru) thi.mo26511b().mo66814b()), this.f45835m));
                m36904a(this.f45826d, this.f45835m);
            }
            if (thi.mo26512c().mo66813a()) {
                ViewGroup viewGroup = this.f45836n;
                viewGroup.addView(m36900a((String) thi.mo26512c().mo66814b(), viewGroup));
                m36904a(this.f45827e, this.f45836n);
            }
            if (!thi.mo26513d().isEmpty()) {
                bnre i = thi.mo26513d().listIterator();
                while (i.hasNext()) {
                    bzgv bzgv = (bzgv) i.next();
                    tff tff = new tff(this.f45825c.getContext());
                    if ((bzgv.f169989a & 4) != 0) {
                        bzru bzru = bzgv.f169991c;
                        if (bzru == null) {
                            bzru = bzru.f171201d;
                        }
                        tff.mo26459a(m36902a(bzru));
                    }
                    if (!bzgv.f169992d.isEmpty()) {
                        tff.mo26460b(bzgv.f169992d);
                    }
                    this.f45837o.addView(tff);
                }
                m36904a(this.f45828f, this.f45837o);
            }
            boolean z2 = true;
            if (!thi.mo26514e().isEmpty()) {
                bngx e = thi.mo26514e();
                int i2 = 0;
                while (i2 < e.size()) {
                    ViewGroup viewGroup2 = this.f45838p;
                    ths ths = (ths) e.get(i2);
                    i2++;
                    int size = e.size();
                    TextView textView = (TextView) LayoutInflater.from(this.f45825c.getContext()).inflate((int) C0126R.C0128layout.gm_single_link, this.f45838p, false);
                    textView.setText(ths.mo26529a());
                    textView.setContentDescription(this.f45825c.getContext().getString(C0126R.string.link_content_description, Integer.valueOf(i2), Integer.valueOf(size), ths.mo26529a()));
                    int dimensionPixelSize = this.f45825c.getContext().getResources().getDimensionPixelSize(C0126R.dimen.gm_link_icon_size);
                    tie tie = this.f45846x;
                    String c = ths.mo26531c();
                    int i3 = this.f45845w;
                    this.f45845w = i3 + 1;
                    tie.mo26557a(c, i3, new tfa(this, dimensionPixelSize, textView));
                    textView.setOnClickListener(new tfb(this, new Intent("android.intent.action.VIEW", Uri.parse(tey.m36894b(ths.mo26530b())))));
                    textView.setOnLongClickListener(new tfc(this, ths));
                    viewGroup2.addView(textView);
                }
                m36904a(this.f45829g, this.f45838p);
            }
            if (!thi.mo26515f().isEmpty()) {
                bnre i4 = thi.mo26515f().listIterator();
                while (i4.hasNext()) {
                    this.f45839q.addView(m36901a((thy) i4.next()));
                }
                m36904a(this.f45830h, this.f45839q);
            }
            if (!thi.mo26516g().isEmpty()) {
                bnre i5 = thi.mo26516g().listIterator();
                while (i5.hasNext()) {
                    this.f45840r.addView(m36901a((thy) i5.next()));
                }
                m36904a(this.f45831i, this.f45840r);
            }
            if (!thi.mo26517h().isEmpty()) {
                bnre i6 = thi.mo26517h().listIterator();
                while (i6.hasNext()) {
                    this.f45841s.addView(m36901a((thy) i6.next()));
                }
                m36904a(this.f45832j, this.f45841s);
            }
            if (!thi.mo26518i().isEmpty()) {
                bnre i7 = thi.mo26518i().listIterator();
                while (i7.hasNext()) {
                    this.f45842t.addView(m36901a((thy) i7.next()));
                }
                m36904a(this.f45833k, this.f45842t);
            }
            if (thi.mo26519j().mo66813a()) {
                this.f45843u.addView(m36900a(tey.m36889a((String) thi.mo26519j().mo66814b()).toString().trim(), this.f45843u));
                if (cgne.m146263e()) {
                    m36903a((TextView) this.f45843u.findViewById(C0126R.C0129id.text));
                }
                m36904a(this.f45848z, this.f45843u);
            }
            if (thi.mo26510a().mo66813a() || thi.mo26511b().mo66813a() || !thi.mo26514e().isEmpty()) {
                z = true;
            } else {
                z = thi.mo26519j().mo66813a();
            }
            if (!thi.mo26512c().mo66813a() && thi.mo26513d().isEmpty() && thi.mo26515f().isEmpty() && thi.mo26516g().isEmpty() && thi.mo26517h().isEmpty() && thi.mo26518i().isEmpty()) {
                z2 = false;
            }
            if (z && z2) {
                this.f45844v.setVisibility(0);
                mo26461a();
            } else {
                this.f45844v.setVisibility(8);
            }
            if (!z && !z2) {
                this.f45825c.setVisibility(8);
            } else {
                this.f45825c.setVisibility(0);
            }
        }
    }
}
