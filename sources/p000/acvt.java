package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acvt extends BaseAdapter {

    /* renamed from: a */
    public final List f60922a = new ArrayList();

    /* renamed from: b */
    private final Context f60923b;

    public acvt(Context context) {
        this.f60923b = context;
    }

    /* renamed from: a */
    public final acvq getItem(int i) {
        return (acvq) this.f60922a.get(i);
    }

    public final int getCount() {
        return this.f60922a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context;
        if (view == null && (context = this.f60923b) != null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.app_indexing_package_item, viewGroup, false);
            view.setTag(new acvs(view));
        }
        if (view != null) {
            acvs acvs = (acvs) view.getTag();
            acvq a = getItem(i);
            acvs.f60919a.setText(a.f60915a);
            acvs.f60920b.setText(a.f60916b);
            acvs.f60921c.setImageDrawable(a.f60917c);
        }
        return view;
    }
}
