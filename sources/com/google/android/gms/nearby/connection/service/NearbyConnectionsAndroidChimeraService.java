package com.google.android.gms.nearby.connection.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NearbyConnectionsAndroidChimeraService extends Service {

    /* renamed from: a */
    private ahjr f80485a;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ahjr ahjr = this.f80485a;
        if (ahjr != null) {
            ahjr.dump(fileDescriptor, printWriter, strArr);
        }
        printWriter.flush();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.nearby.connection.service.START".equals(intent.getAction())) {
            return null;
        }
        srn srn = ahkm.f67363a;
        if (this.f80485a == null) {
            this.f80485a = new ahjr(this);
        }
        return this.f80485a;
    }

    public final boolean onUnbind(Intent intent) {
        ahjr ahjr = this.f80485a;
        if (ahjr == null) {
            return false;
        }
        ahjr.f67293b.f67411a.mo36749a();
        ahki ahki = ahjr.f67292a;
        bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
        bnsl.mo68432a("ahki", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Initiating shutdown of ServiceControllerRouter %s.", ahki);
        ahki.mo36638a(new ahjs(ahki));
        ahhr.m55805a(ahki.f67339b, "ServiceControllerRouter.offBinderSerializer");
        this.f80485a = null;
        return false;
    }
}
