package p000;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Map;

/* renamed from: aznu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznu extends aznc {

    /* renamed from: j */
    public Map f99753j;

    /* renamed from: k */
    public Map f99754k;

    public aznu(Activity activity, azcb azcb, azmy azmy, LruCache lruCache, Map map, Map map2, azmz azmz, aznz aznz) {
        super(activity, azcb, azmy, aznz, azmz, lruCache, null, null, null, null);
        this.f99753j = map;
        this.f99754k = map2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo55095a(ViewGroup viewGroup, Cursor cursor) {
        return LayoutInflater.from(this.f99695b).inflate((int) C0126R.C0128layout.ms_group_tombstone_message_item, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo55090b(View view, Cursor cursor) {
        String str;
        Long l;
        if (azoy.m85995k(cursor.getString(9))) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0126R.C0129id.group_tombstone);
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.tombstone_text_view);
            Integer num = this.f99696c.f98957g;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            Integer num2 = this.f99696c.f98956f;
            if (num2 != null) {
                linearLayout.setBackgroundColor(num2.intValue());
            }
            String str2 = null;
            try {
                long parseLong = Long.parseLong(azpi.m86066a(cursor.getBlob(7)));
                if (parseLong != 0) {
                    str = (String) this.f99753j.get(Long.valueOf(parseLong));
                } else {
                    str = null;
                }
            } catch (Exception e) {
                azoj.m85931a("TombStoneVR", e, "Failed to parse business chat tombstone string id", new Object[0]);
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                Map map = this.f99754k;
                if (!(map == null || (l = (Long) map.get(Integer.valueOf(cbic.m127877a(17)))) == null)) {
                    str2 = (String) this.f99753j.get(l);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = this.f99694a.getString(C0126R.string.ms_business_messaging_tombstone_fallback);
                }
                textView.setText(str2);
                return;
            }
            textView.setText(str);
        }
    }
}
