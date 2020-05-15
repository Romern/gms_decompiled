package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* renamed from: aukz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukz extends ArrayAdapter {

    /* renamed from: a */
    private final Context f92015a;

    /* renamed from: b */
    private final List f92016b;

    /* renamed from: c */
    private final Resources f92017c;

    public aukz(Context context, List list, Resources resources) {
        super(context, (int) C0126R.C0128layout.auth_trust_status_monitor_history_list_view_row_layout, list);
        this.f92015a = context;
        this.f92016b = list;
        this.f92017c = resources;
    }

    /* renamed from: a */
    private final Drawable m77247a(int i) {
        int color = this.f92017c.getColor(C0126R.color.coffee_personal_unlocking_icon_color);
        Drawable drawable = this.f92017c.getDrawable(i);
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        return drawable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        auky auky;
        if (view == null) {
            auky = new auky();
            view2 = ((LayoutInflater) this.f92015a.getSystemService("layout_inflater")).inflate((int) C0126R.C0128layout.auth_trust_status_monitor_history_list_view_row_layout, viewGroup, false);
            auky.f92011a = (ImageView) view2.findViewById(C0126R.C0129id.auth_trust_status_monitor_trust_status_image_key);
            auky.f92012b = (TextView) view2.findViewById(C0126R.C0129id.auth_trust_status_monitor_event_source_key);
            auky.f92013c = (TextView) view2.findViewById(C0126R.C0129id.auth_trust_status_monitor_event_detail_key);
            auky.f92014d = (TextView) view2.findViewById(C0126R.C0129id.auth_trust_status_monitor_event_timestamp_key);
            view2.setTag(auky);
        } else {
            view2 = view;
            auky = (auky) view.getTag();
        }
        if (((Boolean) ((aumt) this.f92016b.get(i)).mo50671a(aumt.f92099g)).booleanValue()) {
            auky.f92011a.setImageDrawable(m77247a(C0126R.C0127drawable.quantum_ic_lock_open_white_24));
        } else {
            auky.f92011a.setImageDrawable(m77247a(C0126R.C0127drawable.quantum_ic_lock_outline_white_24));
        }
        auky.f92012b.setText((String) ((aumt) this.f92016b.get(i)).mo50671a(aumt.f92098f));
        auky.f92013c.setText(((String) ((aumt) this.f92016b.get(i)).mo50671a(aumt.f92097c)).replace('_', ' '));
        auky.f92014d.setText(m77248a(Long.valueOf(((aumt) this.f92016b.get(i)).f92085d).longValue(), "MM-dd HH:mm"));
        if (i == 0) {
            view2.setBackgroundResource(C0126R.color.button_material_light);
        } else {
            view2.setBackgroundColor(-1);
        }
        return view2;
    }

    /* renamed from: a */
    public static String m77248a(long j, String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return simpleDateFormat.format(instance.getTime());
    }
}
