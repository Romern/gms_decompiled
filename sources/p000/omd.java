package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.CheckBoxPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import java.util.concurrent.ExecutorService;

/* renamed from: omd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class omd extends dns {
    /* renamed from: a */
    public final RecyclerView mo9316a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView a = super.mo9316a(layoutInflater, viewGroup, bundle);
        a.addItemDecoration(new omb(getActivity()));
        a.setPadding(0, 0, 0, 0);
        return a;
    }

    /* renamed from: c */
    public final void mo9322c() {
        this.f13641a.mo2237a("carservice");
        this.f13641a.mo2240d();
        mo9319a((String) null);
        if (!ccvu.f180046a.mo6606a().mo76894h()) {
            mo9317a().mo2020b(mo2204a((CharSequence) "touchpad_tuning"));
        }
        if (!ccsw.m131491d()) {
            mo9317a().mo2020b(mo2204a((CharSequence) "car_enable_gal_snoop"));
            mo9317a().mo2020b(mo2204a((CharSequence) "car_gal_snoop_options"));
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) mo2204a((CharSequence) "car_avail_wireless_projection");
        if (!ccws.f180121a.mo6606a().mo76954a()) {
            mo9317a().mo2020b((Preference) checkBoxPreference);
        }
        ListPreference listPreference = (ListPreference) mo2204a((CharSequence) "car_video_resolution");
        listPreference.f1566i = new String[]{"none", "480p", "720p", "1080p"};
        listPreference.f1608x = "none";
        PreferenceScreen a = mo9317a();
        ListPreference listPreference2 = (ListPreference) a.mo2021c((CharSequence) "car_app_mode");
        listPreference2.f1566i = new String[]{"Release", "Developer", "Retail", "Demo", "X-Ray"};
        listPreference2.f1608x = "Release";
        ListPreference listPreference3 = (ListPreference) a.mo2021c((CharSequence) "car_day_night_mode");
        listPreference3.f1566i = new String[]{"car", "auto", "day", "night"};
        listPreference3.f1608x = "car";
    }

    /* renamed from: a */
    public final void mo2232a(PreferenceScreen preferenceScreen) {
        Bundle bundle = new Bundle();
        bundle.putString("root_key", preferenceScreen.f1603s);
        oma oma = new oma();
        oma.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(16908290, oma).addToBackStack(null).commit();
    }

    /* renamed from: c */
    public final boolean mo2233c(Preference preference) {
        if (!preference.f1603s.equals("car_clear_data")) {
            return false;
        }
        ExecutorService b = adzl.f62962b.mo25879b(2);
        b.execute(new omc(this));
        b.shutdown();
        return true;
    }
}
