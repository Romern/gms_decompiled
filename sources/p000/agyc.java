package p000;

import android.text.TextUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyc implements agya {

    /* renamed from: a */
    private final String f66844a;

    /* renamed from: b */
    private final String f66845b;

    /* renamed from: c */
    private final String f66846c;

    /* renamed from: d */
    private agwp f66847d;

    public agyc(String str, String str2, String str3) {
        this.f66844a = str;
        this.f66845b = str2;
        this.f66846c = str3;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return (!cfnm.m140634e() || !cfmj.m140160i()) ? C0126R.C0128layout.notification_switch_item : C0126R.C0128layout.settings_notification_switch_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agwp agwp = (agwp) acm;
        this.f66847d = agwp;
        String str = this.f66844a;
        String str2 = this.f66845b;
        String str3 = this.f66846c;
        if (TextUtils.isEmpty(str)) {
            agwp.f201a.setVisibility(8);
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            agwp.f66731t.setText(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            TextView textView = (TextView) agwp.f201a.findViewById(C0126R.C0129id.switch_message);
            textView.setText(str3);
            textView.setVisibility(0);
        }
        agwp.f66734w.execute(new agwl(agwp, str));
        agwp.f66730s.setOnCheckedChangeListener(new agwm(agwp, str));
        agwp.f201a.setOnClickListener(new agwn(agwp, str));
    }
}
