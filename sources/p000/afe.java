package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.support.wearable.complications.ComplicationData;
import android.support.wearable.complications.ComplicationText;
import android.text.Layout;
import android.text.TextPaint;
import java.util.Objects;

/* renamed from: afe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afe {

    /* renamed from: A */
    public afc f371A;

    /* renamed from: B */
    private CharSequence f372B = "";

    /* renamed from: C */
    private boolean f373C;

    /* renamed from: D */
    private boolean f374D;

    /* renamed from: E */
    private final Rect f375E = new Rect();

    /* renamed from: F */
    private afg f376F;

    /* renamed from: a */
    public final Context f377a;

    /* renamed from: b */
    public ComplicationData f378b;

    /* renamed from: c */
    public final Rect f379c = new Rect();

    /* renamed from: d */
    public Drawable f380d;

    /* renamed from: e */
    public Drawable f381e;

    /* renamed from: f */
    public Drawable f382f;

    /* renamed from: g */
    public Drawable f383g;

    /* renamed from: h */
    public Drawable f384h;

    /* renamed from: i */
    public final afi f385i = new afi();

    /* renamed from: j */
    public final afi f386j = new afi();

    /* renamed from: k */
    public final afi f387k = new afi();

    /* renamed from: l */
    public final afj f388l = new afj();

    /* renamed from: m */
    public final afj f389m = new afj();

    /* renamed from: n */
    public final Rect f390n = new Rect();

    /* renamed from: o */
    public final RectF f391o = new RectF();

    /* renamed from: p */
    public final Rect f392p = new Rect();

    /* renamed from: q */
    public final Rect f393q = new Rect();

    /* renamed from: r */
    public final Rect f394r = new Rect();

    /* renamed from: s */
    public final Rect f395s = new Rect();

    /* renamed from: t */
    public final Rect f396t = new Rect();

    /* renamed from: u */
    public final RectF f397u = new RectF();

    /* renamed from: v */
    public afd f398v = null;

    /* renamed from: w */
    public afd f399w = null;

    /* renamed from: x */
    public TextPaint f400x = null;

    /* renamed from: y */
    public TextPaint f401y = null;

    /* renamed from: z */
    public afg f402z;

    public afe(Context context, afg afg, afg afg2) {
        this.f377a = context;
        mo565a(afg, afg2);
    }

    /* renamed from: b */
    private final void m636b() {
        afm afm;
        Layout.Alignment alignment;
        if (this.f378b != null && !this.f379c.isEmpty()) {
            this.f390n.set(0, 0, this.f379c.width(), this.f379c.height());
            this.f391o.set(0.0f, 0.0f, (float) this.f379c.width(), (float) this.f379c.height());
            ComplicationData complicationData = this.f378b;
            switch (complicationData.f1369b) {
                case 3:
                case 9:
                    afm = new afq();
                    break;
                case 4:
                    afm = new afo();
                    break;
                case 5:
                    if (this.f373C) {
                        if (complicationData.mo1724b() != null) {
                            afm = new afq();
                            break;
                        } else {
                            afm = new afk();
                            break;
                        }
                    } else {
                        afm = new afp();
                        break;
                    }
                case 6:
                    afm = new afk();
                    break;
                case 7:
                    afm = new afr();
                    break;
                case 8:
                    afm = new afl();
                    break;
                default:
                    afm = new afm();
                    break;
            }
            afm.mo591a(this.f379c.width(), this.f379c.height(), this.f378b);
            afm.mo600e(this.f375E);
            this.f397u.set(this.f375E);
            afm.mo587a(this.f392p);
            afm.mo598d(this.f393q);
            afm.mo588b(this.f394r);
            if (this.f378b.f1369b == 4) {
                alignment = afm.mo599e();
                afm.mo606h(this.f395s);
                this.f388l.mo581a(alignment);
                this.f388l.mo579a(afm.mo601f());
                afm.mo607i(this.f396t);
                this.f389m.mo581a(afm.mo603g());
                this.f389m.mo579a(afm.mo605h());
            } else {
                alignment = afm.mo589a();
                afm.mo602f(this.f395s);
                this.f388l.mo581a(alignment);
                this.f388l.mo579a(afm.mo593b());
                afm.mo604g(this.f396t);
                this.f389m.mo581a(afm.mo595c());
                this.f389m.mo579a(afm.mo597d());
            }
            if (alignment != Layout.Alignment.ALIGN_CENTER) {
                float height = ((float) this.f379c.height()) * 0.1f;
                this.f388l.mo578a(height / ((float) this.f395s.width()));
                this.f389m.mo578a(height / ((float) this.f395s.width()));
            } else {
                this.f388l.mo578a(0.0f);
                this.f389m.mo578a(0.0f);
            }
            Rect rect = new Rect();
            Rect rect2 = this.f390n;
            int max = Math.max(mo562a(this.f376F), mo562a(this.f402z));
            rect.set(rect2);
            double d = (double) ((float) max);
            Double.isNaN(d);
            int ceil = (int) Math.ceil((Math.sqrt(2.0d) - 4.0d) * d);
            rect.inset(ceil, ceil);
            if (!this.f395s.intersect(rect)) {
                this.f395s.setEmpty();
            }
            if (!this.f396t.intersect(rect)) {
                this.f396t.setEmpty();
            }
            if (!this.f392p.isEmpty()) {
                Rect rect3 = this.f392p;
                afn.m681a(rect3, rect3, 1.0f);
                afn.m687f(this.f392p, rect);
            }
            if (!this.f393q.isEmpty()) {
                Rect rect4 = this.f393q;
                afn.m681a(rect4, rect4, 0.95f);
                if (this.f378b.mo1730g() == 2) {
                    afn.m687f(this.f393q, rect);
                }
            }
            if (!this.f394r.isEmpty()) {
                Rect rect5 = this.f394r;
                afn.m681a(rect5, rect5, 1.0f);
            }
        }
    }

    /* renamed from: a */
    public final int mo562a(afg afg) {
        if (!this.f379c.isEmpty()) {
            return Math.min(Math.min(this.f379c.height(), this.f379c.width()) / 2, afg.f418p);
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo563a(afg afg, Rect rect) {
        if (!this.f379c.isEmpty()) {
            return Math.max(mo562a(afg) - Math.min(Math.min(rect.left, this.f379c.width() - rect.right), Math.min(rect.top, this.f379c.height() - rect.bottom)), 0);
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo564a() {
        afc afc = this.f371A;
        if (afc != null) {
            afc.mo552a();
        }
    }

    /* renamed from: a */
    public final void mo565a(afg afg, afg afg2) {
        this.f376F = afg;
        this.f402z = afg2;
        this.f398v = new afd(afg, false, false, false);
        this.f399w = new afd(afg2, true, false, false);
        m636b();
    }

    /* renamed from: a */
    public final void mo566a(Rect rect) {
        boolean z = true;
        if (this.f379c.width() == rect.width() && this.f379c.height() == rect.height()) {
            z = false;
        }
        this.f379c.set(rect);
        if (z) {
            m636b();
        }
    }

    /* renamed from: a */
    public final void mo567a(ComplicationData complicationData) {
        Icon icon;
        Icon icon2;
        Icon icon3;
        Icon icon4;
        if (!Objects.equals(this.f378b, complicationData)) {
            Icon icon5 = null;
            if (complicationData != null) {
                boolean z = false;
                boolean z2 = true;
                if (complicationData.f1369b != 10) {
                    this.f378b = complicationData;
                    this.f374D = false;
                } else if (!this.f374D) {
                    this.f374D = true;
                    aeo aeo = new aeo(3);
                    ComplicationText complicationText = new ComplicationText(this.f372B);
                    ComplicationData.m1404b("SHORT_TEXT", aeo.f346a);
                    aeo.f347b.putParcelable("SHORT_TEXT", complicationText);
                    this.f378b = aeo.mo539a();
                } else {
                    return;
                }
                Handler handler = new Handler(Looper.getMainLooper());
                this.f380d = null;
                this.f382f = null;
                this.f383g = null;
                this.f384h = null;
                this.f381e = null;
                ComplicationData complicationData2 = this.f378b;
                if (complicationData2 != null) {
                    icon5 = complicationData2.mo1728e();
                    ComplicationData complicationData3 = this.f378b;
                    ComplicationData.m1402a("ICON_BURN_IN_PROTECTION", complicationData3.f1369b);
                    icon4 = (Icon) complicationData3.mo1722a("ICON_BURN_IN_PROTECTION");
                    ComplicationData complicationData4 = this.f378b;
                    ComplicationData.m1402a("SMALL_IMAGE_BURN_IN_PROTECTION", complicationData4.f1369b);
                    icon3 = (Icon) complicationData4.mo1722a("SMALL_IMAGE_BURN_IN_PROTECTION");
                    icon2 = this.f378b.mo1729f();
                    ComplicationData complicationData5 = this.f378b;
                    ComplicationData.m1402a("LARGE_IMAGE", complicationData5.f1369b);
                    icon = (Icon) complicationData5.mo1722a("LARGE_IMAGE");
                } else {
                    icon4 = null;
                    icon3 = null;
                    icon2 = null;
                    icon = null;
                }
                if (icon5 != null) {
                    icon5.loadDrawableAsync(this.f377a, new aex(this), handler);
                    z = true;
                }
                if (icon4 != null) {
                    icon4.loadDrawableAsync(this.f377a, new aey(this), handler);
                    z = true;
                }
                if (icon2 != null) {
                    icon2.loadDrawableAsync(this.f377a, new aez(this), handler);
                    z = true;
                }
                if (icon3 != null) {
                    icon3.loadDrawableAsync(this.f377a, new afa(this), handler);
                } else {
                    z2 = z;
                }
                if (icon != null) {
                    icon.loadDrawableAsync(this.f377a, new afb(this), handler);
                } else if (!z2) {
                    mo564a();
                }
                m636b();
                return;
            }
            this.f378b = null;
        }
    }

    /* renamed from: a */
    public final void mo568a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f372B = charSequence.subSequence(0, charSequence.length());
        if (this.f374D) {
            this.f374D = false;
            mo567a(new aeo(10).mo539a());
        }
    }

    /* renamed from: a */
    public final void mo569a(boolean z) {
        if (this.f373C != z) {
            this.f373C = z;
            m636b();
        }
    }
}
