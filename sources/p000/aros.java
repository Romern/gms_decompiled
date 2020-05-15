package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.smartdevice.d2d.p065ui.DeviceListItemView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Locale;

/* renamed from: aros */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aros extends arop {

    /* renamed from: b */
    public final arok f88023b;

    /* renamed from: c */
    public final armc f88024c;

    /* renamed from: d */
    private final Context f88025d;

    /* renamed from: e */
    private String f88026e;

    /* renamed from: f */
    private int f88027f = 2;

    /* renamed from: g */
    private arol f88028g;

    /* JADX WARN: Type inference failed for: r1v0, types: [arok, android.content.Context], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public aros(Context r1, FragmentManager fragmentManager, Bundle bundle, armc armc, String str) {
        super(fragmentManager);
        this.f88025d = r1;
        this.f88023b = r1;
        this.f88024c = armc;
        this.f88026e = str;
        if (bundle != null) {
            this.f88027f = bundle.getInt("nextFragment");
            this.f88026e = bundle.getString("deviceName");
        }
    }

    /* renamed from: a */
    private static final CharSequence m73238a(Context context) {
        C1189mi a = C1188mh.m19636a(context.getResources().getConfiguration());
        Locale locale = a.mo15463a() <= 0 ? Locale.getDefault() : a.mo15465c();
        if (!cgqs.f187523a.mo6606a().mo84312Y() || !"pt".equals(locale.getLanguage())) {
            return context.getString(C0126R.string.smartdevice_setup_google_app_trigger);
        }
        return context.getString(C0126R.string.smartdevice_pt_google_app_trigger);
    }

    /* renamed from: a */
    public final int mo48711a() {
        return 2;
    }

    /* renamed from: a */
    public final boolean mo48714a(int i) {
        return i == 1 || i == 2 || i == 3 || i == 116;
    }

    /* renamed from: b */
    public final void mo48715b() {
        super.mo48715b();
        this.f88027f--;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arpg.a(int, boolean):void
     arg types: [?, int]
     candidates:
      arpg.a(java.lang.String, int):void
      arpg.a(int, boolean):void */
    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i == 1) {
            int i2 = this.f88027f;
            if (i2 == 2) {
                Context context = this.f88025d;
                String charSequence = TextUtils.expandTemplate(context.getString(C0126R.string.smartdevice_target_hotphrase_instructions), context.getString(C0126R.string.smartdevice_ok_google), m73238a(context)).toString();
                arpg arpg = new arpg();
                arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
                arpg.f88058b = context.getString(C0126R.string.smartdevice_d2d_target_title);
                arpg.f88059c = charSequence;
                arpg.f88060d = true;
                arpg.mo48732a((int) C0126R.C0127drawable.smartdevice_in_google_app, true);
                arpg.mo48733a(context.getString(C0126R.string.common_next), 1);
                if (cgrq.m146757b()) {
                    arpg.mo48735b(context.getString(C0126R.string.smartdevice_d2d_target_instruction_copy_another_way), 118);
                } else {
                    arpg.mo48735b(context.getString(C0126R.string.smartdevice_d2d_target_help_text), 3);
                }
                mo48718b(arpg.mo48731a());
            } else if (i2 == 3) {
                String b = bmxx.m108578b(this.f88026e);
                Bundle bundle2 = new Bundle();
                bundle2.putString("deviceName", b);
                arol arol = new arol();
                arol.setArguments(bundle2);
                this.f88028g = arol;
                mo48718b(arol);
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Invalid next fragment ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            this.f88027f++;
        } else if (i == 2) {
            DisplayMetrics displayMetrics = this.f88025d.getResources().getDisplayMetrics();
            int applyDimension = (int) TypedValue.applyDimension(1, 48.0f, displayMetrics);
            Drawable a = C1133kh.m17836a(this.f88025d, (int) C0126R.C0127drawable.product_logo_gsa_shadow_color_48);
            a.setBounds(0, 0, applyDimension, applyDimension);
            ImageSpan imageSpan = new ImageSpan(a);
            SpannableString spannableString = new SpannableString(String.valueOf(this.f88025d.getString(C0126R.string.smartdevice_d2d_target_other_device_description)).concat("\n "));
            spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 33);
            C1349sg a2 = arqh.m73304a(this.f88025d);
            a2.mo15900a(spannableString);
            a2.mo15906b((int) C0126R.string.common_got_it, new aroq());
            TextView textView = (TextView) a2.mo15910c().findViewById(16908299);
            if (textView != null) {
                textView.setLineSpacing((float) (((int) TypedValue.applyDimension(1, 24.0f, displayMetrics)) - textView.getLineHeight()), 1.0f);
            }
            bxvd bxvd = this.f88024c.f87880c;
            int i3 = ((boeb) bxvd.f164949b).f132775p + 1;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boeb boeb = (boeb) bxvd.f164949b;
            boeb boeb2 = boeb.f132758u;
            boeb.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            boeb.f132775p = i3;
        } else if (i == 3) {
            if (!cgql.m146577b()) {
                Spanned fromHtml = Html.fromHtml(TextUtils.expandTemplate(this.f88025d.getString(C0126R.string.smartdevice_type_typing_ok_google), m73238a(this.f88025d)).toString());
                C1349sg a3 = arqh.m73304a(this.f88025d);
                a3.mo15900a(fromHtml);
                a3.mo15906b((int) C0126R.string.common_got_it, (DialogInterface.OnClickListener) null);
                a3.mo15892a((int) C0126R.string.smartdevice_action_try_another_way, new aror(this));
                a3.mo15910c();
            } else if (!cgqv.m146718c() || !"OK_GOOGLE".equals(cgqv.m146717b())) {
                this.f88023b.mo48707b(117, new Bundle());
            } else {
                this.f88023b.mo48707b(118, new Bundle());
            }
            bxvd bxvd2 = this.f88024c.f87880c;
            int i4 = ((boeb) bxvd2.f164949b).f132776q + 1;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            boeb boeb3 = (boeb) bxvd2.f164949b;
            boeb boeb4 = boeb.f132758u;
            boeb3.f132760a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            boeb3.f132776q = i4;
        } else if (i == 116) {
            String string = bundle.getString("deviceName");
            this.f88026e = string;
            arol arol2 = this.f88028g;
            if (arol2 != null) {
                arol2.f88009a = string;
                DeviceListItemView deviceListItemView = arol2.f88010b;
                if (deviceListItemView != null) {
                    deviceListItemView.mo59122a(string);
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Unknown action ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo48712a(Bundle bundle) {
        bundle.putInt("nextFragment", this.f88027f);
        bundle.putString("deviceName", this.f88026e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: arpg.a(int, boolean):void
     arg types: [?, int]
     candidates:
      arpg.a(java.lang.String, int):void
      arpg.a(int, boolean):void */
    /* renamed from: a */
    public final void mo48713a(boolean z) {
        Context context = this.f88025d;
        arpg arpg = new arpg();
        arpg.f88057a = C0126R.C0127drawable.quantum_gm_ic_compare_arrows_gm_blue_36;
        arpg.f88058b = context.getString(C0126R.string.smartdevice_d2d_target_instruction_combined_title);
        arpg.mo48732a((int) C0126R.C0127drawable.smartdevice_open_google_app, true);
        arpg.mo48733a(context.getString(C0126R.string.common_next), 1);
        if (cgrq.m146757b()) {
            arpg.mo48735b(context.getString(C0126R.string.smartdevice_d2d_target_instruction_copy_another_way), 118);
        } else {
            arpg.mo48735b(context.getString(C0126R.string.smartdevice_d2d_target_instruction_cant_find_it), 2);
        }
        arph a = arpg.mo48731a();
        if (!z) {
            mo48718b(a);
        } else {
            mo48717a(a);
        }
    }
}
