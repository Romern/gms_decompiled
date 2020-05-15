package p000;

import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: bein */
final /* synthetic */ class bein implements bmxj {

    /* renamed from: a */
    private final beiq f111591a;

    /* renamed from: b */
    private final Runnable f111592b;

    public bein(beiq beiq, Runnable runnable) {
        this.f111591a = beiq;
        this.f111592b = runnable;
    }

    public final Object apply(Object obj) {
        beiq beiq = this.f111591a;
        Runnable runnable = this.f111592b;
        Uri uri = (Uri) obj;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.storage.protostore.SIGNAL_ACTION");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataPath(uri.getPath(), 0);
        intentFilter.addDataAuthority("*", null);
        beiq.f111596b.registerReceiver(new beio(runnable), intentFilter, beiq.f111598d, beiq.f111599e);
        return null;
    }
}
