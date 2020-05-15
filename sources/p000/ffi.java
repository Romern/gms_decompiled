package p000;

import com.google.android.gms.accountsettings.p007mg.p009ui.main.MainChimeraActivity;

/* renamed from: ffi */
public final /* synthetic */ class ffi implements C0038ax {

    /* renamed from: a */
    private final MainChimeraActivity f16454a;

    public ffi(MainChimeraActivity mainChimeraActivity) {
        this.f16454a = mainChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        MainChimeraActivity mainChimeraActivity = this.f16454a;
        ffk ffk = (ffk) obj;
        if (ffr.m11620a(ffk) && !bmxi.m108538a(mainChimeraActivity.f7790d.getString("google.account_settings.selected_account", null), ffk.f16458a)) {
            mainChimeraActivity.f7790d.edit().putString("google.account_settings.selected_account", ffk.f16458a).apply();
        }
    }
}
