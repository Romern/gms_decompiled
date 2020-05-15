package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: acul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acul extends BaseAdapter {

    /* renamed from: a */
    private final Context f60816a;

    /* renamed from: b */
    private final List f60817b;

    public acul(Context context, List list) {
        this.f60816a = context;
        this.f60817b = list;
    }

    /* renamed from: a */
    public final acuj getItem(int i) {
        return (acuj) this.f60817b.get(i);
    }

    public final int getCount() {
        return this.f60817b.size();
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
        if (view == null && (context = this.f60816a) != null) {
            view = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.generic_item, viewGroup, false);
            view.setTag(new acuk(view));
        }
        if (view != null) {
            acuk acuk = (acuk) view.getTag();
            acuj a = getItem(i);
            acuk.f60814b.setText(a.mo33102b());
            acuk.f60813a.setText(a.mo33101a());
            acuk.f60815c.setText(acua.m49865b(a.f60809a));
        }
        return view;
    }
}
