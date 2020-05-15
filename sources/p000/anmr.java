package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: anmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anmr extends BaseAdapter {

    /* renamed from: a */
    public final ArrayList f77153a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f77154b = new ArrayList();

    /* renamed from: c */
    public String f77155c;

    /* renamed from: d */
    private final Context f77156d;

    /* renamed from: e */
    private final LayoutInflater f77157e;

    /* renamed from: f */
    private anmq f77158f;

    public anmr(Context context) {
        this.f77156d = context;
        this.f77157e = LayoutInflater.from(context);
    }

    /* renamed from: c */
    private final int m64780c(int i) {
        return i - (this.f77153a.size() + 1);
    }

    /* renamed from: d */
    private final int m64781d(int i) {
        if (i >= 0 && i < this.f77153a.size()) {
            return 0;
        }
        if (i == this.f77153a.size()) {
            return 2;
        }
        if (i >= 0 && i < this.f77153a.size() + this.f77154b.size() + 1) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Position ");
        sb.append(i);
        sb.append(" outside of expected range");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo41956a(int i) {
        anmq anmq;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f77153a.size()) {
                anmq = null;
                break;
            } else if (((anmq) this.f77153a.get(i2)).f77152b == i) {
                anmq = (anmq) this.f77153a.get(i2);
                break;
            } else {
                i2++;
            }
        }
        if (anmq != null) {
            this.f77158f = anmq;
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Filter Id ");
        sb.append(i);
        sb.append(" not found");
        throw new IllegalStateException(sb.toString());
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public final anmp getItem(int i) {
        anmq anmq;
        int i2 = -1;
        if (!(this.f77153a.size() == 0 || (anmq = this.f77158f) == null)) {
            i2 = anmq.f77152b;
        }
        int d = m64781d(i);
        if (d == 0) {
            return new anmp(((anmq) this.f77153a.get(i)).f77152b, this.f77155c);
        }
        if (d != 1) {
            return new anmp(i2, this.f77155c);
        }
        return new anmp(i2, ((anmg) this.f77154b.get(m64780c(i))).f77126a);
    }

    public final int getCount() {
        return this.f77153a.size() + (this.f77154b.size() > 0 ? this.f77154b.size() + 1 : 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        String str;
        int i2;
        View inflate = this.f77157e.inflate((int) C0126R.C0128layout.plus_settings_spinner_dropdown_item, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0126R.C0129id.dropdown_text_item);
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(C0126R.C0129id.dropdown_header_item);
        int size = this.f77153a.size();
        int i3 = 8;
        if (viewGroup3 != null) {
            if (i == size) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            viewGroup3.setVisibility(i2);
        }
        if (viewGroup2 != null) {
            if (i != size) {
                i3 = 0;
            }
            viewGroup2.setVisibility(i3);
        }
        if (!(i == size || (textView = (TextView) inflate.findViewById(C0126R.C0129id.dropdown_item_text)) == null)) {
            if (this.f77153a.size() <= i || this.f77153a.size() <= 0) {
                str = "";
            } else {
                str = ((anmq) this.f77153a.get(i)).f77151a;
            }
            if (m64781d(i) == 1) {
                str = ((anmg) this.f77154b.get(m64780c(i))).f77126a;
            }
            textView.setText(str);
            if (m64781d(i) == 1) {
                ImageView imageView = (ImageView) inflate.findViewById(C0126R.C0129id.dropdown_item_image);
                Bitmap bitmap = ((anmg) this.f77154b.get(m64780c(i))).f77127b;
                if (bitmap == null) {
                    imageView.setImageResource(anmo.f77139e);
                } else {
                    imageView.setImageBitmap(bitmap);
                }
                imageView.setVisibility(0);
            }
        }
        return inflate;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        if (view == null) {
            if (this.f77154b.size() == 0) {
                view = this.f77157e.inflate((int) C0126R.C0128layout.plus_settings_filters_spinner, viewGroup, false);
            } else {
                view = this.f77157e.inflate((int) C0126R.C0128layout.plus_settings_account_spinner, viewGroup, false);
            }
        }
        anmq anmq = this.f77158f;
        if (anmq == null) {
            str = this.f77156d.getString(C0126R.string.plus_app_settings_apps_page_label);
        } else {
            str = anmq.f77151a;
        }
        String str2 = this.f77155c;
        if (m64781d(i) == 1) {
            str2 = ((anmg) this.f77154b.get(m64780c(i))).f77126a;
        }
        if (m64781d(i) == 0) {
            str = ((anmq) this.f77153a.get(i)).f77151a;
        }
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.spinner_title);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.account_name);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        notifyDataSetChanged();
        return view;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return i != this.f77153a.size();
    }
}
