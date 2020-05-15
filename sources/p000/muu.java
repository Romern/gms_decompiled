package p000;

import android.view.View;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

/* renamed from: muu */
public final /* synthetic */ class muu implements View.OnClickListener {

    /* renamed from: a */
    private final SetBackupAccountFlowChimeraActivity f34785a;

    public muu(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity) {
        this.f34785a = setBackupAccountFlowChimeraActivity;
    }

    public void onClick(View view) {
        this.f34785a.finishAndRemoveTask();
    }
}
