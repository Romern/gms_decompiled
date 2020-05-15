package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: azqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azqf {

    /* renamed from: b */
    public static final /* synthetic */ int f99876b = 0;

    /* renamed from: c */
    private static final ExecutorService f99877c = snp.m35704b(9);

    /* renamed from: d */
    private static WeakReference f99878d = new WeakReference(null);

    /* renamed from: a */
    public final Context f99879a;

    public azqf(Context context) {
        this.f99879a = context;
    }

    /* renamed from: a */
    public static final long m86129a(Intent intent) {
        String stringExtra = intent.getStringExtra("timestamp");
        if (TextUtils.isEmpty(stringExtra)) {
            return 0;
        }
        try {
            return Long.parseLong(stringExtra);
        } catch (NumberFormatException e) {
            new Object[1][0] = stringExtra;
            return 0;
        }
    }

    /* renamed from: b */
    public static final bmxv m86143b(Context context) {
        ModuleManager.BasicModuleInfo basicModuleInfo = ModuleManager.getBasicModuleInfo(context);
        if (basicModuleInfo != null) {
            return bmxv.m108566b(Integer.valueOf(basicModuleInfo.moduleVersion));
        }
        azoj.m85933c("LighterUtils", "Could not get ModuleInfo from context", new Object[0]);
        return bmvz.f131120a;
    }

    /* renamed from: c */
    public static final boolean m86149c() {
        if (cfgs.m139408n()) {
            return cfgs.m139409o() || cfgs.m139407m();
        }
        return cfgs.m139409o();
    }

    /* renamed from: a */
    public static synchronized azqf m86130a(Context context) {
        azqf azqf;
        synchronized (azqf.class) {
            azqf = (azqf) f99878d.get();
            if (azqf == null) {
                azqf = new azqf(context.getApplicationContext());
                f99878d = new WeakReference(azqf);
            }
        }
        return azqf;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
    /* renamed from: c */
    public static final boolean m86150c(String str) {
        char c;
        if (!cfgs.m139408n()) {
            return cfgs.m139409o();
        }
        new Object[1][0] = str;
        if (TextUtils.isEmpty(str)) {
            return m86149c();
        }
        int hashCode = str.hashCode();
        if (hashCode != -1908079756) {
            if (hashCode != -1301767051) {
                if (hashCode == 766882747 && str.equals("com.google.business.ACTION_INITIATE_CHAT")) {
                    c = 0;
                    if (c != 0) {
                        new Object[1][0] = Boolean.valueOf(cfgs.m139409o());
                        return cfgs.m139409o();
                    } else if (c != 1 && c != 2) {
                        return m86149c();
                    } else {
                        new Object[1][0] = Boolean.valueOf(cfgs.m139407m());
                        return cfgs.m139407m();
                    }
                }
            } else if (str.equals("com.google.business.ACTION_INITIATE_NEW_BUSINESS_CHAT")) {
                c = 1;
                if (c != 0) {
                }
            }
        } else if (str.equals("com.google.business.ACTION_INITIATE_BUSINESS_CHAT")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }

    /* renamed from: b */
    public static final bmxv m86144b(String str, bmxj bmxj) {
        try {
            return (bmxv) bmxj.apply(new JSONObject(str));
        } catch (JSONException e) {
            azoj.m85931a("LighterUtils", e, "Unable to parse Lighter model from %s", str);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static final bmxv m86131a(bdar bdar) {
        bqgy c = bqgy.m112818c();
        bdar.mo57830c(new azqa(c));
        try {
            return bmxv.m108566b(c.get(cfeo.m138852I(), TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            azoj.m85931a("LighterUtils", e, "can't get value from monitor", Long.valueOf(cfeo.m138852I()));
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static final String m86145b(String str) {
        return m86136a(bmxv.m108566b(str), bmvz.f131120a);
    }

    /* renamed from: b */
    public static final Locale m86146b() {
        int i = Build.VERSION.SDK_INT;
        return LocaleList.getDefault().get(0);
    }

    /* renamed from: a */
    public static final bmxv m86132a(String str, bmxj bmxj) {
        bngs j = bngx.m109377j();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                bmxv bmxv = (bmxv) bmxj.apply(Integer.valueOf(jSONArray.getInt(i)));
                if (!bmxv.mo66813a()) {
                    azoj.m85933c("LighterUtils", "Failed to convert JSONObject to LighterModel.", new Object[0]);
                    return bmvz.f131120a;
                }
                j.mo67668c(bmxv.mo66814b());
            }
            return bmxv.m108566b(j.mo67664a());
        } catch (InvalidParameterException | JSONException e) {
            return bmvz.f131120a;
        }
    }

    /* renamed from: b */
    public static final Locale m86147b(Intent intent) {
        Locale b = m86146b();
        int i = Build.VERSION.SDK_INT;
        String stringExtra = intent.getStringExtra("hl");
        if (!cfgs.f183989a.mo6606a().mo81174ac() && !TextUtils.isEmpty(stringExtra)) {
            Locale forLanguageTag = Locale.forLanguageTag(stringExtra);
            if (!TextUtils.equals(forLanguageTag.toLanguageTag(), "und")) {
                return forLanguageTag;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static final cbds m86133a(ContactId contactId) {
        bmxv d = contactId.mo60495d();
        bxvd da = cbds.f176782e.mo74144da();
        String a = contactId.mo60492a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbds) da.f164949b).f176785b = a;
        String b = contactId.mo60493b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbds) da.f164949b).f176787d = b;
        int b2 = cbel.m127777b(contactId.mo60494c().f111365f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbds) da.f164949b).f176784a = cbel.m127776a(b2);
        if (d.mo66813a()) {
            String str = (String) d.mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbds) da.f164949b).f176786c = str;
        }
        return (cbds) da.mo74062i();
    }

    /* renamed from: b */
    public static final void m86148b(List list, bmxj bmxj) {
        f99877c.submit(new azpz(list, bmxj));
    }

    /* renamed from: a */
    public static final ContactId.ContactType m86134a(int i) {
        if (i == 1) {
            return ContactId.ContactType.PHONE_NUMBER;
        }
        if (i == 7) {
            return ContactId.ContactType.EMAIL;
        }
        if (i != 8) {
            return ContactId.ContactType.UNKNOWN;
        }
        return ContactId.ContactType.DEVICE_ID;
    }

    /* renamed from: a */
    public static final ContactId m86135a(LocalEntityId localEntityId) {
        bcsk f = ContactId.m94830f();
        f.mo57453b(localEntityId.f111074a);
        f.mo57454c(localEntityId.f111076c);
        f.mo57451a(m86134a(localEntityId.f111075b));
        return f.mo57450a();
    }

    /* renamed from: a */
    private static final String m86136a(bmxv bmxv, bmxv bmxv2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", !bmxv.mo66813a() ? JSONObject.NULL : bmxv.mo66814b());
            jSONObject.put("error", !bmxv2.mo66813a() ? JSONObject.NULL : bmxv2.mo66814b());
            return jSONObject.toString();
        } catch (InvalidParameterException | JSONException e) {
            azoj.m85933c("LighterUtils", "Failed to create error JSON Object", new Object[0]);
            return "{\"error\":\"Unable to create JSON object\"}";
        }
    }

    /* renamed from: a */
    public static final String m86137a(ConversationId conversationId) {
        return conversationId.mo60556c() == ConversationId.IdType.GROUP ? conversationId.mo60557d().mo60504b() : conversationId.mo60558e().mo60493b();
    }

    /* renamed from: a */
    public static final String m86138a(String str, Object... objArr) {
        return m86136a(bmvz.f131120a, bmxv.m108566b(String.format(str, objArr)));
    }

    /* renamed from: a */
    public static final String m86139a(JSONArray jSONArray) {
        return m86136a(bmxv.m108566b(jSONArray), bmvz.f131120a);
    }

    /* renamed from: a */
    public static final String m86140a(JSONObject jSONObject) {
        return m86136a(bmxv.m108566b(jSONObject), bmvz.f131120a);
    }

    /* renamed from: a */
    public static final String m86141a(boolean z) {
        return m86136a(bmxv.m108566b(Boolean.valueOf(z)), bmvz.f131120a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static final JSONArray m86142a(Collection r5, bmxj bmxj) {
        JSONArray jSONArray = new JSONArray();
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            bmxv bmxv = (bmxv) bmxj.apply(r5.get(i));
            if (bmxv.mo66813a()) {
                jSONArray.put(bmxv.mo66814b());
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final bmxv mo55210a() {
        bngx e = bngx.m109376e();
        try {
            e = (bngx) azbj.m85193a(this.f99879a).mo54563c().mo56338a().get();
        } catch (InterruptedException | ExecutionException e2) {
            azoj.m85933c("LighterUtils", "Could not retrieve account contexts", new Object[0]);
        }
        bnre i = e.listIterator();
        while (i.hasNext()) {
            bcoh bcoh = (bcoh) i.next();
            if (bcoh.mo57060d() == bcog.VALID && bcoh.mo57061e().equals(cfeo.m138879j())) {
                return bmxv.m108566b(bcoh);
            }
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final bmxv mo55211a(long j) {
        bmxv bmxv = bmvz.f131120a;
        try {
            bmxv = (bmxv) azbj.m85193a(this.f99879a).mo54563c().mo56339a(j).get();
        } catch (InterruptedException | ExecutionException e) {
            azoj.m85933c("LighterUtils", "Could not retrieve account contexts", new Object[0]);
            azph.m85998a(this.f99879a).mo55166b(1729, 59);
        }
        if (!bmxv.mo66813a() || ((bcoh) bmxv.mo66814b()).mo57060d() != bcog.VALID || !((bcoh) bmxv.mo66814b()).mo57061e().equals(cfeo.m138879j())) {
            azph.m85998a(this.f99879a).mo55126a(1729, 56);
            return bmvz.f131120a;
        }
        azph.m85998a(this.f99879a).mo55125a(1728);
        return bmxv;
    }

    /* renamed from: a */
    public final bmxv mo55212a(String str) {
        Uri parse = Uri.parse(str);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(becp.m91786a(this.f99879a, parse), null, new BitmapFactory.Options());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeStream.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            return bmxv.m108566b(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        } catch (FileNotFoundException e) {
            azoj.m85931a("LighterUtils", e, "can not create bitmap String for %s", str);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final List mo55213a(List list, bmxj bmxj) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder((int) cfgs.m139389I());
        sb.append('[');
        int size = list.size();
        int i3 = 0;
        int i4 = 1;
        while (i3 < size) {
            bmxv bmxv = (bmxv) bmxj.apply(list.get(i3));
            if (!bmxv.mo66813a()) {
                azoj.m85933c("LighterUtils", "Unable to encode item.", new Object[0]);
                azph.m85998a(this.f99879a).mo55126a(1929, 81);
                i = i3;
            } else {
                String jSONObject = ((JSONObject) bmxv.mo66814b()).toString();
                i = i3;
                if (((long) jSONObject.getBytes().length) > cfgs.m139389I() - 2) {
                    int length = jSONObject.getBytes().length;
                    StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Dropping item of size ");
                    sb2.append(length);
                    azoj.m85933c("LighterUtils", sb2.toString(), new Object[0]);
                    azph.m85998a(this.f99879a).mo55126a(1929, 82);
                } else {
                    if (((long) (jSONObject.getBytes().length + i4)) > cfgs.m139389I() - 1) {
                        sb.append(']');
                        arrayList.add(sb.toString());
                        int size2 = arrayList.size();
                        StringBuilder sb3 = new StringBuilder(36);
                        sb3.append("Batch #");
                        sb3.append(size2);
                        sb3.append(" Size: ");
                        sb3.append(i4 + 1);
                        azoj.m85930a("LighterUtils", sb3.toString(), new Object[0]);
                        i2 = 1;
                        sb.setLength(1);
                        i4 = 1;
                    } else {
                        i2 = 1;
                    }
                    if (sb.length() > i2) {
                        sb.append(',');
                        i4++;
                    }
                    sb.append(jSONObject);
                    i4 += jSONObject.getBytes().length;
                    int length2 = jSONObject.getBytes().length;
                    StringBuilder sb4 = new StringBuilder(31);
                    sb4.append("Adding item of size ");
                    sb4.append(length2);
                    azoj.m85930a("LighterUtils", sb4.toString(), new Object[0]);
                }
            }
            i3 = i + 1;
        }
        sb.append(']');
        arrayList.add(sb.toString());
        int size3 = arrayList.size();
        StringBuilder sb5 = new StringBuilder(36);
        sb5.append("Batch #");
        sb5.append(size3);
        sb5.append(" Size: ");
        sb5.append(i4 + 1);
        azoj.m85930a("LighterUtils", sb5.toString(), new Object[0]);
        return arrayList;
    }

    /* renamed from: a */
    public final Map mo55214a(bmxv bmxv) {
        HashMap hashMap = new HashMap();
        try {
            PackageInfo packageInfo = this.f99879a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            int i = Build.VERSION.SDK_INT;
            if (cfeo.f183719a.mo6606a().mo81059ck()) {
                hashMap.put("app_uid", Integer.valueOf(this.f99879a.getApplicationInfo().uid));
            }
            hashMap.put("gmscore_version", Integer.valueOf(packageInfo.versionCode));
            hashMap.put("android_sdk_version", Integer.valueOf(i));
            if (bmxv.mo66813a()) {
                hashMap.put("matchstick_version", (Integer) bmxv.mo66814b());
            }
        } catch (PackageManager.NameNotFoundException e) {
            azoj.m85931a("LighterUtils", e, "Could not find package", new Object[0]);
            azph.m85998a(this.f99879a).mo55126a(1611, 36);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo55215a(bcoh bcoh, Intent intent, ConversationId conversationId, String str) {
        bmxv g = bcoh.mo57062g();
        if (g.mo66813a()) {
            intent.putExtra("account_context", ((JSONObject) g.mo66814b()).toString());
        } else {
            azoj.m85933c("LighterUtils", "Could not get Lighter AccountContext JSON String", new Object[0]);
            azph.m85998a(this.f99879a).mo55126a(1823, 58);
        }
        bmxv g2 = conversationId.mo60559g();
        if (g2.mo66813a()) {
            intent.putExtra("lighter_conversation_id", ((JSONObject) g2.mo66814b()).toString());
            intent.putExtra("server_app_id", m86137a(conversationId));
        } else {
            azoj.m85933c("LighterUtils", "Could not get Lighter Conversation ID JSON String", new Object[0]);
            azph.m85998a(this.f99879a).mo55129a(1433, 42, conversationId);
        }
        intent.putExtra("web_url", str);
    }

    /* renamed from: a */
    public final void mo55216a(bcoh bcoh, ConversationId conversationId, String str) {
        if (TextUtils.isEmpty(str)) {
            azph.m85998a(this.f99879a).mo55146a(1847, conversationId);
        } else {
            new soa(9, new azqd(this, bcoh, conversationId, str)).start();
        }
    }
}
