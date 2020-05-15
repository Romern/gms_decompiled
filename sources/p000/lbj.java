package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.widget.RemoteViews;
import com.felicanetworks.mfc.C0126R;

/* renamed from: lbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lbj {
    /* renamed from: a */
    public static int m18884a(boolean z, Context context) {
        return !z ? C1133kh.m17843b(context, C0126R.color.text_primary) : C1133kh.m17843b(context, C0126R.color.text_primary_dark_mode);
    }

    /* renamed from: b */
    public static int m18893b(boolean z, Context context) {
        return !z ? C1133kh.m17843b(context, C0126R.color.text_secondary) : C1133kh.m17843b(context, C0126R.color.text_secondary_dark_mode);
    }

    /* renamed from: a */
    public static Icon m18885a(kcz kcz, Context context) {
        int b = kcz.mo14380b();
        String a = kcz.mo14379a();
        if (a.equals("com.google.android.gms")) {
            b = qkj.m32287a(context, b);
        }
        return Icon.createWithResource(a, b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lbj.a(android.content.Context, boolean, kcz, boolean):android.widget.RemoteViews
     arg types: [android.content.Context, int, kcz, boolean]
     candidates:
      lbj.a(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, kcz):android.widget.RemoteViews
      lbj.a(android.content.Context, boolean, kcz, boolean):android.widget.RemoteViews */
    /* renamed from: b */
    public static RemoteViews m18894b(Context context, kcz kcz, boolean z) {
        return m18890a(context, false, kcz, z);
    }

    /* renamed from: a */
    public static RemoteViews m18886a(Context context, RemoteViews remoteViews) {
        lrc a = m18891a(context);
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), qkj.m32287a(context, C0126R.C0128layout.autofill_save_payment_card));
        remoteViews2.addView(16908312, remoteViews);
        int a2 = qkj.m32287a(context, C0126R.C0129id.card_expiration_text);
        String valueOf = String.valueOf(a.mo15386b(C0126R.string.autofill_expiration_date_shortened));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append(":");
        remoteViews2.setTextViewText(a2, sb.toString());
        return remoteViews2;
    }

    /* renamed from: b */
    public static boolean m18895b(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: a */
    public static RemoteViews m18887a(Context context, CharSequence charSequence, CharSequence charSequence2, kcz kcz) {
        return m18888a(context, charSequence, charSequence2, kcz, false, 1);
    }

    /* renamed from: a */
    public static RemoteViews m18888a(Context context, CharSequence charSequence, CharSequence charSequence2, kcz kcz, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        RemoteViews remoteViews;
        int i5;
        int i6;
        int i7;
        int i8;
        Context context2 = context;
        CharSequence charSequence3 = charSequence2;
        kcz kcz2 = kcz;
        lrc a = m18891a(context);
        int a2 = a.mo15383a((int) C0126R.dimen.autofill_view_padding);
        int layoutDirection = a.mo15384a().getLayoutDirection();
        int i9 = 0;
        if (i == 1) {
            i4 = qkj.m32287a(context2, C0126R.C0128layout.autofill_dataset_left);
            if (layoutDirection == 1) {
                i8 = 0;
            } else {
                i8 = a2;
            }
            if (layoutDirection == 1) {
                i9 = a2;
            }
            i2 = i9;
            i3 = i8;
        } else {
            i4 = qkj.m32287a(context2, C0126R.C0128layout.autofill_dataset_right);
            int i10 = layoutDirection == 1 ? a2 : 0;
            if (layoutDirection == 1) {
                i3 = i10;
                i2 = 0;
            } else {
                i2 = a2;
                i3 = i10;
            }
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), i4);
        remoteViews2.setViewPadding(16908290, a2, 0, a2, 0);
        if (charSequence3 != null) {
            int i11 = a2 / 2;
            if (kcz2 != null) {
                remoteViews2.setViewPadding(16908308, i3, i11, i2, 0);
                remoteViews2.setViewPadding(16908309, i3, 0, i2, i11);
                remoteViews2.setViewVisibility(16908296, 8);
                remoteViews = remoteViews2;
                i6 = 16908295;
                i5 = 16908309;
            } else {
                remoteViews2.setViewPadding(16908308, 0, i11, 0, 0);
                remoteViews2.setViewPadding(16908309, 0, 0, 0, i11);
                remoteViews2.setViewVisibility(16908295, 8);
                remoteViews = remoteViews2;
                i6 = 16908295;
                i5 = 16908309;
            }
        } else {
            RemoteViews remoteViews3 = remoteViews2;
            if (kcz2 == null) {
                remoteViews = remoteViews3;
                i6 = 16908295;
                i5 = 16908309;
                remoteViews3.setViewPadding(16908308, 0, a2, 0, a2);
                remoteViews.setViewVisibility(16908309, 8);
                remoteViews.setViewVisibility(16908295, 8);
            } else {
                remoteViews = remoteViews3;
                i6 = 16908295;
                i5 = 16908309;
                remoteViews.setViewPadding(16908308, i3, a2, i2, a2);
                remoteViews.setViewVisibility(16908309, 8);
            }
        }
        boolean b = m18895b(context);
        if (!z) {
            i7 = m18884a(b, context2);
        } else {
            m18892a(remoteViews, !b ? C1133kh.m17843b(context2, C0126R.color.background) : C1133kh.m17843b(context2, C0126R.color.background_dark_mode));
            i7 = m18893b(b, context2);
        }
        remoteViews.setTextColor(16908308, i7);
        remoteViews.setTextViewText(16908308, charSequence);
        if (charSequence3 != null) {
            remoteViews.setTextColor(i5, m18893b(b, context2));
            remoteViews.setTextViewText(i5, charSequence3);
        }
        if (kcz2 != null) {
            int a3 = a.mo15383a((int) C0126R.dimen.autofill_icon_size);
            remoteViews.setImageViewIcon(i6, m18885a(kcz2, context2));
            remoteViews.setContentDescription(i6, kcz.mo14381c());
            remoteViews.setBoolean(i6, "setAdjustViewBounds", true);
            remoteViews.setInt(i6, "setMaxHeight", a3);
        }
        return remoteViews;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lbj.a(android.content.Context, boolean, kcz, boolean):android.widget.RemoteViews
     arg types: [android.content.Context, int, kcz, boolean]
     candidates:
      lbj.a(android.content.Context, java.lang.CharSequence, java.lang.CharSequence, kcz):android.widget.RemoteViews
      lbj.a(android.content.Context, boolean, kcz, boolean):android.widget.RemoteViews */
    /* renamed from: a */
    public static RemoteViews m18889a(Context context, kcz kcz, boolean z) {
        return m18890a(context, true, kcz, z);
    }

    /* renamed from: a */
    private static RemoteViews m18890a(Context context, boolean z, kcz kcz, boolean z2) {
        RemoteViews remoteViews;
        int i;
        int i2;
        int i3;
        Context context2 = context;
        kcz kcz2 = kcz;
        if (ccjf.m130032b()) {
            if (ccjf.m130033c()) {
                i3 = qkj.m32287a(context2, C0126R.C0128layout.autofill_save_password_revised);
                i2 = C0126R.C0129id.username_value;
                i = 16908312;
            } else {
                i3 = qkj.m32287a(context2, C0126R.C0128layout.autofill_save_password);
                i2 = 16908308;
                i = C0126R.C0129id.call_to_action;
            }
            remoteViews = new RemoteViews(context.getPackageName(), i3);
            lrc a = m18891a(context);
            remoteViews.setViewPadding(qkj.m32287a(context2, i), 0, 0, 0, 0);
            if (kcz2 != null) {
                remoteViews.setImageViewIcon(16908295, m18885a(kcz2, context2));
            } else {
                remoteViews.setViewVisibility(qkj.m32287a(context2, 16908295), 8);
            }
            if (!z) {
                remoteViews.setViewVisibility(qkj.m32287a(context2, i2), 8);
            }
            if (!ccjf.f179148a.mo6606a().mo76109f() || !z2) {
                remoteViews.setViewVisibility(qkj.m32287a(context2, i), 8);
            } else if (ccjf.m130033c()) {
                RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), 17367043);
                remoteViews2.setTextViewText(qkj.m32287a(context2, 16908308), a.mo15386b(C0126R.string.revised_autofill_setup_points));
                remoteViews2.setViewPadding(qkj.m32287a(context2, 16908308), 0, 0, 0, 0);
                remoteViews2.setOnClickPendingIntent(qkj.m32287a(context2, 16908308), PendingIntent.getActivity(context2, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://passwords.google.com/")), 134217728));
                remoteViews.addView(i, remoteViews2);
            } else {
                remoteViews.setTextViewText(qkj.m32287a(context2, C0126R.C0129id.call_to_action), a.mo15386b(C0126R.string.revised_autofill_setup_points));
                remoteViews.setOnClickPendingIntent(C0126R.C0129id.call_to_action, PendingIntent.getActivity(context2, 0, new Intent("android.intent.action.VIEW", Uri.parse("https://passwords.google.com/")), 134217728));
            }
        } else {
            remoteViews = new RemoteViews(context.getPackageName(), qkj.m32287a(context2, C0126R.C0128layout.autofill_save_credential_v2));
            lrc a2 = m18891a(context);
            if (z) {
                remoteViews.setTextViewText(qkj.m32287a(context2, C0126R.C0129id.username_text_view), a2.mo15386b(C0126R.string.autofill_username_option));
            } else {
                remoteViews.setViewVisibility(qkj.m32287a(context2, C0126R.C0129id.username_layout), 8);
                remoteViews.setViewPadding(qkj.m32287a(context2, C0126R.C0129id.password_layout), 0, 0, 0, 0);
            }
            remoteViews.setTextViewText(qkj.m32287a(context2, C0126R.C0129id.password_text_view), a2.mo15386b(C0126R.string.common_password));
        }
        return remoteViews;
    }

    /* renamed from: a */
    public static lrc m18891a(Context context) {
        return lrc.m19570a(new ContextThemeWrapper(context, 2132019641));
    }

    /* renamed from: a */
    public static void m18892a(RemoteViews remoteViews, int i) {
        remoteViews.setInt(16908290, "setBackgroundColor", i);
    }
}
