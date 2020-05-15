package p000;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anlo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anlo implements qkb {

    /* renamed from: a */
    private static final ConcurrentHashMap f77059a = new ConcurrentHashMap();

    /* renamed from: e */
    private static final String f77060e = "0";

    /* renamed from: f */
    private static final String f77061f = "1";

    /* renamed from: g */
    private static final String f77062g = "2";

    /* renamed from: h */
    private static final String f77063h = "3";

    /* renamed from: i */
    private static final String f77064i = "4";

    /* renamed from: b */
    private final shy f77065b;

    /* renamed from: c */
    private final Configuration f77066c;

    /* renamed from: d */
    private final PackageManager f77067d;

    public anlo(Context context, Intent intent) {
        this.f77065b = new shy(intent);
        this.f77066c = context.getResources().getConfiguration();
        this.f77067d = context.getPackageManager();
    }

    /* renamed from: a */
    private static aohc m64721a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        if (favaDiagnosticsEntity == null) {
            return null;
        }
        aohb aohb = new aohb();
        aohb.f78325a = favaDiagnosticsEntity.f30303b;
        aohb.f78327c.add(2);
        aohb.f78326b = favaDiagnosticsEntity.f30304c;
        aohb.f78327c.add(3);
        return new FavaDiagnosticsNamespacedTypeEntity(aohb.f78327c, aohb.f78325a, aohb.f78326b);
    }

    /* renamed from: a */
    public final void mo11593a(Status status) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11594a(qkg qkg) {
        String str;
        Integer num;
        DefaultChimeraIntentService defaultChimeraIntentService = (DefaultChimeraIntentService) qkg;
        String a = this.f77065b.mo25572a();
        FavaDiagnosticsEntity d = this.f77065b.mo25583d();
        FavaDiagnosticsEntity b = this.f77065b.mo25577b();
        FavaDiagnosticsEntity c = this.f77065b.mo25580c();
        int intExtra = this.f77065b.f44517a.getIntExtra("duration", 0);
        ClientActionDataEntity clientActionDataEntity = (ClientActionDataEntity) this.f77065b.f44517a.getParcelableExtra("clientActionData");
        String stringExtra = this.f77065b.f44517a.getStringExtra("callingPackage");
        String str2 = null;
        if (stringExtra != null) {
            String str3 = (String) f77059a.get(stringExtra);
            if (str3 == null) {
                try {
                    str2 = spn.m35882e(defaultChimeraIntentService, stringExtra);
                } catch (PackageManager.NameNotFoundException e) {
                }
                if (str2 != null) {
                    f77059a.put(stringExtra, str2);
                }
            } else {
                str2 = str3;
            }
        }
        ActionTargetEntity actionTargetEntity = (ActionTargetEntity) this.f77065b.f44517a.getParcelableExtra("actionTarget");
        String stringExtra2 = this.f77065b.f44517a.getStringExtra("plusPageId");
        aohm aohm = new aohm();
        aohm.f78331d = Build.FINGERPRINT;
        aohm.f78336i.add(5);
        aohm.f78332e = Build.MANUFACTURER;
        aohm.f78336i.add(6);
        int i = this.f77066c.orientation;
        if (i != 0) {
            str = i != 1 ? i != 2 ? i != 3 ? f77060e : f77063h : f77061f : f77062g;
        } else {
            str = f77064i;
        }
        aohm.f78333f = str;
        aohm.f78336i.add(7);
        int i2 = Build.VERSION.SDK_INT;
        aohm.f78334g = this.f77066c.screenHeightDp;
        DefaultChimeraIntentService defaultChimeraIntentService2 = defaultChimeraIntentService;
        aohm.f78336i.add(8);
        aohm.f78335h = this.f77066c.screenWidthDp;
        aohm.f78336i.add(9);
        aohm.f78329b = this.f77067d.hasSystemFeature("android.hardware.screen.landscape");
        aohm.f78336i.add(3);
        String str4 = stringExtra2;
        aohm.f78330c = this.f77067d.hasSystemFeature("android.hardware.screen.portrait");
        aohm.f78336i.add(4);
        int i3 = Build.VERSION.SDK_INT;
        aohm.f78328a = this.f77066c.densityDpi;
        aohm.f78336i.add(2);
        String str5 = a;
        ClientActionDataEntity clientActionDataEntity2 = clientActionDataEntity;
        ActionTargetEntity actionTargetEntity2 = actionTargetEntity;
        String str6 = str2;
        String str7 = stringExtra;
        OzDeviceInfoEntity ozDeviceInfoEntity = new OzDeviceInfoEntity(aohm.f78336i, aohm.f78328a, aohm.f78329b, aohm.f78330c, aohm.f78331d, aohm.f78332e, aohm.f78333f, aohm.f78334g, aohm.f78335h);
        aohc a2 = m64721a(d);
        aohc a3 = m64721a(b);
        aohc a4 = m64721a(c);
        aogz aogz = new aogz();
        aogz.f78323d = intExtra;
        aogz.f78324e.add(24);
        if (a2 != null) {
            aogz.f78320a = (FavaDiagnosticsNamespacedTypeEntity) a2;
            aogz.f78324e.add(3);
        }
        aogz.f78322c = (FavaDiagnosticsNamespacedTypeEntity) a3;
        aogz.f78324e.add(20);
        if (a4 != null) {
            aogz.f78321b = (FavaDiagnosticsNamespacedTypeEntity) a4;
            aogz.f78324e.add(4);
        }
        com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity favaDiagnosticsEntity = new com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity(aogz.f78324e, aogz.f78320a, aogz.f78321b, aogz.f78322c, aogz.f78323d);
        aoho aoho = new aoho();
        aoho.f78339c = favaDiagnosticsEntity;
        aoho.f78343g.add(7);
        aoho.f78340d = true;
        aoho.f78343g.add(10);
        aoho.f78341e = str7;
        aoho.f78343g.add(14);
        aoho.f78342f = str6;
        aoho.f78343g.add(15);
        aoho.f78338b = ozDeviceInfoEntity;
        aoho.f78343g.add(5);
        if (actionTargetEntity2 != null) {
            aoho.f78337a = actionTargetEntity2;
            num = 2;
            aoho.f78343g.add(2);
        } else {
            num = 2;
        }
        OzEventEntity ozEventEntity = new OzEventEntity(aoho.f78343g, aoho.f78337a, aoho.f78338b, aoho.f78339c, aoho.f78340d, aoho.f78341e, aoho.f78342f);
        aogn aogn = new aogn();
        aogn.f78308c = ozEventEntity;
        aogn.f78309d.add(5);
        aogn.f78307b = System.currentTimeMillis();
        aogn.f78309d.add(3);
        if (clientActionDataEntity2 != null) {
            aogn.f78306a = clientActionDataEntity2;
            aogn.f78309d.add(num);
        }
        ClientOzEventEntity clientOzEventEntity = new ClientOzEventEntity(aogn.f78309d, aogn.f78306a, aogn.f78307b, aogn.f78308c);
        ContentValues contentValues = new ContentValues();
        contentValues.put("accountName", str5);
        contentValues.put("type", (Integer) 1);
        contentValues.put("payload", clientOzEventEntity.toString());
        contentValues.put("onBehalfOf", str4);
        contentValues.put("timestamp", Long.valueOf(clientOzEventEntity.f82891d));
        defaultChimeraIntentService2.getContentResolver().insert(anua.f77730a, contentValues);
    }
}
