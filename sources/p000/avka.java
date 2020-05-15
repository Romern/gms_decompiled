package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: avka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avka extends BaseAdapter {

    /* renamed from: a */
    public int f93286a = -1;

    /* renamed from: b */
    private final List f93287b;

    /* renamed from: c */
    private final LayoutInflater f93288c;

    public avka(LayoutInflater layoutInflater, List list) {
        this.f93288c = layoutInflater;
        this.f93287b = list;
    }

    public final int getCount() {
        return this.f93287b.size();
    }

    public final Object getItem(int i) {
        return this.f93287b.get(i);
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
        View inflate = this.f93288c.inflate((int) C0126R.C0128layout.system_update_file_browser_list_item, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.right_image);
        imageView.setVisibility(8);
        String str = (String) this.f93287b.get(i);
        ((TextView) inflate.findViewById(C0126R.C0129id.item_text)).setText(str);
        if (str.endsWith("/")) {
            imageView.setVisibility(0);
        }
        if (i == this.f93286a) {
            inflate.setBackgroundColor(C0126R.color.system_update_file_browser_highlight_color);
        }
        return inflate;
    }
}
