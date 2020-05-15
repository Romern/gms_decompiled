package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqt */
public final /* synthetic */ class ajqt implements View.OnClickListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71164a;

    public ajqt(SetupChimeraActivity setupChimeraActivity) {
        this.f71164a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.f71164a;
        setupChimeraActivity.setResult(0);
        setupChimeraActivity.finish();
    }
}
