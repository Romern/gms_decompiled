package com.google.android.gms.car;

import android.content.Intent;
import android.os.IBinder;
import android.telecom.Phone;
import com.google.android.chimera.InCallService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InCallServiceImpl extends InCallService {

    /* renamed from: a */
    public CopyOnWriteArrayList f29408a = new CopyOnWriteArrayList();

    public IBinder onBind(Intent intent) {
        if ("local_action".equals(intent.getAction())) {
            return new nti(this);
        }
        return super.onBind(intent);
    }

    public final void onPhoneCreated(Phone phone) {
        Iterator it = this.f29408a.iterator();
        while (it.hasNext()) {
            ((nku) it.next()).f35919a.mo21001a(new ntv(phone));
        }
    }

    public final void onPhoneDestroyed(Phone phone) {
        Iterator it = this.f29408a.iterator();
        while (it.hasNext()) {
            new ntv(phone);
            ((nku) it.next()).f35919a.mo21001a((ntv) null);
        }
    }

    public final boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return true;
    }
}
