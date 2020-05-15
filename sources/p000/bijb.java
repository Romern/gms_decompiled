package p000;

import android.app.AlertDialog;
import android.content.Context;
import com.felicanetworks.mfc.C0126R;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: bijb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f120710a;

    /* renamed from: b */
    final /* synthetic */ String f120711b;

    /* renamed from: c */
    final /* synthetic */ String f120712c;

    /* renamed from: d */
    final /* synthetic */ AliasEditorChimeraActivity f120713d;

    public bijb(AliasEditorChimeraActivity aliasEditorChimeraActivity, Context context, String str, String str2) {
        this.f120713d = aliasEditorChimeraActivity;
        this.f120710a = context;
        this.f120711b = str;
        this.f120712c = str2;
    }

    public final void run() {
        AliasEditorChimeraActivity aliasEditorChimeraActivity = this.f120713d;
        if (aliasEditorChimeraActivity.f151379g) {
            aliasEditorChimeraActivity.mo71309k();
            AliasEditorChimeraActivity aliasEditorChimeraActivity2 = this.f120713d;
            if (aliasEditorChimeraActivity2.f151376d == null) {
                aliasEditorChimeraActivity2.f151376d = new AlertDialog.Builder(this.f120710a).setMessage((int) C0126R.string.alias_editor_update_failed).setPositiveButton((int) C0126R.string.common_retry, new bija(this)).setNegativeButton((int) C0126R.string.common_cancel, new biiz(this)).setOnCancelListener(new biiy(this)).create();
            }
            this.f120713d.f151376d.show();
        }
    }
}
