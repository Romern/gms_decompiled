package p000;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Log;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.List;
import java.util.Locale;

/* renamed from: anzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anzh {
    /* renamed from: a */
    private static aodw m65633a(String str, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aodw aodw = (aodw) list.get(i);
                if (aodw.mo42572c() && str.equals(aodw.mo42571b())) {
                    return aodw;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static aodu m65639b(String str, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aodu aodu = (aodu) list.get(i);
                if (aodu.mo42560c() && str.equals(aodu.mo42559b())) {
                    return aodu;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static aoii m65641c(String str, List list) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                aoii aoii = (aoii) list.get(i);
                if (aoii.mo42807c() && str.equals(aoii.mo42806b())) {
                    return aoii;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static aoed m65643d(aoil aoil) {
        if (aoil.mo42813b()) {
            UpgradeAccountEntity upgradeAccountEntity = (UpgradeAccountEntity) aoil;
            if (upgradeAccountEntity.f83068d.mo42812b()) {
                List list = upgradeAccountEntity.f83068d.f83085c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    aoed aoed = (aoed) list.get(i);
                    if (aoed.mo42597c()) {
                        return aoed;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static CharSequence m65634a(anxy anxy, String str, String str2, List list) {
        return m65635a(anxy, str, str2, null, list, null);
    }

    /* renamed from: b */
    public static boolean m65640b(aoil aoil) {
        if (aoil.mo42814c()) {
            return "error".equals(((UpgradeAccountEntity) aoil).f83069e);
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m65642c(aoil aoil) {
        if (aoil != null && aoil.mo42813b()) {
            UpgradeAccountEntity upgradeAccountEntity = (UpgradeAccountEntity) aoil;
            if (upgradeAccountEntity.f83068d.mo42812b()) {
                List list = upgradeAccountEntity.f83068d.f83085c;
                int size = list.size();
                boolean z = false;
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    aoed aoed = (aoed) list.get(i2);
                    if ("termsOfService".equals(aoed.mo42600g())) {
                        z = true;
                    }
                    if (!"button".equals(aoed.mo42608o())) {
                        i++;
                    }
                }
                if (!z || i != 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b7  */
    /* renamed from: a */
    public static CharSequence m65635a(anxy anxy, String str, String str2, List list, List list2, List list3) {
        int i;
        aoii c;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str.replaceAll("<p>|</p>", " ")));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            i = uRLSpanArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            URLSpan uRLSpan = uRLSpanArr[i2];
            String url = uRLSpan.getURL();
            if (!TextUtils.isEmpty(url)) {
                ClickableSpan clickableSpan = null;
                if (TextUtils.isEmpty(url) || !url.startsWith("#")) {
                    if (list != null) {
                        clickableSpan = anxy.mo42406a(str2, m65633a(url, list), url);
                    } else if (list2 != null) {
                        clickableSpan = anxy.mo42404a(str2, m65639b(url, list2), url);
                    } else if (list3 != null) {
                        clickableSpan = anxy.mo42407a(str2, m65641c(url, list3), url);
                    }
                    if (clickableSpan != null) {
                        spannableStringBuilder.setSpan(clickableSpan, spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                    }
                    spannableStringBuilder.removeSpan(uRLSpan);
                } else if (list != null) {
                    aodw a = m65633a(url, list);
                    if (a != null) {
                        clickableSpan = anxy.mo42405a(str2, a);
                        if (clickableSpan != null) {
                        }
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                } else if (list2 != null) {
                    aodu b = m65639b(url, list2);
                    if (b != null) {
                        clickableSpan = anxy.mo42402a(b);
                        if (clickableSpan != null) {
                        }
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                } else if (!(list3 == null || (c = m65641c(url, list3)) == null)) {
                    clickableSpan = anxy.mo42403a(c);
                    if (clickableSpan != null) {
                    }
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
                if (Log.isLoggable("UpgradeAccount", 5)) {
                    String valueOf = String.valueOf(url);
                    Log.w("UpgradeAccount", valueOf.length() == 0 ? new String("Failed to create ClickableSpan for url: ") : "Failed to create ClickableSpan for url: ".concat(valueOf));
                }
                if (clickableSpan != null) {
                }
                spannableStringBuilder.removeSpan(uRLSpan);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static boolean m65636a() {
        String lowerCase = Locale.getDefault().getLanguage().toLowerCase();
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 2);
        sb.append("*");
        sb.append(lowerCase);
        sb.append("*");
        return ((String) ansx.f77662L.mo25081c()).contains(sb.toString());
    }

    /* renamed from: a */
    public static boolean m65637a(aoed aoed) {
        return aoed != null && "name".equals(aoed.mo42600g()) && "name".equals(aoed.mo42608o());
    }

    /* renamed from: a */
    public static boolean m65638a(aoil aoil) {
        return aoil != null && aoil.mo42814c() && "ok".equals(((UpgradeAccountEntity) aoil).f83069e);
    }
}
