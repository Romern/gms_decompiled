package com.google.android.gms.fitness.service.sessions;

import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Message;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitSessionsChimeraBroker extends zme {

    /* renamed from: j */
    private static final srn f32416j = zvt.m46581a();

    /* renamed from: k */
    private ytk f32417k;

    public FitSessionsChimeraBroker() {
        super("com.google.android.gms.fitness.service.sessions.FitSessionsBroker");
    }

    /* renamed from: b */
    private final void m23791b(Intent intent) {
        try {
            m23792c(intent);
        } catch (BadParcelableException e) {
            Bundle bundle = new Bundle();
            bundle.putInt("com.google.android.location.cache.cache_type", 2);
            bundle.putBoolean("com.google.android.location.cache.is_cache", true);
            intent.replaceExtras(bundle);
            m23792c(intent);
            this.f32417k.mo30748a();
            bnsl bnsl = (bnsl) f32416j.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("com.google.android.gms.fitness.service.sessions.FitSessionsChimeraBroker", "b", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Found bad intent, had to clear it.");
        }
    }

    /* renamed from: c */
    private final void m23792c(Intent intent) {
        if (rsk.m34335a(intent) && rsk.m34336b(intent) == 1) {
            this.f32417k.mo30749a(intent);
            mo31254f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19167a() {
        return zav.f54899a.mo3214a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo19173d() {
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        this.f32417k.f54587a.mo25063a(printWriter);
    }

    public final boolean handleMessage(Message message) {
        if (message.what <= 2) {
            return super.handleMessage(message);
        }
        if (message.what == 3) {
            m23791b((Intent) message.obj);
            if (mo31251c()) {
                return true;
            }
            stopSelf();
            return true;
        }
        String valueOf = String.valueOf(message);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unexpected message ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!rsk.m34335a(intent)) {
            return super.onStartCommand(intent, i, i2);
        }
        mo31249a(3, intent);
        return 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zlz mo19168a(String str) {
        return new zor(this, str, new zpe(this.f32417k, str), this.f55438f);
    }

    /* renamed from: a */
    public final void mo19171a(yzs yzs, sns sns, snr snr, ExecutorService executorService) {
        super.mo19171a(yzs, sns, snr, executorService);
        this.f32417k = yzs.mo30870a(this, "com.google.android.gms.fitness.service.sessions.FitSessionsBroker", 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19169a(Intent intent) {
        return "com.google.android.gms.fitness.SessionsApi".equals(intent.getAction());
    }
}
