package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: aux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aux extends auo {

    /* renamed from: a */
    static final PorterDuff.Mode f2340a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public auv f2341b;

    /* renamed from: d */
    public boolean f2342d;

    /* renamed from: e */
    private PorterDuffColorFilter f2343e;

    /* renamed from: f */
    private ColorFilter f2344f;

    /* renamed from: g */
    private boolean f2345g;

    /* renamed from: h */
    private final float[] f2346h;

    /* renamed from: i */
    private final Matrix f2347i;

    /* renamed from: j */
    private final Rect f2348j;

    public aux() {
        this.f2342d = true;
        this.f2346h = new float[9];
        this.f2347i = new Matrix();
        this.f2348j = new Rect();
        this.f2341b = new auv();
    }

    /* renamed from: a */
    static int m2148a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return false;
        }
        C1173lt.m19609c(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            copyBounds(this.f2348j);
            if (this.f2348j.width() > 0 && this.f2348j.height() > 0) {
                ColorFilter colorFilter = this.f2344f;
                if (colorFilter == null) {
                    colorFilter = this.f2343e;
                }
                canvas.getMatrix(this.f2347i);
                this.f2347i.getValues(this.f2346h);
                float abs = Math.abs(this.f2346h[0]);
                float abs2 = Math.abs(this.f2346h[4]);
                float abs3 = Math.abs(this.f2346h[1]);
                float abs4 = Math.abs(this.f2346h[3]);
                if (abs3 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                } else if (abs4 != 0.0f) {
                    abs = 1.0f;
                    abs2 = 1.0f;
                }
                int width = this.f2348j.width();
                int height = this.f2348j.height();
                int min = Math.min(2048, (int) (((float) width) * abs));
                int min2 = Math.min(2048, (int) (((float) height) * abs2));
                if (min > 0 && min2 > 0) {
                    int save = canvas.save();
                    canvas.translate((float) this.f2348j.left, (float) this.f2348j.top);
                    int i = Build.VERSION.SDK_INT;
                    if (isAutoMirrored() && C1173lt.m19613g(this) == 1) {
                        canvas.translate((float) this.f2348j.width(), 0.0f);
                        canvas.scale(-1.0f, 1.0f);
                    }
                    this.f2348j.offsetTo(0, 0);
                    auv auv = this.f2341b;
                    Bitmap bitmap = auv.f2332f;
                    if (!(bitmap != null && min == bitmap.getWidth() && min2 == auv.f2332f.getHeight())) {
                        auv.f2332f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                        auv.f2337k = true;
                    }
                    if (this.f2342d) {
                        auv auv2 = this.f2341b;
                        if (!(!auv2.f2337k && auv2.f2333g == auv2.f2329c && auv2.f2334h == auv2.f2330d && auv2.f2336j == auv2.f2331e && auv2.f2335i == auv2.f2328b.getRootAlpha())) {
                            this.f2341b.mo2627a(min, min2);
                            auv auv3 = this.f2341b;
                            auv3.f2333g = auv3.f2329c;
                            auv3.f2334h = auv3.f2330d;
                            auv3.f2335i = auv3.f2328b.getRootAlpha();
                            auv3.f2336j = auv3.f2331e;
                            auv3.f2337k = false;
                        }
                    } else {
                        this.f2341b.mo2627a(min, min2);
                    }
                    auv auv4 = this.f2341b;
                    Rect rect = this.f2348j;
                    if (auv4.f2328b.getRootAlpha() >= 255 && colorFilter == null) {
                        paint = null;
                    } else {
                        if (auv4.f2338l == null) {
                            auv4.f2338l = new Paint();
                            auv4.f2338l.setFilterBitmap(true);
                        }
                        auv4.f2338l.setAlpha(auv4.f2328b.getRootAlpha());
                        auv4.f2338l.setColorFilter(colorFilter);
                        paint = auv4.f2338l;
                    }
                    canvas.drawBitmap(auv4.f2332f, (Rect) null, rect, paint);
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            }
            return;
        }
        drawable.draw(canvas);
    }

    public final int getAlpha() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2341b.f2328b.getRootAlpha();
        }
        return C1173lt.m19607b(drawable);
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return super.getChangingConfigurations() | this.f2341b.getChangingConfigurations();
        }
        return drawable.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2280c;
        return drawable != null ? C1173lt.m19610d(drawable) : this.f2344f;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f2280c != null) {
            int i = Build.VERSION.SDK_INT;
            return new auw(this.f2280c.getConstantState());
        }
        this.f2341b.f2327a = getChangingConfigurations();
        return this.f2341b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return (int) this.f2341b.f2328b.f2315f;
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return (int) this.f2341b.f2328b.f2314e;
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            return this.f2341b.f2331e;
        }
        return C1173lt.m19606a(drawable);
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            auv auv = this.f2341b;
            if (auv != null) {
                return auv.mo2628a() || ((colorStateList = this.f2341b.f2329c) != null && colorStateList.isStateful());
            }
            return false;
        }
    }

    public final Drawable mutate() {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2345g && super.mutate() == this) {
            this.f2341b = new auv(this.f2341b);
            this.f2345g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        auv auv = this.f2341b;
        ColorStateList colorStateList = auv.f2329c;
        boolean z = false;
        if (!(colorStateList == null || (mode = auv.f2330d) == null)) {
            this.f2343e = mo2637a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (auv.mo2628a()) {
            boolean a = auv.f2328b.f2313d.mo2584a(iArr);
            auv.f2337k |= a;
            if (a) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f2341b.f2328b.getRootAlpha() != i) {
            this.f2341b.f2328b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2341b.f2331e = z;
        } else {
            C1173lt.m19605a(drawable, z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            this.f2344f = colorFilter;
            invalidateSelf();
            return;
        }
        drawable.setColorFilter(colorFilter);
    }

    public final void setTint(int i) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            setTintList(ColorStateList.valueOf(i));
        } else {
            C1173lt.m19599a(drawable, i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            auv auv = this.f2341b;
            if (auv.f2329c != colorStateList) {
                auv.f2329c = colorStateList;
                this.f2343e = mo2637a(colorStateList, auv.f2330d);
                invalidateSelf();
                return;
            }
            return;
        }
        C1173lt.m19601a(drawable, colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            auv auv = this.f2341b;
            if (auv.f2330d != mode) {
                auv.f2330d = mode;
                this.f2343e = mo2637a(auv.f2329c, mode);
                invalidateSelf();
                return;
            }
            return;
        }
        C1173lt.m19604a(drawable, mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2280c;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a */
    public static aux m2149a(Resources resources, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        aux aux = new aux();
        aux.f2280c = C1163lk.m19268a(resources, i, theme);
        return aux;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PorterDuffColorFilter mo2637a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        int i;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f2280c;
        if (drawable == null) {
            auv auv = this.f2341b;
            auv.f2328b = new auu();
            TypedArray a = C1164ll.m19313a(resources2, theme2, attributeSet2, auf.f2259a);
            auv auv2 = this.f2341b;
            auu auu = auv2.f2328b;
            int a2 = C1164ll.m19312a(a, xmlPullParser2, "tintMode", 6, -1);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (a2 == 3) {
                mode = PorterDuff.Mode.SRC_OVER;
            } else if (a2 == 5) {
                mode = PorterDuff.Mode.SRC_IN;
            } else if (a2 != 9) {
                switch (a2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
            auv2.f2330d = mode;
            int i2 = 2;
            int i3 = 1;
            if (C1164ll.m19317a(xmlPullParser2, "tint")) {
                TypedValue typedValue = new TypedValue();
                a.getValue(1, typedValue);
                if (typedValue.type == 2) {
                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
                } else if (typedValue.type < 28 || typedValue.type > 31) {
                    Resources resources3 = a.getResources();
                    try {
                        XmlResourceParser xml = resources3.getXml(a.getResourceId(1, 0));
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        while (true) {
                            int next = xml.next();
                            if (next == 2) {
                                colorStateList = C1148kw.m18645a(resources3, xml, asAttributeSet, theme2);
                            } else if (next == 1) {
                                throw new XmlPullParserException("No start tag found");
                            }
                        }
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                        colorStateList = null;
                    }
                } else {
                    colorStateList = ColorStateList.valueOf(typedValue.data);
                }
            } else {
                colorStateList = null;
            }
            if (colorStateList != null) {
                auv2.f2329c = colorStateList;
            }
            boolean z = auv2.f2331e;
            if (C1164ll.m19317a(xmlPullParser2, "autoMirrored")) {
                z = a.getBoolean(5, z);
            }
            auv2.f2331e = z;
            auu.f2316g = C1164ll.m19308a(a, xmlPullParser2, "viewportWidth", 7, auu.f2316g);
            float a3 = C1164ll.m19308a(a, xmlPullParser2, "viewportHeight", 8, auu.f2317h);
            auu.f2317h = a3;
            if (auu.f2316g <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (a3 > 0.0f) {
                auu.f2314e = a.getDimension(3, auu.f2314e);
                float dimension = a.getDimension(2, auu.f2315f);
                auu.f2315f = dimension;
                if (auu.f2314e <= 0.0f) {
                    throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    auu.setAlpha(C1164ll.m19308a(a, xmlPullParser2, "alpha", 4, auu.getAlpha()));
                    String string = a.getString(0);
                    if (string != null) {
                        auu.f2319j = string;
                        auu.f2321l.put(string, auu);
                    }
                    a.recycle();
                    auv.f2327a = getChangingConfigurations();
                    auv.f2337k = true;
                    auv auv3 = this.f2341b;
                    auu auu2 = auv3.f2328b;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(auu2.f2313d);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    int i4 = eventType;
                    boolean z2 = true;
                    while (i4 != i3 && (xmlPullParser.getDepth() >= depth || i4 != 3)) {
                        if (i4 == i2) {
                            String name = xmlPullParser.getName();
                            aur aur = (aur) arrayDeque.peek();
                            i = depth;
                            if ("path".equals(name)) {
                                auq auq = new auq();
                                TypedArray a4 = C1164ll.m19313a(resources2, theme2, attributeSet2, auf.f2261c);
                                auq.f2281a = null;
                                if (C1164ll.m19317a(xmlPullParser2, "pathData")) {
                                    String string2 = a4.getString(0);
                                    if (string2 != null) {
                                        auq.f2307n = string2;
                                    }
                                    String string3 = a4.getString(2);
                                    if (string3 != null) {
                                        auq.f2306m = C1170lq.m19511a(string3);
                                    }
                                    auq.f2284d = C1164ll.m19315a(a4, xmlPullParser2, theme2, "fillColor", 1);
                                    auq.f2286f = C1164ll.m19308a(a4, xmlPullParser2, "fillAlpha", 12, auq.f2286f);
                                    int a5 = C1164ll.m19312a(a4, xmlPullParser2, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = auq.f2290j;
                                    if (a5 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (a5 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (a5 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    auq.f2290j = cap;
                                    int a6 = C1164ll.m19312a(a4, xmlPullParser2, "strokeLineJoin", 9, -1);
                                    Paint.Join join = auq.f2291k;
                                    if (a6 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (a6 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (a6 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    auq.f2291k = join;
                                    auq.f2292l = C1164ll.m19308a(a4, xmlPullParser2, "strokeMiterLimit", 10, auq.f2292l);
                                    auq.f2282b = C1164ll.m19315a(a4, xmlPullParser2, theme2, "strokeColor", 3);
                                    auq.f2285e = C1164ll.m19308a(a4, xmlPullParser2, "strokeAlpha", 11, auq.f2285e);
                                    auq.f2283c = C1164ll.m19308a(a4, xmlPullParser2, "strokeWidth", 4, auq.f2283c);
                                    auq.f2288h = C1164ll.m19308a(a4, xmlPullParser2, "trimPathEnd", 6, auq.f2288h);
                                    auq.f2289i = C1164ll.m19308a(a4, xmlPullParser2, "trimPathOffset", 7, auq.f2289i);
                                    auq.f2287g = C1164ll.m19308a(a4, xmlPullParser2, "trimPathStart", 5, auq.f2287g);
                                    auq.f2308o = C1164ll.m19312a(a4, xmlPullParser2, "fillType", 13, auq.f2308o);
                                }
                                a4.recycle();
                                aur.f2294b.add(auq);
                                if (auq.getPathName() != null) {
                                    auu2.f2321l.put(auq.getPathName(), auq);
                                }
                                int i5 = auv3.f2327a;
                                z2 = false;
                            } else if ("clip-path".equals(name)) {
                                aup aup = new aup();
                                if (C1164ll.m19317a(xmlPullParser2, "pathData")) {
                                    TypedArray a7 = C1164ll.m19313a(resources2, theme2, attributeSet2, auf.f2262d);
                                    String string4 = a7.getString(0);
                                    if (string4 != null) {
                                        aup.f2307n = string4;
                                    }
                                    String string5 = a7.getString(1);
                                    if (string5 != null) {
                                        aup.f2306m = C1170lq.m19511a(string5);
                                    }
                                    aup.f2308o = C1164ll.m19312a(a7, xmlPullParser2, "fillType", 2, 0);
                                    a7.recycle();
                                }
                                aur.f2294b.add(aup);
                                if (aup.getPathName() != null) {
                                    auu2.f2321l.put(aup.getPathName(), aup);
                                }
                                int i6 = auv3.f2327a;
                            } else if ("group".equals(name)) {
                                aur aur2 = new aur();
                                TypedArray a8 = C1164ll.m19313a(resources2, theme2, attributeSet2, auf.f2260b);
                                aur2.f2304l = null;
                                aur2.f2295c = C1164ll.m19308a(a8, xmlPullParser2, "rotation", 5, aur2.f2295c);
                                aur2.f2296d = a8.getFloat(1, aur2.f2296d);
                                aur2.f2297e = a8.getFloat(2, aur2.f2297e);
                                aur2.f2298f = C1164ll.m19308a(a8, xmlPullParser2, "scaleX", 3, aur2.f2298f);
                                aur2.f2299g = C1164ll.m19308a(a8, xmlPullParser2, "scaleY", 4, aur2.f2299g);
                                aur2.f2300h = C1164ll.m19308a(a8, xmlPullParser2, "translateX", 6, aur2.f2300h);
                                aur2.f2301i = C1164ll.m19308a(a8, xmlPullParser2, "translateY", 7, aur2.f2301i);
                                String string6 = a8.getString(0);
                                if (string6 != null) {
                                    aur2.f2305m = string6;
                                }
                                aur2.mo2602a();
                                a8.recycle();
                                aur.f2294b.add(aur2);
                                arrayDeque.push(aur2);
                                if (aur2.getGroupName() != null) {
                                    auu2.f2321l.put(aur2.getGroupName(), aur2);
                                }
                                int i7 = auv3.f2327a;
                            }
                        } else {
                            i = depth;
                            if (i4 == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        i4 = xmlPullParser.next();
                        resources2 = resources;
                        depth = i;
                        i3 = 1;
                        i2 = 2;
                    }
                    if (!z2) {
                        this.f2343e = mo2637a(auv.f2329c, auv.f2330d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
                }
            } else {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            }
        } else {
            C1173lt.m19603a(drawable, resources, xmlPullParser2, attributeSet2, theme2);
        }
    }

    public aux(auv auv) {
        this.f2342d = true;
        this.f2346h = new float[9];
        this.f2347i = new Matrix();
        this.f2348j = new Rect();
        this.f2341b = auv;
        this.f2343e = mo2637a(auv.f2329c, auv.f2330d);
    }
}
