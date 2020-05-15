package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: agyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agyb implements agya {

    /* renamed from: a */
    private final String f66840a;

    /* renamed from: b */
    private final String f66841b;

    /* renamed from: c */
    private final String f66842c;

    /* renamed from: d */
    private agwk f66843d;

    public agyb(String str, String str2, String str3) {
        this.f66840a = str;
        this.f66841b = str2;
        this.f66842c = str3;
    }

    /* renamed from: a */
    public final int mo36175a() {
        return C0126R.C0128layout.notification_link_item;
    }

    /* renamed from: a */
    public final void mo36176a(acm acm) {
        agwk agwk = (agwk) acm;
        this.f66843d = agwk;
        String str = this.f66840a;
        String str2 = this.f66841b;
        String str3 = this.f66842c;
        if (!TextUtils.isEmpty(str)) {
            agwk.f66720s.setText(str);
        }
        if (!TextUtils.isEmpty(str)) {
            agwk.f66721t.setText(str2);
        }
        agwk.f201a.setOnClickListener(new agwj(agwk, str3));
    }
}
