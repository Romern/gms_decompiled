package p000;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tff extends LinearLayout {

    /* renamed from: a */
    private final TextView f45821a = ((TextView) findViewById(C0126R.C0129id.text));

    /* renamed from: b */
    private final TextView f45822b = ((TextView) findViewById(C0126R.C0129id.subtext));

    public tff(Context context) {
        super(context);
        inflate(getContext(), C0126R.C0128layout.gm_about_card_entry, this);
        setOrientation(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26459a(String str) {
        this.f45821a.setText(str);
        setOnLongClickListener(new tfe(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo26460b(String str) {
        this.f45822b.setText(str);
        this.f45822b.setVisibility(0);
    }
}
