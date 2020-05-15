package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.location.settings.LocationOffWarningIntentOperation;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: aera */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aera extends aeks implements aerc {

    /* renamed from: a */
    private Context f63653a;

    /* renamed from: b */
    private aeri f63654b;

    /* renamed from: a */
    public final void mo34270a() {
        aeri aeri = this.f63654b;
        if (aeri != null) {
            aeri.mo34478a(this);
        }
    }

    /* renamed from: a */
    public final void mo9721a(int i, int i2) {
        boolean z;
        if (i != 0 && i2 == 0) {
            Context context = this.f63653a;
            Intent startIntent = IntentOperation.getStartIntent(context, LocationOffWarningIntentOperation.class, "com.google.android.gms.location.settings.SHOW_LOWD");
            if (startIntent != null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            startIntent.putExtra("EXTRA_OLD_LOCATION_MODE", i);
            context.startService(startIntent);
        }
    }

    /* renamed from: a */
    public final void mo34271a(Context context) {
        this.f63653a = context;
        if (ceyv.m138446b()) {
            aeri e = aeri.m52441e(context);
            this.f63654b = e;
            e.mo34479a(this, Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    public final void mo34272a(PrintWriter printWriter) {
        long b = aepp.m52356b(this.f63653a);
        printWriter.print("last displayed: ");
        if (b > 0) {
            printWriter.println(bhce.m100624a(b));
        } else {
            printWriter.println("never");
        }
        printWriter.print("backoff duration: ");
        printWriter.print(TimeUnit.MILLISECONDS.toSeconds(aepp.m52358c(this.f63653a)));
        printWriter.println("s");
    }
}
