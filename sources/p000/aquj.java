package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: aquj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aquj {

    /* renamed from: a */
    public final tim f86837a;

    public aquj(Context context, BaseCardView baseCardView, bzjq bzjq, tie tie, tim tim) {
        int a;
        Context context2 = context;
        BaseCardView baseCardView2 = baseCardView;
        bzjq bzjq2 = bzjq;
        this.f86837a = tim;
        if ((bzjq2.f170328a & 2) != 0) {
            baseCardView2.findViewById(C0126R.C0129id.card_content).setPadding(0, 0, 0, 0);
            Intent intent = null;
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.shared_current_location_entry, (ViewGroup) null);
            bzhw bzhw = bzjq2.f170329b;
            bzhw = bzhw == null ? bzhw.f170123h : bzhw;
            if ((bzhw.f170125a & 1) != 0 && (a = bzhv.m125809a(bzhw.f170126b)) != 0 && a == 2) {
                int i = bzhw.f170125a;
                if (!((i & 2) == 0 || (i & 4) == 0 || (i & 32) == 0)) {
                    double d = bzhw.f170127c;
                    double d2 = bzhw.f170128d;
                    String str = bzhw.f170130f;
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    String encode = Uri.encode(str);
                    StringBuilder sb = new StringBuilder(String.valueOf(encode).length() + 107);
                    sb.append("geo:");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("?q=");
                    sb.append(d);
                    sb.append(",");
                    sb.append(d2);
                    sb.append("(");
                    sb.append(encode);
                    sb.append(")");
                    intent2.setData(Uri.parse(sb.toString()));
                    intent = intent2;
                }
            } else if ((bzhw.f170125a & 32) != 0) {
                intent = aqqk.m71974b(bzhw.f170130f);
            }
            if (!bzhw.f170131g.isEmpty()) {
                tie.mo26557a(tey.m36894b(bzhw.f170131g), 12, new aque(this, (ImageView) viewGroup.findViewById(C0126R.C0129id.location_map_image), context2, intent));
            }
            ((TextView) viewGroup.findViewById(C0126R.C0129id.title)).setText((int) C0126R.string.real_time_location_title);
            View findViewById = viewGroup.findViewById(C0126R.C0129id.location_info);
            findViewById.setOnClickListener(new aquf(intent, context2));
            if (!bzhw.f170130f.isEmpty()) {
                TextView textView = (TextView) viewGroup.findViewById(C0126R.C0129id.text);
                textView.setText(bzhw.f170130f);
                textView.findViewById(C0126R.C0129id.text).setContentDescription(context2.getString(C0126R.string.view_in_maps_content_description, bzhw.f170130f));
                findViewById.setOnLongClickListener(new aqug(context2, bzhw));
                if ((bzhw.f170125a & 8) != 0) {
                    ((TextView) viewGroup.findViewById(C0126R.C0129id.subtext)).setText(context2.getString(C0126R.string.shared_current_location_timestamp, DateUtils.getRelativeTimeSpanString(bzhw.f170129e, System.currentTimeMillis(), 0, AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE).toString()));
                }
                ((ImageView) viewGroup.findViewById(C0126R.C0129id.icon)).setImageDrawable(tey.m36888a(C1391tv.m20459b(context2, C0126R.C0127drawable.quantum_ic_person_pin_vd_theme_24), C1133kh.m17843b(context2, C0126R.color.card_entry_text_color)));
            }
            ((ViewGroup) baseCardView2.findViewById(C0126R.C0129id.card_content)).addView(viewGroup);
            int i2 = bzhw.f170125a;
            if ((i2 & 2) != 0 && (i2 & 4) != 0) {
                double d3 = bzhw.f170127c;
                double d4 = bzhw.f170128d;
                StringBuilder sb2 = new StringBuilder(49);
                sb2.append(d3);
                sb2.append(",");
                sb2.append(d4);
                String sb3 = sb2.toString();
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse(String.format("https://maps.google.com/maps?daddr=%s", Uri.encode(sb3))));
                if (intent3.resolveActivity(context.getPackageManager()) != null) {
                    baseCardView2.mo59008a((int) C0126R.string.directions, (int) C0126R.C0127drawable.quantum_ic_directions_vd_theme_24, new aquh(this, intent3, context2));
                    return;
                }
                return;
            }
            return;
        }
        baseCardView2.setVisibility(8);
    }
}
