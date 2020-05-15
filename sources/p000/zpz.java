package p000;

import android.accounts.Account;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fitness.settings.activity.ManageDataSourcesChimeraActivity;

/* renamed from: zpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zpz implements zpu {

    /* renamed from: a */
    public aucb f55678a;

    /* renamed from: b */
    public aubf f55679b = new aubf();

    /* renamed from: c */
    public aucb f55680c;

    /* renamed from: d */
    public aubf f55681d = new aubf();

    /* renamed from: e */
    public final /* synthetic */ ManageDataSourcesChimeraActivity f55682e;

    public zpz(ManageDataSourcesChimeraActivity manageDataSourcesChimeraActivity) {
        this.f55682e = manageDataSourcesChimeraActivity;
    }

    /* renamed from: a */
    public static final aucb m45955a(aucb aucb, aubd aubd) {
        aucf aucf = new aucf(aubd);
        aucb.mo50382b(new zpy(aucf));
        return aucf.f91388a;
    }

    /* renamed from: a */
    public static final GoogleSignInAccount m45956a(String str) {
        return GoogleSignInAccount.m6412a(new Account(str, "com.google"), ydi.f53659b, new Scope[0]);
    }

    /* renamed from: a */
    public final void mo31319a(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        Activity containerActivity = this.f55682e.getContainerActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(containerActivity);
        builder.setIconAttribute(16843605);
        builder.setTitle(i);
        builder.setMessage(i2);
        builder.setPositiveButton((int) C0126R.string.common_ui_confirm_deleting_button, onClickListener);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        View inflate = containerActivity.getLayoutInflater().inflate((int) C0126R.C0128layout.confirm_deletion_dialog, (ViewGroup) null);
        create.setView(inflate);
        CheckBox checkBox = (CheckBox) inflate.findViewById(C0126R.C0129id.i_understand_delete_consequences);
        checkBox.setOnCheckedChangeListener(new suk(create));
        create.setOnShowListener(new sul(create, checkBox));
        create.setOnDismissListener(new sum(checkBox));
        create.show();
    }
}
