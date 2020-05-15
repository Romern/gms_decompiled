package p000;

import android.view.Menu;
import android.view.View;
import android.widget.PopupMenu;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* renamed from: asva */
final /* synthetic */ class asva implements View.OnClickListener {

    /* renamed from: a */
    private final asvb f89786a;

    /* renamed from: b */
    private final int f89787b;

    /* renamed from: c */
    private final CardInfo f89788c;

    public asva(asvb asvb, int i, CardInfo cardInfo) {
        this.f89786a = asvb;
        this.f89787b = i;
        this.f89788c = cardInfo;
    }

    public void onClick(View view) {
        asvb asvb = this.f89786a;
        int i = this.f89787b;
        CardInfo cardInfo = this.f89788c;
        PopupMenu popupMenu = new PopupMenu(asvb.f201a.getContext(), asvb.f201a.findViewById(C0126R.C0129id.PopupMenuAnchor), 8388613);
        Menu menu = popupMenu.getMenu();
        if (i == 5 && !cardInfo.f108345f.f108460c && cardInfo.mo59217a()) {
            menu.add(0, 10002, 0, (int) C0126R.string.tp_non_default_token_label);
        }
        menu.add(0, 10001, 0, (int) C0126R.string.common_remove);
        popupMenu.setOnMenuItemClickListener(asvb);
        popupMenu.show();
    }
}
