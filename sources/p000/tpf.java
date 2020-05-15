package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: tpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tpf extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f46437a;

    public tpf(Activity activity) {
        super(activity, 0);
        this.f46437a = activity.getLayoutInflater();
    }

    public final boolean areAllItemsEnabled() {
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f46437a.inflate((int) C0126R.C0128layout.pwm_appchooser_list_item, viewGroup, false);
            view.setTag(new tpg(view));
        }
        tpg tpg = (tpg) view.getTag();
        tpe tpe = (tpe) getItem(i);
        tpg.f46438a.setImageDrawable(tpe.mo26703c());
        tpg.f46438a.setContentDescription(tpe.mo26702b());
        tpg.f46439b.setText(tpe.mo26702b());
        return view;
    }

    public final boolean isEnabled(int i) {
        return true;
    }
}
