package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: gw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1035gw implements LayoutInflater.Factory2 {

    /* renamed from: a */
    private final C1050hj f19105a;

    public C1035gw(C1050hj hjVar) {
        this.f19105a = hjVar;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1055ho hoVar;
        int i;
        if (C1031gs.class.getName().equals(str)) {
            return new C1031gs(context, attributeSet, this.f19105a);
        }
        C1018gh ghVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0996fq.f17119a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1033gu.m13902a(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            ghVar = this.f19105a.mo12536b(resourceId);
        }
        if (ghVar == null && string != null) {
            ghVar = this.f19105a.mo12515a(string);
        }
        if (ghVar == null && i2 != -1) {
            ghVar = this.f19105a.mo12536b(i2);
        }
        if (C1050hj.m14443a(2)) {
            "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + ghVar;
        }
        if (ghVar == null) {
            ghVar = this.f19105a.mo12571p().mo12222c(context.getClassLoader(), attributeValue);
            ghVar.f18200q = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = i2;
            }
            ghVar.f18209z = i;
            ghVar.f18164A = i2;
            ghVar.f18165B = string;
            ghVar.f18201r = true;
            ghVar.f18205v = this.f19105a;
            C1050hj hjVar = this.f19105a;
            ghVar.f18206w = hjVar.f19860k;
            ghVar.onInflate(hjVar.f19860k.f19059c, attributeSet, ghVar.f18189f);
            hoVar = this.f19105a.mo12551e(ghVar);
            this.f19105a.mo12553f(ghVar);
        } else if (!ghVar.f18201r) {
            ghVar.f18201r = true;
            ghVar.f18205v = this.f19105a;
            C1050hj hjVar2 = this.f19105a;
            ghVar.f18206w = hjVar2.f19860k;
            ghVar.onInflate(hjVar2.f19860k.f19059c, attributeSet, ghVar.f18189f);
            hoVar = this.f19105a.mo12551e(ghVar);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
        }
        hoVar.mo12644b();
        hoVar.mo12645c();
        View view2 = ghVar.f18174K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (ghVar.f18174K.getTag() == null) {
                ghVar.f18174K.setTag(string);
            }
            return ghVar.f18174K;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
