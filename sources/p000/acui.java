package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;

/* renamed from: acui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acui extends BaseAdapter {

    /* renamed from: a */
    private final Context f60807a;

    /* renamed from: b */
    private final List f60808b;

    public acui(Context context, List list) {
        this.f60807a = context;
        this.f60808b = list;
    }

    /* renamed from: a */
    public final AppIndexingErrorInfo getItem(int i) {
        return (AppIndexingErrorInfo) this.f60808b.get(i);
    }

    public final int getCount() {
        return this.f60808b.size();
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
        String str;
        String str2;
        ActionImpl actionImpl;
        if (view == null) {
            view = ((LayoutInflater) this.f60807a.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.generic_item, viewGroup, false);
            view.setTag(new acuh(view));
        }
        acuh acuh = (acuh) view.getTag();
        AppIndexingErrorInfo a = getItem(i);
        Thing thing = a.f107350f;
        if (thing == null || thing.mo72348a() == null) {
            ActionImpl actionImpl2 = a.f107351g;
            if (actionImpl2 == null || (str = actionImpl2.f152342b) == null) {
                str = "<null name>";
            }
        } else {
            str = a.f107350f.mo72348a();
        }
        Thing thing2 = a.f107350f;
        if ((thing2 == null || (str2 = thing2.f152372d) == null) && ((actionImpl = a.f107351g) == null || (str2 = actionImpl.f152343c) == null)) {
            str2 = "<null URL>";
        }
        acuh.f60804a.setText(str);
        acuh.f60805b.setText(str2);
        acuh.f60806c.setText(acua.m49865b(a.f107349e));
        return view;
    }
}
