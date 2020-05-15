package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: tf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1375tf implements View.OnClickListener {

    /* renamed from: a */
    private final View f27125a;

    /* renamed from: b */
    private final String f27126b;

    /* renamed from: c */
    private Method f27127c;

    /* renamed from: d */
    private Context f27128d;

    public C1375tf(View view, String str) {
        this.f27125a = view;
        this.f27126b = str;
    }

    public void onClick(View view) {
        String str;
        Method method;
        if (this.f27127c == null) {
            for (Context context = this.f27125a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f27126b, View.class)) != null) {
                        this.f27127c = method;
                        this.f27128d = context;
                    }
                } catch (NoSuchMethodException e) {
                }
            }
            int id = this.f27125a.getId();
            if (id != -1) {
                str = " with id '" + this.f27125a.getContext().getResources().getResourceEntryName(id) + "'";
            } else {
                str = "";
            }
            throw new IllegalStateException("Could not find method " + this.f27126b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f27125a.getClass() + str);
        }
        try {
            this.f27127c.invoke(this.f27128d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
