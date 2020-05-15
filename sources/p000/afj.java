package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import java.util.Objects;

/* renamed from: afj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afj {

    /* renamed from: a */
    private static final Class[] f430a = {ForegroundColorSpan.class, LocaleSpan.class, SubscriptSpan.class, SuperscriptSpan.class, StrikethroughSpan.class, StyleSpan.class, TypefaceSpan.class, UnderlineSpan.class};

    /* renamed from: b */
    private final Rect f431b = new Rect();

    /* renamed from: c */
    private TextPaint f432c;

    /* renamed from: d */
    private String f433d;

    /* renamed from: e */
    private CharSequence f434e;

    /* renamed from: f */
    private CharSequence f435f;

    /* renamed from: g */
    private float f436g;

    /* renamed from: h */
    private StaticLayout f437h;

    /* renamed from: i */
    private int f438i = 17;

    /* renamed from: j */
    private int f439j = 1;

    /* renamed from: k */
    private final TextUtils.TruncateAt f440k = TextUtils.TruncateAt.END;

    /* renamed from: l */
    private Layout.Alignment f441l = Layout.Alignment.ALIGN_CENTER;

    /* renamed from: m */
    private final Rect f442m = new Rect();

    /* renamed from: n */
    private final Rect f443n = new Rect();

    /* renamed from: o */
    private boolean f444o = false;

    /* renamed from: p */
    private boolean f445p;

    /* renamed from: q */
    private boolean f446q;

    /* renamed from: a */
    public final void mo578a(float f) {
        if (this.f436g != f) {
            this.f436g = f;
            this.f445p = true;
        }
    }

    /* renamed from: a */
    public final void mo579a(int i) {
        if (this.f438i != i) {
            this.f438i = i;
            this.f446q = true;
        }
    }

    /* renamed from: a */
    public final void mo581a(Layout.Alignment alignment) {
        if (this.f441l != alignment) {
            this.f441l = alignment;
            this.f445p = true;
        }
    }

    /* renamed from: a */
    public final void mo582a(TextPaint textPaint) {
        this.f432c = textPaint;
        this.f445p = true;
    }

    /* renamed from: b */
    public final void mo586b(int i) {
        if (this.f439j != i) {
            this.f439j = i;
            this.f445p = true;
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final void mo580a(Canvas canvas, Rect rect) {
        float f;
        float f2;
        String str;
        if (!TextUtils.isEmpty(this.f435f)) {
            if (!(!this.f445p && this.f431b.width() == rect.width() && this.f431b.height() == rect.height())) {
                int width = rect.width();
                int height = rect.height();
                if (this.f432c == null) {
                    mo582a(new TextPaint());
                }
                int i = (int) (((float) width) * ((1.0f - this.f436g) + 0.0f));
                TextPaint textPaint = new TextPaint(this.f432c);
                textPaint.setTextSize(Math.min((float) (height / this.f439j), textPaint.getTextSize()));
                CharSequence charSequence = this.f435f;
                float f3 = (float) i;
                if (textPaint.measureText(charSequence, 0, charSequence.length()) > f3) {
                    TextUtils.TruncateAt truncateAt = this.f440k;
                    int i2 = 7;
                    i2 = 7;
                    if (!(truncateAt == null || truncateAt == TextUtils.TruncateAt.MARQUEE)) {
                        i2 = 8;
                    }
                    CharSequence subSequence = this.f435f.subSequence(0, Math.min(i2, this.f435f.length()));
                    for (float measureText = textPaint.measureText(subSequence, 0, subSequence.length()); measureText > f3; measureText = textPaint.measureText(subSequence, 0, subSequence.length())) {
                        textPaint.setTextSize(textPaint.getTextSize() - 4.0f);
                    }
                }
                CharSequence charSequence2 = this.f435f;
                String str2 = charSequence2;
                if (this.f444o) {
                    int i3 = afh.f424a;
                    if (charSequence2 != null) {
                        StringBuilder sb = new StringBuilder(charSequence2.length());
                        int length = charSequence2.length();
                        int i4 = 0;
                        boolean z = false;
                        while (i4 < length) {
                            int codePointAt = Character.codePointAt(charSequence2, i4);
                            if (!afh.m645a(codePointAt)) {
                                sb.appendCodePoint(codePointAt);
                            } else if (!z) {
                                sb.appendCodePoint(32);
                            }
                            z = afh.m645a(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        }
                        str = sb.toString();
                    } else {
                        str = null;
                    }
                    this.f433d = str;
                    str2 = str;
                }
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(str2, 0, str2.length(), textPaint, i);
                obtain.setBreakStrategy(1);
                obtain.setEllipsize(this.f440k);
                obtain.setHyphenationFrequency(2);
                obtain.setMaxLines(this.f439j);
                obtain.setAlignment(this.f441l);
                this.f437h = obtain.build();
                this.f445p = false;
                this.f446q = true;
            }
            if (this.f446q || !this.f431b.equals(rect)) {
                this.f431b.set(rect);
                boolean z2 = !mo585a();
                float width2 = (float) this.f431b.width();
                if (mo585a()) {
                    f = this.f436g;
                } else {
                    f = 0.0f;
                }
                int i5 = (int) (width2 * f);
                float width3 = (float) this.f431b.width();
                if (!mo585a()) {
                    f2 = this.f436g;
                } else {
                    f2 = 0.0f;
                }
                this.f442m.set(this.f431b.left + i5, this.f431b.top + ((int) (((float) this.f431b.height()) * 0.0f)), this.f431b.right - ((int) (width3 * f2)), this.f431b.bottom - ((int) (((float) this.f431b.height()) * 0.0f)));
                Gravity.apply(this.f438i, this.f437h.getWidth(), this.f437h.getHeight(), this.f442m, this.f443n, z2 ? 1 : 0);
                this.f446q = false;
            }
            canvas.save();
            canvas.translate((float) this.f443n.left, (float) this.f443n.top);
            this.f437h.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: a */
    public final void mo583a(CharSequence charSequence) {
        if (!Objects.equals(this.f434e, charSequence)) {
            this.f434e = charSequence;
            if (charSequence instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                Object[] spans = spannableStringBuilder.getSpans(0, charSequence.length(), Object.class);
                for (Object obj : spans) {
                    Class[] clsArr = f430a;
                    int length = clsArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (clsArr[i].isInstance(obj)) {
                                break;
                            }
                            i++;
                        } else {
                            spannableStringBuilder.removeSpan(obj);
                            break;
                        }
                    }
                }
                charSequence = spannableStringBuilder;
            }
            this.f435f = charSequence;
            this.f445p = true;
        }
    }

    /* renamed from: a */
    public final void mo584a(boolean z) {
        if (this.f444o != z) {
            this.f444o = z;
            if (!TextUtils.equals(this.f433d, this.f435f)) {
                this.f445p = true;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo585a() {
        return this.f437h.getParagraphDirection(0) == 1;
    }
}
