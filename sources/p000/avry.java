package p000;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.update.SystemUpdateStatus;

/* renamed from: avry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avry {

    /* renamed from: a */
    private static final bnic f93830a = bnic.m109491a(272, 528, 4);

    /* renamed from: a */
    public static void m79124a(double d, avsf avsf) {
        ProgressBar l = avsf.mo51573l();
        l.setIndeterminate(d <= 0.0d);
        l.setMax(100);
        l.setProgress((int) (d * 100.0d));
    }

    /* renamed from: a */
    public static void m79125a(Activity activity, avsf avsf, SystemUpdateStatus systemUpdateStatus, boolean z) {
        int i;
        int i2;
        if (!z) {
            avsf.mo51569h().setText(systemUpdateStatus.f109482x.f109485a);
            avsf.mo51567f().setText(Html.fromHtml(systemUpdateStatus.f109482x.f109486b));
            avsf.mo51567f().setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            TextView h = avsf.mo51569h();
            if (!m79126a(systemUpdateStatus.f109461c)) {
                i = C0126R.string.system_update_suw_download_title;
            } else {
                i = C0126R.string.system_update_suw_restart_title;
            }
            h.setText(i);
            TextView f = avsf.mo51567f();
            if (!m79126a(systemUpdateStatus.f109461c)) {
                i2 = !avls.m78732a() ? C0126R.string.system_update_suw_download_text : C0126R.string.system_update_suw_download_and_install_text;
            } else {
                i2 = C0126R.string.system_update_suw_restart_text;
            }
            f.setText(i2);
        }
        TextView g = avsf.mo51568g();
        String string = activity.getString(C0126R.string.system_update_size_label);
        String str = systemUpdateStatus.f109482x.f109487c;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append(" ");
        sb.append(str);
        g.setText(sb.toString());
    }

    /* renamed from: a */
    private static boolean m79126a(int i) {
        return f93830a.contains(Integer.valueOf(i));
    }
}
