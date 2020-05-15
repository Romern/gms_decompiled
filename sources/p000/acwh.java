package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: acwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwh extends BaseAdapter {

    /* renamed from: a */
    private final Context f60960a;

    /* renamed from: b */
    private final List f60961b;

    public acwh(Context context, List list) {
        this.f60960a = context;
        this.f60961b = list;
    }

    /* renamed from: a */
    public final acwf getItem(int i) {
        return (acwf) this.f60961b.get(i);
    }

    public final int getCount() {
        return this.f60961b.size();
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
        if (view == null && (context = this.f60960a) != null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.generic_single_line_item, viewGroup, false);
            view.setTag(new acwg(view));
        }
        if (view != null) {
            acwg acwg = (acwg) view.getTag();
            acwf a = getItem(i);
            acwg.f60958a.setText(a.f60956a);
            acwg.f60959b.setText(Integer.toString(a.f60957b.size()));
        }
        return view;
    }
}
