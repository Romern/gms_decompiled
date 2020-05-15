package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acuv extends BaseAdapter {

    /* renamed from: a */
    public final List f60849a = new ArrayList();

    /* renamed from: b */
    private final Context f60850b;

    public acuv(Context context) {
        this.f60850b = context;
    }

    /* renamed from: a */
    public final acut getItem(int i) {
        return (acut) this.f60849a.get(i);
    }

    public final int getCount() {
        return this.f60849a.size();
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
        if (view == null) {
            view = ((LayoutInflater) this.f60850b.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.generic_item, viewGroup, false);
            view.setTag(new acuu(view));
        }
        acuu acuu = (acuu) view.getTag();
        acut a = getItem(i);
        if (bmxx.m108577a(a.f60839a)) {
            TextView textView = acuu.f60846a;
            String str = a.f60845g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2);
            sb.append("<");
            sb.append(str);
            sb.append(">");
            textView.setText(sb.toString());
        } else {
            acuu.f60846a.setText(a.f60839a);
        }
        acuu.f60847b.setText(a.f60840b);
        acuu.f60848c.setText(acua.m49865b(a.f60841c));
        return view;
    }
}
