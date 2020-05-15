package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: aalt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalt {

    /* renamed from: a */
    public final Messenger f28418a;

    /* renamed from: b */
    public final MessengerCompat f28419b;

    /* renamed from: c */
    private final Object f28420c = new Object();

    /* renamed from: d */
    private final SparseArray f28421d = new SparseArray();

    public aalt() {
        Looper mainLooper = Looper.getMainLooper();
        int i = Build.VERSION.SDK_INT;
        this.f28418a = new Messenger(new aalq(this, mainLooper));
        this.f28419b = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo16978a(int i, aals aals) {
        boolean z;
        synchronized (this.f28420c) {
            if (this.f28421d.get(i) == null) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34971a(z, (Object) "Multiple callbacks registered for same what");
            this.f28421d.put(i, aals);
        }
    }

    /* renamed from: a */
    public final void mo16979a(Message message, int i) {
        aals aals;
        aalr aalr = new aalr(message, i);
        if (!TextUtils.isEmpty(aalr.f28414c.f28457a) && aalr.f28415d != null && aalr.f28416e != null) {
            synchronized (this.f28420c) {
                aals = (aals) this.f28421d.get(aalr.f28412a);
            }
            if (aals == null) {
                int i2 = aalr.f28412a;
                StringBuilder sb = new StringBuilder(50);
                sb.append("Invalid request, no callback for what: ");
                sb.append(i2);
                Log.w("GCM", sb.toString());
                Bundle bundle = new Bundle();
                bundle.putBoolean("unsupported", true);
                aalr.mo16977a(bundle);
                return;
            }
            aals.mo16900a(aalr);
            if (aalr.f28413b) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("ack", true);
                aalr.mo16977a(bundle2);
            }
        }
    }
}
