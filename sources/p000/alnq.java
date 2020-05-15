package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.android.volley.Request;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;

/* renamed from: alnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alnq extends alnd {

    /* renamed from: c */
    private final String f73858c;

    /* renamed from: d */
    private final ParcelableListOptions f73859d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [sgz, int, java.lang.String]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* renamed from: a */
    public final Pair mo40607a(Context context, almq almq, amph amph) {
        String str;
        Bundle bundle = new Bundle();
        alsi a = alsi.m61648a(this.f73859d.f81718c);
        ampo ampo = new ampo(context, "https://www.googleapis.com", "/plus/v2whitelisted/", cgbe.m144174c(), cgbe.m144188q(), cgbe.m144173b(), "");
        Bundle bundle2 = this.f73859d.f81720e;
        bundle2.putString("on_behalf_of", this.f73858c);
        ampo.mo25545d();
        alno alno = new alno(a, bundle);
        alnp alnp = new alnp();
        ClientContext clientContext = amph.f75659a;
        String b = ampo.mo25527b(clientContext);
        String c = ampo.mo25528c(clientContext);
        String str2 = a.f74197a;
        String str3 = str2.length() == 0 ? new String("https://www.googleapis.com/plus/v2whitelisted/") : "https://www.googleapis.com/plus/v2whitelisted/".concat(str2);
        Matcher matcher = stm.f45132a.matcher(str3);
        if (matcher.find()) {
            StringBuffer stringBuffer = new StringBuffer();
            do {
                String group = matcher.group(1);
                Object obj = bundle2.get(group);
                if (obj != null) {
                    matcher.appendReplacement(stringBuffer, obj.toString());
                } else if (bundle2.containsKey(group)) {
                    matcher.appendReplacement(stringBuffer, "null");
                } else {
                    matcher.appendReplacement(stringBuffer, "");
                }
            } while (matcher.find());
            matcher.appendTail(stringBuffer);
            str = stringBuffer.toString();
        } else {
            str = str3;
        }
        Locale locale = Locale.getDefault();
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("_");
            sb.append(locale.getCountry());
        }
        hashMap.put("Accept-Language", sb.toString());
        ampo.mo25538a((Request) new sgz(str, alno, alnp, b, c, hashMap, ampo.f44447g, ampo.f44448h), true, b);
        ampo.mo25546e();
        bundle.putBoolean("response_complete", true);
        return new Pair(amqv.f75777c, bundle);
    }

    public alnq(String str, int i, String str2, alzm alzm, String str3, String str4, ParcelableListOptions parcelableListOptions) {
        super(alzm, str, i, str2, str3, str4, "IdentityList", 5385);
        this.f73858c = str4;
        this.f73859d = parcelableListOptions;
    }
}
