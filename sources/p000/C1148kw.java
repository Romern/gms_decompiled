package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import com.felicanetworks.mfc.C0126R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: kw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1148kw {
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object[], java.lang.Object], assign insn: 0x00b7: CHECK_CAST  (r10v9 ? I:java.lang.Object[]) = (java.lang.Object[]) (r10v8 java.lang.Object) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static ColorStateList m18645a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20][];
            int[] iArr2 = new int[20];
            int i2 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    int[] iArr3 = new int[i2];
                    int[][] iArr4 = new int[i2][];
                    System.arraycopy(iArr2, 0, iArr3, 0, i2);
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                } else if (next != 2 || depth > depth2 || !xmlPullParser.getName().equals("item")) {
                    i = 1;
                } else {
                    int[] iArr5 = C0970et.f15663a;
                    TypedArray obtainAttributes = theme2 == null ? resources.obtainAttributes(attributeSet2, iArr5) : theme2.obtainStyledAttributes(attributeSet2, iArr5, 0, 0);
                    int color = obtainAttributes.getColor(0, -65281);
                    float f = 1.0f;
                    if (obtainAttributes.hasValue(i)) {
                        f = obtainAttributes.getFloat(i, 1.0f);
                    } else if (obtainAttributes.hasValue(2)) {
                        f = obtainAttributes.getFloat(2, 1.0f);
                    }
                    obtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr6 = new int[attributeCount];
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i3);
                        if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C0126R.attr.alpha)) {
                            int i5 = i4 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i3, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr6[i4] = attributeNameResource;
                            i4 = i5;
                        }
                        i3++;
                        i = 1;
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr6, i4);
                    int round = (16777215 & color) | (Math.round(((float) Color.alpha(color)) * f) << 24);
                    int i6 = i2 + 1;
                    if (i6 > iArr2.length) {
                        int[] iArr7 = new int[C1158lf.m19001a(i2)];
                        System.arraycopy(iArr2, 0, iArr7, 0, i2);
                        iArr2 = iArr7;
                    }
                    iArr2[i2] = round;
                    if (i6 > iArr.length) {
                        ? r10 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), C1158lf.m19001a(i2));
                        System.arraycopy(iArr, 0, r10, 0, i2);
                        iArr = r10;
                    }
                    iArr[i2] = trimStateSet;
                    iArr = iArr;
                    i2 = i6;
                }
            }
            int[] iArr32 = new int[i2];
            int[][] iArr42 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr32, 0, i2);
            System.arraycopy(iArr, 0, iArr42, 0, i2);
            return new ColorStateList(iArr42, iArr32);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
