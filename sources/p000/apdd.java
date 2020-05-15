package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apdd {

    /* renamed from: a */
    public final View f84154a;

    /* renamed from: b */
    public final TextView f84155b = ((TextView) this.f84154a.findViewById(16908310));

    /* renamed from: c */
    public final TextView f84156c = ((TextView) this.f84154a.findViewById(16908304));

    /* renamed from: d */
    final View f84157d;

    /* renamed from: e */
    public final CompoundButton f84158e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public apdd(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.romanesco_contacts_type_item, viewGroup, false);
        this.f84154a = inflate;
        viewGroup.addView(inflate);
        CompoundButton compoundButton = (CompoundButton) this.f84154a.findViewById(C0126R.C0129id.toggle);
        this.f84158e = compoundButton;
        compoundButton.setChecked(true);
        View findViewById = this.f84154a.findViewById(16908312);
        this.f84157d = findViewById;
        findViewById.setOnClickListener(new apdc(this));
    }
}
