package p000;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: agkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agkw extends agcu {

    /* renamed from: b */
    protected agkt f65831b;

    /* renamed from: c */
    public volatile agkt f65832c;

    /* renamed from: d */
    public agkt f65833d;

    /* renamed from: e */
    public final Map f65834e = new ConcurrentHashMap();

    /* renamed from: f */
    public agkt f65835f;

    /* renamed from: g */
    public String f65836g;

    public agkw(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    public static void m54438a(agkt agkt, Bundle bundle, boolean z) {
        if (bundle != null && agkt != null && (!bundle.containsKey("_sc") || z)) {
            String str = agkt.f65821a;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            String str2 = agkt.f65822b;
            if (str2 != null) {
                bundle.putString("_sc", str2);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", agkt.f65823c);
        } else if (bundle != null && agkt == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo35247n() {
        return false;
    }

    /* renamed from: o */
    public final agkt mo35597o() {
        mo35245l();
        mo35241h();
        return this.f65831b;
    }

    /* renamed from: p */
    public final agkt mo35598p() {
        mo35242i();
        return this.f65832c;
    }

    /* renamed from: a */
    public final agkt mo35593a(Activity activity) {
        sdo.m34959a(activity);
        agkt agkt = (agkt) this.f65834e.get(activity);
        if (agkt != null) {
            return agkt;
        }
        agkt agkt2 = new agkt(null, mo35594a(activity.getClass().getCanonicalName()), mo35540x().mo35750d());
        this.f65834e.put(activity, agkt2);
        return agkt2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo35594a(String str) {
        String str2;
        String[] split = str.split("\\.");
        int length = split.length;
        if (length > 0) {
            str2 = split[length - 1];
        } else {
            str2 = "";
        }
        int length2 = str2.length();
        mo35538v();
        if (length2 <= 100) {
            return str2;
        }
        mo35538v();
        return str2.substring(0, 100);
    }

    /* renamed from: a */
    public final void mo35595a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (mo35538v().mo35326g().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f65834e.put(activity, new agkt(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r3 != null) goto L_0x0011;
     */
    /* renamed from: a */
    public final void mo35596a(String str, agkt agkt) {
        mo35241h();
        synchronized (this) {
            String str2 = this.f65836g;
            if (str2 != null) {
                if (str2.equals(str)) {
                }
            }
            this.f65836g = str;
            this.f65835f = agkt;
        }
    }
}
