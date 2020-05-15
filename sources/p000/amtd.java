package p000;

import android.content.ContentResolver;
import android.os.Bundle;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: amtd */
final /* synthetic */ class amtd implements C0038ax {

    /* renamed from: a */
    private final amti f75890a;

    /* renamed from: b */
    private final String f75891b;

    /* renamed from: c */
    private final int f75892c;

    public amtd(amti amti, String str, int i) {
        this.f75890a = amti;
        this.f75891b = str;
        this.f75892c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amti.a(int, boolean):void
     arg types: [int, int]
     candidates:
      amti.a(int, aucb):void
      amti.a(int, boolean):void */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        amti amti = this.f75890a;
        String str = this.f75891b;
        int i = this.f75892c;
        aucb aucb = (aucb) obj;
        amti.mo41323a(2, aucb);
        if (aucb.mo50384b()) {
            if (cfus.m143104b()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("force", true);
                bundle.putString("REQUESTER", "SYNC_CORE_SHEEPDOG_UI");
                ContentResolver.requestSync(amup.m63312a(str), "com.android.contacts", bundle);
            }
            if (i != 1) {
                amti.mo41324a(10, true);
                if (amti.f75900d.getVisibility() == 0) {
                    amti.f75900d.setText((int) C0126R.string.people_backup_sync_will_sync_button);
                }
            } else {
                amti.mo41327b(5);
            }
            amti.f75898b.mo41341a(str).mo2445a(amti, new amte(amti));
            return;
        }
        if (cfut.m143116e()) {
            amti.mo41329c();
        }
        Log.e("BackupAndSyncFragment", "Error opting into backup and sync", aucb.mo50387e());
    }
}
