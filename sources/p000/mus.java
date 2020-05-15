package p000;

import android.view.View;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

/* renamed from: mus */
public final /* synthetic */ class mus implements View.OnClickListener {

    /* renamed from: a */
    private final SetBackupAccountFlowChimeraActivity f34783a;

    public mus(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity) {
        this.f34783a = setBackupAccountFlowChimeraActivity;
    }

    public void onClick(View view) {
        SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity = this.f34783a;
        bsqh bsqh = setBackupAccountFlowChimeraActivity.f29081b;
        bxvd bxvd = (bxvd) bsqh.mo74142c(5);
        bxvd.mo73625a((bxvk) bsqh);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsqh bsqh2 = (bsqh) bxvd.f164949b;
        bsqh bsqh3 = bsqh.f146634g;
        bsqh2.f146636a |= 1;
        bsqh2.f146637b = true;
        setBackupAccountFlowChimeraActivity.f29081b = (bsqh) bxvd.mo74062i();
        new mva().show(setBackupAccountFlowChimeraActivity.getSupportFragmentManager(), "TurnOffBackupConfirmationDialog");
    }
}
