package p000;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajra */
final /* synthetic */ class ajra implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71171a;

    /* renamed from: b */
    private final EditText f71172b;

    public ajra(SetupChimeraActivity setupChimeraActivity, EditText editText) {
        this.f71171a = setupChimeraActivity;
        this.f71172b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f71171a.mo44474a(this.f71172b.getText());
    }
}
