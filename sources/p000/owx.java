package p000;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: owx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class owx extends oxu {

    /* renamed from: a */
    public static final bnsn f38544a = odk.m28481a("CAR.SETUP");

    /* renamed from: b */
    public boolean f38545b = false;

    /* renamed from: d */
    private ViewGroup f38546d;

    /* renamed from: e */
    private final HashMap f38547e = new HashMap();

    /* renamed from: a */
    public final void mo22729a() {
        CharSequence charSequence;
        int i;
        oye g = ((oxk) mo22763b().f38582k).mo22677g();
        if (g != null) {
            for (Map.Entry entry : g.f38608a.entrySet()) {
                oww oww = (oww) this.f38547e.get(entry.getKey());
                if (oww != null) {
                    oyd oyd = (oyd) entry.getValue();
                    if (oyd.f38605a != 4) {
                        oww.f38536d.setVisibility(8);
                    } else {
                        oww.f38536d.setVisibility(0);
                        oww.f38536d.setProgress((int) (oyd.f38606b * 100.0f));
                    }
                    ovx ovx = oww.f38534b;
                    if (ovx != null) {
                        charSequence = ovx.mo22710a(oww.f38541i.getActivity());
                    } else {
                        charSequence = null;
                    }
                    if (oyd.f38605a == 3 && !TextUtils.isEmpty(charSequence)) {
                        oww.f38539g.setText(charSequence);
                    } else {
                        TextView textView = oww.f38539g;
                        int i2 = oyd.f38605a;
                        if (i2 != 1) {
                            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? 0 : C0126R.string.car_frx_app_status_in_progress : C0126R.string.car_frx_app_status_missing : C0126R.string.car_frx_app_status_update;
                        } else {
                            i = C0126R.string.car_frx_app_status_ready;
                        }
                        textView.setText(i);
                    }
                    if (oyd.f38605a == 1) {
                        oww.f38535c.setImageAlpha(255);
                        oww.f38537e.setVisibility(4);
                        if (oww.f38540h) {
                            try {
                                oww.f38535c.setImageDrawable(oww.f38541i.getActivity().getPackageManager().getApplicationIcon(oww.f38533a));
                            } catch (PackageManager.NameNotFoundException e) {
                            }
                        }
                    } else {
                        oww.f38535c.setImageAlpha(100);
                        if (oww.f38541i.f38545b) {
                            oww.f38537e.setVisibility(0);
                            oww.f38537e.setImageAlpha(127);
                            oww.f38537e.setImageResource(C0126R.C0127drawable.ic_file_download);
                        } else {
                            oww.f38537e.setVisibility(4);
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        Activity activity = getActivity();
        View inflate = layoutInflater2.inflate((int) C0126R.C0128layout.car_frx_installing_apps_progress, viewGroup, false);
        owl.m29905a(layoutInflater2, (ViewGroup) inflate);
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(activity.getString(C0126R.string.car_setup_download_apps_title));
        ((TextView) inflate.findViewById(C0126R.C0129id.body)).setText(activity.getString(C0126R.string.car_setup_download_apps_message));
        Button button = (Button) inflate.findViewById(C0126R.C0129id.left_button);
        button.setVisibility(0);
        button.setText(getString(C0126R.string.car_setup_exit));
        boolean z = true;
        button.setAllCaps(true);
        button.setOnClickListener(new owr(this));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f38545b = arguments.getBoolean("installation_allowed", false);
        }
        this.f38546d = (ViewGroup) inflate.findViewById(C0126R.C0129id.apps_list);
        oye g = ((oxk) mo22763b().f38582k).mo22677g();
        if (g != null) {
            Map a = ovx.m29898a(ccui.f179964a.mo6606a().mo76821e());
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : g.f38608a.entrySet()) {
                String str = (String) entry.getKey();
                oyd oyd = (oyd) entry.getValue();
                oxy b = oyi.m29999b(str);
                if (b == null) {
                    b = new oxy(Integer.MAX_VALUE, str, 0, 0, oyd.f38607c, null);
                }
                View inflate2 = layoutInflater2.inflate((int) C0126R.C0128layout.car_frx_app_item, this.f38546d, false);
                this.f38547e.put(b.f38589b, new oww(this, b, (ovx) a.get(str), (ViewGroup) inflate2));
                arrayList.add(new C1240of(Integer.valueOf(b.f38588a), inflate2));
            }
            Collections.sort(arrayList, new owt());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                View view = (View) ((C1240of) arrayList.get(i)).f26799b;
                if (!z) {
                    view.setPadding(0, getResources().getDimensionPixelSize(C0126R.dimen.car_frx_app_item_spacer), 0, 0);
                }
                this.f38546d.addView(view);
                i++;
                z = false;
            }
        }
        mo22729a();
        if (!this.f38545b) {
            Button button2 = (Button) inflate.findViewById(C0126R.C0129id.right_button);
            button2.setText((int) C0126R.string.car_setup_download);
            button2.setOnClickListener(new ows(this));
            button2.setVisibility(0);
        }
        return inflate;
    }
}
