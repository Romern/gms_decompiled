package p000;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: awza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awza {
    /* renamed from: a */
    public static ArrayList m81597a(Context context, ViewGroup viewGroup, List list, Class cls) {
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (list != null && !list.isEmpty()) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(Context.class);
                for (Object obj : list) {
                    View view = (View) declaredConstructor.newInstance(context);
                    awyz awyz = (awyz) view;
                    if (awyz.mo52803b(obj)) {
                        viewGroup.addView(view);
                        awyz.mo52802a(obj);
                        arrayList.add(view);
                    }
                }
            } catch (InstantiationException e) {
                String valueOf = String.valueOf(cls.getName());
                Log.e("DataBackedViewUtil", valueOf.length() == 0 ? new String("Failed to inflate array for view type") : "Failed to inflate array for view type".concat(valueOf), e);
            } catch (IllegalAccessException e2) {
                String valueOf2 = String.valueOf(cls.getName());
                Log.e("DataBackedViewUtil", valueOf2.length() == 0 ? new String("Failed to inflate array for view type") : "Failed to inflate array for view type".concat(valueOf2), e2);
            } catch (InvocationTargetException e3) {
                String valueOf3 = String.valueOf(cls.getName());
                Log.e("DataBackedViewUtil", valueOf3.length() == 0 ? new String("Failed to inflate array for view type") : "Failed to inflate array for view type".concat(valueOf3), e3);
            } catch (NoSuchMethodException e4) {
                String valueOf4 = String.valueOf(cls.getName());
                Log.e("DataBackedViewUtil", valueOf4.length() == 0 ? new String("Failed to inflate array for view type") : "Failed to inflate array for view type".concat(valueOf4), e4);
            }
        }
        if (arrayList.isEmpty()) {
            i = 8;
        }
        viewGroup.setVisibility(i);
        return arrayList;
    }
}
