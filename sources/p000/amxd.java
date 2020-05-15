package p000;

import android.app.Notification;
import android.content.Context;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.HashSet;

/* renamed from: amxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amxd {
    /* renamed from: a */
    public static Notification m63598a(Context context) {
        String string = context.getString(C0126R.string.people_fsa_permission_denied_notification_title);
        String string2 = context.getString(C0126R.string.people_fsa_permission_denied_notification_text);
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission-group.CONTACTS");
        C1102je jeVar = new C1102je(context);
        jeVar.mo13640e(string);
        jeVar.mo13632b(string2);
        jeVar.mo13630b(17301642);
        jeVar.mo13639d(TextUtils.concat(string, " ", string2));
        jeVar.f22254f = sft.f44147a.mo25484a(context, hashSet);
        jeVar.mo13627a(true);
        return jeVar.mo13629b();
    }
}
