package android.support.p002v7.app;

import android.content.Context;
import android.support.p002v7.widget.AppCompatButton;
import android.support.p002v7.widget.AppCompatCheckBox;
import android.support.p002v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppCompatViewInflater {

    /* renamed from: a */
    public static final int[] f1080a = {16843375};

    /* renamed from: b */
    public static final String[] f1081b = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Class[] f1082d = {Context.class, AttributeSet.class};

    /* renamed from: e */
    private static final C1245ok f1083e = new C1245ok();

    /* renamed from: c */
    public final Object[] f1084c = new Object[2];

    /* renamed from: a */
    public AppCompatTextView mo1201a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: b */
    public AppCompatButton mo1204b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: c */
    public AppCompatCheckBox mo1205c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: d */
    public C1503xz mo1206d(Context context, AttributeSet attributeSet) {
        return new C1503xz(context, attributeSet);
    }

    /* renamed from: e */
    public C1492xo mo1207e(Context context, AttributeSet attributeSet) {
        return new C1492xo(context, attributeSet);
    }

    /* renamed from: a */
    public final View mo1202a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = (Constructor) f1083e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception e) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1082d);
            f1083e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1084c);
    }

    /* renamed from: a */
    public final void mo1203a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
