package p000;

import android.accounts.Account;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;

/* renamed from: lvg */
public final /* synthetic */ class lvg implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private final SetBackupAccountChimeraActivity f33033a;

    public lvg(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity) {
        this.f33033a = setBackupAccountChimeraActivity;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        SetBackupAccountChimeraActivity setBackupAccountChimeraActivity = this.f33033a;
        if (i == ((ListView) adapterView).getCount() - 1) {
            setBackupAccountChimeraActivity.mo17217a();
        } else {
            setBackupAccountChimeraActivity.mo17218a((Account) setBackupAccountChimeraActivity.f29005b[i]);
        }
    }
}
