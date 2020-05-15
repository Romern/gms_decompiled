package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: owl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owl {
    /* renamed from: a */
    public static Context m29903a(Activity activity) {
        return new ContextThemeWrapper(activity, 2132017629);
    }

    /* renamed from: a */
    public static String m29904a(Context context, String str) {
        return "<a href=\"https://support.google.com/androidauto/" + str + "\">" + context.getResources().getString(C0126R.string.common_learn_more) + "</a>";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static void m29905a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(new int[]{C0126R.attr.carFrxButtonBarLayout});
        viewGroup.addView(layoutInflater.inflate(obtainStyledAttributes.getResourceId(0, C0126R.C0128layout.car_frx_buttons), viewGroup, false));
        obtainStyledAttributes.recycle();
    }
}
