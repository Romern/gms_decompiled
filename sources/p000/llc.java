package p000;

import android.view.MenuItem;
import android.widget.PopupMenu;
import com.felicanetworks.mfc.C0126R;

/* renamed from: llc */
final /* synthetic */ class llc implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    private final llg f26292a;

    /* renamed from: b */
    private final String f26293b;

    public llc(llg llg, String str) {
        this.f26292a = llg;
        this.f26293b = str;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        llg llg = this.f26292a;
        String str = this.f26293b;
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.password_view || itemId == C0126R.C0129id.password_copy) {
            llg.f26301b.putInt("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationAction", itemId);
            llg.f26301b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationDataEntryId", str);
            llg.f26302c.mo15230a(false, llg.mo15244e());
            return true;
        } else if (itemId != C0126R.C0129id.password_delete) {
            return false;
        } else {
            llg.f26301b.putInt("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationAction", C0126R.C0129id.password_delete);
            llg.f26301b.putString("com.google.android.gms.autofill.ui.controllers.PasswordsManagerPolicymanipulationDataEntryId", str);
            llg.f26302c.mo15230a(true, llg.mo15244e());
            return false;
        }
    }
}
