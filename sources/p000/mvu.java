package p000;

import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.component.BackupSettingsChimeraActivity;

/* renamed from: mvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class mvu extends mxd {

    /* renamed from: h */
    lsp f34823h;

    /* renamed from: i */
    protected final mya f34824i = new mya();

    /* renamed from: a */
    protected static void m25676a(Preference preference, String str) {
        if (str == null) {
            preference.mo1994d((int) C0126R.string.backup_configure_account_default_summary);
        } else {
            preference.mo1966a((CharSequence) str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo20277b(String str) {
        if (str == null) {
            return null;
        }
        return getResources().getString(C0126R.string.settings_backup_account_description, str);
    }

    public final void onCreate(Bundle bundle) {
        this.f34823h = new lsp(getActivity());
        super.onCreate(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        for (AsyncTask asyncTask : this.f34824i.f34919a) {
            asyncTask.cancel(true);
        }
    }

    public final void onStart() {
        super.onStart();
        PreferenceScreen a = mo9317a();
        if (a != null) {
            BackupSettingsChimeraActivity backupSettingsChimeraActivity = (BackupSettingsChimeraActivity) getActivity();
            CharSequence charSequence = a.f1602r;
            backupSettingsChimeraActivity.setTitle(charSequence);
            backupSettingsChimeraActivity.mo8628aW().mo15845a(charSequence);
        }
    }

    /* renamed from: a */
    public final RecyclerView mo9316a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView a = super.mo9316a(layoutInflater, viewGroup, bundle);
        int i = Build.VERSION.SDK_INT;
        a.addItemDecoration(new myb(getResources().getDrawable(C0126R.C0127drawable.preference_list_divider_material, getActivity().getTheme())));
        a.setItemAnimator(null);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20276a(mvs mvs) {
        this.f34824i.mo20307a(new mvr(this, mvs));
    }
}
