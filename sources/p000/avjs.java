package p000;

import android.view.View;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;

/* renamed from: avjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjs implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardActivity f93278a;

    public avjs(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity) {
        this.f93278a = chimeraUpdateFromSdCardActivity;
    }

    public void onClick(View view) {
        this.f93278a.f109428d.dismiss();
        this.f93278a.mo59651c();
    }
}
