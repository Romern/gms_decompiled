package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcp extends bcg {

    /* renamed from: g */
    private final StringBuilder f2992g = new StringBuilder(2);

    /* renamed from: h */
    private final RectF f2993h = new RectF();

    /* renamed from: i */
    private final Matrix f2994i = new Matrix();

    /* renamed from: j */
    private final Paint f2995j = new bcn();

    /* renamed from: k */
    private final Paint f2996k = new bco();

    /* renamed from: l */
    private final Map f2997l = new HashMap();

    /* renamed from: m */
    private final C1230nw f2998m = new C1230nw();

    /* renamed from: n */
    private final bal f2999n;

    /* renamed from: o */
    private final ayo f3000o;

    /* renamed from: p */
    private final axw f3001p;

    /* renamed from: q */
    private azy f3002q;

    /* renamed from: r */
    private azy f3003r;

    /* renamed from: s */
    private azy f3004s;

    /* renamed from: t */
    private azy f3005t;

    public bcp(ayo ayo, bcj bcj) {
        super(ayo, bcj);
        bba bba;
        bba bba2;
        baz baz;
        baz baz2;
        this.f3000o = ayo;
        this.f3001p = bcj.f2964b;
        bal d = bcj.f2978p.mo2972a();
        this.f2999n = d;
        d.mo2939a(this);
        mo2989a(this.f2999n);
        bbj bbj = bcj.f2979q;
        if (!(bbj == null || (baz2 = bbj.f2831a) == null)) {
            azy a = baz2.mo2972a();
            this.f3002q = a;
            a.mo2939a(this);
            mo2989a(this.f3002q);
        }
        if (!(bbj == null || (baz = bbj.f2832b) == null)) {
            azy a2 = baz.mo2972a();
            this.f3003r = a2;
            a2.mo2939a(this);
            mo2989a(this.f3003r);
        }
        if (!(bbj == null || (bba2 = bbj.f2833c) == null)) {
            azy a3 = bba2.mo2972a();
            this.f3004s = a3;
            a3.mo2939a(this);
            mo2989a(this.f3004s);
        }
        if (bbj != null && (bba = bbj.f2834d) != null) {
            azy a4 = bba.mo2972a();
            this.f3005t = a4;
            a4.mo2939a(this);
            mo2989a(this.f3005t);
        }
    }

    /* renamed from: a */
    private static final List m2695a(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    /* renamed from: b */
    public final void mo2991b(Canvas canvas, Matrix matrix, int i) {
        int i2;
        bao bao;
        String str;
        int i3;
        String str2;
        List list;
        List list2;
        float f;
        Canvas canvas2 = canvas;
        canvas.save();
        if (!this.f3000o.mo2897j()) {
            canvas.setMatrix(matrix);
        }
        bar bar = (bar) this.f2999n.mo2944f();
        bas bas = (bas) this.f3001p.f2509c.get(bar.f2796b);
        if (bas != null) {
            azy azy = this.f3002q;
            if (azy != null) {
                this.f2995j.setColor(((Integer) azy.mo2944f()).intValue());
            } else {
                this.f2995j.setColor(bar.f2801g);
            }
            azy azy2 = this.f3003r;
            if (azy2 != null) {
                this.f2996k.setColor(((Integer) azy2.mo2944f()).intValue());
            } else {
                this.f2996k.setColor(bar.f2802h);
            }
            azy azy3 = this.f2939f.f2773e;
            if (azy3 != null) {
                i2 = ((Integer) azy3.mo2944f()).intValue();
            } else {
                i2 = 100;
            }
            int i4 = (i2 * 255) / 100;
            this.f2995j.setAlpha(i4);
            this.f2996k.setAlpha(i4);
            azy azy4 = this.f3004s;
            if (azy4 != null) {
                this.f2996k.setStrokeWidth(((Float) azy4.mo2944f()).floatValue());
            } else {
                float a = ben.m2830a(matrix);
                Paint paint = this.f2996k;
                double d = bar.f2803i;
                double a2 = (double) ben.m2828a();
                Double.isNaN(a2);
                double d2 = d * a2;
                double d3 = (double) a;
                Double.isNaN(d3);
                paint.setStrokeWidth((float) (d2 * d3));
            }
            if (this.f3000o.mo2897j()) {
                float f2 = ((float) bar.f2797c) / 100.0f;
                float a3 = ben.m2830a(matrix);
                String str3 = bar.f2795a;
                float a4 = ((float) bar.f2799e) * ben.m2828a();
                List a5 = m2695a(str3);
                int size = a5.size();
                int i5 = 0;
                while (i5 < size) {
                    String str4 = (String) a5.get(i5);
                    float f3 = 0.0f;
                    int i6 = 0;
                    while (i6 < str4.length()) {
                        bat bat = (bat) this.f3001p.f2510d.mo15646f(bat.m2604a(str4.charAt(i6), bas.f2806a, bas.f2808c));
                        if (bat != null) {
                            double d4 = (double) f3;
                            double d5 = bat.f2810b;
                            list2 = a5;
                            f = a4;
                            double d6 = (double) f2;
                            Double.isNaN(d6);
                            double d7 = d5 * d6;
                            double a6 = (double) ben.m2828a();
                            Double.isNaN(a6);
                            double d8 = d7 * a6;
                            double d9 = (double) a3;
                            Double.isNaN(d9);
                            Double.isNaN(d4);
                            f3 = (float) (d4 + (d8 * d9));
                        } else {
                            list2 = a5;
                            f = a4;
                        }
                        i6++;
                        a4 = f;
                        a5 = list2;
                    }
                    List list3 = a5;
                    float f4 = a4;
                    canvas.save();
                    m2696a(bar.f2805k, canvas2, f3);
                    canvas2.translate(0.0f, (((float) i5) * f4) - ((((float) (size - 1)) * f4) / 2.0f));
                    int i7 = 0;
                    while (i7 < str4.length()) {
                        bat bat2 = (bat) this.f3001p.f2510d.mo15646f(bat.m2604a(str4.charAt(i7), bas.f2806a, bas.f2808c));
                        if (bat2 == null) {
                            str2 = str4;
                        } else {
                            if (this.f2997l.containsKey(bat2)) {
                                list = (List) this.f2997l.get(bat2);
                            } else {
                                List list4 = bat2.f2809a;
                                int size2 = list4.size();
                                ArrayList arrayList = new ArrayList(size2);
                                int i8 = 0;
                                while (i8 < size2) {
                                    arrayList.add(new azh(this.f3000o, this, (bbz) list4.get(i8)));
                                    i8++;
                                    list4 = list4;
                                    size2 = size2;
                                }
                                this.f2997l.put(bat2, arrayList);
                                list = arrayList;
                            }
                            int i9 = 0;
                            while (i9 < list.size()) {
                                Path e = ((azh) list.get(i9)).mo2933e();
                                e.computeBounds(this.f2993h, false);
                                this.f2994i.set(matrix);
                                String str5 = str4;
                                this.f2994i.preTranslate(0.0f, ((float) (-bar.f2800f)) * ben.m2828a());
                                this.f2994i.preScale(f2, f2);
                                e.transform(this.f2994i);
                                if (bar.f2804j) {
                                    m2697a(e, this.f2995j, canvas2);
                                    m2697a(e, this.f2996k, canvas2);
                                } else {
                                    m2697a(e, this.f2996k, canvas2);
                                    m2697a(e, this.f2995j, canvas2);
                                }
                                i9++;
                                str4 = str5;
                            }
                            str2 = str4;
                            float a7 = ((float) bat2.f2810b) * f2 * ben.m2828a() * a3;
                            float f5 = ((float) bar.f2798d) / 10.0f;
                            azy azy5 = this.f3005t;
                            if (azy5 != null) {
                                f5 += ((Float) azy5.mo2944f()).floatValue();
                            }
                            canvas2.translate(a7 + (f5 * a3), 0.0f);
                        }
                        i7++;
                        str4 = str2;
                    }
                    canvas.restore();
                    i5++;
                    a4 = f4;
                    a5 = list3;
                }
            } else {
                float a8 = ben.m2830a(matrix);
                ayo ayo = this.f3000o;
                String str6 = bas.f2806a;
                String str7 = bas.f2808c;
                Typeface typeface = null;
                if (ayo.getCallback() != null) {
                    if (ayo.f2556g == null) {
                        ayo.f2556g = new bao(ayo.getCallback());
                    }
                    bao = ayo.f2556g;
                } else {
                    bao = null;
                }
                if (bao != null) {
                    bay bay = bao.f2783a;
                    bay.f2818a = str6;
                    bay.f2819b = str7;
                    typeface = (Typeface) bao.f2784b.get(bay);
                    if (typeface == null) {
                        typeface = (Typeface) bao.f2785c.get(str6);
                        if (typeface == null) {
                            typeface = Typeface.createFromAsset(bao.f2786d, "fonts/" + str6 + bao.f2787e);
                            bao.f2785c.put(str6, typeface);
                        }
                        boolean contains = str7.contains("Italic");
                        boolean contains2 = str7.contains("Bold");
                        if (!contains || !contains2) {
                            i3 = contains ? 2 : contains2 ? 1 : 0;
                        } else {
                            i3 = 3;
                        }
                        if (typeface.getStyle() != i3) {
                            typeface = Typeface.create(typeface, i3);
                        }
                        bao.f2784b.put(bao.f2783a, typeface);
                    }
                }
                if (typeface != null) {
                    String str8 = bar.f2795a;
                    this.f2995j.setTypeface(typeface);
                    Paint paint2 = this.f2995j;
                    double d10 = bar.f2797c;
                    double a9 = (double) ben.m2828a();
                    Double.isNaN(a9);
                    paint2.setTextSize((float) (d10 * a9));
                    this.f2996k.setTypeface(this.f2995j.getTypeface());
                    this.f2996k.setTextSize(this.f2995j.getTextSize());
                    float a10 = ((float) bar.f2799e) * ben.m2828a();
                    List a11 = m2695a(str8);
                    int size3 = a11.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        String str9 = (String) a11.get(i10);
                        m2696a(bar.f2805k, canvas2, this.f2996k.measureText(str9));
                        canvas2.translate(0.0f, (((float) i10) * a10) - ((((float) (size3 - 1)) * a10) / 2.0f));
                        int i11 = 0;
                        while (i11 < str9.length()) {
                            int codePointAt = str9.codePointAt(i11);
                            int charCount = Character.charCount(codePointAt) + i11;
                            while (charCount < str9.length()) {
                                int codePointAt2 = str9.codePointAt(charCount);
                                if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 19) {
                                    break;
                                }
                                charCount += Character.charCount(codePointAt2);
                                codePointAt = (codePointAt * 31) + codePointAt2;
                            }
                            long j = (long) codePointAt;
                            if (this.f2998m.mo15544d(j)) {
                                str = (String) this.f2998m.mo15534a(j);
                            } else {
                                this.f2992g.setLength(0);
                                int i12 = i11;
                                while (i12 < charCount) {
                                    int codePointAt3 = str9.codePointAt(i12);
                                    this.f2992g.appendCodePoint(codePointAt3);
                                    i12 += Character.charCount(codePointAt3);
                                }
                                String sb = this.f2992g.toString();
                                this.f2998m.mo15540b(j, sb);
                                str = sb;
                            }
                            i11 += str.length();
                            if (bar.f2804j) {
                                m2698a(str, this.f2995j, canvas2);
                                m2698a(str, this.f2996k, canvas2);
                            } else {
                                m2698a(str, this.f2996k, canvas2);
                                m2698a(str, this.f2995j, canvas2);
                            }
                            float measureText = this.f2995j.measureText(str, 0, 1);
                            float f6 = ((float) bar.f2798d) / 10.0f;
                            azy azy6 = this.f3005t;
                            if (azy6 != null) {
                                f6 += ((Float) azy6.mo2944f()).floatValue();
                            }
                            canvas2.translate(measureText + (f6 * a8), 0.0f);
                        }
                        canvas.setMatrix(matrix);
                    }
                }
            }
            canvas.restore();
            return;
        }
        canvas.restore();
    }

    /* renamed from: a */
    private static final void m2696a(int i, Canvas canvas, float f) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            canvas.translate(-f, 0.0f);
        } else if (i2 == 2) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    /* renamed from: a */
    private static final void m2697a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Canvas.drawText(java.lang.String, int, int, float, float, android.graphics.Paint):void}
     arg types: [java.lang.String, int, int, int, int, android.graphics.Paint]
     candidates:
      ClspMth{android.graphics.Canvas.drawText(java.lang.CharSequence, int, int, float, float, android.graphics.Paint):void}
      ClspMth{android.graphics.Canvas.drawText(char[], int, int, float, float, android.graphics.Paint):void}
      ClspMth{android.graphics.Canvas.drawText(java.lang.String, int, int, float, float, android.graphics.Paint):void} */
    /* renamed from: a */
    private static final void m2698a(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    /* renamed from: a */
    public final void mo2924a(RectF rectF, Matrix matrix, boolean z) {
        super.mo2924a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, (float) this.f3001p.f2513g.width(), (float) this.f3001p.f2513g.height());
    }

    /* renamed from: a */
    public final void mo2926a(Object obj, beq beq) {
        super.mo2926a(obj, beq);
        if (obj == ayt.f2574a) {
            azy azy = this.f3002q;
            if (azy == null) {
                ban ban = new ban(beq);
                this.f3002q = ban;
                ban.mo2939a(this);
                mo2989a(this.f3002q);
                return;
            }
            azy.f2743d = beq;
        } else if (obj == ayt.f2575b) {
            azy azy2 = this.f3003r;
            if (azy2 == null) {
                ban ban2 = new ban(beq);
                this.f3003r = ban2;
                ban2.mo2939a(this);
                mo2989a(this.f3003r);
                return;
            }
            azy2.f2743d = beq;
        } else if (obj == ayt.f2588o) {
            azy azy3 = this.f3004s;
            if (azy3 == null) {
                ban ban3 = new ban(beq);
                this.f3004s = ban3;
                ban3.mo2939a(this);
                mo2989a(this.f3004s);
                return;
            }
            azy3.f2743d = beq;
        } else if (obj == ayt.f2589p) {
            azy azy4 = this.f3005t;
            if (azy4 == null) {
                ban ban4 = new ban(beq);
                this.f3005t = ban4;
                ban4.mo2939a(this);
                mo2989a(this.f3005t);
                return;
            }
            azy4.f2743d = beq;
        }
    }
}
