package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.gcm.GcmChimeraService;
import java.io.CharArrayWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: aalb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalb extends dck implements aalc {

    /* renamed from: a */
    private final Context f28403a;

    /* renamed from: b */
    private GcmChimeraService f28404b;

    public aalb() {
        super("com.google.android.gms.gcm.IGcmServiceDiagnostics");
    }

    /* renamed from: b */
    private final synchronized GcmChimeraService m21432b() {
        if (this.f28404b == null) {
            Context context = this.f28403a;
            if (GcmChimeraService.f32788a == null) {
                Context applicationContext = context.getApplicationContext();
                Intent intent = new Intent();
                intent.setClassName(applicationContext, "com.google.android.gms.gcm.GcmService");
                applicationContext.startService(intent);
                try {
                    GcmChimeraService.f32789b.tryAcquire(2000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f28404b = GcmChimeraService.f32788a;
        }
        return this.f28404b;
    }

    /* renamed from: a */
    public final synchronized List mo16964a() {
        return GcmChimeraService.m24304b();
    }

    /* renamed from: c */
    public final synchronized String mo16965c() {
        String str;
        if (m21432b() != null) {
            CharArrayWriter charArrayWriter = new CharArrayWriter();
            this.f28404b.mo19560a(new PrintWriter(charArrayWriter));
            str = charArrayWriter.toString();
        } else {
            str = null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized String mo16966d() {
        if (m21432b() == null) {
            return null;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        PrintWriter printWriter = new PrintWriter(charArrayWriter);
        GcmChimeraService gcmChimeraService = this.f28404b;
        if (gcmChimeraService.f32793e.mo17101i().mo17149a() == -1) {
            printWriter.println("Disabled");
        } else {
            printWriter.println(gcmChimeraService.f32793e.mo17095c());
        }
        return charArrayWriter.toString();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            List a = mo16964a();
            parcel2.writeNoException();
            parcel2.writeStringList(a);
        } else if (i == 2) {
            String c = mo16965c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 3) {
            return false;
        } else {
            String d = mo16966d();
            parcel2.writeNoException();
            parcel2.writeString(d);
        }
        return true;
    }

    public aalb(Context context) {
        super("com.google.android.gms.gcm.IGcmServiceDiagnostics");
        this.f28403a = context.getApplicationContext();
    }
}
