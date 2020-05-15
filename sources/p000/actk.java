package p000;

import android.content.Context;
import android.text.format.Formatter;
import android.view.View;
import android.widget.ListAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.icing.p049ui.IcingManageSpaceChimeraActivity;

/* renamed from: actk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class actk extends actj {

    /* renamed from: a */
    final /* synthetic */ IcingManageSpaceChimeraActivity f60748a;

    /* renamed from: b */
    private final boolean f60749b = true;

    public actk(IcingManageSpaceChimeraActivity icingManageSpaceChimeraActivity) {
        this.f60748a = icingManageSpaceChimeraActivity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo33070a() {
        return this.f60748a.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        acti acti = (acti) obj;
        if (isCancelled()) {
            return;
        }
        if (acti.f60744a == 0) {
            this.f60748a.f79095b.setVisibility(0);
            this.f60748a.f79096c.setVisibility(4);
            IcingManageSpaceChimeraActivity icingManageSpaceChimeraActivity = this.f60748a;
            icingManageSpaceChimeraActivity.f79097d.setText(Formatter.formatFileSize(icingManageSpaceChimeraActivity, acti.f60747d));
            this.f60748a.f79099f.setText((int) C0126R.string.icing_storage_management_empty_list);
            IcingManageSpaceChimeraActivity icingManageSpaceChimeraActivity2 = this.f60748a;
            icingManageSpaceChimeraActivity2.f79098e.setAdapter((ListAdapter) new actn(icingManageSpaceChimeraActivity2, acti.f60745b));
        } else if (this.f60748a.f79096c.getVisibility() == 0) {
            this.f60748a.f79096c.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        int i;
        View view = this.f60748a.f79095b;
        int i2 = 0;
        if (!this.f60749b) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        View view2 = this.f60748a.f79096c;
        if (!this.f60749b) {
            i2 = 4;
        }
        view2.setVisibility(i2);
    }
}
