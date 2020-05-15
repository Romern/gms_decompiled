package p000;

import android.view.View;
import com.google.android.gms.backup.settings.component.SetBackupAccountFlowChimeraActivity;

/* renamed from: mut */
public final /* synthetic */ class mut implements View.OnClickListener {

    /* renamed from: a */
    private final SetBackupAccountFlowChimeraActivity f34784a;

    public mut(SetBackupAccountFlowChimeraActivity setBackupAccountFlowChimeraActivity) {
        this.f34784a = setBackupAccountFlowChimeraActivity;
    }

    public void onClick(View view) {
        this.f34784a.finishAndRemoveTask();
    }
}
