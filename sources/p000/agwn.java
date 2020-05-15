package p000;

import android.view.View;

/* renamed from: agwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agwn implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f66726a;

    /* renamed from: b */
    final /* synthetic */ agwp f66727b;

    public agwn(agwp agwp, String str) {
        this.f66727b = agwp;
        this.f66726a = str;
    }

    public void onClick(View view) {
        int i;
        int i2;
        agwp agwp = this.f66727b;
        boolean z = !agwp.f66733v;
        agwp.f66733v = z;
        agwp.mo36168b(z);
        agwp agwp2 = this.f66727b;
        String str = this.f66726a;
        cfnm.m140634e();
        if (cfnm.m140634e()) {
            agrl a = agrl.m54942a();
            if (!agwp2.f66733v) {
                i2 = 65;
            } else {
                i2 = 64;
            }
            a.mo35987a(i2, str, agvn.m55186b(agwp2.f201a), !agwp2.f66733v ? bygd.SETTINGS_DISABLE_CHANNEL : bygd.SETTINGS_ENABLE_CHANNEL, System.currentTimeMillis(), agvh.m55172b());
            return;
        }
        agrl a2 = agrl.m54942a();
        if (!agwp2.f66733v) {
            i = 12;
        } else {
            i = 11;
        }
        a2.mo35987a(i, str, agvn.m55186b(agwp2.f201a), !agwp2.f66733v ? bygd.DISABLE_NOTIFICATION : bygd.ENABLE_NOTIFICATION, System.currentTimeMillis(), agvh.m55172b());
    }
}
