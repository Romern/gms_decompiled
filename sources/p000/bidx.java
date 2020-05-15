package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bidx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidx {

    /* renamed from: a */
    private static final String f120348a = m102044a("com.area120.reply", "com.google.android.apps.bigtop", "com.google.android.apps.car.carapp", "com.google.android.apps.inbox", "com.google.android.apps.kids.familycompass", "com.google.android.apps.nexuslauncher", "com.google.android.apps.spot", "com.google.android.apps.suggest", "com.google.android.apps.sunshine", "com.google.android.apps.telepathy", "com.google.android.apps.walletnfcrel", "com.google.android.apps.walletnfcrel.testing", "com.google.android.googlequicksearchbox", "com.google.android.keep", "com.google.android.music", "com.google.android.settings.intelligence", "com.google.android.street", "com.google.android.wearable.app", "com.google.android.wearable.chameleon", "com.google.commerce.tapandpay.alienfood", "com.google.commerce.tapandpay.dev", "com.waymo.carapp", "com.google.devrel.gmscore.memtest.places", "com.google.android.gms.apitest.places", "com.google.android.gms.common.uxtester", "com.google.android.gms.test_apps.location.places", "com.google.android.gms.test_apps.location.places.placepicker", "com.google.android.gms.test_apps.location.places.aliaseditor", "com.google.android.gms.test_apps.places", "com.google.android.gms.test_apps.places.autocompletewidget", "com.google.android.gms.test_apps.places.placepicker", "com.google.android.gms.test_apps.places.aliaseditor", "com.google.android.gms.testapps.places", "com.google.android.gms.testapps.places.geodata.firstparty", "com.google.android.gms.testapps.places.geodata.zeroparty", "com.google.android.gms.testapps.places.placepicker.zeroparty");

    /* renamed from: b */
    private static final String f120349b = m102044a("auth", "autofill", "com.google.brella.datacollection", "reminders", "ulr");

    /* renamed from: c */
    private static final String f120350c = m102044a("com.google.android.apps.gmm", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps", "com.google.android.apps.maps.sideload", "com.google.android.apps.plus", "com.google.android.apps.walletnfcrel", "com.google.android.apps.walletnfcrel.testing", "com.google.android.apps.youtube.music", "com.google.android.googlequicksearchbox", "com.google.android.keep", "com.google.android.settings.intelligence", "com.google.android.talk", "com.google.commerce.tapandpay.alienfood", "com.google.commerce.tapandpay.dev", "com.google.android.gms.apitest.places", "com.google.android.gms.test_apps.location.places", "com.google.android.gms.test_apps.location.places.placepicker", "com.google.android.gms.test_apps.places", "com.google.android.gms.test_apps.places.placepicker", "com.google.android.gms.testapps.places", "com.google.android.gms.testapp.userlocation");

    /* renamed from: d */
    private static final String f120351d = m102044a("com.google.android.contextmanager.producer.module.PlacesProducer", "semanticlocation", "XGeoHeaderProducer");

    /* renamed from: e */
    private final Set f120352e;

    /* renamed from: f */
    private final Set f120353f;

    /* renamed from: g */
    private final int f120354g;

    public bidx(int i) {
        this.f120354g = i;
        if (i != 1) {
            this.f120352e = m102045a(f120350c);
            this.f120353f = m102045a(f120351d);
            return;
        }
        this.f120352e = m102045a(f120348a);
        this.f120353f = m102045a(f120349b);
    }

    /* renamed from: a */
    private final String m102043a() {
        if (this.f120354g != 1) {
            return cgfu.f186786a.mo6606a().mo83660h();
        }
        return cgfu.f186786a.mo6606a().mo83656d();
    }

    /* renamed from: b */
    private final String m102048b() {
        if (this.f120354g != 1) {
            return cgfu.f186786a.mo6606a().mo83657e();
        }
        return cgfu.f186786a.mo6606a().mo83653a();
    }

    /* renamed from: c */
    private final String m102049c() {
        if (this.f120354g != 1) {
            return cgfu.f186786a.mo6606a().mo83659g();
        }
        return cgfu.f186786a.mo6606a().mo83655c();
    }

    /* renamed from: d */
    private final String m102050d() {
        if (this.f120354g != 1) {
            return cgfu.f186786a.mo6606a().mo83658f();
        }
        return cgfu.f186786a.mo6606a().mo83654b();
    }

    /* renamed from: a */
    private static String m102044a(String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            sb.append(",");
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static final HashSet m102045a(String str) {
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private static final HashSet m102046a(Set set, String str, String str2) {
        HashSet<String> a = m102045a(str);
        HashSet a2 = m102045a(str2);
        HashSet hashSet = new HashSet(set.size() + a.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!a2.contains(str3)) {
                hashSet.add(str3);
            }
        }
        for (String str4 : a) {
            if (!a2.contains(str4)) {
                hashSet.add(str4);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    private static final void m102047a(String str, Set set) {
        if (str == null || !set.contains(str)) {
            throw new aaaj(13, String.format("%s cannot access user data - contact android-places-team@google.com.", str));
        }
    }

    /* renamed from: a */
    public final void mo64560a(Context context, String str) {
        if (!rfz.m33557a(context).mo24610b(str)) {
            throw new aaaj(13, String.valueOf(str).concat(" doesn't have access to internal APIs."));
        }
    }

    /* renamed from: a */
    public final void mo64561a(String str, String str2) {
        Set set;
        Set set2;
        if (!"com.google.android.gms".equals(str)) {
            if (m102043a() == null || m102048b() == null) {
                set2 = this.f120352e;
            } else {
                set2 = m102046a(this.f120352e, m102043a(), m102048b());
            }
            m102047a(str, set2);
            return;
        }
        if (m102049c() == null || m102050d() == null) {
            set = this.f120353f;
        } else {
            set = m102046a(this.f120353f, m102049c(), m102050d());
        }
        m102047a(str2, set);
    }
}
