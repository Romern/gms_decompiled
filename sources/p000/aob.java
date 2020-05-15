package p000;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aob implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private final Preference f1862a;

    public aob(Preference preference) {
        this.f1862a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence f = this.f1862a.mo1969f();
        if (this.f1862a.f1610z && !TextUtils.isEmpty(f)) {
            contextMenu.setHeaderTitle(f);
            contextMenu.add(0, 0, 0, (int) C0126R.string.copy).setOnMenuItemClickListener(this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence f = this.f1862a.mo1969f();
        ((ClipboardManager) this.f1862a.f1595k.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", f));
        Context context = this.f1862a.f1595k;
        Toast.makeText(context, context.getString(C0126R.string.preference_copied, f), 0).show();
        return true;
    }
}
