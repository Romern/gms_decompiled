package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import java.util.List;

/* renamed from: acwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwc extends BaseAdapter {

    /* renamed from: a */
    private final Context f60942a;

    /* renamed from: b */
    private final List f60943b;

    public acwc(Context context, List list) {
        this.f60942a = context;
        this.f60943b = list;
    }

    /* renamed from: a */
    public final AppIndexingUserActionInfo getItem(int i) {
        return (AppIndexingUserActionInfo) this.f60943b.get(i);
    }

    public final int getCount() {
        return this.f60943b.size();
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
            view = ((LayoutInflater) this.f60942a.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.generic_item, viewGroup, false);
            view.setTag(new acwb(view));
        }
        acwb acwb = (acwb) view.getTag();
        AppIndexingUserActionInfo a = getItem(i);
        acwb.f60939a.setText(a.f107354c.f152342b);
        acwb.f60940b.setText(a.f107354c.f152343c);
        acwb.f60941c.setText(acua.m49865b(a.f107353b));
        return view;
    }
}
