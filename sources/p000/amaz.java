package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;
import com.google.android.gms.people.model.AvatarReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: amaz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amaz extends sbm {

    /* renamed from: e */
    public static final /* synthetic */ int f74597e = 0;

    /* renamed from: f */
    private static volatile Bundle f74598f;

    /* renamed from: g */
    private static volatile Bundle f74599g;

    /* renamed from: a */
    public final String f74600a;

    /* renamed from: b */
    public final String f74601b;

    /* renamed from: c */
    public final Context f74602c;

    /* renamed from: d */
    public final HashMap f74603d = new HashMap();

    public amaz(Context context, Looper looper, rjz rjz, rka rka, String str, sat sat) {
        super(context.getApplicationContext(), looper, 5, sat, rjz, rka);
        this.f74602c = context;
        this.f74600a = str;
        this.f74601b = sat.f43967e;
    }

    /* renamed from: a */
    public static amfb m62472a(DataHolder dataHolder) {
        if (dataHolder != null) {
            return new amfb(dataHolder, new ambs(f74599g), new ambr(f74598f));
        }
        return null;
    }

    /* renamed from: b */
    public static final synchronized void m62475b(Bundle bundle) {
        synchronized (amaz.class) {
            if (bundle != null) {
                ambn.f74652l = bundle.getBoolean("use_contactables_api", true);
                ancb.f76610a.mo41686a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
                f74598f = bundle.getBundle("config.email_type_map");
                f74599g = bundle.getBundle("config.phone_type_map");
            }
        }
    }

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return alks.f73604g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.people.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.f74600a);
        bundle.putString("real_client_package_name", this.f74601b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
     arg types: [amah, int, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], int]
     candidates:
      alzp.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
      alzp.a(alzm, java.lang.String, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      alzp.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle */
    /* renamed from: j */
    public final void mo14032j() {
        String str;
        String str2;
        synchronized (this.f74603d) {
            if (mo25301p()) {
                for (amah amah : this.f74603d.values()) {
                    amah.mo41074a();
                    try {
                        mo41096n().mo40540a((alzm) amah, false, (String) null, (String) null, 0);
                    } catch (RemoteException e) {
                        e = e;
                        str2 = "PeopleClient";
                        str = "Failed to unregister listener";
                    } catch (IllegalStateException e2) {
                        e = e2;
                        str2 = "PeopleClient";
                        str = "PeopleService is in unexpected state";
                    }
                }
            }
            this.f74603d.clear();
        }
        super.mo14032j();
        return;
        Log.w(str2, str, e);
    }

    /* renamed from: n */
    public final alzp mo41096n() {
        return (alzp) super.mo25289B();
    }

    /* renamed from: a */
    public static PendingIntent m62473a(Bundle bundle) {
        if (bundle != null) {
            return (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ Status m62474a(int i, Bundle bundle) {
        return new Status(i, null, m62473a(bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof alzp) {
            return (alzp) queryLocalInterface;
        }
        return new alzn(iBinder);
    }

    /* renamed from: b */
    public final void mo41095b(rlf rlf, String str, String str2) {
        super.mo25288A();
        amam amam = new amam(rlf);
        try {
            mo41096n().mo40592c(amam, str, str2);
        } catch (RemoteException e) {
            amam.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final sce mo41076a(rlf rlf, AvatarReference avatarReference, allg allg) {
        super.mo25288A();
        amap amap = new amap(rlf);
        try {
            alzp n = mo41096n();
            if (allg == null) {
                allg = allg.f73620a;
            }
            return n.mo40546a(amap, avatarReference, new ParcelableLoadImageOptions(allg.f73621b, allg.f73622c, false));
        } catch (RemoteException e) {
            amap.mo40530a(8, null, null, null);
            return null;
        }
    }

    /* renamed from: a */
    public final sce mo41077a(rlf rlf, String str) {
        super.mo25288A();
        amap amap = new amap(rlf);
        try {
            return mo41096n().mo40547a(amap, str);
        } catch (RemoteException e) {
            amap.mo40530a(8, null, null, null);
            return null;
        }
    }

    /* renamed from: a */
    public final sce mo41078a(rlf rlf, String str, int i, int i2) {
        super.mo25288A();
        amap amap = new amap(rlf);
        try {
            return mo41096n().mo40581b(amap, str, i, i2);
        } catch (RemoteException e) {
            amap.mo40530a(8, null, null, null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16780a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Bundle bundle2;
        if (i == 0 && bundle != null) {
            m62475b(bundle.getBundle("post_init_configuration"));
        }
        if (bundle != null) {
            bundle2 = bundle.getBundle("post_init_resolution");
        } else {
            bundle2 = null;
        }
        super.mo16780a(i, iBinder, bundle2, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
     arg types: [amah, int, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY], int]
     candidates:
      alzp.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
      alzp.a(alzm, java.lang.String, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      alzp.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle */
    /* renamed from: a */
    public final void mo41079a(alll alll) {
        synchronized (this.f74603d) {
            try {
                super.mo25288A();
                if (this.f74603d.containsKey(alll)) {
                    amah amah = (amah) this.f74603d.get(alll);
                    amah.mo41074a();
                    mo41096n().mo40540a((alzm) amah, false, (String) null, (String) null, 0);
                    this.f74603d.remove(alll);
                    return;
                }
                this.f74603d.remove(alll);
            } catch (Throwable th) {
                this.f74603d.remove(alll);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo41080a(alxm alxm, alvp alvp) {
        super.mo25288A();
        amaj amaj = new amaj(alxm);
        alvl alvl = alvp.f74402a;
        AccountToken accountToken = new AccountToken(alvl.f74385a, alvl.f74386b);
        try {
            alzp n = mo41096n();
            boolean z = alvp.f74403b;
            boolean z2 = alvp.f74404c;
            boolean z3 = alvp.f74405d;
            alvl alvl2 = alvp.f74402a;
            n.mo40545a(amaj, accountToken, new ParcelableListOptions(z, z2, z3, alvl2.f74387c, alvl2.f74388d));
        } catch (RemoteException e) {
            amaj.mo40528a(8, (Bundle) null, new Bundle());
        }
    }

    /* renamed from: a */
    public final void mo41081a(alzw alzw, alvn alvn, String... strArr) {
        sdo.m34959a(strArr);
        super.mo25288A();
        amai amai = new amai(alzw);
        alvl alvl = alvn.f74393a;
        AccountToken accountToken = new AccountToken(alvl.f74385a, alvl.f74386b);
        List asList = Arrays.asList(strArr);
        try {
            alzp n = mo41096n();
            boolean z = alvn.f74394b;
            boolean z2 = alvn.f74395c;
            boolean z3 = alvn.f74396d;
            alvl alvl2 = alvn.f74393a;
            n.mo40556a(amai, accountToken, asList, new ParcelableGetOptions(z, false, z3, alvl2.f74387c, alvl2.f74388d));
        } catch (RemoteException e) {
            amai.mo40528a(8, (Bundle) null, new Bundle());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
     arg types: [amah, int, java.lang.String, java.lang.String, int]
     candidates:
      alzp.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
      alzp.a(alzm, java.lang.String, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      alzp.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle */
    /* renamed from: a */
    public final void mo41082a(amah amah, String str, String str2, int i) {
        super.mo25288A();
        synchronized (this.f74603d) {
            mo41096n().mo40540a((alzm) amah, true, str, str2, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alzp.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle
     arg types: [java.lang.String, java.lang.String, long, boolean, int]
     candidates:
      alzp.a(alzm, boolean, java.lang.String, java.lang.String, int):android.os.Bundle
      alzp.a(alzm, java.lang.String, java.lang.String, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, android.net.Uri, boolean):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List):void
      alzp.a(alzm, boolean, boolean, java.lang.String, java.lang.String):void
      alzp.a(java.lang.String, java.lang.String, long, boolean, boolean):android.os.Bundle */
    /* renamed from: a */
    public final void mo41083a(String str, String str2, long j, boolean z) {
        super.mo25288A();
        mo41096n().mo40544a(str, str2, j, z, false);
    }

    /* renamed from: a */
    public final void mo41084a(rlf rlf, Bundle bundle) {
        super.mo25288A();
        amak amak = new amak(rlf);
        try {
            mo41096n().mo40555a(amak, bundle);
        } catch (RemoteException e) {
            amak.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo41085a(rlf rlf, String str, String str2) {
        super.mo25288A();
        amab amab = new amab(rlf);
        try {
            mo41096n().mo40586b(amab, str, str2);
        } catch (RemoteException e) {
            amab.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo41086a(rlf rlf, String str, String str2, int i, String str3, boolean z) {
        super.mo25288A();
        amag amag = new amag(rlf);
        try {
            mo41096n().mo40565a(amag, str, str2, (String) null, i, str3, z);
        } catch (RemoteException e) {
            amag.mo40531a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, long, java.lang.String, int, int, int):void
     arg types: [amaq, java.lang.String, java.lang.String, ?[OBJECT, ARRAY], java.util.ArrayList, int, int, int, java.lang.String, int, int, int]
     candidates:
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, int, java.lang.String, boolean, int, int):void
      alzp.a(alzm, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, long, java.lang.String, int, int, int):void */
    /* renamed from: a */
    public final void mo41087a(rlf rlf, String str, String str2, alkz alkz) {
        alkz alkz2;
        amaq amaq;
        ArrayList arrayList;
        if (alkz != null) {
            alkz2 = alkz;
        } else {
            alkz2 = alkz.f73615a;
        }
        Collection collection = alkz2.f73616b;
        String str3 = alkz2.f73617c;
        super.mo25288A();
        amaq amaq2 = new amaq(rlf);
        try {
            alzp n = mo41096n();
            if (collection != null) {
                arrayList = new ArrayList(collection);
            } else {
                arrayList = null;
            }
            amaq = amaq2;
            try {
                n.mo40573a((alzm) amaq2, str, str2, (String) null, (List) arrayList, 2097151, false, 0L, str3, 7, 0, 0);
            } catch (RemoteException e) {
                amaq.mo40531a(8, (Bundle) null, (DataHolder) null);
            }
        } catch (RemoteException e2) {
            amaq = amaq2;
            amaq.mo40531a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* renamed from: a */
    public final void mo41088a(rlf rlf, String str, String str2, allj allj) {
        String str3 = allj.f73623a;
        int i = allj.f73625c;
        String str4 = allj.f73624b;
        super.mo25288A();
        amar amar = new amar(rlf);
        try {
            mo41096n().mo40588b(amar, str, str2, str3, i, str4);
        } catch (RemoteException e) {
            amar.mo40531a(8, (Bundle) null, (DataHolder) null);
        }
    }

    /* renamed from: a */
    public final void mo41089a(rlf rlf, String str, String str2, Uri uri, boolean z) {
        super.mo25288A();
        amae amae = new amae(rlf);
        try {
            mo41096n().mo40562a(amae, str, str2, uri, z);
        } catch (RemoteException e) {
            amae.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo41090a(rlf rlf, String str, String str2, String str3) {
        super.mo25288A();
        alzx alzx = new alzx(rlf);
        try {
            mo41096n().mo40563a(alzx, str, str2, str3);
        } catch (RemoteException e) {
            alzx.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo41091a(rlf rlf, String str, String str2, String str3, List list) {
        super.mo25288A();
        alzz alzz = new alzz(rlf);
        try {
            mo41096n().mo40569a(alzz, str, str2, str3, list);
        } catch (RemoteException e) {
            alzz.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public final void mo41092a(rlf rlf, String str, String str2, String str3, List list, List list2, FavaDiagnosticsEntity favaDiagnosticsEntity) {
        super.mo25288A();
        amas amas = new amas(rlf);
        try {
            mo41096n().mo40574a(amas, str, str2, str3, list, list2, favaDiagnosticsEntity);
        } catch (RemoteException e) {
            amas.mo40528a(8, (Bundle) null, (Bundle) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo41093a(rlf rlf, String str, String str2, boolean z, int i, boolean z2, int i2) {
        int i3;
        ambo ambo;
        ambn ambn;
        amad amad;
        super.mo25288A();
        if (i2 == 0 || !TextUtils.isEmpty(null)) {
            i3 = i2;
        } else {
            Log.w("PeopleClient", "Ignoring custom sort order for all aggregation.");
            i3 = 0;
        }
        Context context = this.f43948r;
        amaw amaw = new amaw(rlf);
        Bundle bundle = f74599g;
        if (TextUtils.isEmpty(null)) {
            ambo = new ambo(context, amaw, bundle);
        } else if (TextUtils.isEmpty(null)) {
            ambo = new ambq(context, amaw, bundle);
        } else {
            throw new IllegalArgumentException("Search aggregation doesn't support filtering by gaia-id");
        }
        amad amad2 = new amad(ambo);
        try {
            amad = amad2;
            ambn = ambo;
            try {
                mo41096n().mo40568a(amad2, str, str2, (String) null, 7, z, i, 0, (String) null, z2, i3, 3);
            } catch (RemoteException e) {
            }
        } catch (RemoteException e2) {
            amad = amad2;
            ambn = ambo;
            amad.mo40532a(8, (Bundle) null, (DataHolder[]) null);
            if (ambn.f74656d) {
            }
        }
        if (ambn.f74656d) {
            ambn.mo41112a();
        }
    }

    /* renamed from: a */
    public final void mo41094a(rlf rlf, boolean z, boolean z2, String str, String str2, int i) {
        super.mo25288A();
        amao amao = new amao(rlf);
        try {
            mo41096n().mo40579a(amao, z, z2, str, str2, i);
        } catch (RemoteException e) {
            amao.mo40531a(8, (Bundle) null, (DataHolder) null);
        }
    }
}
