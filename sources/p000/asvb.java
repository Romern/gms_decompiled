package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: asvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asvb extends acm implements View.OnClickListener, PopupMenu.OnMenuItemClickListener {

    /* renamed from: s */
    public final ImageView f89789s = ((ImageView) this.f201a.findViewById(C0126R.C0129id.CardArtView));

    /* renamed from: t */
    final TextView f89790t = ((TextView) this.f201a.findViewById(C0126R.C0129id.TitleText));

    /* renamed from: u */
    final TextView f89791u = ((TextView) this.f201a.findViewById(C0126R.C0129id.SecondaryText));

    /* renamed from: v */
    final ImageView f89792v = ((ImageView) this.f201a.findViewById(C0126R.C0129id.MoreActionMenuButton));

    /* renamed from: w */
    public final asjs f89793w;

    /* renamed from: x */
    public Uri f89794x;

    /* renamed from: y */
    final /* synthetic */ asvc f89795y;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asvb(asvc asvc, ViewGroup viewGroup) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.tp_settings_reskin_card_list_item, viewGroup, false));
        this.f89795y = asvc;
        this.f89793w = new asjs(viewGroup.getContext(), asvc.f89801g);
    }

    /* renamed from: a */
    public final void mo49523a(TextView textView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str);
        textView.setTextColor(this.f201a.getContext().getResources().getColor(i));
    }

    public void onClick(View view) {
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 10001) {
            this.f89795y.f89799e.onClick(this.f201a);
            return true;
        } else if (itemId != 10002) {
            return false;
        } else {
            this.f89795y.f89798d.onClick(this.f201a);
            return true;
        }
    }
}
