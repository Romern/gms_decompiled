package p000;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: toe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class toe extends acm {

    /* renamed from: z */
    public static final /* synthetic */ int f46380z = 0;

    /* renamed from: A */
    private final View f46381A;

    /* renamed from: B */
    private final LinearLayout f46382B;

    /* renamed from: C */
    private final TextView f46383C;

    /* renamed from: D */
    private final LinearLayout f46384D;

    /* renamed from: s */
    public final TextView f46385s;

    /* renamed from: t */
    final ImageView f46386t;

    /* renamed from: u */
    final ImageView f46387u;

    /* renamed from: v */
    final ImageView f46388v;

    /* renamed from: w */
    final Button f46389w;

    /* renamed from: x */
    final Button f46390x;

    /* renamed from: y */
    public boolean f46391y;

    public toe(View view) {
        super(view);
        this.f46381A = view.findViewById(C0126R.C0129id.credential_group_separator);
        this.f46382B = (LinearLayout) view.findViewById(C0126R.C0129id.credential_group_signon_realm_list);
        this.f46383C = (TextView) view.findViewById(C0126R.C0129id.credential_group_user_name);
        this.f46385s = (TextView) view.findViewById(C0126R.C0129id.credential_group_password);
        this.f46384D = (LinearLayout) view.findViewById(C0126R.C0129id.credential_group_password_group);
        this.f46386t = (ImageView) view.findViewById(C0126R.C0129id.credential_group_view_password);
        this.f46389w = (Button) view.findViewById(C0126R.C0129id.credential_group_edit_button);
        this.f46387u = (ImageView) view.findViewById(C0126R.C0129id.credential_group_copy_username_button);
        this.f46388v = (ImageView) view.findViewById(C0126R.C0129id.credential_group_copy_password_button);
        this.f46390x = (Button) view.findViewById(C0126R.C0129id.credential_group_delete_button);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26684a(bskf bskf, boolean z, boolean z2, String str) {
        this.f46391y = false;
        if (z) {
            this.f46381A.setVisibility(8);
        } else {
            this.f46381A.setVisibility(0);
        }
        this.f46383C.setText(bskf.mo70660f());
        bskj bskj = bskj.IDENTITY_PROVIDER;
        int ordinal = bskf.mo70659e().ordinal();
        if (ordinal == 0) {
            String encodedAuthority = Uri.parse((String) bskf.mo70662h().mo66814b()).getEncodedAuthority();
            this.f46384D.setVisibility(0);
            this.f46385s.setTypeface(Typeface.DEFAULT);
            TextView textView = this.f46385s;
            String string = textView.getContext().getString(C0126R.string.pwm_view_password_dialog_message_with);
            CharSequence[] charSequenceArr = new CharSequence[1];
            boolean a = bmxx.m108577a(encodedAuthority);
            CharSequence charSequence = encodedAuthority;
            if (a) {
                charSequence = (CharSequence) bskf.mo70662h().mo66814b();
            }
            charSequenceArr[0] = charSequence;
            textView.setText(TextUtils.expandTemplate(string, charSequenceArr));
            this.f46385s.setTransformationMethod(null);
            this.f46389w.setVisibility(8);
            this.f46387u.setVisibility(8);
            this.f46388v.setVisibility(8);
            this.f46386t.setVisibility(8);
        } else if (ordinal != 1) {
            this.f46384D.setVisibility(8);
        } else {
            this.f46384D.setVisibility(0);
            try {
                tvb.m37514a(this.f46385s.getContext(), this.f46385s);
            } catch (Resources.NotFoundException e) {
                bnsl bnsl = (bnsl) tof.f46392a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("toe", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("The font R.font.roboto_mono could not be loaded.");
                this.f46385s.setTypeface(Typeface.MONOSPACE);
            }
            this.f46385s.setText(((bsqg) ((tqk) bskf.mo70661g()).mo26727b().mo66814b()).mo70699a());
            this.f46385s.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.f46387u.setVisibility(0);
            this.f46388v.setVisibility(0);
            this.f46386t.setImageResource(C0126R.C0127drawable.quantum_gm_ic_visibility_off_vd_theme_24);
            this.f46386t.setVisibility(0);
        }
        tog.m37286a(this.f46382B, z2, bskf, str, this.f201a.getContext(), "CredentialGroupsAdapter");
    }
}
