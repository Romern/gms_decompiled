package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.util.Map;

/* renamed from: aara */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aara implements Comparable {

    /* renamed from: c */
    public final int f28967c;

    /* renamed from: d */
    public final aamh f28968d;

    /* renamed from: e */
    public final Bundle f28969e;

    /* renamed from: f */
    public final Map f28970f;

    public aara(int i, aamh aamh, Bundle bundle, Map map) {
        this.f28967c = i;
        this.f28968d = aamh;
        this.f28969e = bundle;
        this.f28970f = map;
    }

    /* renamed from: a */
    public static aara m21844a(int i, int i2, Intent intent, Map map) {
        Bundle bundle;
        String a = m21846a(intent);
        if (a == null) {
            return null;
        }
        aamh a2 = aamh.m21513a(a, i2);
        Messenger b = m21849b(intent);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            bundle = new Bundle();
        } else {
            bundle = extras;
        }
        return new aaqz(i, a2, bundle, map, b, i2);
    }

    /* renamed from: b */
    public static Messenger m21849b(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
        if (parcelableExtra instanceof Messenger) {
            intent.removeExtra("google.messenger");
            return (Messenger) parcelableExtra;
        }
        Log.w("GCM", "Register request missing messenger");
        return null;
    }

    /* renamed from: a */
    public void mo17198a(Context context, Bundle bundle) {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return bqcn.m112576a(mo17199a(), ((aara) obj).mo17199a());
    }

    /* renamed from: a */
    public static aara m21845a(aamh aamh, int i) {
        return new aara(3, aamh, Bundle.EMPTY, m21847a(i));
    }

    /* renamed from: a */
    public static String m21846a(Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("app");
        if (parcelableExtra instanceof PendingIntent) {
            intent.removeExtra("app");
            return ((PendingIntent) parcelableExtra).getTargetPackage();
        }
        Log.w("GCM", "Invalid parameter app");
        return null;
    }

    /* renamed from: a */
    public static Map m21847a(int i) {
        C1223np npVar = new C1223np();
        npVar.put("delete", "true");
        npVar.put("unreg_cause", String.valueOf(i));
        return npVar;
    }

    /* renamed from: a */
    static final boolean m21848a(Messenger messenger, Intent intent) {
        Message obtain = Message.obtain();
        obtain.obj = intent;
        try {
            messenger.send(obtain);
            return true;
        } catch (RemoteException e) {
            return false;
        }
    }

    /* renamed from: a */
    public final int mo17199a() {
        int i = this.f28967c;
        if (i != 0) {
            return i != 1 ? 1 : 0;
        }
        boolean containsKey = this.f28969e.containsKey("delete");
        return this.f28969e.containsKey("gcm.topic") ? !containsKey ? 2 : 3 : !containsKey ? 0 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo17200a(Bundle bundle) {
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTRATION");
        intent.setPackage(this.f28968d.f28457a);
        intent.putExtras(bundle);
        return intent;
    }
}
