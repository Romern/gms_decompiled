package p000;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: bhgq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhgq extends BaseAdapter {

    /* renamed from: a */
    private final Calendar f118619a;

    /* renamed from: b */
    private final int f118620b;

    /* renamed from: c */
    private final int f118621c = this.f118619a.getFirstDayOfWeek();

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public bhgq() {
        Calendar c = bhhv.m100907c();
        this.f118619a = c;
        this.f118620b = c.getMaximum(7);
    }

    /* renamed from: a */
    private final int m100866a(int i) {
        int i2 = i + this.f118621c;
        int i3 = this.f118620b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public final int getCount() {
        return this.f118620b;
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        if (i < this.f118620b) {
            return Integer.valueOf(m100866a(i));
        }
        return null;
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
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f118619a.set(7, m100866a(i));
        textView.setText(this.f118619a.getDisplayName(7, 4, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C0126R.string.mtrl_picker_day_of_week_column_header), this.f118619a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
