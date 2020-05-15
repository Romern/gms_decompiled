package p000;

import android.view.View;
import android.widget.PopupMenu;
import com.felicanetworks.mfc.C0126R;

/* renamed from: llb */
final /* synthetic */ class llb implements View.OnClickListener {

    /* renamed from: a */
    private final llg f26290a;

    /* renamed from: b */
    private final String f26291b;

    public llb(llg llg, String str) {
        this.f26290a = llg;
        this.f26291b = str;
    }

    public void onClick(View view) {
        llg llg = this.f26290a;
        String str = this.f26291b;
        PopupMenu popupMenu = new PopupMenu(llg.f26300a, view);
        popupMenu.setOnMenuItemClickListener(new llc(llg, str));
        popupMenu.getMenuInflater().inflate(C0126R.C0130menu.settings_passwords_menu, popupMenu.getMenu());
        popupMenu.show();
    }
}
