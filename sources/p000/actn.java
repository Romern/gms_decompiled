package p000;

import android.content.Context;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Collections;
import java.util.List;

/* renamed from: actn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actn extends BaseAdapter {

    /* renamed from: a */
    private final List f60754a;

    /* renamed from: b */
    private final LayoutInflater f60755b;

    /* renamed from: c */
    private final Context f60756c;

    public actn(Context context, List list) {
        this.f60754a = list;
        Collections.sort(list, new actl());
        this.f60755b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f60756c = context;
    }

    /* renamed from: a */
    public final acto getItem(int i) {
        return (acto) this.f60754a.get(i);
    }

    public final int getCount() {
        return this.f60754a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str = null;
        if (view == null) {
            view = this.f60755b.inflate((int) C0126R.C0128layout.manage_applications_item, (ViewGroup) null);
            view.setTag(new actm(this.f60756c, view));
        }
        actm actm = (actm) view.getTag();
        acto a = getItem(i);
        actm.f60750a.setText(a.f60758b);
        TextView textView = actm.f60751b;
        long j = a.f60760d;
        if (j >= 0) {
            str = Formatter.formatFileSize(actm.f60753d, j);
        }
        textView.setText(str);
        actm.f60752c.setImageDrawable(a.f60759c);
        return view;
    }
}
