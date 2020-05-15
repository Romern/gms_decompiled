package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import java.text.ParseException;

/* renamed from: agwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwi extends acm {

    /* renamed from: A */
    private static final srn f66709A = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: w */
    public static final /* synthetic */ int f66710w = 0;

    /* renamed from: s */
    public final TextView f66711s;

    /* renamed from: t */
    public final TextView f66712t;

    /* renamed from: u */
    public final Context f66713u;

    /* renamed from: v */
    public boolean f66714v;

    /* renamed from: x */
    private final TextView f66715x;

    /* renamed from: y */
    private final ImageView f66716y;

    /* renamed from: z */
    private boolean f66717z;

    public agwi(View view) {
        super(view);
        this.f66713u = view.getContext();
        this.f66711s = (TextView) view.findViewById(C0126R.C0129id.dataplan_name);
        this.f66712t = (TextView) view.findViewById(C0126R.C0129id.data_usage);
        this.f66715x = (TextView) view.findViewById(C0126R.C0129id.expired_time);
        this.f66716y = (ImageView) view.findViewById(C0126R.C0129id.dataplan_icon);
    }

    /* renamed from: b */
    private final void m55202b(boolean z) {
        this.f66716y.setAlpha(!z ? 0.38f : 1.0f);
        this.f66711s.setEnabled(z);
        this.f66712t.setEnabled(z);
        this.f66715x.setEnabled(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ba  */
    /* renamed from: a */
    public final void mo36162a(MdpFlexTimeWindow mdpFlexTimeWindow, String str, String str2, String str3) {
        String str4;
        String str5;
        char c;
        int i;
        if (mdpFlexTimeWindow == null) {
            f66709A.mo26019b(agyt.m55307c()).mo68405a("Input empty flex time window at view holder, won't show ui");
            agvn.m55183a(this.f201a);
            return;
        }
        String str6 = mdpFlexTimeWindow.f80195b;
        String str7 = mdpFlexTimeWindow.f80196c;
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
            f66709A.mo26019b(agyt.m55307c()).mo68405a("Input empty flex time, won't show ui");
            agvn.m55183a(this.f201a);
            return;
        }
        try {
            this.f66717z = agze.m55340b(str6, str7);
            int[] iArr = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    iArr = agsc.m55044a(str2);
                } catch (IllegalArgumentException e) {
                    bnsl a = f66709A.mo26019b(agyt.m55307c());
                    a.mo68437a(e);
                    a.mo68420a("Data plan status returns invalid category string %s, won't show it in UI", str2);
                }
            }
            int i2 = mdpFlexTimeWindow.f80197d;
            if (i2 != 100) {
                str4 = this.f66713u.getString(C0126R.string.percent_off, Integer.valueOf(i2));
            } else {
                str4 = this.f66713u.getString(C0126R.string.unlimited);
            }
            if (iArr != null && iArr.length > 0) {
                int i3 = iArr[0];
                this.f66716y.setImageResource(agvn.m55179a(i3, this.f66717z));
                m55202b(this.f66717z);
                String string = this.f66713u.getString(agvn.m55178a(i3));
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(string).length());
                sb.append(str4);
                sb.append(" ");
                sb.append(string);
                str5 = sb.toString();
            } else {
                ImageView imageView = this.f66716y;
                if (!this.f66717z) {
                    i = C0126R.C0127drawable.quantum_ic_data_usage_black_24;
                } else {
                    i = C0126R.C0127drawable.quantum_ic_data_usage_googblue_24;
                }
                imageView.setImageResource(i);
                m55202b(this.f66717z);
                String string2 = this.f66713u.getString(agvn.m55178a(3));
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(string2).length());
                sb2.append(str4);
                sb2.append(" ");
                sb2.append(string2);
                str5 = sb2.toString();
            }
            this.f66711s.setText(str5);
            this.f66716y.setVisibility(0);
            String string3 = this.f66713u.getString(C0126R.string.flexwin_viewholder_description_active);
            try {
                Context context = this.f66713u;
                String string4 = context.getString(C0126R.string.flexwin_from_range, agze.m55332a(str6, str7, context));
                StringBuilder sb3 = new StringBuilder(String.valueOf(string3).length() + 1 + String.valueOf(string4).length());
                sb3.append(string3);
                sb3.append(" ");
                sb3.append(string4);
                String sb4 = sb3.toString();
                String str8 = mdpFlexTimeWindow.f80194a;
                int hashCode = str8.hashCode();
                if (hashCode != 64808441) {
                    if (hashCode != 160654923) {
                        if (hashCode == 160696556 && str8.equals("WEEKENDS")) {
                            c = 2;
                            if (c != 0) {
                                sb4 = this.f66713u.getString(C0126R.string.recurrence_type_daily, sb4);
                            } else if (c == 1) {
                                sb4 = this.f66713u.getString(C0126R.string.recurrence_type_weekdays, sb4);
                            } else if (c == 2) {
                                sb4 = this.f66713u.getString(C0126R.string.recurrence_type_weekends, sb4);
                            }
                            this.f66712t.setText(sb4);
                            if (!TextUtils.isEmpty(str)) {
                                if (this.f66714v) {
                                    this.f66715x.setVisibility(0);
                                    agvn.m55184a(str, this.f66713u, this.f66715x);
                                } else {
                                    this.f66715x.setVisibility(8);
                                }
                            }
                            this.f201a.setOnClickListener(new agwd(this, str3));
                        }
                    } else if (str8.equals("WEEKDAYS")) {
                        c = 1;
                        if (c != 0) {
                        }
                        this.f66712t.setText(sb4);
                        if (!TextUtils.isEmpty(str)) {
                        }
                        this.f201a.setOnClickListener(new agwd(this, str3));
                    }
                } else if (str8.equals("DAILY")) {
                    c = 0;
                    if (c != 0) {
                    }
                    this.f66712t.setText(sb4);
                    if (!TextUtils.isEmpty(str)) {
                    }
                    this.f201a.setOnClickListener(new agwd(this, str3));
                }
                c = 65535;
                if (c != 0) {
                }
                this.f66712t.setText(sb4);
                if (!TextUtils.isEmpty(str)) {
                }
                this.f201a.setOnClickListener(new agwd(this, str3));
            } catch (ParseException e2) {
                bnsl a2 = f66709A.mo26019b(agyt.m55307c());
                a2.mo68437a(e2);
                a2.mo68405a("Flex time window time parse exception. Won't show UI");
                agvn.m55183a(this.f201a);
            }
        } catch (ParseException e3) {
            bnsl a3 = f66709A.mo26019b(agyt.m55307c());
            a3.mo68437a(e3);
            a3.mo68405a("Flex time window time parse exception. Won't show UI");
            agvn.m55183a(this.f201a);
        }
    }
}
