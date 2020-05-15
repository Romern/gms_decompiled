package p000;

import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: aoku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoku implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    int f78364a;

    /* renamed from: b */
    AudienceMember f78365b;

    /* renamed from: c */
    final ImageView f78366c;

    /* renamed from: d */
    final TextView f78367d;

    /* renamed from: e */
    public final CheckBox f78368e;

    public aoku(View view) {
        this.f78366c = (ImageView) view.findViewById(C0126R.C0129id.avatar);
        this.f78367d = (TextView) view.findViewById(C0126R.C0129id.display_name);
        CheckBox checkBox = (CheckBox) view.findViewById(C0126R.C0129id.checkbox);
        this.f78368e = checkBox;
        checkBox.setOnCheckedChangeListener(this);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f78365b.f30298h.putBoolean("checked", z);
    }
}
