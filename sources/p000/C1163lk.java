package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: lk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1163lk {
    /* renamed from: a */
    public static Typeface m19265a(Context context, int i) {
        if (!context.isRestricted()) {
            return m19266a(context, i, new TypedValue(), 0, null, false);
        }
        return null;
    }

    /* renamed from: b */
    public static int m19270b(Resources resources, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        return resources.getColor(i, theme);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* renamed from: a */
    public static Typeface m19266a(Context context, int i, TypedValue typedValue, int i2, C1161li liVar, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = m19267a(context, resources, typedValue, i, i2, liVar, z);
        if (a != null || liVar != null) {
            return a;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0228, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0257, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0258, code lost:
        android.util.Log.e("ResourcesCompat", "Failed to parse xml resource " + r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026e, code lost:
        r8.mo15155b(-3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        r0.require(2, r12, "font-family");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r0.getName().equals("font-family") == false) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r1 = r3.obtainAttributes(android.util.Xml.asAttributeSet(r0), p000.C0970et.f15664b);
        r13 = r1.getString(r7);
        r12 = r1.getString(4);
        r11 = r1.getString(5);
        r15 = r1.getResourceId(r6, r7);
        r2 = r1.getInteger(2, r6);
        r14 = r1.getInteger(3, 500);
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r13 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        if (r12 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        if (r11 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r0.next() == 3) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        p000.C1155lc.m18915a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r15 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        r0 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r1 = r3.obtainTypedArray(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r1.length() == 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r0 = new java.util.ArrayList();
        r6 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        if (r1.getType(r7) == 1) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r0.add(p000.C1155lc.m18914a(r3.getStringArray(r15)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bc, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        if (r6 >= r1.length()) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        r15 = r1.getResourceId(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c8, code lost:
        if (r15 == 0) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        r0.add(p000.C1155lc.m18914a(r3.getStringArray(r15)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r0 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00df, code lost:
        r2 = new p000.C1154lb(new p000.C1193mm(r13, r12, r11, r0), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f1, code lost:
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
        if (r0.next() == 3) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0101, code lost:
        if (r0.getEventType() != 2) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010d, code lost:
        if (r0.getName().equals("font") == false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        r2 = r3.obtainAttributes(android.util.Xml.asAttributeSet(r0), p000.C0970et.f15665c);
        r11 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011f, code lost:
        if (r2.hasValue(8) != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0124, code lost:
        r17 = r2.getInt(r11, 400);
        r11 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r2.hasValue(6) != false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (r2.getInt(r11, 0) != 1) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013e, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0141, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0143, code lost:
        r11 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0149, code lost:
        if (r2.hasValue(9) != false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014b, code lost:
        r11 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        r13 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0153, code lost:
        if (r2.hasValue(7) != false) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0155, code lost:
        r13 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0158, code lost:
        r19 = r2.getString(r13);
        r20 = r2.getInt(r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0166, code lost:
        if (r2.hasValue(5) != false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0168, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016a, code lost:
        r13 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016b, code lost:
        r21 = r2.getResourceId(r13, 0);
        r2.getString(r13);
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (r0.next() != 3) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        r1.add(new p000.C1153la(r17, r18, r19, r20, r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0189, code lost:
        p000.C1155lc.m18915a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        p000.C1155lc.m18915a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a0, code lost:
        if (r1.isEmpty() != false) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a2, code lost:
        r2 = new p000.C1151kz((p000.C1153la[]) r1.toArray(new p000.C1153la[r1.size()]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b5, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b7, code lost:
        p000.C1155lc.m18915a(r0);
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bb, code lost:
        if (r2 != null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bd, code lost:
        android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c2, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c4, code lost:
        r8.mo15155b(-3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01da, code lost:
        return p000.C1171lr.m19559a(r22, r2, r23, r25, r26, r27, r28);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0257 A[ExcHandler: XmlPullParserException (r0v8 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:6:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:105:0x0214=Splitter:B:105:0x0214, B:39:0x00dc=Splitter:B:39:0x00dc} */
    /* renamed from: a */
    private static Typeface m19267a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C1161li liVar, boolean z) {
        int i3;
        TypedArray obtainTypedArray;
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i4 = i;
        int i5 = i2;
        C1161li liVar2 = liVar;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            String str = null;
            if (charSequence.startsWith("res/")) {
                Typeface typeface = (Typeface) C1171lr.f26626a.mo15546a(C1171lr.m19560a(resources2, i4, i5));
                if (typeface == null) {
                    try {
                        int i6 = 1;
                        int i7 = 0;
                        if (charSequence.toLowerCase().endsWith(".xml")) {
                            XmlResourceParser xml = resources2.getXml(i4);
                            while (true) {
                                int next = xml.next();
                                if (next == 2) {
                                    break;
                                } else if (next != 1) {
                                    i6 = 1;
                                    i7 = 0;
                                    str = null;
                                } else {
                                    throw new XmlPullParserException("No start tag found");
                                }
                            }
                        } else {
                            int i8 = 400;
                            FontFamily build = new FontFamily.Builder(new Font.Builder(resources2, i4).build()).build();
                            if ((i5 & 1) != 0) {
                                i8 = 700;
                            }
                            if ((i5 & 2) != 0) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            Typeface typeface2 = new Typeface.CustomFallbackBuilder(build).setStyle(new FontStyle(i8, i3)).build();
                            if (typeface2 != null) {
                                C1171lr.f26626a.mo15547a(C1171lr.m19560a(resources2, i4, i5), typeface2);
                            }
                            if (liVar2 != null) {
                                if (typeface2 == null) {
                                    liVar2.mo15155b(-3);
                                } else {
                                    liVar2.mo15156b(typeface2);
                                }
                            }
                            return typeface2;
                        }
                    } catch (XmlPullParserException e) {
                    } catch (IOException e2) {
                        Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence, e2);
                        if (liVar2 == null) {
                        }
                    } catch (Throwable th) {
                        obtainTypedArray.recycle();
                        throw th;
                    }
                } else {
                    if (liVar2 != null) {
                        liVar2.mo15156b(typeface);
                    }
                    return typeface;
                }
            } else if (liVar2 == null) {
                return null;
            } else {
                liVar2.mo15155b(-3);
                return null;
            }
        } else {
            throw new Resources.NotFoundException("Resource \"" + resources2.getResourceName(i4) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue2);
        }
    }

    /* renamed from: a */
    public static Drawable m19268a(Resources resources, int i, Resources.Theme theme) {
        int i2 = Build.VERSION.SDK_INT;
        return resources.getDrawable(i, theme);
    }

    /* renamed from: a */
    public static void m19269a(Context context, int i, C1161li liVar) {
        C1244oj.m19766a(liVar);
        if (context.isRestricted()) {
            liVar.mo15155b(-4);
        } else {
            m19266a(context, i, new TypedValue(), 0, liVar, false);
        }
    }
}
