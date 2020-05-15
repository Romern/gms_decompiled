package p000;

import android.view.View;
import android.widget.EditText;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abao */
public final /* synthetic */ class abao implements View.OnClickListener {

    /* renamed from: a */
    private final HelpChimeraActivity f56949a;

    /* renamed from: b */
    private final EditText f56950b;

    public abao(HelpChimeraActivity helpChimeraActivity, EditText editText) {
        this.f56949a = helpChimeraActivity;
        this.f56950b = editText;
    }

    public void onClick(View view) {
        HelpChimeraActivity helpChimeraActivity = this.f56949a;
        this.f56950b.setText("");
        helpChimeraActivity.f78973t.mo60450e();
        abcx.m47526i(helpChimeraActivity);
    }
}
