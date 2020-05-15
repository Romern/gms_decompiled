package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: acue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acue extends BaseAdapter {

    /* renamed from: a */
    private final Context f60790a;

    /* renamed from: b */
    private final List f60791b;

    public acue(Context context, List list) {
        this.f60790a = context;
        this.f60791b = list;
    }

    /* renamed from: a */
    public final acuc getItem(int i) {
        return (acuc) this.f60791b.get(i);
    }

    public final int getCount() {
        return this.f60791b.size();
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
        if (view == null && (context = this.f60790a) != null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.generic_single_line_item, viewGroup, false);
            view.setTag(new acud(view));
        }
        if (view != null) {
            acud acud = (acud) view.getTag();
            acuc a = getItem(i);
            acud.f60788a.setText(acua.m49853a(a.f60786a.f107361c));
            TextView textView = acud.f60789b;
            int i2 = a.f60787b;
            StringBuilder sb = new StringBuilder(11);
            sb.append(i2);
            textView.setText(sb.toString());
        }
        return view;
    }
}
