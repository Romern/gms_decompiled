package p000;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tok extends acm {

    /* renamed from: u */
    public static final /* synthetic */ int f46400u = 0;

    /* renamed from: s */
    public final LinearLayout f46401s = ((LinearLayout) this.f201a.findViewById(C0126R.C0129id.credential_group_username_group));

    /* renamed from: t */
    public final LinearLayout f46402t = ((LinearLayout) this.f201a.findViewById(C0126R.C0129id.credential_group_password_group));

    /* renamed from: v */
    private final View f46403v = this.f201a.findViewById(C0126R.C0129id.credential_group_separator);

    /* renamed from: w */
    private final LinearLayout f46404w = ((LinearLayout) this.f201a.findViewById(C0126R.C0129id.credential_group_signon_realm_list));

    /* renamed from: x */
    private final TextView f46405x = ((TextView) this.f201a.findViewById(C0126R.C0129id.credential_group_username));

    /* renamed from: y */
    private final TextView f46406y = ((TextView) this.f201a.findViewById(C0126R.C0129id.credential_group_password));

    /* renamed from: z */
    private final LinearLayout f46407z = ((LinearLayout) this.f201a.findViewById(C0126R.C0129id.credential_group_missing_username_group));

    public tok(View view) {
        super(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26687a(bskf bskf, boolean z, boolean z2, String str) {
        if (!z) {
            this.f46403v.setVisibility(0);
        } else {
            this.f46403v.setVisibility(8);
        }
        if (!bskf.mo70660f().isEmpty()) {
            this.f46405x.setText(bskf.mo70660f());
            this.f46401s.setVisibility(0);
            this.f46407z.setVisibility(8);
        } else {
            this.f46401s.setVisibility(8);
            this.f46407z.setVisibility(0);
        }
        if (bskf.mo70659e().equals(bskj.PASSWORD)) {
            this.f46402t.setVisibility(0);
            try {
                TextView textView = this.f46406y;
                textView.setTypeface(C1163lk.m19265a(textView.getContext(), C0126R.font.roboto_mono));
            } catch (Resources.NotFoundException e) {
                this.f46406y.setTypeface(Typeface.MONOSPACE);
            }
            this.f46406y.setText(((bsqg) ((tqk) bskf.mo70661g()).mo26727b().mo66814b()).mo70699a());
            this.f46406y.setTransformationMethod(PasswordTransformationMethod.getInstance());
        } else {
            this.f46402t.setVisibility(8);
        }
        tog.m37286a(this.f46404w, z2, bskf, str, this.f201a.getContext(), "PasswordPickerCredentialGroupsAdapter");
    }
}
