package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0973ew {

    /* renamed from: b */
    private static final int[] f15912b = {0, 4, 8};

    /* renamed from: c */
    private static final SparseIntArray f15913c;

    /* renamed from: a */
    public final HashMap f15914a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15913c = sparseIntArray;
        int[] iArr = C0974ex.f15960a;
        sparseIntArray.append(79, 25);
        f15913c.append(80, 26);
        f15913c.append(82, 29);
        f15913c.append(83, 30);
        f15913c.append(89, 36);
        f15913c.append(88, 35);
        f15913c.append(61, 4);
        f15913c.append(60, 3);
        f15913c.append(58, 1);
        f15913c.append(97, 6);
        f15913c.append(98, 7);
        f15913c.append(68, 17);
        f15913c.append(69, 18);
        f15913c.append(70, 19);
        f15913c.append(0, 27);
        f15913c.append(84, 32);
        f15913c.append(85, 33);
        f15913c.append(67, 10);
        f15913c.append(66, 9);
        f15913c.append(101, 13);
        f15913c.append(ErrorInfo.TYPE_SDU_FAILED, 16);
        f15913c.append(102, 14);
        f15913c.append(99, 11);
        f15913c.append(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, 15);
        f15913c.append(100, 12);
        f15913c.append(92, 40);
        f15913c.append(77, 39);
        f15913c.append(76, 41);
        f15913c.append(91, 42);
        f15913c.append(75, 20);
        f15913c.append(90, 37);
        f15913c.append(65, 5);
        f15913c.append(78, 60);
        f15913c.append(87, 60);
        f15913c.append(81, 60);
        f15913c.append(59, 60);
        f15913c.append(57, 60);
        f15913c.append(5, 24);
        f15913c.append(7, 28);
        f15913c.append(25, 31);
        f15913c.append(26, 8);
        f15913c.append(6, 34);
        f15913c.append(8, 2);
        f15913c.append(3, 23);
        f15913c.append(4, 21);
        f15913c.append(2, 22);
        f15913c.append(15, 43);
        f15913c.append(28, 44);
        f15913c.append(23, 45);
        f15913c.append(24, 46);
        f15913c.append(20, 47);
        f15913c.append(21, 48);
        f15913c.append(16, 49);
        f15913c.append(17, 50);
        f15913c.append(18, 51);
        f15913c.append(19, 52);
        f15913c.append(27, 53);
        f15913c.append(93, 54);
        f15913c.append(71, 55);
        f15913c.append(94, 56);
        f15913c.append(72, 57);
        f15913c.append(95, 58);
        f15913c.append(73, 59);
        f15913c.append(1, 38);
    }

    /* renamed from: a */
    private static int m11208a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: b */
    public final void mo10544b(int i, int i2) {
        HashMap hashMap = this.f15914a;
        Integer valueOf = Integer.valueOf((int) C0126R.C0129id.text_view);
        if (!hashMap.containsKey(valueOf)) {
            this.f15914a.put(valueOf, new C0972ev());
        }
        C0972ev evVar = (C0972ev) this.f15914a.get(valueOf);
        if (i != 3) {
            evVar.f15856n = i2;
            evVar.f15857o = -1;
            evVar.f15858p = -1;
            evVar.f15811D = 0;
            return;
        }
        evVar.f15854l = i2;
        evVar.f15855m = -1;
        evVar.f15858p = -1;
        evVar.f15810C = 0;
    }

    /* renamed from: c */
    public final void mo10546c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f15914a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap = this.f15914a;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                C0972ev evVar = (C0972ev) this.f15914a.get(valueOf);
                C0971eu euVar = (C0971eu) childAt.getLayoutParams();
                evVar.mo10522a(euVar);
                childAt.setLayoutParams(euVar);
                childAt.setVisibility(evVar.f15814G);
                int i2 = Build.VERSION.SDK_INT;
                childAt.setAlpha(evVar.f15825R);
                childAt.setRotationX(evVar.f15828U);
                childAt.setRotationY(evVar.f15829V);
                childAt.setScaleX(evVar.f15830W);
                childAt.setScaleY(evVar.f15831X);
                childAt.setPivotX(evVar.f15832Y);
                childAt.setPivotY(evVar.f15833Z);
                childAt.setTranslationX(evVar.f15835aa);
                childAt.setTranslationY(evVar.f15836ab);
                int i3 = Build.VERSION.SDK_INT;
                childAt.setTranslationZ(evVar.f15837ac);
                if (evVar.f15826S) {
                    childAt.setElevation(evVar.f15827T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0972ev evVar2 = (C0972ev) this.f15914a.get(num);
            if (evVar2.f15834a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0971eu b = ConstraintLayout.m1170b();
                evVar2.mo10522a(b);
                constraintLayout.addView(guideline, b);
            }
        }
    }

    /* renamed from: a */
    public final C0972ev mo10539a(int i) {
        HashMap hashMap = this.f15914a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.f15914a.put(valueOf, new C0972ev());
        }
        return (C0972ev) this.f15914a.get(valueOf);
    }

    /* renamed from: b */
    public final void mo10545b(ConstraintLayout constraintLayout) {
        mo10546c(constraintLayout);
        constraintLayout.f980c = null;
    }

    /* renamed from: a */
    public final void mo10540a(int i, float f) {
        mo10539a(i).f15849g = f;
        mo10539a(i).f15848f = -1;
        mo10539a(i).f15847e = -1;
    }

    /* renamed from: a */
    public final void mo10541a(int i, int i2) {
        HashMap hashMap = this.f15914a;
        Integer valueOf = Integer.valueOf((int) C0126R.C0129id.instrument_selector_view);
        if (!hashMap.containsKey(valueOf)) {
            this.f15914a.put(valueOf, new C0972ev());
        }
        C0972ev evVar = (C0972ev) this.f15914a.get(valueOf);
        if (i2 == 3) {
            evVar.f15854l = i;
            evVar.f15855m = -1;
        } else {
            evVar.f15855m = i;
            evVar.f15854l = -1;
        }
        evVar.f15858p = -1;
    }

    /* renamed from: a */
    public final void mo10542a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    C0972ev evVar = new C0972ev();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C0974ex.f15961b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        int i3 = f15913c.get(index);
                        if (i3 != 60) {
                            switch (i3) {
                                case 1:
                                    evVar.f15858p = m11208a(obtainStyledAttributes, index, evVar.f15858p);
                                    break;
                                case 2:
                                    evVar.f15811D = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15811D);
                                    break;
                                case 3:
                                    evVar.f15857o = m11208a(obtainStyledAttributes, index, evVar.f15857o);
                                    break;
                                case 4:
                                    evVar.f15856n = m11208a(obtainStyledAttributes, index, evVar.f15856n);
                                    break;
                                case 5:
                                    evVar.f15865w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    evVar.f15866x = obtainStyledAttributes.getDimensionPixelOffset(index, evVar.f15866x);
                                    break;
                                case 7:
                                    evVar.f15867y = obtainStyledAttributes.getDimensionPixelOffset(index, evVar.f15867y);
                                    break;
                                case 8:
                                    evVar.f15812E = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15812E);
                                    break;
                                case 9:
                                    evVar.f15856n = m11208a(obtainStyledAttributes, index, evVar.f15862t);
                                    break;
                                case 10:
                                    evVar.f15861s = m11208a(obtainStyledAttributes, index, evVar.f15861s);
                                    break;
                                case 11:
                                    evVar.f15818K = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15818K);
                                    break;
                                case 12:
                                    evVar.f15819L = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15819L);
                                    break;
                                case 13:
                                    evVar.f15815H = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15815H);
                                    break;
                                case 14:
                                    evVar.f15817J = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15817J);
                                    break;
                                case 15:
                                    evVar.f15820M = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15820M);
                                    break;
                                case 16:
                                    evVar.f15816I = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15816I);
                                    break;
                                case 17:
                                    evVar.f15847e = obtainStyledAttributes.getDimensionPixelOffset(index, evVar.f15847e);
                                    break;
                                case 18:
                                    evVar.f15848f = obtainStyledAttributes.getDimensionPixelOffset(index, evVar.f15848f);
                                    break;
                                case 19:
                                    evVar.f15849g = obtainStyledAttributes.getFloat(index, evVar.f15849g);
                                    break;
                                case 20:
                                    evVar.f15863u = obtainStyledAttributes.getFloat(index, evVar.f15863u);
                                    break;
                                case 21:
                                    evVar.f15845c = obtainStyledAttributes.getLayoutDimension(index, evVar.f15845c);
                                    break;
                                case 22:
                                    evVar.f15814G = obtainStyledAttributes.getInt(index, evVar.f15814G);
                                    evVar.f15814G = f15912b[evVar.f15814G];
                                    break;
                                case 23:
                                    evVar.f15844b = obtainStyledAttributes.getLayoutDimension(index, evVar.f15844b);
                                    break;
                                case 24:
                                    evVar.f15808A = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15808A);
                                    break;
                                case 25:
                                    evVar.f15850h = m11208a(obtainStyledAttributes, index, evVar.f15850h);
                                    break;
                                case 26:
                                    evVar.f15851i = m11208a(obtainStyledAttributes, index, evVar.f15851i);
                                    break;
                                case 27:
                                    evVar.f15868z = obtainStyledAttributes.getInt(index, evVar.f15868z);
                                    break;
                                case 28:
                                    evVar.f15809B = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15809B);
                                    break;
                                case 29:
                                    evVar.f15852j = m11208a(obtainStyledAttributes, index, evVar.f15852j);
                                    break;
                                case 30:
                                    evVar.f15853k = m11208a(obtainStyledAttributes, index, evVar.f15853k);
                                    break;
                                case 31:
                                    evVar.f15813F = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15813F);
                                    break;
                                case 32:
                                    evVar.f15859q = m11208a(obtainStyledAttributes, index, evVar.f15859q);
                                    break;
                                case 33:
                                    evVar.f15860r = m11208a(obtainStyledAttributes, index, evVar.f15860r);
                                    break;
                                case 34:
                                    evVar.f15810C = obtainStyledAttributes.getDimensionPixelSize(index, evVar.f15810C);
                                    break;
                                case 35:
                                    evVar.f15855m = m11208a(obtainStyledAttributes, index, evVar.f15855m);
                                    break;
                                case 36:
                                    evVar.f15854l = m11208a(obtainStyledAttributes, index, evVar.f15854l);
                                    break;
                                case FelicaException.TYPE_NOT_CLOSED:
                                    evVar.f15864v = obtainStyledAttributes.getFloat(index, evVar.f15864v);
                                    break;
                                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                                    evVar.f15846d = obtainStyledAttributes.getResourceId(index, evVar.f15846d);
                                    break;
                                case FelicaException.TYPE_USED_BY_OTHER_APP:
                                    evVar.f15822O = obtainStyledAttributes.getFloat(index, evVar.f15822O);
                                    break;
                                case FelicaException.TYPE_PUSH_FAILED:
                                    evVar.f15821N = obtainStyledAttributes.getFloat(index, evVar.f15821N);
                                    break;
                                case 41:
                                    evVar.f15823P = obtainStyledAttributes.getInt(index, evVar.f15823P);
                                    break;
                                case FelicaException.TYPE_ALREADY_ACTIVATED:
                                    evVar.f15824Q = obtainStyledAttributes.getInt(index, evVar.f15824Q);
                                    break;
                                case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                    evVar.f15825R = obtainStyledAttributes.getFloat(index, evVar.f15825R);
                                    break;
                                case FelicaException.TYPE_RESET_FAILED:
                                    evVar.f15826S = true;
                                    evVar.f15827T = obtainStyledAttributes.getFloat(index, evVar.f15827T);
                                    break;
                                case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                    evVar.f15828U = obtainStyledAttributes.getFloat(index, evVar.f15828U);
                                    break;
                                case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                    evVar.f15829V = obtainStyledAttributes.getFloat(index, evVar.f15829V);
                                    break;
                                case 47:
                                    evVar.f15830W = obtainStyledAttributes.getFloat(index, evVar.f15830W);
                                    break;
                                case 48:
                                    evVar.f15831X = obtainStyledAttributes.getFloat(index, evVar.f15831X);
                                    break;
                                case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                                    evVar.f15832Y = obtainStyledAttributes.getFloat(index, evVar.f15832Y);
                                    break;
                                case 50:
                                    evVar.f15833Z = obtainStyledAttributes.getFloat(index, evVar.f15833Z);
                                    break;
                                case 51:
                                    evVar.f15835aa = obtainStyledAttributes.getFloat(index, evVar.f15835aa);
                                    break;
                                case 52:
                                    evVar.f15836ab = obtainStyledAttributes.getFloat(index, evVar.f15836ab);
                                    break;
                                case 53:
                                    evVar.f15837ac = obtainStyledAttributes.getFloat(index, evVar.f15837ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f15913c.get(index));
                                    break;
                            }
                        } else {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f15913c.get(index));
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        evVar.f15834a = true;
                    }
                    this.f15914a.put(Integer.valueOf(evVar.f15846d), evVar);
                }
            }
        } catch (XmlPullParserException e) {
            bqye.m113758a(e);
        } catch (IOException e2) {
            bqye.m113758a(e2);
        }
    }

    /* renamed from: a */
    public final void mo10543a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f15914a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            C0971eu euVar = (C0971eu) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap hashMap = this.f15914a;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.f15914a.put(valueOf, new C0972ev());
            }
            C0972ev evVar = (C0972ev) this.f15914a.get(valueOf);
            evVar.f15846d = id;
            evVar.f15850h = euVar.f15728d;
            evVar.f15851i = euVar.f15729e;
            evVar.f15852j = euVar.f15730f;
            evVar.f15853k = euVar.f15731g;
            evVar.f15854l = euVar.f15732h;
            evVar.f15855m = euVar.f15733i;
            evVar.f15856n = euVar.f15734j;
            evVar.f15857o = euVar.f15735k;
            evVar.f15858p = euVar.f15736l;
            evVar.f15859q = euVar.f15737m;
            evVar.f15860r = euVar.f15738n;
            evVar.f15861s = euVar.f15739o;
            evVar.f15862t = euVar.f15740p;
            evVar.f15863u = euVar.f15747w;
            evVar.f15864v = euVar.f15748x;
            evVar.f15865w = euVar.f15749y;
            evVar.f15866x = euVar.f15710K;
            evVar.f15867y = euVar.f15711L;
            evVar.f15868z = euVar.f15712M;
            evVar.f15849g = euVar.f15727c;
            evVar.f15847e = euVar.f15725a;
            evVar.f15848f = euVar.f15726b;
            evVar.f15844b = euVar.width;
            evVar.f15845c = euVar.height;
            evVar.f15808A = euVar.leftMargin;
            evVar.f15809B = euVar.rightMargin;
            evVar.f15810C = euVar.topMargin;
            evVar.f15811D = euVar.bottomMargin;
            evVar.f15821N = euVar.f15701B;
            evVar.f15822O = euVar.f15700A;
            evVar.f15824Q = euVar.f15703D;
            evVar.f15823P = euVar.f15702C;
            evVar.f15838ad = euVar.f15704E;
            evVar.f15839ae = euVar.f15705F;
            evVar.f15840af = euVar.f15708I;
            evVar.f15841ag = euVar.f15709J;
            evVar.f15842ah = euVar.f15706G;
            evVar.f15843ai = euVar.f15707H;
            int i2 = Build.VERSION.SDK_INT;
            evVar.f15812E = euVar.getMarginEnd();
            evVar.f15813F = euVar.getMarginStart();
            evVar.f15814G = childAt.getVisibility();
            int i3 = Build.VERSION.SDK_INT;
            evVar.f15825R = childAt.getAlpha();
            evVar.f15828U = childAt.getRotationX();
            evVar.f15829V = childAt.getRotationY();
            evVar.f15830W = childAt.getScaleX();
            evVar.f15831X = childAt.getScaleY();
            evVar.f15832Y = childAt.getPivotX();
            evVar.f15833Z = childAt.getPivotY();
            evVar.f15835aa = childAt.getTranslationX();
            evVar.f15836ab = childAt.getTranslationY();
            int i4 = Build.VERSION.SDK_INT;
            evVar.f15837ac = childAt.getTranslationZ();
            if (evVar.f15826S) {
                evVar.f15827T = childAt.getElevation();
            }
        }
    }
}
