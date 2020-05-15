package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: arwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arwm extends BaseAdapter {

    /* renamed from: e */
    private static final Comparator f88365e = new arwl();

    /* renamed from: a */
    public final Object f88366a = new Object();

    /* renamed from: b */
    public final Map f88367b;

    /* renamed from: c */
    private final Context f88368c;

    /* renamed from: d */
    private final List f88369d;

    public arwm(Context context) {
        sdo.m34959a(context);
        this.f88368c = context;
        this.f88367b = new HashMap();
        this.f88369d = new ArrayList();
    }

    /* renamed from: a */
    public final asbk getItem(int i) {
        asbk asbk;
        synchronized (this.f88369d) {
            asbk = (asbk) this.f88369d.get(i);
        }
        return asbk;
    }

    public final int getCount() {
        return this.f88369d.size();
    }

    public final long getItemId(int i) {
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) this.f88368c.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.sud_items_default, viewGroup, false);
        }
        asbk a = getItem(i);
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.sud_items_icon);
        ((TextView) view.findViewById(C0126R.C0129id.sud_items_title)).setText(a.f88665a);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.sud_items_summary);
        if (a.f88668d == 12) {
            textView.setVisibility(0);
            textView.setText((int) C0126R.string.common_connected);
        } else {
            textView.setVisibility(8);
        }
        if (a.f88667c != 0) {
            imageView.setImageResource(C0126R.C0127drawable.smartdevice_wifi_signal_lock);
        } else {
            imageView.setImageResource(C0126R.C0127drawable.smartdevice_wifi_signal_open);
        }
        imageView.setImageLevel(a.f88666b);
        return view;
    }

    public final void notifyDataSetChanged() {
        synchronized (this.f88366a) {
            this.f88369d.clear();
            for (asbk asbk : this.f88367b.values()) {
                this.f88369d.add(asbk);
            }
            Collections.sort(this.f88369d, f88365e);
        }
        super.notifyDataSetChanged();
    }
}
