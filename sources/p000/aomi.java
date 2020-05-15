package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.google.android.chimera.Activity;
import com.google.android.gms.plus.sharebox.MentionSpan;
import java.util.ArrayList;

/* renamed from: aomi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aomi {
    /* renamed from: a */
    protected static String m66049a(Context context, String str, String str2, String[] strArr) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int length = strArr.length;
        if (length == 1) {
            return strArr[0];
        }
        if (m66055a(str2)) {
            return "<<default account>>";
        }
        String string = context.getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).getString("pref_global_account_name", null);
        if (!TextUtils.isEmpty(string) || length == 0) {
            return string;
        }
        String str3 = strArr[0];
        m66052a(context, str3, str2);
        return str3;
    }

    /* renamed from: b */
    public static boolean m66056b(Intent intent) {
        aona a;
        if (m66053a(intent) || (a = aona.m66118a(intent.getExtras())) == null || !a.mo43072d()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m66057c(Intent intent) {
        if (intent != null) {
            return "com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(intent.getAction());
        }
        return false;
    }

    /* renamed from: a */
    public static String m66050a(Spannable spannable) {
        int i;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        ArrayList arrayList = new ArrayList();
        if (uRLSpanArr != null) {
            i = uRLSpanArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size + 1) {
                    break;
                }
                if (MentionSpan.m69359a(uRLSpanArr[i2])) {
                    if (size <= i3) {
                        arrayList.add(uRLSpanArr[i2]);
                        break;
                    } else if (spannable.getSpanEnd(arrayList.get(i3)) > spannable.getSpanEnd(uRLSpanArr[i2])) {
                        arrayList.add(i3, uRLSpanArr[i2]);
                        break;
                    }
                }
                i3++;
            }
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size2);
        int[] iArr = new int[size2];
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            String substring = ((URLSpan) arrayList.get(i4)).getURL().substring(1);
            if (substring.startsWith("g:")) {
                String valueOf = String.valueOf(substring.substring(2));
                arrayList2.add(valueOf.length() == 0 ? new String("+") : "+".concat(valueOf));
            } else if (substring.startsWith("e:")) {
                String valueOf2 = String.valueOf(substring.substring(2));
                arrayList2.add(valueOf2.length() == 0 ? new String("+") : "+".concat(valueOf2));
            } else {
                String valueOf3 = String.valueOf(substring);
                arrayList2.add(valueOf3.length() == 0 ? new String("+") : "+".concat(valueOf3));
            }
            iArr[i4] = spannable.getSpanStart(arrayList.get(i4));
            iArr2[i4] = spannable.getSpanEnd(arrayList.get(i4));
        }
        StringBuilder sb = new StringBuilder(spannable.toString());
        for (int i5 = size2 - 1; i5 >= 0; i5--) {
            sb.replace(iArr[i5], iArr2[i5], (String) arrayList2.get(i5));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m66051a(Activity activity) {
        Intent intent = activity.getIntent();
        String a = spn.m35852a(activity);
        if (!TextUtils.isEmpty(a)) {
            return (!rfz.m33557a(activity).mo24610b(a) || !intent.hasExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE")) ? a : intent.getStringExtra("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
        }
        return "com.google.android.gms";
    }

    /* renamed from: a */
    public static void m66052a(Context context, String str, String str2) {
        if (!m66055a(str2)) {
            SharedPreferences.Editor edit = context.getSharedPreferences("pref_com.google.android.gms.plus.sharebox", 0).edit();
            edit.putString("pref_global_account_name", str);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static boolean m66053a(Intent intent) {
        return intent.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
    }

    /* renamed from: a */
    public static boolean m66054a(Activity activity, String str) {
        Intent intent;
        if (activity == null || ((!m66057c(activity.getIntent()) && ((intent = activity.getIntent()) == null || !"com.google.android.gms.plus.action.REPLY_INTERNAL_GOOGLE".equals(intent.getAction()))) || !"youTubeComments".equals(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    protected static boolean m66055a(String str) {
        if (TextUtils.isEmpty(str) || "com.google.android.gms".equals(str)) {
            return false;
        }
        return true;
    }
}
