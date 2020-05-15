package p000;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ActivityBase;
import com.google.android.gms.update.SystemUpdateStatus;
import java.text.ParseException;
import java.util.Locale;

/* renamed from: avrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avrv extends avrk {

    /* renamed from: a */
    private static final sek f93829a = avpq.m79022i("NoUpdateController");

    /* renamed from: b */
    private static final String m79120b(Activity activity) {
        StringBuilder sb = new StringBuilder();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str)) {
            sb.append(TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_android_version_text), str));
            sb.append("<br>");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static final Spanned m79114a(String str) {
        int i = Build.VERSION.SDK_INT;
        return Html.fromHtml(str, 0);
    }

    /* renamed from: a */
    private static String m79115a() {
        int i = Build.VERSION.SDK_INT;
        String str = Build.VERSION.SECURITY_PATCH;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return SimpleDateFormat.getInstanceForSkeleton("dMMMMyyyy", Locale.getDefault()).format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
        } catch (ParseException e) {
            f93829a.mo25418e("Un-parsable security patch string %s.", str);
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51534b(int i, avrl avrl) {
        if (avrl.mo51541h().mo66813a() && avrl.mo51542i().mo66813a()) {
            if (bmxx.m108577a(((SystemUpdateStatus) avrl.mo51542i().mo66814b()).f109478t)) {
                SystemUpdateStatus systemUpdateStatus = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
                avsf avsf = (avsf) avrl.mo51541h().mo66814b();
                if (i == 3) {
                    if (systemUpdateStatus.f109461c != 23) {
                        avsf.mo51569h().setText((int) C0126R.string.system_update_no_update_content_text_glif);
                        avsf.mo51569h().setVisibility(0);
                        String a = m79116a(avrl, 0);
                        if (a.isEmpty() || avsf.mo51563d() == 5) {
                            avsf.mo51567f().setVisibility(8);
                        } else {
                            avsf.mo51567f().setText(m79114a(a));
                            avsf.mo51567f().setVisibility(0);
                        }
                        avsf.mo51568g().setVisibility(8);
                        int i2 = Build.VERSION.SDK_INT;
                        avsf.mo51571j().setVisibility(8);
                        avsf.mo51572k().setVisibility(8);
                        avsf.mo51575n();
                        avsf.mo51557a(false);
                        m79119a(avsf);
                        avsf.mo51562c(false);
                        avsf.mo51564d(false);
                        avsf.mo51566e(false);
                        avsf.mo51555a((int) C0126R.string.system_update_check_now_button_text);
                        if (!avrl.mo51544k() && !avrl.mo51545l()) {
                            avrl.mo51537d();
                            return;
                        }
                        return;
                    }
                    avsf.mo51569h().setText((int) C0126R.string.system_update_preparing_update_title);
                    avsf.mo51569h().setVisibility(0);
                    avsf.mo51567f().setVisibility(8);
                    avsf.mo51568g().setVisibility(8);
                    int i3 = Build.VERSION.SDK_INT;
                    avsf.mo51571j().setVisibility(8);
                    avsf.mo51572k().setVisibility(8);
                    avsf.mo51575n();
                    avsf.mo51557a(false);
                    m79119a(avsf);
                    avsf.mo51562c(false);
                    avsf.mo51564d(false);
                    avsf.mo51566e(false);
                } else if (i == 8) {
                    avsf.mo51569h().setText((int) C0126R.string.checking_for_update_status_text);
                    avsf.mo51569h().setVisibility(0);
                    String a2 = m79116a(avrl, 0);
                    if (a2.isEmpty() || avsf.mo51563d() == 5) {
                        avsf.mo51567f().setVisibility(8);
                    } else {
                        avsf.mo51567f().setText(m79114a(a2));
                        avsf.mo51567f().setVisibility(0);
                    }
                    avsf.mo51568g().setVisibility(8);
                    int i4 = Build.VERSION.SDK_INT;
                    avsf.mo51571j().setVisibility(8);
                    avsf.mo51572k().setVisibility(8);
                    avsf.mo51575n();
                    avsf.mo51557a(false);
                    m79119a(avsf);
                    avrl.mo51538e();
                } else if (i == 5) {
                    m79118a(avrl, avsf);
                } else if (i == 19) {
                    avsf.mo51569h().setText((int) C0126R.string.system_update_cannot_check_update);
                    avsf.mo51569h().setVisibility(0);
                    avsf.mo51568g().setVisibility(8);
                    String a3 = m79116a(avrl, avrl.mo51543j());
                    if (!a3.isEmpty()) {
                        avsf.mo51567f().setText(m79114a(a3));
                        avsf.mo51567f().setVisibility(0);
                    } else {
                        avsf.mo51567f().setVisibility(8);
                    }
                    int i5 = Build.VERSION.SDK_INT;
                    avsf.mo51571j().setVisibility(0);
                    avsf.mo51571j().setText((int) C0126R.string.system_update_check_for_update_failed);
                    avsf.mo51572k().setVisibility(8);
                    avsf.mo51575n();
                    avsf.mo51557a(true);
                    avsf.mo51555a((int) C0126R.string.system_update_check_now_button_text);
                    avsf.mo51562c(false);
                    avsf.mo51574m();
                    avsf.mo51559b(false);
                    avsf.mo51566e(false);
                    avsf.mo51564d(false);
                } else if (i != 6) {
                } else {
                    if (systemUpdateStatus.f109461c == 22 || ((String) avma.f93358d.mo51364a()).isEmpty()) {
                        m79118a(avrl, avsf);
                    }
                }
            } else {
                SystemUpdateStatus systemUpdateStatus2 = (SystemUpdateStatus) avrl.mo51542i().mo66814b();
                avsf avsf2 = (avsf) avrl.mo51541h().mo66814b();
                if (i == 3) {
                    avsf2.mo51569h().setText((int) C0126R.string.system_update_eol_content_text);
                    avsf2.mo51555a((int) C0126R.string.common_learn_more);
                    TextView f = avsf2.mo51567f();
                    StringBuilder sb = new StringBuilder();
                    int i6 = Build.VERSION.SDK_INT;
                    Activity activity = (Activity) avrl;
                    sb.append(m79120b(activity));
                    sb.append(m79117a(activity));
                    if (sb.length() > 0) {
                        sb.append("<br>");
                    }
                    if (((avsf) avrl.mo51541h().mo66814b()).mo51563d() != 5) {
                        sb.append("<b>");
                        sb.append(((ActivityBase) avrl).getContainerActivity().getText(C0126R.string.system_update_eol_description_text));
                        sb.append("<b>");
                    }
                    f.setText(m79114a(sb.toString()));
                    avsf2.mo51567f().setVisibility(0);
                    avsf2.mo51569h().setVisibility(0);
                    avsf2.mo51568g().setVisibility(8);
                    int i7 = Build.VERSION.SDK_INT;
                    avsf2.mo51571j().setVisibility(8);
                    avsf2.mo51572k().setVisibility(8);
                    avsf2.mo51564d(true);
                    StringBuilder sb2 = new StringBuilder();
                    String str = Build.MODEL;
                    sb2.append(((ActivityBase) avrl).getContainerActivity().getText(C0126R.string.system_update_eol_description_text));
                    sb2.append("<br><br>");
                    sb2.append(TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_warning_text), str));
                    avsf2.mo51558b(m79114a(sb2.toString()));
                    avsf2.mo51557a(true);
                    avsf2.mo51562c(false);
                    avsf2.mo51575n();
                    avsf2.mo51574m();
                    avsf2.mo51559b(false);
                    avsf2.mo51566e(false);
                } else if (i == 8) {
                    avrl.mo51535a(systemUpdateStatus2.f109478t);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.text.format.DateUtils.getRelativeTimeSpanString(android.content.Context, long, boolean):java.lang.CharSequence}
     arg types: [android.content.Context, long, int]
     candidates:
      ClspMth{android.text.format.DateUtils.getRelativeTimeSpanString(long, long, long):java.lang.CharSequence}
      ClspMth{android.text.format.DateUtils.getRelativeTimeSpanString(android.content.Context, long, boolean):java.lang.CharSequence} */
    /* renamed from: a */
    private static final String m79116a(avrl avrl, long j) {
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        Activity activity = (Activity) avrl;
        sb.append(m79120b(activity));
        sb.append(m79117a(activity));
        if (sb.length() > 0) {
            sb.append("<br>");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (j > 0) {
            sb.append(TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_last_checkin_glif), DateUtils.getRelativeTimeSpanString((Context) avrl, j, true)));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static final String m79117a(Activity activity) {
        StringBuilder sb = new StringBuilder();
        String a = m79115a();
        if (!TextUtils.isEmpty(a)) {
            sb.append(TextUtils.expandTemplate(activity.getText(C0126R.string.system_update_security_patch_level_text), a));
            sb.append("<br>");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static final void m79118a(avrl avrl, avsf avsf) {
        avsf.mo51569h().setText((int) C0126R.string.system_update_no_update_content_text_glif);
        avsf.mo51569h().setVisibility(0);
        avsf.mo51568g().setVisibility(8);
        String a = m79116a(avrl, avrl.mo51543j());
        if (!a.isEmpty()) {
            avsf.mo51567f().setText(m79114a(a));
            avsf.mo51567f().setVisibility(0);
        } else {
            avsf.mo51567f().setVisibility(8);
        }
        int i = Build.VERSION.SDK_INT;
        avsf.mo51571j().setVisibility(8);
        avsf.mo51572k().setVisibility(8);
        avsf.mo51575n();
        avsf.mo51557a(true);
        avsf.mo51562c(false);
        avsf.mo51574m();
        avsf.mo51559b(false);
        avsf.mo51566e(false);
        avsf.mo51564d(false);
    }

    /* renamed from: a */
    private static final void m79119a(avsf avsf) {
        if (avsf.mo51563d() == 5) {
            avsf.mo51559b(true);
            avsf.mo51574m();
            return;
        }
        avsf.mo51573l().setIndeterminate(true);
    }
}
