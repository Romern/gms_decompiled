package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.util.BackupOptInHelper$NoUnderlineUrlSpan;
import java.util.Arrays;

/* renamed from: myg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class myg {
    /* renamed from: a */
    public static bsqi m25737a() {
        bxvd da = bsqi.f146642h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqi bsqi = (bsqi) da.f164949b;
        int i = bsqi.f146644a | 2;
        bsqi.f146644a = i;
        bsqi.f146646c = true;
        int i2 = i | 4;
        bsqi.f146644a = i2;
        bsqi.f146647d = true;
        bsqi.f146644a = i2 | 8;
        bsqi.f146648e = true;
        boolean c = lwb.m24519c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsqi bsqi2 = (bsqi) da.f164949b;
        bsqi2.f146644a |= 32;
        bsqi2.f146650g = c;
        return (bsqi) da.mo74062i();
    }

    /* renamed from: b */
    public static int m25743b() {
        return cclf.m130397b() ? C0126R.string.backup_data_title_no_drive_branding : C0126R.string.backup_data_title;
    }

    /* renamed from: c */
    public static boolean m25746c(Context context) {
        return lvr.f33060a.mo19659d(context);
    }

    /* renamed from: d */
    static boolean m25747d(Context context) {
        if (context.getPackageManager().hasSystemFeature("com.google.android.apps.photos.NEXUS_PRELOAD")) {
            int i = Build.VERSION.SDK_INT;
            if (ccnl.f179542a.mo6606a().mo76458a() || m25746c(context)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: b */
    public static CharSequence m25744b(Context context, bsqq bsqq, bxvd bxvd) {
        SpannableString spannableString;
        String string = context.getResources().getString(bsqq.f146677a.mo74151b(0));
        String string2 = context.getResources().getString(bsqq.f146677a.mo74151b(1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        SpannableString spannableString2 = new SpannableString(string2);
        bsqq bsqq2 = ((bsqh) bxvd.f164949b).f146639d;
        if (bsqq2 == null) {
            bsqq2 = bsqq.f146675b;
        }
        int[] a = bqcn.m112584a(bsqq2.f146677a);
        bsqq bsqq3 = ((bsqh) bxvd.f164949b).f146639d;
        if (bsqq3 == null) {
            bsqq3 = bsqq.f146675b;
        }
        int[] copyOf = Arrays.copyOf(a, bsqq3.f146677a.size() - 1);
        bsqq bsqq4 = ((bsqh) bxvd.f164949b).f146639d;
        if (bsqq4 == null) {
            bsqq4 = bsqq.f146675b;
        }
        bsqq bsqq5 = ((bsqh) bxvd.f164949b).f146639d;
        if (bsqq5 == null) {
            bsqq5 = bsqq.f146675b;
        }
        int b = bsqq4.f146677a.mo74151b(bsqq5.f146677a.size() - 1);
        String[] strArr = new String[(copyOf.length - 1)];
        int i = 0;
        for (int i2 = 1; i2 < copyOf.length; i2++) {
            strArr[i] = context.getResources().getString(copyOf[i2]);
            i++;
        }
        String string3 = context.getResources().getString(copyOf[0], (Object[]) strArr);
        if (ccod.f179611a.mo6606a().mo76526f()) {
            SpannableString spannableString3 = new SpannableString(context.getResources().getString(b));
            spannableString3.setSpan(new BackupOptInHelper$NoUnderlineUrlSpan("https://www.google.com/policies/privacy/"), 0, spannableString3.length(), 17);
            spannableString = spannableString3;
        } else {
            spannableString = Html.fromHtml(String.format("<a href=\"https://www.google.com/policies/privacy/\">%s</a>", context.getResources().getString(b)));
        }
        CharSequence expandTemplate = TextUtils.expandTemplate(string3, spannableString);
        Resources resources = context.getResources();
        bsqq bsqq6 = ((bsqh) bxvd.f164949b).f146641f;
        if (bsqq6 == null) {
            bsqq6 = bsqq.f146675b;
        }
        spannableString2.setSpan(new myf(context, expandTemplate, resources.getString(bsqq6.f146677a.mo74151b(0)), bxvd), 0, spannableString2.length(), 17);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) spannableString2);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static bsqq m25738a(Context context) {
        int i;
        int i2;
        boolean c = lwb.m24519c();
        int i3 = C0126R.string.empty_string;
        if (!c) {
            i = C0126R.string.empty_string;
        } else {
            i = C0126R.string.drive_backup_disabled_encryption_supported_info;
        }
        boolean b = m25745b(context);
        if (b) {
            i3 = C0126R.string.drive_backup_disabled_detailedinfo;
        }
        if (!b) {
            i2 = C0126R.string.drive_backup_disabled_backuplist_no_photos;
        } else {
            i2 = C0126R.string.drive_backup_disabled_backuplist;
        }
        bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
        bsqp.mo70703a((int) C0126R.string.drive_backup_disabled_introduction);
        bsqp.mo70703a((int) C0126R.string.common_learn_more);
        bsqp.mo70703a(i2);
        bsqp.mo70703a(i3);
        bsqp.mo70703a(i);
        return (bsqq) bsqp.mo74062i();
    }

    /* renamed from: a */
    public static CharSequence m25739a(Context context, bsqq bsqq) {
        String string = context.getResources().getString(bsqq.f146677a.mo74151b(2));
        String string2 = context.getResources().getString(bsqq.f146677a.mo74151b(3));
        String string3 = context.getResources().getString(bsqq.f146677a.mo74151b(4));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string);
        if (!string2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) string2);
        }
        if (!string3.isEmpty()) {
            spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) string3);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static CharSequence m25740a(Context context, bsqq bsqq, bxvd bxvd) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m25744b(context, bsqq, bxvd));
        spannableStringBuilder.append((CharSequence) "\n\n").append(m25739a(context, bsqq));
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static void m25741a(Context context, bsqi bsqi) {
        lvr lvr = lvr.f33060a;
        lvr.mo19654b(context, bsqi.f146646c);
        lvr.mo19656c(context, bsqi.f146647d);
        lvr.mo19651a(context, bsqi.f146648e);
        lvr.mo19658d(context, bsqi.f146650g);
    }

    /* renamed from: a */
    public static void m25742a(Context context, bxvd bxvd) {
        int[] iArr;
        int i;
        boolean b = cclf.m130397b();
        if (!ccod.m130981b()) {
            if (!m25747d(context)) {
                if (m25746c(context)) {
                    iArr = new int[4];
                    iArr[0] = C0126R.string.f7395x28773dba;
                    if (!b) {
                        i = C0126R.string.backup_opt_in_backup_main_message;
                    } else {
                        i = C0126R.string.backup_opt_in_backup_main_message_no_branding;
                    }
                    iArr[1] = i;
                    iArr[2] = C0126R.string.backup_opt_in_backup_photos_sync;
                    iArr[3] = C0126R.string.backup_opt_in_backup_photos_count_against_quota;
                } else if (!b) {
                    iArr = new int[]{C0126R.string.f7391x9e2dd3ba, C0126R.string.backup_opt_in_backup_main_message, C0126R.string.backup_opt_in_backup_no_quota};
                } else {
                    iArr = new int[]{C0126R.string.f7392x49d8e471, C0126R.string.backup_opt_in_backup_main_message_no_branding};
                }
            } else if (!b) {
                iArr = new int[]{C0126R.string.f7393xbf539393, C0126R.string.backup_opt_in_backup_main_message, C0126R.string.backup_opt_in_backup_photos_sync, C0126R.string.backup_opt_in_backup_photos_no_quota, C0126R.string.backup_opt_in_backup_no_quota};
            } else {
                iArr = new int[]{C0126R.string.f7394x7ffae8b8, C0126R.string.backup_opt_in_backup_main_message_no_branding, C0126R.string.backup_opt_in_backup_photos_sync, C0126R.string.backup_opt_in_backup_photos_no_quota};
            }
        } else if (!b) {
            iArr = new int[]{C0126R.string.f7391x9e2dd3ba, C0126R.string.backup_opt_in_backup_main_message, C0126R.string.backup_opt_in_backup_no_quota};
        } else {
            iArr = new int[]{C0126R.string.f7392x49d8e471, C0126R.string.backup_opt_in_backup_main_message_no_branding};
        }
        bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
        bsqp.mo70704a(bqcn.m112586b(iArr));
        bsqp.mo70703a((int) C0126R.string.common_privacy_policy_composed_string);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsqh bsqh = (bsqh) bxvd.f164949b;
        bsqq bsqq = (bsqq) bsqp.mo74062i();
        bsqh bsqh2 = bsqh.f146634g;
        bsqq.getClass();
        bsqh.f146639d = bsqq;
        bsqh.f146636a |= 4;
        bsqp bsqp2 = (bsqp) bsqq.f146675b.mo74144da();
        bsqp2.mo70703a((int) C0126R.string.close_button_label);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsqh bsqh3 = (bsqh) bxvd.f164949b;
        bsqq bsqq2 = (bsqq) bsqp2.mo74062i();
        bsqq2.getClass();
        bsqh3.f146641f = bsqq2;
        bsqh3.f146636a |= 16;
    }

    /* renamed from: b */
    public static boolean m25745b(Context context) {
        if (ccod.m130981b()) {
            return false;
        }
        if (m25747d(context) || m25746c(context)) {
            return true;
        }
        return false;
    }
}
