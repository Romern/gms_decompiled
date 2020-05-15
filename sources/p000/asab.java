package p000;

import android.app.AlertDialog;
import android.net.wifi.WifiConfiguration;
import android.view.View;
import android.widget.AdapterView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: asab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asab implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ asai f88574a;

    public asab(asai asai) {
        this.f88574a = asai;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (adapterView.getItemAtPosition(i) != null) {
            asbk asbk = (asbk) adapterView.getItemAtPosition(i);
            asai asai = this.f88574a;
            int i2 = asbk.f88667c;
            if (i2 == 2 || i2 == 0) {
                String str = asbk.f88665a;
                int i3 = asbk.f88668d;
                if (i2 == 0) {
                    asai.f88585c.mo48992a(str, null, 2, i3, asai.f88584b.getCount());
                    return;
                }
                WifiConfiguration a = asai.f88587e.mo49054a(str);
                if (a == null || asdd.m73823a(a)) {
                    Activity activity = asai.getActivity();
                    if (activity == null) {
                        return;
                    }
                    if (asce.m73770a(activity)) {
                        asai.mo48995a(str);
                    } else {
                        new asbn(activity).mo49032a(str, new asag(asai, str, i3));
                    }
                } else {
                    asai.f88585c.mo48992a(str, ascr.m73791b(a.preSharedKey), 3, i3, asai.f88584b.getCount());
                }
            } else {
                Activity activity2 = asai.getActivity();
                if (activity2 != null) {
                    new AlertDialog.Builder(activity2).setTitle((int) C0126R.string.smartdevice_wifi_cannot_connect_title).setMessage((int) C0126R.string.smartdevice_wifi_cannot_connect_description).setPositiveButton((int) C0126R.string.common_ok, new asad()).create().show();
                }
            }
        }
    }
}
