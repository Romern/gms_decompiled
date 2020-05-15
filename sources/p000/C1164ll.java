package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1164ll {
    /* renamed from: a */
    public static float m19308a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return m19317a(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    /* renamed from: b */
    public static CharSequence m19318b(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: c */
    public static CharSequence[] m19319c(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: d */
    public static int m19320d(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    /* renamed from: a */
    public static int m19309a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId == 0 ? i2 : i;
    }

    /* renamed from: a */
    public static int m19310a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: a */
    public static int m19311a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m19317a(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m19312a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return m19317a(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    /* renamed from: a */
    public static TypedArray m19313a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        return resources.obtainAttributes(attributeSet, iArr);
    }

    /* renamed from: a */
    public static String m19314a(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float):float
     arg types: [android.content.res.TypedArray, android.content.res.XmlResourceParser, java.lang.String, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int):int
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):kx
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float):float */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int):int
     arg types: [android.content.res.TypedArray, android.content.res.XmlResourceParser, java.lang.String, int, int]
     candidates:
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float):float
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):kx
      ll.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int):int */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r10 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r10 == 89650992) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r10 == 1191572447) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r7.equals("selector") == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r7.equals("gradient") == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r10 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r10 == 0) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r10 != 1) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        if (r7.equals("gradient") == false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r7 = m19313a(r4, r1, r6, p000.C0970et.f15666d);
        r14 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startX", 8, 0.0f);
        r15 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startY", 9, 0.0f);
        r16 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endX", 10, 0.0f);
        r17 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endY", 11, 0.0f);
        r10 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerX", 3, 0.0f);
        r2 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerY", 4, 0.0f);
        r13 = m19312a(r7, (org.xmlpull.v1.XmlPullParser) r0, "type", 2, r5);
        r8 = m19311a(r7, r0, "startColor", r5);
        r18 = m19317a(r0, "centerColor");
        r3 = m19311a(r7, r0, "centerColor", 7);
        r11 = m19311a(r7, r0, "endColor", 1);
        r9 = m19312a(r7, (org.xmlpull.v1.XmlPullParser) r0, "tileMode", 6, r5);
        r20 = r2;
        r21 = m19308a(r7, (org.xmlpull.v1.XmlPullParser) r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r2 = r0.getDepth() + 1;
        r5 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        if (r7 == 1) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fc, code lost:
        r10 = r0.getDepth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        if (r10 >= r2) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0105, code lost:
        if (r7 != 3) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r7 != 2) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        if (r10 > r2) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r0.getName().equals("item") == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        r7 = m19313a(r4, r1, r6, p000.C0970et.f15667e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r15 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        if (r24 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        r15 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r15));
        r5.add(java.lang.Float.valueOf(r25));
        r10 = r22;
        r15 = r23;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0171, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0179, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0187, code lost:
        if (r12.size() <= 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0189, code lost:
        r0 = new p000.C1156ld(r12, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0190, code lost:
        if (r0 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0193, code lost:
        if (r18 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0195, code lost:
        r0 = new p000.C1156ld(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019b, code lost:
        r0 = new p000.C1156ld(r8, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a1, code lost:
        if (r13 == 1) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a4, code lost:
        if (r13 == 2) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a6, code lost:
        r1 = new android.graphics.LinearGradient(r14, r23, r16, r17, r0.f25824a, r0.f25825b, p000.C1157le.m18966a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bb, code lost:
        r1 = new android.graphics.SweepGradient(r22, r20, r0.f25824a, r0.f25825b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01c9, code lost:
        r4 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d0, code lost:
        if (r21 <= 0.0f) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d2, code lost:
        r1 = new android.graphics.RadialGradient(r3, r4, r21, r0.f25824a, r0.f25825b, p000.C1157le.m18966a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f0, code lost:
        r2 = new p000.C1149kx(r1, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f4, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fd, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0239, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023a, code lost:
        r0 = p000.C1148kw.m18645a(r4, r0, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0244, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2 = new p000.C1149kx(null, r0, r0.getDefaultColor());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0259, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0268 A[RETURN] */
    /* renamed from: a */
    public static C1149kx m19315a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C1149kx kxVar;
        TypedArray typedArray2 = typedArray;
        Resources.Theme theme2 = theme;
        int i2 = i;
        int i3 = 0;
        if (m19317a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray2.getValue(i2, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return C1149kx.m18715a(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                XmlResourceParser xml = resources.getXml(typedArray2.getResourceId(i2, 0));
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next == 2) {
                        break;
                    } else if (next != 1) {
                        i3 = 0;
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                }
            } catch (Exception e) {
                e = e;
                C1149kx kxVar2 = null;
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                kxVar = kxVar2;
                if (kxVar != null) {
                }
                return C1149kx.m18715a(0);
            }
            if (kxVar != null) {
                return kxVar;
            }
        }
        return C1149kx.m18715a(0);
    }

    /* renamed from: a */
    public static boolean m19316a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: a */
    public static boolean m19317a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }
}
